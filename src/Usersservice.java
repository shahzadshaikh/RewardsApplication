import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
class InvalidCustomerException extends Exception
{
    public InvalidCustomerException(String msg)
    {
        super(msg);
    }
}
public class Usersservice {
    String un;
    String pass;
    Users[] users = new Users[100];
    int id;
    String username;
    String password;
    int points;
    int balance;

    public Usersservice() {
        users[0] = new Users(1, "Shahzad", "1234", 1000);
        users[1] = new Users(2, "Shaikh", "1234", 1000);
        users[2] = new Users(3, "Rahul", "1234", 1000);
        users[3] = new Users(4, "Abdul", "1234", 1000);
        users[4] = new Users(5, "Rahman", "1234", 1000);
        users[5] = new Users(6, "Khan", "1234", 1000);
        users[6] = new Users(7, "Mohammad", "1234", 1000);
        users[7] = new Users(8, "Junaid", "1234", 1000);
        users[8] = new Users(9, "Zama", "1234", 1000);
        users[9] = new Users(10, "Yausuf", "1234", 1000);
        users[10] = new Users(11, "Pathan", "1234", 1000);
        users[11] = new Users(12, "Sharma", "1234", 1000);
        users[12] = new Users(13, "Rohit", "1234", 1000);
        users[13] = new Users(14, "abc", "1234", 1000);
        users[14] = new Users(15, "Dfgv", "1234", 1000);
        users[15] = new Users(16, "qwer", "1234", 1000);
        users[16] = new Users(17, "Shahzad", "1234", 1000);
        users[17] = new Users(18, "asdf", "1234", 1000);
        users[18] = new Users(19, "zxcv", "1234", 1000);
        users[19] = new Users(20, "asdfg", "1234", 1000);
        users[20] = new Users(21, "zyz", "1234", 1000);
        users[21] = new Users(22, "cftg", "1234", 1000);
        users[22] = new Users(23, "vghj", "1234", 1000);
        users[23] = new Users(24, "bhjk", "1234", 1000);
        users[24] = new Users(25, "qwedf", "1234", 1000);
        users[25] = new Users(26, "zsdf", "1234", 1000);
        users[26] = new Users(27, "user1", "1234", 1000);
        users[27] = new Users(28, "user2", "1234", 1000);
        users[28] = new Users(29, "user3", "1234", 1000);
        users[29] = new Users(30, "user4", "1234", 1000);
        users[30] = new Users(31, "user5", "1234", 1000);
        users[31] = new Users(32, "user6", "1234", 1000);
        users[32] = new Users(33, "user7", "1234", 1000);
        users[33] = new Users(34, "user8", "1234", 1000);
        users[34] = new Users(35, "user9", "1234", 1000);
        users[35] = new Users(36, "user10", "1234", 1000);
        users[36] = new Users(37, "user11", "1234", 1000);
        users[37] = new Users(38, "user12", "1234", 1000);
        users[38] = new Users(39, "user13", "1234", 1000);
        users[39] = new Users(40, "user14", "1234", 1000);
        users[40] = new Users(41, "user15", "1234", 1000);
        users[41] = new Users(42, "user16", "1234", 1000);
        users[42] = new Users(43, "user17", "1234", 1000);
        users[43] = new Users(44, "user18", "1234", 1000);
        users[44] = new Users(45, "user19", "1234", 1000);
        users[45] = new Users(46, "user20", "1234", 1000);
        users[46] = new Users(47, "user21", "1234", 1000);
        users[47] = new Users(48, "user22", "1234", 1000);
        users[48] = new Users(49, "user23", "1234", 1000);
        users[49] = new Users(50, "user25", "1234", 1000);
        users[50] = new Users(51, "user26", "1234", 1000);
        users[51] = new Users(52, "user", "1234", 1000);
        users[52] = new Users(53, "user", "1234", 1000);
        users[53] = new Users(54, "user", "1234", 1000);
        users[54] = new Users(55, "user", "1234", 1000);
        users[55] = new Users(56, "user", "1234", 1000);
        users[56] = new Users(57, "user", "1234", 1000);
        users[57] = new Users(58, "user", "1234", 1000);
        users[58] = new Users(59, "user", "1234", 1000);
        users[59] = new Users(60, "user", "1234", 1000);
        users[60] = new Users(61, "user", "1234", 1000);
        users[61] = new Users(62, "user", "1234", 1000);
        users[62] = new Users(63, "user", "1234", 1000);
        users[63] = new Users(64, "user", "1234", 1000);
        users[64] = new Users(65, "user", "1234", 1000);
        users[65] = new Users(66, "user", "1234", 1000);
        users[66] = new Users(67, "user", "1234", 1000);
        users[67] = new Users(68, "user", "1234", 1000);
        users[68] = new Users(69, "user", "1234", 1000);
        users[69] = new Users(70, "user", "1234", 1000);
        users[70] = new Users(71, "user", "1234", 1000);
        users[71] = new Users(72, "user", "1234", 1000);
        users[72] = new Users(73, "user", "1234", 1000);
        users[73] = new Users(74, "user", "1234", 1000);
        users[74] = new Users(75, "user", "1234", 1000);
        users[75] = new Users(76, "user", "1234", 1000);
        users[76] = new Users(77, "user", "1234", 1000);
        users[77] = new Users(78, "user", "1234", 1000);
        users[78] = new Users(79, "user", "1234", 1000);
        users[79] = new Users(80, "user", "1234", 1000);
        users[80] = new Users(81, "user", "1234", 1000);
        users[81] = new Users(82, "user", "1234", 1000);
        users[82] = new Users(83, "user", "1234", 1000);
        users[83] = new Users(84, "user", "1234", 1000);
        users[84] = new Users(85, "user", "1234", 1000);
        users[85] = new Users(86, "user", "1234", 1000);
        users[86] = new Users(87, "user", "1234", 1000);
        users[87] = new Users(88, "user", "1234", 1000);
        users[88] = new Users(89, "user", "1234", 1000);
        users[89] = new Users(90, "user", "1234", 1000);
        users[90] = new Users(91, "user", "1234", 1000);
        users[91] = new Users(92, "user", "1234", 1000);
        users[92] = new Users(93, "user", "1234", 1000);
        users[93] = new Users(94, "user", "1234", 1000);
        users[94] = new Users(95, "user", "1234", 1000);
        users[95] = new Users(96, "user", "1234", 1000);
        users[96] = new Users(97, "user", "1234", 1000);
        users[97] = new Users(98, "user", "1234", 1000);
        users[98] = new Users(99, "user", "1234", 1000);
        users[99] = new Users(100, "user", "1234", 1000);
    }
    static {
        System.out.println("Welcome to rewards spplication");
        System.out.println("Offer on every 100/- spend you will get 1 point as reward");
        System.out.println("With this reward, you able to purchase items");
    }

