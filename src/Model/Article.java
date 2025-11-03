/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alikh
 */

public class Article {

    private String NomProduit;
    private int CodeProduit;
    private String Description;
    private CategorieProduit Catégorie;
    private Date DateExpire;

    public Article(String NomProduit, int CodeProduit, String Description, CategorieProduit Catégorie, Date DateExpire) {
        this.NomProduit = NomProduit;
        this.CodeProduit = CodeProduit;
        this.Description = Description;
        this.Catégorie = Catégorie;
        this.DateExpire = DateExpire;
    }

    public String getNomProduit() {
        return NomProduit;
    }

    public void setNomProduit(String NomProduit) {
        this.NomProduit = NomProduit;
    }

    public int getCodeProduit() {
        return CodeProduit;
    }

    public void setCodeProduit(int CodeProduit) {
        this.CodeProduit = CodeProduit;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CategorieProduit getCatégorie() {
        return Catégorie;
    }

    public void setCatégorie(CategorieProduit Catégorie) {
        this.Catégorie = Catégorie;
    }

    public Date getDateExpire() {
        return DateExpire;
    }

    public void setDateExpire(Date DateExpire) {
        this.DateExpire = DateExpire;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateExpireStr = (DateExpire != null) ? sdf.format(DateExpire) : "N/A";
        return "Nom du produit : " + NomProduit +
                "\nCode du produit : " + CodeProduit +
                "\nDescription : " + Description +
                "\nCatégorie : " + Catégorie +
                "\nDate d'expiration : " + dateExpireStr;
    }
    
    
}
