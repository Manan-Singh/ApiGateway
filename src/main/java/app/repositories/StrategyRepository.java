package app.repositories;

import app.entities.Strategy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "strategies", path="strategies")
public interface StrategyRepository extends JpaRepository<Strategy, Integer> {

    Iterable<Strategy> findByStock(@Param("stock") String stock);

    Iterable<Strategy> findByStrategyType(@Param("strategyType") String strategy_type);
}
