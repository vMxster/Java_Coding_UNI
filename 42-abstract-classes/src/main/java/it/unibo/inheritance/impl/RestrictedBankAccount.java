package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.*;

public class RestrictedBankAccount extends AbstractBankAccount {
    private static final double TRANSACTION_FEE = 0.1;

    public RestrictedBankAccount(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }

    public void chargeManagementFees(final int usrID) {
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
        if (checkUser(usrID) && isWithDrawAllowed(feeAmount)) {
            this.setBalance(getBalance() - feeAmount);
            this.resetTransactions();
        }
    }

    public void withdraw(final int usrID, final double amount) {
        if (isWithDrawAllowed(amount)) {
            transactionOp(this.getAccountHolder().getUserID(), -amount);
        }
    }

    protected boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    protected double computeFee() {
        return MANAGEMENT_FEE;
    }

    protected boolean isWithDrawAllowed(double amount) {
        return getBalance() > amount;
    }
}
