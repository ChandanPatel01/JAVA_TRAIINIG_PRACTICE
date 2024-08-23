import java.util.Scanner;

class Atm {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("<<Welcome To HDFC Bank>>");
      System.out.println("Please Enter Your Card ");
      System.out.print("Please Enter Your Pin: ");
      
      int atmpin = sc.nextInt();
      int user_ID = 2002;
      
      if (user_ID == atmpin) {
         System.out.println("Welcome: Chandan");
         System.out.println("Your Balance is: 1202883.36");
      } else {
         System.out.println("Incorrect PIN. Please try again.");
      }

      //sc.close();
   }
}
