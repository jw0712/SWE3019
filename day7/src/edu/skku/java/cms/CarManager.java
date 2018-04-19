package edu.skku.java.cms;

public class CarManager implements ICarMgr {
	Car[] cars = new Car[100];
	int index = 0;
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#add(edu.skku.java.cms.Car)
	 */
	@Override
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#print()
	 */
	@Override
	public void print() {
		for(int i = 0; i<index; i++)
			System.out.println(cars[i]);//c.toString()
		
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#busList()
	 */
	@Override
	public void busList() {
		for(int i=0;i<index;i++)
			//cars[i]�� �޸𸮿� Bus�� �ִ°�
			if(cars[i] instanceof Bus) //instanceof subclass (!superclass)
				System.out.println(cars[i]);
	}
	//������ �������� �� �¼� �� ���ؼ� �����ϱ�
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getBusSeats()
	 */
	@Override
	public int getBusSeats() {
		int sum=0;
		for(int i=0;i<index;i++) {
			if(cars[i] instanceof Bus) {
				Bus b = (Bus)cars[i];
				sum=sum+b.getSeat();
			}
		}return sum;
	}
	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ���� ���ϱ�
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getCount(int)
	 */
	@Override
	public int getCount(int price) {
		int cnt=0;
		for(int i=0;i<index;i++) {
			if(cars[i].getPrice()>=price) {
				cnt = cnt+1;
			}
		}
		return cnt;
	}
	
	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ������ ���ؼ� ����
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getCars(int)
	 */
	@Override
	public Car[] getCars(int price) {
		Car[] result = new Car[getCount(price)];
		int n = 0;
		for(int i=0;i<index;i++) {
			if(cars[i].getPrice()>=price) {
				result[n]=cars[i];
				n++;
				//result[n++]=cars[i]; �� �� ���� �̷��� �� �ٷ� ó���ص� ��.,
			}
		}return result;
	}
	
}
