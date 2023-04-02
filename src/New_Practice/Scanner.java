package New_Practice;

public class Scanner {


	public static void main(String[] args) {
//if we use same class name as then we have to use command like this:
		System.out.println("Enter Your Value :");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int i = scan.nextInt();
		System.out.println("value is " +i);

	}



}
