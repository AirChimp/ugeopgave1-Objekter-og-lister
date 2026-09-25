import java.util.ArrayList;

public class Opgave3BankAccountMedArrayList {
    // Transaction.java
    public static class Transaction {
        String type;
        double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public String toString() {
            return type + ": " + amount + " kr";
        }
    }

    // BankAccount.java
    public static class BankAccount {
        String owner;
        double balance;
        ArrayList<Transaction> transactions;

        public BankAccount(String owner, double startBalance) {
            this.owner = owner;
            this.balance = startBalance;
            this.transactions = new ArrayList<>();
            // Tilføj start balance som transaction
            transactions.add(new Transaction("deposit", startBalance));
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
                transactions.add(new Transaction("deposit", amount));
                System.out.println("Indsatte " + amount + " kr");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance = balance - amount;
                transactions.add(new Transaction("withdrawal", amount));
                System.out.println("Hævede " + amount + " kr");
            } else if (amount > balance) {
                System.out.println("Ikke nok penge på kontoen");
            }
        }

        public void printTransactionHistory() {
            System.out.println("\n=== Transaktionshistorik for " + owner + " ===");
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }

        public double getBalance() {
            return balance;
        }

        public Transaction getLargestTransaction() {
            if (transactions.size() == 0) {
                return null;
            }

            Transaction largest = transactions.get(0);
            for (Transaction t : transactions) {
                if (t.amount > largest.amount) {
                    largest = t;
                }
            }
            return largest;
        }
    }

    // Main.java
    public class Main {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("Anna", 1000);

            account.deposit(500);
            account.withdraw(200);
            account.deposit(1000);
            account.withdraw(300);
            account.withdraw(5000);  // Fejler

            account.printTransactionHistory();

            System.out.println("\nNuværende saldo: " + account.getBalance() + " kr");

            // Ekstra udfordring
            Transaction largest = account.getLargestTransaction();
            System.out.println("\nStørste transaktion: " + largest);
        }
    }
    public static class main {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("Anna", 1000);

            account.deposit(500);
            account.withdraw(200);
            account.deposit(1000);
            account.withdraw(300);
            account.withdraw(5000);  // Fejler

            account.printTransactionHistory();

            System.out.println("\nNuværende saldo: " + account.getBalance() + " kr");

            // Ekstra udfordring
            Transaction largest = account.getLargestTransaction();
            System.out.println("\nStørste transaktion: " + largest);
        }
    }

}