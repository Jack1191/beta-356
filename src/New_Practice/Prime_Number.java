package New_Practice;
import java.util.Scanner;
public class Prime_Number {
public static void main(String[] args) 
{
	System.out.println("Prime Number Check");
	System.out.println("Enter Your Number :");
	Scanner Scan = new Scanner(System.in);
	int prime = Scan.nextInt();
	boolean isPrimeNumber = false;
	int j = 0;
	
	for (int i=2; i<=prime-1; i++)
	{	
		if (prime%i==0);
		{isPrimeNumber = true;
		break;
		}
	
	}
	 if (!isPrimeNumber)
	      System.out.println(prime + " is a prime number.");
	    else
	      System.out.println(prime + " is not a prime number.");
//{
//			System.out.println("Prime number");}
	
	
	
}

}
