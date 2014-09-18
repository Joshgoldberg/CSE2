//Four Digitas of an interger
//going to use some crazy math to get rid of the digits

//re importing the scanner aggain!
import java.util.Scanner;

    public class FourDigits {
    			
    			  
    			  
    			  
   			  public static void main(String[] args) {
   			      
   			      //main string
   			       Scanner myScanner;
   			       myScanner = new Scanner( System.in );
   			       
   			       
   			       
   			            System.out.print("Enter Number:");
                         double nNumber = myScanner.nextDouble();
                         
                         double Largenumber= nNumber*10000;
                         
                         
                         //getting the number without the decimals
                         int Without= (int) nNumber;
                         double othernumber= Without*10000;
                         
                        
                         
                         double Thisis= Largenumber-othernumber;
                         
                        int yay=(int) Thisis;
                        //cast back into an integer
                        //and it works!
                        
                         
                         System.out.print("Last Four Digits:");
                         System.out.println(yay);
                         
                        
                        
                         
                        
                        
   			  }
    }
            