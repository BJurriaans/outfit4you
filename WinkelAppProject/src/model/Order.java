/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author davida7
 */
public class Order {

    private int productId;
    private int orderId;
    private int amount;
    
    public Order(int productId, int orderId, int amount){
        this.productId = productId;
        this.orderId = orderId;
        this.amount = amount;
    }
    
    public int getProductId(){
        return productId;
    }
    
    public int getOrderId(){
        return orderId;
    }
    
    public int getAmount(){
        return amount;
    }
    
}

