/*
    Badon Delmotte
    10/25/20
 */
package com.sg.vendingmachine.serviceLayer;

public class NoItemInventoryException extends Exception {
    
    public NoItemInventoryException (String message) {
        super(message);
    }
    
    public NoItemInventoryException (String message, Throwable cause) {
        super(message, cause);
    }
}
