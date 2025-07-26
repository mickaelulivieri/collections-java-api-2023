package set.operacoes_basicas.ex1;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidados;

    public ConjuntoConvidado() {
        this.convidados = new HashSet<>();
    }

    // Adiciona convidado ao conjunto (não permite duplicados de código)
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    // Remove convidado pelo código do convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        if (convidadoRemover != null) {
            convidados.remove(convidadoRemover);
        }
    }

    // Retorna a quantidade total de convidados
    public int contarConvidados() {
        return convidados.size();
    }

    // Exibe todos os convidados
    public void exibirConvidados() {
        if (convidados.isEmpty()) {
            System.out.println("Nenhum convidado na lista.");
        } else {
            for (Convidado c : convidados) {
                System.out.println(c);
            }
        }
    }
}