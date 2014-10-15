import java.util.Scanner;
//scanner
    public class Root{
    			// main 
    			public static void main(String[] args) {
    		 Scanner myScanner;//scannn
   			  myScanner =new Scanner( System.in );//scanner
   			  System.out.println("Enter Number");
   			  int nroot;//so the root
   			  nroot = myScanner.nextInt();
   			  //the rot
   			  
   			   
   			  double high= nroot+1;// high variable
   			  double low = 0;/// low
   			  double variance = high - low;//the difference needs to be outside the loop
   			  double mid = 0;//declaring and needs a number
   			  double mid2;//doesnt need a number but also outside the loops
   			  
   			  while (variance >=0.0000001){// repeating until we get close enough
   			  
   			  mid= (high+low)/2.0;// math
   			  mid2= mid*mid;//math
   			  if ((mid2>nroot))//changing the limits
   			  {high=mid;}//making it smaller
   			  else if(mid2<nroot)//same but for lower
   			  {low=mid;}
   			  variance = high-low;//inner variance so we can switch it and change it until its close
   			  
   			      
   			  }
   			  System.out.println(mid);//print the ending
    			}
    			
    }
    
   			  
   			  
   			  