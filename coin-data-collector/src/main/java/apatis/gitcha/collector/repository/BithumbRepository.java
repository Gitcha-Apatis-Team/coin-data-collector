package apatis.gitcha.collector.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import apatis.gitcha.collector.entity.TickerBithumb;

@Repository
public interface BithumbRepository extends CrudRepository<TickerBithumb, Long>{

}
