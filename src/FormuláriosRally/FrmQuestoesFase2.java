package FormuláriosRally;

import Classes.GrupoSessao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Questoes;
import model.bean.Gabarito;
import model.dao.GabaritoDAO;
import model.dao.AgrupamentoDAO;
import model.dao.QuestoesDAO;

public class FrmQuestoesFase2 extends javax.swing.JFrame {

    private GrupoSessao grupoObjeto;
    private QuestoesDAO fcnQuestoes;
    private GabaritoDAO fcnGabarito;
    private AgrupamentoDAO fcnAgrupamento;
    private Questoes questao;
    private int pontos;

    public FrmQuestoesFase2() {
        initComponents();
    }

    public FrmQuestoesFase2(GrupoSessao a, int n) {
        initComponents();

        fcnQuestoes = new QuestoesDAO();
        fcnGabarito = new GabaritoDAO();
        fcnAgrupamento = new AgrupamentoDAO();

        grupoObjeto = a;
        pontos = 5;
        atualizaPontuacao();

        questao = fcnQuestoes.find(n);

        String s = "<html>Questão " + questao.getCd_quest() + ": "
                + questao.getPergunta() + "</html>";

        lblQuestao.setText(s);
        lblImagem.setText("");

        if (questao.isImagem()) {
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensDasQuestoes/" + questao.getCd_quest() + ".png")));
        }

        lblAltA.setText("<html>" + questao.getAlternativa1() + "</html>;");
        lblAltB.setText("<html>" + questao.getAlternativa2() + "</html>;");
        lblAltC.setText("<html>" + questao.getAlternativa3() + "</html>;");
        lblAltD.setText("<html>" + questao.getAlternativa4() + "</html>;");
        lblAltE.setText("<html>" + questao.getAlternativa5() + "</html>;");

    }

    private void atualizaPontuacao() {
        lblPontuacao.setText("Valendo " + pontos + " Pontos!");
    }

