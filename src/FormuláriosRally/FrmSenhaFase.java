package FormuláriosRally;

import Classes.GrupoSessao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.dao.SenhasDAO;

public class FrmSenhaFase extends javax.swing.JFrame {

    private GrupoSessao grupoObjeto;
    private SenhasDAO fcnSenha;

    private FrmSenhaFase() {
        initComponents();
    }

    public FrmSenhaFase(GrupoSessao g) {
        initComponents();
        
        fcnSenha = new SenhasDAO();
        
        grupoObjeto = g;
        preencherBanner();
    }
    
    @Override
    public void dispose(){
        if(fcnSenha.conexao != null){
            try {
                fcnSenha.closeConexao();
            } catch (SQLException e) {
            }
        }
        super.dispose();
    }

    private void preencherBanner() {
        //Prennche o nome grupo
        lblNmGrupo.setText(grupoObjeto.getNome());
        //Preenche o código da esquipe com três algarismos
        String s = String.valueOf(grupoObjeto.getCodigoGrupo());
        while (s.length() != 3) {
            s = "0" + s;
        }
        
        lblEqp2.setText(s);
        //Preenche o código do Agrupamento com três algarismos
        s = String.valueOf(grupoObjeto.getCodigoAgrupamento());
        while (s.length() != 3) {
            s = "0" + s;
        }
        lblAgrup.setText(s);

        //Preenche o posto inicial
        s = String.valueOf(grupoObjeto.getCodigoPostoInicial()) + " - " + grupoObjeto.getNomePosto();
        lblPcInicial.setText(s);

        //Preenche se é líder da segunda fase
        if (grupoObjeto.isLiderSegundaFase()) {
            lblLidGrupo.setText("Sim");
        } else {
            lblLidGrupo.setText("Não");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtSenhaFase = new javax.swing.JTextField();
        btnFase = new javax.swing.JButton();
        pnlId2 = new javax.swing.JPanel();
        pnlEqp2 = new javax.swing.JPanel();
        lblEqp2 = new javax.swing.JLabel();
        pnlGrupo = new javax.swing.JPanel();
        lblAgrup = new javax.swing.JLabel();
        pnlPcInicial = new javax.swing.JPanel();
        lblPcInicial = new javax.swing.JLabel();
        pnlLidGrupo = new javax.swing.JPanel();
        lblLidGrupo = new javax.swing.JLabel();
        pnlNmGrup = new javax.swing.JPanel();
        lblNmGrupo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("<html><center>Insira a Senha informada pelo Apresentador</center></html>");

        edtSenhaFase.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        edtSenhaFase.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnFase.setBackground(new java.awt.Color(255, 51, 51));
        btnFase.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        btnFase.setForeground(new java.awt.Color(255, 255, 255));
        btnFase.setText("Iniciar 1ª Fase");
        btnFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaseActionPerformed(evt);
            }
        });

        pnlId2.setBackground(new java.awt.Color(255, 255, 255));
        pnlId2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlEqp2.setBackground(new java.awt.Color(255, 255, 255));
        pnlEqp2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Equipe ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        lblEqp2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblEqp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEqp2.setText("000");

        javax.swing.GroupLayout pnlEqp2Layout = new javax.swing.GroupLayout(pnlEqp2);
        pnlEqp2.setLayout(pnlEqp2Layout);
        pnlEqp2Layout.setHorizontalGroup(
            pnlEqp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEqp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEqp2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEqp2Layout.setVerticalGroup(
            pnlEqp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEqp2Layout.createSequentialGroup()
                .addComponent(lblEqp2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlGrupo.setBackground(new java.awt.Color(255, 255, 255));
        pnlGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Grupo ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        lblAgrup.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblAgrup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgrup.setText("000");

        javax.swing.GroupLayout pnlGrupoLayout = new javax.swing.GroupLayout(pnlGrupo);
        pnlGrupo.setLayout(pnlGrupoLayout);
        pnlGrupoLayout.setHorizontalGroup(
            pnlGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgrup, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlGrupoLayout.setVerticalGroup(
            pnlGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGrupoLayout.createSequentialGroup()
                .addComponent(lblAgrup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPcInicial.setBackground(new java.awt.Color(255, 255, 255));
        pnlPcInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Posto Inicial ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        lblPcInicial.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblPcInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPcInicial.setText("1 - EUA");

        javax.swing.GroupLayout pnlPcInicialLayout = new javax.swing.GroupLayout(pnlPcInicial);
        pnlPcInicial.setLayout(pnlPcInicialLayout);
        pnlPcInicialLayout.setHorizontalGroup(
            pnlPcInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPcInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPcInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPcInicialLayout.setVerticalGroup(
            pnlPcInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPcInicialLayout.createSequentialGroup()
                .addComponent(lblPcInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLidGrupo.setBackground(new java.awt.Color(255, 255, 255));
        pnlLidGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Líder do Grupo ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        lblLidGrupo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblLidGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLidGrupo.setText("1");

        javax.swing.GroupLayout pnlLidGrupoLayout = new javax.swing.GroupLayout(pnlLidGrupo);
        pnlLidGrupo.setLayout(pnlLidGrupoLayout);
        pnlLidGrupoLayout.setHorizontalGroup(
            pnlLidGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLidGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLidGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLidGrupoLayout.setVerticalGroup(
            pnlLidGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLidGrupoLayout.createSequentialGroup()
                .addComponent(lblLidGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNmGrup.setBackground(new java.awt.Color(255, 255, 255));
        pnlNmGrup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Nome do Grupo ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        lblNmGrupo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblNmGrupo.setText("Nome do Grupo");

        javax.swing.GroupLayout pnlNmGrupLayout = new javax.swing.GroupLayout(pnlNmGrup);
        pnlNmGrup.setLayout(pnlNmGrupLayout);
        pnlNmGrupLayout.setHorizontalGroup(
            pnlNmGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNmGrupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNmGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNmGrupLayout.setVerticalGroup(
            pnlNmGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNmGrupLayout.createSequentialGroup()
                .addComponent(lblNmGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlId2Layout = new javax.swing.GroupLayout(pnlId2);
        pnlId2.setLayout(pnlId2Layout);
        pnlId2Layout.setHorizontalGroup(
            pnlId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlId2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlId2Layout.createSequentialGroup()
                        .addComponent(pnlEqp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPcInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlLidGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(pnlId2Layout.createSequentialGroup()
                        .addComponent(pnlNmGrup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlId2Layout.setVerticalGroup(
            pnlId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlId2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNmGrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPcInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEqp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLidGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(edtSenhaFase)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlId2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edtSenhaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFase, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaseActionPerformed
        if(edtSenhaFase.getText().equals(fcnSenha.find(1).getSenhaF1())){
            new FrmPrincPontoControle(grupoObjeto).setVisible(true);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "Senha incorreta!\nSe o erro persistir procure um organizador.", "Aviso", 2);
    }//GEN-LAST:event_btnFaseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSenhaFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSenhaFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSenhaFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSenhaFase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSenhaFase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFase;
    private javax.swing.JTextField edtSenhaFase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgrup;
    private javax.swing.JLabel lblEqp;
    private javax.swing.JLabel lblEqp1;
    private javax.swing.JLabel lblEqp2;
    private javax.swing.JLabel lblLidGrupo;
    private javax.swing.JLabel lblNmGrupo;
    private javax.swing.JLabel lblPcInicial;
    private javax.swing.JPanel pnlEqp;
    private javax.swing.JPanel pnlEqp1;
    private javax.swing.JPanel pnlEqp2;
    private javax.swing.JPanel pnlGrupo;
    private javax.swing.JPanel pnlId;
    private javax.swing.JPanel pnlId1;
    private javax.swing.JPanel pnlId2;
    private javax.swing.JPanel pnlLidGrupo;
    private javax.swing.JPanel pnlNmGrup;
    private javax.swing.JPanel pnlPcInicial;
    // End of variables declaration//GEN-END:variables
}
