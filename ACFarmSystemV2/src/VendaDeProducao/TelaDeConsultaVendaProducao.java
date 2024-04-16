package VendaDeProducao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeConsultaVendaProducao extends javax.swing.JFrame {

    public TelaDeConsultaVendaProducao() {
        initComponents();
    }

    private ControleVendaProducao controleVendaProducao = new ControleVendaProducao();

    private String nomeProducao;
    private String nomeCliente;
    private String CNPJOuCPF;
    private String dataProducao;
    private String dataVenda;
    private String valorTotalVenda;
    private String quantidadeDeSacasProducao;
    private String formaDePagamento;
    private String metodoDePagamento;
    private String quantidadeDeParcelas;
    private Date dataVendaEncontrada;
    private Date dataProducaoEncontrada;
    private int codigoBuscado;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonBuscarFornecedor = new javax.swing.JButton();
        jTextFieldProducao = new javax.swing.JTextField();
        jTextFieldNumeroDeSacas = new javax.swing.JTextField();
        jTextFieldDataDaProducao = new javax.swing.JTextField();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldCNPJOuCPF = new javax.swing.JTextField();
        jTextFieldMetodoDePagamento = new javax.swing.JTextField();
        jTextFieldFormaDePagamento = new javax.swing.JTextField();
        jTextFieldQuantidadeDeVezes = new javax.swing.JTextField();
        jTextFieldDataVenda = new javax.swing.JTextField();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jTextFieldCodigoBuscado = new javax.swing.JTextField();
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
        getContentPane().add(jButtonBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 107, 262, 44));

        jTextFieldProducao.setEditable(false);
        jTextFieldProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldProducao.setBorder(null);
        jTextFieldProducao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 225, 319, 29));

        jTextFieldNumeroDeSacas.setEditable(false);
        jTextFieldNumeroDeSacas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroDeSacas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNumeroDeSacas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeSacas.setBorder(null);
        jTextFieldNumeroDeSacas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeSacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDeSacasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroDeSacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 303, 320, 29));

        jTextFieldDataDaProducao.setEditable(false);
        jTextFieldDataDaProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDaProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDaProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDaProducao.setBorder(null);
        jTextFieldDataDaProducao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataDaProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDaProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 383, 235, 29));

        jTextFieldCliente.setEditable(false);
        jTextFieldCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCliente.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCliente.setBorder(null);
        jTextFieldCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 468, 319, 29));

        jTextFieldCNPJOuCPF.setEditable(false);
        jTextFieldCNPJOuCPF.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCNPJOuCPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCNPJOuCPF.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCNPJOuCPF.setBorder(null);
        jTextFieldCNPJOuCPF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCNPJOuCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCNPJOuCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCNPJOuCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 553, 325, 29));

        jTextFieldMetodoDePagamento.setEditable(false);
        jTextFieldMetodoDePagamento.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMetodoDePagamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMetodoDePagamento.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMetodoDePagamento.setBorder(null);
        jTextFieldMetodoDePagamento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMetodoDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMetodoDePagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMetodoDePagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 303, 220, 29));

        jTextFieldFormaDePagamento.setEditable(false);
        jTextFieldFormaDePagamento.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFormaDePagamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldFormaDePagamento.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFormaDePagamento.setBorder(null);
        jTextFieldFormaDePagamento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldFormaDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormaDePagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFormaDePagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 225, 319, 30));

        jTextFieldQuantidadeDeVezes.setEditable(false);
        jTextFieldQuantidadeDeVezes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeDeVezes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeDeVezes.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeVezes.setBorder(null);
        jTextFieldQuantidadeDeVezes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeDeVezesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeDeVezes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 383, 220, 29));

        jTextFieldDataVenda.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataVenda.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataVenda.setBorder(null);
        jTextFieldDataVenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 467, 220, 30));

        jTextFieldValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotal.setBorder(null);
        jTextFieldValorTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 552, 325, 30));

        jTextFieldCodigoBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigoBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCodigoBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoBuscado.setBorder(null);
        jTextFieldCodigoBuscado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigoBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 114, 272, 30));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVendaProducao/img_tela_de_consulta_vendas.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioVendasProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jTextFieldNumeroDeSacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeSacasActionPerformed

    }//GEN-LAST:event_jTextFieldNumeroDeSacasActionPerformed

    private void jTextFieldDataDaProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDaProducaoActionPerformed

    }//GEN-LAST:event_jTextFieldDataDaProducaoActionPerformed

    private void jTextFieldClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteActionPerformed

    }//GEN-LAST:event_jTextFieldClienteActionPerformed

    private void jTextFieldValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalActionPerformed

    }//GEN-LAST:event_jTextFieldValorTotalActionPerformed

    private void jTextFieldQuantidadeDeVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeDeVezesActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeDeVezesActionPerformed

    private void jTextFieldCNPJOuCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCNPJOuCPFActionPerformed

    }//GEN-LAST:event_jTextFieldCNPJOuCPFActionPerformed

    private void jTextFieldProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProducaoActionPerformed

    }//GEN-LAST:event_jTextFieldProducaoActionPerformed

    private void jTextFieldFormaDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormaDePagamentoActionPerformed

    }//GEN-LAST:event_jTextFieldFormaDePagamentoActionPerformed

    private void jButtonBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFornecedorActionPerformed
        try {
            buscarVendaDeProducao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeConsultaVendaProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeConsultaVendaProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFornecedorActionPerformed

    private void jTextFieldMetodoDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMetodoDePagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMetodoDePagamentoActionPerformed

    private void jTextFieldDataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataVendaActionPerformed

    private void jTextFieldCodigoBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoBuscadoActionPerformed

    public void buscarVendaDeProducao() throws SQLException, ParseException {
        codigoBuscado = Integer.parseInt(jTextFieldCodigoBuscado.getText());

        VendaProducao vendaProducaoEncontrada = controleVendaProducao.buscarVenda(codigoBuscado);

        SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

        if (vendaProducaoEncontrada != null) {

            dataProducaoEncontrada = formatoSQL.parse(vendaProducaoEncontrada.getDataProducao().toString());
            dataVendaEncontrada = formatoSQL.parse(vendaProducaoEncontrada.getDataVenda().toString());

            nomeProducao = vendaProducaoEncontrada.getNomeProducao();
            nomeCliente = vendaProducaoEncontrada.getNomeCliente();
            CNPJOuCPF = vendaProducaoEncontrada.getCNPJOuCPF();
            dataProducao = formatoBrasileiro.format(dataVendaEncontrada);
            dataVenda = formatoBrasileiro.format(dataProducaoEncontrada);
            valorTotalVenda = Double.toString(vendaProducaoEncontrada.getValorTotalVenda());
            quantidadeDeSacasProducao = Integer.toString(vendaProducaoEncontrada.getQuantidadeDeSacasProducao());
            formaDePagamento = vendaProducaoEncontrada.getFormaDePagamento();
            metodoDePagamento = vendaProducaoEncontrada.getMetodoDePagamento();
            quantidadeDeParcelas = Integer.toString(vendaProducaoEncontrada.getQuantidadeDeParcelas());
            
            jTextFieldCliente.setText(nomeCliente);
            jTextFieldDataDaProducao.setText(dataProducao);
            jTextFieldDataVenda.setText(dataVenda);
            jTextFieldFormaDePagamento.setText(formaDePagamento);
            jTextFieldMetodoDePagamento.setText(metodoDePagamento);
            jTextFieldNumeroDeSacas.setText(quantidadeDeSacasProducao);
            jTextFieldProducao.setText(nomeProducao);
            jTextFieldQuantidadeDeVezes.setText(quantidadeDeParcelas);
            jTextFieldValorTotal.setText(valorTotalVenda);
            jTextFieldCNPJOuCPF.setText(CNPJOuCPF);
            
        } else {
            JOptionPane.showMessageDialog(this, "Venda não encontrada");
            jTextFieldCliente.setText("");
            jTextFieldDataDaProducao.setText("");
            jTextFieldDataVenda.setText("");
            jTextFieldFormaDePagamento.setText("");
            jTextFieldMetodoDePagamento.setText("");
            jTextFieldNumeroDeSacas.setText("");
            jTextFieldProducao.setText("");
            jTextFieldQuantidadeDeVezes.setText("");
            jTextFieldValorTotal.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarFornecedor;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JTextField jTextFieldCNPJOuCPF;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodigoBuscado;
    private javax.swing.JTextField jTextFieldDataDaProducao;
    private javax.swing.JTextField jTextFieldDataVenda;
    private javax.swing.JTextField jTextFieldFormaDePagamento;
    private javax.swing.JTextField jTextFieldMetodoDePagamento;
    private javax.swing.JTextField jTextFieldNumeroDeSacas;
    private javax.swing.JTextField jTextFieldProducao;
    private javax.swing.JTextField jTextFieldQuantidadeDeVezes;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
