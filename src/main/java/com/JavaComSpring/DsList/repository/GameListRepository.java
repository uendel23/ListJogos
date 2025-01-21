package com.JavaComSpring.DsList.repository;

import com.JavaComSpring.DsList.entities.Game;
import com.JavaComSpring.DsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long > {
}
