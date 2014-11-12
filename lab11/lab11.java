//Joshua Goldberg
//Lab 11
import java.util.Scanner;
public class lab11{
    
    public static void main(String []  arg){
        
        final int number = 10; 
        Scanner scan=new Scanner(System.in);
        int array[]= new int[number];
        int i=0;
        while(i<10){
        array[i]=scan.nextInt();
        i++;
        }
        int lol=0;
        int minimum = array[0]; 
        for (int k=0; k<array.length; k++){
            if (array[k]<minimum){ 
                minimum = array[k]; 
                lol=minimum;
                
                 }
            
                }   
        
        int max = array[0]; 
        for (int e=0; e<array.length; e++){
            if (array[e]>max){ 
                max = array[e]; 
               
                
                 }
            
                }          
        int sum = 0;
        for( int h : array) {
         sum += h;  
        }
        
        final int hey = 10; 
        int array1[]= new int[hey];
        int rar=0;
        int minus=9;
        while(rar<10){
        array1[rar]=array[minus];
        rar++;
        minus--;
        }
        
        
        
        System.out.println("The lowest entry is"+ lol);
        System.out.println("The highest entry is"+ max);
        System.out.println("The Sum is"+sum);
        int nope=0;
        while(nope<10){
            System.out.println(array[nope]+ " " +array1[nope]);
            nope++;
            
        }
        
       
       
      
    }
}