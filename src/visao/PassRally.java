package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.Grupo;
import model.dao.AlunoDAO;
import model.dao.GrupoDAO;

public class PassRally extends javax.swing.JDialog {

    private GrupoDAO fcnGrupo;
    private AlunoDAO fcnAluno;
    private Grupo grupo;

    public PassRally(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        fcnAluno = new AlunoDAO();
        fcnGrupo = new GrupoDAO();

        grupo = fcnGrupo.find(1);

        preencher(grupo);
    }
    
    public PassRally(java.awt.Frame parent, boolean modal, int codigoGrupo) {
        super(parent, modal);
        initComponents();

        fcnAluno = new AlunoDAO();
        fcnGrupo = new GrupoDAO();

        grupo = fcnGrupo.find(codigoGrupo);
        preencher(grupo);
    }

    @Override
    public void dispose() {
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

    private void preencher(Grupo grupo) {
        //Cria a String que será preenchida da direita para a esquerda
        String s;
        //Coloca o último algarismo
        if (grupo.isLiderSegundaFase())
            s = "1";
        else
            s = "0";
        //Coloca o posto
        s = String.valueOf(grupo.getCodigoPostoInicial()) + s;
        //Preenche o agrupamento com três dígitos
        s = String.valueOf(grupo.getCodigoAgrupamento()) + s;
        while (s.length() < 5)
            s = "0" + s;
        //Preenche o grupo com três dígitos
        s = String.valueOf(grupo.getCodigoGrupo());
        while (s.length() < 8)
            s = "0" + s;
        
        if(grupo.isCaracterizado())
            lblCaracterizados.setText("Sim");
        else
            lblCaracterizados.setText("Não");
        lblCodigo.setText(s);
        lblEmail.setText(grupo.getEmail());
        if(grupo.isLiderSegundaFase())
            lblLiderFase2.setText("Sim");
        else
            lblLiderFase2.setText("Não");
        lblNomeGrupo.setText(grupo.getNome());
        lblPosto.setText(String.valueOf(grupo.getCodigoPostoInicial()));
                
        System.out.println("aqui");
        /*ArrayList<Aluno> alunos = fcnAluno.findAlunosGrupo(grupo.getCodigoGrupo());
        
        System.out.println("aqui");
        boolean aux = true;
        for(int i = 0; i <= 2; i++){
            if(alunos.get(i).getRa() == grupo.getRaLider()){
                lblNome.setText(alunos.get(i).getNome());
                lblRA.setText(String.valueOf(alunos.get(i).getRa()));
            }
            else{
                if(alunos.size() > i){
                    if(aux){
                        lblNome1.setText(alunos.get(i).getNome());
                        lblRA1.setText((String.valueOf(alunos.get(i).getRa())));
                        aux = false;
                    }
                    else{
                        lblNome2.setText(alunos.get(i).getNome());
                        lblRA2.setText((String.valueOf(alunos.get(i).getRa())));
                    }
                }
                else{
                    if(aux){
                        lblNome1.setText("");
                        lblRA1.setText("");
                        aux = false;
                    }
                    else{
                        lblNome2.setText("");
                        lblRA2.setText("");
                    }
                }
            }
        }*/
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNomeGrupo = new javax.swing.JLabel();
        lblRA = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRA1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblRA2 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCaracterizados = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPosto = new javax.swing.JLabel();
        lblLiderFase2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        painelPosto1 = new javax.swing.JPanel();
        painelPosto2 = new javax.swing.JPanel();
        painelPosto3 = new javax.swing.JPanel();
        painelPosto4 = new javax.swing.JPanel();
        painelPosto5 = new javax.swing.JPanel();
        painelCheckOut = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Passaporte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Postos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Código Grupo:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Nome Grupo:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Participante 1(Líder):");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Participante 2:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Participante 3:");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("RA:");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Nome:");

        lblCodigo.setText("jLabel9");

        lblNomeGrupo.setText("jLabel9");

        lblRA.setText("jLabel9");

        lblNome.setText("jLabel9");

        lblRA1.setText("jLabel11");

        lblNome1.setText("jLabel11");

        lblRA2.setText("jLabel12");

        lblNome2.setText("jLabel9");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Email:");

        lblEmail.setText("jLabel10");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Caracterizados:");

        lblCaracterizados.setText("jLabel11");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Posto Inicial:");

        lblPosto.setText("jLabel12");

        lblLiderFase2.setText("jLabel10");

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("Líder na segunda Fase:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblRA)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRA1)
                                    .addComponent(lblRA2))
                                .addGap(88, 88, 88)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPosto)
                            .addComponent(jLabel11)
                            .addComponent(lblNome)
                            .addComponent(lblNome2)
                            .addComponent(lblNome1)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(lblNomeGrupo))))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lblEmail))
                .addGap(239, 239, 239)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblCaracterizados)
                    .addComponent(lblLiderFase2)
                    .addComponent(jLabel14))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblPosto)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeGrupo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaracterizados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRA)
                                .addComponent(jLabel4))
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblRA1)
                            .addComponent(lblNome1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLiderFase2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblRA2)
                    .addComponent(lblNome2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnImprimir.setBackground(new java.awt.Color(255, 51, 51));
        btnImprimir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Postos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        painelPosto1.setBackground(new java.awt.Color(255, 255, 255));
        painelPosto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Postos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        javax.swing.GroupLayout painelPosto1Layout = new javax.swing.GroupLayout(painelPosto1);
        painelPosto1.setLayout(painelPosto1Layout);
        painelPosto1Layout.setHorizontalGroup(
            painelPosto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        painelPosto1Layout.setVerticalGroup(
            painelPosto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        painelPosto2.setBackground(new java.awt.Color(255, 255, 255));
        painelPosto2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Postos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        javax.swing.GroupLayout painelPosto2Layout = new javax.swing.GroupLayout(painelPosto2);
        painelPosto2.setLayout(painelPosto2Layout);
        painelPosto2Layout.setHorizontalGroup(
            painelPosto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        painelPosto2Layout.setVerticalGroup(
            painelPosto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        painelPosto3.setBackground(new java.awt.Color(255, 255, 255));
        painelPosto3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Postos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        javax.swing.GroupLayout painelPosto3Layout = new javax.swing.GroupLayout(painelPosto3);
        painelPosto3.setLayout(painelPosto3Layout);
        painelPosto3Layout.setHorizontalGroup(
            painelPosto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        painelPosto3Layout.setVerticalGroup(
            painelPosto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        painelPosto4.setBackground(new java.awt.Color(255, 255, 255));
        painelPosto4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Postos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        javax.swing.GroupLayout painelPosto4Layout = new javax.swing.GroupLayout(painelPosto4);
        painelPosto4.setLayout(painelPosto4Layout);
        painelPosto4Layout.setHorizontalGroup(
            painelPosto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        painelPosto4Layout.setVerticalGroup(
            painelPosto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        painelPosto5.setBackground(new java.awt.Color(255, 255, 255));
        painelPosto5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Postos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        javax.swing.GroupLayout painelPosto5Layout = new javax.swing.GroupLayout(painelPosto5);
        painelPosto5.setLayout(painelPosto5Layout);
        painelPosto5Layout.setHorizontalGroup(
            painelPosto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        painelPosto5Layout.setVerticalGroup(
            painelPosto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        painelCheckOut.setBackground(new java.awt.Color(255, 255, 255));
        painelCheckOut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), " Postos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        javax.swing.GroupLayout painelCheckOutLayout = new javax.swing.GroupLayout(painelCheckOut);
        painelCheckOut.setLayout(painelCheckOutLayout);
        painelCheckOutLayout.setHorizontalGroup(
            painelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        painelCheckOutLayout.setVerticalGroup(
            painelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel13.setText("Após ir ao posto inicial, seguir a sequência para o próximo.");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("OBS:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(painelPosto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelPosto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelPosto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelPosto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelPosto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPosto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPosto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPosto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPosto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPosto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

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

        btnPrimeiro.setBackground(new java.awt.Color(255, 51, 51));
        btnPrimeiro.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeiro.setText("<<");
        btnPrimeiro.setToolTipText("Primeiro Passaporte");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(255, 51, 51));
        btnAnterior.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("<");
        btnAnterior.setToolTipText("Passaporte Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(255, 51, 51));
        btnProximo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setText(">");
        btnProximo.setToolTipText("Próximo Passaporte");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(255, 51, 51));
        btnUltimo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnUltimo.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimo.setText(">>");
        btnUltimo.setToolTipText("Último Passaporte");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(867, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        int voltar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja voltar?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (voltar == JOptionPane.YES_OPTION) {//se apertar sim, a tela irá fechar.
            this.dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        grupo = fcnGrupo.find(fcnGrupo.getQuantidadeGrupos());
        preencher(grupo);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if(grupo.getCodigoGrupo() != fcnGrupo.getQuantidadeGrupos()){
            grupo = fcnGrupo.find(grupo.getCodigoGrupo() + 1);
            preencher(grupo);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if(grupo.getCodigoGrupo() != 1){
            grupo = fcnGrupo.find(grupo.getCodigoGrupo() - 1);
            preencher(grupo);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        grupo = fcnGrupo.find(1);
        preencher(grupo);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

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
            java.util.logging.Logger.getLogger(PassRally.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassRally.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassRally.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassRally.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PassRally dialog = new PassRally(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel lblCaracterizados;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLiderFase2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNomeGrupo;
    private javax.swing.JLabel lblPosto;
    private javax.swing.JLabel lblRA;
    private javax.swing.JLabel lblRA1;
    private javax.swing.JLabel lblRA2;
    private javax.swing.JPanel painelCheckOut;
    private javax.swing.JPanel painelPosto1;
    private javax.swing.JPanel painelPosto2;
    private javax.swing.JPanel painelPosto3;
    private javax.swing.JPanel painelPosto4;
    private javax.swing.JPanel painelPosto5;
    // End of variables declaration//GEN-END:variables
}
