package com.sportspro.respository;

import com.sportspro.model.entities.Match;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Integer> {

}
