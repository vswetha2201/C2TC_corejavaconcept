package day7.overriding.covariant;


public class CovariantOverridingDemo implements Cloneable {

	private int rollNo;
	private String course;
	private String name;

	public CovariantOverridingDemo(int rollNo, String course, String name) {
		this.rollNo = rollNo;
		this.course = course;
		this.name = name;
	}

	// Covariant return type → return Student instead of Object
	@Override
	protected CovariantOverridingDemo clone() throws CloneNotSupportedException {
		return (CovariantOverridingDemo) super.clone();
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printData() {
		System.out.println("Roll No: " + rollNo + ", Course: " + course + ", Name: " + name);
	}
}
