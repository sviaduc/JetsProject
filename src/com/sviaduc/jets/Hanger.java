package com.sviaduc.jets;

import java.util.*;

public class Hanger {
			
	public static Jets[] jetArr = new Jets[100];
	
	
	public static void addJet(Jets j1) {
		for (int i = 0; i < jetArr.length; i++) {
			if (jetArr[i] == null) {
				jetArr[i] = j1;
				break;
			}
		}
	}

	
	public static void listFleet() {
		for (int i = 0; i < Hanger.jetArr.length; i++) {
			if(Hanger.jetArr[i] != null)
			System.out.println("Model: " + Hanger.jetArr[i].getModel());
			System.out.println("Speed in Mach: " + Hanger.jetArr[i].getSpeed());
			System.out.println("Range: " + Hanger.jetArr[i].getRange());
			System.out.println("Price: " + Hanger.jetArr[i].getPrice() + "\n");
		} 	
	}
	
	public static void viewFastetJet() {
		double x = 0;
		int speed = 0;
		for (int i = 0; i < Hanger.jetArr.length; i++) {
			if(Hanger.jetArr[i] != null && Hanger.jetArr[i].getSpeed() > x) {
				x = Hanger.jetArr[i].getSpeed();
				speed = i;
			}
		}
		System.out.println("Model: " + Hanger.jetArr[speed].getModel());	
		System.out.println("Speed in Mach: " + Hanger.jetArr[speed].getSpeed());	
		System.out.println("Range: " + Hanger.jetArr[speed].getRange());	
		System.out.println("Price: " +Hanger.jetArr[speed].getPrice()+ "\n");	
	} 
	
	public static void viewJetRange() {
		int x = 0;
		int range = 0;
		for (int i = 0; i < Hanger.jetArr.length; i++) {
			if(Hanger.jetArr[i] != null && Hanger.jetArr[i].getRange() > x) {
				x = Hanger.jetArr[i].getRange();
				range = i;
			}
		}
		System.out.println("Model: " + Hanger.jetArr[range].getModel());	
		System.out.println("Speed in Mach: " + Hanger.jetArr[range].getSpeed());	
		System.out.println("Range: " + Hanger.jetArr[range].getRange());	
		System.out.println("Price: " +Hanger.jetArr[range].getPrice()+ "\n");	
	} 
	
	
	public static void addNewJets() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Please name the model of new jet: ");
		String model = kb.next();
		System.out.print("Speed of " + model + " : ");
		double speed = kb.nextDouble();
		System.out.print("Range of " + model + " : ");
		int range = kb.nextInt();
		System.out.print("Price of " + model + " : ");
		int price = kb.nextInt();
		
		Hanger.addJet(new Jets(model, speed, range, price));; 
		kb.close();
	}
		
	
	
}