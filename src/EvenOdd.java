import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int Even_Num1 = 2;
        int Even_Num2 = 4;
        int Even_Num3 = 6;
        int Even_Num4 = 8;

        int Odd_Num1 = 1;
        int Odd_Num2 = 3;
        int Odd_Num3 = 5;
        int Odd_Num4 = 9;

        System.out.println("Digit a number from 1 to 9: ");
        int number = userInput.nextInt();

        if (number == Even_Num1) {
            System.out.println("The " + Even_Num1 + " is an Even number!");
        } else if (number == Even_Num2) {
            System.out.println("The " + Even_Num2 + " is an Even number!");
        } else if (number == Even_Num3) {
            System.out.println("The " + Even_Num3 + " is an Even number!");
        } else if (number == Even_Num4) {
            System.out.println("The " + Even_Num4 + " is an Even number!");
        } else if (number == Odd_Num1) {
            System.out.println("The " + Odd_Num1 + " is an Odd number!");
        } else if (number == Odd_Num2) {
            System.out.println("The " + Odd_Num2 + " is an Odd number!");
        } else if (number == Odd_Num3) {
            System.out.println("The " + Odd_Num3 + " is an Odd number!");
        } else if (number == Odd_Num4) {
            System.out.println("The " + Odd_Num4 + " is an Odd number!");
        } else {
            System.out.println("It is something else ");
        }


    }
}
