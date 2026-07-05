public class BankAccount {
    private String accountHolder;

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void display() {
        System.out.println("AccountHolder Name: " + this.accountHolder);
    }

    public static void main(String args[]) {
        BankAccount ba = new BankAccount();
        ba.setAccountHolder("Revannath");
        String name = ba.getAccountHolder();
        System.out.println("Name: " + name);
        ba.display();
    }
}