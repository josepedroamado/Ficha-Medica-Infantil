
package GUI;

import javax.swing.JOptionPane;
import Logic.LogicSystem;
import Logic.Child;
import Logic.Growth;

public class vCrecimientoRegistro extends javax.swing.JFrame {

    LogicSystem sist;
    public vCrecimientoRegistro(LogicSystem s) {
        sist=s;
        initComponents();
        jListHijosEnSistema.setListData(sist.getListAllChildren().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHijosEnSistema = new javax.swing.JList();
        jButtonIng = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelNom = new javax.swing.JLabel();
        jLabelColocNomb = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabelPerimetro = new javax.swing.JLabel();
        jTextFieldPerimetro = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro De Crecimiento");

        jScrollPane1.setViewportView(jListHijosEnSistema);

        jButtonIng.setText("Ingresar");
        jButtonIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelNom.setText("Nombre:");

        jLabelEdad.setText("Edad:");

        jLabelPeso.setText("Peso:");

        jLabelAltura.setText("Altura");

        jLabelPerimetro.setText("Perimetro Craneal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEdad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPeso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAltura)
                                    .addComponent(jLabelNom)
                                    .addComponent(jLabelPerimetro))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                            .addComponent(jTextFieldPerimetro)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabelColocNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 2, Short.MAX_VALUE))))))
                    .addComponent(jLabel1))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIng)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNom)
                            .addComponent(jLabelColocNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEdad)
                            .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPeso)
                            .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAltura)
                            .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPerimetro)
                    .addComponent(jTextFieldPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIng)
                    .addComponent(jButtonCancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngActionPerformed
        // TODO add your handling code here:
        if (sist.getListAllChildren().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe tener al menos un hijo ingresado", "Atención!", JOptionPane.ERROR_MESSAGE);
        }else{
            Child hij = (Child)jListHijosEnSistema.getSelectedValue();
            jLabelColocNomb.setName(hij.getName());
            
            try{
                //Puede que el edad sea al pedo, por como ta compuesto el growth pero no se, lo dejo a tu criterio
                int Edad = Integer.parseInt(jTextFieldEdad.getText());
                float Altura = Integer.parseInt(jTextFieldAltura.getText());
                float Peso = Integer.parseInt(jTextFieldPeso.getText());
                float Perimetro = Integer.parseInt(jTextFieldPerimetro.getText());
                Growth gr = new Growth(hij, Altura, Peso, Perimetro);
                //gr.setAge(Edad);
                hij.getListGrowth().add(gr);
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Tipo De Datos Equivocado", "Atención!", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_jButtonIngActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonIng;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelColocNomb;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPerimetro;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JList jListHijosEnSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldPerimetro;
    private javax.swing.JTextField jTextFieldPeso;
    // End of variables declaration//GEN-END:variables
}
