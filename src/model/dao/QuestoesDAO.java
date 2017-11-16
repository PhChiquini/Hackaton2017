package model.dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Questoes;

public class QuestoesDAO extends Conexao {

    public QuestoesDAO() {
        super();
    }

    public void Insert(Questoes quest) {
        PreparedStatement st = null;
        String aux = "insert into questoes (PERG_QUEST, R1_QUEST, R2_QUEST, R3_QUEST, R4_QUEST, R5_QUEST, RESP_CORRETA, IMAGEM, CD_PC, CD_QUEST  )"
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            st = conexao.prepareStatement(aux);
            st.setString(1, quest.getPergunta());
            st.setString(2, quest.getAlternativa1());
            st.setString(3, quest.getAlternativa2());
            st.setString(4, quest.getAlternativa3());
            st.setString(5, quest.getAlternativa4());
            st.setString(6, quest.getAlternativa5());
            st.setInt(7, quest.getCorreta());
            st.setInt(9, quest.getCd_pc());
            st.setInt(10, quest.getCd_quest());
            if (quest.isImagem()) {
                st.setInt(8, 1);
            } else {
                st.setInt(8, 0);
            }
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Questão cadastrada.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar operação.");
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {

                }
            }
        }
    }

    public ArrayList<Questoes> findAll() {
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Questoes> quest = new ArrayList<>();
        String sql = "select * from questoes";
        try {
            st = conexao.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Questoes q = new Questoes();
                q.setCd_quest(rs.getInt("CD_QUEST"));
                q.setPergunta(rs.getString("PERG_QUEST"));
                q.setAlternativa1(rs.getString("R1_QUEST"));
                q.setAlternativa2(rs.getString("R2_QUEST"));
                q.setAlternativa3(rs.getString("R3_QUEST"));
                q.setAlternativa4(rs.getString("R4_QUEST"));
                q.setAlternativa5(rs.getString("R5_QUEST"));
                q.setCorreta(rs.getInt("RESP_CORRETA"));
                q.setCd_pc(rs.getInt("CD_PC"));
                if (1 == rs.getInt("IMAGEM")) {
                    q.setImagem(true);
                } else {
                    q.setImagem(false);
                }
                quest.add(q);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar operação.");
        } finally {
            if (st != null) {
                try {
                    st.close();
                    rs.close();
                } catch (SQLException ex) {

                }
            }
        }
        return quest;
    }

    public void UpdateQuestao() {
        PreparedStatement st = null;
        String sql = "UPDATE questoes SET PERG_QUEST = ?, R1_QUEST = ?, R2_QUEST = ?,"
                + "R3_QUEST = ?, R4_QUEST = ?, R5_QUEST = ?, RESP_CORRETA = ?, IMAGEM = ? WHERE CD_QUEST = ?";
        try {
            Questoes a = new Questoes();
            st = conexao.prepareStatement(sql);
            st.setString(1, a.getPergunta());
            st.setString(2, a.getAlternativa1());
            st.setString(3, a.getAlternativa2());
            st.setString(4, a.getAlternativa3());
            st.setString(5, a.getAlternativa4());
            st.setString(6, a.getAlternativa5());
            st.setInt(7, a.getCorreta());
            if (a.isImagem()) {
                st.setInt(8, 1);
            } else {
                st.setInt(8, 0);
            }
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar operação.");
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {

                }
            }
        }
    }
    
    public Questoes find(int codigoQuestao){
        Statement st = null;
        ResultSet rs = null;
        Questoes quest = new Questoes();
        String sql = "SELECT * FROM QUESTOES WHERE CD_QUEST = " + codigoQuestao;
        try {
            st = conexao.createStatement();
            
            
            rs = st.executeQuery(sql);

            if(rs.first()) {
                quest.setCd_quest(rs.getInt("CD_QUEST"));
                quest.setPergunta(rs.getString("PERG_QUEST"));
                quest.setAlternativa1(rs.getString("R1_QUEST"));
                quest.setAlternativa2(rs.getString("R2_QUEST"));
                quest.setAlternativa3(rs.getString("R3_QUEST"));
                quest.setAlternativa4(rs.getString("R4_QUEST"));
                quest.setAlternativa5(rs.getString("R5_QUEST"));
                quest.setCorreta(rs.getInt("RESP_CORRETA"));
                quest.setCd_pc(rs.getInt("CD_PC"));
                if (1 == rs.getInt("IMAGEM")) {
                    quest.setImagem(true);
                } else {
                    quest.setImagem(false);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao executar operação.");
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                }
            }
        }
        return quest;
    }
}
