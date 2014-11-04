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

    
   public static int getInt(){
       int m;
       int j;
       System.out.println("Enter an in int between 1 and 9, inclusive:");
       Scanner scan=new Scanner(System.in);
        
       m=checkInt(scan);
       
      j=checkRange(m);
        
       //j=checkInt(j);
       // checkRange();
        return j;
    }
    
    public static int checkInt(Scanner scan){
        int r=0;
        int p=0;
        while (r==0){
        scan=new Scanner(System.in);
            if(scan.hasNextInt()){
            p=scan.nextInt();
            r++;
            return p;
    }
     else{ System.out.println("PLease enter an Integer");
        }
    }
    return p;
    }
    
    
    public static int checkRange(int j ){
        int r=0;
        Scanner scan=new Scanner(System.in);
        while (r==0){
            if(j>=1 && j<10){
                r=1;
                return j;
                
            }
            else{
                System.out.println("Please Enter Integer within range");
                j=checkInt(scan);
            }    
    }
    return j;
    }
    

   public static int allBlocks(int i ){
       String[] number={"        1        ","       222       ","      33333      ","     4444444     ","    555555555    ",
       "   66666666666   ","  7777777777777  "," 888888888888888 ","99999999999999999",};
       String[] line={"        -        ","       ---       ","      -----      ","     -------     ",
       "    ---------    ","   -----------   ","  -------------  "," --------------- ","-----------------",};
        
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
        
        
      return i;  
    }
   
}