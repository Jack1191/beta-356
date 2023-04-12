package OOPS_Concept;

import java.util.Scanner;

public class ObjDemo {
	public static void main(String[] args) {
		Obj_Var O1 = new Obj_Var();
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Variable A1 :");
		O1.a = Scan.nextInt();
		System.out.println("Enter Variable B :");
		O1.b = Scan.nextInt();
		Obj_Var O2 = new Obj_Var();
		System.out.println("Enter Variable A2 :");
		O2.a = Scan.nextInt();
		
		
		O1.Local();
		O2.Local();
	}

}
