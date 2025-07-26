package map.operacoes_basicas.ex2;

/*
2. Dicionário
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
 */
public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("Map", "Interface que representa um mapeamento entre chave e valor.");

        dicionario.exibirPalavras();

        System.out.println("Definição de Java: " + dicionario.pesquisarPorPalavra("Java"));

        dicionario.removerPalavra("Map");

        dicionario.exibirPalavras();
    }
}
