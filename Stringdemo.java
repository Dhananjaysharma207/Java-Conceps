package com.dev;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "kim";
		String name2 = new String("kim");
		String name3=name1;
		System.out.println(name1==name3);
		String name4=new String(name1);
		System.out.println(name1==name4);
		String name5 = "kim";
		System.out.println(name1==name5);
		System.out.println(name1.equals(name4));
		String t1 = "Deloitte Technology Academy";
		String t2 = "deloitte technology academy";
		System.out.println(t1.toUpperCase());
		System.out.println(t1.toLowerCase());
		System.out.println(t2.toUpperCase());
		System.out.println(t1.indexOf("Academy"));
		String[] t3 = t1.split(" ");
		for(String i:t3) {
			System.out.println(i);
		}
		System.out.println(t3.length);
		System.out.println(t1.length());
		String m = t1.substring(9);
		System.out.println(m);
		String k = t1.substring(9, 19);
		System.out.println(k);

	}

}
