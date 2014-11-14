//Joshua Goldberg
//method calls lab


public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
       System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int a,int b){//using methods
     if(a>0){//since this will not work if it has a negative
        double h;//int
         double f= (double) b;//making double
       double g= b%1000;//equation so it can be used and figure
       g=Math.pow(10, g); //power of modulo
       f=g*f;//multiply one number
       h=a+f;//adding them together
       int c= (int) h;
        return c;}//returning the add digit
     else{
         double g=a*-1;//manual for add
         int change= (int) g;
        
         String sa = String.valueOf(change);//making into strings
         String sb = String.valueOf(b);//working with strings
         String nah="-";//adding in the negative
         String ff= nah+sa+sb;//strings are added to return right answer
         

         int c = Integer.parseInt(ff);//making it an int since that is the type of method
         return c;
         
     }   
    }
    public static int join(int a, int b){//the other way it does it
        
        if(a>0){
         String sa = String.valueOf(a);//basicaly same as above
         String sb = String.valueOf(b);  
         String ff= sa+sb;
         
         int d = Integer.parseInt(ff);//returning as int
         return d;
        }
        if(a<0){
            double g=a*-1;//getting rid of negatives
            double e=b*-1;
            int v= (int) g;
            int z= (int) e;
         String sa = String.valueOf(v);//returning into string
         String sb = String.valueOf(z);  
         String ff= sa+sb;//adding string
         
         int d = Integer.parseInt(ff);//back to int
         return d;
        }
        return a;
        
    }
    
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/