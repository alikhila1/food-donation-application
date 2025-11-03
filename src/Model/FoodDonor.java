/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author alikh
 */

class InvalidFoodDonationException extends Exception {
    public InvalidFoodDonationException(String message) {
        super(message);
    }
}

public class FoodDonor {
    private String nom;
    private String adresse;
    private ArrayList <Article> articles;
    private Set<Article> foodDonations;

    public FoodDonor(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.articles = new ArrayList <>();
        this.foodDonations = new HashSet <>();
    }

    public Set<Article> getFoodDonations() {
        return foodDonations;
    }

    public void setFoodDonations(Set<Article> foodDonations) {
        this.foodDonations = foodDonations;
    }
    
    
   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }
    

    public void addArticle(Article article) {
        articles.add(article);
    }

    public Article getArticleByCode(int codeProduit) {
        for (Article article : articles) {
            if (article.getCodeProduit() == codeProduit) {
                return article;
            }
        }
        return null; 
    }


    public void updateArticle(int codeProduit, Article newArticle) {
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getCodeProduit() == codeProduit) {
                articles.set(i, newArticle);
                break;
            }
        }
    }

    public void deleteArticle(int codeProduit) {
        Iterator<Article> iterator = articles.iterator();
        while (iterator.hasNext()) {
            Article article = iterator.next();
            if (article.getCodeProduit() == codeProduit) {
                iterator.remove();
                break;
            }
        }
    }
    
    public void foodDonate(ArrayList <Article> arts) throws InvalidFoodDonationException{
        if (arts == null || arts.isEmpty()) {
            throw new InvalidFoodDonationException("La liste de dons d'articles est invalide.");
        }
        else
        {
        this.foodDonations.addAll(arts);
        arts.clear();
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom du donateur: ").append(nom).append("\n")
          .append("Adresse: ").append(adresse).append("\n")
          .append("Articles en stock:\n");
        for (Article article : articles) {
            sb.append(article).append("\n");
        }
        sb.append("Dons alimentaires effectués:\n");
        for (Article donation : foodDonations) {
            sb.append(donation).append("\n");
        }
        return sb.toString();
    }

}
