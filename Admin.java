/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hamsa
 */
public class Admin extends User
{
    
    
    
     /*
     * Variables of Class Admin
    */

    static Scanner input = new Scanner(System.in);
    static int adminID=2210001;


    int AdminID;
    String Pass;
    double Salary;
    static public int numberOfWaiter = 0;
    public static int CurrentUserID;


    /******
     * Constructor for objects of class Admin
     **********/

    public Admin(String UserName, int AdminID,String Password, double Salary,String Email,String PhoneNum )
       {
        this.UserName = UserName;
        this.AdminID = AdminID;
        this.Pass = Password;
        this.Salary = Salary;
        this.Email=Email;
        this.PhoneNum=PhoneNum;
        numberOfWaiter++;
    }
 

    // Getter  of class Admin
    public int getAdminId() { 
        return AdminID;
    }
   
    public double getSalary() { 
        return Salary; 
    }
    
    public String getAdminPassword() { return Pass; }


  

    public static void Loginn()
    {
        String Type,Username,Password;
        boolean found=false;
        boolean found1=true;
        boolean found2=true;

        System.out.println("-------------------------------");
        System.out.println(" Enter 'Y' or 'N'\nLogin as manager? (Y/N)");
        Type = input.next();

    do{

        //LOG IN AS A MANAGER
        if (Type.equalsIgnoreCase("Y") && found1==true)
        {


           
           System.out.println(" Enter Manger's Username:  ");
           Username =input.next();
           System.out.println(" Enter Manger's Password:   ");
           Password=input.next();
            
            if (Username.equals(RMS.Stafflist.get(0).getAdminUserName()) && Password.equals(RMS.Stafflist.get(0).getAdminPassword()))
            {
               
                //GIVE ACCESS TO MANAGER'S MENU
               CurrentUserID=RMS.Stafflist.get(0).getAdminId();
               Admin.ManagerMenu();
               found=true;
            }

         else{
              System.out.println("Manager User Not Found... INVALID ENTRY!!");
              System.out.println(" Enter 'Y' or 'N'" + "\n Try Again as manager? (Y/N)");
              String T = input.next();
                  if(T.equalsIgnoreCase("Y")){ found1=true; }
                  else if(T.equalsIgnoreCase("N")){found1=false;}
                  else{found1=false;}
                }

        }

        
    else if (Type.equalsIgnoreCase("N")&& found2==true) {

            
            System.out.println(" Enter Employee's Username:  ");
            Username =input.next();
            System.out.println(" Enter Employee's Password:  ");
            Password=input.next();

            
            for (int i=1; i<Admin.numberOfWaiter; i++)
            {
             if (Username.equals(RMS.Stafflist.get(i).getAdminUserName()) && Password.equals(RMS.Stafflist.get(i).getAdminPassword()))
              {
                
                CurrentUserID=RMS.Stafflist.get(i).getAdminId();
                Admin.EmployeeMenu();
                 found=true;
              }
            }
            if(found==false){
            System.out.println(" Employee User Not Found... INVALID ENTRY!!");
            System.out.println(" Enter 'Y' or 'N'" + "\nDo You Want To Try Again as Employee? (Y/N)");
            String T = input.next();

            if(T.equalsIgnoreCase("Y")){ found2=true; }
            else if(T.equalsIgnoreCase("N")){found2=false;found=true;}
            else{found2=false;}

            }


            }

       else {
                found=true;
                System.out.println("INVALID ENTRY!!");
            }

        }while (found==false);
    }

    /******************
     *  END */

