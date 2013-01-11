/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.ResultSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.WinkelApplication;
import model.Product;
import connectivity.Dbmanager;
import connectivity.QueryManager;

/**
 *
 * @author davida7
 */
public class ShowProductList extends javax.swing.JPanel {

    /**
     * Creates new form ShowProductList
     */
    private int i = 0;
    private QueryManager queryManager;
    
    public ShowProductList() {
        initComponents();
        btnOpslaan.setVisible(false);
        
        List<Product> products = WinkelApplication.getQueryManager().getProductList();
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        for (Product product : products) {
            model.addRow(new Object[]{new Integer(product.getProductId()),
                        product.getCategorieId(),
                        product.getName(),
                        product.getPrice(),
                        product.getDescription()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnTerugProductList = new javax.swing.JButton();
        btnOpslaan = new javax.swing.JButton();
        btnToevoegen = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setName("ProductLijstPanel"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_id", "Categorie_id", "Naam", "Prijs", "Omschrijving", "Zichtbaar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnTerugProductList.setText("Terug");
        btnTerugProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerugProductListActionPerformed(evt);
            }
        });

        btnOpslaan.setText("Opslaan");
        btnOpslaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpslaanActionPerformed(evt);
            }
        });

        btnToevoegen.setText("Product Toevoegen");
        btnToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenActionPerformed(evt);
            }
        });

        btnDelete.setText("Product Verwijderen");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1))
                    .add(layout.createSequentialGroup()
                        .add(42, 42, 42)
                        .add(btnToevoegen)
                        .add(18, 18, 18)
                        .add(btnDelete)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(btnOpslaan)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnTerugProductList)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 355, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnOpslaan)
                    .add(btnTerugProductList)
                    .add(btnToevoegen)
                    .add(btnDelete))
                .add(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerugProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerugProductListActionPerformed
        // TODO add your handling code here:
        WinkelApplication.getInstance().showPanel(new view.MedewerkerPanel());
    }//GEN-LAST:event_btnTerugProductListActionPerformed
    
    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
        if (i >= 1) {
            btnOpslaan.setVisible(true);
        }
        i++;
        
    }//GEN-LAST:event_jTable1PropertyChange
    
    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed
    
    private void btnOpslaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpslaanActionPerformed
        queryManager = new QueryManager(new Dbmanager());
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        
        int product_id = (Integer) (jTable1.getValueAt(row, 0));
        int category_id = (Integer) (jTable1.getValueAt(row, 1));
        String name = jTable1.getValueAt(row, 2).toString();
        double price = (Double) jTable1.getValueAt(row, 3);
        String description = jTable1.getValueAt(row, 4).toString();
        
        queryManager.updateProductList(product_id, category_id, name, price, description);
        
        btnOpslaan.setVisible(false);
    }//GEN-LAST:event_btnOpslaanActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:  
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenActionPerformed
        // TODO add your handling code here:
        WinkelApplication.getInstance().showPanel(new view.ProductAdd());
    }//GEN-LAST:event_btnToevoegenActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        queryManager = new QueryManager(new Dbmanager());

        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        
        int product_id = (Integer) (jTable1.getValueAt(row, 0));
        int category_id = (Integer) (jTable1.getValueAt(row, 1));
        String name = jTable1.getValueAt(row, 2).toString();
        double price = (Double) jTable1.getValueAt(row, 3);
        String description = jTable1.getValueAt(row, 4).toString();
        
        queryManager.deleteProduct(product_id, category_id, name, price, description);
        WinkelApplication.getInstance().showPanel(new view.ShowProductList());
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOpslaan;
    private javax.swing.JButton btnTerugProductList;
    private javax.swing.JButton btnToevoegen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
