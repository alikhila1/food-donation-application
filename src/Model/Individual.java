/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author alikh
 */
public class Individual extends FoodDonor {
    private String tel;
    private String region;

    public Individual(String tel, String region, String nom, String adresse) {
        super(nom, adresse);
        this.tel = tel;
        this.region = region;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

     @Override
    public String toString() {
        return super.toString()+
               "\nTéléphone: " + tel +
               "\nRégion: " + region ;
    }   
    
    
    
    
}
