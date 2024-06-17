import java.util.UUID;

public class HDFCAccount implements BankInterface{

    // first set properties
    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rateOfInterest;


    // second create constructor with properties which are used to create object
    public HDFCAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        // assign variable
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
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

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }


    @Override
    public int getBalance() {
        return balance;
    }


    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Your account is credited with " + amount + " updated balance is " + balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(enteredPassword.equals(this.password)){
            if(this.balance < amount){
                return "Insufficient balance";
            }
            else{
                this.balance -= amount;
                return "Rs." + amount + " deducted and updated balance is " + this.balance;
            }
        }else{
            return "Entered password is incorrect";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance * rateOfInterest * time)/ 100.0;
    }
}

