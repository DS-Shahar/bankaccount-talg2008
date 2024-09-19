public class Main {
    public static void main(String[] args) {
        BankAccount acct1=new BankAccount(1000, -1000, "Lisa");
        BankAccount acct2=new BankAccount(1000, -1000, "Bob");

        System.out.println("balances:");
        System.out.println(acct1.getOwner() + acct1.getBalance());
        System.out.println(acct2.getOwner() + acct2.getBalance());

        acct1.transfer(acct2, 500);
        System.out.println("new balances after transfer: ");
        System.out.println(acct1.getOwner() + acct1.getBalance());
        System.out.println(acct2.getOwner() + acct2.getBalance());

        boolean success = acct1.transfer(acct2, 1600);
        if (success==false) {
            System.out.println("insufficient funds for requested transfer ");
        }

        System.out.println("balances: ");
        System.out.println(acct1.getOwner() + acct1.getBalance());
        System.out.println(acct2.getOwner() + acct2.getBalance());


    }
}