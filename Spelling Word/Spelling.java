import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Sandi Komando: ");
        int input = 0;
        String decodedMessage = "";
        for(int i = 0; i <= 7; i ++) {
            input = in.nextInt();
            switch(input) {
                case 1:
                decodedMessage += "A";
                break;
                case 2:
                decodedMessage += "I";
                break;
                case 3:
                decodedMessage += "E";
                break;
                case 4:
                decodedMessage += "L";
                break;
                case 5:
                decodedMessage += "V";
                break;
                case 6:
                decodedMessage += "N";
                break;
                case 7:
                decodedMessage += "R";
                break;
                default :
                System.out.println("Please enter a number 1-7 for the decode to work");
            }
        }
        in.close();
        System.out.println("Sandi Komando Benar: " +decodedMessage);
    }
}
