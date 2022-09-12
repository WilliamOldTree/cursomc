package br.com.wot.domain;


import br.com.wot.enums.TipoEstadoPagamento;

import java.util.Objects;

public class Pagamento {

    private Long id;
    private Integer tipo;

    public Pagamento() {
    }

    public Pagamento(Long id, TipoEstadoPagamento tipo ) {
        this.id = id;
        this.tipo = tipo.getCodigo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoEstadoPagamento getTipo() {
        return TipoEstadoPagamento.toEnum(tipo);
    }

    public void setTipo(TipoEstadoPagamento tipo) {
        this.tipo = tipo.getCodigo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pagamento)) return false;
        Pagamento pagamento = (Pagamento) o;
        return getId().equals(pagamento.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
