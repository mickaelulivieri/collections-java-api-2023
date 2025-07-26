package list.pesquisa_list.ex2;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(42);
        somaNumeros.adicionarNumero(3);

        // Exibir números
        System.out.println("Números na lista: " + somaNumeros.exibirNumeros());

        // Calcular soma
        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());

        // Maior número
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());

        // Menor número
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
