package com.run;
import java.util.*;

public class Controlflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Calendar cal = Calendar.getInstance();
	   System.out.println(cal.get(Calendar.MONTH));
	   int month = cal.get(Calendar.MONTH)+1;
		
		/*
		 * if(month>=2 && month<=5) { System.out.println("Summer Season"); } else
		 * if(month>=6 && month<=8) { System.out.println("Rainy season"); } else {
		 * System.out.println("Winter season"); }
		 */
		 
		
		  switch(month) { case 5: System.out.println("Rainy season"); break; case 6:
		  System.out.println("Summer season"); break; default:
		  System.out.println("Winter season"); 
		  
		  }
		 
	}

}
