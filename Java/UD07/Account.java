package UD07;

public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private static int numAccounts;
    
    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        ++numAccounts;
    }

    public Account(int accountNumber, String name) {
        this(accountNumber, name, 0.0);
    }
    
    
    /** 
     * @return int
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    
    /** 
     * @return double
     */
    public double getBalance() {
        return balance;
    }

    
    /** 
     * @return int
     */
    public static int getNumAccounts() {
        return numAccounts;
    }
    
    
    /** 
     * @param acc1
     * @param acc2
     * @return Account
     */
    public static Account consolidate(Account acc1, Account acc2){
        Account acc3 = null;
        if (acc1.name.equals(acc2.name) && acc1.accountNumber != acc2.accountNumber){
            acc3 = new Account(acc1.accountNumber + acc2.accountNumber, acc1.name, acc1.balance + acc2.balance);
            acc1.close();
            acc2.close();
        }
        return acc3;
    }

    
    /** 
     * @param acc
     * @param ammount
     */
    public void transfer(Account acc, double ammount){
        this.debit(ammount);
        acc.credit(ammount);
    }

    public void close(){
        balance = 0.0;
        name += " CLOSED";
        --numAccounts;
    }

    
    /** 
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    
    /** 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /** 
     * @param ammount
     */
    public void credit(double ammount){
        balance +=ammount;
    }
    
    /** 
     * @param ammount
     */
    public void debit(double ammount){
        if(balance >= ammount)    
            balance -=ammount;
        else
            System.out.println("Ammount withdrawn exceeds the current balance!");
    }

    
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return String.format("A/C no=%d, name= %s,  balance=$%.2f", accountNumber, name, balance);
    }
}
