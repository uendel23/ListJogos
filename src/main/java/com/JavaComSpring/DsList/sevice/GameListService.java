package com.JavaComSpring.DsList.sevice;


import com.JavaComSpring.DsList.dto.GameDto;
import com.JavaComSpring.DsList.dto.GameListDto;
import com.JavaComSpring.DsList.dto.GameMinDto;
import com.JavaComSpring.DsList.entities.Game;
import com.JavaComSpring.DsList.entities.GameList;
import com.JavaComSpring.DsList.repository.GameListRepository;
import com.JavaComSpring.DsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> result = repository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }



}
