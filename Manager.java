package com.run;

public class Manager extends Employee {
	
private String managerLevel;

public String getManagerLevel() {
	return managerLevel;
}

public String getVariablepay() {
	return super.getVariablepay()+ " "+"5% of basic variable pay";
}

public void setManagerLevel(String managerLevel) {
	this.managerLevel = managerLevel;
}

}
