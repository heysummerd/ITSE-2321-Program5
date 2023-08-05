package program5;

//********************************************************************
//
//Author:        Summer Davis 
//
//Program #:     Five
//
//File Name:     Program5.java
//
//Course:        ITSE 2321 Object-Oriented Programming
//
//Description:   Program5 calculates the occupancy rate for a hotel
//
//				 - Asks user how many floors the hotel has
//				 - Loop for each floor:
//					> asks user how many rooms are on the floor
//					> asks user how many of those rooms are occupied
//			     - Displays:
//				    > total number of rooms
//				    > number of occupied rooms
//					> number of unoccupied rooms
//					> percentage of rooms that are occupied
//
//				* output formatted to one decimal place where necessary
//
//********************************************************************

import java.util.Scanner;

public class Program5 {
//***************************************************************
//
//Method:       main
//
//Description:  The main method of the program
//
//Parameters:   String array
//
//Returns:      N/A 
//
//**************************************************************
	public static void main(String[] args) {
	   
		// display developer info
		developerInfo();
		
		// create Scanner to obtain input
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int totalFloors = 0;
		int totalRooms = 0;
		int occupiedRooms = 0;
		
		// collect floor count
		System.out.print("Floors on the hotel: ");
		totalFloors = input.nextInt();
		
		// collect room count data for each floor
		for (int floor = 1; floor <= totalFloors; floor++) {
			System.out.printf("%nRooms on floor %d: ", floor);
			totalRooms += input.nextInt();
			System.out.print("Rooms occupied:   ");
			occupiedRooms += input.nextInt();
		}
		
		// calculate occupancy rate
		double occupancyRate = (double) occupiedRooms / totalRooms;
		occupancyRate *= 100;
		
		// display occupancy data
		System.out.printf("%nOccupancy Results%n");
		System.out.println("------------------");
		
		System.out.printf("Total Rooms:      %d%n", totalRooms);
		System.out.printf("Occupied Rooms:   %d%n", occupiedRooms);
		System.out.printf("Unoccupied Rooms: %d%n", totalRooms - occupiedRooms);
		System.out.printf("Occupancy Rate:   %.1f%%", occupancyRate);
						

} // End of main method
	
//***************************************************************
//
//Method:       developerInfo
//
//Description:  The developer information method of the program
//
//Parameters:   None
//
//Returns:      N/A 
//
//**************************************************************
public static void developerInfo() {
System.out.println("Name:    Summer Davis");
System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
System.out.println("Program: Five \n");

} // End of developerInfo method
} 
