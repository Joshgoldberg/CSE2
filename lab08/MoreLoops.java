import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	int n=0;

	System.out.print("Enter an int- ");//
	do{//this is the do so it runs through the entire code
	    scan.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- ");
	}while(!scan.hasNextInt());//statement at end
	//COMMENT OUT THE ABOVE  5 LINES AND REPLACE THE CODE WITH A 
	//DO-WHILE LOOP
        n=scan.nextInt();
    int j=0;//have to declare outside
	while(j<n && j<40){//while instead of for
	    int k=0;//another declear
	    while(k<j+1){//while
		System.out.print('*');
		k++;//declared at bottom
	    }
	    System.out.println();
	    j++;//declared outside
	}//
	//COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
	//WHILE STATEMENTS
      
	int k=4;

    while(k<4);{
	    System.out.println("k="+k);
	    k++;
	}
         
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
	//WITH A WHILE LOOP

        int count=0;
        for(count=0;count<10;count++){//while into for, all inside
	    
	    
		
	    if (count==1)//breaking into different numbers
	    {  } 
	    else if (count==2)//else if instead of case
	    { System.out.print("Case 2 "); }
	    else if (count==3)//same
	    {}
	    else if (count==4)//same
	    { System.out.println("Case 4");}
	    else if (count==5)
	    {System.out.println("Case 5");}//same^
	    else{
	    System.out.println(n + " is > 5 or <1");}//instead of default
	    }
	    
	
	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }
}