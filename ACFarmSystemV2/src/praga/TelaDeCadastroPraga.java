package praga;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeCadastroPraga extends javax.swing.JFrame {

    public TelaDeCadastroPraga() {
        initComponents();
    }

    private ControlePraga controlePraga = new ControlePraga();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();

    private String nomePraga;
    private String dataSurgimentoPraga;
    private Date dataFormatada;
    private String propriedadePraga;
    private String nivelDeAtaquePraga;
    private String estadoDeControlePraga;
    private String nomePropriedade;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNivelDeAtaque = new javax.swing.ButtonGroup();
        botaoControle = new javax.swing.ButtonGroup();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jTextFieldNomePraga = new javax.swing.JTextField();
        jTextFieldDataDeSurgimentoPraga = new javax.swing.JTextField();
        jTextFieldPropriedadeEncontrada = new javax.swing.JTextField();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jComboBoxEstadoDeControle = new javax.swing.JComboBox<>();
        jComboBoxNivelDeAtaque = new javax.swing.JComboBox<>();
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
        getContentPane().add(jTextFieldNomePraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 245, 323, 29));

        jTextFieldDataDeSurgimentoPraga.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDeSurgimentoPraga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDeSurgimentoPraga.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeSurgimentoPraga.setBorder(null);
        jTextFieldDataDeSurgimentoPraga.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeSurgimentoPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDeSurgimentoPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDeSurgimentoPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 372, 322, 29));

        jTextFieldPropriedadeEncontrada.setEditable(false);
        jTextFieldPropriedadeEncontrada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPropriedadeEncontrada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPropriedadeEncontrada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPropriedadeEncontrada.setBorder(null);
        jTextFieldPropriedadeEncontrada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPropriedadeEncontrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPropriedadeEncontradaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPropriedadeEncontrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 499, 322, 29));

        jTextFieldNomePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.setBorder(null);
        jTextFieldNomePropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 114, 270, 29));

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 595, 280, 35));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 107, 260, 43));

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 544, 280, 35));

        jComboBoxEstadoDeControle.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstadoDeControle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Nao" }));
        jComboBoxEstadoDeControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoDeControleActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstadoDeControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 258, 180, -1));

        jComboBoxNivelDeAtaque.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxNivelDeAtaque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alto", "Medio", "Baixo" }));
        jComboBoxNivelDeAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNivelDeAtaqueActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNivelDeAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 258, 200, -1));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPraga/img_tela_cadastro_de_praga.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioPraga().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jTextFieldDataDeSurgimentoPragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeSurgimentoPragaActionPerformed

    }//GEN-LAST:event_jTextFieldDataDeSurgimentoPragaActionPerformed

    private void jTextFieldPropriedadeEncontradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPropriedadeEncontradaActionPerformed

    }//GEN-LAST:event_jTextFieldPropriedadeEncontradaActionPerformed

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        jTextFieldDataDeSurgimentoPraga.setText("");
        jTextFieldNomePraga.setText("");
        jTextFieldNomePropriedade.setText("");
        jTextFieldPropriedadeEncontrada.setText("");
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroPraga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jTextFieldNomePragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePragaActionPerformed

    }//GEN-LAST:event_jTextFieldNomePragaActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        try {
            cadastrarFornecedor();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeCadastroPraga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jComboBoxEstadoDeControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoDeControleActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoDeControleActionPerformed

    private void jComboBoxNivelDeAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNivelDeAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNivelDeAtaqueActionPerformed

    public void cadastrarFornecedor() throws ParseException {
        nomePraga = jTextFieldNomePraga.getText();
        dataSurgimentoPraga = jTextFieldDataDeSurgimentoPraga.getText();
        propriedadePraga = jTextFieldPropriedadeEncontrada.getText();

        nivelDeAtaquePraga = jComboBoxNivelDeAtaque.getSelectedItem().toString();
        estadoDeControlePraga = jComboBoxEstadoDeControle.getSelectedItem().toString();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (nomePraga.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (dataSurgimentoPraga.equals("")) {
            JOptionPane.showMessageDialog(null, "Data Inválida");
            return;
        }

        if (propriedadePraga.equals("")) {
            JOptionPane.showMessageDialog(null, "Cidade Inválida");
            return;
        }

        if (nivelDeAtaquePraga.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Adicione o nivél de Ataque da Praga");
            return;
        }
        
        if (estadoDeControlePraga.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Adicione o estado de Controle da Praga");
            return;
        }

        try {
            dataFormatada = dateFormat.parse(dataSurgimentoPraga);

            controlePraga.praga.setNomePraga(nomePraga);
            controlePraga.praga.setDataSurgimentoPraga(dataFormatada);
            controlePraga.praga.setPropriedadePraga(propriedadePraga);
            controlePraga.praga.setEstadoDeControlePraga(estadoDeControlePraga);
            controlePraga.praga.setNivelDeAtaquePraga(nivelDeAtaquePraga);

            String msg = controlePraga.cadastrarPraga(controlePraga.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
            System.out.println("Falha no sistema, tipo: ");
        }

    }

    public void buscarPropriedade() throws SQLException {
        nomePropriedade = jTextFieldNomePropriedade.getText();
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(nomePropriedade);

        if (propriedadeEncontrada != null) {
            nomePropriedade = propriedadeEncontrada.getNomePropriedade();
            jTextFieldPropriedadeEncontrada.setText(nomePropriedade);
            JOptionPane.showMessageDialog(this, "Propriedade encontrada.");
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoControle;
    private javax.swing.ButtonGroup botaoNivelDeAtaque;
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JComboBox<String> jComboBoxEstadoDeControle;
    private javax.swing.JComboBox<String> jComboBoxNivelDeAtaque;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JTextField jTextFieldDataDeSurgimentoPraga;
    private javax.swing.JTextField jTextFieldNomePraga;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldPropriedadeEncontrada;
    // End of variables declaration//GEN-END:variables
}
