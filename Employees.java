package com.hasa;

import java.util.Arrays;

public class Employees {
private int empId;
private String empName;
private long empPhone;
private Address[] empAdd;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
@Override
public String toString() {
	return "Employees [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empAdd="
			+ Arrays.toString(empAdd) + ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName()
			+ ", getEmpPhone()=" + getEmpPhone() + ", getEmpAdd()=" + Arrays.toString(getEmpAdd()) + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
public Address[] getEmpAdd() {
	return empAdd;
}
public void setEmpAdd(Address[] empAdd) {
	this.empAdd = empAdd;
}



}
