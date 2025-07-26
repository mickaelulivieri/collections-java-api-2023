package set.ordenacao.ex2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemover = null;
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                alunoRemover = a;
                break;
            }
        }
        if (alunoRemover != null) {
            alunos.remove(alunoRemover);
            System.out.println("Aluno com matrícula " + matricula + " removido.");
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> ordenadosPorNome = new TreeSet<>(Comparator.comparing(Aluno::getNome));
        ordenadosPorNome.addAll(alunos);

        if (ordenadosPorNome.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Alunos (ordenados por nome):");
            for (Aluno a : ordenadosPorNome) {
                System.out.println(a);
            }
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> ordenadosPorNota = new TreeSet<>(Comparator.comparingDouble(Aluno::getMedia));
        ordenadosPorNota.addAll(alunos);

        if (ordenadosPorNota.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Alunos (ordenados por nota):");
            for (Aluno a : ordenadosPorNota) {
                System.out.println(a);
            }
        }
    }

    public void exibirAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Todos os alunos:");
            for (Aluno a : alunos) {
                System.out.println(a);
            }
        }
    }
}
