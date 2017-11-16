package FormuláriosRally;

import Classes.GrupoSessao;
import java.sql.SQLException;
import model.dao.GabaritoDAO;

public class FrmPrincPontoControle extends javax.swing.JFrame {

    private GrupoSessao grupoObjeto;
    private GabaritoDAO fcnGabaritoDAO;
    
    public FrmPrincPontoControle() {
        initComponents();

        btnFase2.setVisible(false);
        btnGabaritoFase2.setVisible(false);

        pnlPost1.setVisible(true);
        pnlPost2.setVisible(true);
        pnlPost3.setVisible(true);
        pnlPost4.setVisible(true);
        pnlPost5.setVisible(true);
    }
    
    public FrmPrincPontoControle(GrupoSessao grupoObjeto){
        initComponents();
        
        fcnGabaritoDAO = new GabaritoDAO();
        
        this.grupoObjeto = grupoObjeto;
        
        btnFase2.setVisible(true);
        pnlPost1.setVisible(false);
        pnlPost2.setVisible(false);
        pnlPost3.setVisible(false);
        pnlPost4.setVisible(false);
        pnlPost5.setVisible(false);
        
        btnGabaritoFase2.setVisible(false);
        
        preencherBanner();
    }
    
    @Override
    public void dispose(){
        if(fcnGabaritoDAO.conexao != null){
            try {
                fcnGabaritoDAO.closeConexao();
            } catch (SQLException e) {
            }
        }
    }
    
