package com.java.demo2;    

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**  
 * @Title for1.java  
 * @description TODO  
 * @time 2017年2月16日 上午11:45:57  
 * @author wyz  
 * @version 1.0  
 **/
public class for1 {
	
	public static void main(String arg[]) {
		  
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
		list.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
		list.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
		
		System.out.println("List: " + list);
		
		Long id = 201L;
		for (Customer x : list) {
			if (x.getId().equals(id)) {
				System.out.println("显示1：" + x);
			}
		}
		
//		Object s[] = list.toArray();
//
//		System.out.println();
//		for (Object x : s) {
//			System.out.println("显示2：" + x.toString());
//		}
//		
//		Iterator<Customer> iter = list.iterator();   
//
//		System.out.println();
//	    while(iter.hasNext()) {   
//	    	System.out.println("显示3：" + iter.next()); 
//	    }
	}
}
 