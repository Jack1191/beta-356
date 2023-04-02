package New_Practice;
import java.util.Scanner;
public class Fibonnaci_Series {
public static void main(String[] args) {
	
	int i = 0;
	int j = 1;
	System.out.println("Enter total number of terms :");
	Scanner Scan = new Scanner(System.in);
	int n = Scan.nextInt();
	System.out.println("Fibonnaci Series is :" + '\n'+i+ '\n'+j  );
	
	for (int k=3; k<=n; k++)
	{
		int t = i + j;
	System.out.println(t);
	i = j;
	j = t;
	}
}

}
