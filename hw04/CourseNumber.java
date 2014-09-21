//Course Description Scanner
//this one takes the number and determines what year and semster a course was offered

import java.util.Scanner;

    public class CourseNumber{
    			// main 
   			public static void main(String[] args) {
   			  Scanner myScanner;
   			  myScanner =new Scanner( System.in );
   			  
   			  
   			  System.out.print("Enter a six digit number giving the course semester- ");
                 int nNumber = myScanner.nextInt();
                 
                 if(nNumber>=186510 && nNumber<201440)
                 {
                       double nSeperate= nNumber/100.00;
                       int nYear = (int) nSeperate;
                       double nCt= nSeperate-nYear;
                       double nCour= nCt*100;
                       float nCourse= (float) nCour;
                       System.out.println(nYear);
                       
                      
                       
                       
                       if (nCourse==10)
                        {System.out.println("The course was offered in the Spring semester of "+ nYear);
                        }
                       else if (nCourse==20)
                        {System.out.println("The course was offered in the Summer 1 semester of "+ nYear);
                        }
                        else if (nCourse==30)
                        {System.out.println("The course was offered in the Summer 2 semester of "+ nYear);
                        } 
                       else if (nCourse==40)
                        {System.out.println("The course was offered in the Fall semester of "+ nYear);
                        } 
                        else
                        {System.out.println(nCourse +" is not a legitimate semester");
                       
                        }
                        
                        
                 }
                 else 
                 {System.out.println("Enter a valid Course Number within the range [186510,201440]");
                 }
   			}
    }