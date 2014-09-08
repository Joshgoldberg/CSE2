// basing off the homework
//trying to use variables to solve simple equations

//starting

public class Arithmetic{
     
    public static void main(String [] args){
        
         //done starting inputting variables
        
        int nSocks=3;
        double sockCost$=2.58;
        int nGlasses=6;
        double glassCost$=2.29;
        
        //prices and numbers
        //more now
        
        int nEnvelopes=1;
        double envelopeCost$=3.25;
        double taxPercent=0.06;
       
               double totalSockCost$=nSocks*sockCost$;
               double totalGlassCost$=nGlasses*glassCost$;
               double totalEnvelope$=nEnvelopes*envelopeCost$;
            //making these variables to show what the costs are
            //printing out the first cost of prices
            
            
                    //convering the tax into something that doesnt have decimals
                    double sockTax$=(totalSockCost$*taxPercent);
                    double glassTax$=(totalGlassCost$*taxPercent);
                    double envelopeTax$=(envelopeCost$*taxPercent);
                    double costTotal$=(totalSockCost$+totalGlassCost$+totalEnvelope$+taxPercent*(totalSockCost$+totalGlassCost$+totalEnvelope$)) ;
                    
                    
                    
            
                                 
                            System.out.println("Sock cost"+ totalSockCost$);
                            System.out.println("Sock Tax");
                            System.out.printf( "%.2f %n", sockTax$);
                            System.out.println("Glass Cost"+ totalGlassCost$);
                            System.out.println("Glass Tax");
                            System.out.printf( "%.2f %n", glassTax$);
                            System.out.println("Envelopes"+ totalEnvelope$);
                            System.out.println("Enevelope Tax");
                            System.out.printf( "%.2f %n", envelopeTax$);
                            System.out.println("Cost No tax"+ (totalSockCost$+totalGlassCost$+totalEnvelope$));
                            System.out.println("Cost Total") ;
                            System.out.printf( "%.2f %n", costTotal$);
                
                
      }
 }