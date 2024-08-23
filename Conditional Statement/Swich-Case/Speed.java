import java.util.Scanner;
public class Speed {

   public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
	  System.out.print("Enter Your Speed brooooo: "); 
	  int speed = sc.nextInt();

      switch(speed) {
         case 80 :
            System.out.println("YOU can go Home "); 
            break;
         case 120 :
		 System.out.println("Chance  for  back to home"); 
            break;
         case 150 :
            System.out.println(" Little Bit back to  Home");
            break;
         case 200 :
            System.out.println("Yamraj is back on earth For You !!!");
            System.out.println("TATA BYE BYE KHATAM");
         default :
            System.out.println("SPEED OVER LOAD");
      }
     
   }
}