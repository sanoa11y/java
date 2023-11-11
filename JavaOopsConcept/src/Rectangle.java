
/*public class Rectangle extends Shape {
	void findArea() {
		int l=10;
		int b=5;
		int ar=l*b;
			System.out.println("area of the rectangle is "+ar);
	}
	void display() {
		System.out.println("tnis shape is rectangle");
	}

}ABSTRACTION USING INTERFACES*/
public class Rectangle implements InterfaceShape {
	public void findArea() {
		int l=10;
		int b=5;
		int ar=l*b;
			System.out.println("area of the rectangle is "+ar);
	}
	public void display() {
		System.out.println("tnis shape is rectangle");
	}

}
