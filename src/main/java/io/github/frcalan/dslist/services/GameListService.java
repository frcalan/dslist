package io.github.frcalan.dslist.services;

import io.github.frcalan.dslist.dto.GameDTO;
import io.github.frcalan.dslist.dto.GameListDTO;
import io.github.frcalan.dslist.dto.GameMinDTO;
import io.github.frcalan.dslist.entities.Game;
import io.github.frcalan.dslist.entities.GameList;
import io.github.frcalan.dslist.repositories.GameListRepository;
import io.github.frcalan.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
     public List<GameListDTO> findAll() {
       List<GameList> result = gameListRepository.findAll();

       return result.stream().map(l -> new GameListDTO(l)).toList();
    }
}
