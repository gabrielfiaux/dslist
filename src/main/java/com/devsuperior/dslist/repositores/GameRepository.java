package com.devsuperior.dslist.repositores;


import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
