package br.cesjf.library.view;

import br.cesjf.library.controller.ReservationController;
import br.cesjf.library.model.Copy;
import br.cesjf.library.model.Reservation;
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

public class ReservationView extends javax.swing.JFrame {

    private ReservationController reservationController;

    public ReservationView() {
        initComponents();
        reservationController = new ReservationController();
        this.fillUsers();
        btLoan.setVisible(false);
    }
    
    public ReservationView(Reservation reservation) {
        initComponents();
        reservationController = new ReservationController(reservation);
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
        lbReservationDate = new javax.swing.JLabel();
        cbUser = new javax.swing.JComboBox<>();
        lbExpectedReturnDate = new javax.swing.JLabel();
        tfExpectedReturnDate = new javax.swing.JFormattedTextField();
        lbCanceled = new javax.swing.JLabel();
        cbCanceled = new javax.swing.JCheckBox();
        lbNoteCancellation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taNoteCancellation = new javax.swing.JTextArea();
        tfReservationDate = new javax.swing.JFormattedTextField();
        btLoan = new javax.swing.JButton();
        btReservation = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserva");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LoanPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoanPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Reserva", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lbUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUser.setText("Usuário:");

        lbCopy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCopy.setText("Exemplar:");

        lbReservationDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbReservationDate.setText("Data Reserva:");

        lbExpectedReturnDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbExpectedReturnDate.setText("Data Devolução Prevista:");

        tfExpectedReturnDate.setEditable(false);
        tfExpectedReturnDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lbCanceled.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCanceled.setText("Cancelado:");

        cbCanceled.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbCanceledStateChanged(evt);
            }
        });

        lbNoteCancellation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNoteCancellation.setText("Obs. Cancelamento:");

        taNoteCancellation.setEditable(false);
        taNoteCancellation.setColumns(20);
        taNoteCancellation.setRows(5);
        jScrollPane1.setViewportView(taNoteCancellation);

        try {
            tfReservationDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfReservationDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfReservationDateFocusLost(evt);
            }
        });

        btLoan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mark_icon.png"))); // NOI18N
        btLoan.setText("Emprestar");
        btLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbExpectedReturnDate)
                            .addComponent(lbReservationDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfExpectedReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(tfReservationDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLoan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUser)
                            .addComponent(lbCopy)
                            .addComponent(lbCanceled)
                            .addComponent(lbNoteCancellation))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCanceled)
                            .addComponent(cbCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbReservationDate)
                            .addComponent(tfReservationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btLoan))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfExpectedReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbExpectedReturnDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCopy)
                    .addComponent(cbCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUser)
                    .addComponent(cbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCanceled)
                    .addComponent(cbCanceled))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNoteCancellation)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btReservation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mark_icon.png"))); // NOI18N
        btReservation.setText("Reservar");
        btReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservationActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LoanPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btReservation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LoanPanelLayout.setVerticalGroup(
            LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReservation)
                    .addComponent(btClear)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(LoanPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbCanceledStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbCanceledStateChanged
        if(cbCanceled.isSelected()) {
            taNoteCancellation.setEditable(true);
        } else {
            taNoteCancellation.setEditable(false);
        }
    }//GEN-LAST:event_cbCanceledStateChanged

    private void btLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoanActionPerformed
        if(!reservationController.getReservation().getId().equals(null)) {
            reservationController.generateLoan();
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!", "Empréstimo realizado com sucesso", JOptionPane.INFORMATION_MESSAGE);
            btLoan.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível concluir o empréstimo!", "Não foi possível concluir o empréstimo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btLoanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src/main/resources/img/schedule_icon.png").getImage());
    }//GEN-LAST:event_formWindowOpened

    private void tfReservationDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfReservationDateFocusLost
        try {
            Date reservationDate = new SimpleDateFormat("dd/MM/yyyy").parse(tfReservationDate.getText());
            if(!reservationDate.equals(reservationController.getReservation().getReservationDate())) {
                fillCopiesAvailables(reservationDate);
                tfExpectedReturnDate.setText("");
            }
        } catch (ParseException ex) {}
    }//GEN-LAST:event_tfReservationDateFocusLost

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfReservationDate.setText("");
        tfExpectedReturnDate.setText("");
        cbCopy.setSelectedIndex(-1);
        cbUser.setSelectedIndex(-1);
        cbCanceled.setSelected(false);
        taNoteCancellation.setText("");
        tfReservationDate.requestFocus();
    }//GEN-LAST:event_btClearActionPerformed

    private void btReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservationActionPerformed
        if(tfReservationDate.getText().replace("/", "").trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data da Reserva não preenchida!", "Data da Reserva não preenchida", JOptionPane.WARNING_MESSAGE);
        } else if(cbCopy.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um exemplar!", "Não foi selecionado um exemplar", JOptionPane.WARNING_MESSAGE);
        } else if(cbUser.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um usuário!", "Não foi selecionado um usuário", JOptionPane.WARNING_MESSAGE);
        } else {
            Date ReservationDate = new Date();
            try {
                ReservationDate = new SimpleDateFormat("dd/MM/yyyy").parse(tfReservationDate.getText());
            } catch (ParseException ex) {
                Logger.getLogger(ReservationView.class.getName()).log(Level.SEVERE, "Falha ao converter String para Date", ex);
            }
            Reservation reservation;
            reservation = Reservation.Builder
            .newInstance()
            .setId(reservationController.getReservation().getId())
            .setReservationDate(ReservationDate)
            .setIdCopy((Copy) cbCopy.getModel().getSelectedItem())
            .setIdUser((User) cbUser.getModel().getSelectedItem())
            .setCanceled(cbCanceled.isSelected())
            .setNoteCancellation(taNoteCancellation.getText())
            .build();
            reservationController.setReservation(reservation);
            reservationController.save();
            tfExpectedReturnDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(reservation.getExpectedReturnDate()));
            JOptionPane.showMessageDialog(null, "Reserva salvo com sucesso!", "Reserva salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btReservationActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationView().setVisible(true);
            }
        });
    }
    
    public void fillCopies() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(reservationController.findCopies()));
        cbCopy.setModel(model);
    }
    
    public void fillCopiesAvailables(Date date) {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(reservationController.findCopiesAvailables(date)));
        cbCopy.setModel(model);
        cbCopy.setSelectedIndex(-1);
    }
    
    public void fillUsers() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(reservationController.findUsers()));
        cbUser.setModel(model);
        cbUser.setSelectedIndex(-1);
    }
    
    public void fillData() {
        Reservation reservation = reservationController.getReservation();
        tfReservationDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(reservation.getReservationDate()));
        tfExpectedReturnDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(reservation.getExpectedReturnDate()));
        cbCopy.setSelectedItem(reservation.getIdCopy());
        cbUser.setSelectedItem(reservation.getIdUser());
        cbCanceled.setSelected(reservation.getCanceled());
        taNoteCancellation.setText(reservation.getNoteCancellation());
        if(reservationController.getReservation().getIdLoan() == null) {
            btLoan.setVisible(true);
        } else {
            btLoan.setVisible(false);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoanPanel;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLoan;
    private javax.swing.JButton btReservation;
    private javax.swing.JCheckBox cbCanceled;
    private javax.swing.JComboBox<String> cbCopy;
    private javax.swing.JComboBox<String> cbUser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCanceled;
    private javax.swing.JLabel lbCopy;
    private javax.swing.JLabel lbExpectedReturnDate;
    private javax.swing.JLabel lbNoteCancellation;
    private javax.swing.JLabel lbReservationDate;
    private javax.swing.JLabel lbUser;
    private javax.swing.JTextArea taNoteCancellation;
    private javax.swing.JFormattedTextField tfExpectedReturnDate;
    private javax.swing.JFormattedTextField tfReservationDate;
    // End of variables declaration//GEN-END:variables
}
