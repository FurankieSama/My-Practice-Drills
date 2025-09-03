import java.util.Scanner;

public class FizzBuzz {
    // This is a simple fizzBuzz application
    // It collects a number between 1 and 100.
    // If the number is divisible by three, it should print Fizz
    // If the number is divisible by five, it should print Buzz.
    // If the number is divisible by both three and 5 it should print Fizzbuzz
    // Else print the number

    public static void main(String[] args) {
        // Collect number
        Scanner input = new Scanner(System.in);
        // Make sure that only numbers that are within the range apply
        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        do {
            System.out.print("Enter number: ");
            number = input.nextInt();
        } while (number < 0 && number > 100);

        // Check fizzbuzz
        if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 15 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(number);
        }
    }
}