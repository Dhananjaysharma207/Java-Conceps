package com.run;

public class Engineer extends Employee {
private String engineerType;

public String getEngineerType() {
	return engineerType;
}

public String getVariablepay() {
	return "6% of basic variable pay";
}

public void setEngineerType(String engineerType) {
	this.engineerType = engineerType;
}

}
