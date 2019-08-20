package Day4;

public abstract class Shape {
	public String color;

	public Shape(String color) {
		this.color = color;
	}

	public String toString() {// Ghi đè phương thức toString()
		return color;

	}

	public abstract double getArea();
}