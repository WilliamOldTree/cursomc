package br.com.wot.enums;

public enum TipoEstadoPagamento {
    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private Integer codigo;
    private String descricao;

    TipoEstadoPagamento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static TipoEstadoPagamento toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }
        for (TipoEstadoPagamento tep : TipoEstadoPagamento.values()) {
            if (codigo.equals(tep.getCodigo())) ;
            return tep;
        }

        throw new IllegalArgumentException("Codigo invalido" + codigo);
    }
}

