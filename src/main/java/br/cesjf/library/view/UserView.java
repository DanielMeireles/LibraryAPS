package br.cesjf.library.view;

import br.cesjf.library.controller.UserController;
import br.cesjf.library.enums.UserType;
import br.cesjf.library.model.User;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserView extends javax.swing.JFrame {

    private UserController userController;

    public UserView() {
        initComponents();
        userController = new UserController();
        this.fillUserTypes();
    }
    
    public UserView(User user) {
        initComponents();
        userController = new UserController(user);
        this.fillUserTypes();
        this.fillData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbType = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbUser = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        jpPassword = new javax.swing.JPasswordField();
        btSave = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuário");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        UserPanel.setBackground(new java.awt.Color(255, 255, 255));
        UserPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Usuário", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lbName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbName.setText("Nome:");

        lbType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbType.setText("Tipo:");

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmail.setText("Email:");

        lbUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUser.setText("Usuário:");

        lbPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPassword.setText("Senha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUser)
                    .addComponent(lbType)
                    .addComponent(lbPassword)
                    .addComponent(lbEmail)
                    .addComponent(lbName))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpPassword)
                        .addComponent(tfUser)
                        .addComponent(cbType, 0, 169, Short.MAX_VALUE))
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbType)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUser)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(jpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
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

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserPanelLayout.createSequentialGroup()
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClear)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(UserPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(tfName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome não preenchido!", "Nome não preenchido", JOptionPane.WARNING_MESSAGE);
        } else if(tfEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email não preenchido!", "Email não preenchido", JOptionPane.WARNING_MESSAGE);
        } else if(cbType.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um tipo!", "Não foi selecionado um tipo", JOptionPane.WARNING_MESSAGE);
        } else if(tfUser.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário não preenchido!", "Usuário não preenchido", JOptionPane.WARNING_MESSAGE);
        } else if(new String(jpPassword.getPassword()).trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Senha não preenchida!", "Senha não preenchida", JOptionPane.WARNING_MESSAGE);
        } else {
            User user = new User();
            user = User.Builder
                       .newInstance()
                       .setId(userController.getUser().getId())
                       .setName(tfName.getText())
                       .setEmail(tfEmail.getText())
                       .setType((UserType) cbType.getModel().getSelectedItem())
                       .setUser(tfUser.getText())
                       .setPassword(new String(jpPassword.getPassword()))
                       .build();
            userController.setUser(user);
            userController.save();
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!", "Usuário salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfName.setText("");
        tfEmail.setText("");
        cbType.setSelectedIndex(-1);
        tfUser.setText("");
        jpPassword.setText("");
        tfName.requestFocus();
    }//GEN-LAST:event_btClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src/main/resources/img16/user.png").getImage());
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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }
    
    private void fillUserTypes() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(UserType.values());
        cbType.setModel(model);
        cbType.setSelectedIndex(-1);
    }
    
    public void fillData() {
        User user = userController.getUser();
        tfName.setText(user.getName());
        tfEmail.setText(user.getEmail());
        cbType.setSelectedItem(user.getType());
        tfUser.setText(user.getUser());
        jpPassword.setText(user.getPassword());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserPanel;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbType;
    private javax.swing.JLabel lbUser;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
