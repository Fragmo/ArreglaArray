/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.JOptionPane;

/**
 *
 * @author marcf
 */
public class ventanaArreglo extends javax.swing.JFrame {

    /**
     * Creates new form ventanaArreglo
     */
    public ventanaArreglo() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        textoLeer = new javax.swing.JTextArea();
        botonCentro = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoLeer.setColumns(20);
        textoLeer.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        textoLeer.setRows(5);
        textoLeer.setText("{\"infinitivo\": \"arise\",\"arose\",\"arisen\",\"surgir\"}");
        jScrollPane1.setViewportView(textoLeer);

        botonCentro.setText("Pulsa");
        botonCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCentroMousePressed(evt);
            }
        });

        jToggleButton1.setText("Para el inf");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(botonCentro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCentro)
                    .addComponent(jToggleButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCentroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCentroMousePressed
//        {"infinitivo": "arise","arose","arisen","surgir"},

            int contador = 0;
            for(int i = 0; i<textoLeer.getText().length(); i++){
                if(i+3<=textoLeer.getText().length()){
               System.out.println("numero de veces que doy la vuelta = " + i+ "de " + textoLeer.getText().length()); 
                if(textoLeer.getText().substring(i, i+3).equals("\",\"")){
                    if(contador == -1){
                        contador++;
                    }
                    if(contador == 2){
                        textoLeer.setText(textoLeer.getText().substring(0, i+2) + "traducion : \""+ textoLeer.getText().substring(i+3));
                        contador = -1;
                    }
                    
                    if(contador == 1){
                        textoLeer.setText(textoLeer.getText().substring(0, i+2) + "participio : \""+ textoLeer.getText().substring(i+3));
                        contador++;
                    }
                    
                    if(contador == 0){
                        textoLeer.setText(textoLeer.getText().substring(0, i+2) + "gerundio : \""+ textoLeer.getText().substring(i+3));
                        contador++;
                    }
                    
                  }    
                }
            }
    }//GEN-LAST:event_botonCentroMousePressed

    private void jToggleButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MousePressed
        JOptionPane.showMessageDialog(null, "sustituye el {\" por {infinitivo : \" en el replace, al que se accede pulsando ctrl+h", "como poner el infinitivo para pardillos", 1);
    }//GEN-LAST:event_jToggleButton1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaArreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaArreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaArreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaArreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaArreglo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonCentro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea textoLeer;
    // End of variables declaration//GEN-END:variables
}
