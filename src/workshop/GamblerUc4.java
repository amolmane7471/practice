package workshop;
import java.lang.Math;
public class GamblerUc4 {

	public static void main(String[] args) {
	  	double result,stake=100, bet=1,total=0;
    
     result=(Math.random());
     System.out.println(result);
    for(int day=1;day<=20;day++)
     {
	if((result>0.5)&&(result<1))
		{
		System.out.println("wins");
	    stake=stake+50;
	 for(stake=100;stake<=150;stake++)
	 {
		 
		 {  
		// System.out.println("stake="+stake);
		 }
	 }
		 total=total+stake;	      
	 		   System.out.println("total amt won in day"+day +" " +total);
	 	   
	
	 }
	    else
		{
	    	System.out.println("loose");
	      stake=stake-bet;
		 for(stake=99;stake>=50;stake--)
		 {
			
			 {
	      System.out.println("stake="+stake);
		 }
		 }
		 total=total+stake; 
	      System.out.println("total amt won in day" +day+ " " +total);
     }
     }
     }
	}


