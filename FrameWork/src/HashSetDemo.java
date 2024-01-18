import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		/*HashSet hs=new HashSet();
		hs.add(13);
		hs.add(45);
		hs.add(76);
		hs.add(8);
		hs.add(144);
		System.out.println(hs);
	}ADD ALL*/
		HashSet cricketers=new HashSet();
		cricketers.add("Dhoni");
		cricketers.add("Ashwin");
		cricketers.add("Virat");
		System.out.println("cricketers:"+cricketers);
		
		HashSet footballers=new HashSet();
		footballers.add("Ronaldo");
		footballers.add("Messi");
		System.out.println("footballers:"+footballers);

		HashSet players=new HashSet();
		players.add("Nadal");
		System.out.println("Players:"+players);
		players.addAll(cricketers);
		players.addAll(footballers);
		System.out.println("Players:"+players);
		players.removeAll(footballers);
		System.out.println("Players:"+players);
		
		
		
		
		
}
}
