package com.exemple.Kaddem.Repositories;

import com.exemple.Kaddem.Entity.Specialite;
import com.exemple.Kaddem.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UniversiteRepository extends BaseRepository <Universite,Integer>
{

}
