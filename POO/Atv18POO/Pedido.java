package Atv18POO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date dataPedido;
    private boolean status;
    private List<ItemPedido> item;
    private BigDecimal valorTotal;

    ArrayList<String>itemPedido=new ArrayList<>(1);

    public Date getDataPedido() {
        return dataPedido;
    }
    public List<ItemPedido> getItem() {
        return item;
    }
    public void setItem(List<ItemPedido> item) {
        this.item = item;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void statusPedido(){
        System.out.println("Classe: Pedido");
        System.out.println("Método: statusPedido");
    }
}
