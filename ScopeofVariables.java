package com.dev;

public class ScopeofVariables {
	String str; //instance variable
	int a = 32451;//instance variable
	static String code="+91"; //class variable
	ScopeofVariables sc = new ScopeofVariables();
	public void demo() {
		int id=24;//local variable
		String g="Cooper";//local variable
		System.out.println(id);
	}

}
