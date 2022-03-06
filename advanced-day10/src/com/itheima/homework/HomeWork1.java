package com.itheima.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 请使用HashMap集合保存街道两旁的店铺名称;使用门牌号作为键,店铺名作为值,然后使用**三种方式**遍历输出;
 * 信息如下:
 * 101,阿三面馆
 * 102,阿四粥馆
 * 103,阿五米馆
 * 104,阿六快递
 * **要求:**
 * 1:键是整数,值是字符串;
 * 2:输出的信息使用"--"链接
 */
public class HomeWork1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "阿三面馆");
        map.put(102, "阿四粥馆");
        map.put(103, "阿五米馆");
        map.put(104, "阿六快递");
        //KeySet方式增强for
        System.out.println("KeySet方式增强for");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            String value = map.get(key);
            System.out.println(key + "--" + value);
        }
        System.out.println("----------------");
        //KeySet方式迭代器
        System.out.println("KeySet方式迭代器");
        Set<Integer> keys1 = map.keySet();
        Iterator<Integer> it = keys1.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "--" + value);
        }
        System.out.println("----------------");
        //entrySet方式增强for
        System.out.println("entrySet方式增强for");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--" + value);
        }
        System.out.println("----------------");
        //entrySet方式迭代器
        System.out.println("entrySet方式迭代器");
        Set<Map.Entry<Integer, String>> entries1 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries1.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--" + value);
        }
        System.out.println("----------------");
        //map forEach方式
        System.out.println("map forEach方式");
        map.forEach((key, value) -> System.out.println(key + "--" + value));
    }
}
