/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;

/**
 *
 * @author hamsa
 */

import java.util.Scanner;

public class Order {
    
   
    
    static Scanner input = new Scanner(System.in);
    public static double totalcost;
    final double VAT=0.15;
     int choiceOrder;
    public int PaymentMethod;

  

    public Order(){
    RMS.OrderNum++;
    
            }





    public void orderFood(){
        boolean ch1 = false;
        boolean ch2 = false;
        boolean ch3 = false;
        int pos;
        do{
            System.out.println("Which Menu Do You Want?");
            System.out.println(RMS.EMPLOYEEMENU2);
            choiceOrder = input.nextInt();
            switch (choiceOrder){
                case 1:
                    for(int i=0;i<RMS.Dishestlist.size();i++){
                        System.out.println("p=" + i + " " +RMS.Dishestlist.get(i));}
                    System.out.println("Enter The pos of the item you want:");
                     pos = input.nextInt();
                    for(int i=0;i<RMS.Dishestlist.size();i++)
                    {
                        if (pos==i)
                            ch1=true;
                    }
                    if (ch1){
                        System.out.println("How Many Dishes Do You Want?");
                        int q =input.nextInt();
                        RMS.Dishestlist.get(pos).setAmount(q);
                        RMS.OrderListDish.add(new Dishes(RMS.Dishestlist.get(pos).getItemName(),
                                RMS.Dishestlist.get(pos).getCalories(),
                                RMS.Dishestlist.get(pos).getClassification(),
                                RMS.Dishestlist.get(pos).getCost(),
                                RMS.Dishestlist.get(pos).isWithSpicy(),RMS.Dishestlist.get(pos).getAmount()));
                    }else System.out.println("WRONG ENTRY!!");
                break;

                case 2:
                    for(int i=0;i<RMS.Dessertlist.size();i++){
                        System.out.println("p=" + i + " " +RMS.Dessertlist.get(i));}
                    System.out.println("Enter the pos of the item you want");
                     pos = input.nextInt();
                    for(int i=0;i<RMS.Dessertlist.size();i++)
                    {
                        if (pos==i)
                            ch2=true;
                    }
                    if (ch2){
                        System.out.println("How Many Desserts Do You Want? ");
                        int q =input.nextInt();
                        RMS.Dessertlist.get(pos).setAmount(q);
                        RMS.OrderListDessert.add(new Desserts(RMS.Dessertlist.get(pos).getItemName(),
                                RMS.Dessertlist.get(pos).getCalories(),
                                RMS.Dessertlist.get(pos).getClassification(),
                                RMS.Dessertlist.get(pos).getCost(),
                                RMS.Dessertlist.get(pos).getDessertType(),RMS.Dessertlist.get(pos).getAmount()));

                    }else System.out.println("WRONG ENTRY!!");
                    break;

                case 3:
                    for(int i=0;i<RMS.Drinklist.size();i++){
                        System.out.println("p=" + i + " " +RMS.Drinklist.get(i));}
                    System.out.println("enter the pos of the item you want");
                     pos = input.nextInt();
                    for(int i=0;i<RMS.Dessertlist.size();i++)
                    {
                        if (pos==i)
                            ch3=true;
                    }
                    if (ch3){
                        System.out.println("How Many Drinks Do You Want? ");
                        int q =input.nextInt();
                        RMS.Drinklist.get(pos).setAmount(q);
                        RMS.OrderListDrink.add(new Drinks(RMS.Drinklist.get(pos).getItemName(),
                                RMS.Drinklist.get(pos).getCalories(),
                                RMS.Drinklist.get(pos).getClassification(),
                                RMS.Drinklist.get(pos).getCost(),
                                RMS.Drinklist.get(pos).getDrinkType(),RMS.Drinklist.get(pos).getAmount()));}

                    else System.out.println("WRONG ENTRY!!");
                    break;

                default:System.out.println("WRONG ENTRY!!");}

        }while(choiceOrder!=4);

        bill();
    }


   

    public void bill(){
        Payment p= new Payment();
        Booking r=new Booking();

        double tp1=0.0;
        double tp2=0.0;
        double tp3=0.0;
            String Header =
                    "****Restaurant Mangament System****"+ "\n"
                            + "Staff ID #"+Admin.CurrentUserID+         "\n"
                            + "Date: "+r.Date+"     Time: "+r.Time+"\n"
                            + "---------------------------------"+ "\n"
                            + "Name                   Qty              Amt  "+ "\n"
                            + "---------------------------------------------"+ "\n";

            String amt  =
                             "Tax ="   +  VAT    +                "\n"
                            + "*********************************"+ "\n"
                            + "Thank you. "+                       "\n";


            String bill = Header;

            for ( int i = 0; i < RMS.OrderListDish.size(); i++) {
                String qty1 = "" + RMS.OrderListDish.get(i).getAmount();
                String name1 = "" + RMS.OrderListDish.get(i).getItemName();
                String amount1 = "" + RMS.OrderListDish.get(i).getCost();

                String item1 =
                        name1 + "\t\t\t\t\t" + qty1 + "\t\t" + amount1 + "\n";
                bill = bill + item1;
                tp1 = tp1+ (RMS.OrderListDish.get(i).getAmount() * RMS.OrderListDish.get(i).getCost());
            }

            for (int i = 0; i < RMS.OrderListDessert.size(); i++) {
                String qty2 = "" + RMS.OrderListDessert.get(i).getAmount();
                String name2 = "" + RMS.OrderListDessert.get(i).getItemName();
                String amount2 = "" + RMS.OrderListDessert.get(i).getCost();

                String item2 =
                        name2 + "\t\t\t\t\t" + qty2 + "\t\t" + amount2 + "\n";
                bill = bill + item2;
                tp2 = tp2 + (RMS.OrderListDessert.get(i).getAmount() * RMS.OrderListDessert.get(i).getCost());
            }

            for (int i = 0; i< RMS.OrderListDrink.size(); i++) {
                String qty3 = "" + RMS.OrderListDrink.get(i).getAmount();
                String name3 = "" + RMS.OrderListDrink.get(i).getItemName();
                String amount3 = "" + RMS.OrderListDrink.get(i).getCost();

                String item3 =
                        name3 + "\t\t\t\t\t" + qty3 + "\t" + amount3 + "\n";
                bill = bill + item3;
                tp3 = tp3 + (RMS.OrderListDrink.get(i).getAmount() * RMS.OrderListDrink.get(i).getCost());
            }

            totalcost=tp1+tp2+tp3;
            System.out.println(bill);
            System.out.print("\n \n \nTotal Amount = "+  totalcost   +     "\n");
            System.out.println(amt);
        p.pay();
    }

  
}
