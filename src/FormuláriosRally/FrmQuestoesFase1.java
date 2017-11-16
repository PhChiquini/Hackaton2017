package FormuláriosRally;

import Classes.GrupoSessao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Questoes;
import model.bean.Gabarito;
import model.dao.GabaritoDAO;
import model.dao.GrupoDAO;
import model.dao.QuestoesDAO;

public class FrmQuestoesFase1 extends javax.swing.JFrame {

    private GrupoSessao grupoObjeto;
    private GabaritoDAO fcnGabarito;
    private GrupoDAO fcnGrupo;
    private QuestoesDAO fcnQuestoes;
    private Questoes questao;
    private Gabarito gabarito;

    public FrmQuestoesFase1() {
        initComponents();
    }

    public FrmQuestoesFase1(int numeroQuestao, GrupoSessao grupoObjeto) {
        initComponents();

        fcnGabarito = new GabaritoDAO();
        fcnGrupo = new GrupoDAO();
        fcnQuestoes = new QuestoesDAO();
        System.out.println("aqui");
        questao = fcnQuestoes.find(numeroQuestao);
        this.grupoObjeto = grupoObjeto;
        System.out.println("Erro");

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

        lblNomePosto.setText("Posto " + questao.getCd_pc());
        
        preencherBanner();
    }
    
    public FrmQuestoesFase1(int numeroQuestao, GrupoSessao grupoObjeto, Gabarito g) {
        initComponents();

        fcnGabarito = new GabaritoDAO();
        fcnGrupo = new GrupoDAO();
        fcnQuestoes = new QuestoesDAO();

        questao = fcnQuestoes.find(numeroQuestao);
        this.grupoObjeto = grupoObjeto;
        gabarito = g;

        jButton1.setText("Próxima Questão");

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

        lblNomePosto.setText("Posto " + questao.getCd_pc());
        
        optA.setEnabled(false);
        optB.setEnabled(false);
        optC.setEnabled(false);
        optD.setEnabled(false);
        optE.setEnabled(false);

        switch (g.getResposta(questao.getCd_quest())) {
            case 1:
                optA.setSelected(true);
                break;
            case 2:
                optB.setSelected(true);
                break;
            case 3:
                optC.setSelected(true);
                break;
            case 4:
                optD.setSelected(true);
                break;
            case 5:
                optE.setSelected(true);
                break;
        }
        
        preencherBanner();
    }

