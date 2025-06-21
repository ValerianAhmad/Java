import java.util.Scanner;

public class UserLogin {
    @SuppressWarnings("unused")
    private static final String USERNAME = "admin";
    private static String username = "password";

    public UserLogin() {

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputpassword = scanner.nextLine();

        if (authenticate (username, inputpassword)) {
            System.out.println("Login berhasil!");
            System.out.println("Welcome, " + username);
        } else {
            System.out.println("Login gagal!");
            System.out.println("Username atau password anda salah!");
        }
        scanner.close();
    }
    private static boolean authenticate(String username2, String inputpassword) {
        return false;
    }
}