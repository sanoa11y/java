import java.util. Scanner;
public class NaturalnumberApp {
public static void main(String[] args) { 
	/*NaturalNumbers s=new NaturalNumbers();
	s.sumNatural();
	}
	METHODS USING SCANNER METHOD-1/
NaturalNumbers nn=new NaturalNumbers();
nn.sumNaturalNumber();
    METHODS USING SCANNER METHOD-2
	Scanner scan=new Scanner(System.in);
	System.out.println("enter n value to calculate 1st n natural numbers");
	int n=scan.nextInt();
	NaturalNumbers nn=new NaturalNumbers();
	nn.sumNaturalNumbers(n);
}
METHODS USING SCANNER METHOD-3
	Scanner scan=new Scanner(System.in);
	System.out.println("enter n value to calculate 1st n natural numbers");
	int n=scan.nextInt();
	NaturalNumbers demo=new NaturalNumbers();
	 int res=demo.sumNaturalNumbers(n);
	 System.out.println("enter n value to calculate 1st n natural number are"+res);
	 SUM GIVEN DIGITS*/
	Scanner scan=new Scanner(System.in);
	System.out.println("enter any 2 digits to calculate natural numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	NaturalNumbers demo=new NaturalNumbers();
	int res=demo.sumDigits(a,b);
	System.out.println("entered any 2 digits to calculate natural number is "+res);
	
}
}

