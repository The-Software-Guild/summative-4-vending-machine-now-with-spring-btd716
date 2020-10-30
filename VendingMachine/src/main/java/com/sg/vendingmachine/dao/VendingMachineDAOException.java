/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dao;

public class VendingMachineDAOException extends Exception {
    
    public VendingMachineDAOException (String message){
        super(message);
    }
    
    public VendingMachineDAOException (String message, Throwable cause){
        super(message, cause);
    }
    
}
