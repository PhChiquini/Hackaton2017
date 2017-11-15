package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Aluno;

public class AlunoDAO extends Conexao{
    public AlunoDAO(){
        super();
}
    public void insert(Aluno aluno){
        PreparedStatement st = null;
        String sql = "INSERT INTO Alunos "
                + "(RA_ALUNOS, NM_ALUNOS, CD_GRUPO) "
                + "VALUES (?,?,?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, aluno.getRa());
            st.setString(2, aluno.getNome());
            st.setInt   (3, aluno.getCodigoGrupo());
            
            st.executeUpdate();
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar a operação.");
        }
        
        finally{
            if(st != null){
                try{
                    st.close();
                }
                catch(SQLException e){
                }
            }
        }
    }
    
    public void update(Aluno aluno){
        PreparedStatement st = null;
        String sql = "UPDATE ALUNOS SET "
                + "NM_ALUNOS = ?, CD_GRUPO = ? "
                + "WHERE RA_ALUNOS = ?";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setString(1, aluno.getNome());
            st.setInt   (2, aluno.getCodigoGrupo());
            st.setInt   (3, aluno.getRa());
            
            st.executeUpdate();
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar a operação.");
        }
        
        finally{
            if(st != null){
                try{
                    st.close();
                }
                catch(SQLException e){
                }
            }
        }
    }
    
    public Aluno find(int raAluno){
        PreparedStatement st = null;
        ResultSet rs = null;
        Aluno aluno = new Aluno();
        
        String sql = "SELECT * FROM ALUNOS WHERE (RA_ALUNOS = ?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, raAluno);
                        
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                aluno.setRa(rs.getInt("RA_ALUNOS"));
                aluno.setNome(rs.getString("NM_ALUNOS"));
                aluno.setCodigoGrupo(rs.getInt("CD_GRUPO"));
            }
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar a operação.");
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
        
        return aluno;
    }
    
    public ArrayList<Aluno> findAll(){
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Aluno> retorno = new ArrayList<>();
        
        String sql = "SELECT * FROM ALUNOS";
        
        try{
            st = conexao.createStatement();
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Aluno a = new Aluno();
                
                a.setCodigoGrupo(rs.getInt("CD_GRUPO"));
                a.setNome(rs.getString("NM_ALUNOS"));
                a.setRa(rs.getInt("RA_ALUNOS"));
                
                retorno.add(a);
            }
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar a operação.");
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
    
    public ArrayList<Aluno> findAlunosGrupo(int codigoGrupo){
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<Aluno> retorno = new ArrayList<>();
        
        String sql = "SELECT * FROM ALUNOS WHERE (CD_GRUPO = ?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, codigoGrupo);
                        
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Aluno a = new Aluno();
                
                a.setCodigoGrupo(rs.getInt("CD_GRUPO"));
                a.setNome(rs.getString("NM_ALUNOS"));
                a.setRa(rs.getInt("RA_ALUNOS"));
                
                retorno.add(a);
            }
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar a operação.");
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
