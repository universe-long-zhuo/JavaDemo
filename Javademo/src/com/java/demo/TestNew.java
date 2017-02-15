package com.java.demo;  
/** 
 *@Title TestNew.java 
 *@description TODO 
 *@time 2016年11月14日 下午3:31:13 
 *@author wyz 
 *@version 1.0 
 **/
public class TestNew {
	
    public static void main(String args[]) {  
        int[] s ;  
        int i ;  
        s = new int[5] ;
        
        System.out.println("s1:" + s);
        for(i = 0 ; i < 5 ; i++) {  
            s[i] = i ;  
            System.out.println("s2:" + i);
        }  
        for(i = 4 ; i >= 0 ; i--) {  
            System.out.println("" + s[i]) ;  
        }  
    }  

}
