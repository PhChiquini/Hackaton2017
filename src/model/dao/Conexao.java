
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {
    
    public Connection conexao;

    public Conexao() {
        this.getConexao();
    }
    
    
    
    public Connection getConexao() {
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sad_boys?zeroDateTimeBehavior=convertToNull";
        String user = "root";
        String pass = "";
        conexao = null;
        
        try{
            try{
        Class.forName(driver);
            }catch(Exception e){
            }
        conexao = DriverManager.getConnection(url,user,pass);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na conexão, contate o administrador."+ ex.getMessage());
        }
        return conexao;
    }
    
    public void closeConexao() throws SQLException{
        try{
            if(conexao != null){
                conexao.close();
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na conexão, contate o administrador." );
        }
    }
}
    
    
