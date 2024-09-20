package src.transition;

import src.Processo;

import java.util.Random;

import static src.enumeration.Estado.BLOQUEADO;
import static src.enumeration.Estado.EXECUTANDO;

public class TransicaoPronto implements TransicaoEstado {
    private static final Random random = new Random();

    @Override
    public void executar(Processo processo) {
        if (random.nextDouble() < 0.5) {
            processo.setEstado(EXECUTANDO);
        } else {
            processo.setEstado(BLOQUEADO);
        }
    }
}
