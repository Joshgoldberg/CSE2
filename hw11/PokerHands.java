import java.util.Scanner;//scna
public class PokerHands{//start
    public static void main(String[ ] args) {
    //main
       System.out.println("Enter 'y' or 'Y' to enter a(nother) hand");
       Scanner lol=new Scanner(System.in);//scan//
        String game = lol.nextLine();
        switch (game){//if yes
            case"Y":case"y"://f yes than it goes next
                enterhand();//method
             break;
            default:
            System.exit(0);//exit otherwise
            break;
        }
       
       
        
        
        
        
        
    }
    


public static void showOneHand(int hand[]){//start
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={//for desplaying card
       "A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ",
  	"J ","Q ","K "};
	String out="";
	for(int s=0;s<4;s++){//
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)//
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)//to have it print riht
      	out+=face[rank];//adds to what its printing
  	out+='\n';
	}
	System.out.println(out);//than it prints the hand
	
  }
  
  public static void handis(int hand[]){
	int suit[]={0,0,0,0,0};//just easier to declare this way
	int card[]={0,0,0,0,0};

    	for(int q=0;q<5;q++){//setting up suit
    	  suit[q]= hand[q]/13;}
    	for(int q=0;q<5;q++){//setting up cards
    	    if (hand[q]>=13){//different cause its easier less than 13
        card[q]= hand[q]%13;}
            else{
        card[q]= hand[q] ;      
            }
        }
     int they= exactlyOneDup(card x[]);//setting up card
     
    if(suit[0]==suit[1]==suit[2]==suit[3]==suit[4]){
        if(card[0]+card[1]+card[2]+card[3]+card[4]==63){
            System.out.println("This is a Royal Flush!")//how it prints
        }
        if((card[0]+card[1]+card[2]+card[3]+card[4])%5==0){
            System.out.println("This is a Straight Flush!")
        }
        else{System.out.println("This is a Flush!")}
    }
    else{
        if they
        
        
        
        
    }
      
	}
	

 
public static int[] enterhand(){//enter hand
    int hand[]={0,0,0,0,0};
    int k=0;
    while(k<5){
        
    System.out.println("Enter the suit:'c', 'd', 'h', or 's'");
  	Scanner hey=new Scanner(System.in);//scan/
  	int card=0;
        String no = hey.nextLine();
        switch (no){//if yes
            case"c":
                card+=0;//system as everytime it goes to 13 it resets 
               card+= cardadd();//for next suit
                hand[k]=card;
                if(k==0){k++;}
                else{
                if(hand[k]==hand[k-1]){
                    System.out.println("dont enter same card");
                }
                else{k++;}
                }
                
            break; 
            case"d":
                card+=13;
                card+= cardadd();
                hand[k]=card;
                
                if(k==0){k++;}
                else{
                if(hand[k]==hand[k-1]){
                    System.out.println("dont enter same card");
                }
                else{k++;}
                }
            break; 
            case"h":
                card+=26;
                card+= cardadd();
                hand[k]=card;
                
                if(k==0){k++;}
                else{
                if(hand[k]==hand[k-1]){
                    System.out.println("dont enter same card");
                }
                else{k++;}
                }
            break; 
            case"s":
                card+=39;
                card+= cardadd();
                hand[k]=card;
    
                if(k==0){k++;}
                else{
                if(hand[k]==hand[k-1]){
                    System.out.println("dont enter same card");
                }
                else{k++;}
                }
            break; 
            default:
            System.out.print("You did not enter a valid response");
            break;
            }
            
                }
                
                showOneHand(hand);
                handis(hand);
                return hand;
}
 public static int cardadd(){//adds the card after it has the suit,
     System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
     Scanner oh=new Scanner(System.in);//scan
     int a=0;
     int g=0;
     while(a==0){
        String foh = oh.nextLine();
        switch (foh){
        case"a":
        g=0;
        break; 
        case"2":
        g=1;
        a++;
        break;
        case"3":
        g=2;
         a++;
        break;
        case"4":
        g=3;  a++;
        break;
        case"5":
        g=4; a++;
        break;
        case"6":
        g=5; a++;
        break;
        case"7":
        g=6; a++;
        break;
        case"8":
        g=7; a++;
        break;
        case"9":
        g=8; a++;
        break;
        case"10":
        g=9; a++;
        break;
        case"j":
        g=10; a++;
        break;
        case"q":
        g=11; a++;
        break;
        case"k":
        g=12; a++;
        break;
        default:
        System.out.println("try again");
        break;
        }
         return g;
     }return g;
 
 }
 public static int exactlyOneDup(int x[]){//than this is for checking for 2 pair
       int add=0;
       for (int y=0; y<x.length; y++){
        for (int k=y+1; k<x.length; k++){
            if (x[k]==x[y]) 
            {add ++;}
        }
    }
    
    return add;
}
}