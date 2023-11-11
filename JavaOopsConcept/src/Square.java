
/*public class Square extends Shape {
void findArea() {
	int e=10;
	int ar=e*e;
	System.out.println("Area of the shape"+ar);
}
void display() {
	System.out.println("this shape is sqaure");
}

}
ABSTRACTION USING INTERFACES*/
public class Square implements InterfaceShape {
 public void findArea() {
	int e=10;
	int ar=e*e;
	System.out.println("Area of the shape"+ar);
}
public void display() {
	System.out.println("this shape is sqaure");
}

}
