package activity1;
import java.util.Scanner;

public class RouteFinder{
	   Scanner sc = new Scanner(System.in);
	   String route1[] = {"Minglanilla", "San Fernando", "Carcar", "Barili", "Dumanjug", "Alcantra"};
	   String route2[] = {"Minglanilla", "San Fernando", "Carcar", "Sibonga", "Dumanjug", "Alcantra"};
	   String route3[] = {"Minglanilla", "San Fernando", "Carcar", "Sibonga", "Argao", "Ronda", "Alcantra"};
	   double barili = 85, dumanjug = 94, argao = 105;
   public static void main(String[]args){
      RouteFinder object = new RouteFinder();
      String choice;
      System.out.println("Welcome User!");
      System.out.println("Is Barili blocked?");
      choice = object.sc.nextLine();
      if(choice.equalsIgnoreCase("yes")){
         System.out.println("Is Dumanjug? blocked?");
         choice = object.sc.nextLine();
         if(choice.equalsIgnoreCase("yes")){
           int val = 3;
            object.pickRoute(object.argao,val );
         }
         else {
            int val = 2;
            object.pickRoute(object.dumanjug,val );
         }
      }
      else{
         int val = 1;
          object.pickRoute(object.barili,val );
          
      }
      
   }
      
   public double calculateETA(double speed, double distance){
      double result = distance/speed;
      return result;
   }
   
   public void pickRoute(double distance, int val){
       double result;
       System.out.println("Enter speed: ");
       double speed = sc.nextDouble();
       switch(val){
         case 1:
        	 result = calculateETA(speed,barili);
        	 display(result, val, speed, distance);
        	 break;
         case 2:
             result = calculateETA(speed,dumanjug);
             display(result, val, speed, distance);
             break;
         case 3:
             result = calculateETA(speed,argao);
             display(result, val, speed, distance);
             break;
      }
   }
   
   public void display(double result, int val, double speed, double distance){
      switch(val){
         case 1:
            System.out.println("RECOMMENDED ROUTE:\nCebu city(South Bus) -  Start\n");
            for(String s: route1){
               System.out.println(s);         
            }
            System.out.println("Moalboal - End");
            System.out.println("Speed: " + speed + "\nDistance: " + distance + "\nETA: " + result);
            break;
            
          case 2:
            System.out.println("RECOMMENDED ROUTE:\nCebu city(South Bus) -  Start\n");
            for(String s: route2){
               System.out.println(s);         
            }
            System.out.println("Moalboal - End");
            System.out.printf("Speed: " , speed , "\nDistance: " , distance , "\nETA: " , result);
            break;
            
          case 3:
            System.out.println("RECOMMENDED ROUTE:\nCebu city(South Bus) -  Start\n");
            for(String s: route3){
               System.out.println(s);         
            }
            System.out.println("Moalboal - End");
            System.out.printf("Speed: " , speed , "\nDistance: " , distance , "\nETA: " , result);
            break;                 
      }
   }
}
