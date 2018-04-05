
public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("È«±æµ¿");
		c.setAddress("¼­¿ï");
		c.setGrade(1);
		System.out.println(c); //c.toString()
		
		Customer c2 = new Customer("±èÃ¶¼ö","ºÎ»ê",3);
		System.out.println(c2);

	}

}
