package package1;

public class Test1 {
public static void main(String[] args) {
	System.out.println("Enter Numbers to multiply : " );
	int d = Test1.multi(5, 10);
	System.out.println("Multiplication is :" + d);
	Test1 t1 = new Test1();
	int e = t1.multi2(6, 10);
	System.out.println("Multiplication is :" + e);
}	
	
	
	
	public static int multi (int a, int b)
	{
		int c = a*b;
		return c;
	}
	
	public int multi2 (int a, int b)
	{
		int c = a*b;
		return c;
	}
}
