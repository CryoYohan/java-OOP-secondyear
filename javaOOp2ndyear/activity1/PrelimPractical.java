package activity1;
import java.util.Scanner;
public class PrelimPractical { 
   //FIRST METHOD 
   public static void checkPassword (String password) {
      int passwordLength = 10 ;
      boolean hasLowerLetter = false;
      boolean hasUpperLetter = false;
      boolean hasNumber = false;
      boolean hasSpecial = false;
      char ch;
      //Password length
      if (password.length()< passwordLength) 
         System.out.println("NOT A STRONG PASSWORD");
      else {
      //PASSWORD LETTER & NUMBER 
         for (int i=0; i<password.length(); i++) {
           ch = password.charAt(i);
            if(ch >= '0' && ch <= '9')
               hasNumber = true; 
            else if (ch>= 'a' && ch<= 'z')
               hasLowerLetter = true;
            else if(ch>= 'A' && ch<='Z')
            	hasUpperLetter = true;
            else
            	hasSpecial = true;
         }
      }   
     if (hasNumber && hasUpperLetter && hasSpecial) {
      System.out.println("STRONG PASSWORD");
     } else {
      System.out.println("NOT A STRONG PASSWORD");
     }
      
   }
   //SECOND METHOD
   public static void countCharacters (String word) {
       int lowerCase=0;
       int upperCase=0;
       char ch;
       int numbers = 0;
          
       for(int i = 0; i < word.length(); i++) {
    	   ch = word.charAt(i);
    	   if(ch >= 'a' && ch <='z')
    		  lowerCase++;
    	   else if(ch>='A' && ch<='Z')
    		   upperCase++;
    	   else if( (ch >='0' && ch <= '9'))
    		 numbers++;

       }      
      System.out.println("LowerCase Letters: " + lowerCase + "\nUpperCase Letters: " + upperCase + "\n\nNumbers: " + numbers);
   }
   //MAIN METHOD
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        System.out.print("Please enter a Password: ");  
        String password = input.nextLine();  
        checkPassword (password);
        
        //Second Method Main
        System.out.println();  
        System.out.print("Please enter a word: ");  
        String word = input.nextLine();  
        countCharacters (word);
    }  

}