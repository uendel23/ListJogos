package com.JavaComSpring.DsList.repository;

import com.JavaComSpring.DsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long > {
}
