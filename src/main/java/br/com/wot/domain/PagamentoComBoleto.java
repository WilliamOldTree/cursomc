package br.com.wot.domain;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento{
    private Date vencimento;
    private Date pagamento;

    public PagamentoComBoleto() {

    }

    public PagamentoComBoleto(Long id, Integer tipo, Pedido pedido, Date vencimento, Date pagamento) {
        super(id, tipo, pedido);
        this.vencimento = vencimento;
        this.pagamento = pagamento;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Date getPagamento() {
        return pagamento;
    }

    public void setPagamento(Date pagamento) {
        this.pagamento = pagamento;
    }
}