    @Override
    public void dispose() {
        if(fcnAgrupamento.conexao != null){
            try {
                fcnAgrupamento.closeConexao();
            } catch (SQLException e) {
            }
        }
        if (fcnQuestoes.conexao != null) {
            try {
                fcnQuestoes.closeConexao();
            } catch (SQLException e) {
            }
        }
        if(fcnGabarito.conexao != null){
            try {
                fcnGabarito.closeConexao();
            } catch (SQLException e) {
            }
        }
        super.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel22 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        lblQuestao = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        optA = new javax.swing.JRadioButton();
        optB = new javax.swing.JRadioButton();
        optC = new javax.swing.JRadioButton();
        optD = new javax.swing.JRadioButton();
        optE = new javax.swing.JRadioButton();
        lblAltA = new javax.swing.JLabel();
        lblAltB = new javax.swing.JLabel();
        lblAltC = new javax.swing.JLabel();
        lblAltD = new javax.swing.JLabel();
        lblAltE = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();
        btnGabarito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enviar Resposta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblQuestao.setText("<html>O prêmio de um concurso é dividido igualmente entre os ganhadores. Há duas semanas foram 20 os ganhadores, cabendo a cada um a quantia de R$ 625,00. No concurso seguinte, há uma semana, o prêmio total havia aumentado em 30%. No entanto, nesse concurso, a quantidade de ganhadores aumentou em 60%. A diferença, em reais, entre o que um dos ganhadores do concurso que ocorreu há duas semanas recebeu e o que recebeu um dos ganhadores do concurso seguinte é igual a:</html>");
        lblQuestao.setToolTipText("");

        lblImagem.setText("jLabel7");

        lblAltA.setText("jLabel1");

        lblAltB.setText("jLabel1");

        lblAltC.setText("jLabel1");

        lblAltD.setText("jLabel1");

        lblAltE.setText("jLabel1");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(optE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAltE))
                    .addComponent(lblImagem)
                    .addComponent(lblQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(optA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAltA))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(optB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAltB))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(optC, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAltC))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(optD, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAltD)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optA)
                    .addComponent(lblAltA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optB)
                    .addComponent(lblAltB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optC)
                    .addComponent(lblAltC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optD)
                    .addComponent(lblAltD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optE)
                    .addComponent(lblAltE))
                .addContainerGap(340, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel27);

        lblPontuacao.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        lblPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontuacao.setText("Valendo N Pontos!");

        btnGabarito.setBackground(new java.awt.Color(255, 51, 51));
        btnGabarito.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        btnGabarito.setForeground(new java.awt.Color(255, 255, 255));
        btnGabarito.setText("Gabarito da Fase 1");
        btnGabarito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGabaritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGabarito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGabarito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (JOptionPane.showOptionDialog(null, "Deseja enviar?", "Confirmação", 0, 3, null, null, null) == 0) {
            if (optA.isSelected()) {
                if(questao.getCorreta() == 1){
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 1);
                    JOptionPane.showMessageDialog(null, "Resposta correta!");
                    fcnAgrupamento.somarPontos(grupoObjeto.getCodigoAgrupamento(), pontos);
                    if(questao.getCd_quest() <= 20)
                        new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                    this.dispose();
                }
                else{
                    if(pontos > 0){
                        JOptionPane.showMessageDialog(null, "Resposta errada!\nTente novamente.");
                        pontos -= 2;
                        atualizaPontuacao();
                        optA.setSelected(false);
                        optA.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Resposta errada.");
                        fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 1);
                        if(questao.getCd_quest() <= 20)
                            new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                        this.dispose();
                    }
                }
            } else if (optB.isSelected()) {
                if(questao.getCorreta() == 2){
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 2);
                    JOptionPane.showMessageDialog(null, "Resposta correta!");
                    fcnAgrupamento.somarPontos(grupoObjeto.getCodigoAgrupamento(), pontos);
                    if(questao.getCd_quest() <= 20)
                        new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                    this.dispose();
                }
                else{
                    if(pontos > 0){
                        JOptionPane.showMessageDialog(null, "Resposta errada!\nTente novamente.");
                        pontos -= 2;
                        atualizaPontuacao();
                        optB.setSelected(false);
                        optB.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Resposta errada.");
                        fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 2);
                        if(questao.getCd_quest() <= 20)
                            new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                        this.dispose();
                    }
                }
            } else if (optC.isSelected()) {
                if(questao.getCorreta() == 3){
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 3);
                    JOptionPane.showMessageDialog(null, "Resposta correta!");
                    fcnAgrupamento.somarPontos(grupoObjeto.getCodigoAgrupamento(), pontos);
                    if(questao.getCd_quest() <= 20)
                        new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                    this.dispose();
                }
                else{
                    if(pontos > 0){
                        JOptionPane.showMessageDialog(null, "Resposta errada!\nTente novamente.");
                        pontos -= 2;
                        atualizaPontuacao();
                        optC.setSelected(false);
                        optC.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Resposta errada.");
                        fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 3);
                        if(questao.getCd_quest() <= 20)
                            new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                        this.dispose();
                    }
                }
            } else if (optD.isSelected()) {
                if(questao.getCorreta() == 4){
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 4);
                    JOptionPane.showMessageDialog(null, "Resposta correta!");
                    fcnAgrupamento.somarPontos(grupoObjeto.getCodigoAgrupamento(), pontos);
                    if(questao.getCd_quest() <= 20)
                        new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                    this.dispose();
                }
                else{
                    if(pontos > 0){
                        JOptionPane.showMessageDialog(null, "Resposta errada!\nTente novamente.");
                        pontos -= 2;
                        atualizaPontuacao();
                        optD.setSelected(false);
                        optD.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Resposta errada.");
                        fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 4);
                        if(questao.getCd_quest() <= 20)
                            new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                        this.dispose();
                    }
                }
            } else if (optE.isSelected()) {
                if(questao.getCorreta() == 5){
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 5);
                    JOptionPane.showMessageDialog(null, "Resposta correta!");
                    fcnAgrupamento.somarPontos(grupoObjeto.getCodigoAgrupamento(), pontos);
                    if(questao.getCd_quest() <= 20)
                        new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                    this.dispose();
                }
                else{
                    if(pontos > 0){
                        JOptionPane.showMessageDialog(null, "Resposta errada!\nTente novamente.");
                        pontos -= 2;
                        atualizaPontuacao();
                        optE.setSelected(false);
                        optE.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Resposta errada.");
                        fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase2(), questao.getCd_quest(), 5);
                        if(questao.getCd_quest() <= 20)
                            new FrmQuestoesFase2(grupoObjeto, questao.getCd_quest()+1).setVisible(true);
                        this.dispose();
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGabaritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGabaritoActionPerformed
        new FrmGabarito(fcnGabarito.find(grupoObjeto.getCodigoGabaritoFase1())).setVisible(true);
    }//GEN-LAST:event_btnGabaritoActionPerformed

    

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
            java.util.logging.Logger.getLogger(FrmQuestoesFase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQuestoesFase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQuestoesFase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQuestoesFase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQuestoesFase2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGabarito;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAltA;
    private javax.swing.JLabel lblAltB;
    private javax.swing.JLabel lblAltC;
    private javax.swing.JLabel lblAltD;
    private javax.swing.JLabel lblAltE;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblQuestao;
    private javax.swing.JRadioButton optA;
    private javax.swing.JRadioButton optB;
    private javax.swing.JRadioButton optC;
    private javax.swing.JRadioButton optD;
    private javax.swing.JRadioButton optE;
    // End of variables declaration//GEN-END:variables
}
