package edu.skku.java.project1;

public class FullTimeEmployee extends Employee {
	private int annualSalary;

	//������
	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(int num, String name, int annualSalary) {
		setNum(num);
		setName(name);
		this.annualSalary=annualSalary;
	}


	//���޿� ��� ���
	@Override
	public int getSalary() {
		return this.annualSalary/12;
	}

	//Getters and Setters
	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	//toString()
	@Override
	public String toString() {
		return super.toString() + ", annualSalary=" + annualSalary;
	}
	
	

}