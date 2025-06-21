import java.util.Scanner;

public class MatrixProgram {
    public static void main(String[] args) {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int choice;
        Scanner reader = new Scanner(System.in);
        do {
            menu();
            choice = reader.nextInt();
            switch (choice) {
                case 1:
                    enterMatrix(A);
                    break;
                case 2:
                    enterMatrix(B);
                    break;
                case 3:
                    add(A,B);
                    break;
                case 4:
                    subtract(A,B);
                    break;
                case 5:
                    multiply(A,B);
                    break;
                case 6:
                    break;
            }
        } while (choice !=6);
        reader.close();
    }

    public static void menu() {
        System.out.println("1. Enter Matrix A");
        System.out.println("2. Enter Matrix B");
        System.out.println("3. Add A and B");
        System.out.println("4. Subtract B from A");
        System.out.println("5. Multiply A and B");
        System.out.println("6. Exit");
    }

    public static void enterMatrix(int[][] a) {
        @SuppressWarnings("resource")
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the element in first row and first column: ");
        a[0][0] = reader.nextInt();
        System.out.println("Enter the element in first row and second column: ");
        a[0][1] = reader.nextInt();
        System.out.println("Enter the element in second row and first column: ");
        a[1][0] = reader.nextInt();
        System.out.println("Enter the element in second row and second column: ");
        a[1][1] = reader.nextInt();
    }
    
    public static void add(int[][] a, int[][] b) {
        System.out.println("A + B is");
        System.out.println((a[0][0] + b[0][0]) + "\t" + (a[0][1] + b[0][1]));
        System.out.println((a[1][0] + b[1][0]) + "\t" + (a[1][1] + b[1][1]));
    }
    
    public static void subtract(int[][] a, int[][] b) {
        System.out.println("A + B is");
        System.out.println((a[0][0] + b[0][0]) + "\t" + (a[0][1] + b[0][1]));
        System.out.println((a[1][0] + b[1][0]) + "\t" + (a[1][1] + b[1][1]));
    }

    public static void multiply(int[][] a, int[][] b) {
        System.out.println("A + B is");
        System.out.println((a[0][0] + b[0][0]) + "\t" + (a[0][1] + b[0][1]));
        System.out.println((a[1][0] + b[1][0]) + "\t" + (a[1][1] + b[1][1]));
    }
}
