//Joshua Goldberg
//poker
import java.util.Random;//random
import java.util.Scanner;//scanner utility
public class PokerOdds{//class
  public static void main(String [] arg){//main
    showHands();//first
    simulateOdds();//odds
  }


public static String showHands(){
    int nooo=0;//so it can quit out
    while(nooo==0){//quoter
    String[] cardNames={"Ace", "King","Queen", "Jack","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two",};//string for names
    int r2=53;//has to not be within 52
    int r3=53;
    int r4=53;
    int r5=53;
    int a=0;//for variables
    int b=0;
    int c=0;
    int d=0;
    int r1=(int)(Math.random()*52);//randomizer
        while(a==0){//so it can not be hte same
        int s1=(int)(Math.random()*52);
        if (s1!=r1)//if it doesnt
            {r2=s1;//it equals the number
            a++;}//quits
        }//otherwise continues to run
        while(b==0){//same as above
        int s2=(int)(Math.random()*52);
        if (s2!=r1 && s2!=r2)
            {r3=s2;
            b++;}
        }
        while(c==0){//same
        int s3=(int)(Math.random()*52);
        if (s3!=r1 && s3!=r2 && s3!=r3)
            {r4=s3;
            c++;}
        }
        while(d==0){//same
        int s4=(int)(Math.random()*52);
        if (s4!=r1 && s4!=r2 && s4!=r3)
            {r5=s4;
            d++;}
        }
        String Clubs="Clubs: ";//displaying how it wanted
        String Diamonds="Diamonds: ";//strings to display
        String Hearts="Hearts: ";
        String Spades="Spades: ";
        final int number = 5;//making a new array
        int cardsuit[]= new int[number];//array setup
        cardsuit[0]=getsuit(r1);//adding the numbers to the suit by the math
        cardsuit[1]=getsuit(r2);
        cardsuit[2]=getsuit(r3);
        cardsuit[3]=getsuit(r4);
        cardsuit[4]=getsuit(r5);
        int cardnumber[]= new int[number];//making another array
        cardnumber[0]=getcard(r1);//so now we have the numbers in an array
        cardnumber[1]=getcard(r2);
        cardnumber[2]=getcard(r3);
        cardnumber[3]=getcard(r4);
        cardnumber[4]=getcard(r5);
        int ga=0;//counter
        while(ga<5){//for all five dards
        if(cardsuit[ga]==0)//first suit of cards
        {
         Clubs+=  cardNames[cardnumber[ga]]+" ";//adding on to the string
            
        }
        if(cardsuit[ga]==1)//same for other suit
        {
        Diamonds+= cardNames[cardnumber[ga]]+" ";
            
        }
        if(cardsuit[ga]==2)
        {
        Hearts+=cardNames[cardnumber[ga]]+" ";
            
        }
        if(cardsuit[ga]==3)
        {
        Spades+=cardNames[cardnumber[ga]]+" ";
            
        }
        
        ga++;}//counted to five
        
        System.out.println(Clubs);//print out the final strings
        System.out.println(Diamonds);
        System.out.println(Hearts);
        System.out.println(Spades);
        System.out.println("Go again? Enter 'y' or 'Y', anything else to quit");//for repating
        Scanner lol=new Scanner(System.in);//scan
        String game = lol.nextLine();
        switch (game){//if yes
            case"Y":case"y":
             showHands();//re do it and start above
             
             break;//break
            
             default://if not
             simulateOdds();//quit and simulate the ods
             nooo++;//quit out
             break;
        }
             nooo++;//double checking
            }
            nooo++;//tripple checking
           return "s";     
        }
        
    
        
    
        
        
        

        
    public static int getsuit(int a){  
        int b= a/13;//gives what suit since it is out of 13

        return b;//return it
    }
       
    
    public static int getcard(int a){//now for which card
        if (a>=13){//since unnecasry if under 13
        double c= a%13;//modulo to get remainder
        int d=(int) c;
        return d;}
        else{
        return a;}//just return the number
    }
   
