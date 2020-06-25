package com.star.sud.corejava.collection.list.vector;

public class Employee {

	private int id;
	private String empName;
	private String empDept;

	public Employee() {
		super();
	}

	public Employee(int id, String empName, String empDept) {
		super();
		this.id = id;
		this.empName = empName;
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empDept=" + empDept + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
