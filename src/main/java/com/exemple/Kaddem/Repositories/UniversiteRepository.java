package com.exemple.Kaddem.Repositories;

import com.exemple.Kaddem.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends BaseRepository <Universite,Integer>
{
}
