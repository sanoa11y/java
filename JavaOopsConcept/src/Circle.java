
/*public class Circle extends Shape{
	void findArea() {
		int r=10;
		double ar=3.14*r*r;
		System.out.println("Area of the shape is "+ar);
	}
void display() {
	System.out.println("This shape is circle");
}
}ABSTRACTION USING INTERFACES*/
public class Circle implements InterfaceShape{
	public void findArea() {
		int r=10;
		double ar=3.14*r*r;
		System.out.println("Area of the shape is "+ar);
	}
public void display() {
	System.out.println("This shape is circle");
}
}

