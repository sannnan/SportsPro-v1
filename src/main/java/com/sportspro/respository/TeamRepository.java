package com.sportspro.respository;

import com.sportspro.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Integer> {

}
