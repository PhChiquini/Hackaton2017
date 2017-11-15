package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Grupo;

public class GrupoDAO extends Conexao{
    public GrupoDAO(){
        super();
    }
    
    public void insert(Grupo grupo){
        PreparedStatement st = null;
        String sql = "INSERT INTO GRUPO "
                + "(RA_LIDER, EMAIL_GRUPO, CARACTERIZADO, "
                + "CD_AGRUPAMENTO, CD_GAB, CD_PC, NM_GRUPO) "
                + "VALUES (?,?,?,?,?,?,?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, grupo.getRaLider());
            st.setString(2, grupo.getEmail());
            st.setInt   (4, grupo.getCodigoAgrupamento());
            st.setInt   (5, grupo.getCodigoGabaritoFase1());
            st.setInt   (6, grupo.getCodigoPostoInicial());
            st.setString(7, grupo.getNome());
            
            if(grupo.isCaracterizado())
                st.setInt(3, 1);
            else
                st.setInt(3, 0);
            
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
    
    public void update(Grupo grupo){
        PreparedStatement st = null;
        String sql = "UPDATE GRUPO SET "
                + "RA_LIDER = ?, EMAIL_GRUPO = ?, NM_GRUPO = ?, "
                + "CARACTERIZADO = ?, CD_PC = ? "
                + "WHERE CD_GRUPO = ?";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, grupo.getRaLider());
            st.setString(2, grupo.getEmail());
            st.setString(3, grupo.getNome());
            st.setInt   (5, grupo.getCodigoPostoInicial());
            st.setInt   (6, grupo.getCodigoGrupo());
            
            if(grupo.isCaracterizado())
                st.setInt(4, 1);
            else
                st.setInt(4, 0);
            
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
    
    public ArrayList<Grupo> findAll(){
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Grupo> retorno = new ArrayList<>();
        
        String sql = "SELECT * FROM GRUPO";
        
        try{
            st = conexao.createStatement();
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Grupo g = new Grupo();
                
                g.setCodigoGrupo(rs.getInt("CD_GRUPO"));
                g.setEmail(rs.getString("EMAIL_GRUPO"));
                g.setCodigoAgrupamento(rs.getInt("CD_AGRUPAMENTO"));
                g.setCodigoGabaritoFase1(rs.getInt("CD_GAB"));
                g.setCodigoPostoInicial(rs.getInt("CD_PC"));
                g.setPontuacao(rs.getInt("PONTUACAO"));
                g.setRaLider(rs.getInt("RA_LIDER"));
                g.setNome(rs.getString("NM_GRUPO"));
                
                if( 1 == rs.getInt("CARACTERIZADO"))
                    g.setCaracterizado(true);
                else
                    g.setCaracterizado(false);
                
                retorno.add(g);
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
    
    public ArrayList<Grupo> findGrupos(int codigoAgrupamento){
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<Grupo> retorno = new ArrayList<>();
        
        String sql = "SELECT * FROM GRUPO WHERE (CD_AGRUPAMENTO = ?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, codigoAgrupamento);
                        
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Grupo g = new Grupo();
                
                g.setCodigoGrupo(rs.getInt("CD_GRUPO"));
                g.setEmail(rs.getString("EMAIL_GRUPO"));
                g.setCodigoAgrupamento(rs.getInt("CD_AGRUPAMENTO"));
                g.setCodigoGabaritoFase1(rs.getInt("CD_GAB"));
                g.setCodigoPostoInicial(rs.getInt("CD_PC"));
                g.setPontuacao(rs.getInt("PONTUACAO"));
                g.setRaLider(rs.getInt("RA_LIDER"));
                g.setNome(rs.getString("NM_GRUPO"));
                
                if( 1 == rs.getInt("CARACTERIZADO"))
                    g.setCaracterizado(true);
                else
                    g.setCaracterizado(false);
                
                retorno.add(g);
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
    
    public Grupo find(int codigoGrupo){
        PreparedStatement st = null;
        ResultSet rs = null;
        Grupo retorno = new Grupo();
        
        String sql = "SELECT * FROM GRUPO WHERE (CD_GRUPO = ?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, codigoGrupo);
                        
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                retorno.setCodigoGrupo(rs.getInt("CD_GRUPO"));
                retorno.setEmail(rs.getString("EMAIL_GRUPO"));
                retorno.setCodigoAgrupamento(rs.getInt("CD_AGRUPAMENTO"));
                retorno.setCodigoGabaritoFase1(rs.getInt("CD_GAB"));
                retorno.setCodigoPostoInicial(rs.getInt("CD_PC"));
                retorno.setPontuacao(rs.getInt("PONTUACAO"));
                retorno.setRaLider(rs.getInt("RA_LIDER"));
                retorno.setNome(rs.getString("NM_GRUPO"));
                
                if( 1 == rs.getInt("CARACTERIZADO"))
                    retorno.setCaracterizado(true);
                else
                    retorno.setCaracterizado(false);
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
    
    public int gabaritoFase1Grupo(int codigoGrupo){
        PreparedStatement st = null;
        ResultSet rs = null;
        int retorno = 0;
        
        String sql = "SELECT * FROM GRUPO WHERE (CD_GRUPO = ?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, codigoGrupo);
                        
            rs = st.executeQuery(sql);
            
            if(rs.next())
                retorno = rs.getInt("CD_GAB");
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
    
    public void somarPontosGrupo(int codigoGrupo, int pontos){
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        ResultSet rs = null;
        int pontosAtuais = 0;
        String sql = "SELECT * FROM GRUPO WHERE (CD_GRUPO = ?)";
        
        try{
            st1 = conexao.prepareStatement(sql);
            
            st1.setInt   (1, codigoGrupo);
                        
            rs = st1.executeQuery(sql);
            
            if(rs.next()){
                pontosAtuais = rs.getInt("PONTUACAO");
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
            if(st1 != null){
                try{
                    st1.close();
                }
                catch(SQLException e){
                }
            }
        }
        
        sql = "UPDATE GRUPO SET "
                + "PONTUACAO = ? "
                + "WHERE CD_GRUPO = ?";
        
        try{
            st2 = conexao.prepareStatement(sql);
            
            st2.setInt   (1, pontos+pontosAtuais);
            st2.setInt   (2, codigoGrupo);
            
            st2.executeUpdate();
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar a operação.");
        }
        
        finally{
            if(st2 != null){
                try{
                    st2.close();
                }
                catch(SQLException e){
                }
            }
        }
    }
    
    public int raLiderGrupo(int codigoGrupo){
        PreparedStatement st = null;
        ResultSet rs = null;
        int retorno = 0;
        
        String sql = "SELECT * FROM GRUPO WHERE (CD_GRUPO = ?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, codigoGrupo);
                        
            rs = st.executeQuery(sql);
            
            if(rs.next())
                retorno = rs.getInt("RA_LIDER");
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

    public int postoInicialGrupo(int codigoGrupo){
        PreparedStatement st = null;
        ResultSet rs = null;
        int retorno = 0;
        
        String sql = "SELECT * FROM GRUPO WHERE (CD_GRUPO = ?)";
        
        try{
            st = conexao.prepareStatement(sql);
            
            st.setInt   (1, codigoGrupo);
                        
            rs = st.executeQuery(sql);
            
            if(rs.next())
                retorno = rs.getInt("CD_PC");
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
    
    public int quantidadeGrupos(){
        Statement st = null;
        ResultSet rs = null;
        int retorno = 0;
        
        String sql = "SELECT * FROM GRUPO";
        
        try{
            st = conexao.createStatement();
            
            rs = st.executeQuery(sql);
            
            while(rs.next())
                retorno++;
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
