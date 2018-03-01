package apatis.gitcha.collector.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import apatis.gitcha.collector.entity.Ticker;
import apatis.gitcha.collector.model.TickersForCoinone;

@Repository
public interface CoinRepository extends CrudRepository<Ticker, Long>{
}


