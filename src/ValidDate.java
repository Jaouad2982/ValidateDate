import java.util.Scanner;
public class ValidDate {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a date");
		
		String date=s.nextLine();
		int firstIndex=date.indexOf("/");
		String month=date.substring(0,firstIndex);
		System.out.println(month);
		
		String dayYear=date.substring(firstIndex+1);
		int secondIndex=dayYear.indexOf("/");
		String day=dayYear.substring(0,secondIndex);
		//System.out.println(day);
		
		String year=dayYear.substring(secondIndex+1);
		//System.out.println(year);
		
		int monthInt=Integer.parseInt(month);
		int dayInt=Integer.parseInt(day);
		int yearInt=Integer.parseInt(year);
		
		boolean validMonth=(monthInt>0 && monthInt<12);
		boolean validDay=(dayInt>0&&dayInt<30);
		String [] monthName={"","January","February","March","April","May","June","July","August","September","October","November","December"}; 
		for(monthInt=1;monthInt<monthName.length;monthInt++){	
			System.out.println(monthInt + "\t" + monthName[monthInt]);
		}
		int m=monthInt-3;
      if(validDay && validMonth){
    	  System.out.println("You entered a valid date, "+ " your day is " + dayInt + " and your month is " + m );
    	  if(yearInt%4==0){
    		  System.out.println(yearInt + " is a leap year");
    	  }
      }else{
    	  System.out.println("Verify the date you entered");
      }

		
	}

}
