/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;
import java.util.Date;

/**
 *
 * @author alikh
 */
public class FoodDonationApp  {
    public static void main(String[] args){
        CategorieProduit categorie1 = CategorieProduit.FRUITS_ET_LEGUMES;
        CategorieProduit categorie2 = CategorieProduit.VIANDES;
        CategorieProduit categorie3 = CategorieProduit.PRODUITS_LAITIERS;

        
        Article article1 = new Article("Pomme", 1, "Fruit rouge et juteux", categorie1, new Date());
        Article article2 = new Article("Steak", 2, "Viande de boeuf",categorie2, new Date());
        Article article3 = new Article("Lait", 3, "Produit laitier",categorie3, new Date());

        
        System.out.println("Article 1 : " + article1.getNomProduit() + ", Catégorie : " + article1.getCatégorie());
        System.out.println("Article 2 : " + article2.getNomProduit() + ", Catégorie : " + article2.getCatégorie());
        System.out.println("Article 3 : " + article3.getNomProduit() + ", Catégorie : " + article3.getCatégorie());


        SuperMarket superMarket = new SuperMarket("SuperMart", "456 Oak Street", "Supermarché", true, "Lundi - Vendredi");
        superMarket.addArticle(article1);
        superMarket.addArticle(article2);
        superMarket.addArticle(article3);
        
        try {
        superMarket.foodDonate(superMarket.getArticles());
        

        System.out.println("Articles dans les dons de nourriture du SuperMarket :");
        for (Article article : superMarket.getFoodDonations()) {
            System.out.println(article.getNomProduit());
        }
        
        } catch (InvalidFoodDonationException e) {
        System.out.println("Erreur lors du don de nourriture : " + e.getMessage());
        }
    }
}

