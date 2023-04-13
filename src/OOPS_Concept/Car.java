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
	{ System.out.println(carModel);
	}
public static void getCarCompany()
	{ System.out.println("carCompany" =carCompany);
	}
public void getYear()
	{ System.out.println(year);
	}
public void getCc()
	{ System.out.println(cc);
	}
public void getWeight()
	{ System.out.println(weight);
	}
public void getSeat()
	{ System.out.println(seat);
	}
public void getLenght()
	{ System.out.println(lenght);
	}
public void getAutomatic()
	{ System.out.println(automatic);
	}

class CarDemo
{
public static void main(String[] args){
Car C1 = new Car();
C1.getCarCompany();
C1.getCarModel();
C1.getYear();
C1.getCc();
C1.getWeight();
C1.getSeat();
C1.getLenght();
C1.getAutomatic();

}}}
