package project1;

public class Testing {
//���������� �׽�Ʈ, ����� �ƴ�.
	public static void main(String[] args) {
		EmployeeManager mgr = new EmployeeManager();
		mgr.add(new FullTimeEmployee(1234,"���ϳ�",55000000));
		mgr.add(new PartTimeEmployee(12341,"ȫ�浿",20000));
		mgr.allList();

	}

}
