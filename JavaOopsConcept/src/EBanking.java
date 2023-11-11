import java.util.Scanner;
public class EBanking {
	void transaction() {
		/*System.out.println("Login to account");
		System.out.println("enter amount");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		System.out.println("amount debited"+amt);
		System.out.println("Logout from account");
		USING EXCEPTION HANDLER*/
		System.out.println("Login to account");
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter amount");
			int amt=sc.nextInt();
			System.out.println("amount debited "+amt);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
			e.printStackTrace();
		}
		System.out.println("Logout from account");
	}

}
