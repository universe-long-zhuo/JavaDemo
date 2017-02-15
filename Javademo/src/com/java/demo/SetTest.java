package com.java.demo;  

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/** 
 *@Title SetTest.java 
 *@description TODO 
 *@time 2016年11月23日 上午11:15:22 
 *@author wyz 
 *@version 1.0 
 **/
public class SetTest {

    public static void main(String[] args) {
        String s1 = "hello ";
        String s2 = "world ";
        String s3 = "!";
        //Set小例子
        Set<String> set = new HashSet<String>();        
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println("\nset:" + set);

        for (String str : set) {
            System.out.print(str);
        }
        System.out.println();
        //List小例子
        List<String> list = new ArrayList<String>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (String str : list) {
            System.out.print("\nlist:" + str);
        }
        System.out.println();
        //Map小例子
        Map<String,String> map = new HashMap<String,String>();
        map.put("1", s1);
        map.put("2", s2);
        map.put("3", s3);
        System.out.println("\nmap:" + map);
        for(Map.Entry<String, String> entry : map.entrySet()){  
            System.out.println("entry:" + entry);
        }   
    }
	
}
