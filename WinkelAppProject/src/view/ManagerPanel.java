
package view;

import main.WinkelApplication;


public class ManagerPanel extends javax.swing.JPanel {

    public ManagerPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        klantN = new javax.swing.JButton();
        klantOA = new javax.swing.JButton();
        productL = new javax.swing.JButton();
        bestellingP = new javax.swing.JButton();
        bestellingO = new javax.swing.JButton();
        logU = new javax.swing.JButton();
        jlblInLog = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(755, 480));
        setName("mwPanel"); // NOI18N
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
        productL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productLActionPerformed(evt);
            }
        });

        bestellingP.setText("Bestellingen plaatsen");
        bestellingP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestellingPActionPerformed(evt);
            }
        });

        bestellingO.setText("Bestellingen overzicht");
        bestellingO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestellingOActionPerformed(evt);
            }
        });

        logU.setText("Log uit");
        logU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logUActionPerformed(evt);
            }
        });

        jlblInLog.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblInLog.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setText("Ingelogd als");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblInLog, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblInLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
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
                .addContainerGap(151, Short.MAX_VALUE))
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


    private void productLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productLActionPerformed
        // TODO add your handling code here:
        WinkelApplication.getInstance().showPanel(new view.ShowProductList());
    }//GEN-LAST:event_productLActionPerformed

    private void bestellingOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestellingOActionPerformed
        // TODO add your handling code here:
        WinkelApplication.getInstance().showPanel(new view.OrderList());
    }//GEN-LAST:event_bestellingOActionPerformed

    private void logUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logUActionPerformed
        // TODO add your handling code here:
        WinkelApplication.getInstance().showPanel(new view.LogIn());
    }//GEN-LAST:event_logUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bestellingO;
    private javax.swing.JButton bestellingP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlblInLog;
    private javax.swing.JButton klantN;
    private javax.swing.JButton klantOA;
    private javax.swing.JButton logU;
    private javax.swing.JButton productL;
    // End of variables declaration//GEN-END:variables
}
