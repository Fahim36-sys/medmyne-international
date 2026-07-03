import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Please enter the second number:");
            int num2 = scanner.nextInt();
            System.out.println("You entered: " + num1 + " and " + num2 );
            // int num1 = 5;
            // int num2 = 3;
            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);
            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Product: " + (num1 * num2));
            System.out.println("Quotient: " + (num1 / num2));
        }
    }
}
