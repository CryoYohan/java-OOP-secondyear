package activity1;
import java.util.*;

public class Act4 {
   static boolean running =false;
   //FIRST REMAINDER METHOD
   public static void getRemainder (int firstNum, int secondNum) {
      int result = (firstNum -secondNum*(firstNum/ secondNum) );
      System.out.println("Remainder of " + firstNum + " and " + secondNum + " is " + result);
      running = false;
   }
   
   //SECOND CHECKVOTE METHOD
   public static void CheckVote (int age) {
      if (age >= 18){
      System.out.println("Qualified to vote");
      } else {
      System.out.println("NOT Qualified to vote");
      }
   }
   
   //MAIN METHOD
   public static void main (String[]args) {
      do{ 
    	  Scanner con = new Scanner(System.in);
    	  System.out.println("Enter two integer numbers:");
    	  int firstNum = con.nextInt();
    	  int secondNum = con.nextInt();
    	  if(firstNum> secondNum)
    		  getRemainder(firstNum, secondNum);
    	  else
    		  running = true;
 
      }while (running== true);
      
      //maiAge qualifier
      System.out.println();
      System.out.println("Enter age: ");
      CheckVote(new Scanner(System.in).nextInt());
   }
}
