package map.pesquisa.ex2;
/*
2. Contagem de Palavras
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.

 */
public class Main {
    public static void main(String[] args) {
        ContagemPalavras cp = new ContagemPalavras();

        cp.adicionarPalavra("java", 3);
        cp.adicionarPalavra("programação", 5);
        cp.adicionarPalavra("java", 2);

        cp.exibirContagemPalavras();

        System.out.println(cp.encontrarPalavraMaisFrequente());

        cp.removerPalavra("programação");

        cp.exibirContagemPalavras();
    }
}
