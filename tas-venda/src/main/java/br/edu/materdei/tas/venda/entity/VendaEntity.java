package br.edu.materdei.tas.venda.entity;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "venda")
public class VendaEntity {
    @Id 
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 6, nullable = false)
    private String codigo;
    
    @Column
    private LocalDate dtvenda;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private PedidoEntity pedido;

    public VendaEntity() {
        this.dtvenda = LocalDate.now();
    }

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
     * @return the dtvenda
     */
    public LocalDate getDtvenda() {
        return dtvenda;
    }

    /**
     * @param dtvenda the dtvenda to set
     */
    public void setDtvenda(LocalDate dtvenda) {
        this.dtvenda = dtvenda;
    }

    /**
     * @return the pedido
     */
    public PedidoEntity getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(PedidoEntity pedido) {
        this.pedido = pedido;
    }
}