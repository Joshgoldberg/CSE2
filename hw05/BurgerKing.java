//Joshua Goldberg
//This program askings us what we want from burger king and than specificly we want on it
import java.util.Scanner;
//scanner
    public class BurgerKing{
    			// main 
    			public static void main(String[] args) {
    		//starting
    		   Scanner myScanner;
   			   myScanner =new Scanner( System.in );
   			   //establishing the scanner
   			   System.out.println("Enter a letter to indicate a choice of");
   			   System.out.println("Burger (B or b)");
   			   System.out.println("Soda (S or s)");
   			   System.out.println("Fries (F or f)");
   			   //outer options, so not specific choices but the first part
   		       String bfs = myScanner.next();//creating a string for a switch
   		        int strLength = bfs.length();
   		        if (strLength==1) {//to check if more than a single character was added
        		    switch (bfs) {//outter switch
        		        case "b" : case "B":
        		          //burger case
        		           System.out.println("Enter A or a for 'all teh fixins'");
       			           System.out.println("C or c for cheese");
       			           System.out.println("N or n for none of the above");
       			           //specific 
           			           String toppings = myScanner.next();//creating a string for the 
           			           //new "inner" order
           			           switch (toppings) {//this is for the toppings on the burger
           			           //making sure that this case is inside the break and doesnt
           			           //conflict with anything
           			           case "a" : case "A":
           			               System.out.println("You ordered a buger with all the fixins");
           			               break;//simple responses for cases, 
           			           case "c" : case "C":
           			               System.out.println("You ordered a burger with cheese");
           			               break;//same
           			           case "n" : case "N":
           			               System.out.println("You ordered a very very very plain burger");
           			               break;
           			          default:
           			               System.out.println("Please give me a real order");
           			               break;//giving a default case to end the swtich
           			               //simple if they didnt 
               			           }
               			           break; //important this is outside the bracket to close the 
               			           //inner switch so they dont conflict with the original one
               			           
       			        case "s" : case "S":
       			          System.out.println("Do you want Pepsi (p or P), ");
       			          System.out.println("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)-");
       			                    //cases for soda, no difference to above just making sure everything
       			                    //is contained correctly
       			                   String dranks = myScanner.next();
       			                   switch(dranks){
       			                    case "p" : case "P":
               			               System.out.println("You ordered a Pepsi");
               			               break;
               			            case "c" : case "C":
               			               System.out.println("You ordered a Coke");
               			               break;   
           			                case "s" : case "S":
               			               System.out.println("You ordered a Sprite");
               			               break;
               			            case "m" : case "M":
               			               System.out.println("You ordered a Mountain Dew");
               			               break;   
               			            default:
               			               System.out.println("Please give me a real order");
               			               break;   //defualt
       			                   }
       			                   break;//outside again
       			                   
       			          case "f" : case "F":
       			            System.out.println("Do you want a large or small order of fries (l,L,s, or S)"); 
       			                    //Last one, fries 
       			                    String fries =myScanner.next();
       			                    switch(fries){
       			                        case "l": case "L":
       			                          System.out.println("You ordered large fries");
       			                          break;
       			                        case "s": case "S":
       			                          System.out.println("You ordered small fries");
       			                          break;
       			                        default://making sure
       			                          System.out.println("Please give me a real order");
       			                          break;
       			                    }//ussual
       			                    break;//outside break
       			           default://over all defualt for first switch
       			            System.out.println("You did not enter a real order");
       			            break;//finishing
           			           }
   		         }
       	       else 
       			  {System.out.println("Please enter a single Character");}
   			                    
    		    }//switch bracket
    	}//
    