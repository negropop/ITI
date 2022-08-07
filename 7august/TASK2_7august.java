import java.util.Scanner;

class FactorialTask2 {
    public static void main(String args[]) {
        int i, fact = 1;
        System.out.println("Enter Number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();// It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
