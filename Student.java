package com.dev;

public class Student {
	private int stdid;
	private String stdname;
	private int marks;
	
	
	public Student() {
    	System.out.println("Hello i am constructor overloading");
    }
	
	public Student(int stdid, String stdname) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
	}

    

	public Student(int stdid, String stdname, int marks) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.marks = marks;
	}



	
}
