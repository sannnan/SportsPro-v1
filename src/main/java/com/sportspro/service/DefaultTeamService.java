package com.sportspro.service;

import com.sportspro.model.entities.Team;
import com.sportspro.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultTeamService implements TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Team save(Team team) {
        return new Team();
    }
}
