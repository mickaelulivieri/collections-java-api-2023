package list.pesquisa_list.ex2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    // Adiciona um número à lista
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    // Calcula a soma de todos os números da lista
    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    // Encontra o maior número da lista
    public int encontrarMaiorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia!");
        }
        int maior = numeros.get(0);
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    // Encontra o menor número da lista
    public int encontrarMenorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia!");
        }
        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    // Retorna todos os números da lista
    public List<Integer> exibirNumeros() {
        return new ArrayList<>(numeros); // retorna uma cópia para segurança
    }
}