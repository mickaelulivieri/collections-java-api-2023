package set.operacoes_basicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Dois convidados são iguais se tiverem o mesmo código de convite
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado)) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvite);
    }

    @Override
    public String toString() {
        return nome + " (Convite: " + codigoConvite + ")";
    }
}
