import java.util.Scanner;

public class Rata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[5];
        double total = 0;
        double avg = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a test scores: ");
            scores[i] = sc.nextDouble();
            total += scores[i];
        }
        avg = total / 5;
        System.out.println("The average for those test scores is: " + avg);
        scanner.close();
    }
}
