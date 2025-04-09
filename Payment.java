/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;

import java.util.Scanner;

/**
 *
 * @author hamsa
 */
public class Payment extends Order  
{
    
    static Scanner input = new Scanner(System.in);
//    public int PaymentMethod;


    public Payment() { }


    public void pay() {
        double rest;
        String payRestCash = "";


        System.out.println(RMS.PAYMENTMETHODMENU);
         PaymentMethod = input.nextInt();

        switch (PaymentMethod) {
            case 1:
                do {
                    System.out.println("|Pay>>>>                |\n");
                    double amount = input.nextDouble();
                    if (amount == Order.totalcost) {
                        System.out.println("Payment is successful!!");
                        payRestCash ="N";
                    }

                else if (amount > Order.totalcost) {
                        rest = amount - Order.totalcost;
                        System.out.println("Payment is successful!!");
                        System.out.println("Here is the rest of your bill >>" + rest); }

                else if (amount < Order.totalcost) {
                        rest = Order.totalcost - amount;
                        System.out.println("Payment is unsuccessful amount is not enough");
                        System.out.println("You need to pay extra" + rest +
                                " \ndo you want continue with the rest of the payment? (Y/N) ");
                        payRestCash = input.next();
                }

                } while (payRestCash.equalsIgnoreCase("Y"));

                break;

            case 2:
                Admin.EmployeeMenu();

                break;


                }
        }
}

