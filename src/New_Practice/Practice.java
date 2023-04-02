package New_Practice;
import java.util.Scanner;
public class Practice {
public static void main(String[] args) {

	System.out.println("Enter Value in Byte :");
	Scanner Scan = new Scanner(System.in);
	int b1 = Scan.nextInt();
	byte b2 = (byte)b1;
	
System.out.println("After Casting Value is :" + b2);
	
}

}
