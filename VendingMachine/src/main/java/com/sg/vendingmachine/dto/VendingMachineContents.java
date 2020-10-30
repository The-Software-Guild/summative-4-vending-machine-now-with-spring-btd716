/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VendingMachineContents {
    
    // hashmap with item names and their costs
    public static HashMap <String, Double> drinkMap = new HashMap<>();
    // list with the amount of each item
    List <Integer> itemCount = new ArrayList<>();
    
    private BigDecimal vmBank = new BigDecimal(500); // the total amount of money in the vending machine "bank"
    private BigDecimal usrFunds; // the amount of funds inserted by the user
 
    // constructor for the actual items to purchase
    public VendingMachineContents(HashMap<String, Double> drinkMap){
        this.drinkMap = drinkMap;
        this.populateDrinkMap();
        this.populateItemCount();
    }
    
    // constructor for the money (user funds and the vending machine bank)
    public VendingMachineContents(BigDecimal usrFunds) {
        //this.vmBank = vmBank;
        this.usrFunds = usrFunds;
    }
    
    // populates the drinkMap HashMap with drinks and prices
    private void populateDrinkMap(){
        this.drinkMap.put("Coke", 0.75);
        this.drinkMap.put("Sprite", 0.75);
        this.drinkMap.put("Dr Pepper", 0.75);
    }
    
    // populates the itemCount list with a total amount of beverages
    private void populateItemCount(){
        this.itemCount.add(30); // 30 cokes
        this.itemCount.add(42); // 42 sprites
        this.itemCount.add(22); // 22 dr peppers
        
    }
    
    public HashMap<String, Double> getDrinkMap() {
        return drinkMap;
    }
    
    public List<Integer> getItemCount() {
        return itemCount;
    }
    
    
    // getter & setter for user funds
    public BigDecimal getUsrFunds() {
        return usrFunds;
    }
    public void setUsrFunds(BigDecimal usrFunds) {
        this.usrFunds = usrFunds;
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

    
    public static Collection<Double> getValues() {
        Collection<Double> priceValues = drinkMap.values();
        for (Double p : priceValues)
        {
            System.out.print(p);
        }        
        return drinkMap.values();
    }

    
    public static Set<String> getKeySet() {
        Set<String> itemKeys = drinkMap.keySet();
        for (String k : itemKeys)
        {
            System.out.print(k);
        }       
        return drinkMap.keySet();
    }

    
    
    
    
}
