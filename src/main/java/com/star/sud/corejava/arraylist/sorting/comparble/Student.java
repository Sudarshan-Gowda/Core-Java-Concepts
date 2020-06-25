package com.star.sud.corejava.arraylist.sorting.comparble;

public class Student implements Comparable<Student> {

	private Integer id;
	private String stdName;
	private Integer stdAge;

	// For Descending use [this.id - o.getId()]
	public int compareTo(Student o) {
		return this.id - o.getId();
		// return this.stdAge - o.getStdAge();
	}

	public Student() {
		super();
	}

	public Student(Integer id, String stdName, Integer stdAge) {
		super();
		this.id = id;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", stdAge=" + stdAge + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStdAge() {
		return stdAge;
	}

	public void setStdAge(Integer stdAge) {
		this.stdAge = stdAge;
	}

}
