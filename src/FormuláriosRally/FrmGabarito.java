package FormuláriosRally;

import model.bean.Gabarito;

public class FrmGabarito extends javax.swing.JFrame {

    public FrmGabarito() {
        initComponents();
    }

    public FrmGabarito(Gabarito gabarito){
        initComponents();
        
        lblResp01.setText(alternativa(gabarito.getResposta1()));
        lblResp02.setText(alternativa(gabarito.getResposta2()));
        lblResp03.setText(alternativa(gabarito.getResposta3()));
        lblResp04.setText(alternativa(gabarito.getResposta4()));
        lblResp05.setText(alternativa(gabarito.getResposta5()));
        lblResp06.setText(alternativa(gabarito.getResposta6()));
        lblResp07.setText(alternativa(gabarito.getResposta7()));
        lblResp08.setText(alternativa(gabarito.getResposta8()));
        lblResp09.setText(alternativa(gabarito.getResposta9()));
        lblResp10.setText(alternativa(gabarito.getResposta10()));
        lblResp11.setText(alternativa(gabarito.getResposta11()));
        lblResp12.setText(alternativa(gabarito.getResposta12()));
        lblResp13.setText(alternativa(gabarito.getResposta13()));
        lblResp14.setText(alternativa(gabarito.getResposta14()));
        lblResp15.setText(alternativa(gabarito.getResposta15()));
        lblResp16.setText(alternativa(gabarito.getResposta16()));
        lblResp17.setText(alternativa(gabarito.getResposta17()));
        lblResp18.setText(alternativa(gabarito.getResposta18()));
        lblResp19.setText(alternativa(gabarito.getResposta19()));
        lblResp20.setText(alternativa(gabarito.getResposta20()));
    }
    
