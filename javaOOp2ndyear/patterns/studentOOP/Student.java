package studentOOP;

public class Student {

	public String name;
	private int age;
	
	Student(){
		
	}
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return this.age;
	}

}
