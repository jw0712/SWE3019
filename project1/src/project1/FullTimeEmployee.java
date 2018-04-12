package project1;

public class FullTimeEmployee extends Employee {
	private int annualSalary;

	//생성자
	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(int num, String name, int annualSalary) {
		setNum(num);
		setName(name);
		this.annualSalary=annualSalary;
	}


	//월급여 계산 기능
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