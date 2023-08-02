package com.run;
import java.util.*;

public class Inputuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a = Integer.parseInt(args[0]); int b = Integer.parseInt(args[1]);
		 * System.out.println(a+b);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Give ID:");
		int a = sc.nextInt();
		System.out.println("Give name:");
		String str = sc.next();
		System.out.println("Give Phone no.:");
		long ph = sc.nextLong();
		System.out.println("Give first Character:");
		char c =sc.next().charAt(0);
		System.out.print(a+"\t\t"+str+"\t\t"+ph+"\t\t"+c);
		
	}

}
