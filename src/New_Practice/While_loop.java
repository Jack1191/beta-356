package New_Practice;

public class While_loop {
public static void main(String[] args) {
	java.util.Scanner Scan = new java.util.Scanner(System.in);
	System.out.println("Enter Number" );
	int i = Scan.nextInt();
	
//	while (i > 20) {
//		System.out.println("Hello" + i);
//		i++;
	
	do
	{
		System.out.println("Hello" + i);
		i++;
	}while (i < 20);
		
}
}
