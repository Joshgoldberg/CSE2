///Bicycle Cycle Counter
//using the input and the calculation double in a program
//starting off
import java.util.Scanner;

    public class Bicycle {
    			
    			  
    			  
    			  
   			  public static void main(String[] args) {
   			      
   			      //main string
   			       Scanner myScanner;
   			       myScanner = new Scanner( System.in );
   			       
   			       //this is how you import the scanner i beileve unless their im adding extra stepps ^
   			       
   			       
   			       
   			            System.out.print(
                         "Enter the number of Seconds:");
                         int nSeconds = myScanner.nextInt();
                        
                      //now counts
                      
                            System.out.print(
                            "Enter the number of counts:");
                            int nCounts = myScanner.nextInt();
                            
                            
                            
                            
                            // now adding the data that was used on the lab, such as circumfrance, pi, how long things are
                            
                            double wheelDiameter=27.0,
                            PI=3.14159, 
                            feetPerMile=5280, 
                            inchesPerFoot=12,
                            secondsPerMinute=60,
                            secondsPerHour=3600; //not 60 since its hour this time
                            
                                //figuring out the distance, once again using cyclometer formulas
                                         
                                  
                                    
                                double Distanceinch= nCounts*wheelDiameter*PI;
                                double Distancefeet= Distanceinch/inchesPerFoot;
                                double Distance= Distancefeet/feetPerMile;
                                
                                //conversations, probably did not have to double
                                //but felt more comfterable
                                
                                
                                System.out.println("Distance In Miles:");
                                System.out.printf( "%.2f %n", Distance);
                                
                                  
                                //figuring out time
                                
                                double Time= nSeconds/secondsPerMinute;
                                
                                System.out.println("Time In Minutes:");
                                System.out.printf("%.1f %n", Time);
                                
                                
                                
                                //speed now
                                
                                double Timehours= nSeconds/secondsPerHour;
                                double MPH= Distance/Timehours;
                                
                               System.out.println("Average MPH:");
                                System.out.printf("%.2f %n", MPH);
                                
                                
                                    
                         
   			  }                                   
    }                                    
                                    