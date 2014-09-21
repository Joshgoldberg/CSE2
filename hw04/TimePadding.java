//Time Padding
//This takes seconds and makes it look much nicer form

import java.util.Scanner;

    public class TimePadding{
    			// main 
   			public static void main(String[] args) {
   			  Scanner myScanner;
   			  myScanner =new Scanner( System.in );
   			  
   			  System.out.print("Enter the time in seconds: ");
   			  
   			  int nNumber = myScanner.nextInt();
   			  
   			  double nHour= nNumber/100.000;
   			  int nHours= (int) nHour;
   			  double nAn= nHours*100.000;
   			  double nHours1= nAn/3600.00;
   			  int nFhour= (int) nHours1;
   			  
   			  
   			   //for hours above
   			  //now breaking it into minutses
   			  
   			  double nMin =nHours1-nFhour;
   			  double nMinutes= nMin*60.00;
   			  int nMinf= (int) nMinutes;
   			  double nSeconds= nMinutes-nMinf;
   			  double nSecondsF=nSeconds*60.00;
   			  int nfinal=(int) nSecondsF;
   			  
   			  
   			  //the example on the homework is given the wrong time
   			  //this is more accurate Im not sure why it says 4 munyes
   			  
   			     if (nMinf<10)
   			     {
   			            if (nfinal<10)
   			         {System.out.println(nFhour+":0"+nMinf+":0"+nfinal);
   			         }
   			            else
   			         { System.out.println(nFhour+":0"+nMinf+":"+nfinal);
   			         }
   			         
   			         }
   			        else if (nMinf>10)
   			           {  if (nfinal<10)
   			         {System.out.println(nFhour+":"+nMinf+":0"+nfinal);
   			         }
   			             else
   			         { System.out.println(nFhour+":"+nMinf+":"+nfinal);
   			         }
   			           }
   			           //easy padding solution
   			  
   			  else
   			  {System.out.println("Error");
   			  }
   			     
   			     
   		
   			  
   			}
    }