    public static void ManagerMenu(){

            int Choice;
            do {
                System.out.println(
                     "\n------------------\n"+
                     " --------- Hello There Boss Lady "+RMS.Stafflist.get(0).getAdminUserName() +
                     " ---------\n"+RMS.MANAGERMENU);

                Choice =input.nextInt();

                switch(Choice) {
                    case 1:

                            if (Admin.numberOfWaiter >= 1 && Admin.numberOfWaiter <= 10) {
                                String Ans;
                                do {
                                System.out.println("--- Enter Waiteress information ---");

                                System.out.println("Enter Waiteress User Name:");
                                String waitressName = input.next();

                                System.out.println("Enter Waiteress Password:");
                                String waitressPassword = input.next();

                                System.out.println("Enter Waiteress Salary:");
                                double waitressSalary = input.nextDouble();

                                System.out.println("Enter Waiteress Email:");
                                String waiteressEmail = input.next();

                                System.out.println("Enter Waiteress Phone Number:");
                                String waiterPhoneNo = input.next();

                                Admin NewWaiter = new Admin(waitressName,adminID++, waitressPassword,
                                        waitressSalary,waiteressEmail,waiterPhoneNo);

                                RMS.Stafflist.add(NewWaiter);

                                System.out.println("*** Waiteress is Added with ID NO#"+adminID+"***");
                                System.out.println("Do You Want to Add Another Waiteress? (Y/N)");

                                Ans = input.next();

                                }
                                while(Ans.equalsIgnoreCase("Y"));
                            if (Ans.equalsIgnoreCase("N")) {
                                System.out.println("*** Waiteress is Added ***");
                                }
                            else {System.out.println("INVALID ENTRY!!"); }
                            } else
                                System.out.println("*** Number of Waitersses Completed ***");

                        break;

                    case 2:

                        System.out.println("Enter The Waiteress's ID you want to remove:");
                        int ID=input.nextInt();
                        boolean foundRemove=false;
                        for (Admin RemoveWaiter : RMS.Stafflist) {
                            if(RemoveWaiter.AdminID==ID)
                            {
                                foundRemove=true;
                                RMS.Stafflist.remove(RemoveWaiter);
                                Admin.numberOfWaiter--;
                                System.out.println("the Waiteress have been remove successfully! ");
                                break;
                            }
                        }
                        if (foundRemove==false){
                            System.out.println(" There is No Waiteress that has this ID !");}

                        break;

                    case 3:

                        for (int i=1;i<RMS.Stafflist.size();i++) {
                            System.out.println("=========     Waiteresses    ==========");
                            System.out.println(" Waiteress User Name: "+ RMS.Stafflist.get(i).getAdminUserName());
                            System.out.println(" Waiteress's ID: "+ RMS.Stafflist.get(i).getAdminId());
                            System.out.println(" Waiteress's Password: "+RMS.Stafflist.get(i).getAdminPassword());
                            System.out.println(" Waiteress's Salary: "+RMS.Stafflist.get(i).getSalary());
                            System.out.println(" Waiteress's Email: "+RMS.Stafflist.get(i).getEmail());
                            System.out.println(" Waiteress's Phone No: "+RMS.Stafflist.get(i).getPhoneNum());
                            System.out.println("====================================");
                        }
                        break;

                    case 4:

                        System.out.println("Enter Waiteress ID : ");
                        int waiterID= input.nextInt();
                        boolean foundBonus=false;
                          for (Admin bounsWaiter : RMS.Stafflist) {
                        if(bounsWaiter.AdminID==waiterID) {
                                System.out.println("The Salary before Bonus : "+bounsWaiter.Salary);

                                System.out.println("Enter The Number of Extra Hours : ");
                                double hours=input.nextDouble();

                                if(hours<=8) {
                                    System.out.println(" No Need for Bonus!!  ");}

                                else if(hours>8&&hours<=10) {
                                    bounsWaiter.Salary+=50;
                                    System.out.println("The Salary after Bonus : "+bounsWaiter.Salary);

                                }

                                else if(hours>10&&hours<=12) {
                                    bounsWaiter.Salary+=100;
                                    System.out.println("The Salary after Bonus : "+bounsWaiter.Salary);
                                }

                                else if(hours>12&&hours<=14) {
                                    bounsWaiter.Salary+=150;
                                    System.out.println("The Salary after Bonus : "+bounsWaiter.Salary);
                                }

                                else{ System.out.println("WRONG ENTRY!!"); }
                                  foundBonus=true;
                                   break;
                            }


                        }
                          if(foundBonus==false){
                              System.out.println(" There is No Waiteress that has this ID !!"); }
                        break;

                    case 5:
                        System.out.println("Have an awesome day");
                        RMS.mainChoice();
                        break;

                    default:
                        System.out.println("INVALID ENTRY!!");
                }
            } while(Choice == 5);
            ManagerMenu();

    }

    /*******************
     *  END */

