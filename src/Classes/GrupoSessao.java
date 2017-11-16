package Classes;

import java.util.Objects;

public class GrupoSessao {
    private int codigoGrupo;
    private String nome;
    private int pontuacao;
    private int pontuacaoFase2;
    private int codigoGabaritoFase1;
    private int codigoGabaritoFase2;
    private int codigoPostoInicial;
    private int codigoAgrupamento;
    private boolean liderSegundaFase;
    private String nomePosto;
    private static int postoAtual;

    public GrupoSessao() {
        super();
    }

    public GrupoSessao(int codigoGrupo, String nome, int pontuacao, int pontuacaoFase2, int codigoGabaritoFase1, int codigoGabaritoFase2, int codigoPostoInicial, int codigoAgrupamento, boolean liderSegundaFase, String nomePosto) {
        this.codigoGrupo = codigoGrupo;
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.pontuacaoFase2 = pontuacaoFase2;
        this.codigoGabaritoFase1 = codigoGabaritoFase1;
        this.codigoGabaritoFase2 = codigoGabaritoFase2;
        this.codigoPostoInicial = codigoPostoInicial;
        this.codigoAgrupamento = codigoAgrupamento;
        this.liderSegundaFase = liderSegundaFase;
        this.nomePosto = nomePosto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.codigoGrupo;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + this.pontuacao;
        hash = 79 * hash + this.pontuacaoFase2;
        hash = 79 * hash + this.codigoGabaritoFase1;
        hash = 79 * hash + this.codigoGabaritoFase2;
        hash = 79 * hash + this.codigoPostoInicial;
        hash = 79 * hash + this.codigoAgrupamento;
        hash = 79 * hash + (this.liderSegundaFase ? 1 : 0);
        hash = 79 * hash + Objects.hashCode(this.nomePosto);
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
        final GrupoSessao other = (GrupoSessao) obj;
        if (this.codigoGrupo != other.codigoGrupo) {
            return false;
        }
        if (this.pontuacao != other.pontuacao) {
            return false;
        }
        if (this.pontuacaoFase2 != other.pontuacaoFase2) {
            return false;
        }
        if (this.codigoGabaritoFase1 != other.codigoGabaritoFase1) {
            return false;
        }
        if (this.codigoGabaritoFase2 != other.codigoGabaritoFase2) {
            return false;
        }
        if (this.codigoPostoInicial != other.codigoPostoInicial) {
            return false;
        }
        if (this.codigoAgrupamento != other.codigoAgrupamento) {
            return false;
        }
        if (this.liderSegundaFase != other.liderSegundaFase) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nomePosto, other.nomePosto)) {
            return false;
        }
        return true;
    }
    
    public void incrementPostoAtual(){
        postoAtual++;
        if(postoAtual == 6)
            postoAtual = 1;
    }

    public int getPostoAtual() {
        return postoAtual;
    }

    public void setPostoAtual(int postoAtual) {
        this.postoAtual = postoAtual;
    }

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacaoFase2() {
        return pontuacaoFase2;
    }

    public void setPontuacaoFase2(int pontuacaoFase2) {
        this.pontuacaoFase2 = pontuacaoFase2;
    }

    public int getCodigoGabaritoFase1() {
        return codigoGabaritoFase1;
    }

    public void setCodigoGabaritoFase1(int codigoGabaritoFase1) {
        this.codigoGabaritoFase1 = codigoGabaritoFase1;
    }

    public int getCodigoGabaritoFase2() {
        return codigoGabaritoFase2;
    }

    public void setCodigoGabaritoFase2(int codigoGabaritoFase2) {
        this.codigoGabaritoFase2 = codigoGabaritoFase2;
    }

    public int getCodigoPostoInicial() {
        return codigoPostoInicial;
    }

    public void setCodigoPostoInicial(int codigoPostoInicial) {
        this.codigoPostoInicial = codigoPostoInicial;
    }

    public int getCodigoAgrupamento() {
        return codigoAgrupamento;
    }

    public void setCodigoAgrupamento(int codigoAgrupamento) {
        this.codigoAgrupamento = codigoAgrupamento;
    }

    public boolean isLiderSegundaFase() {
        return liderSegundaFase;
    }

    public void setLiderSegundaFase(boolean liderSegundaFase) {
        this.liderSegundaFase = liderSegundaFase;
    }

    public String getNomePosto() {
        return nomePosto;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

}
