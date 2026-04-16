public class Main{
    public static void main (String[] args){
        BankAccount account1 = new BankAccount("12345", "IE12BOFI123456789", "Wale", 500);

        account1.deposit(200);
        account1.withdraw(100);
        //account1.transfer(account1, 0);
        System.out.println("Account1 balance " + account1.getBalance() );
    }
}