//josh goldberg
//lab 12
import java.util.Arrays;
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static double[] addArrays(double x[],double y[]){//array method
    int k=0;//for loops
    int j=1;
    int b=x.length;//comapre
    int a=y.length;
    if(b==a){//only if they are equal
      final int hey = b; 
      double array1[]= new double[hey];//new array
      while (j<=b){//do you add every one together
      
          array1[k]=x[k]+y[k];
          k++;
          j++;
          }
          return array1;
      }
    else{
      final int hey = b; 
      int what=b-a;
      double array1[]= new double[hey];
        while(j<=a){//you only add the amount in the second array
        array1[k]=x[k]+y[k];
        k++;
        j++;
        }
        while(what<b){//than the rest equal from the furst array
        array1[what]=x[what];
        what++;
        }
         return array1;//return this new array
        }
    }
   public static boolean equals(double x[],double y[]){//other one
    if(Arrays.equals(x,y)){//if they are equal
      return true;
    
    }
    else{
      return false;}
    }
    
    
}
