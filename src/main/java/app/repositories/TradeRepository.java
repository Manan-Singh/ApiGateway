package app.repositories;

import app.entities.Strategy;
import app.entities.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TradeRepository extends JpaRepository<Trade, Integer> {

    Trade findByStrategy(@Param("strategy") Strategy strategy);

}
