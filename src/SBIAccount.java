import java.util.UUID;

public class SBIAccount implements BankInterface{
    // 1) when we use interface then first override method of interface
    // right click Generate... select Implement methods... and select all and Ok

    //2)  create private variables => so that can't be accessed by third person

    // 3) create constructor with variable which we want to take input from user

    // 4) create getter and setter function to access and update the private variable

    // 5) create constructor

    private String name;
    private String password;
    private int balance;
    private String accountNo;
    private double rateOfInterest;

    // right click -> generate -> Constructor -> select variables
    public SBIAccount(String password, String name, int balance) {
        // user will assign value to variables
        this.password = password;
        this.name = name;
        this.balance = balance;

        // bank will assign value to variables
        this. accountNo = String.valueOf(UUID.randomUUID());
        this.rateOfInterest = 7.0;
    }

    // create getter and setter function
    // right click -> Generate... -> Getter and Setter -> select variable ->


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String depositMoney(int amount) {
        return "";
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        return "";
    }

    @Override
    public double calculateInterest(int time) {
        return 0;
    }

}
