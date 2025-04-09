/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author hamsa
 */
public class Booking
{
    
    
    
    
    static Scanner input = new Scanner(System.in);

    /*
     * Variables of class Booking
   */

    // instance variables
    private int BookingNo;
    private int numOfClients;
    private int totalNumOfClients = 0;
    private Client clientInfo;
    public static int maxClient = 30;

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat timeFormat = new SimpleDateFormat("HH:mm");
    Date date = new Date();
    Date time = new Date();
    String Date = dateFormat.format(date);
    String Time = timeFormat.format(time);
    private String BookingDate;
    private String BookingTime;
    public int BookingID;

    // constructor
   

    public Booking() { }

    public Booking(int BookingNo ,String BookingDate,String BookingTime,int numOfClints
            ,Client clientInfo) {
        this.BookingNo=BookingNo;
        this.BookingDate = Date;
        this.BookingTime = Time;
        this.numOfClients=numOfClints;
        this.clientInfo = clientInfo;
        totalNumOfClients=totalNumOfClients + numOfClients;
    }

 
    public int getBookingNo() { return BookingNo; }




    public  void addBooking() {
       
       
 
            System.out.println("---- Enter Booking information ----");

input.nextLine(); 
            System.out.println("Enter Client's Name:");
            String ClientName = input.nextLine();
            System.out.println("Enter Client's Email:");
            String ClientEmail = input.next();

            System.out.println("Enter Client's Phone Number:");
            String ClientPhone = input.next();

            System.out.println("Enter Date of Booking dd/MM/yyyy :");
            String BookingDate = input.next();

            System.out.println("Enter Time of Booking HH:mm :");
            String BookingTime= input.next();

            System.out.println("Enter Table size:");
                 int BookingSize = input.nextInt();
                  totalNumOfClients=totalNumOfClients + BookingSize;
                        if (totalNumOfClients <=maxClient && totalNumOfClients >=0 ) {
                           
                               RMS.BookingList.add(new Booking(++BookingID,BookingDate
                                   ,BookingTime,BookingSize,new Client
                                   (ClientName,ClientEmail,ClientPhone)));

            System.out.println("Your Reservation Is Booked with Reservation Num# "+ BookingID);


        } else if ((totalNumOfClients - BookingSize) == 30 ){
                  totalNumOfClients=totalNumOfClients - BookingSize;
                   System.out.println("***  Restaurant Is Full  ***");

                        }else{
          
             totalNumOfClients=totalNumOfClients - BookingSize;
        
             int rest = totalNumOfClients - 30;
              

            System.out.println("We can only accept : " + Math.abs(rest) + " Table size as maximum for this time");
            
        }
                            
    }





    public static void checkBooking(){
        int BookingID;
        System.out.println("|      Enter Booking ID         |");
        BookingID = input.nextInt();

        boolean found=false;
        for(int i = 0; i<RMS.BookingList.size(); i++){
            if(BookingID==RMS.BookingList.get(i).getBookingNo()){
                System.out.println(RMS.BookingList.get(i));
                found=true;
            }
        }
        if(found==false){ System.out.println("Booking not found!"); }
    }



    //toString method
    @Override
    public String toString() {
        return ("BookingNo= " + BookingNo+", BookingDate = "+BookingDate+
                ", BookingTime = "+BookingTime + ", A Table for = "
                +(numOfClients) + ", Client Information = "+ clientInfo);
    }



   
    
    
}

