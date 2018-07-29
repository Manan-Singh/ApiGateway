package app.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="strategies")
public class Strategy implements Serializable {

    public Strategy() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id") private Integer id;

    @Column(name="strategy_type") private String strategyType;

    @Column(name="stock") private String stock;

    @Column(name="entry") private Float entry;

    //@Column(name="exit") private Float exit;

    @Column(name="active") private String active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getEntry() {
        return entry;
    }

    public void setEntry(Float entry) {
        this.entry = entry;
    }

    /*public Float getExit() {
        return exit;
    }*/

    /*public void setExit(Float exit) {
        this.exit = exit;
    }*/

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType;
    }

    /* Bidirectional relationship between Strategy and Trade

    NOTE: bidirectional relationship not good for a (one : very many) relationship

    cascade: for pushing entity state transitions to the database, including deleting trades (child entities)
        when a strategy (parent entity) is deleted
    orphanRemoval: ORM-specific, marks a trade (child entity) to be removed when it no longer references
        a strategy (parent entity)
    */
    @OneToMany(mappedBy="strategy", cascade={CascadeType.ALL}, orphanRemoval = true)
    private List<Trade> trades = new ArrayList<Trade>();

    public List<Trade> getTrades() {
        return trades;
    }

    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }
}