import java.util.LinkedList;
public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		/*ll.add(4);
		ll.add(23);
		ll.add(20);
		ll.add(72);
		ll.add(40);
		System.out.println(ll); 
		SOME INBULT METHODS PRESENT IN LINKEDLIST Contains,peek,poll*/
		ll.add(11);
		ll.add("meesi");
		ll.add(3.149);
		ll.add(99);
		ll.add(true);
		System.out.println(ll); 
		System.out.println("contains:"+ll.contains(3.149)); 
		System.out.println("contains:"+ll.contains("virat")); 
		System.out.println("peek:"+ll.peek()); 
		System.out.println(ll); 
		System.out.println("poll:"+ll.poll()); 
		System.out.println(ll); 

		
	}

}
