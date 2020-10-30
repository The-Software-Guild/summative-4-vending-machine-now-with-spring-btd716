/*
    Badon Delmotte
    10/26/20
 */
package com.sg.vendingmachine.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class VendingMachineAuditDAOFileImp implements VendingMachineAuditDAO {
    
    public static final String AUDIT_FILE = "audit.txt";
    
    @Override
    public void writeAuditEntry(String entry) throws VendingMachineDAOException {
        PrintWriter out;
        try
        {
            out = new PrintWriter(new FileWriter(AUDIT_FILE, true));
        } catch (IOException e)
        {
            throw new VendingMachineDAOException("Could not persist audit information.", e);
        }
        
        LocalDateTime timestamp = LocalDateTime.now();
        out.println(timestamp.toString() + " : " + entry);
        out.flush();
    }
    
}
