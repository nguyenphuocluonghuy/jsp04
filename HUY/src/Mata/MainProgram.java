package Mata;



public class MainProgram {

	public static void main(String[] args) {
		Student student= new Student("Dave",6,"boy");
		System.out.println("Student 1: ");
		System.out.println("Name: "+student.name);
		System.out.println("Age: "+student.age);
		System.out.println("Gender: "+student.gender);
		System.out.println("Student 2: ");
		//...
	}

}

