package model.bean;

import java.util.Objects;

public class Grupo {
    private int codigoGrupo;
    private String nome;
    private int raLider;
    private boolean caracterizado;
    private String email;
    private int pontuacao;
    private int codigoGabaritoFase1;
    private int codigoPostoInicial;
    private int codigoAgrupamento;

    public Grupo() {
        super();
    }

    public Grupo(int codigoGrupo, String nome, int raLider, boolean caracterizado, String email, int pontuacao, int codigoGabaritoFase1, int codigoPostoInicial, int codigoAgrupamento) {
        this.codigoGrupo = codigoGrupo;
        this.nome = nome;
        this.raLider = raLider;
        this.caracterizado = caracterizado;
        this.email = email;
        this.pontuacao = pontuacao;
        this.codigoGabaritoFase1 = codigoGabaritoFase1;
        this.codigoPostoInicial = codigoPostoInicial;
        this.codigoAgrupamento = codigoAgrupamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.codigoGrupo;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + this.raLider;
        hash = 53 * hash + (this.caracterizado ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + this.pontuacao;
        hash = 53 * hash + this.codigoGabaritoFase1;
        hash = 53 * hash + this.codigoPostoInicial;
        hash = 53 * hash + this.codigoAgrupamento;
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
        final Grupo other = (Grupo) obj;
        if (this.codigoGrupo != other.codigoGrupo) {
            return false;
        }
        if (this.raLider != other.raLider) {
            return false;
        }
        if (this.caracterizado != other.caracterizado) {
            return false;
        }
        if (this.pontuacao != other.pontuacao) {
            return false;
        }
        if (this.codigoGabaritoFase1 != other.codigoGabaritoFase1) {
            return false;
        }
        if (this.codigoPostoInicial != other.codigoPostoInicial) {
            return false;
        }
        if (this.codigoAgrupamento != other.codigoAgrupamento) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
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

    public int getRaLider() {
        return raLider;
    }

    public void setRaLider(int raLider) {
        this.raLider = raLider;
    }

    public boolean isCaracterizado() {
        return caracterizado;
    }

    public void setCaracterizado(boolean caracterizado) {
        this.caracterizado = caracterizado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getCodigoGabaritoFase1() {
        return codigoGabaritoFase1;
    }

    public void setCodigoGabaritoFase1(int codigoGabaritoFase1) {
        this.codigoGabaritoFase1 = codigoGabaritoFase1;
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

}
