class ArraySwapChar {
    public static void main(String[] args) {
        char[] numbers = {'A', 'B', 'C', 'D', 'E', 'F'};
        
        int start = 0;  // Start index of the array
        int end = numbers.length - 1;  // End index of the array
        
        // Print original array
        System.out.print("Original Characters Array:");
        for (char num : numbers) {
            System.out.print(" " + num);
        }
        System.out.println();
        
        // Reverse the array
        while (start < end) {
            // Swap characters at start and end indices
            char temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            
            // Move indices towards the center
            start++;
            end--;
        }
        
        // Print reversed array
        System.out.print("Reversed Characters Array:");
        for (char num : numbers) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}
