//Month Day Teller
//tells how many days are in a month
import java.util.Scanner;

    public class Month{
    			// main 
   			public static void main(String[] args) {
   			  Scanner myScanner;
   			  myScanner =new Scanner( System.in );
   			  
   			  System.out.print("Enter an int 1-12 Representing a month: ");
                 int nNumber = myScanner.nextInt();
                 
                 if (nNumber==1 || nNumber==3 || nNumber==5 || nNumber==7 || nNumber==8 || nNumber==10 || nNumber==12)
                    //specific ones
                    {System.out.println("This Month has 31 days");
                        
                    }
                     
                     else if (nNumber== 4 || nNumber==6 || nNumber==9 || nNumber==11)
                        // the other set of non 31 or 29
                     {System.out.println("This Month Has 30 days");
                         
                     }
                     
                     else if (nNumber==2)
                     {
                             System.out.println("Enter Year");
                             int nYear=myScanner.nextInt();
                             if(nYear>0){
                                 //the perecent is checking to see if its divisible by 4
                                 //unsure the name of the % sign but this statement checks to see if its a leapyear year
                                 if ((nYear % 400)==0)
                                 //checking to see if positive number
                                 //just learned the leap years rules, extrememly confusing
                                 //can be divisible by 400
                                 //not by 100
                            
                                  {System.out.println("The month has 29 days");
                                  }
                                 else if ((nYear % 100)==0)
                                 {System.out.println("This month has 28 days");
                                 }
                                 else if ((nYear % 4)==0)
                                  {System.out.println("The month has 29 days");
                                  }
                                 
                                 else
                                 {System.out.println("This month has 28 days");
                                 }
                                 //figured it out
                                 //just had to make sure it was correct order in order to get specifc on which years worked
                                 
                             }
                             else 
                             {System.out.println("Enter Valid Positive Year");
                                 
                             }
                     }
                     
                     else if (nNumber>12)
                     {System.out.println("Not Valid");}
                     
                     //checking for positives
                     
                     
                     else
                     {System.out.println("Not Valid");}
                     //checking for negitives
   			}
   			//ending
    }