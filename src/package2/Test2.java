package package2;


public class Test2 {
public static void main(String[] args) {
	System.out.println("Enter Numbers to multiply : " );
	int d = Test2.ret();
	System.out.println("Output :" + d);
	Test2 t2 = new Test2();
	int e = t2.ret2();
	System.out.println("Output :"+ e);
}	
	public static int ret()
	{
		int c = 10;
		return ++c;
	}
	
	public int ret2()
	{
		int c = 100;
		return --c;
	}
}
