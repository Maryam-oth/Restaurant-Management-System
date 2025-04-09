/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;

/**
 *
 * @author hamsa
 */
public class Dishes extends MenuItems 
{
    
 

    private String withSpicy;
    public int noOfDishes=0;


    

    public Dishes(String itemName, double calories, String classification, double cost,String withSpicy,int amount){
        this.itemName = itemName;
        this.calories = calories;
        this.classification = "Dish";
        this.cost = cost;
        this.withSpicy = withSpicy;
        this.amount = amount;
        noOfDishes++;
    }

    public String getWithSpicy() {
        return withSpicy;
    }

    public int getNoOfDishes() {
        return noOfDishes;
    }


    public int getAmount() {
        return amount;
    }

   

    // Getter 1 of class Dishes
    public String isWithSpicy(){
        return withSpicy;
    }


    @Override
    public String toString() {
        return "ItemName = "+itemName + ", calories= "+ calories+ ", "
                + "classification= "+classification+", cost= "+cost+", Spicy= "+isWithSpicy();
            }
  
    
    
    
}
