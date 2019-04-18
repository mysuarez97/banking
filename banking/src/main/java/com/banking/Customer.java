/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

import java.util.*;
import org.junit.*;

import javax.swing.*;
import javax.swing.text.Element;

import static java.lang.Math.pow;
import static org.junit.Assert.*;
/**
 * @author wpollock
 *
 */
public class Customer implements Comparable<Customer> {
    private static int nextId = 1;

    private final Bank bank;
    private final String customerId;
    private final String lastName;
    private final String firstName;
    private  JTextField CustomerID;
    private JTextField LastName;
    private JTextField FirstName;
    private JLabel customerIDText;
    private JLabel lastNameText;
    private JLabel firstNameText;
    private JFrame customerWindow;
    private JFrame addAccount;
    private JFrame signInWindow;
    private JLabel alreadyTaken;

    private final SortedSet<Account> customerAccounts = new TreeSet<>();

    /** Creates a new Customer object from a name.
     * Note for this project, we assume bank names are unique.
     * @param bank The bank owning this account
     * @param lastName The last name of the account owner.
     * @param firstName The first name of the account owner.
     */

    public Customer (Bank bank, String lastName, String firstName) {
        this.bank = null;
        this.customerId = "";
        this.lastName = "";
        this.firstName = "";
        // Stu
    }

    /**
     * @return the bank
     */
    @Test
    public Bank getBank ()
    {
        //Given
        bank();
        //When
        getBank().bank();
        //Then
        return bank;

    }

    /** Getter for customer's ID
     * @return The customer's ID
     */
    @Test
    public String getCustomerId ()
    {
        customerWindow = new JFrame("CustomerEntry");
        customerWindow.setSize(600,700); customerWindow.setVisible(true); customerWindow.setLayout(null);
        customerIDText = new JLabel("Customer ID:");
        //Given
        CustomerID.setVisible(true); CustomerID.setBounds(150,300,100,50); customerWindow.add(CustomerID);
        //When
        JTextField IDNumField = new JTextField();
        IDNumField.setVisible(true); IDNumField.setBounds(300,300,200,100); IDNumField.add(CustomerID);
        //Then
        return IDNumField;
    }

    /** Getter for the customer's last name
     * @return The customer's last name
     */
    @Test
    public String getLastName () {
        //Given
        lastNameText = new JLabel("Last Name:");
        lastNameText.setVisible(true);lastNameText.setBounds(150,400,100,50);customerWindow.add(lastNameText);
        LastName = new JTextField(15); LastName.setVisible(true); LastName.setBounds(300,400,200,100);
        //When
        customerWindow.add(LastName);
        //Then
        return LastName;
    }

    /** Getter for the customer's first name
     * @return The customer's first name
     */
    @Test
    public String getFirstName () {
        //Given
        firstNameText = new JLabel("First Name:");
        firstNameText.setVisible(true);firstNameText.setBounds(150,450,100,50); customerWindow.add(firstNameText);
        //When
        FirstName = new JTextField(15);FirstName.setBounds(450,300,200,100); FirstName.setVisible(true);
        customerWindow.add(FirstName);
        //Then
        return FirstName;
    }

    /** Returns a read-only SortedSet of the customer's active
     *  accounts (if any)
     *
     * @return an immutable SortedSet of accounts (check for
     *  immutability of accounts; use a List?)
     */
    @Test
    public static SortedSet<Account> getCustomerAccounts () {

        //Given
        List<Element> getCustomerAccounts = new ArrayList<>();

        //Add the customer accounts to the list

            getCustomerAccounts.add(IDNumField);

        return getCustomerAccounts();
    }

    /** Returns the total fees (including penalties) paid by this customer
     *  for year-to-date
     *
     * @return YTD fees paid
     */
    @Test                   //Given
    public double ytdFees ( double InterPayment,
            double faceValue,
            double Price,
            double Maturity) {
        //When
        double yieldFees = (InterPayment + (faceValue-Price))/ ((faceValue+Price)/2);
        //Then
        return yieldFees;
    }

