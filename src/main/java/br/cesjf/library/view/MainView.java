package br.cesjf.library.view;

import javax.swing.JOptionPane;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tbTopo = new javax.swing.JToolBar();
        btSearchBook = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btLoan = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btReservation = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btExit = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        mbTopo = new javax.swing.JMenuBar();
        mnRegister = new javax.swing.JMenu();
        miRegisterUser = new javax.swing.JMenuItem();
        miRegisterSubject = new javax.swing.JMenuItem();
        miRegisterAuthor = new javax.swing.JMenuItem();
        miRegisterPublisher = new javax.swing.JMenuItem();
        miRegisterBook = new javax.swing.JMenuItem();
        miMagazine = new javax.swing.JMenuItem();
        miRegisterCopy = new javax.swing.JMenuItem();
        mnSearch = new javax.swing.JMenu();
        miSearchUser = new javax.swing.JMenuItem();
        miSearchSubject = new javax.swing.JMenuItem();
        miSearchAuthor = new javax.swing.JMenuItem();
        miSearchPublisher = new javax.swing.JMenuItem();
        miSearchBook = new javax.swing.JMenuItem();
        miSearchMagazine = new javax.swing.JMenuItem();
        miSearchCopy = new javax.swing.JMenuItem();
        miSearchReservation = new javax.swing.JMenuItem();
        miSearchLoan = new javax.swing.JMenuItem();
        mnLoan = new javax.swing.JMenu();
        miLoan = new javax.swing.JMenuItem();
        mnReservation = new javax.swing.JMenu();
        miReservation = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book.png"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        tbTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbTopo.setFloatable(false);
        tbTopo.setRollover(true);

        btSearchBook.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSearchBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book_icon.png"))); // NOI18N
        btSearchBook.setText("Pesquisar Livro");
        btSearchBook.setFocusable(false);
        btSearchBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSearchBook.setMaximumSize(new java.awt.Dimension(120, 57));
        btSearchBook.setPreferredSize(new java.awt.Dimension(120, 57));
        btSearchBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchBookActionPerformed(evt);
            }
        });
        tbTopo.add(btSearchBook);
        tbTopo.add(jSeparator2);

        btLoan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loan_icon.png"))); // NOI18N
        btLoan.setText("Emprestar");
        btLoan.setFocusable(false);
        btLoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLoan.setMaximumSize(new java.awt.Dimension(120, 57));
        btLoan.setPreferredSize(new java.awt.Dimension(120, 57));
        btLoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoanActionPerformed(evt);
            }
        });
        tbTopo.add(btLoan);
        tbTopo.add(jSeparator3);

        btReservation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schedule_icon.png"))); // NOI18N
        btReservation.setText("Reservar");
        btReservation.setFocusable(false);
        btReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btReservation.setMaximumSize(new java.awt.Dimension(120, 57));
        btReservation.setPreferredSize(new java.awt.Dimension(120, 57));
        btReservation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservationActionPerformed(evt);
            }
        });
        tbTopo.add(btReservation);
        tbTopo.add(jSeparator4);

        btExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit_icon.png"))); // NOI18N
        btExit.setText("Sair");
        btExit.setFocusable(false);
        btExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExit.setMaximumSize(new java.awt.Dimension(120, 57));
        btExit.setPreferredSize(new java.awt.Dimension(120, 57));
        btExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        tbTopo.add(btExit);
        tbTopo.add(jSeparator5);

        getContentPane().add(tbTopo, java.awt.BorderLayout.PAGE_START);

        mnRegister.setText("Cadastrar");
        mnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        miRegisterUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miRegisterUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/user.png"))); // NOI18N
        miRegisterUser.setText("Usuário");
        miRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegisterUserActionPerformed(evt);
            }
        });
        mnRegister.add(miRegisterUser);

        miRegisterSubject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miRegisterSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/Theme.png"))); // NOI18N
        miRegisterSubject.setText("Assunto");
        miRegisterSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegisterSubjectActionPerformed(evt);
            }
        });
        mnRegister.add(miRegisterSubject);

        miRegisterAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miRegisterAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/user.png"))); // NOI18N
        miRegisterAuthor.setText("Autor");
        miRegisterAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegisterAuthorActionPerformed(evt);
            }
        });
        mnRegister.add(miRegisterAuthor);

        miRegisterPublisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miRegisterPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/university-icon.png"))); // NOI18N
        miRegisterPublisher.setText("Editora");
        miRegisterPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegisterPublisherActionPerformed(evt);
            }
        });
        mnRegister.add(miRegisterPublisher);

        miRegisterBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miRegisterBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/books.png"))); // NOI18N
        miRegisterBook.setText("Livro");
        miRegisterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegisterBookActionPerformed(evt);
            }
        });
        mnRegister.add(miRegisterBook);

        miMagazine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miMagazine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/books.png"))); // NOI18N
        miMagazine.setText("Revista");
        miMagazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMagazineActionPerformed(evt);
            }
        });
        mnRegister.add(miMagazine);

        miRegisterCopy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miRegisterCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/books.png"))); // NOI18N
        miRegisterCopy.setText("Exemplar");
        miRegisterCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegisterCopyActionPerformed(evt);
            }
        });
        mnRegister.add(miRegisterCopy);

        mbTopo.add(mnRegister);

        mnSearch.setText("Pesquisar");
        mnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        miSearchUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/user.png"))); // NOI18N
        miSearchUser.setText("Usuário");
        miSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchUserActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchUser);

        miSearchSubject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/Theme.png"))); // NOI18N
        miSearchSubject.setText("Assunto");
        miSearchSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchSubjectActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchSubject);

        miSearchAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/user.png"))); // NOI18N
        miSearchAuthor.setText("Autor");
        miSearchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchAuthorActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchAuthor);

        miSearchPublisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/university-icon.png"))); // NOI18N
        miSearchPublisher.setText("Editora");
        miSearchPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchPublisherActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchPublisher);

        miSearchBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/books.png"))); // NOI18N
        miSearchBook.setText("Livro");
        miSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchBookActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchBook);

        miSearchMagazine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchMagazine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/books.png"))); // NOI18N
        miSearchMagazine.setText("Revista");
        miSearchMagazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchMagazineActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchMagazine);

        miSearchCopy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/books.png"))); // NOI18N
        miSearchCopy.setText("Exemplar");
        miSearchCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchCopyActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchCopy);

        miSearchReservation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/clock-icon.png"))); // NOI18N
        miSearchReservation.setText("Reserva");
        miSearchReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchReservationActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchReservation);

        miSearchLoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSearchLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/calendar-clock-icon.png"))); // NOI18N
        miSearchLoan.setText("Empréstimo");
        miSearchLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchLoanActionPerformed(evt);
            }
        });
        mnSearch.add(miSearchLoan);

        mbTopo.add(mnSearch);

        mnLoan.setText("Emprestar");
        mnLoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        miLoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/calendar-clock-icon.png"))); // NOI18N
        miLoan.setText("Emprestar");
        miLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoanActionPerformed(evt);
            }
        });
        mnLoan.add(miLoan);

        mbTopo.add(mnLoan);

        mnReservation.setText("Reservar");
        mnReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        miReservation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16/clock-icon.png"))); // NOI18N
        miReservation.setText("Reservar");
        miReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReservationActionPerformed(evt);
            }
        });
        mnReservation.add(miReservation);

        mbTopo.add(mnReservation);

        setJMenuBar(mbTopo);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miRegisterSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegisterSubjectActionPerformed
        new SubjectView().setVisible(true);
    }//GEN-LAST:event_miRegisterSubjectActionPerformed

    private void miRegisterAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegisterAuthorActionPerformed
        new AuthorView().setVisible(true);
    }//GEN-LAST:event_miRegisterAuthorActionPerformed

    private void miRegisterPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegisterPublisherActionPerformed
        new PublisherView().setVisible(true);
    }//GEN-LAST:event_miRegisterPublisherActionPerformed

    private void miRegisterCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegisterCopyActionPerformed
        new CopyView().setVisible(true);
    }//GEN-LAST:event_miRegisterCopyActionPerformed

    private void miRegisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegisterBookActionPerformed
        new BookView().setVisible(true);
    }//GEN-LAST:event_miRegisterBookActionPerformed

    private void miRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegisterUserActionPerformed
        new UserView().setVisible(true);
    }//GEN-LAST:event_miRegisterUserActionPerformed

    private void miSearchSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchSubjectActionPerformed
        new SubjectSearchView().setVisible(true);
    }//GEN-LAST:event_miSearchSubjectActionPerformed

    private void miSearchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchAuthorActionPerformed
        new AuthorSearchView().setVisible(true);
    }//GEN-LAST:event_miSearchAuthorActionPerformed

    private void miSearchPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchPublisherActionPerformed
        new PublisherSearchView().setVisible(true);
    }//GEN-LAST:event_miSearchPublisherActionPerformed

    private void miSearchCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchCopyActionPerformed
        new CopySearchView().setVisible(true);
    }//GEN-LAST:event_miSearchCopyActionPerformed

    private void miSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchBookActionPerformed
        new BookSearchView().setVisible(true);
    }//GEN-LAST:event_miSearchBookActionPerformed

    private void btSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchBookActionPerformed
        new BookSearchView().setVisible(true);
    }//GEN-LAST:event_btSearchBookActionPerformed

    private void miSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchUserActionPerformed
        new UserSearchView().setVisible(true);
    }//GEN-LAST:event_miSearchUserActionPerformed

    private void miLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoanActionPerformed
        new LoanView().setVisible(true);
    }//GEN-LAST:event_miLoanActionPerformed

    private void btLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoanActionPerformed
        new LoanView().setVisible(true);
    }//GEN-LAST:event_btLoanActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da aplicação?", "Encerrar", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btExitActionPerformed

    private void miMagazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMagazineActionPerformed
        new MagazineView().setVisible(true);
    }//GEN-LAST:event_miMagazineActionPerformed

    private void btReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservationActionPerformed
        new ReservationView().setVisible(true);
    }//GEN-LAST:event_btReservationActionPerformed

    private void miReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReservationActionPerformed
        new ReservationView().setVisible(true);
    }//GEN-LAST:event_miReservationActionPerformed

    private void miSearchMagazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchMagazineActionPerformed
        new MagazineSearchView().setVisible(true);
    }//GEN-LAST:event_miSearchMagazineActionPerformed

    private void miSearchLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchLoanActionPerformed
        new LoanSearchView().setVisible(true);
    }//GEN-LAST:event_miSearchLoanActionPerformed

    private void miSearchReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchReservationActionPerformed
        new ReservationSearchView().setVisible(true);
    }//GEN-LAST:event_miSearchReservationActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLoan;
    private javax.swing.JButton btReservation;
    private javax.swing.JButton btSearchBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JMenuBar mbTopo;
    private javax.swing.JMenuItem miLoan;
    private javax.swing.JMenuItem miMagazine;
    private javax.swing.JMenuItem miRegisterAuthor;
    private javax.swing.JMenuItem miRegisterBook;
    private javax.swing.JMenuItem miRegisterCopy;
    private javax.swing.JMenuItem miRegisterPublisher;
    private javax.swing.JMenuItem miRegisterSubject;
    private javax.swing.JMenuItem miRegisterUser;
    private javax.swing.JMenuItem miReservation;
    private javax.swing.JMenuItem miSearchAuthor;
    private javax.swing.JMenuItem miSearchBook;
    private javax.swing.JMenuItem miSearchCopy;
    private javax.swing.JMenuItem miSearchLoan;
    private javax.swing.JMenuItem miSearchMagazine;
    private javax.swing.JMenuItem miSearchPublisher;
    private javax.swing.JMenuItem miSearchReservation;
    private javax.swing.JMenuItem miSearchSubject;
    private javax.swing.JMenuItem miSearchUser;
    private javax.swing.JMenu mnLoan;
    private javax.swing.JMenu mnRegister;
    private javax.swing.JMenu mnReservation;
    private javax.swing.JMenu mnSearch;
    private javax.swing.JToolBar tbTopo;
    // End of variables declaration//GEN-END:variables
}
