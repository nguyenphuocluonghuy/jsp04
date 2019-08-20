package Day4;

import java.util.Scanner;

public class Rectangle extends Shape {
	public int length;
	public int width;

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap do cao: ");
		int a = input.nextInt();
		System.out.print("Nhap dai: ");
		int b = input.nextInt();

		int dt = a * b;
		System.out.print("dientich: " + dt);
		return dt;
	}

}
