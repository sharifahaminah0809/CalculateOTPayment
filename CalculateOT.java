/*
 Created by: Sharifah Aminah binti Said Mohamed
 Date: 16 November 2022
 */

import java.util.*;
import java.text.DecimalFormat;


public class CalculateOT {
	
	//create the object for two decimal places
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//untuk baca any input kena declare this one sebab nak create object untuk scanner
		Scanner sc = new Scanner(System.in);
		
		//PRINT TITLE
		System.out.println("SYSTEM CALCULATE OT PAYMENT");
		
		//prompt user for input days
		System.out.println("\nHow many days?");
		
		//read input days
		int day = sc.nextInt();
		
		
		//create List type String to save input Date
		List<String> dateList = new ArrayList<String>();
		
		//create array list to save days payment
		ArrayList<Double> payList = new ArrayList<>();
		
		//create array list to save the total Minutes
		ArrayList<Double> minutesList = new ArrayList<>();
		
		//initialize total payment
		double totalPayment = 0.00;
		
		//loop untuk day
		for(int d=1; d<=day; d++) 
		{
			System.out.println("\n\tDay " + d);
			
			System.out.println("\nDate(d/m):");
			
			//read input String
			String dayDate = sc.next();
			
			//masukkan the input date dalam array list
			dateList.add(dayDate);
			
			//prompt user to input time they join in
			System.out.println("\nEnter all the Duration (separete it by ',' Ex: 450,123,10,15)");
			
			//read all the durations in String
			String durationsI = sc.next();
			
			
			//initialize total duration
			double totalDuration = 0.00;
			
			//use delimit to get the separate duration by comma, get the object from String Input
			String[] durationList = durationsI.split(",");
			
			//go by each duration
			for(String dl : durationList)
			{
				//convert the string to double
				double minutes = Double.parseDouble(dl);
				
				//add the value to total duration
				totalDuration += minutes;
				//System.out.println(dl);
				//System.out.println(minutes);
			}
					
			//add the minute to the array list
			minutesList.add(totalDuration);
			
			//calculate payment
			double payDay = 7 * (totalDuration/60);
			
			//add payDay to the array list
			payList.add(payDay);
			
			//add to the total payment
			totalPayment += payDay;
			
		}
		
		System.out.println("\tDate\t\tDuration\tAmount");

		//Using list iterator to print list String date
		Iterator dateLitr = dateList.listIterator();
				
		//Using list iterator to print list total minutes
		Iterator minutesLitr = minutesList.listIterator();
				
		//Using list iterator for day pay
		Iterator  payLitr=payList.listIterator();
		
		//loop untuk print all the list
		while(payLitr.hasNext())
		{
			System.out.print("\t" + dateLitr.next() );
			System.out.print("\t\t" + minutesLitr.next());
			System.out.print("\t\tRM" + df.format(payLitr.next()) + "\n");
		}
			

		//print total payment
		System.out.println("\n\tTotal Payment for OT: RM" + df.format(totalPayment));
				
		System.out.println("\nThis Session is Expired");
		
		
	}

}