    public static void EmployeeMenu()
    {
        int ChoiceOption,ChoiceSelection;
        do{
            System.out.println(RMS.EMPLOYEEMENU1);
            ChoiceOption = input.nextInt();


            if (ChoiceOption==1) {
                int n = RMS.OrderNum;
                Order o = new Order();
                o.orderFood();
                RMS.OrderArray[n]= o;
            }

            System.out.println(RMS.EMPLOYEEMENU2);
            ChoiceSelection = input.nextInt();

             if (ChoiceOption==2) {
                switch (ChoiceSelection) {
                    case 1 : ManageEmployeeMenu(RMS.Dishestlist, 1);break;
                    case 2 :ManageEmployeeMenu(RMS.Dessertlist, 1);break;
                    case 3 : ManageEmployeeMenu(RMS.Drinklist, 1);break;
                }
            }
            else if (ChoiceOption==3){
                switch (ChoiceSelection) {
                    case 1: ManageEmployeeMenu(RMS.Dishestlist, 2);break;
                    case 2 :ManageEmployeeMenu(RMS.Dessertlist, 2);break;
                    case 3: ManageEmployeeMenu(RMS.Drinklist, 2);break;
                }
            }
            else if (ChoiceOption==4){
                switch (ChoiceSelection) {
                    case 1: ManageEmployeeMenu(RMS.Dishestlist,3);break;
                    case 2:ManageEmployeeMenu(RMS.Dessertlist,3);break;
                    case 3: ManageEmployeeMenu(RMS.Drinklist,3);break;
                }} }  while(ChoiceOption!=5);
}

    /*
     * 3 END OF Other Method of class Admin (EMPLOYEE'S MENU ONLY)
   */

    public static void ManageEmployeeMenu(ArrayList list, int choice) {
        String itemName, category, Type, newName, newCategory;
        double calories, price, newPrice;
        int p, choiceReplace;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        switch (choice) {
            case 1:
                System.out.println("|        1.Enter itemName            |");
                itemName = input.next();
                System.out.println("|        2.Enter calories            |");
                calories = input.nextDouble();
                System.out.println("|        3.Enter category            |");
                category = input.next();
                System.out.println("|        4.Enter price               |");
                price = input.nextDouble();
                if (list == RMS.Dishestlist) {
                    System.out.println("|        5.Enter 1 if withSpicy      |");
                    System.out.println("|          and 0 if withoutSpicy     |");
                    Type = input.next();
                    list.add(new Dishes(itemName, calories, category, price, Type,0));
                } else if (list == RMS.Dessertlist) {
                    System.out.println("|        5.Enter 1 if diet      |");
                    System.out.println("|          and 0 if normal      |");
                    Type = input.next();
                    list.add(new Desserts(itemName, calories, category, price, Type,0));
                } else if (list == RMS.Drinklist) {
                    System.out.println("|        5.Enter 1 if cold           |");
                    System.out.println("|          and 0 if hot              |");
                    Type = input.next();
                    list.add(new Drinks(itemName, calories, category, price, Type,0));
                }
            break;
            case 2:
                System.out.println("Enter pos of item to remove :");
                p = input.nextInt();
                list.remove(p);
            break;
            case 3 :
                System.out.println("|        Enter pos of replace |");
                p = input.nextInt();
                System.out.println("|        what to replace ?         |");
                System.out.println("|        1.itemName                |");
                System.out.println("|        2.price                   |");
                System.out.println("|        3.category                |");
                choiceReplace = input.nextInt();
                switch (choiceReplace) {
                    case 1 :
                        System.out.println("|        Enter new name            |");
                        newName = input.next();
                        if (list == RMS.Dishestlist)
                            RMS.Dishestlist.get(p).setItemName(newName);
                        else if (list == RMS.Dessertlist)
                            RMS.Dessertlist.get(p).setItemName(newName);
                        else if (list == RMS.Drinklist)
                            RMS.Drinklist.get(p).setItemName(newName);
                    break;

                    case 2:
                        System.out.println("|        Enter new price           |");
                        newPrice = input.nextDouble();
                        if (list == RMS.Dishestlist)
                            RMS.Dishestlist.get(p).setCost(newPrice);
                        else if (list == RMS.Dessertlist)
                            RMS.Dessertlist.get(p).setCost(newPrice);
                        else if (list == RMS.Drinklist)
                            RMS.Drinklist.get(p).setCost(newPrice);
                    break;
                    case 3:
                        System.out.println("|        Enter new category        |");
                        newCategory = input.next();
                        if (list == RMS.Dishestlist)
                            RMS.Dishestlist.get(p).setClassification(newCategory);
                        else if (list == RMS.Dessertlist)
                            RMS.Dessertlist.get(p).setClassification(newCategory);
                        else if (list == RMS.Drinklist)
                            RMS.Drinklist.get(p).setClassification(newCategory);
                    break;
                }
            break;
        }

        System.out.println("after modification :");
        for (Object o : list) {
            System.out.println(o);
        }

    }

    /**** END **/


    public String toString() {
    return  " UserName= " +UserName+ " Password= "+Pass + " AdminID= " +AdminID+ " Salary= "+Salary;
    }

   
    
      
    
    
}
