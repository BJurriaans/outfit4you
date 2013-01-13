package model;

public class Product {

    private int productId;
    private int categorieId;
    private String name;
    private String description;
    private double price;
    private int voorraad;



    public Product() {
        this(-1, -1, "", "", 0.0, 0);
    }

    public Product(int product_id, int categorie_id, String name, String description, double price, int voorraad) {
        this.productId = product_id;
        this.categorieId = categorie_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.voorraad = voorraad;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the categorieId
     */
    public int getCategorieId() {
        return categorieId;
    }

    /**
     * @param categorieId the categorieId to set
     */
    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    public int getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(int voorraad) {
        this.voorraad = voorraad;
    }
    
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean value;
        if (obj instanceof Product) {
            value = this.productId == ((Product)obj).productId; //VB: product1 (met ID 1) past deze methode toe, en geeft product2 als parameter: deze method geeft dan false terug.
        } else {
            value = super.equals(obj);  //van wat is Product een subclass van? en wat heeft dit voor nut?
        }
        return value;
    }

    @Override
    public int hashCode() {   //wth is dit?
        return 13 * 3 + this.productId;
    }
}
