/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author alikh
 */
public class Restaurant extends FoodDonor {
    private String typeCuisine;

    public Restaurant(String typeCuisine, String nom, String adresse) {
        super(nom, adresse);
        this.typeCuisine = typeCuisine;
    }

    public String getTypeCuisine() {
        return typeCuisine;
    }

    public void setTypeCuisine(String typeCuisine) {
        this.typeCuisine = typeCuisine;
    }
    
     @Override
    public String toString() {
        return super.toString()+
               "\nType Cuisine: " + typeCuisine;
    } 
    
}
