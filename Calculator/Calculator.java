package Calculator;

public class Calculator {

    public int num1;
    public int num2;


    public Calculator(int num1) {
        this.num1 = num1;
    }
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition() {
        System.out.printf("%d + %d = ",num1, num2);
        return num1+num2;

    }

    public int subtraction() {
        System.out.printf("%d - %d = ",num1, num2);
        return num1-num2;
    }

    public int multiplication() {
        System.out.printf("%d * %d = ",num1, num2);
        return num1*num2;
    }

    public int division() {
        System.out.printf("%d / %d = ",num1, num2);
        return num1/num2;
    }

    public int square() {
        System.out.printf("%d squared = ", num1);
        return num1*num1;
    }

    public int factorial() {
        int total = 1;
        for (int i = 1; i <= num1; i++) {
            total *= i;
            if (i < num1) {
                System.out.print(i + " x ");
            }
        }
        System.out.printf("%d's factorial = ", num1);
        return total;
    }

    public double sine() {
        System.out.printf("Angle %d's sine  = ", num1);
        return Math.sin(num1);
    }

    public double cosine() {
        System.out.printf("Angle %d's cosine = ", num1);
        return Math.cos(num1);
    }

    public double tangent() {
        System.out.printf("Angle %d's tangent = ", num1);
        return Math.tan(num1);
    }
}
