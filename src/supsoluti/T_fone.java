/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supsoluti;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JOptionPane;

/**
 *
 * @author brenno.lima
 */
public class T_fone extends javax.swing.JInternalFrame {

    /**
     * Creates new form T_fone
     */
    public T_fone() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtAr = new javax.swing.JLabel();
        txtComercial = new javax.swing.JLabel();
        txtGo = new javax.swing.JLabel();
        txtGeral = new javax.swing.JLabel();
        txtUniversitario = new javax.swing.JLabel();
        txtCliente = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtSefaz = new javax.swing.JLabel();
        txtReceita = new javax.swing.JLabel();
        txtCaixa = new javax.swing.JLabel();
        txtPje = new javax.swing.JLabel();
        txtProjudi = new javax.swing.JLabel();
        txtSage = new javax.swing.JLabel();
        txtKas = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Telefones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Telefones Úteis - Clique no que deseja copiar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 10, 405, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/binario.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 240, 350);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAr.setText("SUPORTE AR (62) 3412 0232 ");
        txtAr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtArMouseClicked(evt);
            }
        });

        txtComercial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtComercial.setText("COMERCIAL SOLUTI --> 0800 941 6601");
        txtComercial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtComercialMouseClicked(evt);
            }
        });

        txtGo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGo.setText("COMERCIAL GO --> RAMAL 7001");
        txtGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGoMouseClicked(evt);
            }
        });

        txtGeral.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGeral.setText("COMERCIAL GERAL --> RAMAL 7007");
        txtGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGeralMouseClicked(evt);
            }
        });

        txtUniversitario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUniversitario.setText("LOJA UNIVERSITÁRIO --> RAMAL 0202");
        txtUniversitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUniversitarioMouseClicked(evt);
            }
        });

        txtCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCliente.setText("SUP. AO CLIENTE SOLUTI --> 0800 941 6602 - (62) 3999 6000 - (11) 3504-8798");
        txtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAr)
                    .addComponent(txtComercial)
                    .addComponent(txtGo)
                    .addComponent(txtGeral)
                    .addComponent(txtUniversitario)
                    .addComponent(txtCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAr)
                .addGap(5, 5, 5)
                .addComponent(txtComercial)
                .addGap(5, 5, 5)
                .addComponent(txtGo)
                .addGap(5, 5, 5)
                .addComponent(txtGeral)
                .addGap(5, 5, 5)
                .addComponent(txtUniversitario)
                .addGap(5, 5, 5)
                .addComponent(txtCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(240, 220, 520, 140);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtSefaz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSefaz.setText("Sefaz --> (62) 3269-2000 - 0800 648 2900");
        txtSefaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSefazMouseClicked(evt);
            }
        });

        txtReceita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtReceita.setText("Receita --> (11) 3003-0146 - (21) 3805-2000  - (62) 3416-0500 ");
        txtReceita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReceitaMouseClicked(evt);
            }
        });

        txtCaixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCaixa.setText("Suporte Caixa --> (62) 3004-1104 - 0800 726 0104 ");
        txtCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCaixaMouseClicked(evt);
            }
        });

        txtPje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPje.setText("Suporte PJE - 0800 606 4434 ");
        txtPje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPjeMouseClicked(evt);
            }
        });

        txtProjudi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtProjudi.setText("PROJUDI-GO (62) 3901-1392 -  (62) 3901-1394 ");
        txtProjudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProjudiMouseClicked(evt);
            }
        });

        txtSage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSage.setText("Suporte Sage --> (41) 3906-4940 - 0800 941 0049  ");
        txtSage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSageMouseClicked(evt);
            }
        });

        txtKas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtKas.setText("Suporte KASPERSKY --> (11) 3958-3843 - 0800 892 2051  ");
        txtKas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSefaz)
                    .addComponent(txtReceita)
                    .addComponent(txtCaixa)
                    .addComponent(txtPje)
                    .addComponent(txtProjudi)
                    .addComponent(txtSage)
                    .addComponent(txtKas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSefaz)
                .addGap(5, 5, 5)
                .addComponent(txtReceita)
                .addGap(5, 5, 5)
                .addComponent(txtCaixa)
                .addGap(5, 5, 5)
                .addComponent(txtPje)
                .addGap(5, 5, 5)
                .addComponent(txtProjudi)
                .addGap(5, 5, 5)
                .addComponent(txtSage)
                .addGap(5, 5, 5)
                .addComponent(txtKas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(240, 50, 520, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtArMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtAr.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtAr.getText());
    }//GEN-LAST:event_txtArMouseClicked

    private void txtComercialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtComercialMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtComercial.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtComercial.getText());
    }//GEN-LAST:event_txtComercialMouseClicked

    private void txtGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGoMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtGo.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtGo.getText());
    }//GEN-LAST:event_txtGoMouseClicked

    private void txtGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGeralMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtGeral.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtGeral.getText());
    }//GEN-LAST:event_txtGeralMouseClicked

    private void txtUniversitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUniversitarioMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtUniversitario.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtUniversitario.getText());
    }//GEN-LAST:event_txtUniversitarioMouseClicked

    private void txtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClienteMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtCliente.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtCliente.getText());
    }//GEN-LAST:event_txtClienteMouseClicked

    private void txtSefazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSefazMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtSefaz.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtSefaz.getText());
    }//GEN-LAST:event_txtSefazMouseClicked

    private void txtReceitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReceitaMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtReceita.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtReceita.getText());
    }//GEN-LAST:event_txtReceitaMouseClicked

    private void txtCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCaixaMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtCaixa.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtCaixa.getText());
    }//GEN-LAST:event_txtCaixaMouseClicked

    private void txtPjeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPjeMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtPje.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtPje.getText());
    }//GEN-LAST:event_txtPjeMouseClicked

    private void txtProjudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProjudiMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtProjudi.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtProjudi.getText());
    }//GEN-LAST:event_txtProjudiMouseClicked

    private void txtSageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSageMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtSage.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtSage.getText());
    }//GEN-LAST:event_txtSageMouseClicked

    private void txtKasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKasMouseClicked
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(txtKas.getText());
        board.setContents((Transferable) selecao, selecao);
        JOptionPane.showMessageDialog(null,"Copiado! \n" + txtKas.getText());
    }//GEN-LAST:event_txtKasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel txtAr;
    private javax.swing.JLabel txtCaixa;
    private javax.swing.JLabel txtCliente;
    private javax.swing.JLabel txtComercial;
    private javax.swing.JLabel txtGeral;
    private javax.swing.JLabel txtGo;
    private javax.swing.JLabel txtKas;
    private javax.swing.JLabel txtPje;
    private javax.swing.JLabel txtProjudi;
    private javax.swing.JLabel txtReceita;
    private javax.swing.JLabel txtSage;
    private javax.swing.JLabel txtSefaz;
    private javax.swing.JLabel txtUniversitario;
    // End of variables declaration//GEN-END:variables
}