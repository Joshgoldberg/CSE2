// Joshua GOldberg hw
//using methods
import java.util.Scanner;
public class HW8{
    //public class
  
  public static void main(String []arg){//the main code
	char input;// for the input of characters original
	String other;//since i use a string anther time, i addedthis since some needed to be strings
	Scanner scan=new Scanner(System.in);// new scanner
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//first question
	other=getInput(scan,"Cc");//using outer method
	System.out.println("You entered '"+other+"'");// what you inputed
  System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//next one
  input=getInput(scan,'y',5); //switched up what the scan is
  System.out.println("You entered '"+input+"'");//what i inputed
  System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'");//last question
	other=getInput(scan,"12345",2,1);//last method
  System.out.println("You entered '"+other+"'");//last input
  }
  
  
  
  public static String getInput(Scanner scan, String P){//string for cc
    int j=0;/*
    EVEN THOUGH THE QUESTION SAID IT SHOULD QUIT
    OUT IF YOU DO NOT TYPE IN C, THIS J IS TO 
    CONTINUE RUNNING THE CODE SINCE IN THE HOMEWORK
    THE SAMPLES RUNS HAS US CONTINUALLY TYPE IN 
    EVEN IF IT IS NOT A C. THIS IS A NOTE SAYING THAT DOESNT SEEM
    RIGHT, but whatever, following the sample out */
    while(j==0){//keep running until j is bigger
    P=scan.next();//inside the method so u retype it
    int lawl= P.length();//checking length so its right
    if(lawl==1){//if its proper length
    if(P.equals("c") || P.equals("C") ){//if its proper charcter
      j++;//quit out of while loop
      return P;//bring the input back into main method
    }
    else{//if not
      System.out.print("You did not enter a character from the list 'Cc'; try again-");
        }
    }
    else{//if its not a length of 1
        System.out.print("You should enter exactly one character-");
      }
    }
      return P;//this does nothing but need a return at an end
  }//end of first method
        
    public static char getInput(Scanner scan, char f, int q ){//second method
     int r=0;//counter for printing out failer
      q=0;//other counter, 
      
       while(q<5){
            f =scan.next(".").charAt(0);//character scanner
                 //assuming we had to use characters once since that
                 //was original input
            if(f=='y' || f=='Y' || f=='n'|| f=='N'){//if it is correct
               q=5;//quit out of loop
               return f;//return f above
              }
            else{
                q++;//counter
                System.out.println("You did not enter a character from the list 'yYnN'; try again-" );
                 System.out.println("You entered '"+f+"'");
                 r++;//keep printing this until five times
                 if(r==5){//if r gets to 5, the program should run this
                 System.out.println("You Failed after 5 tries");
                 System.exit(0);//exits the entire program
                          }  
                  }
                  }
     return f;//return for the last program
        }
       
       
     public static String getInput(Scanner scan, String G, int c, int cc){//last method
     cc=0;//
    while (cc<1){//force the user counter. keeps it running til its right
      
       G=scan.next();//input
       int lawl= G.length();//length checker
          if(lawl==1){//if its correct length
          if(G.equals("0") || G.equals("1") || G.equals("2") || G.equals("3") || G.equals("4") || G.equals("5") || G.equals("6")
          || G.equals("7") || G.equals("8") || G.equals("9")){//the proper strings
           cc=1;//quit out of loop
            return G;//return what you inputed
            }
            
           else{//force user if its not correct characer
            System.out.println("You did not enter an acceptable character");
            System.out.println("Choose a digit.");
            }
               }
            else{//force user if they enter a variabel that is to long
              System.out.println("Enter exactly one character");
              System.out.println("Choose a digit.");
            }
          }
               
             return G;  //last return
       }//end of method
     

  //end of class
}

