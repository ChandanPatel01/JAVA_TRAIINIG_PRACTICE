class Min {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 9, 7, 6, 3};

        // Initialize min with the first element of the array
        int min = numbers[0];

        // Iterate through the array using a for-each loop
        for (int num : numbers) {
            // If the current element is less than min, update min
            if (num < min) {
                min = num;
            }
        }

        // Print the minimum value
        System.out.println("Min Number is: " + min);
    }
}
