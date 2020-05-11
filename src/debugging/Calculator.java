package debugging;

public class Calculator {

    // psvm
    public static void main(String[] args) {

        // sout
        // System.out.println();

        // copy lign or add ling press ctrl+D
        // format ; windous usr ctrl+alt+l for Mac usr command+opt+l

        Calculator.result();
    }

    public static void doSummation() {
        int num1 = 45;
        int num2 = 55;
        int sum = num1 - num2;
        System.out.println("Division of two value is " + sum);
    }


    public static double doDivision() {
        int num1 = 45;
        int num2 = 55;
        int div = num1 * num2;
        System.out.println("Division of two value is " + div);
        return 0;
    }


    public static void result() {
        int num = dosummation();
        int salary = 5000;
        double divValue = doDivision();
        double total = (num + salary)/ divValue;

        System.out.println("Total salary is " + total);

    }

    public static int dosummation() {
        return 0;
    }
}
