/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author 8603711
 */
public class Senhas {
    
    private int cd_senha;
    private String usuario;
    private String senhaADM;
    private String senhaF1;
    private String senhaF2;
    private String senhaP1;
    private String senhaP2;
    private String senhaP3;
    private String senhaP4;
    private String senhaP5;

    public Senhas(int cd_senha, String usuario, String senhaADM, String senhaF1, String senhaF2, String senhaP1, String senhaP2, String senhaP3, String senhaP4, String senhaP5) {
        this.cd_senha = cd_senha;
        this.usuario = usuario;
        this.senhaADM = senhaADM;
        this.senhaF1 = senhaF1;
        this.senhaF2 = senhaF2;
        this.senhaP1 = senhaP1;
        this.senhaP2 = senhaP2;
        this.senhaP3 = senhaP3;
        this.senhaP4 = senhaP4;
        this.senhaP5 = senhaP5;
    }

    public Senhas() {
        super();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.cd_senha;
        hash = 97 * hash + Objects.hashCode(this.usuario);
        hash = 97 * hash + Objects.hashCode(this.senhaADM);
        hash = 97 * hash + Objects.hashCode(this.senhaF1);
        hash = 97 * hash + Objects.hashCode(this.senhaF2);
        hash = 97 * hash + Objects.hashCode(this.senhaP1);
        hash = 97 * hash + Objects.hashCode(this.senhaP2);
        hash = 97 * hash + Objects.hashCode(this.senhaP3);
        hash = 97 * hash + Objects.hashCode(this.senhaP4);
        hash = 97 * hash + Objects.hashCode(this.senhaP5);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Senhas other = (Senhas) obj;
        if (this.cd_senha != other.cd_senha) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.senhaADM, other.senhaADM)) {
            return false;
        }
        if (!Objects.equals(this.senhaF1, other.senhaF1)) {
            return false;
        }
        if (!Objects.equals(this.senhaF2, other.senhaF2)) {
            return false;
        }
        if (!Objects.equals(this.senhaP1, other.senhaP1)) {
            return false;
        }
        if (!Objects.equals(this.senhaP2, other.senhaP2)) {
            return false;
        }
        if (!Objects.equals(this.senhaP3, other.senhaP3)) {
            return false;
        }
        if (!Objects.equals(this.senhaP4, other.senhaP4)) {
            return false;
        }
        if (!Objects.equals(this.senhaP5, other.senhaP5)) {
            return false;
        }
        return true;
    }
    
    

    public int getCd_senha() {
        return cd_senha;
    }

    public void setCd_senha(int cd_senha) {
        this.cd_senha = cd_senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenhaADM() {
        return senhaADM;
    }

    public void setSenhaADM(String senhaADM) {
        this.senhaADM = senhaADM;
    }

    public String getSenhaF1() {
        return senhaF1;
    }

    public void setSenhaF1(String senhaF1) {
        this.senhaF1 = senhaF1;
    }

    public String getSenhaF2() {
        return senhaF2;
    }

    public void setSenhaF2(String senhaF2) {
        this.senhaF2 = senhaF2;
    }

    public String getSenhaP1() {
        return senhaP1;
    }

    public void setSenhaP1(String senhaP1) {
        this.senhaP1 = senhaP1;
    }

    public String getSenhaP2() {
        return senhaP2;
    }

    public void setSenhaP2(String senhaP2) {
        this.senhaP2 = senhaP2;
    }

    public String getSenhaP3() {
        return senhaP3;
    }

    public void setSenhaP3(String senhaP3) {
        this.senhaP3 = senhaP3;
    }

    public String getSenhaP4() {
        return senhaP4;
    }

    public void setSenhaP4(String senhaP4) {
        this.senhaP4 = senhaP4;
    }

    public String getSenhaP5() {
        return senhaP5;
    }

    public void setSenhaP5(String senhaP5) {
        this.senhaP5 = senhaP5;
    }
    
}
