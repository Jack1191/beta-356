package New_Practice;

import java.util.Scanner; 
public class TEMP_CONV {
public static void main(String[] args) {
	
System.out.println("Enter Value in Celsius :" );
Scanner Scan = new Scanner(System.in);
Float i = Scan.nextFloat();
Double F = (1.8*i)+32;
Float K = i + 273;
System.out.println("Value in Celsius is :"+ i);
System.out.println("Value in Farehiet is :"+ F);
System.out.println("Value in Kelvin is :"+ K);
}

}
