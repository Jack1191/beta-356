package New_Practice;

import java.util.Scanner;

public class largest_of_3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st Number :");
	int i = scan.nextInt();
	System.out.println("Enter 2nd Number :");
	int j = scan.nextInt();
	System.out.println("Enter 3rd Number :");
	int k = scan.nextInt();
	
	
	if (i>j && i>k)
	{System.out.println("Greater value is " +i);}
	else if (j>k)
	{System.out.println("Greater value is " +j);}
	else
	{System.out.println("Greater value is " +k);}
}
}
