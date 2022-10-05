package Atv18POO;

import java.math.BigDecimal;
import java.util.Date;

public abstract class PagamentoNFE {
    private BigDecimal valor;
    private Date dataPagamento;
    
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
