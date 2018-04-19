package edu.skku.java.project1;

public class Testing {
//개인적으로 테스트, 제출용 아님.
	public static void main(String[] args) {
		EmployeeManager mgr = new EmployeeManager();
		mgr.add(new FullTimeEmployee(1234,"김하나",55000000));
		mgr.add(new PartTimeEmployee(12341,"홍길동",20000));
		mgr.allList();

	}

}
