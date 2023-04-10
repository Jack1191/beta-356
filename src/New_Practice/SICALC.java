package New_Practice;

import java.util.Scanner;

public class SICALC {
	public static void main(String[] args) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter Principal");
	int P=Scan.nextInt();
	System.out.println("Enter Rate");
	Float R=Scan.nextFloat();
	System.out.println("Enter Time");
	int T=Scan.nextInt();
	Float A = (P*R*T)/100;
	System.out.println("Simple Intrest is "+ A);
	
	}

}
