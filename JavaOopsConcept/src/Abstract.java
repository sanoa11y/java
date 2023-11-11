
public class Abstract {
	public static void main(String[] args) {
		
		 Square sq=new Square();
		 Rectangle re=new Rectangle();
		 Circle ci = new Circle();
		 fun(sq);
		 fun(re);
		 fun(ci);
			}
			public static void fun( InterfaceShape s) {             // this Shape referes to parent class
				s.findArea();
				s.display();
}
}