    private String alternativa(int a){
        switch(a){
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 5:
                return "E";
            default:
                return "";
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundoGabarito = new javax.swing.JPanel();
        btnRetornar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlFundo = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlQuest01 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblResp01 = new javax.swing.JLabel();
        pnlQuest02 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblResp02 = new javax.swing.JLabel();
        pnlQuest03 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lblResp03 = new javax.swing.JLabel();
        pnlQuest04 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        lblResp04 = new javax.swing.JLabel();
        pnlQuest05 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        lblResp05 = new javax.swing.JLabel();
        pnlQuest06 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        lblResp06 = new javax.swing.JLabel();
        pnlQuest07 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        lblResp07 = new javax.swing.JLabel();
        pnlQuest08 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        lblResp08 = new javax.swing.JLabel();
        pnlQuest09 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        lblResp09 = new javax.swing.JLabel();
        pnlQuest10 = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        lblResp10 = new javax.swing.JLabel();
        pnlQuest11 = new javax.swing.JPanel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        lblResp11 = new javax.swing.JLabel();
        pnlQuest12 = new javax.swing.JPanel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        lblResp12 = new javax.swing.JLabel();
        pnlQuest13 = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        lblResp13 = new javax.swing.JLabel();
        pnlQuest14 = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        lblResp14 = new javax.swing.JLabel();
        pnlQuest15 = new javax.swing.JPanel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        lblResp15 = new javax.swing.JLabel();
        pnlQuest16 = new javax.swing.JPanel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        lblResp16 = new javax.swing.JLabel();
        pnlQuest17 = new javax.swing.JPanel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        lblResp17 = new javax.swing.JLabel();
        pnlQuest18 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        lblResp18 = new javax.swing.JLabel();
        pnlQuest19 = new javax.swing.JPanel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        lblResp19 = new javax.swing.JLabel();
        pnlQuest20 = new javax.swing.JPanel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        lblResp20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlFundoGabarito.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundoGabarito.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRetornar.setBackground(new java.awt.Color(255, 51, 51));
        btnRetornar.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        btnRetornar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetornar.setText("Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));

        pnlTitulo.setBackground(new java.awt.Color(255, 51, 51));
        pnlTitulo.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Questão");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resposta");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest01.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest01.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("01");

        lblResp01.setBackground(new java.awt.Color(255, 255, 255));
        lblResp01.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp01.setForeground(new java.awt.Color(255, 51, 51));
        lblResp01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp01.setText("A");
        lblResp01.setOpaque(true);

        javax.swing.GroupLayout pnlQuest01Layout = new javax.swing.GroupLayout(pnlQuest01);
        pnlQuest01.setLayout(pnlQuest01Layout);
        pnlQuest01Layout.setHorizontalGroup(
            pnlQuest01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp01, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest01Layout.setVerticalGroup(
            pnlQuest01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp01, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest02.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest02.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("02");

        lblResp02.setBackground(new java.awt.Color(255, 255, 255));
        lblResp02.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp02.setForeground(new java.awt.Color(255, 51, 51));
        lblResp02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp02.setText("A");
        lblResp02.setOpaque(true);

        javax.swing.GroupLayout pnlQuest02Layout = new javax.swing.GroupLayout(pnlQuest02);
        pnlQuest02.setLayout(pnlQuest02Layout);
        pnlQuest02Layout.setHorizontalGroup(
            pnlQuest02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest02Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp02, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest02Layout.setVerticalGroup(
            pnlQuest02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest02Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp02, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest03.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest03.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("03");

        lblResp03.setBackground(new java.awt.Color(255, 255, 255));
        lblResp03.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp03.setForeground(new java.awt.Color(255, 51, 51));
        lblResp03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp03.setText("A");
        lblResp03.setOpaque(true);

        javax.swing.GroupLayout pnlQuest03Layout = new javax.swing.GroupLayout(pnlQuest03);
        pnlQuest03.setLayout(pnlQuest03Layout);
        pnlQuest03Layout.setHorizontalGroup(
            pnlQuest03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest03Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp03, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest03Layout.setVerticalGroup(
            pnlQuest03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest03Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp03, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest04.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest04.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setBackground(new java.awt.Color(255, 51, 51));
        jLabel9.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("04");

        lblResp04.setBackground(new java.awt.Color(255, 255, 255));
        lblResp04.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp04.setForeground(new java.awt.Color(255, 51, 51));
        lblResp04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp04.setText("A");
        lblResp04.setOpaque(true);

        javax.swing.GroupLayout pnlQuest04Layout = new javax.swing.GroupLayout(pnlQuest04);
        pnlQuest04.setLayout(pnlQuest04Layout);
        pnlQuest04Layout.setHorizontalGroup(
            pnlQuest04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest04Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp04, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest04Layout.setVerticalGroup(
            pnlQuest04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest04Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp04, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest05.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest05.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setBackground(new java.awt.Color(255, 51, 51));
        jLabel11.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("05");

        lblResp05.setBackground(new java.awt.Color(255, 255, 255));
        lblResp05.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp05.setForeground(new java.awt.Color(255, 51, 51));
        lblResp05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp05.setText("A");
        lblResp05.setOpaque(true);

        javax.swing.GroupLayout pnlQuest05Layout = new javax.swing.GroupLayout(pnlQuest05);
        pnlQuest05.setLayout(pnlQuest05Layout);
        pnlQuest05Layout.setHorizontalGroup(
            pnlQuest05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest05Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp05, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest05Layout.setVerticalGroup(
            pnlQuest05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest05Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp05, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest06.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest06.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setBackground(new java.awt.Color(255, 51, 51));
        jLabel13.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("06");

        lblResp06.setBackground(new java.awt.Color(255, 255, 255));
        lblResp06.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp06.setForeground(new java.awt.Color(255, 51, 51));
        lblResp06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp06.setText("A");
        lblResp06.setOpaque(true);

        javax.swing.GroupLayout pnlQuest06Layout = new javax.swing.GroupLayout(pnlQuest06);
        pnlQuest06.setLayout(pnlQuest06Layout);
        pnlQuest06Layout.setHorizontalGroup(
            pnlQuest06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest06Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp06, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest06Layout.setVerticalGroup(
            pnlQuest06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest06Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp06, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest07.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest07.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setBackground(new java.awt.Color(255, 51, 51));
        jLabel15.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("07");

        lblResp07.setBackground(new java.awt.Color(255, 255, 255));
        lblResp07.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp07.setForeground(new java.awt.Color(255, 51, 51));
        lblResp07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp07.setText("A");
        lblResp07.setOpaque(true);

        javax.swing.GroupLayout pnlQuest07Layout = new javax.swing.GroupLayout(pnlQuest07);
        pnlQuest07.setLayout(pnlQuest07Layout);
        pnlQuest07Layout.setHorizontalGroup(
            pnlQuest07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest07Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp07, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest07Layout.setVerticalGroup(
            pnlQuest07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest07Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp07, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest08.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest08.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel17.setBackground(new java.awt.Color(255, 51, 51));
        jLabel17.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("08");

        lblResp08.setBackground(new java.awt.Color(255, 255, 255));
        lblResp08.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp08.setForeground(new java.awt.Color(255, 51, 51));
        lblResp08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp08.setText("A");
        lblResp08.setOpaque(true);

        javax.swing.GroupLayout pnlQuest08Layout = new javax.swing.GroupLayout(pnlQuest08);
        pnlQuest08.setLayout(pnlQuest08Layout);
        pnlQuest08Layout.setHorizontalGroup(
            pnlQuest08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest08Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp08, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest08Layout.setVerticalGroup(
            pnlQuest08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest08Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp08, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest09.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest09.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel19.setBackground(new java.awt.Color(255, 51, 51));
        jLabel19.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("09");

        lblResp09.setBackground(new java.awt.Color(255, 255, 255));
        lblResp09.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp09.setForeground(new java.awt.Color(255, 51, 51));
        lblResp09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp09.setText("A");
        lblResp09.setOpaque(true);

        javax.swing.GroupLayout pnlQuest09Layout = new javax.swing.GroupLayout(pnlQuest09);
        pnlQuest09.setLayout(pnlQuest09Layout);
        pnlQuest09Layout.setHorizontalGroup(
            pnlQuest09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest09Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp09, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest09Layout.setVerticalGroup(
            pnlQuest09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest09Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp09, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest10.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest10.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel21.setBackground(new java.awt.Color(255, 51, 51));
        jLabel21.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("10");

        lblResp10.setBackground(new java.awt.Color(255, 255, 255));
        lblResp10.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp10.setForeground(new java.awt.Color(255, 51, 51));
        lblResp10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp10.setText("A");
        lblResp10.setOpaque(true);

        javax.swing.GroupLayout pnlQuest10Layout = new javax.swing.GroupLayout(pnlQuest10);
        pnlQuest10.setLayout(pnlQuest10Layout);
        pnlQuest10Layout.setHorizontalGroup(
            pnlQuest10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp10, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest10Layout.setVerticalGroup(
            pnlQuest10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp10, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest11.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest11.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel23.setBackground(new java.awt.Color(255, 51, 51));
        jLabel23.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("11");

        lblResp11.setBackground(new java.awt.Color(255, 255, 255));
        lblResp11.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp11.setForeground(new java.awt.Color(255, 51, 51));
        lblResp11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp11.setText("A");
        lblResp11.setOpaque(true);

        javax.swing.GroupLayout pnlQuest11Layout = new javax.swing.GroupLayout(pnlQuest11);
        pnlQuest11.setLayout(pnlQuest11Layout);
        pnlQuest11Layout.setHorizontalGroup(
            pnlQuest11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp11, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest11Layout.setVerticalGroup(
            pnlQuest11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp11, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest12.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest12.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel25.setBackground(new java.awt.Color(255, 51, 51));
        jLabel25.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("12");

        lblResp12.setBackground(new java.awt.Color(255, 255, 255));
        lblResp12.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp12.setForeground(new java.awt.Color(255, 51, 51));
        lblResp12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp12.setText("A");
        lblResp12.setOpaque(true);

        javax.swing.GroupLayout pnlQuest12Layout = new javax.swing.GroupLayout(pnlQuest12);
        pnlQuest12.setLayout(pnlQuest12Layout);
        pnlQuest12Layout.setHorizontalGroup(
            pnlQuest12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp12, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest12Layout.setVerticalGroup(
            pnlQuest12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp12, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest13.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest13.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel27.setBackground(new java.awt.Color(255, 51, 51));
        jLabel27.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("13");

        lblResp13.setBackground(new java.awt.Color(255, 255, 255));
        lblResp13.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp13.setForeground(new java.awt.Color(255, 51, 51));
        lblResp13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp13.setText("A");
        lblResp13.setOpaque(true);

        javax.swing.GroupLayout pnlQuest13Layout = new javax.swing.GroupLayout(pnlQuest13);
        pnlQuest13.setLayout(pnlQuest13Layout);
        pnlQuest13Layout.setHorizontalGroup(
            pnlQuest13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp13, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest13Layout.setVerticalGroup(
            pnlQuest13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp13, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest14.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest14.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel29.setBackground(new java.awt.Color(255, 51, 51));
        jLabel29.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("14");

        lblResp14.setBackground(new java.awt.Color(255, 255, 255));
        lblResp14.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp14.setForeground(new java.awt.Color(255, 51, 51));
        lblResp14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp14.setText("A");
        lblResp14.setOpaque(true);

        javax.swing.GroupLayout pnlQuest14Layout = new javax.swing.GroupLayout(pnlQuest14);
        pnlQuest14.setLayout(pnlQuest14Layout);
        pnlQuest14Layout.setHorizontalGroup(
            pnlQuest14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp14, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest14Layout.setVerticalGroup(
            pnlQuest14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest15.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest15.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel31.setBackground(new java.awt.Color(255, 51, 51));
        jLabel31.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("15");

        lblResp15.setBackground(new java.awt.Color(255, 255, 255));
        lblResp15.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp15.setForeground(new java.awt.Color(255, 51, 51));
        lblResp15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp15.setText("A");
        lblResp15.setOpaque(true);

        javax.swing.GroupLayout pnlQuest15Layout = new javax.swing.GroupLayout(pnlQuest15);
        pnlQuest15.setLayout(pnlQuest15Layout);
        pnlQuest15Layout.setHorizontalGroup(
            pnlQuest15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp15, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest15Layout.setVerticalGroup(
            pnlQuest15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp15, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest16.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest16.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel33.setBackground(new java.awt.Color(255, 51, 51));
        jLabel33.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("16");

        lblResp16.setBackground(new java.awt.Color(255, 255, 255));
        lblResp16.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp16.setForeground(new java.awt.Color(255, 51, 51));
        lblResp16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp16.setText("A");
        lblResp16.setOpaque(true);

        javax.swing.GroupLayout pnlQuest16Layout = new javax.swing.GroupLayout(pnlQuest16);
        pnlQuest16.setLayout(pnlQuest16Layout);
        pnlQuest16Layout.setHorizontalGroup(
            pnlQuest16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp16, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest16Layout.setVerticalGroup(
            pnlQuest16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp16, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest17.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest17.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel35.setBackground(new java.awt.Color(255, 51, 51));
        jLabel35.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("17");

        lblResp17.setBackground(new java.awt.Color(255, 255, 255));
        lblResp17.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp17.setForeground(new java.awt.Color(255, 51, 51));
        lblResp17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp17.setText("A");
        lblResp17.setOpaque(true);

        javax.swing.GroupLayout pnlQuest17Layout = new javax.swing.GroupLayout(pnlQuest17);
        pnlQuest17.setLayout(pnlQuest17Layout);
        pnlQuest17Layout.setHorizontalGroup(
            pnlQuest17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp17, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest17Layout.setVerticalGroup(
            pnlQuest17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp17, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest18.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest18.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel37.setBackground(new java.awt.Color(255, 51, 51));
        jLabel37.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("18");

        lblResp18.setBackground(new java.awt.Color(255, 255, 255));
        lblResp18.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp18.setForeground(new java.awt.Color(255, 51, 51));
        lblResp18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp18.setText("A");
        lblResp18.setOpaque(true);

        javax.swing.GroupLayout pnlQuest18Layout = new javax.swing.GroupLayout(pnlQuest18);
        pnlQuest18.setLayout(pnlQuest18Layout);
        pnlQuest18Layout.setHorizontalGroup(
            pnlQuest18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp18, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest18Layout.setVerticalGroup(
            pnlQuest18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp18, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest19.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest19.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel39.setBackground(new java.awt.Color(255, 51, 51));
        jLabel39.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("19");

        lblResp19.setBackground(new java.awt.Color(255, 255, 255));
        lblResp19.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp19.setForeground(new java.awt.Color(255, 51, 51));
        lblResp19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp19.setText("A");
        lblResp19.setOpaque(true);

        javax.swing.GroupLayout pnlQuest19Layout = new javax.swing.GroupLayout(pnlQuest19);
        pnlQuest19.setLayout(pnlQuest19Layout);
        pnlQuest19Layout.setHorizontalGroup(
            pnlQuest19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp19, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest19Layout.setVerticalGroup(
            pnlQuest19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp19, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlQuest20.setBackground(new java.awt.Color(255, 51, 51));
        pnlQuest20.setPreferredSize(new java.awt.Dimension(100, 50));

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel41.setBackground(new java.awt.Color(255, 51, 51));
        jLabel41.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("20");

        lblResp20.setBackground(new java.awt.Color(255, 255, 255));
        lblResp20.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblResp20.setForeground(new java.awt.Color(255, 51, 51));
        lblResp20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResp20.setText("A");
        lblResp20.setOpaque(true);

        javax.swing.GroupLayout pnlQuest20Layout = new javax.swing.GroupLayout(pnlQuest20);
        pnlQuest20.setLayout(pnlQuest20Layout);
        pnlQuest20Layout.setHorizontalGroup(
            pnlQuest20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuest20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResp20, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuest20Layout.setVerticalGroup(
            pnlQuest20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator21, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlQuest20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuest20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp20, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlQuest20, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnlQuest19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest09, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest08, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest07, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest06, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest05, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest04, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlQuest01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addComponent(pnlTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuest20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlFundo);

        javax.swing.GroupLayout pnlFundoGabaritoLayout = new javax.swing.GroupLayout(pnlFundoGabarito);
        pnlFundoGabarito.setLayout(pnlFundoGabaritoLayout);
        pnlFundoGabaritoLayout.setHorizontalGroup(
            pnlFundoGabaritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoGabaritoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoGabaritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pnlFundoGabaritoLayout.setVerticalGroup(
            pnlFundoGabaritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoGabaritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFundoGabarito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFundoGabarito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        dispose();
    }//GEN-LAST:event_btnRetornarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGabarito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGabarito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGabarito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGabarito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGabarito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblResp01;
    private javax.swing.JLabel lblResp02;
    private javax.swing.JLabel lblResp03;
    private javax.swing.JLabel lblResp04;
    private javax.swing.JLabel lblResp05;
    private javax.swing.JLabel lblResp06;
    private javax.swing.JLabel lblResp07;
    private javax.swing.JLabel lblResp08;
    private javax.swing.JLabel lblResp09;
    private javax.swing.JLabel lblResp10;
    private javax.swing.JLabel lblResp11;
    private javax.swing.JLabel lblResp12;
    private javax.swing.JLabel lblResp13;
    private javax.swing.JLabel lblResp14;
    private javax.swing.JLabel lblResp15;
    private javax.swing.JLabel lblResp16;
    private javax.swing.JLabel lblResp17;
    private javax.swing.JLabel lblResp18;
    private javax.swing.JLabel lblResp19;
    private javax.swing.JLabel lblResp20;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlFundoGabarito;
    private javax.swing.JPanel pnlQuest01;
    private javax.swing.JPanel pnlQuest02;
    private javax.swing.JPanel pnlQuest03;
    private javax.swing.JPanel pnlQuest04;
    private javax.swing.JPanel pnlQuest05;
    private javax.swing.JPanel pnlQuest06;
    private javax.swing.JPanel pnlQuest07;
    private javax.swing.JPanel pnlQuest08;
    private javax.swing.JPanel pnlQuest09;
    private javax.swing.JPanel pnlQuest10;
    private javax.swing.JPanel pnlQuest11;
    private javax.swing.JPanel pnlQuest12;
    private javax.swing.JPanel pnlQuest13;
    private javax.swing.JPanel pnlQuest14;
    private javax.swing.JPanel pnlQuest15;
    private javax.swing.JPanel pnlQuest16;
    private javax.swing.JPanel pnlQuest17;
    private javax.swing.JPanel pnlQuest18;
    private javax.swing.JPanel pnlQuest19;
    private javax.swing.JPanel pnlQuest20;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
