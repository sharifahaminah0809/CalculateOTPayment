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
		
		//initialize total payment
		double totalPayment = 0.00;
		
		//create List type String to save input Date
		List<String> dateList = new ArrayList<String>();
		
		//create array list to save days payment
		ArrayList<Double> payList = new ArrayList<>();
		
		//create array list to save the total Minutes
		ArrayList<Double> minutesList = new ArrayList<>();
		
		//loop untuk day
		for(int d=1; d<=day; d++) 
		{
			System.out.println("\n\tDay " + d);
			
			System.out.println("\nDate: ");
			
			//read input String
			String dayDate = sc.next();
			
			//masukkan the input date dalam array list
			dateList.add(dayDate);
			
			//prompt user to input time they join in
			System.out.println("How many times you join in?");
			
			//read input in integer
			int join = sc.nextInt();
			
			//declare variable joinMinutes
			double joinMinutes = 0; 
			
			//declare variable totalMinutes
			double totalMinutes = 0;
			
			
			//create loop for join in
			for(int i=1; i<=join; i++) {
				System.out.println("Total Minutes " + i + ": ");
				joinMinutes = sc.nextInt();
				
				totalMinutes += joinMinutes;
			}
			//add the minute to the array list
			minutesList.add(totalMinutes);
			
			//calculate payment
			double payDay = 7 * (totalMinutes/60);
			
			//add payDay to the array list
			payList.add(payDay);
			
			//add to total payment
			totalPayment += payDay;
			
			//System.out.println("Payment for " + dayDate + ": RM " + df.format(payDay));	
			
		}
		
		
		System.out.println("\tDate\tMinutes\tAmount");
		
		//Using list iterator to print list String date
		Iterator dateLitr = dateList.listIterator();
		
		//Using list iterator to print list total minutes
		Iterator minutesLitr = minutesList.listIterator();
		
		//Using list iterator for day pay
	    Iterator  payLitr=payList.listIterator();
	    
	  
	      while(payLitr.hasNext()){
	    	 System.out.print("\t" + dateLitr.next() );
	    	 System.out.print("\t" + minutesLitr.next());
	         System.out.print("\tRM" + df.format(payLitr.next()) + "\n");
	      }
		
		//print total payment
		System.out.println("\n\tTotal Payment for OT: RM" + df.format(totalPayment));
		
		
		System.out.println("\nThis Session is Expired");
		
		
	}

}
