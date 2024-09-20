package src.enumeration;

import src.Processo;
import src.transition.*;

public enum Estado {
    NOVO(new TransicaoNovo()),
    PRONTO(new TransicaoPronto()),
    EXECUTANDO(new TransicaoExecutando()),
    BLOQUEADO(new TransicaoBloqueado()),
    FINALIZADO(null);

    private TransicaoEstado transicao;

    Estado(TransicaoEstado transicao) {
        this.transicao = transicao;
    }

    public void executarTransicao(Processo processo) {
        if (transicao != null) {
            transicao.executar(processo);
        }
    }
}
