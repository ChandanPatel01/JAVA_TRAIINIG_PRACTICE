import java.util.Scanner;
public class Grade {

   public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
	  System.out.print("Enter Your Grade: "); 
       char grade = sc.next().charAt(0);

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}