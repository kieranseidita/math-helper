import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        //Create a Scanner object to take in input such as your name and the math operation you want to do
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Welcome to the Math Helper created by Kieran Seidita. This program will help you do your math homework.");

        //Create a menu for the user to select math operations
        boolean menu = true;
        while(menu){
        System.out.println("====Menu====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Prime Number Checker");
        System.out.println("7. Factorial");
        System.out.println("8. Even/Odd Checker");
        System.out.println("9. Sine/Cosine/Tangent");
        System.out.println("10. Exit");
        System.out.println("PLease select a numbers for one of the following options: ");

        //Take in the user's choice
        int option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Enter the first number: ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int num2 = sc.nextInt();
                    System.out.println("The sum of the two numbers is " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    int num3 = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int num4 = sc.nextInt();
                    System.out.println("The sum of the two numbers is " + sub(num3, num4));
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    int num5 = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int num6 = sc.nextInt();
                    System.out.println("The sum of the two numbers is " + mult(num5, num6));
                    break;
                case 4:
                System.out.println("Enter the first number: ");
                int num7 = sc.nextInt();
                System.out.println("Enter the second number: ");
                int num8 = sc.nextInt();
                System.out.println("The quotient of the two numbers is " + div(num7, num8));
                break;
                case 5:
                System.out.println("Enter the number: ");
                int n = sc.nextInt();
                System.out.println("The square root of the number is " + sqrt(n));
                break;
                case 6:
                System.out.println("Enter the number: ");
                int m = sc.nextInt();
                isPrime(m);
                break;
                case 7:
                System.out.println("Enter the number: ");
                int o = sc.nextInt();
                System.out.println("The factorial of " + o + " is " + factorial(o));
                break;
                case 8:
                System.out.println("Enter the number: ");
                int p = sc.nextInt();
                evenOrOdd(p);
                break;
                case 9:
                System.out.println("Enter the number: ");
                double t = sc.nextDouble();
                trig(t);
                break;
                case 10:
                System.out.println("Goodbye " + name + "!");
                menu = false;
                break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        }

            sc.close();
    }

    //Create an addition method 
    public static int add(int a, int b){
        return a + b;
    }

    //Create an subtraction method
    public static int sub(int a, int b){
        return a - b;
    }

    //Create an multlplication method
    public static int mult(int a, int b){
        return a * b;
    }

    //Create an division method
    public static int div(int a, int b){
        return a / b;
    }

    //Create a square root method
    public static int sqrt(int a){
        return Math.sqrt(a);
    }

    //Create a prime number checker method
    public static void isPrime(int c){
        for(int i = 2; i < Math.sqrt(c); i++){
            if(c % i == 0){
                System.out.println(c + " is not a prime number.");
            }
            else{
                System.out.println(c + " is a prime number.");
            }
        }
    }

    //Create a factorial method
    public static int factorial(int a){
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact *= i;
        }
        return fact;
    }

    //Create an even/odd checker method
    public static void evenOrOdd(int a){
        if(a % 2 == 0){
            System.out.println(a + " is an even number.");
        }
        else{
            System.out.println(a + " is an odd number.");
        }
    }

    //Create a sine/cosine/tangent method
    public static void trig(double a){
        System.out.println("Please select an option:");
        boolean trig = true;
        while(trig){
            System.out.println("1. Sine");
            System.out.println("2. Cosine");
            System.out.println("3. Tangent");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();


            switch(choice){
                case 1:
                System.out.println("The sine of " + a + " is " + Math.sin(a));
                break;
                case 2:
                System.out.println("The sine of " + a + " is " + Math.cos(a));
                break;
                case 3:
                System.out.println("The sine of " + a + " is " + Math.tan(a));
                break;
                case 4:
                trig = false;
                break;
                default:
                System.out.println("Invalid option. Please try again.");
                break;
            }
        }
    }
}
