/*
    Badon Delmotte
    10/26/20
 */
package com.sg.vendingmachine.dao;

public interface VendingMachineAuditDAO {
    
     public void writeAuditEntry(String entry) throws VendingMachineDAOException;
}
