package edu.skku.java.project1;

public class EmpTest {

	public static void main(String[] args) {
	System.out.println("�濵�а� 2015311016 ������");
	EmployeeManager mgr = new EmployeeManager();
	mgr.add(new FullTimeEmployee(1234,"���ϳ�",55000000));
	mgr.add(new FullTimeEmployee(1235,"��Ѹ�",32300000));
	mgr.add(new PartTimeEmployee(12341,"ȫ�浿",20000));
	mgr.add(new FullTimeEmployee(1236,"����",42500000));
	mgr.add(new PartTimeEmployee(12342,"������",60000));
	mgr.add(new PartTimeEmployee(12343,"�Ӳ���",110000));
	mgr.add(new FullTimeEmployee(1237,"���ϳ�",120000000));
	//mgr.add(new FullTimeEmployee(1238,"������",50000000));

	mgr.allList();
	System.out.println("��ü ������: "+ mgr.size()+"��");
	
	System.out.println("������ �� �޿���: "+ mgr.getTotalSalary());
	
	System.out.println("\n******* ������ ���");
	mgr.fullTimeEmpList();
	
	System.out.println("\n******* ��ƮŸ���� ���");
	mgr.partTimeEmpList();
	
	System.out.println("\n******* �˻�: 1234");
	Employee e1=mgr.search(1234);
	System.out.println(e1);
	System.out.println(e1.getName()+ "�� ���޿� : "+ e1.getSalary());
	
	System.out.println("\n******* �˻�: �ϳ�");
	Employee[] search = mgr.search("�ϳ�");
	for(Employee e:search) {
		System.out.println(e);
		System.out.println(e.getName()+"�� ���޿� : "+e.getSalary());
		}
	
	/*
	System.out.println("\n******* �˻�: ����");
	Employee[] search1 = mgr.search("����");
	for(Employee e:search1) {
		System.out.println(e);
		System.out.println(e.getName()+"�� ���޿� : "+e.getSalary());
		}*/
	}
}



