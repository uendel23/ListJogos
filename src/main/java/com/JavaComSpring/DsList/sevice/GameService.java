package com.JavaComSpring.DsList.sevice;


import com.JavaComSpring.DsList.dto.GameDto;
import com.JavaComSpring.DsList.dto.GameMinDto;
import com.JavaComSpring.DsList.entities.Game;
import com.JavaComSpring.DsList.projection.GameMinProjection;
import com.JavaComSpring.DsList.repository.GameListRepository;
import com.JavaComSpring.DsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findbyList(Long listid){
        List<GameMinProjection> result = repository.searchByList(listid);
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        Game game = repository.findById(id).get();
        GameDto dto = new GameDto(game);
        return dto;

    }

}
