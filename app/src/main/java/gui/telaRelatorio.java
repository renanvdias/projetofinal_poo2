/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.BibliotecaManager;
import model.ComboBox;
import model.ComboBoxFactory;
import model.Emprestimo;
import model.Livro;
import model.RelatorioEmprestimos;
import model.RelatorioLivros;
import model.Usuario;

/**
 *
 * @author User
 */
public class telaRelatorio extends javax.swing.JFrame {
    ComboBoxFactory comboBoxFactory = new ComboBox();
    DefaultComboBoxModel<String> usuariosModel = comboBoxFactory.criarModeloUsuarios();
    DefaultComboBoxModel<String> livrosModel = comboBoxFactory.criarModeloLivros();
    /**
     * Creates new form telaLivro
     */
    public telaRelatorio() {
        initComponents();
        areaRelatorio.setEditable(false);
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
        jPanel3 = new javax.swing.JPanel();
        botaoLivros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaRelatorio = new javax.swing.JTextArea();
        botaoLivros1 = new javax.swing.JButton();
        botaoLivros2 = new javax.swing.JButton();
        botaoLivros3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        botaoLivros.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoLivros.setText("RELATORIO LIVROS");
        botaoLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLivrosActionPerformed(evt);
            }
        });

        areaRelatorio.setColumns(20);
        areaRelatorio.setRows(5);
        jScrollPane1.setViewportView(areaRelatorio);

        botaoLivros1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoLivros1.setText("VOLTAR");
        botaoLivros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLivros1ActionPerformed(evt);
            }
        });

        botaoLivros2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoLivros2.setText("RELATORIO EMPRESTIMOS");
        botaoLivros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLivros2ActionPerformed(evt);
            }
        });

        botaoLivros3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoLivros3.setText("IMPRIMIR");
        botaoLivros3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLivros3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(botaoLivros1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoLivros3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(botaoLivros2)
                        .addGap(110, 110, 110))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLivros2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoLivros1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLivros3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLivrosActionPerformed
        BibliotecaManager bibliotecaManager = BibliotecaManager.getInstance();
        RelatorioLivros relatorioLivros = new RelatorioLivros(bibliotecaManager.getLivros()); // Substitua "listaDeLivros" pela sua lista real de livros
        String relatorio = relatorioLivros.gerarRelatorio();
        areaRelatorio.setText(relatorio);
    }//GEN-LAST:event_botaoLivrosActionPerformed

    private void botaoLivros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLivros1ActionPerformed
        telaInicial log = new telaInicial();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoLivros1ActionPerformed

    private void botaoLivros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLivros2ActionPerformed
        BibliotecaManager bibliotecaManager = BibliotecaManager.getInstance();
        RelatorioEmprestimos relatorioEmprestimos = new RelatorioEmprestimos(bibliotecaManager.getEmprestimos()); // Substitua "listaDeLivros" pela sua lista real de livros
        String relatorio = relatorioEmprestimos.gerarRelatorio();
        areaRelatorio.setText(relatorio);
    }//GEN-LAST:event_botaoLivros2ActionPerformed

    private void botaoLivros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLivros3ActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
       if (job.printDialog()) {
           try {
               job.setPrintable(new Printable() {
                   @Override
                   public int print(Graphics g, PageFormat pf, int page) {
                       if (page > 0) {
                           return NO_SUCH_PAGE;
                       }

                       // Obtenha o texto do TextArea para impress�o
                       String textoParaImprimir = areaRelatorio.getText();

                       // Quebre as linhas com base no caractere de nova linha (\n)
                       String[] linhas = textoParaImprimir.split("\n");

                       // Configure a �rea de impress�o e renderize as linhas do texto
                       Graphics2D g2d = (Graphics2D) g;
                       g2d.translate(pf.getImageableX(), pf.getImageableY());
                       int y = 100; // Posi��o vertical inicial
                       for (String linha : linhas) {
                           g2d.drawString(linha, 100, y); // Ajuste as coordenadas conforme necess�rio
                           y += 20; // Ajuste o espa�o vertical entre as linhas conforme necess�rio
                       }

                       return PAGE_EXISTS;
                   }
               });
               job.print();
           } catch (PrinterException ex) {
               ex.printStackTrace();
           }
       }
    }//GEN-LAST:event_botaoLivros3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(telaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaRelatorio;
    private javax.swing.JButton botaoLivros;
    private javax.swing.JButton botaoLivros1;
    private javax.swing.JButton botaoLivros2;
    private javax.swing.JButton botaoLivros3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
