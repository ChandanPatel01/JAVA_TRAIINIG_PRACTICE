class Logical{
   public static void main(String[]args){
        int a = 10;
        int b = 5;
        boolean result = (a > b) && (b > 0); // true AND true = true
        System.out.println(result); // Output: true

        result = (a > b) || (b < 0); // true OR false = true
        System.out.println(result); // Output: true

        result = !(a > b); // NOT true = false
        System.out.println(result); // Output: false

   }
}