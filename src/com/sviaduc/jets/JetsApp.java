package com.sviaduc.jets;

import java.util.*;

public class JetsApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Please choose from the following options.");
			System.out.println("(1) List fleet");
			System.out.println("(2) View fastest jets");
			System.out.println("(3) View jet with longest range");
			System.out.println("(4) Add a jet to fleet");
			System.out.println("(5) Quit");
			
			int menuOption = kb.nextInt();
			if(menuOption == 5)
				break;
			
			switch (menuOption) {
			case 1: listFleet();
				break;
				
			case 2: viewFastestJets();
			break;
			
			case 3: viewJetRange();
			break;
			
			case 4: addJet();
			break;

			default:
				break;
			}
		}
		
	}

}
