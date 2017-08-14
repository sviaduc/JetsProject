package com.sviaduc.jets;

import java.util.Scanner;

public class RunJets {
	
	public static void menu() {
		Scanner kb = new Scanner(System.in);
		
		Jets Jet1 = new Jets("F14", 1600, 2000, 38_000_000);
		Jets Jet2 = new Jets("F15", 1500, 2001, 35_000_000);
		Jets Jet3 = new Jets("F16", 1400, 2002, 33_000_000);
		Jets Jet4 = new Jets("F17", 1300, 2003, 56_000_000);
		Jets Jet5 = new Jets("F18", 1200, 2004, 78_000_000);
		
		Hanger.addJet(Jet1);
		Hanger.addJet(Jet2);
		Hanger.addJet(Jet3);
		Hanger.addJet(Jet4);
		Hanger.addJet(Jet5);
		
		while(true) {
			
			System.out.println("Please choose from the following options.");
			System.out.println("(1) List fleet");
			System.out.println("(2) View fastest jet");
			System.out.println("(3) View jet with longest range");
			System.out.println("(4) Add a jet to fleet");
			System.out.println("(5) Quit");
			
			int menuOption = kb.nextInt();
			if(menuOption == 5) {
				System.out.println("Program Quit");
				break;
			}
			switch (menuOption) {
			case 1: Hanger.listFleet();
			break;
				
			case 2: Hanger.viewFastetJet();
			break;
			
			case 3: Hanger.viewJetRange();
			break;
			
			case 4: Hanger.addNewJets();
			break;

			default:
				break;
			}
		}
		kb.close();
	}
}
