package br.com.wot.domain;

import javax.persistence.Entity;

@Entity
public class  PagamentoComCartao extends Pagamento{
    private Integer parcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Long id, Integer tipo, Pedido pedido, Integer parcelas) {
        super(id, tipo, pedido);
        this.parcelas = parcelas;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }


}
