/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

import static com.banking.TransactionType.*;
import org.junit.*;

import javax.swing.*;

import static org.junit.Assert.*;
/**
 * @author wpollock
 *
 */
public class SavingsAccount extends Account {
    // Default monthly interest rate, applied on last day of statement cycle:
    private static double DEFAULT_INTEREST_RATE = 2.0;  // a percent
    private JTextField  depositField;
    private JFrame DepostWindow;
    private JLabel depositText;
    private JLabel withdrawText;
    private JTextField withdrawField;

    /**  SavingsAccount constructor, using default interest rate.
     * @param cust The customer that owns this account
     * @param initialBalance The initial account balance
     * @param description An account description provided by the owner
     */

    public SavingsAccount (Customer cust, double initialBalance,
            String description) {
        super(cust, initialBalance, description);
        System.out.println(getAccountId());
        System.out.println(getBalance());
        System.out.println(getAccountDescription());

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
        System.out.println(getAccountId());
        System.out.println(getBalance());
        System.out.println(getAccountDescription());
    }

    @Override @Test
    public void deposit (double amount) {
        // Stub
        DepostWindow= new JFrame("Deposit");
        DepostWindow.setVisible(true); DepostWindow.setSize(500,600);DepostWindow.setLayout(null);
        //Deposit Label
        depositText= new JLabel("Enter the amount, you want to deposit.");
        depositText.setVisible(true);depositText.setBounds(200,200,100,50);DepostWindow.add(depositText);
        //TextField
        depositField = new JTextField(15);
        depositField.setVisible(true);depositField.setBounds(300,300,200,60); DepostWindow.add(depositField);

         amount =  depositField.getColumns();


        if(amount <= 0){
            System.out.println("You must deposit an amount greater than 0.");
        } else {
            System.out.println("You have deposited " + (amount));
        }
    }

    @Override @Test
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        JFrame withdrawWindow = new JFrame("Withdraw");
        withdrawWindow.setVisible(true); withdrawWindow.setSize(500,600);withdrawWindow.setLayout(null);
        //Deposit Label
        withdrawText= new JLabel("Enter the amount, you want to withdraw from your account");
        withdrawText.setVisible(true);withdrawText.setBounds(200,200,100,50);withdrawWindow.add(withdrawText);
        //TextField
        withdrawField = new JTextField(15);
        withdrawField.setVisible(true);withdrawField.setBounds(300,300,200,60); withdrawWindow.add(withdrawField);

        amount =  depositField.getColumns();

        if(amount <= 0) {
            System.out.println("You must withdraw an amount greater than 0.");
        } else {
            System.out.println("You have deposited " + (amount));

        }
    }
}
