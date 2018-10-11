package aa224iu_lab1;

import java.util.Scanner;

public class VaxelPengar {
	static public void main (String[]args) {
		//kost
	Scanner kost = new Scanner(System.in);
	System.out.print("Ange kostnaden: ");
	double kostar = kost.nextDouble();
		//belopp
	Scanner belopp = new Scanner(System.in);
	System.out.print("Ange erhållet belopp: ");	
	double beloppet = belopp.nextDouble();
		//tillbaka
	double tillbaka = beloppet - kostar;
	System.out.println("Tillbaka: "+Math.round(tillbaka)+" kronor");
	
		//1000-lappar
	int tusan = (int) Math.round(tillbaka) / 1000;
	System.out.println("1000-lappar: "+tusan);
		//500-lappar
	int femH = (int) Math.round(tillbaka % 1000) / 500;
	System.out.println(" 500-lappar: "+femH);
		//100-lappar
	int ettH = (int) Math.round(tillbaka % 500) /100;
	System.out.println(" 100-lappar: "+ettH);
		//50-lappar
	int femT = (int) Math.round(tillbaka %100) / 50;
	System.out.println("  50-lappar: "+femT);
		//20-lappar
	int tjugo = (int) Math.round(tillbaka % 50) / 20;
	System.out.println("  20-lappar: "+tjugo);
		//10-kronor
	int tio = (int) Math.round(tillbaka % 20) / 10;
	System.out.println("  10-kronor: "+tio);
		//5-kronor
	int fem = (int) Math.round(tillbaka % 10) /5;
	System.out.println("   5-kronor: "+fem);
		//1-kronor
	int ett = (int) Math.round(tillbaka % 5) /1;
	System.out.println("   1-kronor: "+ett);
	
	
	belopp.close();
	kost.close();
	}
}
