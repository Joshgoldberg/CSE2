/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String [] args ){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n;
    if(scan.hasNextInt()){
     int k=4,p=6,q=7,r=8;
     n=scan.nextInt();
      System.out.println("You entered "+n);
      switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
    }
    else{
      n=4;
      System.out.println("You entered "+n);
      
    
   
    }
    
    
    }
  }


/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 
 1)the box should go next to string, and its args, not arg
 2)int n needs to be established outside the if, and only needs to be establisehd, not scanned
 3)n needs to be establisehd inside the bracket so it can be posted.
 4) the code needed to be moved inside the earlier brackets since
 
 */
