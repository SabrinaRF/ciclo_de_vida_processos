package src.transition;

import src.Processo;

import static src.enumeration.Estado.PRONTO;

public class TransicaoBloqueado implements TransicaoEstado {
    @Override
    public void executar(Processo processo) {
        processo.setEstado(PRONTO);
    }
}
