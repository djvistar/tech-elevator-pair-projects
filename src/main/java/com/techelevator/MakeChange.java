package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		
		
		Scanner myScanner = new Scanner(System.in);
		// Ask user to enter bill 
		
		System.out.print("Please enter the amount of the bill: ");
		
		String answer = myScanner.nextLine();
		
		double billAmount = Double.parseDouble(answer);
		
		System.out.println("Please enter the amount tendered: ");
		
		String input = myScanner.nextLine();
		
		double amountTendered = Double.parseDouble(input);
		
		System.out.println("The change required is" + (amountTendered - billAmount));
		
		
		
		
		

	}

}
