//ROOT FINDER
//going to do some math on here
import java.util.Scanner;

    public class Root {
    			
    			  
    			  
    			  
   			  public static void main(String[] args) {
   			      
   			      //main string
   			       Scanner myScanner;
   			       myScanner = new Scanner( System.in );
   			       
   			       //scanner again
   			       
   			       System.out.print("Enter Number to be cubed:");
                         int nNumber = myScanner.nextInt();

                    double guess1= nNumber/3;
                    
                    double guess2= (1*guess1*guess1*guess1+nNumber)/(3*guess1*guess1);
                    double guess3= (2*guess2*guess2*guess2+nNumber)/(3*guess2*guess2);
                    double guess4= (2*guess3*guess3*guess3+nNumber)/(3*guess3*guess3);
                    double guess5= (2*guess4*guess4*guess4+nNumber)/(3*guess4*guess4);
                    double guess6= (2*guess5*guess5*guess5+nNumber)/(3*guess5*guess5);
                    double guess7= (2*guess6*guess6*guess6+nNumber)/(3*guess6*guess6);
                    double guess8= (2*guess7*guess7*guess7+nNumber)/(3*guess7*guess7);
                    double guess9= (2*guess8*guess8*guess8+nNumber)/(3*guess8*guess8);
                    double guess10= (2*guess9*guess9*guess9+nNumber)/(3*guess9*guess9);
                    
                    
                
                    
                   
                   
                    
                
                    System.out.println("Early guess");
                    System.out.println(guess1);
                    System.out.println("Late Guess");
                    System.out.println(guess10);
                    // unsure for now how to get better guess, not programing issue 
                    //but more of a need to figure out what the calculation is
                    
                    
                    
   			  }                  
    }			  