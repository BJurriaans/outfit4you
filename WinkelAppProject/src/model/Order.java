/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author davida7
 */
public class Order {

    private int orderId;
    private String naam;
    private String adres;
    private String postcode;
    private String woonplaats;
    private String notes;
    private String betaalmethode;
    private String date;
    
    public Order(int orderId, String naam, String adres, String postcode, String woonplaats, String notes, String betaalmethode, String Date){
        this.orderId = orderId;
        this.naam = naam;
        this.adres = adres;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
        this.notes = notes;
        this.betaalmethode = betaalmethode;
    }
    
    public int getOrderId(){
        return orderId;
    }
    
     public String getName(){
        return naam;
    }
    
    public String getAdres(){
        return adres;
    }
    
    public String getZip(){
        return postcode;
    }
    
    public String getCity(){
        return woonplaats;
    }
    
    public String getNotes(){
        return notes;
    }
    
    public String getPayMethod(){
        return betaalmethode;
    }

    public String getDate(){
        return date;
    }
}

