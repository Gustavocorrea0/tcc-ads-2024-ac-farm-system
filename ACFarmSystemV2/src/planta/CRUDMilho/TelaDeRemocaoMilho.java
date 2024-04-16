/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planta.CRUDMilho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import planta.ControlePlanta;
import planta.Milho;
import planta.TelaCRUDMilho;

public class TelaDeRemocaoMilho extends javax.swing.JFrame {

    public TelaDeRemocaoMilho() {
        initComponents();
    }

    private ControlePlanta controlePlanta = new ControlePlanta();
    private String tipoDePlanta = "Milho";
    private String fornecedorPlanta;
    private String cicloEmDias;
    private String dataDePlantio;
    private String dataDeSurgimentoDeEspigas;
    private String alturaAtualDaPlanta;
    private String idPropriedade;
    private String nomePropriedade;
    private String msg;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldFornecedor = new javax.swing.JTextField();
        jTextFieldCicloAproximadoEmDias = new javax.swing.JTextField();
        jTextFieldDataPlantio = new javax.swing.JTextField();
        jTextFieldAlturaPlanta = new javax.swing.JTextField();
        jTextFieldAlturaPlantaAdicionarMilho = new javax.swing.JTextField();
        jTextFieldDataSurgimentoDeEspigas = new javax.swing.JTextField();
        jTextFieldIdMilho = new javax.swing.JTextField();
        jButtonSairDaTelaAdicionarMilho = new javax.swing.JButton();
        jButtonBuscarMilho = new javax.swing.JButton();
        jButtonRemoverMilho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldFornecedor.setEditable(false);
        jTextFieldFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFornecedor.setBorder(null);
        jTextFieldFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 250, 270, 29));

        jTextFieldCicloAproximadoEmDias.setEditable(false);
        jTextFieldCicloAproximadoEmDias.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCicloAproximadoEmDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCicloAproximadoEmDias.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCicloAproximadoEmDias.setBorder(null);
        jTextFieldCicloAproximadoEmDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCicloAproximadoEmDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCicloAproximadoEmDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 462, 330, 29));

        jTextFieldDataPlantio.setEditable(false);
        jTextFieldDataPlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataPlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataPlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.setBorder(null);
        jTextFieldDataPlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataPlantioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataPlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 354, 270, 30));

        jTextFieldAlturaPlanta.setEditable(false);
        jTextFieldAlturaPlanta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlanta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlanta.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlanta.setBorder(null);
        jTextFieldAlturaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 250, 330, 30));

        jTextFieldAlturaPlantaAdicionarMilho.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlantaAdicionarMilho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlantaAdicionarMilho.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlantaAdicionarMilho.setBorder(null);
        jTextFieldAlturaPlantaAdicionarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaAdicionarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlantaAdicionarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 330, 30));

        jTextFieldDataSurgimentoDeEspigas.setEditable(false);
        jTextFieldDataSurgimentoDeEspigas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataSurgimentoDeEspigas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataSurgimentoDeEspigas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataSurgimentoDeEspigas.setBorder(null);
        jTextFieldDataSurgimentoDeEspigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataSurgimentoDeEspigasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataSurgimentoDeEspigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 354, 330, 30));

        jTextFieldIdMilho.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdMilho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdMilho.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdMilho.setBorder(null);
        jTextFieldIdMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 116, 303, 28));

        jButtonSairDaTelaAdicionarMilho.setBorder(null);
        jButtonSairDaTelaAdicionarMilho.setBorderPainted(false);
        jButtonSairDaTelaAdicionarMilho.setContentAreaFilled(false);
        jButtonSairDaTelaAdicionarMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaAdicionarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaAdicionarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaAdicionarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonBuscarMilho.setBorder(null);
        jButtonBuscarMilho.setBorderPainted(false);
        jButtonBuscarMilho.setContentAreaFilled(false);
        jButtonBuscarMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 106, 260, 45));

        jButtonRemoverMilho.setBorder(null);
        jButtonRemoverMilho.setBorderPainted(false);
        jButtonRemoverMilho.setContentAreaFilled(false);
        jButtonRemoverMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 552, 280, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_tela_de_remocao_milho.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFornecedorActionPerformed

    private void jTextFieldCicloAproximadoEmDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCicloAproximadoEmDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCicloAproximadoEmDiasActionPerformed

    private void jTextFieldDataPlantioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataPlantioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataPlantioActionPerformed

    private void jTextFieldAlturaPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaPlantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlturaPlantaActionPerformed

    private void jTextFieldAlturaPlantaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaPlantaAdicionarMilhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlturaPlantaAdicionarMilhoActionPerformed

    private void jTextFieldDataSurgimentoDeEspigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataSurgimentoDeEspigasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataSurgimentoDeEspigasActionPerformed

    private void jButtonBuscarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMilhoActionPerformed
        try {
            consultarPlanta();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRemocaoMilho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMilhoActionPerformed

    private void jTextFieldIdMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdMilhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdMilhoActionPerformed

    private void jButtonSairDaTelaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDMilho().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed

    private void jButtonRemoverMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverMilhoActionPerformed
        // TODO add your handling code here:
        removerPlanta();
    }//GEN-LAST:event_jButtonRemoverMilhoActionPerformed

    public void removerPlanta() {
        int idParaBusca = Integer.parseInt(jTextFieldIdMilho.getText());
        msg = controlePlanta.removerMilho(idParaBusca);
        JOptionPane.showMessageDialog(this, msg);
        
        jTextFieldAlturaPlanta.setText("");
        jTextFieldCicloAproximadoEmDias.setText("");
        jTextFieldDataPlantio.setText("");
        jTextFieldFornecedor.setText("");
        jTextFieldIdMilho.setText(String.valueOf(""));
        jTextFieldDataSurgimentoDeEspigas.setText("");
    }

    public void consultarPlanta() throws ParseException {
        int idParaBusca = Integer.parseInt(jTextFieldIdMilho.getText());
        Milho milhoEncontrado = controlePlanta.consultarMilho(idParaBusca);

        if (milhoEncontrado != null) {
            tipoDePlanta = milhoEncontrado.getTipoDePlanta();
            fornecedorPlanta = milhoEncontrado.getNomeFornecedor();
            cicloEmDias = Integer.toString(milhoEncontrado.getCicloEmDias());
            alturaAtualDaPlanta = Double.toString(milhoEncontrado.getAlturaAtualDaPlanta());

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            Date data1 = formatoSQL.parse(milhoEncontrado.getDataDePlantio().toString());
            Date data2 = formatoSQL.parse(milhoEncontrado.getDataDeSurgimentoDeEspigas().toString());

            dataDeSurgimentoDeEspigas = formatoBrasileiro.format(data2);
            dataDePlantio = formatoBrasileiro.format(data1);

            jTextFieldAlturaPlanta.setText(alturaAtualDaPlanta);
            jTextFieldCicloAproximadoEmDias.setText(cicloEmDias);
            jTextFieldDataPlantio.setText(dataDePlantio);
            jTextFieldFornecedor.setText(fornecedorPlanta);
            jTextFieldIdMilho.setText(String.valueOf(idParaBusca));
            jTextFieldDataSurgimentoDeEspigas.setText(dataDeSurgimentoDeEspigas);

        } else {
            JOptionPane.showMessageDialog(this, "Planta não encontrada");
            jTextFieldAlturaPlanta.setText("");
            jTextFieldCicloAproximadoEmDias.setText("");
            jTextFieldDataPlantio.setText("");
            jTextFieldFornecedor.setText("");
            jTextFieldIdMilho.setText(String.valueOf(""));
            jTextFieldDataSurgimentoDeEspigas.setText("");
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMilho;
    private javax.swing.JButton jButtonRemoverMilho;
    private javax.swing.JButton jButtonSairDaTelaAdicionarMilho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAlturaPlanta;
    private javax.swing.JTextField jTextFieldAlturaPlantaAdicionarMilho;
    private javax.swing.JTextField jTextFieldCicloAproximadoEmDias;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldDataSurgimentoDeEspigas;
    private javax.swing.JTextField jTextFieldFornecedor;
    private javax.swing.JTextField jTextFieldIdMilho;
    // End of variables declaration//GEN-END:variables

}
