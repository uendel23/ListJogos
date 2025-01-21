package com.JavaComSpring.DsList.Controller;

import com.JavaComSpring.DsList.dto.GameMinDto;
import com.JavaComSpring.DsList.entities.Game;
import com.JavaComSpring.DsList.sevice.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDto> findAll() {
        List<GameMinDto> result = service.findAll();
        return result;
    }


}
