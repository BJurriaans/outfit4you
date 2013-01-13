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


    private int productId;
    private int orderId;
    private int amount;
    private String naam;
    private String adres;
    private String postcode;
    private String woonplaats;
    private String notes;
    private String betaalmethode;
    private String date;
    public Order(int productId, int orderId, int amount){
        this.productId = productId;
        this.orderId = orderId;
        this.amount = amount;
    }
    
    public int getProductId(){
        return productId;
    }
    
   
    
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
    

    public int getAmount(){
        return amount;
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

