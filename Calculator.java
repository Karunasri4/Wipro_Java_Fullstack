import java.util.*;

public class Calculator {
    static void powerInt(int num1, int num2) {
        System.out.println(Math.pow(num1, num2));
    }

    static void powerDouble(double num1, int num2) {
        System.out.println(Math.pow(num1, num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter exponent: ");
        double num2 = sc.nextDouble();

        powerInt((int) num1, (int) num2);      
        powerDouble(num1, (int) num2);         

        
    }
}
