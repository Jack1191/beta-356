package New_Practice;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Your Number");
	int i = scan.nextInt();
	long sum = 0;
	int j = i;
while(i!=0)
	{
	int n = i%10;
	sum = sum + (n*n*n);
	i = i/10;
	}
if(j==sum)
{
	System.out.println("Armstrong Number");
}
else
{
	System.out.println("Not a Armstrong Number");
}
}
	
}
