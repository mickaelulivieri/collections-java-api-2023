package set.operacoes_basicas.ex1;
/*
1. Conjunto de Convidados
Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.
removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do conjunto com base no código do convite.
contarConvidados(): Conta o número total de convidados no Set.
exibirConvidados(): Exibe todos os convidados do conjunto.
*/

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidado lista = new ConjuntoConvidado();

        lista.adicionarConvidado("Ana", 101);
        lista.adicionarConvidado("Bruno", 102);
        lista.adicionarConvidado("Carlos", 103);
        lista.adicionarConvidado("Diana", 104);
        lista.adicionarConvidado("Ana", 101); // Não será adicionado (mesmo código)

        System.out.println("Lista inicial de convidados:");
        lista.exibirConvidados();

        System.out.println("\nTotal de convidados: " + lista.contarConvidados());

        System.out.println("\nRemovendo convidado com código 103...");
        lista.removerConvidadoPorCodigoConvite(103);

        System.out.println("\nLista após remoção:");
        lista.exibirConvidados();

        System.out.println("\nTotal de convidados: " + lista.contarConvidados());
    }
}
