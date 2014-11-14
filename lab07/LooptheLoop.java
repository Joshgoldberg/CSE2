//Joshua GOldberg
//lab 07
//10/10/14

import java.util.Scanner;

    public class LooptheLoop{
    			// main 
    			
    	
   	    public static void main(String[] args) {
   	         Scanner myScanner;
   			 Scanner scan=new Scanner(System.in);
   		    System.out.println("Enter an int between 1 and 15");
   		    
   		    int num=scan.nextInt();
   		    
   		    if (num>=0 && num <=15){//outter loop
   		      int d=0;//for inner loop
   		      int j=0;//so it prints every "number"
   		      while(j<=num){
	        while(d<j){//while instead of for
	         int k=0;//another declear
	         while(k<d+1){//while
	    	System.out.print('*');
		k++;//declared at bottom
	    }
	    System.out.println();
	    d++;//declared outside
	}//
	j++;}
	}//
       	        
     
       	    else{
       	        System.out.print("Enter and Integer between [1,15]");
       	    }  
   	       }
   	       
   	    
    }
   	     
   	       
   	       