/*
    Badon Delmotte
    10/26/20
 */
package com.sg.vendingmachine.serviceLayer;

import com.sg.vendingmachine.dao.VendingMachineAuditDAO;
import com.sg.vendingmachine.dao.VendingMachineDAO;
import com.sg.vendingmachine.dao.VendingMachineDAOException;
import com.sg.vendingmachine.dto.VendingMachineContents;
import java.math.BigDecimal;
import java.util.List;


public class VendingMachineServiceLayerImp implements VendingMachineServiceLayer {
    
    VendingMachineDAO dao;
    private VendingMachineAuditDAO auditDao;
    
    public VendingMachineServiceLayerImp (VendingMachineDAO dao, VendingMachineAuditDAO auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }

    @Override
    public VendingMachineContents insertFunds(BigDecimal usrFunds, VendingMachineContents vmBank) throws VendingMachineDAOException, InsufficientFundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VendingMachineContents makePurchase(String itemName, VendingMachineContents itemCount) throws VendingMachineDAOException, InsufficientFundsException, NoItemInventoryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VendingMachineContents> getAllItems() throws VendingMachineDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
