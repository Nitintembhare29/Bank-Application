public interface BankInterface {

    // create common function of banks and their implementation is decided by different bank
    int getBalance();
    String depositMoney(int amount);
    String withdrawMoney(int amount, String enteredPassword);
    double calculateInterest(int time);
}
