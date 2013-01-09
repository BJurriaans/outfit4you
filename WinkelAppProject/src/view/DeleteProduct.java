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

    public DeleteProduct(Product product) {
        deleteproduct = product;
    }

    public void actionPerformed(ActionEvent event) {
        WinkelApplication.getBasket().deleteProduct(deleteproduct);
    }
}
