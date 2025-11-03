/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author alikh
 */
public interface CharityOrganization {
    void receiveFoodDonation(List<Article> articles);
    void evaluateDonatedFood(List<Article> articles);
    void distributeDonations();
}
