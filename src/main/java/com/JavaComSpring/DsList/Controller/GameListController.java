package com.JavaComSpring.DsList.Controller;

import com.JavaComSpring.DsList.dto.GameDto;
import com.JavaComSpring.DsList.dto.GameListDto;
import com.JavaComSpring.DsList.dto.GameMinDto;
import com.JavaComSpring.DsList.sevice.GameListService;
import com.JavaComSpring.DsList.sevice.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games_list")
public class GameListController {

    @Autowired
    private GameListService service;

    @Autowired
    private GameService gameservice;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = service.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId) {
        List<GameMinDto> result = gameservice.findbyList(listId);
        return result;
    }




}
