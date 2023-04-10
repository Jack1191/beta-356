package New_Practice;

public class Switch_Demo {
public static void main(String[] args) {

	String Day = "Friday";
			int DN = 0;
			switch(Day)
			{
			case "Sunday":
			DN=1;
			break;
			case "monday":
			DN=2;
			break;
			default:
			DN=-1;
			}
	System.out.println("dayname" + "" + DN);
}}
