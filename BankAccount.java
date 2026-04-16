public class BankAccount{
    private String accountNumber;
    private String iban;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String iban, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.iban = iban;
        this.holderName = holderName;
        this.balance = balance;
    }


    public String getAccountNumber(){
        return accountNumber;
    }
   

    public String getIban(){
        return iban;
    }
   
    public String getHolderName(){
        return holderName;
    }
    
    public double getBalance(){
        return balance;
    }
   
    public void deposit(double amount){
        if( amount <= 0){
            System.out.println("Deposit an amount greater than 0");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Withdrawal should be greater than 0");
            return;
        }
        if(amount > balance){
            System.out.println("Insuffient Funds");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount);
    }

    public void transfer(BankAccount targetAccount, double amount){
        if(targetAccount == null){
            System.out.println("Target account cannot be null");
            return;
        }
        if(targetAccount == this){
            System.out.println("Cannot transfer to the same account");
            return;
        }
        if(amount <= 0){
            System.out.println("Transfer amoiunt is greater than 0");
            return;
        }
        if(amount > balance){
            System.out.println("Insufficient funds for transfer");
            return;
        }
        this.balance -= amount;
        targetAccount.balance += amount;

        System.out.println("Transferred " + amount + " to " + targetAccount.getHolderName());
    }
}