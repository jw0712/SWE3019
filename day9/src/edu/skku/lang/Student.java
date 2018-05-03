package edu.skku.lang;

public class Student {
	int num; //학번
	String name;
	
	//생성자
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}

	@Override
	//object의 equals를 상속받아 overriding 해야 좀 쓸 만 함
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Student) {
			Student s = (Student) obj;
			if(s.num == this.num && s.name.equals(this.name)){
				return true;
			}
		}
		return false;
	}
	

	
}
