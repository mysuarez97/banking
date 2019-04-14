/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

/**
 * This class tests the methods of the Bank.Account class.
 * @author Samuel Graham
 */
public class TestAccountClass {
    
    /**
     * Test the Account constructor.  Return a string indicating test passed or
     * indicate where the test failed.
     * @return string with test results, hints to error if any
     */
    public String testAccount(){
        String result = "";
        
        return result;
    }
    
    /**
     * Test the deposit method.  Checks to amount prior to the deposit, adds
     * the deposit and ensures the correct amount is stored. Returns a string
     * indicating test passed or where the test failed
     * @return string with test results, hints to error if any
     */
    public String testDeposit(){
        String result = "";
        
        return result;
    }
    
    /**
     * Test the withdraw().  Checks available funds in customer account.  Ensures
     * overdraft fee is correctly implemented if insufficient funds. Return a 
     * string stating test passed or indicating where the problem occurred.
     * @return string with test results, hints to error if any
     */
    public String testWithdraw(){
        String result = "";
        
        return result;        
    }
    
    /**
     * Test the transfer().  Checks account to be deducted has enough funds.
     * Ensures the deducted account is decreased by the correct amount.  Checks
     * the deposit account before this transaction.  Checks deposit account after
     * transaction to validate correct amount deposited. Returns a string indicating
     * test passed or where the problem occurred.
     * @return string with test results, hints to error if any
     */
    public String testTransfer(){
        String result = "";
        
        return result;
    }
    
    /**
     * Test the getAccountDescription().  Checks to ensure that the correct 
     * account type and description is returned. This method returns a string
     * stating test passed or gives reference to where the problem may have 
     * occurred.
     * @return string with test results, hints to error if any
     */
    public String testGetAccountDescription(){
        String result = "";
        
        return result;
    }
    
    /**
     * This tests the setAccountDescription(). Checks the description prior to 
     * the method call and after the method call to ensure the description was
     * updated correctly.  Returns a string telling that description update was
     * successful or update failed.
     * @return string with test results, hints to error if any
     */
    public String testSetAccountDescription(){
        String result = "";
        
        return result;
    }
    
    /**
     * Tests the getBalance().  Checks the returned value is the same as the
     * balance of the account. 
     * @return string with test results
     */
    public String testGetBalance(){
        String result = "";
        
        return result;
    }

    /**
     * Tests the getTransactions(). Makes sure that the returned list is read-only.
     * Ensures the returned list contains all transactions of the account.  Ensures
     * transactions from other accounts are not included. Return a string indicating
     * tests passed or describing where test failed.
     * @return string with test results, hints to error if any
     */
    public String testGetTransactions(){
        String result = "";
        
        return result;
    }
    
    /**
     * Test the getTransaction().  Ensures that returned transaction is read-only,
     * and that the correct transaction is displayed.  Returns a string stating
     * tests passed, or describing where test failed.
     * @return string with test results, hints to error if any
     */
    public String testGetTransaction(){
        String result = "";
        //add code
        return result;
    }
    
    /**
     * Test the getAccountId().  Ensures the correct account ID is returned and
     * read-only. 
     * @return string with result, hints to error if any
     */
    public String testGetAccountId(){
        String result = "";
        //add code
        return result;
    }
        
    /**
     * Test the getCustomerId().  Ensures the correct customer ID is returned and
     * read-only. 
     * @return string with test results, hints to error if any
     */
    public String testGetCustomerId(){
        String result = "";
        //add code
        return result;
    }
    
    /**
     * Tests the getAccountCreationDate().  Ensures the method returns read-only
     * and that it matches the filed creation date of the requested account.
     * @return string with results that hints to error, if any.
     */
    public String testGetAccountCreationDate () {
        String result = "";
        //add code
        return result;  
    }

}


