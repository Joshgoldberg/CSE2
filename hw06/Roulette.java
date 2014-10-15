//roulette java
//figuring out 
    public class Roulette{
    			// main
   			public static void main(String[] args) {
   			    int winnings=0;
   			    int f=0;
   			    int will=0;
   			
   			    int ddd= 0;
   			    int internal =0;
   			    
   			  while(f<1000)  {
   			     
   			 
   			     int g=0;
   			    
   			    int rmynumber=(int)(Math.random()*38);
   			    int cash=100;
   			    
       			    while(g<100){
       			       
       			   int ryournumber = (int)(Math.random()*38); 
                  
       			    if (rmynumber==ryournumber){
       			      cash=((cash+36));
       			     
       			    }
       			    else {
       			        cash=((cash-1));
       			        
       			    }   
       			    
       			    
       			    
       			    g++;
                  
       			     
       			    }//while cash to make sure it doesnt go negative
   		         
   	        	 if (cash>108)
                {winnings++;
                  will=will+cash; 
                }
   			 
   			 f++;
   			  
   			  }   
   			 double loses = 1000-winnings;
   			 int lose= (int) loses;
   			  System.out.println("Total Winnings: "+ will);
   			  System.out.println("Total Wins: "+ winnings);
   			  System.out.println("Total Loses: "+ lose);
   			}
    }