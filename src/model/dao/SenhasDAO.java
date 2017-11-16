/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Senhas;

/**
 *
 * @author 8603711
 */
public class SenhasDAO extends Conexao{

    public SenhasDAO() {
        super();
    }
    
    public void insert(Senhas s){
        PreparedStatement st = null;
        String sql = "INSERT INTO senhas (cd_senha, usuario"
                + "senha_adm, senha_f1, senha_f2, senha_P1,"
                + "senha_P2, senha_P3, senha_P4, senha_P5)"
                + "VALUES (?, ?, ?, ?, ?, ? ,? ,? ,? ,?)";
        
        try {
            st = conexao.prepareStatement(sql);
            st.setInt(1, 1);
            st.setString(2, s.getUsuario());
            st.setString(3, s.getSenhaADM());
            st.setString(4, s.getSenhaF1());
            st.setString(4, s.getSenhaF2());
            st.setString(4, s.getSenhaP1());
            st.setString(4, s.getSenhaP2());
            st.setString(4, s.getSenhaP3());
            st.setString(4, s.getSenhaP4());
            st.setString(4, s.getSenhaP5());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
        } catch (Exception e) {
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
    
    public Senhas find(int cd_senha){
        Statement st = null;
        String sql = "SELECT * FROM senhas WHERE cd_senha = 1";
        ResultSet rs = null;
            Senhas retorno = new Senhas();
        try {
            
            st = conexao.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                retorno.setCd_senha(rs.getInt("cd_senha"));
                retorno.setUsuario(rs.getString("usuario"));
                retorno.setSenhaADM(rs.getString("senha_adm"));
                retorno.setSenhaF1(rs.getString("senha_f1"));
                retorno.setSenhaF2(rs.getString("senha_f2"));
                retorno.setSenhaP1(rs.getString("senha_p1"));
                retorno.setSenhaP2(rs.getString("senha_p2"));
                retorno.setSenhaP3(rs.getString("senha_p3"));
                retorno.setSenhaP4(rs.getString("senha_p4"));
                retorno.setSenhaP5(rs.getString("senha_p5"));
            }
        } catch (SQLException e) {
            System.out.println("1" + e.getMessage());
            JOptionPane.showMessageDialog(null,"Erro ao executar operação");
        }finally{
           if(st != null){
                try{
                st.close();
                }catch(SQLException e){
                }
            }if(rs != null){
                try{
                rs.close();
                }catch(SQLException e){
                }
            } 
        }
        return retorno;
    } 
   
    public ArrayList<Senhas> findAll(){
        Statement st = null;
        String sql = "SELECT * FROM senhas ";
        ResultSet rs = null;
        ArrayList <Senhas> retorno = new ArrayList<>();
        try{
            st = conexao.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Senhas s = new Senhas();
                s.setCd_senha(rs.getInt("cd_gab"));
                s.setUsuario(rs.getString("usuario"));
                s.setSenhaADM(rs.getString("senha_adm"));
                s.setSenhaF1(rs.getString("senha_f1"));
                s.setSenhaF2(rs.getString("senha_f2"));
                s.setSenhaP1(rs.getString("senha_p1"));
                s.setSenhaP2(rs.getString("senha_p2"));
                s.setSenhaP3(rs.getString("senha_p3"));
                s.setSenhaP4(rs.getString("senha_p4"));
                s.setSenhaP5(rs.getString("senha_p5"));
                retorno.add(s);
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
   
    public void updateSenhaADM(String cd_senhaADM){
        PreparedStatement st = null;
        String sql = "UPDATE senhas set senha_adm = ? where cd_senha = 1";
        try {
            Senhas s = new Senhas();
            st = conexao.prepareStatement(sql);
            st.setString(1, s.getSenhaADM());
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
    
    public void updateSenhaF1(Senhas f1){
        PreparedStatement st = null;
        String sql = "UPDATE SENHAS set SENHA_F1 = ? where CD_SENHA = 1";
        try {
            st = conexao.prepareStatement(sql);
            st.setString(1, f1.getSenhaF1());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Senha Cadastrada.");
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
    
    public void updateSenhaF2(Senhas f2){
        PreparedStatement st = null;
        String sql = "UPDATE SENHAS set SENHA_F2 = ? where CD_SENHA = 1";
        try {
            st = conexao.prepareStatement(sql);
            st.setString(1, f2.getSenhaF2());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Senha Cadastrada.");
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
    
    public void updateSenhaP1(Senhas p1){
        PreparedStatement st = null;
        String sql = "UPDATE SENHAS set SENHA_P1 = ? where CD_SENHA = 1";
        try {
            st = conexao.prepareStatement(sql);
            st.setString(1, p1.getSenhaP1());
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
    
    public void updateSenhaP2(Senhas p2){
        PreparedStatement st = null;
        String sql = "UPDATE senhas set senha_P2 = ? where cd_senha = 1";
        try {
            st = conexao.prepareStatement(sql); 
            st.setString(1, p2.getSenhaP2());
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
    
    public void updateSenhaP3(Senhas p3){
        PreparedStatement st = null;
        String sql = "UPDATE senhas set senha_P3 = ? where cd_senha = 1";
        try {
            st = conexao.prepareStatement(sql);
            st.setString(1, p3.getSenhaP3());
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
    
    public void updateSenhaP4(Senhas p4){
        PreparedStatement st = null;
        String sql = "UPDATE senhas set senha_P4 = ? where cd_senha = 1";
        try {
            Senhas s = new Senhas();
            st = conexao.prepareStatement(sql);
            st.setString(1, p4.getSenhaP4());
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
    
    public void updateSenhaP5(Senhas p5){
        PreparedStatement st = null;
        String sql = "UPDATE senhas set senha_P5 = ? where cd_senha = 1";
        try {
            Senhas s = new Senhas();
            st = conexao.prepareStatement(sql);
            st.setString(1, p5.getSenhaP5());
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
