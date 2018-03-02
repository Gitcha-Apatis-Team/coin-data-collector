package apatis.gitcha.collector.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import apatis.gitcha.collector.entity.TickerCoinOne;
import apatis.gitcha.collector.model.TickersForCoinone;

@Repository
public interface CoinOneRepository extends CrudRepository<TickerCoinOne, Long>{
}


