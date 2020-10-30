/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.ui;

import com.sg.vendingmachine.dto.VendingMachineContents;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class VendingMachineView {
    private UserIO io;
    
    // constructor 
    public VendingMachineView(UserIO io){
        this.io = io;
    }
    
    // main menu banner
    public int printMenuAndGetSelection() {
        io.print("<--- Vending Machine --->");
        io.print("1. Insert Funds");
        io.print("2. Select Item");
        io.print("3. Available Items Remaining in Machine");
        io.print("4. Exit");
        
        return io.readInt("Please select from the above choices", 1, 4);
    }
    
    
    
    // case 1 banner
    public void displayInsertionBanner(){
        io.print("<--- VM Funds ---> \n");
        
    }   
    // user inserting funds ==> "1. Insert Funds"
    public VendingMachineContents displayFundsInsertion(){
        BigDecimal usrFunds = io.readBigDecimal("Please Insert Funds");
        VendingMachineContents currentTransaction = new VendingMachineContents(usrFunds);
        currentTransaction.setUsrFunds(usrFunds);
        return currentTransaction;
    }
    // case 1 success banner
    public void displayInsertionSuccessBanner(){
        io.print("Funds inserted successfully.");
    }
      
    
    
    // case 2 banner
    public void displayItemSelectionBanner(){
        io.print("<--- Please Select an Item --->");
    }
    // selecting item ==> "2. Select Item"
    public int displayItemSelection () {
        io.print("1. Coke");
        io.print("2. Sprite");
        io.print("3. Dr Pepper");
        io.print("4. EXIT");
           
        return io.readInt("Please select a number from the options above.", 1, 4);
    }
    // case 2 success banner
    public void displayItemSelectionSuccessBanner() {
        io.print("Item purchased successfully.");
    }
    
    
    
    // case 3
    public void displayItemListBanner() {
        io.print("<--- Here's what we have available: ---> \n");
    }
    // available items in machine ==> "3. Available Items Remaining in Machine"

    /**
     *
     * @param drinkMap
     */
    public void displayItemsList (VendingMachineContents drinkMap) {
        
        System.out.print(VendingMachineContents.getKeySet());
        System.out.print(VendingMachineContents.getValues());
        
        io.readString("Please hit enter to continue.");
    }    
    

    
    // exit banner
    public void displayExitBanner(){
        io.print("Goodbye friend...");
    }
    // unknown command banner
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command my friend...");
    }
    // error message banner
    public void displayErrorMessage (String errorMsg) {
        io.print("<--- ERROR --->");
        io.print(errorMsg);
    }
    
    
    
    
    
}