    private void preencherBanner() {
        //Prennche o nome grupo
        lblNmGrupo.setText(grupoObjeto.getNome());

        //Preenche o código da esquipe com três algarismos
        String s = String.valueOf(grupoObjeto.getCodigoGrupo());
        while (s.length() != 3) {
            s = "0" + s;
        }
        lblEqp.setText(s);

        //Preenche o código do Agrupamento com três algarismos
        s = String.valueOf(grupoObjeto.getCodigoAgrupamento());
        while (s.length() != 3) {
            s = "0" + s;
        }
        lblGrup.setText(s);

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

    private void atualiza(){
        switch(grupoObjeto.getPostoAtual()){
            case 1:
                pnlPost1.setVisible(true);
                break;
            case 2:
                pnlPost2.setVisible(true);
                break;
            case 3:
                pnlPost3.setVisible(true);
                break;
            case 4:
                pnlPost4.setVisible(true);
                break;
            case 5:
                pnlPost5.setVisible(true);
                break;
        }
        
        if(     pnlPost1.isVisible() &&
                pnlPost2.isVisible() &&
                pnlPost3.isVisible() &&
                pnlPost4.isVisible() &&
                pnlPost5.isVisible()){
            
            btnFase2.setVisible(true);
            pnlAgrup2.setVisible(false);
            btnGabaritoFase2.setVisible(true);
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        pnlId = new javax.swing.JPanel();
        pnlEqp = new javax.swing.JPanel();
        lblEqp = new javax.swing.JLabel();
        pnlAgrup = new javax.swing.JPanel();
        lblGrup = new javax.swing.JLabel();
        pnlAgrup1 = new javax.swing.JPanel();
        lblPcInicial = new javax.swing.JLabel();
        pnlAgrup2 = new javax.swing.JPanel();
        lblLidGrupo = new javax.swing.JLabel();
        btnGabaritoFase2 = new javax.swing.JButton();
        pnlAgrup3 = new javax.swing.JPanel();
        lblNmGrupo = new javax.swing.JLabel();
        btnGabaritoFase1 = new javax.swing.JButton();
        scrPnFundoPontContr = new javax.swing.JScrollPane();
        pnlFundoPc = new javax.swing.JPanel();
        pnlPost5 = new javax.swing.JPanel();
        lblTitPost8 = new javax.swing.JLabel();
        lblImgPost8 = new javax.swing.JLabel();
        btnIngPost8 = new javax.swing.JButton();
        pnlPost4 = new javax.swing.JPanel();
        lblTitPost4 = new javax.swing.JLabel();
        lblImgPost4 = new javax.swing.JLabel();
        btnIngPost4 = new javax.swing.JButton();
        pnlPost3 = new javax.swing.JPanel();
        lblTitPost3 = new javax.swing.JLabel();
        lblImgPost3 = new javax.swing.JLabel();
        btnIngPost3 = new javax.swing.JButton();
        pnlPost2 = new javax.swing.JPanel();
        lblTitPost2 = new javax.swing.JLabel();
        lblImgPost2 = new javax.swing.JLabel();
        btnIngPost2 = new javax.swing.JButton();
        pnlPost1 = new javax.swing.JPanel();
        lblTitPost1 = new javax.swing.JLabel();
        lblImgPost1 = new javax.swing.JLabel();
        btnIngPost1 = new javax.swing.JButton();
        btnFase2 = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

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

        lblGrup.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblGrup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrup.setText("000");

        javax.swing.GroupLayout pnlAgrupLayout = new javax.swing.GroupLayout(pnlAgrup);
        pnlAgrup.setLayout(pnlAgrupLayout);
        pnlAgrupLayout.setHorizontalGroup(
            pnlAgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGrup, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgrupLayout.setVerticalGroup(
            pnlAgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrupLayout.createSequentialGroup()
                .addComponent(lblGrup)
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
                .addComponent(lblPcInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
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
                .addComponent(lblLidGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgrup2Layout.setVerticalGroup(
            pnlAgrup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgrup2Layout.createSequentialGroup()
                .addComponent(lblLidGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnGabaritoFase2.setBackground(new java.awt.Color(255, 51, 51));
        btnGabaritoFase2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnGabaritoFase2.setForeground(new java.awt.Color(255, 255, 255));
        btnGabaritoFase2.setText("<html><center>Gabarito <br />Fase 2</center></html>");
        btnGabaritoFase2.setToolTipText("");
        btnGabaritoFase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGabaritoFase2ActionPerformed(evt);
            }
        });

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

        btnGabaritoFase1.setBackground(new java.awt.Color(255, 51, 51));
        btnGabaritoFase1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnGabaritoFase1.setForeground(new java.awt.Color(255, 255, 255));
        btnGabaritoFase1.setText("<html><center>Gabarito <br />Fase 1</center></html>");
        btnGabaritoFase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGabaritoFase1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIdLayout = new javax.swing.GroupLayout(pnlId);
        pnlId.setLayout(pnlIdLayout);
        pnlIdLayout.setHorizontalGroup(
            pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdLayout.createSequentialGroup()
                        .addComponent(pnlEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAgrup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlAgrup3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGabaritoFase2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGabaritoFase1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAgrup2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlIdLayout.setVerticalGroup(
            pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdLayout.createSequentialGroup()
                        .addComponent(pnlAgrup3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlAgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlAgrup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlIdLayout.createSequentialGroup()
                        .addComponent(btnGabaritoFase1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlAgrup2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGabaritoFase2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrPnFundoPontContr.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlFundoPc.setBackground(new java.awt.Color(255, 255, 255));

        pnlPost5.setBackground(new java.awt.Color(255, 255, 255));
        pnlPost5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlPost5.setPreferredSize(new java.awt.Dimension(435, 186));

        lblTitPost8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTitPost8.setForeground(new java.awt.Color(255, 51, 51));
        lblTitPost8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitPost8.setText("Posto 05 - Brasil");

        lblImgPost8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Band_Brasil.png"))); // NOI18N

        btnIngPost8.setBackground(new java.awt.Color(255, 51, 51));
        btnIngPost8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnIngPost8.setForeground(new java.awt.Color(255, 255, 255));
        btnIngPost8.setText("Ingressar");
        btnIngPost8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngPost8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPost5Layout = new javax.swing.GroupLayout(pnlPost5);
        pnlPost5.setLayout(pnlPost5Layout);
        pnlPost5Layout.setHorizontalGroup(
            pnlPost5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPost5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitPost8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPost5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblImgPost8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngPost8, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPost5Layout.setVerticalGroup(
            pnlPost5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitPost8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPost5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgPost8)
                    .addComponent(btnIngPost8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPost4.setBackground(new java.awt.Color(255, 255, 255));
        pnlPost4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitPost4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTitPost4.setForeground(new java.awt.Color(255, 51, 51));
        lblTitPost4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitPost4.setText("Posto 04 - Alemanha");

        lblImgPost4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Band_Alemanha.png"))); // NOI18N

        btnIngPost4.setBackground(new java.awt.Color(255, 51, 51));
        btnIngPost4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnIngPost4.setForeground(new java.awt.Color(255, 255, 255));
        btnIngPost4.setText("Ingressar");
        btnIngPost4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngPost4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPost4Layout = new javax.swing.GroupLayout(pnlPost4);
        pnlPost4.setLayout(pnlPost4Layout);
        pnlPost4Layout.setHorizontalGroup(
            pnlPost4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPost4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitPost4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPost4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblImgPost4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngPost4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPost4Layout.setVerticalGroup(
            pnlPost4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitPost4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPost4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgPost4)
                    .addComponent(btnIngPost4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPost3.setBackground(new java.awt.Color(255, 255, 255));
        pnlPost3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitPost3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTitPost3.setForeground(new java.awt.Color(255, 51, 51));
        lblTitPost3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitPost3.setText("Posto 03 - Austrália");

        lblImgPost3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Band_Australia.png"))); // NOI18N

        btnIngPost3.setBackground(new java.awt.Color(255, 51, 51));
        btnIngPost3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnIngPost3.setForeground(new java.awt.Color(255, 255, 255));
        btnIngPost3.setText("Ingressar");
        btnIngPost3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngPost3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPost3Layout = new javax.swing.GroupLayout(pnlPost3);
        pnlPost3.setLayout(pnlPost3Layout);
        pnlPost3Layout.setHorizontalGroup(
            pnlPost3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPost3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitPost3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPost3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblImgPost3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngPost3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPost3Layout.setVerticalGroup(
            pnlPost3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitPost3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPost3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgPost3)
                    .addComponent(btnIngPost3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPost2.setBackground(new java.awt.Color(255, 255, 255));
        pnlPost2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitPost2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTitPost2.setForeground(new java.awt.Color(255, 51, 51));
        lblTitPost2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitPost2.setText("Posto 02 - Suíça");

        lblImgPost2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Band_Suica.png"))); // NOI18N

        btnIngPost2.setBackground(new java.awt.Color(255, 51, 51));
        btnIngPost2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnIngPost2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngPost2.setText("Ingressar");
        btnIngPost2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngPost2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPost2Layout = new javax.swing.GroupLayout(pnlPost2);
        pnlPost2.setLayout(pnlPost2Layout);
        pnlPost2Layout.setHorizontalGroup(
            pnlPost2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPost2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitPost2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPost2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblImgPost2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngPost2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPost2Layout.setVerticalGroup(
            pnlPost2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitPost2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPost2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgPost2)
                    .addComponent(btnIngPost2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPost1.setBackground(new java.awt.Color(255, 255, 255));
        pnlPost1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitPost1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTitPost1.setForeground(new java.awt.Color(255, 51, 51));
        lblTitPost1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitPost1.setText("Posto 01 - Estados Unidos");

        lblImgPost1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Band_EUA.png"))); // NOI18N

        btnIngPost1.setBackground(new java.awt.Color(255, 51, 51));
        btnIngPost1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnIngPost1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngPost1.setText("Ingressar");
        btnIngPost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngPost1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPost1Layout = new javax.swing.GroupLayout(pnlPost1);
        pnlPost1.setLayout(pnlPost1Layout);
        pnlPost1Layout.setHorizontalGroup(
            pnlPost1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPost1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitPost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPost1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblImgPost1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngPost1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPost1Layout.setVerticalGroup(
            pnlPost1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPost1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitPost1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPost1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgPost1)
                    .addComponent(btnIngPost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFase2.setBackground(new java.awt.Color(255, 51, 51));
        btnFase2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnFase2.setForeground(new java.awt.Color(255, 255, 255));
        btnFase2.setText("Iniciar Fase 2");
        btnFase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFase2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFundoPcLayout = new javax.swing.GroupLayout(pnlFundoPc);
        pnlFundoPc.setLayout(pnlFundoPcLayout);
        pnlFundoPcLayout.setHorizontalGroup(
            pnlFundoPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoPcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFase2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPost5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPost4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPost3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPost2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPost1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        pnlFundoPcLayout.setVerticalGroup(
            pnlFundoPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoPcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFase2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPost1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPost2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPost3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPost4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPost5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scrPnFundoPontContr.setViewportView(pnlFundoPc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrPnFundoPontContr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrPnFundoPontContr, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngPost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngPost1ActionPerformed
        new FrmSenhaPostoControle(grupoObjeto).setVisible(true);
    }//GEN-LAST:event_btnIngPost1ActionPerformed

    private void btnGabaritoFase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGabaritoFase2ActionPerformed
        new FrmGabarito(fcnGabaritoDAO.find(grupoObjeto.getCodigoGabaritoFase2())).setVisible(true);
    }//GEN-LAST:event_btnGabaritoFase2ActionPerformed

    private void btnGabaritoFase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGabaritoFase1ActionPerformed
        System.out.println("aqui");
        new FrmGabarito(fcnGabaritoDAO.find(grupoObjeto.getCodigoGabaritoFase1())).setVisible(true);
    }//GEN-LAST:event_btnGabaritoFase1ActionPerformed

    private void btnFase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFase2ActionPerformed
        new FrmInstFase2(grupoObjeto).setVisible(true);
    }//GEN-LAST:event_btnFase2ActionPerformed

    private void btnIngPost2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngPost2ActionPerformed
        new FrmSenhaPostoControle(grupoObjeto).setVisible(true);
    }//GEN-LAST:event_btnIngPost2ActionPerformed

    private void btnIngPost3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngPost3ActionPerformed
        new FrmSenhaPostoControle(grupoObjeto).setVisible(true);
    }//GEN-LAST:event_btnIngPost3ActionPerformed

    private void btnIngPost4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngPost4ActionPerformed
        new FrmSenhaPostoControle(grupoObjeto).setVisible(true);
    }//GEN-LAST:event_btnIngPost4ActionPerformed

    private void btnIngPost8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngPost8ActionPerformed
        new FrmSenhaPostoControle(grupoObjeto).setVisible(true);
    }//GEN-LAST:event_btnIngPost8ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        atualiza();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(FrmPrincPontoControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincPontoControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincPontoControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincPontoControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincPontoControle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFase2;
    private javax.swing.JButton btnGabaritoFase1;
    private javax.swing.JButton btnGabaritoFase2;
    private javax.swing.JButton btnIngPost1;
    private javax.swing.JButton btnIngPost2;
    private javax.swing.JButton btnIngPost3;
    private javax.swing.JButton btnIngPost4;
    private javax.swing.JButton btnIngPost8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblEqp;
    private javax.swing.JLabel lblGrup;
    private javax.swing.JLabel lblImgPost1;
    private javax.swing.JLabel lblImgPost2;
    private javax.swing.JLabel lblImgPost3;
    private javax.swing.JLabel lblImgPost4;
    private javax.swing.JLabel lblImgPost8;
    private javax.swing.JLabel lblLidGrupo;
    private javax.swing.JLabel lblNmGrupo;
    private javax.swing.JLabel lblPcInicial;
    private javax.swing.JLabel lblTitPost1;
    private javax.swing.JLabel lblTitPost2;
    private javax.swing.JLabel lblTitPost3;
    private javax.swing.JLabel lblTitPost4;
    private javax.swing.JLabel lblTitPost8;
    private javax.swing.JPanel pnlAgrup;
    private javax.swing.JPanel pnlAgrup1;
    private javax.swing.JPanel pnlAgrup2;
    private javax.swing.JPanel pnlAgrup3;
    private javax.swing.JPanel pnlEqp;
    private javax.swing.JPanel pnlFundoPc;
    private javax.swing.JPanel pnlId;
    private javax.swing.JPanel pnlPost1;
    private javax.swing.JPanel pnlPost2;
    private javax.swing.JPanel pnlPost3;
    private javax.swing.JPanel pnlPost4;
    private javax.swing.JPanel pnlPost5;
    private javax.swing.JScrollPane scrPnFundoPontContr;
    // End of variables declaration//GEN-END:variables
}
