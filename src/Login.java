import java.util.Scanner;
public class Login {
    String un;
    String pass;
    public void Userinput() {
        System.out.println("Welcome to Rewards Application");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter user name :");
            un = scan.next();
            System.out.println("Enter password :");
            pass = scan.next();
        }catch (Exception e){
            System.out.println("Invalid input");
        }
    }

}



