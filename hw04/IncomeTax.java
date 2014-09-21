//Income Tax calculator
//we are using if else statements to deterimne a tax rate and than to calculate a income tax for each amount given

import java.util.Scanner;

    public class IncomeTax{
    			// main 
   			public static void main(String[] args) {
   			  Scanner myScanner;
   			  myScanner =new Scanner( System.in );
   			    
   			    System.out.print("Enter an int giving the number of thousands-");
                 int nNumber = myScanner.nextInt();
   			       //first under 20
   			        if(nNumber>=0 && nNumber<20)
   			        
   			        { 
   			            double nPreTax = nNumber*1000;
   			            int nPreTaxs = (int) nPreTax;
   			            double nTax = nPreTax*0.05;
   			          

   			            
   			            System.out.println("The tax rate on $"+ nPreTaxs + " is 5% , and the tax is $"+ nTax);
   			            
   			            
   			            
   			           
   			        }
   			        //now checking if its inbetween 2 sets
   			        
   			         else if (nNumber >=20 && nNumber< 40)
   			        { 
   			            double nPreTax1 = nNumber*1000;
   			            int nPreTaxs1 = (int) nPreTax1;
   			            double nTax1 = nPreTax1*0.07;
   			            double nTaxmiddle= nTax1*100;
   			            int nTaxchange= (int) nTaxmiddle;
   			            double nTaxfinal= nTaxchange/100.00;
   			            //have all this change since its 7% and will always have mess up with formating even though there should not be change
   			            //in order to get rid of this formating issue do a quick convert in and out for it
   			           

   			            
   			            System.out.println("The tax rate on $"+ nPreTaxs1 +" is 7% , and the tax is $"+ nTaxfinal);
   			        }
   			        
   			         else if (nNumber >=40 && nNumber< 78)
   			        { 
   			            double nPreTax2 = nNumber*1000;
   			            int nPreTaxs2 = (int) nPreTax2;
   			            double nTax2 = nPreTax2*0.12;
   			          

   			            
   			            System.out.println("The tax rate on $"+ nPreTaxs2 +" is 12% , and the tax is $"+ nTax2);
   			        }
   			         else if (nNumber >=78)
   			        { 
   			            double nPreTax3 = nNumber*1000;
   			            int nPreTaxs3 = (int) nPreTax3;
   			            double nTax3 = nPreTax3*0.12;

   			            
   			            System.out.println("The tax rate on $"+ nPreTaxs3 +" is 14% , and the tax is $"+ nTax3);
   			        }
   			        else
   			        {
   			            System.out.println("Enter Valid Integer");
   			        }
   			        
   			        
   			}
   			
    }