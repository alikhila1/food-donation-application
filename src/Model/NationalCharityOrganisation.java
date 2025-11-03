/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alikh
 */
public class NationalCharityOrganisation implements CharityOrganization{
 private String nom;
private String adresse;
private Map<String, List<Article>> historiqueDons;


    public NationalCharityOrganisation(String nom, String adresse) {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le clé : ");
        String cle = scanner.nextLine();
        historiqueDons.put(cle, articles);
    }


 @Override
    public void evaluateDonatedFood(List<Article> articles) {
        
    }

 @Override
    public void distributeDonations() {
        
    }
    
    public void addDonation(String cle, List<Article> articles) {
        historiqueDons.put(cle, articles);
    }

    public List<Article> getArticlesByKey(String cle) {
        return historiqueDons.get(cle);
    }

    public void updateDonation(String cle, List<Article> newArticles) {
        historiqueDons.put(cle, newArticles);
    }

    public void deleteDonation(String cle) {
        historiqueDons.remove(cle);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom de l'organisation : ").append(nom).append("\n")
          .append("Adresse : ").append(adresse).append("\n")
          .append("Historique des dons : \n");
        
        for (Map.Entry<String, List<Article>> entry : historiqueDons.entrySet()) {
            sb.append("Clé : ").append(entry.getKey()).append("\n");
            sb.append("Articles : ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }
}
