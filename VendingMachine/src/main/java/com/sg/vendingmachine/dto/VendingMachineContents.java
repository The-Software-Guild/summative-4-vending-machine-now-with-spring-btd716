/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class VendingMachineContents {
    
    // hashmap with item names and their costs
    HashMap <String, Double> drinkMap = new HashMap<>();
    
    
    private int itemCount; // the count of items within the machine --> to change after every transaction
    private BigDecimal vmBank = new BigDecimal(500); // the total amount of money in the vending machine "bank"
    private BigDecimal usrFunds; // the amount of funds inserted by the user
 
    
    public VendingMachineContents(HashMap<String, Double> drinkMap){
        this.drinkMap = drinkMap;
        this.populateDrinkMap();
    }
    
    public VendingMachineContents(BigDecimal usrFunds) {
        this.usrFunds = usrFunds;
    }
    
    private void populateDrinkMap(){
        this.drinkMap.put("Coke", 0.75);
        this.drinkMap.put("Sprite", 0.75);
        this.drinkMap.put("Dr Pepper", 0.75);
    }
    
    
    
    /*
    Map <String, Integer> vmContents = new HashMap<>();
        vmContents.put("Coke", 0.75);
        vmContents.put("Sprite", 0.75);
        vmContents.put("Dr Pepper", 0.75);
    */
    
    // what constructor do I write???
    
    /*
    // the variables of items in the vending machine
    private String a1 = "coke",
                a2 = "sprite",
                a3 = "dr pepper";
    
    // price of items
    public double p1 = .75,
                p2 = .75,
                p3 = .75;
    
    // the amount of items (quantity of each) in the machine from the start
    public int countCoke = 10,
                countSprite = 15,
                countDrPepper = 7;
    */

    
    
    
}
