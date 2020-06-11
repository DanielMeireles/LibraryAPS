package br.cesjf.library.view;

import br.cesjf.library.controller.LoanController;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Loan;
import br.cesjf.library.model.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoanView extends javax.swing.JFrame {

    private LoanController loanController;

    public LoanView() {
        initComponents();
        loanController = new LoanController();
        this.fillUsers();
    }
    
    public LoanView(Loan loan) {
        initComponents();
        loanController = new LoanController(loan);
        this.fillCopies();
        this.fillUsers();
        this.fillData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoanPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbUser = new javax.swing.JLabel();
        lbCopy = new javax.swing.JLabel();
        cbCopy = new javax.swing.JComboBox<>();
        lbLoanDate = new javax.swing.JLabel();
        lbReturnDate = new javax.swing.JLabel();
        cbUser = new javax.swing.JComboBox<>();
        lbExpectedReturnDate = new javax.swing.JLabel();
        tfExpectedReturnDate = new javax.swing.JFormattedTextField();
        tfLoanDate = new javax.swing.JFormattedTextField();
        tfReturnDate = new javax.swing.JFormattedTextField();
        btLoan = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empréstimo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LoanPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoanPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Empréstimo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lbUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUser.setText("Usuário:");

        lbCopy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCopy.setText("Exemplar:");

        lbLoanDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLoanDate.setText("Data Empréstimo:");

        lbReturnDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbReturnDate.setText("Data Devolução:");

        lbExpectedReturnDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbExpectedReturnDate.setText("Data Devolução Prevista:");

        tfExpectedReturnDate.setEditable(false);
        tfExpectedReturnDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        try {
            tfLoanDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfLoanDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLoanDateFocusLost(evt);
            }
        });

        try {
            tfReturnDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbExpectedReturnDate)
                    .addComponent(lbReturnDate)
                    .addComponent(lbCopy)
                    .addComponent(lbLoanDate)
                    .addComponent(lbUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfReturnDate, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfLoanDate, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfExpectedReturnDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(cbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoanDate)
                    .addComponent(tfLoanDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfExpectedReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbExpectedReturnDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReturnDate)
                    .addComponent(tfReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCopy)
                    .addComponent(cbCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUser)
                    .addComponent(cbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        btLoan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mark_icon.png"))); // NOI18N
        btLoan.setText("Emprestar");
        btLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoanActionPerformed(evt);
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

        javax.swing.GroupLayout LoanPanelLayout = new javax.swing.GroupLayout(LoanPanel);
        LoanPanel.setLayout(LoanPanelLayout);
        LoanPanelLayout.setHorizontalGroup(
            LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btLoan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        LoanPanelLayout.setVerticalGroup(
            LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(LoanPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoanActionPerformed
        if(tfLoanDate.getText().replace("/", "").trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data do empréstimo não preenchida!", "Data do empréstimo não preenchida", JOptionPane.WARNING_MESSAGE);
        } else if(cbCopy.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um exemplar!", "Não foi selecionado um exemplar", JOptionPane.WARNING_MESSAGE);
        } else if(cbUser.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um usuário!", "Não foi selecionado um usuário", JOptionPane.WARNING_MESSAGE);
        } else {
            Date loanDate = new Date();
            try {
                loanDate = new SimpleDateFormat("dd/MM/yyyy").parse(tfLoanDate.getText());
            } catch (ParseException ex) {
                Logger.getLogger(LoanView.class.getName()).log(Level.SEVERE, "Falha ao converter String para Date", ex);
            }
            Date returnDate = new Date();
            if(tfReturnDate.getText().replace("/", "").trim().isEmpty()) {
                returnDate = null;
            } else {
                try {
                    returnDate = new SimpleDateFormat("dd/MM/yyyy").parse(tfReturnDate.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(LoanView.class.getName()).log(Level.SEVERE, "Falha ao converter String para Date", ex);
                }
            }
            Loan loan;
            loan = Loan.Builder
                       .newInstance()
                       .setId(loanController.getLoan().getId())
                       .setLoanDate(loanDate)
                       .setReturnDate(returnDate)
                       .setIdCopy((Copy) cbCopy.getModel().getSelectedItem())
                       .setIdUser((User) cbUser.getModel().getSelectedItem())
                       .build();
            loanController.setLoan(loan);
            loanController.save();
            tfExpectedReturnDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(loan.getExpectedReturnDate()));
            JOptionPane.showMessageDialog(null, "Empréstimo salvo com sucesso!", "Empréstimo salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btLoanActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfLoanDate.setText("");
        tfExpectedReturnDate.setText("");
        tfReturnDate.setText("");
        cbCopy.setSelectedIndex(-1);
        cbUser.setSelectedIndex(-1);
        tfLoanDate.requestFocus();
    }//GEN-LAST:event_btClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src/main/resources/img16/calendar-clock-icon.png").getImage());
    }//GEN-LAST:event_formWindowOpened

    private void tfLoanDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLoanDateFocusLost
        try {
            Date loanDate = new SimpleDateFormat("dd/MM/yyyy").parse(tfLoanDate.getText());
            if(!loanDate.equals(loanController.getLoan().getLoanDate())) {
                fillCopiesAvailables(loanDate);
                tfExpectedReturnDate.setText("");
            }
        } catch (ParseException ex) {}
    }//GEN-LAST:event_tfLoanDateFocusLost

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanView().setVisible(true);
            }
        });
    }
    
    public void fillCopies() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(loanController.findCopies()));
        cbCopy.setModel(model);
        cbCopy.setSelectedIndex(-1);
    }
    
    public void fillUsers() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(loanController.findUsers()));
        cbUser.setModel(model);
        cbUser.setSelectedIndex(-1);
    }
    
    public void fillData() {
        Loan loan = loanController.getLoan();
        tfLoanDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(loan.getLoanDate()));
        if(loan.getReturnDate() != null) {
            tfReturnDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(loan.getReturnDate()));
        }
        tfExpectedReturnDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(loan.getExpectedReturnDate()));
        cbCopy.setSelectedItem(loan.getIdCopy());
        cbUser.setSelectedItem(loan.getIdUser());
    }
    
    public void fillCopiesAvailables(Date date) {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(loanController.findCopiesAvailables(date)));
        cbCopy.setModel(model);
        cbCopy.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoanPanel;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLoan;
    private javax.swing.JComboBox<String> cbCopy;
    private javax.swing.JComboBox<String> cbUser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCopy;
    private javax.swing.JLabel lbExpectedReturnDate;
    private javax.swing.JLabel lbLoanDate;
    private javax.swing.JLabel lbReturnDate;
    private javax.swing.JLabel lbUser;
    private javax.swing.JFormattedTextField tfExpectedReturnDate;
    private javax.swing.JFormattedTextField tfLoanDate;
    private javax.swing.JFormattedTextField tfReturnDate;
    // End of variables declaration//GEN-END:variables
}
