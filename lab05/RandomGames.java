//Joshua Goldberg
//september 24 2014
//Random Game thing

import java.util.Scanner;

    public class RandomGames{
    			// main 
    	
   			public static void main(String[] args) {
   			    	String[] cardNames={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King",};
   			    	//Creating A String instead of using a switch case, I am doing this so i dont have to write so many 
   			    	//if else statements. Looking up a string i found I can refrence back to what numbers should be and
   			    	//it is much simpliar that a swithc or a million iff else statements
    		        String[] cardSuits={"Hearts","Spades","Clubs","Diamonds"};
    		        //same thing but for refrence with suit names. The string up here basically listsnumbers and what each number should
    		        //be displayed
   			      Scanner myScanner;
   			       myScanner =new Scanner( System.in );
   			       
   			        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card");
   			        String game = myScanner.next();
   			        //starting the switch  case with a string
   			        switch (game) {
   			            case "R" : case "r":
   			                int rNum = (int)(Math.random()*38); // using a random number gernator where 38 will act as a 00
   			                if(rNum==37)
   			                {System.out.println("Roulette:00");
   			                    //this for 3
   			                }
   			                else
   			                {System.out.println("Roulette:"+rNum);
   			                    //any other number should diplsay right
   			                }
   			           //second game
   			            break;
   			            case "P" : case "p":
   			                int rSuit = (int)(Math.random()*4);
   			                int rNumber=(int)(Math.random()*13);
   			                //random number generators for numbers and suits
   			                System.out.println(cardNames[rNumber]+" of "+cardSuits[rSuit]);
   			                //AND THE STRINGS FROM ABOVE! so much easier than what i could have done with if else statemetnts
   			                //basiaclly inputting whatever the random number that was made, and matching 
   			                //it up with the number it represents on the string, starting from the 0 which the string represents, and
   			                //taking the intger i converted and mathching it in place. Since it is random cards, it is not as 
   			                //important that I used 0 state for whatever it was. 
   			            break;
   			            case "C" : case "c":
   			                int craps1 = (int)(Math.random()*6)+1;
   			                int craps2 = (int)(Math.random()*6)+1;
   			                double finalss= craps1+craps2;
   			                int finc= (int) finalss;
   			                //this is fairly straightfoward
   			                //creating a system where 2 dye are rolled, 
   			                //doubling for math
   			                //int for clean solution
   			                
   			                System.out.println ("Craps: " +(craps1)+"+"+(craps2)+"="+(finc));
   			            break;
   			            
   			            default:
   			            System.out.println("Enter Valid Character");
   			            break;
   			            
   			         
                         }
        
   			   
   			       
   			       
   			}
  }