package Calculator;

import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        String runAgain;
        Scanner input = new Scanner(System.in);


        do {

            System.out.println("What would you like to do?\nEnter: 1 - Add, 2 - Subtract, 3 - Multiply, 4 - Divide, " +
                               "5 - Square, 6 - Factorial, 7 - Sine, 8 - Cosine, 9 - Tangent");
            int choice = input.nextInt();


            switch (choice) {
                case 1: //call function for Addition
                    System.out.println("Enter first number");
                    int add1 = input.nextInt();

                    System.out.println("Enter second number");
                    int add2 = input.nextInt();

                    Calculator addCalc = new Calculator(add1, add2);

                    System.out.println(addCalc.addition());
                    break;
                case 2: //call function for Subtraction
                    System.out.println("Enter first number");
                    int sub1 = input.nextInt();

                    System.out.println("Enter second number");
                    int sub2 = input.nextInt();

                    Calculator subCalc = new Calculator(sub1, sub2);
                    System.out.println(subCalc.subtraction());
                    break;
                case 3: //call function for Multiplication
                    System.out.println("Enter first number");
                    int mul1 = input.nextInt();

                    System.out.println("Enter second number");
                    int mul2 = input.nextInt();

                    Calculator mulCalc = new Calculator(mul1, mul2);
                    System.out.println(mulCalc.multiplication());
                    break;
                case 4: //call function for Division
                    System.out.println("Enter first number");
                    int div1 = input.nextInt();

                    System.out.println("Enter second number");
                    int div2 = input.nextInt();

                    Calculator divCalc = new Calculator(div1, div2);
                    System.out.println(divCalc.division());
                    break;
                case 5: //call function for Square
                    System.out.println("Enter the number to be squared");
                    int squ1 = input.nextInt();

                    Calculator squCalc = new Calculator(squ1);
                    System.out.println(squCalc.square());
                    break;
                case 6: //call for factorial
                    System.out.println("Enter number to see its factorial");
                    int fac1 = input.nextInt();

                    Calculator facCalc = new Calculator(fac1);
                    System.out.println(facCalc.factorial());
                    break;
                case 7: //call for sine
                    System.out.println("Enter angle to have its sine calculated");
                    int sin1 = input.nextInt();

                    Calculator sinCalc = new Calculator(sin1);
                    System.out.println(sinCalc.sine());
                    break;
                case 8: //call for cosine
                    System.out.println("Enter angle to have its sine calculated");
                    int cos1 = input.nextInt();

                    Calculator cosCalc = new Calculator(cos1);
                    System.out.println(cosCalc.cosine());
                    break;
                case 9: //call for tangent
                    System.out.println("Enter angle to have its sine calculated");
                    int tan1 = input.nextInt();

                    Calculator tanCalc = new Calculator(tan1);
                    System.out.println(tanCalc.tangent());
                    break;
                default:
                    System.out.println("Please enter 1-9");
            }

            System.out.println("Do you want to continue: ");
            input.nextLine();
            runAgain = input.nextLine();

        }   while(runAgain.equals("y"));
    }
}
