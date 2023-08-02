package com.hasa;

public class Address {
	private String line1;
	private String line2;
	private String zipcode;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Address(String line1, String line2, String zipcode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", zipcode=" + zipcode + ", getLine1()=" + getLine1()
				+ ", getLine2()=" + getLine2() + ", getZipcode()=" + getZipcode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
