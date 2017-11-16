package visao;

import FormuláriosRally.FrmIniRally;
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
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGrupo = new javax.swing.JButton();
        btnPerguntas = new javax.swing.JButton();
        btnGerar = new javax.swing.JButton();
        btnPostos = new javax.swing.JButton();
        btnSenha = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSair = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        menuPrincipal = new javax.swing.JMenu();
        menuGrupos = new javax.swing.JCheckBoxMenuItem();
        menuPerguntas = new javax.swing.JCheckBoxMenuItem();
        menuCodigos = new javax.swing.JRadioButtonMenuItem();
        menuPostos = new javax.swing.JRadioButtonMenuItem();
        menuSenha = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seja Bem-vindo ao SadBoys1.0");
        setExtendedState(6);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Sair.png"))); // NOI18N
        btnSair.setToolTipText("Sair do Sistema");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TELA PRINCIPAL");
        jLabel1.setToolTipText("TELA PRINCIPAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair)
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnGrupo.setBackground(new java.awt.Color(255, 51, 51));
        btnGrupo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnGrupo.setForeground(new java.awt.Color(255, 255, 255));
        btnGrupo.setText("<html><center>Cadastrar Grupos</center></html>");
        btnGrupo.setToolTipText("Grupos");
        btnGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrupo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupoActionPerformed(evt);
            }
        });

        btnPerguntas.setBackground(new java.awt.Color(255, 51, 51));
        btnPerguntas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnPerguntas.setForeground(new java.awt.Color(255, 255, 255));
        btnPerguntas.setText("<html><center>Cadastrar Questões</center></html>");
        btnPerguntas.setToolTipText("Questões");
        btnPerguntas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPerguntas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPerguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerguntasActionPerformed(evt);
            }
        });

        btnGerar.setBackground(new java.awt.Color(255, 51, 51));
        btnGerar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnGerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGerar.setText("<html><center>Gerar Códigos</center></html>");
        btnGerar.setToolTipText("Agrupamento");
        btnGerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        btnPostos.setBackground(new java.awt.Color(255, 51, 51));
        btnPostos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnPostos.setForeground(new java.awt.Color(255, 255, 255));
        btnPostos.setText("<html><center>Cadastrar Postos de Controle</center></html>");
        btnPostos.setToolTipText("Postos de Controle");
        btnPostos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPostos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostosActionPerformed(evt);
            }
        });

        btnSenha.setBackground(new java.awt.Color(255, 51, 51));
        btnSenha.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnSenha.setForeground(new java.awt.Color(255, 255, 255));
        btnSenha.setText("<html><center>Cadastrar Senhas</center></html>");
        btnSenha.setToolTipText("Senha");
        btnSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSenha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenhaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Passaporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Simular Rally");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPerguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPostos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPerguntas, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(btnGrupo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGerar, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPostos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addComponent(btnSenha, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(277, Short.MAX_VALUE))
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

        menuCodigos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
        menuCodigos.setSelected(true);
        menuCodigos.setText("Gerar codigos");
        menuCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCodigosActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuCodigos);

        menuPostos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        menuPostos.setSelected(true);
        menuPostos.setText("Postos");
        menuPostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPostosActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuPostos);

        menuSenha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        menuSenha.setSelected(true);
        menuSenha.setText("Senha");
        menuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSenhaActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuSenha);

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

        setSize(new java.awt.Dimension(905, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        CRUDGrupo grupo = new CRUDGrupo(this, rootPaneCheckingEnabled);
        grupo.setVisible(true);
    }//GEN-LAST:event_menuGruposActionPerformed

    private void menuPerguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerguntasActionPerformed
        // Ao clicar no menu Perguntas irá chamar o Jform CRUDPerguntas
        CRUDPerguntas perguntas = new CRUDPerguntas(this, rootPaneCheckingEnabled);
         perguntas.setVisible(true);
    }//GEN-LAST:event_menuPerguntasActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // Ao clicar no botão saira da tela principal e chamara a tela de login.
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){//se apertar sim, irá voltar para a tela de login.
            TelaLogin l = new TelaLogin();
            l.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void menuCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCodigosActionPerformed
        // Ao clicar no botão ele irá chamar a tela AgrupamentoPesquisa
        AgrupamentosPesq ap = new AgrupamentosPesq(this, rootPaneCheckingEnabled);
        ap.setVisible(true);
    }//GEN-LAST:event_menuCodigosActionPerformed

    private void menuPostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPostosActionPerformed
        // Ao clicar no botão ele irá chamar a tela CREDPosto
        CRUDPostos postos = new CRUDPostos(this, rootPaneCheckingEnabled);
        postos.setVisible(true);
    }//GEN-LAST:event_menuPostosActionPerformed

    private void menuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSenhaActionPerformed
        // TODO add your handling code here:
        CRUDSenha senha = new CRUDSenha(this, rootPaneCheckingEnabled);
         senha.setVisible(true);
    }//GEN-LAST:event_menuSenhaActionPerformed

    private void btnSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenhaActionPerformed
        //Ao clicar no botão irá chamar a tela CRUDSenha
        CRUDSenha senha = new CRUDSenha(this, rootPaneCheckingEnabled);
        senha.setVisible(true);
    }//GEN-LAST:event_btnSenhaActionPerformed

    private void btnPostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostosActionPerformed
        // Ao clicar no botão ele irá chamar a tela CREDPosto
        CRUDPostos postos = new CRUDPostos(this, rootPaneCheckingEnabled);
        postos.setVisible(true);
    }//GEN-LAST:event_btnPostosActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        // Ao clicar no botão ele irá chamar a tela AgrupamentoPesquisa
        AgrupamentosPesq ap = new AgrupamentosPesq(this, rootPaneCheckingEnabled);
        ap.setVisible(true);
    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnPerguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerguntasActionPerformed
        // Ao clicar no botão aparecera a tela CRUDPerguntas.
        CRUDPerguntas perguntas = new CRUDPerguntas(this, rootPaneCheckingEnabled);
        perguntas.setVisible(true);
    }//GEN-LAST:event_btnPerguntasActionPerformed

    private void btnGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupoActionPerformed
        // Ao clicar no botão, chamara a tela CRUDGrupos.
        CRUDGrupo grupo = new CRUDGrupo(this, rootPaneCheckingEnabled);
        grupo.setVisible(true);
    }//GEN-LAST:event_btnGrupoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PassRally grupo = new PassRally(this, rootPaneCheckingEnabled);
        grupo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new FrmIniRally().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton btnPostos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem menuCodigos;
    private javax.swing.JCheckBoxMenuItem menuGrupos;
    private javax.swing.JCheckBoxMenuItem menuPerguntas;
    private javax.swing.JRadioButtonMenuItem menuPostos;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenu menuSair;
    private javax.swing.JRadioButtonMenuItem menuSenha;
    // End of variables declaration//GEN-END:variables
}
