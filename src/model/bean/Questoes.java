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
public class Questoes {
    
    private int cd_quest;
    private String pergunta;
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private String alternativa5;
    private int correta;
    private int cd_pc;
    private boolean imagem;

    public Questoes() {
        super();    
    }

    public Questoes(int cd_quest, String pergunta, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String alternativa5, int correta, int cd_pc, boolean imagem) {
        this.cd_quest = cd_quest;
        this.pergunta = pergunta;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.alternativa5 = alternativa5;
        this.correta = correta;
        this.cd_pc = cd_pc;
        this.imagem = imagem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.cd_quest;
        hash = 17 * hash + Objects.hashCode(this.pergunta);
        hash = 17 * hash + Objects.hashCode(this.alternativa1);
        hash = 17 * hash + Objects.hashCode(this.alternativa2);
        hash = 17 * hash + Objects.hashCode(this.alternativa3);
        hash = 17 * hash + Objects.hashCode(this.alternativa4);
        hash = 17 * hash + Objects.hashCode(this.alternativa5);
        hash = 17 * hash + this.correta;
        hash = 17 * hash + this.cd_pc;
        hash = 17 * hash + (this.imagem ? 1 : 0);
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
        final Questoes other = (Questoes) obj;
        if (this.cd_quest != other.cd_quest) {
            return false;
        }
        if (this.correta != other.correta) {
            return false;
        }
        if (this.cd_pc != other.cd_pc) {
            return false;
        }
        if (this.imagem != other.imagem) {
            return false;
        }
        if (!Objects.equals(this.pergunta, other.pergunta)) {
            return false;
        }
        if (!Objects.equals(this.alternativa1, other.alternativa1)) {
            return false;
        }
        if (!Objects.equals(this.alternativa2, other.alternativa2)) {
            return false;
        }
        if (!Objects.equals(this.alternativa3, other.alternativa3)) {
            return false;
        }
        if (!Objects.equals(this.alternativa4, other.alternativa4)) {
            return false;
        }
        if (!Objects.equals(this.alternativa5, other.alternativa5)) {
            return false;
        }
        return true;
    }

    public int getCd_quest() {
        return cd_quest;
    }

    public void setCd_quest(int cd_quest) {
        this.cd_quest = cd_quest;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    public String getAlternativa4() {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    public String getAlternativa5() {
        return alternativa5;
    }

    public void setAlternativa5(String alternativa5) {
        this.alternativa5 = alternativa5;
    }

    public int getCorreta() {
        return correta;
    }

    public void setCorreta(int correta) {
        this.correta = correta;
    }

    public int getCd_pc() {
        return cd_pc;
    }

    public void setCd_pc(int cd_pc) {
        this.cd_pc = cd_pc;
    }

    public boolean isImagem() {
        return imagem;
    }

    public void setImagem(boolean imagem) {
        this.imagem = imagem;
    }

    
}
