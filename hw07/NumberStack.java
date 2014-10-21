import java.util.Scanner;

    public class NumberStack{
    			// main 
    		public static void main(String[] args) {
    		String[] number={"1","222","33333","4444444","555555555","66666666666","7777777777777","888888888888888","99999999999999999",};
    		String[] line={"-","---","-----","-------","---------","-----------","-------------","---------------","-----------------",};
            //these strings are to save space in the code, and to use variables/
            //to write out strings
    	    Scanner myScanner;//scannn
   			myScanner =new Scanner( System.in );//for scanner
   			System.out.println("Enter Number 1-9");
   			//will only work for numbers 1-9 due to the array
   			int i;//the number we type in
   			i=myScanner.nextInt();//scanner
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
           		        
           		 }//ending this loop moving onto while
           		 
   		    
   		    int k= 0;//vairbales
   		    int j= 0;
   		    int f=0;
   		    int q=1;
   		    
           		System.out.println("Using While Loops");   //while
           		    
           		 while(j<i)//this does not include the increase in the proper increments
           		 {
           		     
           		        while(k<i){//inner row repearter
           		            while(f<q){//line printer
                   		        
                   		        System.out.println(number[k]);
                   		        f++; //increasing
                               
             
           		            }
               		      
               		      q++;//counter
               		      f=0;//restarting inner counter
           		           k++;//increasing number 1-9
           		        
           		      
           		        System.out.println(line[j]);
           		        j++;//outter line 
           		        }
           		 } 
           	System.out.println("Using Do Loops");	  
           	int z= 0;
   		    int x= 0;
   		    int c=0;
   		    int v=1;
   		    
           		    
           		    
           		 do//exact same as while but while goes at the end
           		 {
           		     
           		       do {//loops for number
           		            do{//printer
                   		        
                   		        System.out.println(number[z]);
                   		        c++; //increase
                               
             
           		            }while(c<v);//
               		      
               		      v++;//times printer
               		      c=0;//restarting counter
           		           z++;//increasing internal number
           		        
           		      
           		        System.out.println(line[x]);
           		        x++;//outter line
           		        }while(z<i);//ending loops
           		 }while (x<i);	 //last loop        
           		 
           		      
           		 
    		
    }
    }