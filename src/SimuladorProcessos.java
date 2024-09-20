package src;

import java.util.Random;

import static src.enumeration.Estado.FINALIZADO;

public class SimuladorProcessos {
    private static final int NUMERO_DE_PROCESSOS = 5;
    private static Processo[] processos = inicializarProcessos(NUMERO_DE_PROCESSOS);
    private static final Random random = new Random();

    public static void main(String[] args) {
        int iteracoes = 0;

        while (!todosProcessosForamTerminados()) {
            for (Processo processo : processos) {
                if (random.nextDouble() < 0.5) {
                    proximoEstado(processo);
                }
            }
            iteracoes++;
            mostrarEstado(iteracoes);
        }

        System.out.println("\nTodos processos foram finalizados! Total de " + iteracoes + " iterações.");
    }

    private static Processo[] inicializarProcessos(int n) {
        Processo[] processos = new Processo[n];
        for (int i = 0; i < n; i++) {
            processos[i] = new Processo();
        }
        return processos;
    }

    private static void proximoEstado(Processo processo) {
        processo.getEstado().executarTransicao(processo);
    }

    private static void mostrarEstado(int iteracao) {
        System.out.println("\n-- Iteração " + iteracao + " --");
        for (Processo processo : processos) {
            processo.mostrar();
        }
    }

    private static boolean todosProcessosForamTerminados() {
        for (Processo processo : processos) {
            if (processo.getEstado() != FINALIZADO) {
                return false;
            }
        }
        return true;
    }
}
