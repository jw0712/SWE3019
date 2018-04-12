package project1;

public class PartTimeEmployee extends Employee {

	private int hourlySalary; //�ð��� �޿�
	
	//������
	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(int num, String name, int hourlySalary) {
		setNum(num);
		setName(name);
		this.hourlySalary=hourlySalary;
		}
	
	//�� �޿� = �ð��� �޿� * 160
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