    @Override
    public void dispose() {
        if (fcnGabarito.conexao != null) {
            try {
                fcnGabarito.closeConexao();
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
    
    private void preencherBanner(){
        //Prennche o nome grupo
        lblNmGrupo.setText(grupoObjeto.getNome());
        
        //Preenche o código da esquipe com três algarismos
        String s = String.valueOf(grupoObjeto.getCodigoGrupo());
        while(s.length() != 3){
            s = "0" + s;
        }
        lblEqp.setText(s);
        
        //Preenche o código do Agrupamento com três algarismos
        s = String.valueOf(grupoObjeto.getCodigoAgrupamento());
        while(s.length() != 3){
            s = "0" + s;
        }
        lblAgrup.setText(s);
        
        //Preenche o posto inicial
        s = String.valueOf(grupoObjeto.getCodigoPostoInicial()) + " - " + grupoObjeto.getNomePosto();
        lblPcInicial.setText(s);
        
        //Preenche se é líder da segunda fase
        if(grupoObjeto.isLiderSegundaFase())
            lblLidGrupo.setText("Sim");
        else
            lblLidGrupo.setText("Não");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrpBtnRespostas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlQuestao = new javax.swing.JPanel();
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
        pnlId = new javax.swing.JPanel();
        pnlEqp = new javax.swing.JPanel();
        lblEqp = new javax.swing.JLabel();
        pnlAgrup = new javax.swing.JPanel();
        lblAgrup = new javax.swing.JLabel();
        pnlAgrup1 = new javax.swing.JPanel();
        lblPcInicial = new javax.swing.JLabel();
        pnlAgrup2 = new javax.swing.JPanel();
        lblLidGrupo = new javax.swing.JLabel();
        pnlAgrup3 = new javax.swing.JPanel();
        lblNmGrupo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNomePosto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enviar Resposta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pnlQuestao.setBackground(new java.awt.Color(255, 255, 255));
        pnlQuestao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblQuestao.setText("<html>O prêmio de um concurso é dividido igualmente entre os ganhadores. Há duas semanas foram 20 os ganhadores, cabendo a cada um a quantia de R$ 625,00. No concurso seguinte, há uma semana, o prêmio total havia aumentado em 30%. No entanto, nesse concurso, a quantidade de ganhadores aumentou em 60%. A diferença, em reais, entre o que um dos ganhadores do concurso que ocorreu há duas semanas recebeu e o que recebeu um dos ganhadores do concurso seguinte é igual a:</html>");
        lblQuestao.setToolTipText("");

        lblImagem.setText("jLabel7");

        GrpBtnRespostas.add(optA);

        GrpBtnRespostas.add(optB);

        GrpBtnRespostas.add(optC);

        GrpBtnRespostas.add(optD);

        GrpBtnRespostas.add(optE);

        lblAltA.setText("jLabel2");

        lblAltB.setText("jLabel3");

        lblAltC.setText("jLabel4");

        lblAltD.setText("jLabel5");

        lblAltE.setText("jLabel6");

        javax.swing.GroupLayout pnlQuestaoLayout = new javax.swing.GroupLayout(pnlQuestao);
        pnlQuestao.setLayout(pnlQuestaoLayout);
        pnlQuestaoLayout.setHorizontalGroup(
            pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuestaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlQuestaoLayout.createSequentialGroup()
                        .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagem)
                            .addGroup(pnlQuestaoLayout.createSequentialGroup()
                                .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(optC)
                                    .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(optA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(optB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(optD)
                                    .addComponent(optE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAltA)
                                    .addComponent(lblAltB)
                                    .addComponent(lblAltC)
                                    .addComponent(lblAltD)
                                    .addComponent(lblAltE))))
                        .addGap(0, 358, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlQuestaoLayout.setVerticalGroup(
            pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuestaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlQuestaoLayout.createSequentialGroup()
                        .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlQuestaoLayout.createSequentialGroup()
                                .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlQuestaoLayout.createSequentialGroup()
                                        .addComponent(lblQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(lblImagem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(optA, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAltA))
                                .addGap(11, 11, 11)
                                .addComponent(optB))
                            .addComponent(lblAltB))
                        .addGap(11, 11, 11)
                        .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAltC, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(11, 11, 11)
                        .addComponent(optD))
                    .addComponent(lblAltD))
                .addGap(11, 11, 11)
                .addGroup(pnlQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(optE)
                    .addComponent(lblAltE))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlQuestao);

        pnlId.setBackground(new java.awt.Color(255, 255, 255));
        pnlId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlEqp.setBackground(new java.awt.Color(255, 255, 255));
        pnlEqp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Equipe ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N

        lblEqp.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblEqp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEqp.setText("000");

        javax.swing.GroupLayout pnlEqpLayout = new javax.swing.GroupLayout(pnlEqp);
        pnlEqp.setLayout(pnlEqpLayout);
        pnlEqpLayout.setHorizontalGroup(
            pnlEqpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEqpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEqp, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEqpLayout.setVerticalGroup(
            pnlEqpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEqpLayout.createSequentialGroup()
                .addComponent(lblEqp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAgrup.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgrup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Grupo ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N

        lblAgrup.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblAgrup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgrup.setText("000");

        javax.swing.GroupLayout pnlAgrupLayout = new javax.swing.GroupLayout(pnlAgrup);
        pnlAgrup.setLayout(pnlAgrupLayout);
        pnlAgrupLayout.setHorizontalGroup(
            pnlAgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgrup, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgrupLayout.setVerticalGroup(
            pnlAgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrupLayout.createSequentialGroup()
                .addComponent(lblAgrup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAgrup1.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgrup1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Posto Inicial ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N

        lblPcInicial.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblPcInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPcInicial.setText("1 - EUA");

        javax.swing.GroupLayout pnlAgrup1Layout = new javax.swing.GroupLayout(pnlAgrup1);
        pnlAgrup1.setLayout(pnlAgrup1Layout);
        pnlAgrup1Layout.setHorizontalGroup(
            pnlAgrup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrup1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPcInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgrup1Layout.setVerticalGroup(
            pnlAgrup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrup1Layout.createSequentialGroup()
                .addComponent(lblPcInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAgrup2.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgrup2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Líder do Agrupamento ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N

        lblLidGrupo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblLidGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLidGrupo.setText("1");

        javax.swing.GroupLayout pnlAgrup2Layout = new javax.swing.GroupLayout(pnlAgrup2);
        pnlAgrup2.setLayout(pnlAgrup2Layout);
        pnlAgrup2Layout.setHorizontalGroup(
            pnlAgrup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrup2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLidGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgrup2Layout.setVerticalGroup(
            pnlAgrup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrup2Layout.createSequentialGroup()
                .addComponent(lblLidGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAgrup3.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgrup3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Nome do Grupo ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N

        lblNmGrupo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblNmGrupo.setText("Nome do Grupo");

        javax.swing.GroupLayout pnlAgrup3Layout = new javax.swing.GroupLayout(pnlAgrup3);
        pnlAgrup3.setLayout(pnlAgrup3Layout);
        pnlAgrup3Layout.setHorizontalGroup(
            pnlAgrup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrup3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNmGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgrup3Layout.setVerticalGroup(
            pnlAgrup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrup3Layout.createSequentialGroup()
                .addComponent(lblNmGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlIdLayout = new javax.swing.GroupLayout(pnlId);
        pnlId.setLayout(pnlIdLayout);
        pnlIdLayout.setHorizontalGroup(
            pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdLayout.createSequentialGroup()
                        .addComponent(pnlAgrup3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlIdLayout.createSequentialGroup()
                        .addComponent(pnlEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAgrup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAgrup2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        pnlIdLayout.setVerticalGroup(
            pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAgrup3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAgrup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAgrup2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), " Posto Atual ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        lblNomePosto.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblNomePosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomePosto.setText("Nome do Posto Atual");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomePosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblNomePosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (optA.isEnabled()) {
            if (JOptionPane.showOptionDialog(null, "Essa resposta é final.\nDeseja enviar?", "Confirmação", 0, 3, null, null, null) == 0) {
                if (optA.isSelected()) {
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase1(), questao.getCd_quest(), 1);
                    if (questao.getCorreta() == 1) {
                        fcnGrupo.somarPontosGrupo(grupoObjeto.getCodigoGrupo(), 1);
                    }
                } else if (optB.isSelected()) {
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase1(), questao.getCd_quest(), 2);
                    if (questao.getCorreta() == 2) {
                        fcnGrupo.somarPontosGrupo(grupoObjeto.getCodigoGrupo(), 1);
                    }
                } else if (optC.isSelected()) {
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase1(), questao.getCd_quest(), 3);
                    if (questao.getCorreta() == 3) {
                        fcnGrupo.somarPontosGrupo(grupoObjeto.getCodigoGrupo(), 1);
                    }
                } else if (optD.isSelected()) {
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase1(), questao.getCd_quest(), 4);
                    if (questao.getCorreta() == 4) {
                        fcnGrupo.somarPontosGrupo(grupoObjeto.getCodigoGrupo(), 1);
                    }
                } else if (optE.isSelected()) {
                    fcnGabarito.updateResposta(grupoObjeto.getCodigoGabaritoFase1(), questao.getCd_quest(), 5);
                    if (questao.getCorreta() == 5) {
                        fcnGrupo.somarPontosGrupo(grupoObjeto.getCodigoGrupo(), 1);
                    }
                }

                if (questao.getCd_quest() / 4 < questao.getCd_pc()) {
                    new FrmQuestoesFase1(questao.getCd_quest() + 1, grupoObjeto).setVisible(true);
                    this.dispose();
                } else {
                    grupoObjeto.incrementPostoAtual();
                    this.dispose();
                }
            }
        } else {
            if (questao.getCd_quest() / 4 < questao.getCd_pc()) {
                new FrmQuestoesFase1(questao.getCd_quest() + 1, grupoObjeto, gabarito).setVisible(true);
                this.dispose();
            } else {
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmQuestoesFase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQuestoesFase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQuestoesFase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQuestoesFase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQuestoesFase1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrpBtnRespostas;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgrup;
    private javax.swing.JLabel lblAltA;
    private javax.swing.JLabel lblAltB;
    private javax.swing.JLabel lblAltC;
    private javax.swing.JLabel lblAltD;
    private javax.swing.JLabel lblAltE;
    private javax.swing.JLabel lblEqp;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblLidGrupo;
    private javax.swing.JLabel lblNmGrupo;
    private javax.swing.JLabel lblNomePosto;
    private javax.swing.JLabel lblPcInicial;
    private javax.swing.JLabel lblQuestao;
    private javax.swing.JRadioButton optA;
    private javax.swing.JRadioButton optB;
    private javax.swing.JRadioButton optC;
    private javax.swing.JRadioButton optD;
    private javax.swing.JRadioButton optE;
    private javax.swing.JPanel pnlAgrup;
    private javax.swing.JPanel pnlAgrup1;
    private javax.swing.JPanel pnlAgrup2;
    private javax.swing.JPanel pnlAgrup3;
    private javax.swing.JPanel pnlEqp;
    private javax.swing.JPanel pnlId;
    private javax.swing.JPanel pnlQuestao;
    // End of variables declaration//GEN-END:variables
}
