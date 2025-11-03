/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;



/**
 *
 * @author alikh
 */
public class SuperMarket extends FoodDonor {
     private String type;
    private boolean produitsPerissables;
    private String calendrierDons; 
    private int nombreDons;

    public SuperMarket(String nom, String adresse,String type, boolean produitsPerissables, String calendrierDons) {
        super(nom,adresse);
        this.type = type;
        this.produitsPerissables = produitsPerissables;
        this.calendrierDons = calendrierDons;
        this.nombreDons = 0;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isProduitsPerissables() {
        return produitsPerissables;
    }

    public void setProduitsPerissables(boolean produitsPerissables) {
        this.produitsPerissables = produitsPerissables;
    }

    public String getCalendrierDons() {
        return calendrierDons;
    }

    public void setCalendrierDons(String calendrierDons) {
        this.calendrierDons = calendrierDons;
    }

    public int getNombreDons() {
        return nombreDons;
    }

    public void setNombreDons(int nombreDons) {
        this.nombreDons = nombreDons;
    }
    
     @Override
    public void addArticle(Article article) {
        super.addArticle(article);
        this.nombreDons+=1;
    }
    
     @Override
    public void deleteArticle(int codeProduit) {
        super.deleteArticle(codeProduit);
        this.nombreDons-=1;
    }
    
     @Override
    public String toString() {
        return super.toString() +
               "\nType: " + type +
               "\nProduits périssables: " + produitsPerissables +
               "\nCalendrier des dons: " + calendrierDons +
               "\nNombre de dons effectués: " + nombreDons;
    }
    
    
}
