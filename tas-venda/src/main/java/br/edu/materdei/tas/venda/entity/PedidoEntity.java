package br.edu.materdei.tas.venda.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class PedidoEntity {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 6, nullable = false)
    private String codigo;
    
    @Column(nullable = false)
    private LocalDate dtpedido;
    
    @Column
    private LocalDate dtfaturado;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private ClienteEntity cliente;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ItemPedidoEntity> itens;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dtpedido
     */
    public LocalDate getDtpedido() {
        return dtpedido;
    }

    /**
     * @param dtpedido the dtpedido to set
     */
    public void setDtpedido(LocalDate dtpedido) {
        this.dtpedido = dtpedido;
    }

    /**
     * @return the dtfaturado
     */
    public LocalDate getDtfaturado() {
        return dtfaturado;
    }

    /**
     * @param dtfaturado the dtfaturado to set
     */
    public void setDtfaturado(LocalDate dtfaturado) {
        this.dtfaturado = dtfaturado;
    }

    /**
     * @return the cliente
     */
    public ClienteEntity getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the itens
     */
    public List<ItemPedidoEntity> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<ItemPedidoEntity> itens) {
        this.itens = itens;
    }

}