package com.cap.demo;

public class HelloWorld {

	public void add()
	{
		int a =2 ,b=3;
		int c = a+b;
		System.out.println(c);
	}
	
	public String returning (String a,String b)
	{
		
		String c = a.concat(b);
		return c;
		
	}
	public static void main (String [] args)
	
	{
		System.out.println("helloworld");
		HelloWorld hw = new HelloWorld();
		hw.add();
		
		String a = hw.returning("Naveen", "kumar");
		System.out.println(a);
	}
}
