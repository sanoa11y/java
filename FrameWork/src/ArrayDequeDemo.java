import java.util.*;
public class ArrayDequeDemo {
	public static void main(String[] args) {
	ArrayDeque	ad=new 	ArrayDeque();
	ad.add(10);
	ad.add("Virat");
	ad.add(false);
	ad.add(36);
	ad.add(32.345);
	System.out.println(ad);
	ad.addFirst("first");
	ad.addLast("last");
	System.out.println(ad);
	}
	}


