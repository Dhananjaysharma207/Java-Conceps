package com.run;

public abstract class Employee {
	
	
	private int empId;
	private String empName;
	private long empPhone;
	
	
	public String getVariablepay() {
		return "7% of basic variable pay";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor is call to initialise data");
	}
	public void displayEmpDetails() {
		System.out.println(empId+"\t\t"+empName+"\t\t"+empPhone);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	
	

}
