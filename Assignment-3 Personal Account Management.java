import java.util.ArrayList;

public class Main {

    public enum TransactionType {
        DEPOSIT,
        WITHDRAWAL;
    }

    public static class Amount {
        double amount;
        TransactionType type;

        public Amount(double amount, TransactionType type) {
            this.amount = amount;
            this.type = type;
        }

        @Override
        public String toString() {
            return type + ": " + amount;
        }
    }

    public static class PersonalAccount {
        int accountNumber;
        String accountHolder;
        double balance;
        ArrayList<Amount> transactions;

        public PersonalAccount(int accountNumber, String accountHolder) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = 0.0;
            this.transactions = new ArrayList<>();
        }

        public void deposit(double amount) {
            balance += amount;
            transactions.add(new Amount(amount, TransactionType.DEPOSIT));
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                transactions.add(new Amount(amount, TransactionType.WITHDRAWAL));
            } else {
                System.out.println("Insufficient funds");
            }
        }

        public void printTransactionHistory() {
            for (Amount transaction : transactions) {
                System.out.println(transaction);
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Kenzhebek kyzy Mairam");

        account.deposit(500.00);
        account.withdraw(200.00);
        account.deposit(100.00);

        account.printTransactionHistory();
        System.out.println("Balance: " + account.getBalance());
    }
}
