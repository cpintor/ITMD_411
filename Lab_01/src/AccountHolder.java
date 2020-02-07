public class AccountHolder {
    double balance;
    double annualInterestRate;

    public AccountHolder(double balance) {
        this.balance=balance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            System.out.println("Not enough funds.");
        } else {
            balance -= withdrawalAmount;
        }
    }

    public void monthlyInterest(){
        balance += balance * (annualInterestRate / 12.0);
    }
}