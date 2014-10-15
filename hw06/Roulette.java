//roulette java
//figuring out odds of winning with a stratagey
//
    public class Roulette{
    			// main
   			public static void main(String[] args) {
   			    int winnings=0;//for figuring out times winnings profit
   			    int f=0;//for 1000 times loop
   			    int will=0;//total winnings outside loop
   			
   			    
   			    
   			    
   			  while(f<1000)  {// outter loop for 1000 simulations
   			     
   			 
   			     int g=0;// so we can run it 1000 times
   			    
   			    int rmynumber=(int)(Math.random()*38);//random number instead of input since it doesnt matter
   			    int cash=100;//starting money
   			    
       			    while(g<100){//inner loop
       			       
       			   int ryournumber = (int)(Math.random()*38); //roullete wheel
                  
       			    if (rmynumber==ryournumber){//for winning
       			      cash=((cash+36));//moNEY!
       			     
       			    }
       			    else {//losing!
       			        cash=((cash-1));//loss
       			        
       			    }   
       			    
       			    
       			    
       			    g++;//restart the oop for 100
                  
       			     
       			    }//while cash to make sure it doesnt go negative
   		         
   	        	 if (cash>108)//this is for if we walk away from the table with a win
                {winnings++;
                  will=will+cash; //winnings
                }
   			 
   			 f++;//run it 100 times
   			  
   			  }   
   			 double loses = 1000-winnings;//opisite around winnings
   			 int lose= (int) loses;// just casue ya need to
   			  System.out.println("Total Winnings: "+ will);//printting
   			  System.out.println("Total Wins: "+ winnings);
   			  System.out.println("Total Loses: "+ lose);
   			}
    }//done