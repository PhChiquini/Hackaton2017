package visao;

import javax.swing.JOptionPane;
import model.bean.Questoes;
import model.dao.QuestoesDAO;

public class CRUDPerguntas extends javax.swing.JDialog {

    Questoes q = new Questoes();
    QuestoesDAO d = new QuestoesDAO();

    public CRUDPerguntas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        manipularBotoes("Inicial");
        getUnitIncrement(10);
        d.getConexao();
    }


    @Override
    public void dispose() {
        if (d.conexao != null) {
            try {
                d.closeConexao();
            } catch (Exception e) {
            }
        }
        super.dispose();
    }

    private void salvar() {

        try {
            q.setCd_pc((comboQuestao.getSelectedIndex() - 1) / 4 + 1);
            q.setCd_quest(comboQuestao.getSelectedIndex());
            q.setPergunta(txtQuestao.getText());
            q.setAlternativa1(txtAlternativaA.getText());
            q.setAlternativa2(txtAlternativaB.getText());
            q.setAlternativa3(txtAlternativaC.getText());
            q.setAlternativa4(txtAlternativaD.getText());
            q.setAlternativa5(txtAlternativaE.getText());
            q.setCorreta(comboGabarito.getSelectedIndex() + 1);
            if (comboImagem.getSelectedIndex() == 1) {
                q.setImagem(true);
            } else {
                q.setImagem(false);
            }
            d.Insert(q);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a pergunta!" + "\n" + "Erro: " + e);
        }
    }

    private void manipularBotoes(String modo) {
        switch (modo) {
            case "Inicial":
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(true);
                comboQuestao.setSelectedIndex(0);
                txtQuestao.setText("");
                txtAlternativaA.setText("");
                txtAlternativaB.setText("");
                txtAlternativaC.setText("");
                txtAlternativaD.setText("");
                txtAlternativaE.setText("");
                comboGabarito.setSelectedIndex(0);
                comboImagem.setSelectedIndex(0);

                break;
            default:
                break;
        }
    }

    public int getUnitIncrement(int direction) {
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);
        return 10;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        pnlFundo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboGabarito = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboQuestao = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        comboImagem = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestao = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAlternativaA = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAlternativaB = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAlternativaC = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAlternativaD = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAlternativaE = new javax.swing.JTextPane();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Perguntas");

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 51, 51));
        btnSair.setText("VOLTAR");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Dados das Perguntas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Nº Questão:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Questão:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Resposta Certa:");

        comboGabarito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Alternativa A:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Alternativa B:");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Alternativa C:");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Alternativa D:");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Alternativa E:");

        comboQuestao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Possui imagem:");

        comboImagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        txtQuestao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuestaoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtQuestao);

        txtAlternativaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlternativaAKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtAlternativaA);

        txtAlternativaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlternativaBKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtAlternativaB);

        txtAlternativaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlternativaCKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(txtAlternativaC);

        txtAlternativaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlternativaDKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(txtAlternativaD);

        txtAlternativaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlternativaEKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(txtAlternativaE);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane7)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(comboGabarito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboImagem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel6))
                        .addGap(0, 656, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGabarito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSalvar.setBackground(new java.awt.Color(255, 51, 51));
        btnSalvar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(909, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // Ao clicar no botão fechara a tela.
        int voltar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja voltar?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (voltar == JOptionPane.YES_OPTION) {//se apertar sim, irá fechar a tela.
            this.dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        salvar();
        manipularBotoes("Inicial");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Ao clicar no botão cancelar
        int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? \n Irá apagar todos os campos digitados!", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (cancelar == JOptionPane.YES_OPTION) {//se apertar sim, irá apagar todos os campos.
            manipularBotoes("Inicial");
            //operacaoCancelar();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtQuestaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuestaoKeyPressed
        // TODO add your handling code here:
        if(!txtQuestao.getText().equals("")){
            btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_txtQuestaoKeyPressed

    private void txtAlternativaAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlternativaAKeyPressed
        // TODO add your handling code here:
        if(!txtAlternativaA.getText().equals("")){
            btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_txtAlternativaAKeyPressed

    private void txtAlternativaBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlternativaBKeyPressed
        // TODO add your handling code here:
        if(!txtAlternativaB.getText().equals("")){
            btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_txtAlternativaBKeyPressed

    private void txtAlternativaCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlternativaCKeyPressed
        // TODO add your handling code here:
        if(!txtAlternativaC.getText().equals("")){
            btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_txtAlternativaCKeyPressed

    private void txtAlternativaDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlternativaDKeyPressed
        // TODO add your handling code here:
        if(!txtAlternativaD.getText().equals("")){
            btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_txtAlternativaDKeyPressed

    private void txtAlternativaEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlternativaEKeyPressed
        // TODO add your handling code here:
        if(!txtAlternativaE.getText().equals("")){
            btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_txtAlternativaEKeyPressed

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
            java.util.logging.Logger.getLogger(CRUDPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CRUDPerguntas dialog = new CRUDPerguntas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboGabarito;
    private javax.swing.JComboBox<String> comboImagem;
    private javax.swing.JComboBox<String> comboQuestao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JTextPane txtAlternativaA;
    private javax.swing.JTextPane txtAlternativaB;
    private javax.swing.JTextPane txtAlternativaC;
    private javax.swing.JTextPane txtAlternativaD;
    private javax.swing.JTextPane txtAlternativaE;
    private javax.swing.JTextPane txtQuestao;
    // End of variables declaration//GEN-END:variables

}
