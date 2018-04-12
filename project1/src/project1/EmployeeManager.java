package project1;

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
	
	//����� ���� �������� �� �޿����� ���Ͽ� ��ȯ�ϴ� ��� (�� �޿��� = �� �������� �����ؾ� �ϴ� �� �޿����� ����)
	public int getTotalSalary() {
		int total=0;
		for(int i=0;i<index;i++) {
			total = total+eList[i].getSalary()*12; 
		}return total;
	}
	
	//��� ��ȣ�� Ư�� ������ �˻��ϴ� ���
	public Employee search(int num) {
		for(int i=0;i<index;i++) {
			if(num==(eList[i].getNum())) 	return eList[i];
		}return null;
	}
	
	//�˻���� ������ ��� �̸��� �����ϴ� ��� ������ �˻��ϴ� ���
	public Employee search(String name) {
		for(int i=0;i<index;i++) {
			if(name.contains(eList[i].getName())) 	return eList[i];
		}return null;
	}
	
}
