package com.star.sud.corejava.arraylist.sorting.comparator;

import java.util.Comparator;

public class Student {

	private Integer id;
	private String stdName;
	private Integer stdAge;

	public static Comparator<Student> stdNameCompare = new Comparator<Student>() {

		public int compare(Student o1, Student o2) {
			String stdNm1 = o1.stdName;
			String stdNm2 = o2.stdName;

			// ascending
			return stdNm1.compareTo(stdNm2);

			// descending
			// return stdNm2.compareTo(stdNm1);
		}
	};

	public static Comparator<Student> stdAgeCompare = new Comparator<Student>() {

		public int compare(Student o1, Student o2) {
			Integer stdAge1 = o1.stdAge;
			Integer stdAge2 = o2.stdAge;

			// ascending
			return stdAge1 - stdAge2;

			// descending
			// return stdAge2 - stdAge1;
		}

	};

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
