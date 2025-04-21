import java.util.Scanner;
interface Login {
    boolean authenticate(String username, String password);
}
class UserLogin implements Login {
    private final String validUsername = "admin";
    private final String validPassword = "password123";
    @Override
    public boolean authenticate(String username, String password) {
        return validUsername.equals(username) && validPassword.equals(password);
    }
}
public class LoginSystem {
    public static void main(String[] args) {
        System.out.println("NAME: P SAI LIKHITH ROLL NO: 24306 SEC: CSE-A");
        Scanner scanner = new Scanner(System.in);
        UserLogin userLogin = new UserLogin();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (userLogin.authenticate(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }
        scanner.close();
    }
}
