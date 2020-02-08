public class AccountHolder {
    double balance;
    double annualInterestRate = .4;

    public AccountHolder(double balanceStart) {
        balance=balanceStart;
    }

    public void deposit(double amount) {
        balance = amount;
    }

    public void withdrawal(double amount) {
        if (amount >= 50) {
            System.out.println("Not enough funds.");
        } else {
            balance -= amount;
        }
    }

    public void setBalance(double b){
        balance = b;
    }

    public double getBalance(){
        return balance;
    }

    public void monthlyInterest(){
        balance += balance * (annualInterestRate / 12.0);
    }
}