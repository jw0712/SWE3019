package edu.skku.java.project1;

public class PartTimeEmployee extends Employee {

	private int hourlySalary; //시간당 급여
	
	//생성자
	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(int num, String name, int hourlySalary) {
		setNum(num);
		setName(name);
		this.hourlySalary=hourlySalary;
		}
	
	//월 급여 = 시간당 급여 * 160
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
