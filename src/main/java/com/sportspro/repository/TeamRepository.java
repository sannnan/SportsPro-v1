package com.sportspro.repository;

import com.sportspro.model.entities.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Integer> {

}
