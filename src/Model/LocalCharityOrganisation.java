/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alikh
 */
public class LocalCharityOrganisation implements CharityOrganization {

    private String nom;
    private String adresse;
    private Map<String, List<Article>> historiqueDons;

    public LocalCharityOrganisation(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.historiqueDons = new HashMap<>();
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

    public Map<String, List<Article>> getHistoriqueDons() {
        return historiqueDons;
    }

    public void setHistoriqueDons(Map<String, List<Article>> historiqueDons) {
        this.historiqueDons = historiqueDons;
    }

    @Override
    public void receiveFoodDonation(List<Article> articles) {

    }

    @Override
    public void evaluateDonatedFood(List<Article> articles) {

    }

    @Override
    public void distributeDonations() {

    }
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom de l'organisation caritative locale : ").append(nom).append("\n")
          .append("Adresse : ").append(adresse).append("\n")
          .append("Historique des dons :\n");
        
        for (Map.Entry<String, List<Article>> entry : historiqueDons.entrySet()) {
            String date = entry.getKey();
            List<Article> articles = entry.getValue();
            sb.append("Date : ").append(date).append("\n");
            
            for (Article article : articles) {
                sb.append(article).append("\n");
            }
            
            sb.append("------------\n");
        }
        
        return sb.toString();
    }
}
