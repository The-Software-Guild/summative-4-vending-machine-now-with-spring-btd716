/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.VendingMachineContents;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachineDAOFileImp implements VendingMachineDAO {
    
    
    
    // map to store the item details (name, cost, etc.)
    // may need to make a second map; one for items themselves (below) and one for the funds in machine
    private Map <BigDecimal, VendingMachineContents> vmMoney = new HashMap<>();   
    private Map <String, VendingMachineContents> itemsAvailable = new HashMap<>();

    @Override
    public BigDecimal insertFunds(BigDecimal usrFunds) 
            throws VendingMachineDAOException {
        
        return usrFunds;
        
    }

    @Override
    public VendingMachineContents makePurchase(HashMap<String, Double> drinkMap) 
            throws VendingMachineDAOException {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<String, Double> getAllItems() 
            throws VendingMachineDAOException {
        
        return VendingMachineContents.drinkMap;
    }
            
    
    
}
