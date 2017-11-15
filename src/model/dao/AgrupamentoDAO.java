package model.dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Agrupamento;
import java.sql.*;

public class AgrupamentoDAO extends Conexao {

    public AgrupamentoDAO() {
        super();
    }

    public void insert(Agrupamento agrup) {
        PreparedStatement st = null;
        String aux = "insert into agrupamento (RA_LIDER, QTD_GRUPO, PONTUACAO, CD_GAB)"
                + "VALUES (?,?,?,?)";
        try {
            st = conexao.prepareStatement(aux);
            st.setInt(1, agrup.getCodigoLider());
            st.setInt(2, agrup.getQuantidadeGrupos());
            st.setInt(3, agrup.getPontuacao());
            st.setInt(4, agrup.getCodigoGabaritoFase2());
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

    private ArrayList<Agrupamento> findAll() {
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Agrupamento> agrup = new ArrayList<>();
        String sql = "select * from agrupamento";
        try {
            st = conexao.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Agrupamento a = new Agrupamento();
                a.setCodigoAgrupamento(rs.getInt("CD_AGRUPAMENTO"));
                a.setCodigoLider(rs.getInt("RA_LIDER"));
                a.setQuantidadeGrupos(rs.getInt("QTD_GRUPO"));
                a.setPontuacao(rs.getInt("PONTUACAO"));
                a.setCodigoGabaritoFase2(rs.getInt("CD_GAB"));
                agrup.add(a);
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
        return agrup;
    }

    private int retGab(int codigoAgrupamento) {
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from agrupamento where CD_GAB = " + codigoAgrupamento;
        int a = 0;
        try {
            st = conexao.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                a = (rs.getInt("CD_GAB"));
            }
        } catch (SQLException ex) {
        }
        return a;
    }

    private void UpdateAgrup() {
        PreparedStatement st = null;
        String sql = "UPDATE agrupamento SET RA_LIDER = ?, QTD_GRUPO = ?, PONTUACAO = ? WHERE CD_AGRUPAMENTO = ?";
        try {
            Agrupamento a = new Agrupamento();
            st = conexao.prepareStatement(sql);
            st.setInt(1, a.getCodigoLider());
            st.setInt(2, a.getQuantidadeGrupos());
            st.setInt(3, a.getPontuacao());
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


    private int retLider(int codQuest) {
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from questoes where CD_QUEST = " + codQuest;
        int a = 0;
        try {
            st = conexao.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                a = (rs.getInt("RA_LIDER"));
            }
        } catch (SQLException ex) {
        }
        return a;
    }
    
    public Agrupamento retUltimoAgupamento(){
        Statement st = null;
        ResultSet rs = null;
        Agrupamento agrup = new Agrupamento();
        String sql = "select * from agrupamento";
        try {
            st = conexao.createStatement();
            rs = st.executeQuery(sql);

            if (rs.last()) {
                agrup.setCodigoAgrupamento(rs.getInt("CD_AGRUPAMENTO"));
                agrup.setCodigoLider(rs.getInt("RA_LIDER"));
                agrup.setQuantidadeGrupos(rs.getInt("QTD_GRUPO"));
                agrup.setPontuacao(rs.getInt("PONTUACAO"));
                agrup.setCodigoGabaritoFase2(rs.getInt("CD_GAB"));
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
        return agrup;
    }
}
