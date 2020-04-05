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
import javax.swing.JOptionPane;

public class ReservationView extends javax.swing.JFrame {

    private ReservationController ReservationController;

    public ReservationView() {
        initComponents();
        ReservationController = new ReservationController();
        this.fillCopies();
        this.fillUsers();
    }
    
    public ReservationView(Reservation reservation) {
        initComponents();
        ReservationController = new ReservationController(reservation);
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
        tfReservationDate = new javax.swing.JFormattedTextField();
        cbUser = new javax.swing.JComboBox<>();
        lbExpectedReturnDate = new javax.swing.JLabel();
        tfExpectedReturnDate = new javax.swing.JFormattedTextField();
        lbCanceled = new javax.swing.JLabel();
        cbCanceled = new javax.swing.JCheckBox();
        lbNoteCancellation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taNoteCancellation = new javax.swing.JTextArea();
        btReservation = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserva");
        setResizable(false);

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

        tfReservationDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lbReservationDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfReservationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lbExpectedReturnDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfExpectedReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReservationDate)
                    .addComponent(tfReservationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btReservation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        LoanPanelLayout.setVerticalGroup(
            LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClear)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReservation))
                .addContainerGap())
        );

        getContentPane().add(LoanPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservationActionPerformed
        if(tfReservationDate.getText().isEmpty() || tfReservationDate.getText().trim() == null) {
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
            Reservation reservation = Reservation.Builder
                            .newInstance()
                            .setReservationDate(ReservationDate)
                            .setIdCopy((Copy) cbCopy.getModel().getSelectedItem())
                            .setIdUser((User) cbUser.getModel().getSelectedItem())
                            .setCanceled(cbCanceled.isSelected())
                            .setNoteCancellation(taNoteCancellation.getText())
                            .build();
            ReservationController.save(reservation);
            tfExpectedReturnDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(reservation.getExpectedReturnDate()));
            JOptionPane.showMessageDialog(null, "Reserva salvo com sucesso!", "Reserva salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btReservationActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfReservationDate.setText("");
        tfExpectedReturnDate.setText("");
        cbCopy.setSelectedIndex(-1);
        cbUser.setSelectedIndex(-1);
        cbCanceled.setSelected(false);
        taNoteCancellation.setText("");
    }//GEN-LAST:event_btClearActionPerformed

    private void cbCanceledStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbCanceledStateChanged
        if(cbCanceled.isSelected()) {
            taNoteCancellation.setEditable(true);
        } else {
            taNoteCancellation.setEditable(false);
        }
    }//GEN-LAST:event_cbCanceledStateChanged

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
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(ReservationController.findCopies()));
        cbCopy.setModel(model);
        cbCopy.setSelectedIndex(-1);
    }
    
    public void fillUsers() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(ReservationController.findUsers()));
        cbUser.setModel(model);
        cbUser.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoanPanel;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
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
