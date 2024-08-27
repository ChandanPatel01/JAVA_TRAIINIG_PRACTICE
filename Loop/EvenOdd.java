class EvenOdd {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 9, 7, 6, 3};
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
                System.out.print(num +" ");  // Print the even number
            } else {
                oddCount++;
            }
        }
           ///  ye hmne alag se dia only odd number show  k liye
        System.out.println("\nOdd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num +" ");  // Print the odd number
            }
        }

        System.out.println("\nTotal even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
