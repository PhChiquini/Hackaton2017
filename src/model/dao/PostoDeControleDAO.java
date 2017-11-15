/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.PostoDeControle;


/**
 *
 * @author 8603711
 */
public class PostoDeControleDAO extends Conexao{
    
    public PostoDeControleDAO() {
       super();
    }
    
    private void insert(PostoDeControle posto){
        PreparedStatement st = null;
        String sql = "INSERT INTO pont_controle (qtd_questao, nm_posto) VALUES (?,?)";
        
        try{
            st = conexao.prepareStatement(sql);
            st.setInt(1, posto.getCd_pc());
            st.setInt(2, posto.getQtdeQuestoes());
            st.setString(3, posto.getNomePC());
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
    
    private ArrayList<PostoDeControle> findAll(){
        Statement st = null;
        String sql = "SELECT * FROM PONT_CONTROLE";
        ResultSet rs = null;
        ArrayList <PostoDeControle> retorno = new ArrayList<>();
        try{
            st = conexao.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                PostoDeControle p = new PostoDeControle();
                p.setCd_pc(rs.getInt("cd_pc"));
                p.setQtdeQuestoes(rs.getInt("qtd_questao"));
                p.setNomePC(rs.getString("nm_posto"));
                retorno.add(p);
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
    
    private PostoDeControle find(int cd_pc){
        PreparedStatement st = null;
        String sql = "SELECT * FROM PONT_CONTROLE WHERE cd_pc = ?";
        ResultSet rs = null;
        PostoDeControle retorno = new PostoDeControle();
        
        try {
            st = conexao.prepareStatement(sql);
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                retorno.setCd_pc(rs.getInt("cd_pc"));
                retorno.setQtdeQuestoes(rs.getInt("qtd_questao"));
                retorno.setNomePC(rs.getString("nm_posto"));
            }
            
        } catch (Exception e) {
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
    
    private void update(){
        PreparedStatement st = null;
        String sql = "UPDATE pont_controle set qtd_questao = ?, nm_posto = ? where cd_pc = ?";
        try {
            PostoDeControle posto = new PostoDeControle();
            st = conexao.prepareStatement(sql);
            st.setInt(1, posto.getQtdeQuestoes());
            st.setString(2, posto.getNomePC());
            st.setInt(3, posto.getCd_pc());
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
}
