package studentOOP;
import java.util.Scanner;
public class Main {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			Student s1 = new Student(name, age);
			students[i] = s1;
		}
		
		for(Student x: students) {
			System.out.println(x.getName() + " " + x.getAge());
		}
		
		System.out.println("Search name: ");
		String nameSearch = sc.next();
		
		for(int i = 0; i < students.length; i++) {
			if(nameSearch.equalsIgnoreCase(students[i].getName())) {
				System.out.println("Name found!");
				System.out.println("Set new name: ");
				String newName = sc.next();
				students[i].name = newName;
			}
				
		}
		for(Student x: students) {
			System.out.println(x.getName() + " " + x.getAge());
		}
	}
}
