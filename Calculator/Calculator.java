package Calculator;

public class Calculator {

    public int num1;
    public int num2;
    public int choice;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.choice = choice;
    }

    public void addition() {
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }

    public void subtraction() {
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }

    public void multiplication() {
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    }

    public void division() {
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }
}
