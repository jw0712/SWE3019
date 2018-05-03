package edu.skku.java.project1;

public class PartTimeEmployee extends Employee {

	private int hourlySalary; //�ð��� �޿�
	
	//생성자
	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(int num, String name, int hourlySalary) {
		setNum(num);
		setName(name);
		this.hourlySalary=hourlySalary;
		}
	
	//월급여 계산 기능
	@Override
	public int getSalary() {
		return hourlySalary*160;
	}
	
	//Getters and Setters
	public int getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	//toString()
	@Override
	public String toString() {
		return super.toString() + ", hourlySalary=" + hourlySalary;
	}
	
	
	
	

	

}
