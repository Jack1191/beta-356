package OOPS_Concept;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter No of Details to be Entered :");
		int i = Scan.nextInt();
		Computer[] computers = new Computer[i];
		for (int j=0;j<i;j++)
		{
			Computer Cj = new Computer();
			computers[j] = Cj;
			System.out.println("Enter Name :");
			Cj.Name = Scan.next();
			System.out.println("Enter Model :");
			Cj.Model = Scan.nextInt();
			System.out.println("Enter Color :");
			Cj.Color = Scan.next();
			System.out.println("Enter RAM :");
			Cj.RAM = Scan.nextInt();
			

				Device D2 = new Device();
				Cj.Dev = D2;
				System.out.println("Enter Number of Device :");
				Cj.Dev.DevNum = Scan.nextInt();
				D2.Disp();
				
		}
		
		
		
		for(Computer com : computers) {
			System.out.println("----------");
			com.Display();
		}
		
		
		// array
	}}

