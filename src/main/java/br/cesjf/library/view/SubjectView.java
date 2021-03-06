package br.cesjf.library.view;

import br.cesjf.library.controller.SubjectController;
import br.cesjf.library.model.Subject;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SubjectView extends javax.swing.JFrame {

    private SubjectController subjectController;
    
    public SubjectView() {
        initComponents();
        subjectController = new SubjectController();
    }
    
    public SubjectView(Subject subject) {
        initComponents();
        subjectController = new SubjectController(subject);
        this.fillData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubjectPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbSubject = new javax.swing.JLabel();
        tfSubject = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Assunto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        SubjectPanel.setBackground(new java.awt.Color(255, 255, 255));
        SubjectPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubjectPanel.setMaximumSize(new java.awt.Dimension(539, 135));
        SubjectPanel.setPreferredSize(new java.awt.Dimension(539, 135));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Assunto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lbSubject.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSubject.setText("Assunto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSubject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSubject))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        btClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear_icon.png"))); // NOI18N
        btClear.setText("Limpar");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        javax.swing.GroupLayout SubjectPanelLayout = new javax.swing.GroupLayout(SubjectPanel);
        SubjectPanel.setLayout(SubjectPanelLayout);
        SubjectPanelLayout.setHorizontalGroup(
            SubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubjectPanelLayout.createSequentialGroup()
                .addGroup(SubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubjectPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SubjectPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubjectPanelLayout.setVerticalGroup(
            SubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubjectPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(SubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClear)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubjectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubjectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfSubject.setText("");
        tfSubject.requestFocus();
    }//GEN-LAST:event_btClearActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(tfSubject.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Assunto não preenchido!", "Assunto não preenchido", JOptionPane.WARNING_MESSAGE);
        } else {
            Subject subject;
            subject = Subject.Builder
                             .newInstance()
                             .setId(subjectController.getSubject().getId())
                             .setSubject(tfSubject.getText())
                             .build();
            subjectController.setSubject(subject);
            subjectController.save();
            JOptionPane.showMessageDialog(null, "Assunto salvo com sucesso!", "Assunto salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src/main/resources/img16/Theme.png").getImage());
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SubjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectView().setVisible(true);
            }
        });
    }
    
    public void fillData() {
        Subject subject = subjectController.getSubject();
        tfSubject.setText(subject.getSubject());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SubjectPanel;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbSubject;
    private javax.swing.JTextField tfSubject;
    // End of variables declaration//GEN-END:variables
}
