package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author 8569226
 */
public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
        //Fara com que o Form abra mazimizado.
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGrupo = new javax.swing.JButton();
        btnPerguntas = new javax.swing.JButton();
        btnGerar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSair = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        menuPrincipal = new javax.swing.JMenu();
        menuGrupos = new javax.swing.JCheckBoxMenuItem();
        menuPerguntas = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seja Bem-vindo ao SadBoys1.0");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        btnGrupo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Grupo.png"))); // NOI18N
        btnGrupo.setText("GRUPOS");
        btnGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrupo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupoActionPerformed(evt);
            }
        });

        btnPerguntas.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnPerguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Questao.png"))); // NOI18N
        btnPerguntas.setText("PERGUNTAS");
        btnPerguntas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPerguntas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPerguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerguntasActionPerformed(evt);
            }
        });

        btnGerar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Agrupamento.png"))); // NOI18N
        btnGerar.setText("GERAR CODIGOS");
        btnGerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPerguntas)
                .addGap(18, 18, 18)
                .addComponent(btnGerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGrupo)
                        .addComponent(btnPerguntas))
                    .addComponent(btnGerar))
                .addGap(0, 337, Short.MAX_VALUE))
        );

        menuSair.setText("Arquivo");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jCheckBoxMenuItem1.setText("Sair");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        menuSair.add(jCheckBoxMenuItem1);

        jMenuBar1.add(menuSair);

        menuPrincipal.setText("Tela");

        menuGrupos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
        menuGrupos.setText("Grupos");
        menuGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGruposActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuGrupos);

        menuPerguntas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        menuPerguntas.setText("Perguntas");
        menuPerguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerguntasActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuPerguntas);

        jMenuBar1.add(menuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(845, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupoActionPerformed
        // Ao clicar no botão, chamara a tela CRUDGrupos.
        CRUDGrupo g = new CRUDGrupo();
        g.setVisible(true);
    }//GEN-LAST:event_btnGrupoActionPerformed

    private void btnPerguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerguntasActionPerformed
        // Ao clicar no botão aparecera a tela CRUDPerguntas.
        CRUDPerguntas p = new CRUDPerguntas();
        p.setVisible(true);
    }//GEN-LAST:event_btnPerguntasActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        //exibe uma caixa de dialogo com sim ou não
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){//se apertar sim, irá voltar para a tela de login.
            TelaLogin l = new TelaLogin();
            l.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void menuGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGruposActionPerformed
        // Ao clicar no menu Grupos irá chamar o JForm CRUDGrupos
        CRUDGrupo g = new CRUDGrupo();
        g.setVisible(true);
    }//GEN-LAST:event_menuGruposActionPerformed

    private void menuPerguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerguntasActionPerformed
        // Ao clicar no menu Perguntas irá chamar o Jform CRUDPerguntas
        CRUDPerguntas p = new CRUDPerguntas();
        p.setVisible(true);
    }//GEN-LAST:event_menuPerguntasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnGrupo;
    private javax.swing.JButton btnPerguntas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBoxMenuItem menuGrupos;
    private javax.swing.JCheckBoxMenuItem menuPerguntas;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
