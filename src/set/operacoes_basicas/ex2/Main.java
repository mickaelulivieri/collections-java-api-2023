package set.operacoes_basicas.ex2;
/*
2. Conjunto de Palavras Únicas
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
removerPalavra(String palavra): Remove uma palavra do conjunto.
verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
 */
public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        // Adicionando palavras
        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("C++");
        conjunto.adicionarPalavra("Java"); // repetida, não será adicionada

        System.out.println("Palavras no conjunto:");
        conjunto.exibirPalavrasUnicas();

        System.out.println("\nVerificando palavras:");
        System.out.println("Contém 'Python'? " + conjunto.verificarPalavra("Python"));
        System.out.println("Contém 'Go'? " + conjunto.verificarPalavra("Go"));

        System.out.println("\nRemovendo 'C++'...");
        conjunto.removerPalavra("C++");

        System.out.println("\nPalavras após remoção:");
        conjunto.exibirPalavrasUnicas();
    }
}
