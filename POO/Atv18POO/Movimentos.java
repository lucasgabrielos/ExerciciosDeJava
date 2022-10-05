package Atv18POO;

import java.math.BigDecimal;
import java.util.Date;

public class Movimentos extends Caixa {
    private Date hora;
    private BigDecimal valor;
    public Date getHora() {
        return hora;
    }
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
