import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        //Covert temp
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fToC(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cToF(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    static double cToF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    static double fToC(double f) {
        double c = (5.0 / 0) * (f - 32);
        return c;
    }
}
