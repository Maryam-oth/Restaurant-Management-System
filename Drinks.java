/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;

/**
 *
 * @author hamsa
 */


/**
 *
 * @author monaalqahtani
 */
public class Drinks extends MenuItems 
{
    


    public String drinkType;
    public int noOfDrinks=0;


   

    public Drinks(String itemName, double calories, String classification, double cost,String drinkType,int amount){
        this.itemName = itemName;
        this.calories = calories;
        this.classification = "Drink";
        this.cost = cost;
        this.drinkType = drinkType;
        this.amount=amount;
        noOfDrinks++;
    }

    public int getNoOfDrinks() {
        return noOfDrinks;
    }

 
    public int getAmount() {
        return amount;
    }


  
    // Getter 1 of class Drink
    public String getDrinkType(){
        return drinkType;
    }



    @Override
    public String toString() {
        
        return  "ItemName = "+itemName + ", calories= "+ calories+ ", classification= "+classification+
                ", cost= "+cost+", Drink Type= "+drinkType;
    }
   
    
    
    
    
}
