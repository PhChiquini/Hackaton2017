package model.bean;

import java.util.Objects;

public class Aluno {
    private int ra;
    private String nome;
    private int codigoGrupo;

    public Aluno() {
        super();
    }

    public Aluno(int ra, String nome, int codigoGrupo) {
        this.ra = ra;
        this.nome = nome;
        this.codigoGrupo = codigoGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.ra;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + this.codigoGrupo;
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
        final Aluno other = (Aluno) obj;
        if (this.ra != other.ra) {
            return false;
        }
        if (this.codigoGrupo != other.codigoGrupo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno:\n" + "RA= " + ra + "\nNome= " + nome + "\nCodigo do Grupo= " + codigoGrupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }    
}
