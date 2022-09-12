package orcamento.situacao;

import exception.DomainException;
import orcamento.Orcamento;
import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }


    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento nao pode ser finalizado!");
    }


}