    public void Userinput() {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter user name :");
            un = scan.next();
            System.out.println("Enter password :");
            pass = scan.next();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
    public void Verify() throws InvalidCustomerException {
        for (Users u : users) {
            id = u.getId();
            username = u.getName();
            password = u.getPassword();
            points = u.getPoints();
            if (un.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)) {
                Accountbalance();
            }
        }
        InvalidCustomerException ice = new InvalidCustomerException("Invalid credentials try again !!");
        System.out.println(ice.getMessage());
        throw ice;
    }


    public void Accountbalance() {
        balance = points * 100;
        System.out.println("You have account balanced is :" + balance + " rs");
        System.out.println("Rewards points are :" + points);
        System.out.println("Want to purchase or redeem the points :");
        System.out.println("1. For purchase. or 2. For redeem the points. or 3. For quite.");
        try {
            Scanner scan = new Scanner(System.in);
            int sel = scan.nextInt();
            if (sel == 1) {
                Purchase();
            } else if(sel==2) {
                Redeem();
            }else{
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("Invalid input !!");
        }
    }

    public void Purchase() {
        try {
            System.out.println("Happy shopping!!");
            System.out.println("1. for Headphones 2,00,000/ rs 2. for t-shirt 20,000 rs 3. for travels 1000/ rs");
            Scanner scan = new Scanner(System.in);
            int sel = scan.nextInt();
            if (sel == 1 && balance >= 200000) {
                System.out.println("Purchased");
                points = points + (200000 / 100);
                balance = balance - 200000;
                System.out.println("You have account balanced is :" + balance);
                System.out.println("Ponts earned :" + points);
            } else if (sel == 2 && balance >= 20000) {
                System.out.println("Purchased");
                points = points + (20000 / 100);
                balance = balance - 20000;
                System.out.println("You have account balanced is :" + balance);
                System.out.println("Ponts earned :" + points);

            } else if (sel == 3 && balance >= 1000) {
                System.out.println("Purchased");
                points = points + (1000 / 100);
                balance = balance - 1000;
                System.out.println("You have account balanced is :" + balance);
                System.out.println("Ponts earned :" + points);

            } else {
                System.out.println("Insufficient balanced.");
            }
            Purchase1();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    public void Redeem() {
        try {
            System.out.println("Select rewards items for redeem the points :");
            System.out.println("1. for Headphone - 2000 points 2. Phone - 200 points 3. Amazone coupon - 100 points 4. Make my trip card - 50 points");
            Scanner scan = new Scanner(System.in);
            int sel = scan.nextInt();
            if (sel == 1 && points >= 2000) {
                System.out.println("Rewarded");
                points = points - 2000;
                System.out.println("You'r points are " + points);
            } else if (sel == 2 && points >= 200) {
                System.out.println("Rewarded");
                points = points - 200;
                System.out.println("You'r points are " + points);
            } else if (sel == 3 && points >= 100) {
                System.out.println("Rewarded");
                points = points - 100;
                System.out.println("You'r points are " + points);
            } else if (sel == 4 && points >= 50) {
                System.out.println("Rewarded");
                points = points - 50;
                System.out.println("You'r points are " + points);
            } else {
                System.out.println("Insufficient balanced.");
            }
            Redeem1();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    public void Purchase1() {
        try {
            System.out.println("Want to purchase more or quite");
            System.out.println("1 for continue or 2 for redeem or 3 for quite");
            Scanner scan = new Scanner(System.in);
            int sel = scan.nextInt();
            if (sel == 1) {
                Purchase();
            }else if(sel == 2){
                Redeem();
            }
            else {
                System.out.println("Thanks for shopping !!!");
                Accountbalance();
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    public void Redeem1() {
        try {
            System.out.println("Want to redeem more or quite");
            System.out.println("1. For continue or 2. For purchase or 3. For quite");
            Scanner scan = new Scanner(System.in);
            int sel = scan.nextInt();
            if (sel == 1) {
                Redeem();
            } else if(sel==2){
                Purchase();
            }else {
                System.out.println("Thanks for redeeming !!!");
                Accountbalance();
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}

class Login1{
    public void initiate(){
        Usersservice us = new Usersservice();
        try{
            us.Userinput();
            us.Verify();
        }catch (InvalidCustomerException ic){
            try{
                us.Userinput();
                us.Verify();
            }catch (InvalidCustomerException ice){
                try{
                    us.Userinput();
                    us.Verify();
                }catch (InvalidCustomerException i){
                    System.out.println("You'r BLOCKED");
                    System.exit(0);
                }
            }
        }
    }
}
