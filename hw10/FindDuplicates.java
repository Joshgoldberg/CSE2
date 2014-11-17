//Joshua Goldberg
//Find Duplicates

import java.util.Scanner;//scanner
public class FindDuplicates{//class
  public static void main(String [] arg){//main
    Scanner scan=new Scanner(System.in);//scanner
    int num[]=new int[10];  //set up length
    String answer="";//set up
    do{//loop
      System.out.print("Enter 10 ints- ");//for making array
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){//for printing
        out+="has ";//strings
      }
      else{//if it isnt
        out+="does not have ";//string
      }
      out+="duplicates.";//printing
      System.out.println(out);//printing out hte made string
      out="The array ";//for other 
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";//
      System.out.println(out);//second track
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//loops
      answer=scan.next();//scan
    }while(answer.equals("Y") || answer.equals("y"));//quits if not
  }

  public static String listArray(int num[]){//printing out the array
    String out="{";//string
    for(int j=0;j<num.length;j++){//printing into a string
      if(j>0){
        out+=", ";//for comas and space in the string
      }
      out+=num[j];
    }
    out+="} ";//so it looks like an array
    return out;//return the string
  }
  
  public static boolean hasDups(int x[]){//start of my first
   for (int y=0; y<x.length; y++){//length of the string 
        for (int k=y+1; k<x.length; k++){//sperate checking the strings by one and not 
        //going over the length
        if (x[k]==x[y])//so it should run around 36 times
        {return true;}//if it ever does it returns true immeidatly
        }
    }
    return false;//if it doesnt it quits
}
            
            
  

   public static boolean exactlyOneDup(int x[]){//for other
       int add=0;//this is for checking if only once
       for (int y=0; y<x.length; y++){//all ythe times it goes through y
        for (int k=y+1; k<x.length; k++){//once agian, it adds one on
        //and checks to make sure it doesnt go over the length.
            if (x[k]==x[y]) //if it ever does for any of the 36
            {add ++;}//than it counts how many times
        }
    }
    
    if (add==1)//if it is only once
    {return true;}//true
    else{//more than once
    return false;}//than it is false
}
    
}
