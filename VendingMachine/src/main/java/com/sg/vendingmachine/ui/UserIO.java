/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.ui;

import java.math.BigDecimal;

public interface UserIO {
    
    void print(String msg);
    
    double readDouble(String prompt);
    
    double readDouble(String prompt, double min, double max);
    
    float readFloat(String prompt);
    
    float readFloat(String prompt, float min, float max);
    
    int readInt(String prompt);
    
    int readInt(String prompt, int min, int max);
    
    long readLong(String prompt);
    
    long readLong(String prompt, long min, long max);
    
    String readString(String prompt);
    
    BigDecimal readBigDecimal(String prompt);
    
    BigDecimal readBigDecimal(String prompt, BigDecimal min, BigDecimal max);

    //public void print(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11);

    public void print(Double p);
    
}
