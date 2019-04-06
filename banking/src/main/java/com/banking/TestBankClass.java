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
        boolean gotAllCustomers = false;
        SortedSet<Customer> customerSet = Bank.getAllCustomers();
       
        while (customerSet.iterator().hasNext())
        {
            SortedSet<String> displayCustomer = new TreeSet<>();
            if (customerSet.lastName.equals(lastName) && 
                    customerSet.firstName.equals(firstName) ) 
            {
                displayCustomer.add(customerSet.iterator().toString());
            }
            if (displayCustomer.iterator() != null) {
                gotAllCustomers = true;
            }
        }
        
        
        return gotAllCustomers;
    }
}

    
