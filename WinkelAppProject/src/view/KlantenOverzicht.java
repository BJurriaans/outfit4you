/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import main.WinkelApplication;
import model.Klant;

/**
 *
 * @author JuniVermeulen
 */
public class KlantenOverzicht extends javax.swing.JPanel {

    /**
     * Creates new form KlantenOverzicht
     */
    int aantalKlant;
    Object item;
    public KlantenOverzicht() {
        initComponents();
        
        List<Klant> klantenn = WinkelApplication.getQueryManager().getKlantList();  
        fillTable(klantenn);
        zoekStatus(-1);
        jTable1.getSelectionModel().addListSelectionListener(new SelectionListener());
    }
    
    
       class SelectionListener implements ListSelectionListener {
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting())	// mouse button not released yet
                {return;}
		int row = jTable1.getSelectedRow();
		if(row < 0)				// true when clearSelection
                {return;}
		int col = jTable1.getSelectedColumn();			
		if(col < 0)				// true when clearSelection
                {return;}
                //Fill in textfields with info
                tfKlantid.setText(jTable1.getModel().getValueAt(row, 0).toString());
                tfNaam.setText(jTable1.getModel().getValueAt(row, 1).toString());
                tfAdres.setText(jTable1.getModel().getValueAt(row, 2).toString());
                tfPostcode.setText(jTable1.getModel().getValueAt(row, 3).toString());
                tfWoonplaats.setText(jTable1.getModel().getValueAt(row, 4).toString());
                jTable1.clearSelection();
		}
	}

       //Fill in jtable1 met klanten
       public final void fillTable(List<Klant> klanten){
           DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
           model.getDataVector().removeAllElements();
           aantalKlant = 0;
                   for(Klant klant : klanten){
            model.addRow(new Object[] {new Integer(klant.getKlantId()),
            klant.getNaam(),
            klant.getAdres(),
            klant.getPostcode(),
            klant.getWoonplaats()});
            aantalKlant++;
        }
       }

       public final void zoekStatus(int nummer){
           if(nummer==0){
               jlblZoekStatus.setText("Geen klant gevonden.");
           }
           else if(nummer==1){
               jlblZoekStatus.setText( aantalKlant+" klant gevonden.");
           }
            else if(nummer>=2){
               jlblZoekStatus.setText( aantalKlant+" klanten gevonden.");
           }
            else{
                jlblZoekStatus.setText("");
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

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbKlantToevoegen = new javax.swing.JButton();
        jbTerug = new javax.swing.JButton();
        tfKlantid = new javax.swing.JTextField();
        tfNaam = new javax.swing.JTextField();
        tfAdres = new javax.swing.JTextField();
        tfPostcode = new javax.swing.JTextField();
        tfWoonplaats = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbZoek = new javax.swing.JButton();
        tfZoek = new javax.swing.JTextField();
        jbReset = new javax.swing.JButton();
        jlblZoekStatus = new javax.swing.JLabel();
        jcbZoek = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "klant_id", "naam", "adres", "postcode", "woonplaats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbKlantToevoegen.setText("Nieuwe klant");
        jbKlantToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKlantToevoegenActionPerformed(evt);
            }
        });

        jbTerug.setText("Terug");
        jbTerug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTerugActionPerformed(evt);
            }
        });

        tfKlantid.setEditable(false);

        jLabel1.setText("Klant ID");

        jLabel2.setText("Naam");

        jLabel3.setText("Adres");

        jLabel4.setText("Postcode");

        jLabel5.setText("Woonplaats");

        jbZoek.setText("Zoek ");
        jbZoek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZoekActionPerformed(evt);
            }
        });

        jbReset.setText("Reset");
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });

        jcbZoek.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Klant ID", "Klant naam" }));

        jButton1.setText("Klant aanpassen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbKlantToevoegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbTerug))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(tfWoonplaats)
                    .addComponent(tfPostcode)
                    .addComponent(tfAdres)
                    .addComponent(tfNaam)
                    .addComponent(tfKlantid)
                    .addComponent(jbReset, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jlblZoekStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbZoek, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbZoek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfZoek))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbZoek)
                            .addComponent(jcbZoek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfZoek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblZoekStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfKlantid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfWoonplaats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbKlantToevoegen)
                            .addComponent(jbTerug)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbKlantToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKlantToevoegenActionPerformed
        // TODO add your handling code here:
        WinkelApplication.getInstance().showPanel(new NieuweKlant());
    }//GEN-LAST:event_jbKlantToevoegenActionPerformed

    private void jbTerugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTerugActionPerformed
        // TODO add your handling code here:
         WinkelApplication.getInstance().showPanel(new view.MedewerkerPanel());
    }//GEN-LAST:event_jbTerugActionPerformed

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed
        // TODO add your handling code here:
        List<Klant> klantenn = WinkelApplication.getQueryManager().getKlantList();  
        fillTable(klantenn);
        zoekStatus(-1);
    }//GEN-LAST:event_jbResetActionPerformed

    
    
    private void jbZoekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZoekActionPerformed
        // TODO add your handling code here:
        String Zoek = tfZoek.getText();
        if(!Zoek.equals("")){ 
        if(jcbZoek.getSelectedIndex()==1){
                   
                      List<Klant> klantZoekNaam = WinkelApplication.getQueryManager().getKlantByNaamList(Zoek); 
                      fillTable(klantZoekNaam);
        }
        else if(jcbZoek.getSelectedIndex()==0){
                        List<Klant> klantZoekId = WinkelApplication.getQueryManager().getKlantByIDList(Integer.parseInt(Zoek));
                        fillTable(klantZoekId);
        }
        zoekStatus(aantalKlant);
    }//GEN-LAST:event_jbZoekActionPerformed
/*       */
       else{
            jlblZoekStatus.setText("Box is leeg.");
        }
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbKlantToevoegen;
    private javax.swing.JButton jbReset;
    private javax.swing.JButton jbTerug;
    private javax.swing.JButton jbZoek;
    public javax.swing.JComboBox jcbZoek;
    private javax.swing.JLabel jlblZoekStatus;
    private javax.swing.JTextField tfAdres;
    private javax.swing.JTextField tfKlantid;
    private javax.swing.JTextField tfNaam;
    private javax.swing.JTextField tfPostcode;
    private javax.swing.JTextField tfWoonplaats;
    private javax.swing.JTextField tfZoek;
    // End of variables declaration//GEN-END:variables
}
