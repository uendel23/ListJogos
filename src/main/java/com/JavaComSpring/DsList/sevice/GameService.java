package com.JavaComSpring.DsList.sevice;


import com.JavaComSpring.DsList.dto.GameMinDto;
import com.JavaComSpring.DsList.entities.Game;
import com.JavaComSpring.DsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDto> findAll(){
        List <Game> result = repository.findAll();
      return result.stream().map(x -> new GameMinDto(x)).toList();
    }

}
