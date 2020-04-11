package br.cesjf.library.view;

import br.cesjf.library.controller.MagazineController;
import br.cesjf.library.model.Author;
import br.cesjf.library.model.Magazine;
import br.cesjf.library.model.MagazineFactory;
import br.cesjf.library.model.Publisher;
import br.cesjf.library.model.Subject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MagazineView extends javax.swing.JFrame {

    private MagazineController magazineController;

    public MagazineView() {
        initComponents();
        magazineController = new MagazineController();
        this.fillYears();
        this.fillPublishers();
        this.fillAuthors();
        this.fillSubjects();
    }
    
    public MagazineView(Magazine magazine) {
        initComponents();
        magazineController = new MagazineController(magazine);
        this.fillYears();
        this.fillPublishers();
        this.fillAuthors();
        this.fillSubjects();
        this.fillData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        lbEdition = new javax.swing.JLabel();
        lbYear = new javax.swing.JLabel();
        lbPublisher = new javax.swing.JLabel();
        cbPublisher = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();
        ftEdition = new javax.swing.JFormattedTextField();
        cbAuthors = new javax.swing.JComboBox<>();
        lbAutores = new javax.swing.JLabel();
        cbSubjects = new javax.swing.JComboBox<>();
        lbSubjects = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Revista");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Revista", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitle.setText("Título:");

        lbEdition.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEdition.setText("Edição:");

        lbYear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbYear.setText("Ano:");

        lbPublisher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPublisher.setText("Editora:");

        ftEdition.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbAutores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAutores.setText("Autores:");

        lbSubjects.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSubjects.setText("Assuntos:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSubjects)
                            .addComponent(lbAutores)
                            .addComponent(lbPublisher))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbAuthors, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbSubjects, 0, 392, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEdition)
                            .addComponent(lbYear)
                            .addComponent(lbTitle))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTitle)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 216, Short.MAX_VALUE)))))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEdition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPublisher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutores)
                    .addComponent(cbAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSubjects)
                    .addComponent(cbSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClear)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if(tfTitle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Título não preenchido!", "Título não preenchido", JOptionPane.WARNING_MESSAGE);
        } else if(ftEdition.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Edição não preenchida!", "Edição não preenchida", JOptionPane.WARNING_MESSAGE);
        } else if(cbYear.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um ano!", "Não foi selecionado um ano", JOptionPane.WARNING_MESSAGE);
        } else if(cbPublisher.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionada uma editora!", "Não foi selecionada uma editora", JOptionPane.WARNING_MESSAGE);
        } else if(cbAuthors.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um autor!", "Não foi selecionado um autor", JOptionPane.WARNING_MESSAGE);
        } else if(cbSubjects.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado um assunto!", "Não foi selecionado um assunto", JOptionPane.WARNING_MESSAGE);
        } else {
            MagazineFactory magazineFactory = MagazineFactory.getInstance();
            Magazine magazine = (Magazine) magazineFactory.createPublication();
            magazine.setId(magazineController.getMagazine().getId());
            magazine.setTitle(tfTitle.getText());
            magazine.setEdition(Integer.parseInt(ftEdition.getText()));
            magazine.setYear(Integer.parseInt(cbYear.getItemAt(cbYear.getSelectedIndex())));
            magazine.setIdPublisher((Publisher) cbPublisher.getModel().getSelectedItem());
            List<Author> authors = new ArrayList<>();
            authors.add((Author) cbAuthors.getModel().getSelectedItem());
            magazine.setAuthorList(authors);
            List<Subject> subjects = new ArrayList<>();
            subjects.add((Subject) cbSubjects.getModel().getSelectedItem());
            magazine.setSubjectList(subjects);
            magazineController.setMagazine(magazine);
            magazineController.save();
            JOptionPane.showMessageDialog(null, "Revista salvo com sucesso!", "Revista salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfTitle.setText("");
        ftEdition.setText("");
        cbYear.setSelectedIndex(-1);
        cbPublisher.setSelectedIndex(-1);
        cbAuthors.setSelectedIndex(-1);
        cbSubjects.setSelectedIndex(-1);
        tfTitle.requestFocus();
    }//GEN-LAST:event_btClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src/main/resources/img16/books.png").getImage());
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
            java.util.logging.Logger.getLogger(MagazineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MagazineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MagazineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MagazineView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MagazineView().setVisible(true);
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
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(magazineController.findPublishers()));
        cbPublisher.setModel(model);
        cbPublisher.setSelectedIndex(-1);
    }
    
    public void fillAuthors() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(magazineController.findAuthors()));
        cbAuthors.setModel(model);
        cbAuthors.setSelectedIndex(-1);
    }
    
    public void fillSubjects() {
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Vector(magazineController.findSubjects()));
        cbSubjects.setModel(model);
        cbSubjects.setSelectedIndex(-1);
    }
    
    public void fillData() {
        Magazine magazine = magazineController.getMagazine();
        tfTitle.setText(magazine.getTitle());
        ftEdition.setText(Integer.toString(magazine.getEdition()));
        cbYear.setSelectedItem(Integer.toString(magazine.getYear()));
        cbPublisher.setSelectedItem(magazine.getIdPublisher());
        for(Author a: magazine.getAuthorList()){
            cbAuthors.setSelectedItem(a);
        }
        for(Subject s: magazine.getSubjectList()) {
            cbSubjects.setSelectedItem(s);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbAuthors;
    private javax.swing.JComboBox<String> cbPublisher;
    private javax.swing.JComboBox<String> cbSubjects;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JFormattedTextField ftEdition;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbAutores;
    private javax.swing.JLabel lbEdition;
    private javax.swing.JLabel lbPublisher;
    private javax.swing.JLabel lbSubjects;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbYear;
    private javax.swing.JTextField tfTitle;
    // End of variables declaration//GEN-END:variables
}