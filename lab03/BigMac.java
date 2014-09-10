//this program calculates big macs
//does this by price and tax percent
//also the number of them


//BIG MAC CALCULATAR

import java.util.Scanner;

    public class BigMac {
    			  // main method as ussual
    			  
    			  
    			  
   			  public static void main(String[] args) {
   			      
   			      //place stuffs here
   			       Scanner myScanner;
   			       myScanner = new Scanner( System.in );
   			       
   			       //following to be able to scan
   			       
   			            System.out.print(
                         "Enter the number of Big Macs(an integer > 0): ");
                         int nBigMacs = myScanner.nextInt();
                        
                        System.out.print("Enter the cost per Big Mac as"+
                        " a double (in the form xx.xx): " );
                         double bigMac$ = myScanner.nextDouble();
                        System.out.print(
                       "Enter the percent tax as a whole number (xx): ");
                        double taxRate = myScanner.nextDouble();
                        taxRate/=100; 
                        
                        //this allows it to print out what the sales tax and what the price would be and the number
                                    
                                        double cost$;
                                        int dollars,   
                                              dimes, pennies; 
                                        cost$ = nBigMacs*bigMac$*(1+taxRate);
                                       
                                        dollars=(int)cost$;
                                     
                                        dimes=(int)(cost$*10)%10;
                                        pennies=(int)(cost$*100)%10;
                                        System.out.println("The total cost of " +nBigMacs
                                         +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
                                         " sales tax of "+ (int)(taxRate*100) + " %, is $ " +dollars+'.'+dimes+pennies) ;
                                        
    //the calculations of this problem.
    //,ost are fairly simple to make sure everything is what we want
                                        
	  }  //end of main method   
  }

