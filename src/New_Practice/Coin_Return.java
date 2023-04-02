package New_Practice;
import java.util.Scanner;
public class Coin_Return {
public static void main(String[] args) {
	System.out.println("Enter Amount Given By Customer :");
	Scanner Scan = new Scanner(System.in);
	int amount = Scan.nextInt();
	System.out.println("Enter Customer's Shopping Amount :");
	int cust = Scan.nextInt();
	int Rem = amount - cust;
	System.out.println("Amount Returned as Coin: "+Rem);
	int Coin10 = Rem/10;
	int RemCoin = Rem%10;
	System.out.println("10 Rupees : "+Coin10);
	int Coin5 = RemCoin/5;
	int RemCoin2 = RemCoin%5;
	System.out.println("5 Rupees : "+Coin5);	
	int Coin2 = RemCoin/2;
	int Coin1 = RemCoin%2;
	System.out.println("2 Rupees : "+Coin2);	
	System.out.println("1 Rupees : "+Coin1);
	
}
}
