/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Sam
 */
public class TestBankClass {
    
    // check to see if bank exists
    // @Returns boolean
    public boolean verifyBankName(String bankName){
        // a list for bank names--stubbed out
        List<String> directoryOfBanks = new ArrayList<>();
        boolean bankTestResult = false;
        if (directoryOfBanks.contains("bankName")) {
            bankTestResult = true;
        }
        return bankTestResult;
    }
    
    public boolean addCustomerTest(){
        // had to make Bank.addCustomer static
        String lastName = ""; // = Bank.addCustomer.lastName
        String firstName = ""; // = Bank.addCustomer.firstName
        boolean customerAdded = true;
        if (Bank.addCustomer(lastName, firstName).equals(null)) {
            customerAdded = false;
        }
        return customerAdded;
    } 
    
    public boolean getCustomerTest(String customerId){
        boolean ableToGetCustomer = false;
        //a list of customer IDs stubbed out.
        List<String> customerList = new ArrayList<>();
        if (customerList.contains(customerId)){
            ableToGetCustomer = true;
        }
        return ableToGetCustomer;
    }
    
    public boolean getCustomerListTest(String lastName, String firstName){
        boolean gotAllAccounts = false;
        SortedSet<Customer> customerSet = Bank.getAllCustomers();
        
        // commented out as it would need persistant data
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
    
    public boolean getAllCustomersTest(){
       boolean allCustomersInSet = true;
       int numOfCustomers = 0;  //number of customers to be input here.
       if (Bank.getAllCustomers().size() != numOfCustomers){
           allCustomersInSet = false;
       }
       
       return allCustomersInSet;
    }
    
    /** Remove customer from getAllCustomer Sorted Set.
     * return true if able to remove.
     * @param cust
     * @return 
     */
    public boolean removeCustomer(Customer cust){
        
        boolean customerRemoved = Bank.getAllCustomers().remove(cust);
        
        return customerRemoved;
    }
    
    /** iterate through all customers then add all accounts for each
     *   customer to a SortedSet.  Test to see if SortedSet contains
     *   same number of elements as the total number of accounts. 
     */
    public boolean getAllAccounts() {
        boolean allAccountsAccountedFor = false;
        int totalNumOfAccounts = 0; //erroneous for now
        SortedSet allAccounts = new TreeSet<>();
        while (Bank.getAllCustomers().iterator().hasNext()){
            allAccounts.addAll(Customer.getCustomerAccounts());
           // Bank.getAllCustomers().hashCode();
           // allAccounts = Bank.getAllCustomers().forEach(Customer.getCustomerAccounts());
           // allAccounts.addAll(Customer.getCustomerAccounts());         
        }
        
        if (allAccounts.size() == totalNumOfAccounts){
            allAccountsAccountedFor = true;
        }
        
        return allAccountsAccountedFor;
    } 
}

    
