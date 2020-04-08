package br.cesjf.library.view;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.event.HyperlinkEvent;

public class AboutView extends javax.swing.JFrame {

    public AboutView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trMenu = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpPage = new javax.swing.JTextPane();
        lbTextLogo = new javax.swing.JLabel();
        lbBookLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Início");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Início");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Teste");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Teste");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        trMenu.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        trMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        trMenu.setRootVisible(false);
        trMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(trMenu);

        tpPage.setEditable(false);
        tpPage.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                tpPageHyperlinkUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(tpPage);

        lbTextLogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTextLogo.setForeground(new java.awt.Color(255, 255, 255));
        lbTextLogo.setText("LibraryAPS");

        lbBookLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book_logo_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbBookLogo)
                        .addGap(18, 18, 18)
                        .addComponent(lbTextLogo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBookLogo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbTextLogo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src/main/resources/img16/about_icon.png").getImage());
        tpPage.setContentType("text/html;charset=utf-8");
        
        File arq = new File("src/main/resources/html/Home.html");
        if(arq != null){            
            try {
                tpPage.setPage(arq.toURI().toURL());
            } catch (IOException ex) {
                Logger.getLogger(AboutView.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
    }//GEN-LAST:event_formWindowOpened

    private void tpPageHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_tpPageHyperlinkUpdate
        if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                tpPage.setPage(evt.getURL());
            } catch (IOException e1) {
                e1.printStackTrace();
            }           
        }
    }//GEN-LAST:event_tpPageHyperlinkUpdate

    private void trMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trMenuMouseClicked
        String menu = null;
        try{
            menu = trMenu.getLastSelectedPathComponent().toString();
            tpPage.setContentType("text/html;charset=utf-8");
        }catch (java.lang.NullPointerException exception){
                        
        }
        
        File arq;        
        if(menu != null){
            arq = new File("src/main/resources/html/" + menu +".html");
            try {
                tpPage.setPage(arq.toURI().toURL());
            } catch (IOException ex) {
                Logger.getLogger(AboutView.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
    }//GEN-LAST:event_trMenuMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AboutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbBookLogo;
    private javax.swing.JLabel lbTextLogo;
    private javax.swing.JTextPane tpPage;
    private javax.swing.JTree trMenu;
    // End of variables declaration//GEN-END:variables
}
