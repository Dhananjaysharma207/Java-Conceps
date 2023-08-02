package com.dev;

public class CalculatorStatic {
 public static double add(double x,double y) {
	 return x+y;
 }
 public static double mul(double x,double y) {
	 return x*y;
 }
 public static double div(double x,double y) {
	 return x/y;
 }
 public static double sub(double x,double y) {
	 new CalculatorStatic().demo();
	 return x-y;
 }
 
 public void demo() {
	 CalculatorStatic.add(87.4, 93.2);
	 add(5.4,6.7);
 }
 
}
