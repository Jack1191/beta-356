package OOPS_Concept;

class Car{
String carModel;
static String carCompany;
int year;
double cc;
float weight;
short seat;
long lenght;
boolean automatic;


public void getCarModel()
	{ System.out.println("Model of Car is :" + carModel);
	}
public static void getCarCompany()
	{ System.out.println("Company is :" + carCompany);
	}
public void getYear()
	{ System.out.println("Year is :" + year);
	}
public void getCc()
	{ System.out.println("Engine CC is : " + cc);
	}
public void getWeight()
	{ System.out.println("Weight is :" + weight);
	}
public void getSeat()
	{ System.out.println("No of Seats are :" + seat);
	}
public void getLenght()
	{ System.out.println("Lenght of car is :" + lenght);
	}
public void getAutomatic()
	{ System.out.println("Is Car Automatic :" + automatic);
	}
}