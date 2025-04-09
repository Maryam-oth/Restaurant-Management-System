/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rms;

/**
 *
 * @author hamsa
 */
public class MenuItems 
{
    
    
   

    public double cost;
    public String itemName;
    public double calories;
    public String classification;
    public int amount;


   
    public MenuItems(){}
  
  
    public String getItemName(){ 
        return itemName; }

  
    public String getClassification(){
        return classification;
    }

  
    public double getCost() {
        return cost;
    }

    
    // Getter 4 of class MenuItems
    public double getCalories() {
        return calories;
    }



   

   
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public void setCost(double cost){
        this.cost=cost; 
    }

    // Setter 3 of class MenuItems
    public void setClassification(String classification) {
        this.classification = classification;
    }

    // Setter 4 of class MenuItems
    public void setAmount(int amount) { 
        this.amount = amount;
    }



    public static void printMenu() {
        for (int i = 0; i < RMS.Dishestlist.size(); i++) {
            System.out.println(RMS.Dishestlist.get(i));
        }
        for (int i = 0; i < RMS.Dessertlist.size(); i++) {
            System.out.println(RMS.Dessertlist.get(i));
        }
        for (int i = 0; i <RMS.Drinklist.size(); i++) {
            System.out.println(RMS.Drinklist.get(i));
        }
    }


    
    
   
    
    
    
}