   public static int  simulateOdds(){//simulate the odds now
       String[] cardNames={"Ace", "King","Queen", "Jack","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two",};
       //string of cards name
       int ace= 0;//counting for each variable
       int king =0;
       int queen =0;
       int jack =0;
       int ten=0;
       int nine=0;
       int eight=0;
       int seven=0;
       int six=0;
       int five=0;
       int four=0;
       int three=0;
       int two=0;
       int none=0;
       int counter =0;//counter for 10000 times
       while (counter<10000){//counter
         String way="";//make the string that way
           int r2=53;//RE DO ABOVE CODE
        int r3=53;
       int r4=53;
       int r5=53;
       int a=0;
       int b=0;
       int c=0;
      int d=0;//for sutis
       int r1=(int)(Math.random()*52);//same as above for running above
        while(a==0){
        int s1=(int)(Math.random()*52);
        if (s1!=r1)
            {r2=s1;
            a++;}
        }
        while(b==0){
        int s2=(int)(Math.random()*52);
        if (s2!=r1 && s2!=r2)
            {r3=s2;
            b++;}
        }
        while(c==0){
        int s3=(int)(Math.random()*52);
        if (s3!=r1 && s3!=r2 && s3!=r3)
            {r4=s3;
            c++;}
        }
        while(d==0){
        int s4=(int)(Math.random()*52);
        if (s4!=r1 && s4!=r2 && s4!=r3)
            {r5=s4;
            d++;}
        }
            
            
        final int number = 5; //arrayfor above   
        int cardnumber[]= new int[number];
        cardnumber[0]=getcard(r1);
        cardnumber[1]=getcard(r2);
        cardnumber[2]=getcard(r3);
        cardnumber[3]=getcard(r4);
        cardnumber[4]=getcard(r5);
    
       int add=0;//this is the checker
       for (int y=0; y<cardnumber.length; y++){
        for (int k=y+1; k<cardnumber.length; k++){
        
            if (cardnumber[k]==cardnumber[y]) //if it equals it
            {add ++;//it adds one
             way+=cardNames[cardnumber[k]];   //and adds to the string
            }
            }
            }
    
    if (add==1){//however! this only matters if it only gets added once
     
    switch (way){//switch case for the String that gets printed out
    case "Ace" ://if it is ace, which would be the printed if ace gets paired once
            ace++;//than ace, which is defined outside loop gets added
            break;
    case "King" :
            king++;
            break;   
    case "Queen" :
            queen++;
            break; 
    case "Jack" :
            jack++;
            break;    
    case "Ten" :
            ten++;
            break;         
    case "Nine" :
            nine++;
            break;   
    case "Eight" :
            eight++;
            break;     
    case "Seven" :
            seven++;
            break;  
    case "Six" :
            six++;
            break; 
    case "Five" :
            five++;
            break;  
    case "Four" :
            four++;
            break;  
    case "Three" :
            three++;
            break;  
    case "Two" :
            two++;
            break; 
    default://need a default 
    break;
    }}
    else{//other wise the none gets added
        none++;
        }
        
       
   counter++;    //for 10000 times
    
}   
//now the abvoe gets printed out for how many times it was counted
     System.out.println("Rank   freq of exactly one pair");
     System.out.println("Ace   "+ ace);
     System.out.println("King   "+ king);
     System.out.println("Queen   "+ queen);
     System.out.println("Jack   "+ jack);
     System.out.println("Ten   "+ ten);
     System.out.println("Nine   "+ nine);
     System.out.println("Eight   "+ eight);
     System.out.println("Seven   "+ seven);
     System.out.println("Six   "+ six);
     System.out.println("Five   "+ five);
     System.out.println("Four   "+ four);
     System.out.println("Three   "+ three);
     System.out.println("Two   "+ two);
     System.out.println("----------------------------");
     System.out.println("total not exactly one pair: "+ none);
       
       
    System.exit(0); //than it exits  
       return 0;// needs
   }//end method
}//end main
