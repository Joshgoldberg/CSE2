//Joshua Goldberg
//Boola Boola or basiaclly true false logic testing 
//starting this up!
import java.util.Scanner;
//scanner
    public class BoolaBoola{
        // main 
    		   public static void main(String[] args) {
    		
    		   Scanner myScanner;
   			   myScanner =new Scanner( System.in );
   			   
   			   
   			   String[] andor={"&&", "||",};//string for print
   			   
   			   boolean rtrue= false;//first boolean variable
   			   boolean rtrue1= false;//second
   			   boolean rtrue2= false;//''
   			   int randor=(int)(Math.random()*2);//using this to choose operator
   			   int randor1=(int)(Math.random()*2);//tambien
   			   int rt1=(int)(Math.random()*2);//now this changes boolean state
   			   int rt2=(int)(Math.random()*2);//same
   			   int rt3=(int)(Math.random()*2);
   			   
   			   if(rt1>=1)//the statment so boolean state changes
   			   rtrue=true;//only one line so its not bracked
   			   if(rt2>=1)//changes the above
   			   rtrue1=true;
   			   if(rt3>=1)
   			   rtrue2=true;
   			   
   			  
   			  
  	 
   			  System.out.println("Does "+rtrue+ andor[randor]+ rtrue1+ andor[randor1]+rtrue2+ 
   			   " have the value true(t/T) or false(f/F)?");
   			  //printing out what the problem is
       			  String truefalse = myScanner.next();
       			  switch (truefalse){//making a switch case for the problem
       
       			  case "t":case "T"://if user enters t
           			   if(randor==0)//this is the 0 state, or the logical and statment
           			    {
               			        if (randor1==0)//this checks what the second operator is
               			            {
                   			        boolean Answer1= (rtrue && rtrue1 && rtrue2);
                       			    if (Answer1==true)//comparing boolean to t case
                       			    {System.out.println("Correct"); }
                       			    else 
                       			    {System.out.println("Incorrect");}
               			           //answered
               			            }
               			        
               			        
               			        else //this is for when its first logical and and than logical or
               			            {
               			            boolean Answer2 = (rtrue && rtrue1 || rtrue2);
                   			        if (Answer2==true)//double = so it doesnt change
                   			        {System.out.println("Correct"); }
                   			        else 
                   			        {System.out.println("Incorrect");}
           			                }//
           			    }
           			   else//this is for if its first logical or
           			        {    
               			      if (randor1==0)//logical or forfirst but not second 
               			            {
                   			        boolean Answer3= (rtrue || rtrue1 && rtrue2);
                       			    if (Answer3==true)
                       			    {System.out.println("Correct"); }
                       			    else 
                       			    {System.out.println("Incorrect");}
               			           
               			            }
               			        
               			        
               			         else //only logical or
               			            {
               			            boolean Answer4= (rtrue || rtrue1 || rtrue2);
                   			        if (Answer4==true)//once again, all 4 of these are checking to see 
                   			        {System.out.println("Correct"); }//if its true
                   			        else 
                   			        {System.out.println("Incorrect");}
           			       
           			            
           			                 }
           			        
           			        }
           			    
           			            break;
           			 case "f":case"F":       //same as above but now checking for false
           			     if(randor==0)
           			    {
               			        if (randor1==0)
               			           {//exactly the same but for false statmets
                   			       boolean Answer5= (rtrue && rtrue1 && rtrue2);
                       			   if (Answer5==false)//false 
                       			   {System.out.println("Correct"); }
                       			   else 
                       			   {System.out.println("Incorrect");}
               			           
               			            }
               			        
               			        
               			        else //checking
               			            {
               			            boolean Answer6= (rtrue && rtrue1 || rtrue2);
                   			        if (Answer6==false)
                   			        {System.out.println("Correct"); }
                   			        else 
                   			        {System.out.println("Incorrect");}
           			                }
           			    }
           			    else
           			        {    
               			       if (randor1==0)//other states of operators
               			            {
                   			        boolean Answer7= (rtrue || rtrue1 && rtrue2);
                       			    if (Answer7==false)
                       			    {System.out.println("Correct"); }
                       			    else 
                       			    {System.out.println("Incorrect");}
               			           
               			            }
               			        
               			        
               			        else //final operator state for false 
               			            {
               			            boolean Answer8= (rtrue || rtrue1 || rtrue2);
                   			        if (Answer8==false)
                   			        {System.out.println("Correct"); }
                   			        else 
                   			        {System.out.println("Incorrect");}
           			       
           			            
           			            }
           			        
           			            
           			        }
       			         
       			            break;//ending correct 
           		   default:
           			   System.out.println("Please Enter T, t or F, f");//checking if variables are right
           		            break;
   			   
   			   //all code completly for all different cases
   			  }
   			   
   		
    	 }
    }

