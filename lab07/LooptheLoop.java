//Joshua GOldberg
//lab 07
//10/10/14

import java.util.Scanner;

    public class LooptheLoop{
    			// main 
    			
    	
   	    public static void main(String[] args) {
   	         Scanner myScanner;
   			 myScanner =new Scanner( System.in );
   		    System.out.println("Enter an int between 1 and 15");
   		        int nStars=1;
       	        int nRows=myScanner.nextInt();
       	        int c1=1;
   		    if(0<nRows && nRows<=15){
       	     
       	       while (nStars<=nRows){
               	        System.out.print("*");
               	        nStars++;}
               	     
       	        
       	      
       	        }
       	       
       	        
       	        
       	    
       	        
       	    
       	    
       	    
       	    
       	    else{
       	        System.out.print("Enter and Integer between [1,15]");
       	    }  
   	       }
   	       
   	    
    }
   	     
   	       
   	       