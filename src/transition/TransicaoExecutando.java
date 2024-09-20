package src.transition;

import src.Processo;

import java.util.Random;

import static src.enumeration.Estado.*;

public class TransicaoExecutando implements TransicaoEstado {
    private static final Random random = new Random();

    @Override
    public void executar(Processo processo) {
        double probabilidade = random.nextDouble();
        if (probabilidade < 0.3) {
            processo.setEstado(PRONTO);
        } else if (probabilidade < 0.6) {
            processo.setEstado(BLOQUEADO);
        } else {
            processo.setEstado(FINALIZADO);
        }
    }
}
