public interface BankInterface {

    int getBalance();
    String depositMoney(int amount);
    String withdrawMoney();
    double calculateInterest(int time);
}
