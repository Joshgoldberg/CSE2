// Joshua Goldberg, septermber 4th
//class is CSE2
//program should be counting and printing the number of minutes, counts distance in miles and of the two trops

//starting with public class







public class Cyclometer{
     //main method like always
    public static void main(String [] args){
        
         //making variables
        
        int secsTrip1=480; // for using the minutes ina trip
        int secsTrip2=3220; //same but for the second
        int countsTrip1=1561; // for whatever counts are 
        int countsTrip2=9037; //  same as above but for the second
         
                double wheelDiameter=27.0,//calculating 
                PI=3.14159, //pi for calculating distance
                feetPerMile=5280, //used to calcualte total amount of miles
                inchesPerFoot=12, // used in calcalating the distance
                secondsPerMinute=60; //used for calcualting the total time
                
                
                    
                    double distanceTrip1, distanceTrip2,totalDistance;
                    
                     // presumably for finding the end result 
                     
                     
                System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                countsTrip1+" counts.");
                System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                countsTrip2+" counts.");
                distanceTrip1=countsTrip1*wheelDiameter*PI;
                    // this is priting out the calculations of the difference of seconds to minutes
                                // and is showing us the time we spent on each and both together
               
               
               
                distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
                distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
                totalDistance=distanceTrip1+distanceTrip2;
                 //this does it for the second trip into miles
                  //this adds the two together
                  
                  
                            // so now we have calculated the vairbales for the distance above
                            //the below prints out the new variables for us to see
                
                System.out.println("Trip 1 was "+distanceTrip1+" miles");
                System.out.println("Trip 2 was "+distanceTrip2+" miles");
                System.out.println("The total distance was "+totalDistance+" miles");
      }
 }