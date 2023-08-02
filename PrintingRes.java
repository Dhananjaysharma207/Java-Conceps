package com.hasa;

public class PrintingRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp1 = new Employees();
		emp1.setEmpId(101);
		emp1.setEmpName("Dhananjay");
		emp1.setEmpPhone(7668911872l);
		emp1.setEmpAdd(new Address[] {new Address("line1","Bangalore","250003"),new Address("line1","Kolkata","250009")});
		Employees emp2 = new Employees();
		emp2.setEmpId(102);
		emp2.setEmpName("Utkarsh");
		emp2.setEmpPhone(8865035702l);
		emp2.setEmpAdd(new Address[] {new Address("line1","Hyderabad","250004")});
		Employees emp3 = new Employees();
		emp3.setEmpId(103);
		emp3.setEmpName("Bharat");
		emp3.setEmpPhone(8860099700l);
		emp3.setEmpAdd(new Address[] {new Address("line1","Gurugram","250006")});
		Employees emp4 = new Employees();
		emp4.setEmpId(104);
		emp4.setEmpName("Lalit");
		emp4.setEmpPhone(8178911872l);
		emp4.setEmpAdd(new Address[] {new Address("line1","Noida","250007")});
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
		
		

	}

}
