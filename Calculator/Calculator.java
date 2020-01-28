package Calculator;

public class Calculator {

    public int num1;
    public int num2;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition() {
        System.out.printf("%s + %s = ",num1, num2);
        return num1+num2;

    }

    public int subtraction() {
        System.out.printf("%s - %s = ",num1, num2);
        return num1-num2;
    }

    public int multiplication() {
        System.out.printf("%s * %s = ",num1, num2);
        return num1*num2;
    }

    public int division() {
        System.out.printf("%s / %s = ",num1, num2);
        return num1/num2;
    }
}
