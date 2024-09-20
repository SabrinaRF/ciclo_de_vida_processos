package src.transition;

import src.Processo;

public interface TransicaoEstado {
    void executar(Processo processo);
}
