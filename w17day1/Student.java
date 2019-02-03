package w17day1;
import apcs.Window;
public class Student {
	String name;
	int gpa;
	int id;
	public Student() {
		name = "blank";
		gpa = 400;
		id = 00000;
		
	}
	public Student(String name){
		this.name = name;
		generateGPA();
		generateID();
		
	}
	private void generateID() {
		this.id = Window.random(10000, 99999);
		
	}
	private void generateGPA() {
		// TODO Auto-generated method stub
		this.gpa = Window.random(20, 40);

	}
	public Student(int id, String name, int gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	public void display() {
		System.out.println(name + "\n" + (double)gpa/10 + "\n" + id + "\n");
	}
}