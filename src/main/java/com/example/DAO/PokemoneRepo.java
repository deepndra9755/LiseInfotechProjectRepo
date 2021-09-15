package com.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Pokemon;
@Repository("poke")
public interface PokemoneRepo extends JpaRepository<Pokemon,Integer>{
	

}
