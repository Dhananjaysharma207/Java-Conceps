package com.dev;

import com.run.*;
public class Emprun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(CalculatorStatic.add(20,10));
		System.out.println(CalculatorStatic.sub(20,10));
		System.out.println(CalculatorStatic.mul(20,10));
		System.out.println(CalculatorStatic.div(20,10));


		NestedOuterClass.StaticInnerClass c1 = new NestedOuterClass.StaticInnerClass();
		c1.static_method();
		NestedOuterClass.NonStaticInnerClass c2 = new NestedOuterClass().new NonStaticInnerClass();
		c2.nonstatic_method();
		

		/*
		 * Book book1 = new Book(); 
		 * book1.setBookId(1);
		 * book1.setBookName("The Famous Five");
		 * book1.setBookAuthor(new String[]{"Kangna Ranaut","Katrina  Kaif"}); book1.setBookCost(375);
		 * Book book2 = new Book(); 
		 * book2.setBookId(2);
		 * book2.setBookName("The Secreat Seven");
		 * book2.setBookAuthor(new String[]{"Shradha Kapoor","Ranbeer Kapoor"}); book2.setBookCost(425);
		 * Book book3 = new Book();
		 * book3.setBookId(3);
		 * book3.setBookName("The Diary of Wimpy Kid"); 
		 * book3.setBookAuthor(new String[]{"Alia Bhatt","Kajol Devgan"}); book3.setBookCost(290);
		   Book[] books = new Book[3]; 
		   books[0] = book1; 
		   books[1] = book2;
		   books[2] =book3; 
		   for(Book i:books) { 
		   System.out.println(i);
		    }
		 * System.out.println(book1);
		 * System.out.println(book2);
		 * System.out.println(book3);
		 */

		/*
		 * Employee emp1 = new Employee(); emp1.setEmpId(1);
		 * emp1.setEmpName("Dhananjay"); emp1.setEmpPhone(7668911872l);
		 * 
		 * Employee emp2 = new Employee(); emp2.setEmpId(2); emp2.setEmpName("Utkash");
		 * emp2.setEmpPhone(8860099700l);
		 * 
		 * Employee emp3 = emp1;
		 * 
		 * emp1.displayEmpDetails(); emp2.displayEmpDetails(); emp3.displayEmpDetails();
		 * 
		 * System.out.println((emp1==emp2)); System.out.println((emp1==emp3));
		 * 
		 * emp2=emp1;
		 * 
		 * System.out.println((emp1==emp2)); System.out.println((emp1==emp3));
		 * 
		 * emp1.displayEmpDetails(); emp2.displayEmpDetails(); emp3.displayEmpDetails();
		 * System.out.println(emp1.getEmpId()); System.out.println(emp1.getEmpName());
		 * System.out.println(emp1.getEmpPhone()); System.out.println();
		 * System.out.println(emp2.getEmpId()); System.out.println(emp2.getEmpName());
		 * System.out.println(emp2.getEmpPhone()); System.out.println();
		 * System.out.println(emp3.getEmpId()); System.out.println(emp3.getEmpName());
		 * System.out.println(emp3.getEmpPhone());
		 * 
		 * 
		 */
		/*
		 * Customer c1 = new Customer(); c1.setCustomerId(10);
		 * c1.setCustomerName("Devansh"); c1.setCustomerPhone(7668911872l);
		 * 
		 * Customer c2 = new Customer(); c1.setCustomerId(20);
		 * c1.setCustomerName("Ritik"); c1.setCustomerPhone(7668911872l);
		 * 
		 * Customer c3 = new Customer(); c1.setCustomerId(30);
		 * c1.setCustomerName("Shikhar"); c1.setCustomerPhone(7668911872l);
		 * 
		 * System.out.println(c1); System.out.println(c2); System.out.println(c3);
		 * System.out.println(Customer.COUNTRY_CODE);
		 * 
		 * Customer[] c = new Customer[3]; c[0]=c1; c[1]=c2; c[2]=c3; for(Customer i:c)
		 * { System.out.println(i); }
		 */
		/*
		 * for(int i=0;i<100;i++) { new Customer(); }
		 */



	}



}