    /** Returns the total interest paid to this customer for year-to-date
     * @return YTD interest payed
     */
    @Test                       //Given
    public double ytdInterest (double annualRate, double numOfComp) {
        //When
        double yieldInterest = pow((1+(annualRate/numOfComp)),numOfComp)-1;
        //Then
        return yieldInterest;  // Stub
    }

    /** Adds a new bank account
     * @param initBal Initial balance
     * @param desc A description for the account, chosen by the customer
     * @return the newly added account object
     */
    @Test
    public SavingsAccount addSavingsAccount (double initBal,  String[] desc) {
        addAccount = new JFrame("Create Savings Account");
        addAccount.setVisible(true);addAccount.setSize(600,700);addAccount.setLayout(null);
        //Given
        //Balance Label
        JLabel Balance = new JLabel("Enter Balance");
        Balance.setVisible(true); Balance.setBounds(200,300,100,50); addAccount.add(Balance);
        //Balance TextField
        //When
        JTextField balanceField = new JTextField(15);
        balanceField.setVisible(true);balanceField.setBounds(300,300,200,60); addAccount.add(balanceField);
        initBal= Double.parseDouble(balanceField.getText());
        //Description Label
        JLabel descripText = new JLabel("Description for Account:");
        descripText.setVisible(true);descripText.setBounds(200,400,100,50); addAccount.add(descripText);
        //Description DropBox
        String [] descr = {"Savings","Checking","Retirement","Certificate Deposit"};

        JComboBox descComboBox = new JComboBox(descr);
        descComboBox.setSelectedIndex(4);
        descComboBox.setVisible(true); descComboBox.setBounds(200,500,200,100); addAccount.add(descComboBox);
        //Then
        return descComboBox;
    }

    /** Deletes a given account (in the real world, just marks it as defunct
     *  or something)
     * @param accountId the ID of the account to remove
     */
    @Test
    public void removeAccount (String accountId) {

        //given
        String removeAccount;
        //When
        accountId==removeAccount;
        //then
        return accountId;
    }

    /** Find an account given an account ID
     *
     * @param accountId The ID of the desired account
     * @return The Account object, or null if no such account
     */
    @Test
    public Account getAccount (String accountId) {
        signInWindow = new JFrame("Sign in");
        signInWindow.setVisible(true);signInWindow.setSize(600,700); signInWindow.setLayout(null);
        //account ID text
        JLabel accountIDText = new JLabel("Account ID Number:");
        accountIDText.setVisible(true);accountIDText.setBounds(200,200,100,50);signInWindow.add(accountIDText);
        //Given
        //account Textfield
        JTextField accountField = new JTextField(15);
        accountField.setVisible(true);accountField.setBounds(300,300,200,60); signInWindow.add(accountField);
        //When
        accountId= accountId.parseInteger(accountField.getText());
        //sign in button
        JButton signIn = new JButton("Sign In");
        signIn.setVisible(true); signIn.setBounds(250,400,50,50);signInWindow.add(signIn);
        //then
        return getAccount(accountId);
    }

    @Override @Test
    public String toString () {
        return "";
    }

    @Override @Test
    public int hashCode () {
        //Given
        int hash;
        //When
        hash += CustomerID;
        //Then
        return hash;
    }

    @Override @Test
    public boolean equals (Object obj) {

        //Given
        int AccountID;
        //When
        AccountID == obj;
        //return
        return false;
    }

    @Override @Test
    public int compareTo (Customer other) {
        //Given
        other.equals(CustomerID);
        //When
        alreadyTaken= new JLabel("account ID number is already taken");
        alreadyTaken.setVisible(true);alreadyTaken.setBounds(400,500,100,100);signInWindow.add(alreadyTaken);
        //then
        return alreadyTaken;
    }
}