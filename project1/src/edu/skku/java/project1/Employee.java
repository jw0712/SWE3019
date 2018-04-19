package edu.skku.java.project1;

public abstract class Employee {
	
	private int num; //직원번호
	private String name; //이름
	private int salary;
	
	//생성자
	public Employee() {
		super();
	}

	public Employee(int num, String name, int salary) {
		super();
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

	//Getters and Setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int getSalary();
	

	public void setSalary(int salary) {
		this.salary = salary;
	}

	//toString()
	@Override
	public String toString() {
		return "empNo=" + num + ", name=" + name;
	}




	
	
}
