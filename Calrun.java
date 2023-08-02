package com.dev;
import java.util.Scanner;
public class Calrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = sc.nextInt();
        System.out.println("Enter the second Number:");
        int b = sc.nextInt();
		Calculator cal = new Calculator();
		System.out.println(cal.getAdd(a,b));
		System.out.println(cal.getMul(a,b));
		System.out.println(cal.getDiv(a,b));
		System.out.println(cal.getSub(a,b));
		System.out.println(cal.getRem(a,b));
		
		cal.adding(47, 35); // method overloading integer function is getting called
		cal.adding(76.4, 23.5); // method overloading double function is calling
		
		new Student();
		new Student(1,"Kim",87);
		new Student(1,"Jam");
	
	}// compile type polymorphism

}
