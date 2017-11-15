/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Objects;

/**
 *
 * @author 8603711
 */
public class PostoDeControle {
    
    private int cd_pc;
    private int qtdeQuestoes;
    private String nomePC;

    public PostoDeControle(int cd_pc, int qtdeQuestoes, String nomePC) {
        this.cd_pc = cd_pc;
        this.qtdeQuestoes = qtdeQuestoes;
        this.nomePC = nomePC;
    }

    public PostoDeControle() {
        super();
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.cd_pc;
        hash = 29 * hash + this.qtdeQuestoes;
        hash = 29 * hash + Objects.hashCode(this.nomePC);
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
        final PostoDeControle other = (PostoDeControle) obj;
        if (this.cd_pc != other.cd_pc) {
            return false;
        }
        if (this.qtdeQuestoes != other.qtdeQuestoes) {
            return false;
        }
        if (!Objects.equals(this.nomePC, other.nomePC)) {
            return false;
        }
        return true;
    }
    
    

    public int getCd_pc() {
        return cd_pc;
    }

    public void setCd_pc(int cd_pc) {
        this.cd_pc = cd_pc;
    }

    public int getQtdeQuestoes() {
        return qtdeQuestoes;
    }

    public void setQtdeQuestoes(int qtdeQuestoes) {
        this.qtdeQuestoes = qtdeQuestoes;
    }

    public String getNomePC() {
        return nomePC;
    }

    public void setNomePC(String nomePC) {
        this.nomePC = nomePC;
    }

    
    
    
    
    
    
    
}
