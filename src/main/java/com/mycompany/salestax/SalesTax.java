/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salestax;
import java.util.Scanner;

/**
 *
 * @author orlandomarin
 */

/*
Write a program that will ask the user to enter the amount of a purchase. 
The program should then compute the state and county sales tax. 
Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
The program should display the amount of the purchase, the state sales tax, 
the county sales tax, the total sales tax, and the total of the sale 
(which is the sum of the amount of purchase plus the total sales tax). 
Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.
*/

public class SalesTax {

    public static void main(String[] args) 
    {
        // variables and constants
        double purchasePrice;
        double stateTax;
        double countyTax;
        double totalSalesTax;
        double saleTotal;
        
        final double STATE_TAX_PERCENTAGE = 0.04;
        final double COUNTY_TAX_PERCENTAGE = 0.02;
        
        // create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // ask the user to enter the amount of a purchase
        System.out.println("What is the amount of Orlando's purchase?");
        
        // read user input
        purchasePrice = keyboard.nextDouble();
        
        // compute the state tax (4%) and county sales tax (2%), total tax, and sale total
        stateTax = purchasePrice * STATE_TAX_PERCENTAGE;
        
        countyTax = purchasePrice * COUNTY_TAX_PERCENTAGE;
        
        totalSalesTax = stateTax + countyTax;
        
        saleTotal = purchasePrice + totalSalesTax;
        
        /* display the purchase amount, state sales tax, county sales tax,
        total sales tax, and the total of the sale
        */
        
        System.out.printf("Purchase Amount: $%,.2f.\n"
                + "State Sales Tax: $%,.2f.\n"
                + "County Sales Tax: $%,.2f.\n"
                + "Total Sales Tax: $%,.2f.\n"
                + "Total of the Sale: $%,.2f.", 
                purchasePrice, stateTax, countyTax, totalSalesTax, saleTotal);
            
    }
}
