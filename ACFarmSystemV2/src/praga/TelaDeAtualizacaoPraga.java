package praga;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoPraga extends javax.swing.JFrame {

    public TelaDeAtualizacaoPraga() {
        initComponents();
    }

    private String nomeBuscado;
    private ControlePraga controlePraga = new ControlePraga();
    Date dataSQL;
    String dataBR;

    private String nomePragaAtualizado;
    private String nivelDeAtaquePragaAtualizado;
    private String estadoAtualizado;
    private int idPraga;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonBuscarFornecedor = new javax.swing.JButton();
        jTextFieldDataDeSurgimento = new javax.swing.JTextField();
        jTextFieldPropriedade = new javax.swing.JTextField();
        jTextFieldFornecedorBuscado = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldNomePraga = new javax.swing.JTextField();
        jTextFieldNivelDeAtaque = new javax.swing.JTextField();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jLabelIMGTelaInicialFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 25));

        jButtonBuscarFornecedor.setBorder(null);
        jButtonBuscarFornecedor.setContentAreaFilled(false);
        jButtonBuscarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 107, 260, 44));

        jTextFieldDataDeSurgimento.setEditable(false);
        jTextFieldDataDeSurgimento.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDeSurgimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDeSurgimento.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeSurgimento.setBorder(null);
        jTextFieldDataDeSurgimento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeSurgimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDeSurgimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDeSurgimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 397, 322, 29));

        jTextFieldPropriedade.setEditable(false);
        jTextFieldPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPropriedade.setBorder(null);
        jTextFieldPropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 568, 321, 29));

        jTextFieldFornecedorBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFornecedorBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldFornecedorBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFornecedorBuscado.setBorder(null);
        jTextFieldFornecedorBuscado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldFornecedorBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFornecedorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 114, 272, 30));

        jTextFieldEstado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstado.setBorder(null);
        jTextFieldEstado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 397, 323, 29));

        jTextFieldNomePraga.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePraga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePraga.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePraga.setBorder(null);
        jTextFieldNomePraga.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomePraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePragaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 225, 323, 29));

        jTextFieldNivelDeAtaque.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNivelDeAtaque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNivelDeAtaque.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNivelDeAtaque.setBorder(null);
        jTextFieldNivelDeAtaque.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNivelDeAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNivelDeAtaqueActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNivelDeAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 225, 324, 29));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 596, 280, 34));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setBorderPainted(false);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 544, 280, 34));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPraga/img_tela_atualizacao_praga.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioPraga().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jTextFieldDataDeSurgimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeSurgimentoActionPerformed

    }//GEN-LAST:event_jTextFieldDataDeSurgimentoActionPerformed

    private void jTextFieldPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldPropriedadeActionPerformed

    private void jTextFieldFornecedorBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldFornecedorBuscadoActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldNomePragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePragaActionPerformed

    }//GEN-LAST:event_jTextFieldNomePragaActionPerformed

    private void jTextFieldNivelDeAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNivelDeAtaqueActionPerformed

    }//GEN-LAST:event_jTextFieldNivelDeAtaqueActionPerformed

    private void jButtonBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFornecedorActionPerformed
        try {
            buscarPraga();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoPraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeAtualizacaoPraga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFornecedorActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoção Cancelada");
        jTextFieldNivelDeAtaque.setText("");
        jTextFieldDataDeSurgimento.setText("");
        jTextFieldEstado.setText("");
        jTextFieldPropriedade.setText("");
        jTextFieldNomePraga.setText("");
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        atualizarPraga();
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    public void buscarPraga() throws SQLException, ParseException {
        nomeBuscado = jTextFieldFornecedorBuscado.getText();

        Praga pragaEncontrada = controlePraga.buscarPraga(nomeBuscado);

        if (pragaEncontrada != null) {

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            dataSQL = formatoSQL.parse(pragaEncontrada.getDataSurgimentoPraga().toString());
            dataBR = formatoBrasileiro.format(dataSQL);

            jTextFieldNivelDeAtaque.setText(pragaEncontrada.getNivelDeAtaquePraga());
            jTextFieldDataDeSurgimento.setText(dataBR);
            jTextFieldEstado.setText(pragaEncontrada.getEstadoDeControlePraga());
            jTextFieldPropriedade.setText(pragaEncontrada.getPropriedadePraga());
            jTextFieldNomePraga.setText(pragaEncontrada.getNomePraga());
            idPraga = pragaEncontrada.getIdPraga();

        } else {
            JOptionPane.showMessageDialog(this, "Praga não encontrado");
            jTextFieldNivelDeAtaque.setText("");
            jTextFieldDataDeSurgimento.setText("");
            jTextFieldEstado.setText("");
            jTextFieldPropriedade.setText("");
            jTextFieldNomePraga.setText("");
        }
    }

    public void atualizarPraga() {
        nomePragaAtualizado = jTextFieldNomePraga.getText();
        nivelDeAtaquePragaAtualizado = jTextFieldNivelDeAtaque.getText();
        estadoAtualizado = jTextFieldEstado.getText();

        if (nomePragaAtualizado.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (nivelDeAtaquePragaAtualizado.equalsIgnoreCase("ALTO") || nivelDeAtaquePragaAtualizado.equalsIgnoreCase("MEDIO") || nivelDeAtaquePragaAtualizado.equalsIgnoreCase("BAIXO")) {
            if (estadoAtualizado.equalsIgnoreCase("SIM") || estadoAtualizado.equalsIgnoreCase("NAO")) {
                Praga pragaAtualizada = new Praga();
                pragaAtualizada.setNomePraga(nomePragaAtualizado);
                pragaAtualizada.setEstadoDeControlePraga(estadoAtualizado);
                pragaAtualizada.setNivelDeAtaquePraga(nivelDeAtaquePragaAtualizado);
                pragaAtualizada.setIdPraga(idPraga);
                
                ControlePraga controlePraga1 = new ControlePraga();
                String msgAtualizacao = controlePraga1.atualizarPraga(pragaAtualizada);
                JOptionPane.showMessageDialog(null, msgAtualizacao);
            } else {
                JOptionPane.showMessageDialog(null, "Estado Inválido, apenas SIM ou NAO");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nivél Inválido, apenas ALTO, MEDIO ou BAIXO");
            return;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarFornecedor;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JTextField jTextFieldDataDeSurgimento;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldFornecedorBuscado;
    private javax.swing.JTextField jTextFieldNivelDeAtaque;
    private javax.swing.JTextField jTextFieldNomePraga;
    private javax.swing.JTextField jTextFieldPropriedade;
    // End of variables declaration//GEN-END:variables
}
