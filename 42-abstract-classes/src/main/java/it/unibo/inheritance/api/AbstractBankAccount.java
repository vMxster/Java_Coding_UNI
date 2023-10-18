package it.unibo.inheritance.api;

import it.unibo.inheritance.impl.*;

public abstract class AbstractBankAccount implements BankAccount{
    protected static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions;

    public AbstractBankAccount (final AccountHolder holder, final double balance) {
        this.holder = holder;
        this.balance = balance;
        this.transactions = 0;
    }
    
    public void chargeManagementFees(int id) {

    }

    public void deposit(int id, double amount) {
        this.transactionOp(id, amount);
    }

    public void depositFromATM(int id, double amount){
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    public AccountHolder getAccountHolder(){
        return this.holder;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getTransactionsCount(){
        return this.transactions;
    }

    public void withdraw(int id, double amount){
        
    }

    public void withdrawFromATM(int id, double amount){
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    protected void resetTransactions(){
        this.transactions = 0;
    }

    protected void setBalance(double amount){
        this.balance = amount;
    }

    protected void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    protected void incrementTransactions() {
        this.transactions++;
    }

    protected boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    protected abstract boolean isWithDrawAllowed(double amount);

    protected abstract double computeFee();
}
