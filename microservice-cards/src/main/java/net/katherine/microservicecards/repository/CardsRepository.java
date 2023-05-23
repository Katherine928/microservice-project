package net.katherine.microservicecards.repository;

import net.katherine.microservicecards.model.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {


    List<Cards> findByCustomerId(int customerId);

}
