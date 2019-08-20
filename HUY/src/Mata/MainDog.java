package Mata;

public class MainDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog dog1= new Dog("Kiki",2,"den");
System.out.println("Dog1:");
System.out.println("Name: "+ dog1.name);
System.out.println("Age: "+dog1.age);
System.out.println("Color: "+dog1.color);
dog1.eating("too much");
	}

}
