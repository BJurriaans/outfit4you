/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTextField;
import main.WinkelApplication;
import model.Product;
import view.Payment;

/**
 *
 * @author davida7
 */
public class DeleteProduct implements ActionListener {

    private Product deleteproduct;
    private int productamount;
    private Payment lblset;
    List<Product> products = WinkelApplication.getBasket().getProducts();

    public void productlist() {

        for (int i = 0; i < products.size(); i++) {
            deleteproduct = products.get(i);
        }
    }

    public void actionPerformed(ActionEvent event) {
        productlist();

        productamount = WinkelApplication.getBasket().getProductAmount(deleteproduct);

        
            WinkelApplication.getBasket().deleteProduct(deleteproduct);
        

       // System.out.println("" + WinkelApplication.getBasket().getProductAmount(deleteproduct));
        //System.out.println("" + products);
        //products.get(productamount) - 1;
        //products.remove(0);
        //System.out.println("" + products);
        // WinkelApplication.getInstance().showPanel(new view.Payment());


    }
}
