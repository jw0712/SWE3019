package project1;

public abstract class Employee {
	
	private int num; //������ȣ
	private String name; //�̸�
	private int salary;
	
	//������
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
