/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

import static com.banking.TransactionType.*;

/**
 * @author wpollock
 *
 */
public class SavingsAccount extends Account {
    // Default monthly interest rate, applied on last day of statement cycle:
    private static double DEFAULT_INTEREST_RATE = 2.0;  // a percent

    /**  SavingsAccount constructor, using default interest rate.
     * @param cust The customer that owns this account
     * @param initialBalance The initial account balance
     * @param description An account description provided by the owner
     */
    public SavingsAccount (Customer cust, double initialBalance,
            String description) {
        super(cust, initialBalance, description);
    }

    /** SavingsAccount constructor, using a custom interest rate.
     * @param cust The customer that owns this account
     * @param initialBalance The initial account balance
     * @param description An account description provided by the owner
     * @param interestRate  Account's default monthly interest rate
     */
    public SavingsAccount (Customer cust, double initialBalance,
            String description, double interestRate) {
        super(cust, initialBalance, description);
        // Stub
    }

    @Override
    public void deposit (double amount) {
        // Stub
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
