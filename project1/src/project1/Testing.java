package project1;

public class Testing {

	public static void main(String[] args) {
		EmployeeManager mgr = new EmployeeManager();
		mgr.add(new FullTimeEmployee(1234,"±èÇÏ³ª",55000000));
		mgr.add(new PartTimeEmployee(12341,"È«±æµ¿",20000));
		mgr.allList();

	}

}
