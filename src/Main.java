//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num2 < 10 || num3 < 10 || num1 > 100 || num2 > 100 || num3 > 100) {
            return false;
        }
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
            return true;

        }
        return false;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();
        if (hasSameLastDigit(num1, num2, num3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
    public boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }
}