/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Gabarito;

/**
 *
 * @author 8603711
 */
public class GabaritoDAO extends Conexao{
    public GabaritoDAO(){
        super();
    }
    
    public void insert(Gabarito gab) {
        PreparedStatement st = null;
        String sql = "INSERT INTO gabarito (resp_01,"
                + "resp_02,resp_03, resp_04,resp_05,resp_06,"
                + "resp_07,resp_08,resp_09,resp_10,resp_11,"
                + "resp_12,resp_13,resp_14,resp_15,resp_16,"
                + "resp_17,resp_18,resp_19,resp_20)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            st = conexao.prepareStatement(sql);
            st.setInt(1, gab.getResposta1());
            st.setInt(2, gab.getResposta2());
            st.setInt(3, gab.getResposta3());
            st.setInt(4, gab.getResposta4());
            st.setInt(5, gab.getResposta5());
            st.setInt(6, gab.getResposta6());
            st.setInt(7, gab.getResposta7());
            st.setInt(8, gab.getResposta8());
            st.setInt(9, gab.getResposta9());
            st.setInt(10, gab.getResposta10());
            st.setInt(11, gab.getResposta11());
            st.setInt(12, gab.getResposta12());
            st.setInt(13, gab.getResposta13());
            st.setInt(14, gab.getResposta14());
            st.setInt(15, gab.getResposta15());
            st.setInt(16, gab.getResposta16());
            st.setInt(17, gab.getResposta17());
            st.setInt(18, gab.getResposta18());
            st.setInt(19, gab.getResposta19());
            st.setInt(20, gab.getResposta20());
            st.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao executar operação");
        }finally{
            if(st != null){
                try{
                st.close();
                }catch(SQLException e){
                }
            }
        }
    }
    
    public  Gabarito find(int cd_gabarito){
        Statement st = null;
        String sql = "SELECT * FROM gabarito WHERE cd_gab =" + cd_gabarito;
        ResultSet rs = null;
            Gabarito retorno = new Gabarito();
        try {
            
            st = conexao.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                retorno.setCd_gabarito(rs.getInt("cd_gab"));
                retorno.setResposta1(rs.getInt("resp_01"));
                retorno.setResposta2(rs.getInt("resp_02"));
                retorno.setResposta3(rs.getInt("resp_03"));
                retorno.setResposta4(rs.getInt("resp_04"));
                retorno.setResposta5(rs.getInt("resp_05"));
                retorno.setResposta6(rs.getInt("resp_06"));
                retorno.setResposta7(rs.getInt("resp_07"));
                retorno.setResposta8(rs.getInt("resp_08"));
                retorno.setResposta9(rs.getInt("resp_09"));
                retorno.setResposta10(rs.getInt("resp_10"));
                retorno.setResposta11(rs.getInt("resp_11"));
                retorno.setResposta12(rs.getInt("resp_12"));
                retorno.setResposta13(rs.getInt("resp_13"));
                retorno.setResposta14(rs.getInt("resp_14"));
                retorno.setResposta15(rs.getInt("resp_15"));
                retorno.setResposta16(rs.getInt("resp_16"));
                retorno.setResposta17(rs.getInt("resp_17"));
                retorno.setResposta18(rs.getInt("resp_18"));
                retorno.setResposta19(rs.getInt("resp_19"));
                retorno.setResposta20(rs.getInt("resp_20"));
            }
        } catch (SQLException e) {
        }finally{
           if(st != null){
                try{
                st.close();
                }catch(SQLException e){
                }
            } if(rs != null){
                try{
                rs.close();
                }catch(SQLException e){
                }
            } 
        }
        return retorno;
    }
    
    public ArrayList<Gabarito> findAll(){
        Statement st = null;
        String sql = "SELECT * FROM gabarito ";
        ResultSet rs = null;
        ArrayList <Gabarito> retorno = new ArrayList<>();
        try{
            st = conexao.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Gabarito g = new Gabarito();
                g.setCd_gabarito(rs.getInt("cd_gab"));
                g.setResposta1(rs.getInt("resp_01"));
                g.setResposta2(rs.getInt("resp_02"));
                g.setResposta3(rs.getInt("resp_03"));
                g.setResposta4(rs.getInt("resp_04"));
                g.setResposta5(rs.getInt("resp_05"));
                g.setResposta6(rs.getInt("resp_06"));
                g.setResposta7(rs.getInt("resp_07"));
                g.setResposta8(rs.getInt("resp_08"));
                g.setResposta9(rs.getInt("resp_09"));
                g.setResposta10(rs.getInt("resp_10"));
                g.setResposta11(rs.getInt("resp_11"));
                g.setResposta12(rs.getInt("resp_12"));
                g.setResposta13(rs.getInt("resp_13"));
                g.setResposta14(rs.getInt("resp_14"));
                g.setResposta15(rs.getInt("resp_15"));
                g.setResposta16(rs.getInt("resp_16"));
                g.setResposta17(rs.getInt("resp_17"));
                g.setResposta18(rs.getInt("resp_18"));
                g.setResposta19(rs.getInt("resp_19"));
                g.setResposta20(rs.getInt("resp_20"));
                retorno.add(g);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao executar operação");
        }finally{
            if(st != null){
                try{
                st.close();
                rs.close();
                }catch(SQLException e){
                }
            }
        }
        return retorno; 
    }
    
    public void updateResposta(int codigoGabarito, int questao, int reposta){
        PreparedStatement st = null;
        String s = String.valueOf(questao);
        if(s.length() == 1) 
            s = "0" +s;
        
        String sql = "UPDATE gabarito set resp_" +s+ "= ? where cd_gab = ?";
        try {
            st = conexao.prepareStatement(sql);
            
            st.setInt(1, reposta);
            st.setInt(2, codigoGabarito);
            
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Erro ao executar operação");
        }finally{
            if(st != null){
                try{
                st.close();
                }catch(SQLException e){
                }
            }
        }
    }
    
    public int novoVazio(){
        int retorno = 0;
        Statement st = null;
        ResultSet rs = null;
        
        try{
            String sql = "INSERT INTO gabarito () VALUES () ";
            
            st = conexao.createStatement();
            st.executeUpdate(sql);
            
            sql = "SELECT * FROM gabarito ";
            rs = st.executeQuery(sql);
            
            if(rs.last())
                retorno = rs.getInt("CD_GAB");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao executar operação");
        }
        finally{
            if(rs != null){
                try{
                rs.close();
                }
                catch(SQLException e){
                }
            }
            if(st != null){
                try{
                st.close();
                }
                catch(SQLException e){
                }
            }
        }
        return retorno; 
    }
    
}
