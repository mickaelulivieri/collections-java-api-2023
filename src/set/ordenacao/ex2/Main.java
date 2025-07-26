package set.ordenacao.ex2;
/*
2. Lista de Alunos
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto.
 */

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Ana", 101L, 8.5);
        gerenciador.adicionarAluno("Carlos", 102L, 7.2);
        gerenciador.adicionarAluno("Bruno", 103L, 9.1);
        gerenciador.adicionarAluno("Daniela", 104L, 6.8);

        gerenciador.exibirAlunos();

        System.out.println();
        gerenciador.exibirAlunosPorNome();

        System.out.println();
        gerenciador.exibirAlunosPorNota();

        System.out.println();
        gerenciador.removerAluno(102L);

        System.out.println();
        gerenciador.exibirAlunos();
    }
}