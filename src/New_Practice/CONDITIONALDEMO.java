package New_Practice;

import java.util.Scanner;

public class CONDITIONALDEMO {
public static void main(String[] args) {
		
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter Age");
	int age = Scan.nextInt();
//	String group ="";
		
//	if (age<=18)
//	{ group = "Child";}
//	else if (age > 18 && age <= 30)
//	{ group = "Adult";}
//	else if (age > 30 && age <= 50)
//	{ group = "Mature";}
//	else
//	{ group = "old";}
	
	String group = age <= 18 ? "Kid" : "Adult";
	System.out.println("Group is : " + group);
}}
