package com.calculator;

public class Calculimpl implements Calculatorinterface {

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double rem(double a, double b) {
		// TODO Auto-generated method stub
		return a%b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorinterface cal = new Calculimpl();
		System.out.println(cal.add(70, 90));
		System.out.println(cal.sub(70, 90));
		System.out.println(cal.div(70, 90));
		System.out.println(cal.mul(70, 90));
		System.out.println(cal.rem(70, 90));

	}

}
