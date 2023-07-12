package io.github.frcalan.dslist.services;

import io.github.frcalan.dslist.dto.GameMinDTO;
import io.github.frcalan.dslist.entities.Game;
import io.github.frcalan.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

     public List<GameMinDTO> findAll() {
       List<Game> result = gameRepository.findAll();

       return result.stream().map(l -> new GameMinDTO(l)).toList();
    }
}
