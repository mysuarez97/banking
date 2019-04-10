/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * This class tests the methods of the bank class.  Methods are pretty much stubbed
 * out with some commented out code that may be used if methods in the Bank class
 * were static.
 * @author Sam
 */
public class TestBankClass {
    
    /**
     * Check to see if bank exists within the list of banks on file.
     * @param bankName
     * @return 
     */
    public boolean verifyBankName(String bankName){
        // a list for bank names--stubbed out
        List<String> directoryOfBanks = new ArrayList<>();
        boolean bankTestResult = false;
        
        if (directoryOfBanks.contains("bankName")) {
            bankTestResult = true;
        }
        return bankTestResult;
    }
    
    /**
     * Checks to see if customer was added to 
     * the SortedSet of Bank.getAllCustomers
     * @param cust
     * @return 
     */
    public boolean addCustomerWizardTest(Customer cust){
        boolean customerAdded = false;
        /*
        if (Bank.getAllCustomers().contains(cust)) {
            customerAdded = true;
        }
        */
        return customerAdded;
    }
    
    /**
     * Checks to see if Customer.getCustomerAccounts contains
     * new Account().
     * @param cust
     * @return 
     */
    public boolean addAccountWizardTest(Customer cust){
        boolean accountAdded = false;
        // if new accountId in Customer.getCustomerAccounts
        // accountAdded = true;
            
        return accountAdded;
    }
    
    /**
     * Verify that customer name fields are not left empty.
     * @return
     */
    public boolean addCustomerTest(){
        // had to make Bank.addCustomer static
        String lastName = ""; // = Bank.addCustomer.lastName
        String firstName = ""; // = Bank.addCustomer.firstName
        boolean customerAdded = true;
        /*
        if (Bank.addCustomer(lastName, firstName).equals("")) {
            customerAdded = false;
        }
        */
        return customerAdded;
    } 
    
    /**
     * Checks to see if customer ID is on file
     * @param customerId
     * @return 
     */
    public boolean getCustomerTest(String customerId){
        boolean ableToGetCustomer = false;
        //a list of customer IDs stubbed out.  Probably necessary
        //if we have persistent storage.
        List<String> customerList = new ArrayList<>();
        if (customerList.contains(customerId)){
            ableToGetCustomer = true;
        }
        return ableToGetCustomer;
    }
    
    /**
     * Checks persistent storage for customer's last name and first name.
     * 
     * @param lastName
     * @param firstName
     * @return 
     */
    public boolean getCustomerListTest(String lastName, String firstName){
        boolean gotAllAccounts = false;
        /*
        SortedSet<Customer> customerSet = Bank.getAllCustomers();
        
         commented out as it would need persistant data
       /*
        while (customerSet.iterator().hasNext())
        {
            SortedSet<String> displayCustomerAccounts = new TreeSet<>();
            if (customerSet.lastName.equals(lastName) && 
                    customerSet.firstName.equals(firstName) ) 
            {
                displayCustomerAccounts.add(customerSet.iterator().toString());
            }
            if (displayCustomerAccounts.iterator() != null) {
                gotAllAccounts = true;
            }
        }
        */               
        return gotAllAccounts;
    }
    
    /**
     * Compares the number of customers to the size of the 
     * returned value from Bank.getAllCustomers().
     * @return 
     */
    public boolean getAllCustomersTest(){
       boolean allCustomersInSet = true;
       int numOfCustomers = 0;  //number of customers variable to be input here.
       /*
       if (Bank.getAllCustomers().size() != numOfCustomers){
           allCustomersInSet = false;
       }
       */
       return allCustomersInSet;
    }
    
    /** 
     * Check to ensure all customer accounts equal zero and
     * adds customer to a previousCustomer SortedSet.
     * Removes customer from getAllCustomer Sorted Set.
     * return true if able to remove.
     * @param cust
     * @return 
     */
    public boolean removeCustomer(Customer cust){
        
        boolean customerRemoved = false; 
        SortedSet<Customer> previousCustomer;
        double zeroedAccount = 0;
        
        /*
        Iterator<Account> accountIterator = cust.getCustomerAccounts().iterator();
        if (accountIterator.toString().equals(Double.toString(zeroedAccount))) {
            previousCustomer.add(cust);
            customerRemoved = Bank.getAllCustomers().remove(cust);
            
        }     
        */
        
        return customerRemoved;
    }
    
    /** 
     *   Iterate through all customers then add all accounts for each
     *   customer to a SortedSet.  Test to see if SortedSet contains
     *   same number of elements as the total number of accounts the bank
     *   has on file.
     *   @return
     */
    public boolean getAllAccounts() {
        boolean allAccountsAccountedFor = false;
        int totalNumOfAccounts = 0; //erroneous for now
        SortedSet allAccounts = new TreeSet<>();
        /*
        while (Bank.getAllCustomers().iterator().hasNext()){
            allAccounts.addAll(Customer.getCustomerAccounts());
            Bank.getAllCustomers().hashCode();
            allAccounts = Bank.getAllCustomers().forEach(Customer.getCustomerAccounts());
           // allAccounts.addAll(Customer.getCustomerAccounts());         
        }
        */     
        if (allAccounts.size() == totalNumOfAccounts){
            allAccountsAccountedFor = true;
        }
        
        return allAccountsAccountedFor;
    } 
}

    
