import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = 0, num2 = 0, answer = 0;
        char operator = ' ';
        String line ="";
        
        System.out.print("Enter a Double: ");
        num1 = scan.nextDouble();

        System.out.print("Enter another Double: ");
        num2 = scan.nextDouble();

        System.out.print("Enter an operator: ");
        line = scan.next();

        operator = line.charAt(0);
        switch (operator) {
            case '*' :
                answer = num1 * num2;
                break;

            case '/' :
                answer = num1 / num2;
                break;

            case '-' :
                answer = num1 - num2;
                break;

            case '+' :
                answer = num1 + num2;
                break;

            case '%' :
            answer = num1 % num2;
            break;

            default:
            System.out.println("Invalid Operator");
            System.exit(1);
        }
        System.out.println("Answer: " + answer);
        scan.close();
    }
}
