/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import main.WinkelApplication;

/**
 *
 * @author JuniVermeulen
 */
public class MedewerkerPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedewerkerPanel
     */
    public MedewerkerPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        klantN = new javax.swing.JButton();
        klantOA = new javax.swing.JButton();
        productL = new javax.swing.JButton();
        bestellingP = new javax.swing.JButton();
        bestellingO = new javax.swing.JButton();
        logU = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(755, 480));
        setPreferredSize(new java.awt.Dimension(755, 480));

        klantN.setText("Nieuwe klant toevoegen");
        klantN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klantNActionPerformed(evt);
            }
        });

        klantOA.setText("Klanten overzicht/aanpassen");
        klantOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klantOAActionPerformed(evt);
            }
        });

        productL.setText("Producten Lijst");

        bestellingP.setText("Bestellingen plaatsen");
        bestellingP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestellingPActionPerformed(evt);
            }
        });

        bestellingO.setText("Bestellingen overzicht");

        logU.setText("Log uit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bestellingO, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klantOA, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klantN, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bestellingP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logU, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klantN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestellingP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klantOA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bestellingO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logU, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bestellingPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestellingPActionPerformed
        // TODO add your handling code here:
        WinkelApplication.getInstance().showPanel(new view.CategoryList());
    }//GEN-LAST:event_bestellingPActionPerformed

    private void klantNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klantNActionPerformed
        // TODO add your handling code here:
        WinkelApplication.getInstance().showPanel(new view.NieuweKlant());
    }//GEN-LAST:event_klantNActionPerformed

    private void klantOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klantOAActionPerformed
        // TODO add your handling code here:
             WinkelApplication.getInstance().showPanel(new view.KlantenOverzicht());
    }//GEN-LAST:event_klantOAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bestellingO;
    private javax.swing.JButton bestellingP;
    private javax.swing.JButton klantN;
    private javax.swing.JButton klantOA;
    private javax.swing.JButton logU;
    private javax.swing.JButton productL;
    // End of variables declaration//GEN-END:variables
}
