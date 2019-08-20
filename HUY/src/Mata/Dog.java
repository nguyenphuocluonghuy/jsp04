package Mata;

public class Dog {
	public String name;
	public int age;
	public String color;
	public Dog(String name, int age, String color) {
		this.name=name;
		this.age=age;
		this.color=color;

}
	public void wagging( String desciption) {//constructors( hàm khởi tạo)
		System.out.println("wagging: "+ desciption);
	}
	public void barking( String desciption) {
		System.out.println("Barking:"+desciption );
	}
	public void eating( String desciption) {
		System.out.println("eating: "+desciption);
		
	}
}
