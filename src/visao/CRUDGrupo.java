package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Agrupamento;
import model.bean.Aluno;
import model.bean.Grupo;
import model.dao.AgrupamentoDAO;
import model.dao.AlunoDAO;
import model.dao.GrupoDAO;

public class CRUDGrupo extends javax.swing.JDialog {

    private AgrupamentoDAO fcnAgrupamento;
    private GrupoDAO fcnGrupo;
    private AlunoDAO fcnAluno;

    private Agrupamento agrupamento;
    private Grupo grupo;
    private Aluno aluno;

    
    public CRUDGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        fcnAgrupamento = new AgrupamentoDAO();
        fcnGrupo = new GrupoDAO();
        fcnAluno = new AlunoDAO();
    }

    public void dispose() {
        if (fcnAgrupamento.conexao != null) {
            try {
                fcnAgrupamento.closeConexao();
            } catch (SQLException e) {
            }
        }
        if (fcnAluno.conexao != null) {
            try {
                fcnAluno.closeConexao();
            } catch (SQLException e) {
            }
        }
        if (fcnGrupo.conexao != null) {
            try {
                fcnGrupo.closeConexao();
            } catch (SQLException e) {
            }
        }
        super.dispose();
    }

    private void gravar() {
        aluno = new Aluno();
        grupo = new Grupo();
        grupo.setCodigoGrupo(fcnGrupo.getQuantidadeGrupos()+1);

        //Preenche as informações do grupo a ser gravado
        grupo.setNome(txtNomeGrupo.getText());
        grupo.setEmail(txtEmail.getText());
        grupo.setRaLider(Integer.parseInt(txtRALider.getText()));
        
        if(opcNao.isSelected())
            grupo.setCaracterizado(false);
        else
            grupo.setCaracterizado(true);

        //Verifica o agrupamento do grupo, se encher o último agrupamento ativo cria um novo
        agrupamento = fcnAgrupamento.retUltimoAgupamento();
        if (agrupamento.getQuantidadeGrupos() < 3 && agrupamento.getQuantidadeGrupos() != 0) {
            fcnAgrupamento.updateNumero(agrupamento.getCodigoAgrupamento(), agrupamento.getQuantidadeGrupos() + 1);
            grupo.setLiderSegundaFase(false);
        } 
        else {
            Agrupamento a = new Agrupamento();

            a.setCodigoLider(Integer.parseInt(txtRALider.getText()));
            a.setQuantidadeGrupos(1);
            fcnAgrupamento.insert(a);

            agrupamento = fcnAgrupamento.retUltimoAgupamento();
            grupo.setLiderSegundaFase(true);
        }
        //Atualiza o agrupamento do grupo
        grupo.setCodigoAgrupamento(agrupamento.getCodigoAgrupamento());

        //Determina qual será o posto inicial
        grupo.setCodigoPostoInicial(grupo.getCodigoGrupo() % 5);
        if(grupo.getCodigoPostoInicial() == 0)
            grupo.setCodigoPostoInicial(5);
        
        //Insere o grupo no BD
        fcnGrupo.insert(grupo);
        
        //Preenche e insere os dados do líder
        aluno.setCodigoGrupo(grupo.getCodigoGrupo());
        aluno.setNome(txtNomeLider.getText());
        aluno.setRa(Integer.valueOf(txtRALider.getText()));
        
        fcnAluno.insert(aluno);
        
        //Verifica se há um segundo aluno no grupo, se sim o insere
        if(comboParticipantes.getSelectedIndex() >= 1){
            aluno.setNome(txtNomeP1.getText());
            aluno.setRa(Integer.valueOf(txtRAP1.getText()));
        
            fcnAluno.insert(aluno);
        }
        //Verifica se há um terceiro aluno no grupo, se sim o insere
        if(comboParticipantes.getSelectedIndex() >= 2){
            aluno.setNome(txtNomeP2.getText());
            aluno.setRa(Integer.valueOf(txtRAP2.getText()));
        
            fcnAluno.insert(aluno);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtRALider = new javax.swing.JTextField();
        txtNomeLider = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboParticipantes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNomeGrupo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtRAP1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeP1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRAP2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNomeP2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        opcNao = new javax.swing.JRadioButton();
        opcSim = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Grupos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(237, 237, 237))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Dados do Grupo ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("RA Líder:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Nome Líder");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Participantes:");

        comboParticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        comboParticipantes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboParticipantesItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Nome Grupo:");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("E-mail:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtRALider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeLider, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboParticipantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRALider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Dados do Grupo ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Participante 1:");

        txtRAP1.setEditable(false);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("RA:");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Nome:");

        txtNomeP1.setEditable(false);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Participante 2:");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("RA:");

        txtRAP2.setEditable(false);

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Nome:");

        txtNomeP2.setEditable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "<html><center> Equipe<br> Caracterizada?</center></html>", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 51, 51));

        opcNao.setSelected(true);
        opcNao.setText("Não");

        opcSim.setText("Sim");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcNao)
                    .addComponent(opcSim))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(opcNao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcSim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRAP2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRAP1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeP1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeP2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRAP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtNomeP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtRAP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtNomeP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnSalvar.setBackground(new java.awt.Color(255, 51, 51));
        btnSalvar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnVoltar.setBackground(new java.awt.Color(255, 51, 51));
        btnVoltar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

        setSize(new java.awt.Dimension(702, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboParticipantesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboParticipantesItemStateChanged
        if(comboParticipantes.getSelectedIndex() >= 1){
            txtNomeP1.setEditable(true);
            txtRAP1.setEditable(true);
        }
        else{
            txtNomeP1.setEditable(false);
            txtNomeP1.setText("");
            txtRAP1.setEditable(false);
            txtRAP1.setText("");
        }
        if(comboParticipantes.getSelectedIndex() >= 2){
            txtNomeP2.setEditable(true);
            txtRAP2.setEditable(true);
        }
        else{
            txtNomeP2.setEditable(false);
            txtNomeP2.setText("");
            txtRAP2.setEditable(false);
            txtRAP2.setText("");
        }
    }//GEN-LAST:event_comboParticipantesItemStateChanged

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        int voltar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja voltar?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (voltar == JOptionPane.YES_OPTION) {//se apertar sim, irá voltar para a tela de login.
            this.dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        gravar();
        JOptionPane.showMessageDialog(null, "Grupo cadastrado com sucesso!");
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CRUDGrupo dialog = new CRUDGrupo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboParticipantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton opcNao;
    private javax.swing.JRadioButton opcSim;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomeGrupo;
    private javax.swing.JTextField txtNomeLider;
    private javax.swing.JTextField txtNomeP1;
    private javax.swing.JTextField txtNomeP2;
    private javax.swing.JTextField txtRALider;
    private javax.swing.JTextField txtRAP1;
    private javax.swing.JTextField txtRAP2;
    // End of variables declaration//GEN-END:variables
}
