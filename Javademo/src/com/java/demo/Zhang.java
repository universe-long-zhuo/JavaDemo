package com.java.demo;    

public class Zhang

{

	public static void main(String[] args)
    {
        String MyStr = new StringBuffer().append("hello").toString();
        MyStr = new StringBuffer().append(MyStr).append(" Guys!").toString();
        System.out.println(MyStr);        
    }

}