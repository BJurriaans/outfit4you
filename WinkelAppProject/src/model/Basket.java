package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import main.WinkelApplication;
import view.Payment;

public class Basket extends Observable {

    private final Map<Product, Integer> products;

    public Basket() {
        super();
        products = new LinkedHashMap<Product, Integer>(); //Map zorgt ervoor dat keys??? aan values word gebonden (dit is een soort van variabele[i], i staat voor de key
    }

    public void addProduct(Product product) {
        // check if product is allready added to the basket
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + 1);
            
        } else {
            products.put(product, 1); 
        }
        setChanged();
        notifyObservers();
    }

    public void deleteProduct(Product product) {
        // check if product is allready added to the basket
        int i = WinkelApplication.getBasket().getProductAmount(product);
        
        if (WinkelApplication.getBasket().getProductAmount(product) == 1) {
           
            products.remove(product);
            WinkelApplication.getInstance().showPanel(new view.Payment());

        }else{
            i--;
            products.put(product, i);
            WinkelApplication.getInstance().showPanel(new view.Payment());
        }
         
        if (products.size() == 0) {
            WinkelApplication.getInstance().showPanel(new view.CategoryList());
        }
    }

    public void empty() {
        products.clear();
        setChanged();
        notifyObservers();
    }

    public List<Product> getProducts() {
        List<Product> list = new LinkedList<Product>(products.keySet());
        return list;
    }

    public int getProductAmount(Product product) {
        return products.get(product);
    }

    public int size() {
        return products.size();
    }

    public double getTotalCosts() {
        double total = 0.0;
        for (Entry<Product, Integer> entry : products.entrySet()) {  //gaat de lijst van producten af in basket, en doet de prijs bij totaal * het hoeveelheid van zo'n product
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}
