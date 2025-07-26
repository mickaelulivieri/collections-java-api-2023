package list.ordenacao_list.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        Collections.sort(pessoas); // usa o compareTo da classe Pessoa
        return pessoas;
    }

    public List<Pessoa> ordenarPorAltura() {
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return Double.compare(p1.getAltura(), p2.getAltura());
            }
        });
        return pessoas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
