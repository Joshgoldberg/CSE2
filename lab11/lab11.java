//Joshua Goldberg
//Lab 11
import java.util.Scanner;
public class lab11{
    
    public static void main(String []  arg){
        
        final int number = 10; //need to determine lnegth
        Scanner scan=new Scanner(System.in);
        int array[]= new int[number];
        int i=0;//for making an array
        while(i<10){
        array[i]=scan.nextInt();//this gets changed 10 times to fill space
        i++;
        }
        int lol=0;//for compare
        int minimum = array[0]; //for determing min
        for (int k=0; k<array.length; k++){//running through all variables
            if (array[k]<minimum){ //if its less than current minimum
                minimum = array[k]; // it changes into current min
                lol=minimum;
                
                 }
            
                }   
        
        int max = array[0]; //same for max
        for (int e=0; e<array.length; e++){
            if (array[e]>max){ //if it is greater than current max
                max = array[e]; //it becomes current max
               
                
                 }
            
                }          
        int sum = 0;//sum
        for( int h : array) {
         sum += h;  //summing arrays
        }
        
        final int hey = 10; //making a new aray for revers
        int array1[]= new int[hey];
        int rar=0;//so it runs 10 times
        int minus=9;//so it starts oppisite
        while(rar<10){
        array1[rar]=array[minus];//making the array by subtracting from it a lot
        rar++;
        minus--;
        }
        
        
        
        System.out.println("The lowest entry is"+ lol);//printing 
        System.out.println("The highest entry is"+ max);//printing
        System.out.println("The Sum is"+sum);//printing
        int nope=0;
        while(nope<10){//print with loop since it has to be verticle
            System.out.println(array[nope]+ " " +array1[nope]);
            nope++;
            
        }
        
       
       
      
    }
}