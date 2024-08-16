public class Non_Static
 {
    // Non-static variables
    int num1;
    int num2;

    // Constructor to initialize non-static variables
    public Non_Static(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to calculate the sum of num1 and num2
    public int calculateSum() {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Creating an instance of AdditionExample
       Non_Static example = new Non_Static(15, 25);

        // Calculating the sum
        int sum = example.calculateSum();

        // Displaying the result
        System.out.println("The sum of " + example.num1 + " and " + example.num2 + " is: " + sum);
    }
}
