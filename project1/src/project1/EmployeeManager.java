package project1;

public class EmployeeManager {
	Employee[] eList=new Employee[50];
	int index=0;
	
	//직원 저장하기 위한 기능 구현
	public void add(Employee e) {
		eList[index++]=e;
	}
	
	//저장된 모든 직원 정보를 출력하는 기능 구현
	public void allList() {
		for(int i=0;i<index;i++) {
			System.out.println(eList[i]);
		}
	}
	
	//파트타임 직원만 출력하는 기능
	public void partTimeEmpList() {
		for(int i=0;i<index;i++) {
			if(eList[i] instanceof PartTimeEmployee) {
				System.out.println(eList[i]);
			}
		}
	}
	
	//정규직원만 출력하는 기능 
	public void fullTimeEmpList() {
		for(int i=0;i<index;i++) {
			if(eList[i] instanceof FullTimeEmployee) {
				System.out.println(eList[i]);
			}
		}
	}
	
	//저장된 직원 수를 리턴하는 기능
	public int size() {
		return index;
	}
	
	//저장된 정규 직원들의 총 급여액을 구하여 반환하는 기능
	public int getTotalSalary() {
		int total=0;
		for(int i=0;i<index;i++) {
			total = total+eList[i].getSalary(); 
		}return total;
	}
	
	//사원 번호로 특정 직원을 검색하는 기능
	public Employee search(int num) {
		for(int i=0;i<index;i++) {
			if(num==(eList[i].getNum())) 	return eList[i];
		}return null;
	}
	
	//검색어로 지정된 사원 이름을 포함하는 모든 직원을 검색하는 기능
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
	
	
	//---------------요구사항 아님-----------------
	//검색어로 지정된 사원 이름을 포함하는 모든 직원의 수 
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
