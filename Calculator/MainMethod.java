package Calculator;

import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        String runAgain;
        Scanner input = new Scanner(System.in);


        do {
        System.out.println("Enter First Number");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number");
        int num2 = input.nextInt();

            System.out.println("What would you like to do with your numbers? Enter: 1 - Add, 2 - Subtract, 3 - Multiply, 4 - Divide");
            int choice = input.nextInt();

            Calculator calc = new Calculator(num1, num2);

            switch (choice) {
                case 1: //call function for Addition
                    System.out.println(calc.addition());
                    break;
                case 2: //call function for Subtraction
                    System.out.println(calc.subtraction());
                    break;
                case 3: //call function for Multiplication
                    System.out.println(calc.multiplication());
                    break;
                case 4: //call function for Division
                    System.out.println(calc.division());
                    break;
                default:
                    System.out.println("Please enter 1, 2, 3, or 4");
            }

            System.out.println("Do you want to continue: ");
            input.nextLine();
            runAgain = input.nextLine();

        } while(runAgain.equals("y"));
    }
}
