package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter Earth weights in lbs space-separated: ");  // prompt user to give you weight
		
		String values = myScanner.nextLine();  //saves what the user types in answer
		
		
		
		String[] weights = values.split(" "); // splits the values up when the user enters spaces between the values
		

		
		 for (int i = 0; i < weights.length; i++) {
	    	  
	    	   
	    	   int valueAsInt = Integer.parseInt(weights[i]);
	    	   
	    	   System.out.println( (weights[i]) + "lbs. on earth, " + "is " + (valueAsInt * 0.378) + " lbs. on Mars!"); // prints the String Array Weights on 3 lines
	       }
					
		}
		
	}


