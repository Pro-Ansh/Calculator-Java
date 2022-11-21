import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int run = 1;
        while (run == 1) {
            System.out.println("-----Calculator-----");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st Number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter Operator: ");
            char op = sc.next().charAt(0);
            System.out.print("Enter 2nd Number: ");
            double num2 = sc.nextDouble();
            switch (op) {
                case '+':
                    System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                    break;
                case '-':
                    System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                    break;
                case '*':
                    System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.printf("%.2f / %.2f = %.2f , %.2f", num1, num2, (num1 / num2), (num1 % num2));
                    } else {
                        System.out.printf("Cannot Divide by Zero");
                    }
                    break;
                case '^':
                    System.out.printf("%.2f ^ %.2f = %.2f", num1, num2, (Math.pow(num1, num2)));
                    break;
                default:
                    System.out.printf("%C is a Invalid Operator", op);
            }
            System.out.println();
            System.out.print("Wanna Calculate Again?(1 for Yes, 0 for No):");
            run = sc.nextInt();
        }
    }
}
