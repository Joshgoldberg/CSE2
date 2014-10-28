//josh goldberg lab
//using methods

import java.util.InputMismatchException;
import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");

	a= scan.nextInt();
	b= scan.nextInt();
	c= scan.nextInt();


  
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ ascending(a,b,c)+ " that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  
  
  
  }
  
  
  
  public static int larger(int ay,int bee){
      if(ay>bee)
      return ay;
      else
      return bee;
  }
  public static boolean ascending(int q,int v,int e){
      if(q<v&&v<e){return true;}
      else {return false;}
      }
      
  }

