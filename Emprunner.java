package com.run;

public class Emprunner {
	public static void displayEmployeeDetails(Employee emp) {
		if(emp instanceof Manager) {
			System.out.println(((Manager)emp).getManagerLevel()+"\t\t"+emp.getEmpId()+"\t\t"+emp.getEmpName()+"\t\t"+emp.getEmpPhone()+"\t\t"+emp.getVariablepay());
			}
		else if(emp instanceof Engineer) 
		{
			System.out.println(((Engineer)emp).getEngineerType()+"\t\t"+emp.getEmpId()+"\t\t"+emp.getEmpName()+"\t\t"+emp.getEmpPhone()+"\t\t"+emp.getVariablepay());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager emp1 = new Manager();
		emp1.setEmpId(4);
		emp1.setEmpName("Dhananjay");
		emp1.setEmpPhone(7668911872l);
		emp1.setManagerLevel("Senior Manger");
		
		/**
		 *  hello how are you */
		
		Engineer emp2 = new Engineer();
		emp2.setEmpId(7);
		emp2.setEmpName("Utkarsh");
		emp2.setEmpPhone(8178911872l);
		emp2.setEngineerType("System Engineer");
		
		
		/* new Employee(); */ /*
								 * can't be instantiated as class is abstracted
								 */		
		displayEmployeeDetails(emp1);
		displayEmployeeDetails(emp2);
		
		/*
		 * System.out.println(emp1.getEmpId()+"\t\t"+emp1.getEmpName()+"\t\t"+emp1.
		 * getEmpPhone()+"\t\t"+emp1.getManagerLevel()); System.out.println();
		 * System.out.println(emp2.getEmpId()+"\t\t"+emp2.getEmpName()+"\t\t"+emp2.
		 * getEmpPhone()+"\t\t"+emp2.getEngineerType());
		 * 
		 * Manager empg1 = new Manager();
		 * 
		 * System.out.println(emp1.getVariablepay());
		 * 
		 * Engineer empg2 = new Engineer(); System.out.println(emp2.getVariablepay());
		 */
	    
		/*
		 * Employee empg3 = new Employee();
		 * System.out.println(super.emp3.getVariablepay());
		 */
	       
		/*Employee emp1 = new Employee();
	      emp1.setEmpId(1);
	      emp1.setEmpName("Dhananjay");
	      emp1.setEmpPhone(7668911872l);
	      
	      Employee emp2 = new Employee();
	      emp2.setEmpId(2);
	      emp2.setEmpName("Utkash");
	      emp2.setEmpPhone(8860099700l);
	      
      
      Employee emp3 = emp1;
      
      emp1.displayEmpDetails();
      emp2.displayEmpDetails();
      emp3.displayEmpDetails();
      
      System.out.println((emp1==emp2));
      System.out.println((emp1==emp3));
	}*/
	}

}
