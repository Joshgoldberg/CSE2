import java.util.Arrays;
public class lab13{
public static void main( String args[] ){
    int [] [] myarray= new int [5][];
    for (int j=0; j<5;j++){
        myarray[j]= new int [j*3+5];}
        
    for(int k=0;k<myarray.length;k++){
        for (int g=0;g< myarray[k].length;g++){
           myarray[k][g]= (int)(Math.random()*40);
           
        }
    }
    
    for(int d=0; d<5;d++){
    String out=listArray(myarray[d]);
    System.out.println(out);}
    int [] [] fixedarray= new int [5][];
    for (int j=0; j<5;j++){
        fixedarray[j]= new int [j*3+5];}
    for(int e=0; e<5;e++){
    fixedarray[e]=fix(myarray[e]);
    }
    System.out.println("------------Sorting----------");
    for(int f=0; f<5;f++){
    String out=listArray(fixedarray[f]);
    System.out.println(out);}
    
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
    public static int [] fix(int num[]){
        Arrays.sort(num);
        return num;
        
        
    }
}