//Joshua Goldberg
//november 2 blocked again using methods

import java.util.Scanner;
public class BlockedAgain{
        public static void main(String []s){
            int m;
                //force user to enter int in range 1-9, inclusive.
            m = getInt(); 
            allBlocks(m);
                            }

    //this is all the same as the program that was given
   public static int getInt(){//this is for get in
       int m;// the first int for check int
       int j;// for check range
       System.out.println("Enter an in int between 1 and 9, inclusive:");
       Scanner scan=new Scanner(System.in);// scanner
        
       m=checkInt(scan);// goes into method
       
      j=checkRange(m);//goes into methods after first comples
        
       //j=checkInt(j);
       // checkRange();
        return j;//returns the value to main method
    }
    
    public static int checkInt(Scanner scan){// this checks if int
        int r=0;//repater
        int p=0;//int we are gonna use
        while (r==0){
        scan=new Scanner(System.in);
            if(scan.hasNextInt()){//if its integer
            p=scan.nextInt();//make it integer
            r++;//quit out of while
            return p;//return this vairable
    }
     else{ System.out.println("PLease enter an Integer");//keep trying
        }
    }
    return p;//needed but not read
    }
    
    
    public static int checkRange(int j ){//checks the range
        int r=0;
        Scanner scan=new Scanner(System.in);//for re scaning below
        while (r==0){//repater
            if(j>=1 && j<10){
                r=1;//quit out
                return j;//return if in range
                
            }
            else{
                System.out.println("Please Enter Integer within range");
                j=checkInt(scan);//send back to other method
            }    
    }
    return j;//return j
    }
    

   public static int allBlocks(int i ){
       String[] number={"        1        ","       222       ","      33333      ","     4444444     ","    555555555    ",
       "   66666666666   ","  7777777777777  "," 888888888888888 ","99999999999999999",};
       String[] line={"        -        ","       ---       ","      -----      ","     -------     ",
       "    ---------    ","   -----------   ","  -------------  "," --------------- ","-----------------",};
        //
        //I DID THIS PROGRAM THIS WAY LAST TIME SO I AM DOING IT AGAIN this way
    
   			int qw;//first set of variables
   		    int as;
   		    int df;
   		    int zx=1;//this is used as a counter
   		    int numberRows = i;
           		System.out.println("Using For Loops");   
           		    
           		 for(as=0;as<i;)//for statement that is defieining the times it repeated outside(1-9)
           		 {
           		     
           		        for(qw=0;qw<i;qw++){//inner loops dealing with times rows are printed(the same number)
           		            for(df=0;df<zx;df++){//printing a row low
                   		        
                   		        System.out.println(number[qw]);
                   		        
                               
             
           		            }
               		      
               		      zx++;//counter increase
               		      df=0;//restarting this so it counts to the number for
               		      //rows each number, such as 6 six times
           		           
           		        
           		      
           		        System.out.println(line[as]);//this prints out after the intial
           		        //loop is done so its another array that determines the 
           		        as++;//increasing so it makes a longer line
           		        }
           		        
           		 }
        
        
      return i;  // return needed
    }
   
}