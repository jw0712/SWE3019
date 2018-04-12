package project1;

public class EmpTest {

	public static void main(String[] args) {
	System.out.println("경영학과 2015311016 최지원");
	EmployeeManager mgr = new EmployeeManager();
	mgr.add(new FullTimeEmployee(1234,"김하나",55000000));
	mgr.add(new FullTimeEmployee(1235,"김둘리",32300000));
	mgr.add(new PartTimeEmployee(12341,"홍길동",20000));
	mgr.add(new FullTimeEmployee(1236,"장길산",42500000));
	mgr.add(new PartTimeEmployee(12342,"일지매",60000));
	mgr.add(new PartTimeEmployee(12343,"임꺽정",110000));
	mgr.add(new FullTimeEmployee(1237,"이하나",120000000));
	//mgr.add(new FullTimeEmployee(1238,"최지원",50000000));

	mgr.allList();
	System.out.println("전체 직원수: "+ mgr.size()+"명");
	
	System.out.println("전직원 총 급여액: "+ mgr.getTotalSalary());
	
	System.out.println("\n******* 정규직 목록");
	mgr.fullTimeEmpList();
	
	System.out.println("\n******* 파트타임직 목록");
	mgr.partTimeEmpList();
	
	System.out.println("\n******* 검색: 1234");
	Employee e1=mgr.search(1234);
	System.out.println(e1);
	System.out.println(e1.getName()+ "의 월급여 : "+ e1.getSalary());
	
	System.out.println("\n******* 검색: 하나");
	Employee[] search = mgr.search("하나");
	for(Employee e:search) {
		System.out.println(e);
		System.out.println(e.getName()+"의 월급여 : "+e.getSalary());
		}
	
	/*
	System.out.println("\n******* 검색: 지원");
	Employee[] search1 = mgr.search("지원");
	for(Employee e:search1) {
		System.out.println(e);
		System.out.println(e.getName()+"의 월급여 : "+e.getSalary());
		}*/
	}
}



