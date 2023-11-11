import java.util.Scanner;

public class UpiAppException {
	//void pay() {
	/*
	 * NORMAL FOW
	 * System.out.println("Connection established with Bank");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amt=sc.nextInt();
		System.out.println("amount paid"+amt);
	System.out.println("connetion with bank ended");
	 USING EXCEPTION HANDLER
		System.out.println("Connection established with Bank");
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amt=sc.nextInt();
		System.out.println("amount paid"+amt);
		}
		catch(Exception e) {
	System.out.println("exception handled by upi app");
	System.out.println("connetion with bank ended");
}              USING THROW
		System.out.println("Connection established with Bank");
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amt=sc.nextInt();
		System.out.println("amount paid "+amt);
		}
		catch(Exception e) {
	System.out.println("exception handled by upi app");
	throw e;
	System.out.println("connetion with bank ended");
		}
	 USING FINAL
	
	System.out.println("Connection established with Bank");
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter amount");
	int amt=sc.nextInt();
	System.out.println("amount paid "+amt);
	}
	catch(Exception e) {
System.out.println("exception handled by upi app");
throw e;
}finally {
System.out.println("connetion with bank ended");
		}
	 USING THROWS*/
		void pay() throws Exception {
		System.out.println("Connection established with Bank");
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amt=sc.nextInt();
		System.out.println("amount paid "+amt);
		}
		catch(Exception e) {
	System.out.println("exception handled by upi app");
	throw e;
	}finally {
	System.out.println("connetion with bank ended");
			}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
