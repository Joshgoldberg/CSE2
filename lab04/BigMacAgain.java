// BIG MAC CALCULATOR 2
//calculating only under certain cercumstances

import java.util.Scanner;

    public class BigMacAgain{
    			// main 
   			public static void main(String[] args) {
   			      Scanner myScanner;
   			       myScanner =new Scanner( System.in );
   			    
   			       
   			        System.out.print("Enter the number of Big Macs(an integer > 0):");
                 int nBigMacs = myScanner.nextInt();
                       
                  if(nBigMacs>0)// checking about the termination
                         
                         //going throught the 3 different options of what you can click now if the statement is true  
                    {
                      double nPriceBurger= nBigMacs*2.22;
                          //making the berger price
                          
                       System.out.println("You ordered " + nBigMacs + "Big Macs for a cost of: ");
                       System.out.printf("%.2f %n", nPriceBurger);
                       System.out.println("Do you want an order of fries (Y/y/N/n)?");
                        //so it has that price no its asking if you want fries
                          //char c = reader.next(".").charAt(0);
                       char fries=myScanner.next(".").charAt(0);
                       //this is for the fries
                       
                       
                        if (fries=='Y'||fries=='y')
                                {
                                 double nYayaya= nPriceBurger+2.15;
                                 System.out.println("You ordered fries at a cost of $2.15");
                                 System.out.println("The total cost of the meal is: ");
                                 System.out.printf("%.2f %n", nYayaya);
                                 System.out.println("");
                                 
                                 //yes fries, so this if statement adds fries and bergers
                                 
                                }
                       else if (fries=='N'||fries=='n')
                                {
                                 System.out.println("The total cost of the meal is ");
                                 System.out.printf("%.2f %n", nPriceBurger);
                                 System.out.println("");
                                 //no fries so just burgers
                                }
                                else
                                {
                                 System.out.println("Answer Y or N");
                                 
                                 //enter the right charcter already!!?!??!
                                //need to enter a y or an n so it will terminate here
                                }
                                
                          
                         
                         // establishing char variables
                         
                         
                    }
                       else{
                        System.out.println("You did not enter an int");
                         return;    }
                         //and now back to the first question if you did not originally answer the question
                         
                         
                         
                         

}  //main method   
  	} 