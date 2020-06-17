package com.simplilearn.list;

public class Employee {
	
	public Employee(int empID, String empName, String empDept) {
		this.empID = empID;
		this.empName = empName;
		this.empDept = empDept;
	}

	private int empID;
	private String empName;
	private String empDept;
	
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpDept() {
		return empDept;
	}
	
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	

}
