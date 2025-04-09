/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author hamsa
 */
public class RMS 
{
    
    
    
     
  

    static ArrayList <Drinks> Drinklist = new ArrayList <>();
    static ArrayList <Desserts> Dessertlist = new ArrayList<>();
    static ArrayList <Dishes> Dishestlist = new ArrayList<>();
    static ArrayList <Admin> Stafflist = new ArrayList <>();
    static ArrayList<Dishes> OrderListDish= new ArrayList<>();
    static ArrayList <Desserts> OrderListDessert = new ArrayList<>();
    static ArrayList<Drinks> OrderListDrink= new ArrayList<>();
    static ArrayList<Booking> BookingList= new ArrayList<>();
    static ArrayList<Client> CustomerList= new  ArrayList<>();
    
    static Order OrderArray [] = new Order[100];
    static int OrderNum =0;
    

    
    

  

    //1 MenuItems of class RMS (MAINMENU)
    static final String MAINMENU=
            "--------------------------------------\n"+
            "|   What Can I Help You With Today   |\n"+
            "--------------------------------------\n"+
            "| Options:                           |\n"+
            "|        1.show menu               |\n"+
            "|        2.check your Booking  |\n"+
            "|        3.make new Booking    |\n"+
            "|        4. Exit                   |\n"+
            "|       101-secret Admin menu      |\n"+
            "====================================\n";

    //2 MenuItems of class RMS (MANAGERMENU)
    static final String MANAGERMENU=
            "|    What Can I Help You With Today    |\n"+
            "----------------------------------------\n"+
            "| Options:                             |\n"+
            "|        1.Add New Waiteress              |\n"+
            "|        2.Remove a Waiteress             |\n"+
            "|        3.Display Waiteresses Information |\n"+
            "|        4.Add a Bonus                  |\n"+
            "|        5.Exit                         |\n"+
            "-----------------------------------------\n";

    //3 MenuItems of class RMS (EMPLOYEEMENU1)
    static final String EMPLOYEEMENU1=
            "--------------------------------------\n"+
            "|   What Can I Help You With Today   |\n"+
            "--------------------------------------\n"+
            "| Options:                         |\n"+
            "|        1.Make new Order          |\n"+
            "|        2.Add item to the menu    |\n"+
            "|        3.remove item in the menu |\n"+
            "|        4.replace item in the menu|\n"+
            "|        5.Exit                    |\n"+
            "--------------------------------------\n";

    //4 MenuItems of class RMS (EMPLOYEEMENU2)
    static final String EMPLOYEEMENU2=
            "--------------------------------------\n"+
            "|        choose selection:         |\n"+
            "|        1.Dishes                  |\n"+
            "|        2.Dessert                 |\n"+
            "|        3.Drink                   |\n"+
            "|        4.Exit                    |\n"+
            "--------------------------------------\n";

    //5 MenuItems of class RMS (PAYMENTMETHODMENU)
    static final String PAYMENTMETHODMENU=
            "--------------------------------------\n"+
            "|        Choose a payment method:  |\n"+
            "|        1.Cash                    |\n"+
            "|        2.Exit                    |\n"+
            "--------------------------------------\n";

  
    // Main menu
  
    public static void main(String[] args) {

      

       
        Dishestlist.add(new Dishes("Fried Rice", 276, "main dish", 55, "Optionally", 0));
        Dishestlist.add(new Dishes("Falafel", 294, "main dish", 30, "Optionally", 0));
        Dishestlist.add(new Dishes("tabbouleh", 131, "main dish", 20, "Optionally", 0));


        Dessertlist.add(new Desserts("Chocolate Lava Cake", 650, "dessert", 35, "normal", 0));
        Dessertlist.add(new Desserts("honey Pie", 524, "dessert", 17, "diet", 0));
        Dessertlist.add(new Desserts("Lemon Cheesecake", 241, "dessert", 27, "diet", 0));

   
        Drinklist.add(new Drinks("Water", 0, "drink", 2, "cold", 0));
        Drinklist.add(new Drinks("Apple Juice", 88, "drink", 11, "cold", 0));
        Drinklist.add(new Drinks("Lemon Juice", 95, "drink", 11, "cold", 0));

       
        Stafflist.add(new Admin("Maryam",2210001, "M12M34", 10000,"Maryam@gamil.com","+966505912322"));
        Stafflist.add(new Admin("Amal", 2210002, "A12A34", 4000,"Amal@gamil.com","+96650591444"));
        Stafflist.add(new Admin("Talia", 2210003, "T12T34", 4000,"Talia@gamil.com","+966505914442"));
        Stafflist.add(new Admin("Yuna",2210004, "Y12Y34", 4000,"Yuna@gamil.com","+9665059144422"));

        
        CustomerList.add(new Client("Ghada123", "Ghada@gamil.com", "+966555825811"));
        CustomerList.add(new Client("Hams123", "Hams@gamil.com", "+966505843574"));
        CustomerList.add(new Client("Mina123", "Mina@gamil.com", "+966505911160"));

       
        BookingList.add(new Booking(2130001, "23/05/2022", " 21:30", 3, new Client("Noura123", "Noura@gamil.com", "+966505912359")));
        BookingList.add(new Booking(2130002, "18/8/2022", "9:00", 6, new Client("Maha123", "Maha@gamil.com", "+966505914443")));
        BookingList.add(new  Booking(2130003, "10/10/2022", "13:40", 2, new Client("Sara123", "Sara@gamil.com", "+966505914123")));


     
        System.out.println("\n***** Welcome to Kale Me Crazy Restaurant *****\n");

       
        mainChoice();

    }

  
    static void mainChoice() {
        
        
        RMS.OrderArray[0] = new Order();
        RMS.OrderArray[1] = new Order();
        
        Scanner input = new Scanner(System.in);
        Booking reservation = new Booking();
        int choice;
        do {
            System.out.println(MAINMENU);
            choice = input.nextInt();
            switch (choice) {
                case 1 :MenuItems.printMenu();break;
                case 2 :Booking.checkBooking();break;
                case 3 : reservation.addBooking();break;
                case 4 : System.out.println("Have a beautiful day");break;
                case 101 : Admin.Loginn();break;
                default : System.out.println("Enter a correct number!");
            }

        } while (choice != 4);

    }

    
    
    
    
}

