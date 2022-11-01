package com.exemple.Kaddem.Repositories;

import com.exemple.Kaddem.Entity.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailEquipeRepository extends BaseRepository<DetailEquipe, Integer> {
}


