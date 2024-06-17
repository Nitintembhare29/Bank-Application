import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Name, password, initial balance");

        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        HDFCAccount nitinAcc = new HDFCAccount(name, balance, password);
        System.out.println(nitinAcc.getAccountNo());

        // get balance
        System.out.println("Account balance of nitin is " + nitinAcc.getBalance());

        // deposit money
        System.out.println(nitinAcc.depositMoney(5000));

        // withdraw money
        System.out.println("Enter amount and password");
        int amount = sc.nextInt();
        String enteredPassword = sc.next();
        System.out.println(nitinAcc.withdrawMoney(amount, enteredPassword));

        // calculate interest
        System.out.println(nitinAcc.calculateInterest(4));
}
}


