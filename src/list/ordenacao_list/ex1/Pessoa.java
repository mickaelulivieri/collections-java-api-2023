package list.ordenacao_list.ex1;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        // Ordena por idade (crescente)
        return Integer.compare(this.idade, outraPessoa.getIdade());
    }

    @Override
    public String toString() {
        return nome + " - Idade: " + idade + ", Altura: " + altura;
    }
}
