
public class Customer {
	private String name;
	private String address;
	private int grade;
	
	
	public Customer() {
		super();
	
	}
	
	public Customer(String name, String address, int grade) {
		super();
		this.name = name;
		this.address = address;
		this.grade = grade;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void order() {
		System.out.println("주문~");
	}
	@Override
	public String toString() {
		return "이름:"+ name+" 주소:"+address;
	}
	
}
