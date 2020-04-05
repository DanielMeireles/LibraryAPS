package br.cesjf.library.view;

import br.cesjf.library.controller.BookController;
import br.cesjf.library.model.Book;
import br.cesjf.library.model.BookFactory;
import br.cesjf.library.model.Publisher;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class BookView extends javax.swing.JFrame {

    private BookController bookController;

    public BookView() {
        initComponents();
        bookController = new BookController();
        this.fillYears();
        this.fillPublishers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        lbIsbn = new javax.swing.JLabel();
        tfIsbn = new javax.swing.JTextField();
        lbEdition = new javax.swing.JLabel();
        lbYear = new javax.swing.JLabel();
        lbPublisher = new javax.swing.JLabel();
        cbPublisher = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();
        ftEdition = new javax.swing.JFormattedTextField();
        btSave = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Livro");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Livro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitle.setText("Título:");

        lbIsbn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbIsbn.setText("ISBN:");

        lbEdition.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEdition.setText("Edição:");

        lbYear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbYear.setText("Ano:");

        lbPublisher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPublisher.setText("Editora:");

        ftEdition.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(18, 18, 18)
                        .addComponent(tfTitle))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbYear)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(lbIsbn)
                                    .addGap(25, 25, 25)
                                    .addComponent(tfIsbn))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lbPublisher)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbPublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(lbEdition)
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(106, 106, 106))
                                        .addComponent(ftEdition)))))
                        .addGap(0, 230, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitle))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEdition)
                    .addComponent(ftEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbYear)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPublisher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIsbn)
                    .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClear)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(tfTitle.getText().isEmpty() || tfTitle.getText().trim() == null) {
            JOptionPane.showMessageDialog(null, "Título não preenchido!", "Título não preenchido", JOptionPane.WARNING_MESSAGE);
        } else if(ftEdition.getText().isEmpty() || ftEdition.getText().trim() == null) {
            JOptionPane.showMessageDialog(null, "Edição não preenchida!", "Edição não preenchida", JOptionPane.WARNING_MESSAGE);
        } else if(cbYear.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um ano!", "Não foi selecionado um ano", JOptionPane.WARNING_MESSAGE);
        } else if(cbPublisher.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionada uma editora!", "Não foi selecionada uma editora", JOptionPane.WARNING_MESSAGE);
        } else if(tfIsbn.getText().isEmpty() || tfIsbn.getText().trim() == null) {
            JOptionPane.showMessageDialog(null, "ISBN não preenchido!", "ISBN não preenchido", JOptionPane.WARNING_MESSAGE);
        } else {
            BookFactory bookFactory = BookFactory.getInstance();
            Book book = (Book) bookFactory.createPublication();
            book.setTitle(tfTitle.getText());
            book.setEdition(Integer.parseInt(ftEdition.getText()));
            book.setYear(Integer.parseInt(cbYear.getItemAt(cbYear.getSelectedIndex())));
            book.setIdPublisher((Publisher) cbPublisher.getModel().getSelectedItem());
            book.setIsbn(tfIsbn.getText());
            bookController.save(book);
            JOptionPane.showMessageDialog(null, "Livro salvo com sucesso!", "Livro salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfTitle.setText("");
        ftEdition.setText("");
        cbYear.setSelectedIndex(-1);
        cbPublisher.setSelectedIndex(-1);
        tfIsbn.setText("");
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
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookView().setVisible(true);
            }
        });
    }
    
    public void fillYears() {
        for(int i = Calendar.getInstance().get(Calendar.YEAR); i >= 1900; i--) {
            cbYear.addItem(Integer.toString(i));
        }
        cbYear.setSelectedIndex(-1);
    }
    
    public void fillPublishers() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(bookController.findPublishers()));
        cbPublisher.setModel(model);
        cbPublisher.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbPublisher;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JFormattedTextField ftEdition;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbEdition;
    private javax.swing.JLabel lbIsbn;
    private javax.swing.JLabel lbPublisher;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbYear;
    private javax.swing.JTextField tfIsbn;
    private javax.swing.JTextField tfTitle;
    // End of variables declaration//GEN-END:variables
}
