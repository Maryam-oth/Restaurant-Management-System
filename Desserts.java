/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;

/**
 *
 * @author hamsa
 */
public class Desserts extends MenuItems {

    /**
     * Variables of class Dessert
    **/

    private String dessertType;
    public int noOfDesserts=0;

    /*
     * Constructor for objects of class Dessert*/

    public Desserts(String itemName, double calories, String classification, double cost,String dessertType,int amount){
        this.itemName = itemName;
        this.calories = calories;
        this.classification= "Dessert";
        this.cost = cost;
        this.dessertType = dessertType;
        this.amount=amount;
        noOfDesserts++;
    }

    public int getNoOfDesserts() {
        return noOfDesserts;
    }



    public int getAmount() {
        return amount;
    }




   
    public String getDessertType(){
        return dessertType;
    }


    @Override
    public String toString() {
        return (" ItemName = "+itemName + ", calories= "+ calories+ ", classification= "+classification+
                ", cost= "+cost+", Dessert Type= "+dessertType);
    }

 
}
