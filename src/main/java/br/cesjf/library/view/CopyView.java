package br.cesjf.library.view;

import br.cesjf.library.controller.CopyController;
import br.cesjf.library.model.Book;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Magazine;
import br.cesjf.library.model.Publication;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CopyView extends javax.swing.JFrame {

    private CopyController copyController;

    public CopyView() {
        initComponents();
        copyController = new CopyController();
        this.fillPublications();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CopyPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbBooksAndMagazines = new javax.swing.JLabel();
        cbBooksAndMagazines = new javax.swing.JComboBox<>();
        chLoanable = new javax.swing.JCheckBox();
        btSave = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Exemplar");
        setResizable(false);

        CopyPanel.setBackground(new java.awt.Color(255, 255, 255));
        CopyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exemplar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lbBooksAndMagazines.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbBooksAndMagazines.setText("Livros/Revistas:");

        chLoanable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chLoanable.setText("Circular");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBooksAndMagazines)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbBooksAndMagazines, 0, 341, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chLoanable)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBooksAndMagazines)
                    .addComponent(cbBooksAndMagazines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chLoanable))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_icon.png"))); // NOI18N
        btSave.setText("Salvar");
        btSave.setMaximumSize(new java.awt.Dimension(99, 33));
        btSave.setMinimumSize(new java.awt.Dimension(99, 33));
        btSave.setPreferredSize(new java.awt.Dimension(99, 33));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear_icon.png"))); // NOI18N
        btClear.setText("Limpar");
        btClear.setMaximumSize(new java.awt.Dimension(99, 33));
        btClear.setMinimumSize(new java.awt.Dimension(99, 33));
        btClear.setPreferredSize(new java.awt.Dimension(99, 33));
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit_icon.png"))); // NOI18N
        btExit.setText("Sair");
        btExit.setMaximumSize(new java.awt.Dimension(99, 33));
        btExit.setMinimumSize(new java.awt.Dimension(99, 33));
        btExit.setPreferredSize(new java.awt.Dimension(99, 33));
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CopyPanelLayout = new javax.swing.GroupLayout(CopyPanel);
        CopyPanel.setLayout(CopyPanelLayout);
        CopyPanelLayout.setHorizontalGroup(
            CopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CopyPanelLayout.createSequentialGroup()
                .addGroup(CopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CopyPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CopyPanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CopyPanelLayout.setVerticalGroup(
            CopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CopyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(CopyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(cbBooksAndMagazines.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um livro!", "Não foi selecionado um livro", JOptionPane.WARNING_MESSAGE);
        } else {
            Publication publication = (Publication) cbBooksAndMagazines.getModel().getSelectedItem();
            Copy copy;
            if(publication instanceof Book) {
                copy = Copy.Builder
                           .newInstance()
                           .setIdBook((Book) publication)
                           .setLoanable(chLoanable.isSelected())
                           .build();
            } else {
                copy = Copy.Builder
                           .newInstance()
                           .setIdMagazine((Magazine) publication)
                           .setLoanable(chLoanable.isSelected())
                           .build();
            }
            copyController.save(copy);
            JOptionPane.showMessageDialog(null, "Exemplar salvo com sucesso!", "Exemplar salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        cbBooksAndMagazines.setSelectedIndex(-1);
        chLoanable.setSelected(false);
    }//GEN-LAST:event_btClearActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CopyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CopyView().setVisible(true);
            }
        });
    }
    
    public void fillPublications() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(copyController.findPublications()));
        cbBooksAndMagazines.setModel(model);
        cbBooksAndMagazines.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CopyPanel;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbBooksAndMagazines;
    private javax.swing.JCheckBox chLoanable;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBooksAndMagazines;
    // End of variables declaration//GEN-END:variables
}
