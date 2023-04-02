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
	
	for (int i=2; i<=prime; i++)
	{	if (prime % i==0);
	{isPrimeNumber = true;
	System.out.println("Prime number" );
	break;}
	
	
	
}

}}
