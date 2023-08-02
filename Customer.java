package com.dev;

public class Customer {

	private int customerId;
	private String customerName;
	private long customerPhone;
	public static final int COUNTRY_CODE=91;
	private static int count;
	public Customer() {
		count++;
		System.out.println(count);
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public static int getCountryCode() {
		return COUNTRY_CODE;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + COUNTRY_CODE + ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getCustomerPhone()=" + getCustomerPhone() + ",getCountryCode()=" + getCountryCode() +", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() +"]";
	}
	

}


	
