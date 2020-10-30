/*
    Badon Delmotte
    10/25/20
 */
package com.sg.vendingmachine.serviceLayer;

public class InsufficientFundsException extends Exception {
    
    public InsufficientFundsException (String message) {
        super(message);
    }
    
    public InsufficientFundsException (String message, Throwable cause) {
        super(message, cause);
    }
    
}
