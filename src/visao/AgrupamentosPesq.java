package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Grupo;
import model.dao.GrupoDAO;

public class AgrupamentosPesq extends javax.swing.JDialog {

    GrupoDAO fcnGrupo;
    ArrayList<Grupo> resultado;

    public AgrupamentosPesq(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        fcnGrupo = new GrupoDAO();
        //Procura todos os grupos
        resultado = fcnGrupo.findAll();
        //Preenche a tabela com cada entrada
        for(Grupo g : resultado){
            //Cria a String que será preenchida da direita para a esquerda
            String s;
            //Coloca o último algarismo
            if(g.isLiderSegundaFase())
                s = "1";
            else
                s = "0";
            //Coloca o posto
            s = String.valueOf(g.getCodigoPostoInicial()) + s;
            //Preenche o agrupamento com três dígitos
            s = String.valueOf(g.getCodigoAgrupamento()) + s;
            while (s.length() < 5)
                s = "0" + s;
            //Preenche o grupo com três dígitos
            s = String.valueOf(g.getCodigoGrupo());
            while (s.length() < 8)
                s = "0" + s;
            JOptionPane.showMessageDialog(null, s);
            //Preenche a linha da tabela
//            tabelaAgrupamento.add(s, 0);
//            tabelaAgrupamento.add(g.getNome(), 1);
//            tabelaAgrupamento.add(g.getRaLider(), 2);
            
        }
    }

    @Override
    public void dispose() {
        if (fcnGrupo.conexao != null) {
            try {
                fcnGrupo.closeConexao();
            } catch (SQLException e) {
            }
        }
        super.dispose();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAgrupamento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabela dos Grupos");
        jLabel1.setToolTipText("");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Voltar.png"))); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(125, 125, 125)
                .addComponent(btnVoltar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabelaAgrupamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Ra Líder"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAgrupamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaAgrupamento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(637, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // Ao clicar no botão fechara a tela.
        int voltar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja voltar?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (voltar == JOptionPane.YES_OPTION) {//se apertar sim, irá voltar para a tela de login.
            this.dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(AgrupamentosPesq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgrupamentosPesq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgrupamentosPesq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgrupamentosPesq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgrupamentosPesq dialog = new AgrupamentosPesq(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaAgrupamento;
    // End of variables declaration//GEN-END:variables
}
