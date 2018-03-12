
public class BankAccountDriver
{
    public static void main(String[] args) {
        
        CheckingAccount joesAccount = new CheckingAccount(1000.00);
        joesAccount.withDraw(300.00);
        joesAccount.deposit(500.00);
        joesAccount.withDraw(100.00);
        System.out.println("Joe's balance = $" + joesAccount.getBalance());

        CheckingAccount moesAccount = new CheckingAccount(500.00);
        moesAccount.transfer(100, joesAccount);
        System.out.println("Joe's balance = $" + joesAccount.getBalance());

        SavingsAccount janesAccount = new SavingsAccount(2000, 4.2);
        janesAccount.withDraw(1000.00);
        System.out.println("Janes's balance = $" + janesAccount.getBalance());

        janesAccount.withDraw(1000.00);
        System.out.println("Janes's balance = $" + janesAccount.getBalance());

        janesAccount.withDraw(995.00);
        System.out.println("Janes's balance = $" + janesAccount.getBalance());

        janesAccount.addInterest();
        System.out.println("Janes's balance = $" + janesAccount.getBalance());
    }
}

class BankAccount{

    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class CheckingAccount extends BankAccount {

    private static final double TRANSACTION_FEE = 0.50;

    public CheckingAccount (double initialBalance)
    {
        super(initialBalance);
    }

    public void deposit (double amount)
    {
        super.deposit(amount - TRANSACTION_FEE);
    }

    public void withDraw(double amount)
    {
        super.withDraw(amount-TRANSACTION_FEE);
    }

    public void transfer(double amount, BankAccount other) {
        withDraw(amount);
        other.deposit(amount);
    }
}

class SavingsAccount extends BankAccount
{
    private double interestRate;
    public static final double MINIMUM_BALANCE = 10;

    public SavingsAccount (double rate)
    {
        interestRate = rate;
    }

    public SavingsAccount (double initialBalance, double rate)
    {
        super(initialBalance);
        interestRate = rate;
    }

    public void addInterest()
    {
        super.deposit(super.getBalance() * (interestRate/100));
    }

    public void withDraw (double amount)
    {
        if (super.getBalance() - amount > MINIMUM_BALANCE)
        {
            super.withDraw(amount);
        }
    }
}

