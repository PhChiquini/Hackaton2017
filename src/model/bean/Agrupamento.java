package model.bean;

public class Agrupamento {
    private int codigoAgrupamento;
    private int codigoLider;
    private int quantidadeGrupos;
    private int pontuacao;
    private int codigoGabaritoFase2;
    
    public Agrupamento() {
        super();
    }

    public Agrupamento(int codigoAgrupamento, int codigoLider, int quantidadeGrupos, int pontuacao, int codigoGabaritoFase2) {
        this.codigoAgrupamento = codigoAgrupamento;
        this.codigoLider = codigoLider;
        this.quantidadeGrupos = quantidadeGrupos;
        this.pontuacao = pontuacao;
        this.codigoGabaritoFase2 = codigoGabaritoFase2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigoAgrupamento;
        hash = 83 * hash + this.codigoLider;
        hash = 83 * hash + this.quantidadeGrupos;
        hash = 83 * hash + this.pontuacao;
        hash = 83 * hash + this.codigoGabaritoFase2;
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
        final Agrupamento other = (Agrupamento) obj;
        if (this.codigoAgrupamento != other.codigoAgrupamento) {
            return false;
        }
        if (this.codigoLider != other.codigoLider) {
            return false;
        }
        if (this.quantidadeGrupos != other.quantidadeGrupos) {
            return false;
        }
        if (this.pontuacao != other.pontuacao) {
            return false;
        }
        if (this.codigoGabaritoFase2 != other.codigoGabaritoFase2) {
            return false;
        }
        return true;
    }

    public int getCodigoAgrupamento() {
        return codigoAgrupamento;
    }

    public void setCodigoAgrupamento(int codigoAgrupamento) {
        this.codigoAgrupamento = codigoAgrupamento;
    }

    public int getCodigoLider() {
        return codigoLider;
    }

    public void setCodigoLider(int codigoLider) {
        this.codigoLider = codigoLider;
    }

    public int getQuantidadeGrupos() {
        return quantidadeGrupos;
    }

    public void setQuantidadeGrupos(int quantidadeGrupos) {
        this.quantidadeGrupos = quantidadeGrupos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getCodigoGabaritoFase2() {
        return codigoGabaritoFase2;
    }

    public void setCodigoGabaritoFase2(int codigoGabaritoFase2) {
        this.codigoGabaritoFase2 = codigoGabaritoFase2;
    }
    
    
}
