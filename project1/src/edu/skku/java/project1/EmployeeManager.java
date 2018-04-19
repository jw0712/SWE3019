package edu.skku.java.project1;

public class EmployeeManager {
	Employee[] eList=new Employee[50];
	int index=0;
	
	//���� �����ϱ� ���� ��� ����
	public void add(Employee e) {
		eList[index++]=e;
	}
	
	//����� ��� ���� ������ ����ϴ� ��� ����
	public void allList() {
		for(int i=0;i<index;i++) {
			System.out.println(eList[i]);
		}
	}
	
	//��ƮŸ�� ������ ����ϴ� ���
	public void partTimeEmpList() {
		for(int i=0;i<index;i++) {
			if(eList[i] instanceof PartTimeEmployee) {
				System.out.println(eList[i]);
			}
		}
	}
	
	//���������� ����ϴ� ��� 
	public void fullTimeEmpList() {
		for(int i=0;i<index;i++) {
			if(eList[i] instanceof FullTimeEmployee) {
				System.out.println(eList[i]);
			}
		}
	}
	
	//����� ���� ���� �����ϴ� ���
	public int size() {
		return index;
	}
	
	//����� ���� �������� �� �޿����� ���Ͽ� ��ȯ�ϴ� ���
	public int getTotalSalary() {
		int total=0;
		for(int i=0;i<index;i++) {
			total = total+eList[i].getSalary(); 
		}return total;
	}
	
	//��� ��ȣ�� Ư�� ������ �˻��ϴ� ���
	public Employee search(int num) {
		for(int i=0;i<index;i++) {
			if(num==(eList[i].getNum())) 	return eList[i];
		}return null;
	}
	
	//�˻���� ������ ��� �̸��� �����ϴ� ��� ������ �˻��ϴ� ���
	public Employee[] search (String name) {
		Employee[] result = new Employee[getCount(name)];
		int num1=0; //result's index
		for(int i=0;i<index;i++) {
			if(eList[i].getName().contains(name)) {
				result[num1]=eList[i];
				num1++;
		}
		}return result;
	}
	
	
	//---------------�䱸���� �ƴ�-----------------
	//�˻���� ������ ��� �̸��� �����ϴ� ��� ������ �� 
	public int getCount(String name) {
		int num = 0;
		for(int i=0;i<index;i++) {
			if(eList[i].getName().contains(name)) {
				num +=1;
			}
		}
	return num;
	}//day5.CarManager
	
	
}
