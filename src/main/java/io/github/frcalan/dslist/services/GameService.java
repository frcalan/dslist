package io.github.frcalan.dslist.services;

import io.github.frcalan.dslist.dto.GameDTO;
import io.github.frcalan.dslist.dto.GameMinDTO;
import io.github.frcalan.dslist.entities.Game;
import io.github.frcalan.dslist.projections.GameMinProjection;
import io.github.frcalan.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
     public List<GameMinDTO> findAll() {
       List<Game> result = gameRepository.findAll();

       return result.stream().map(l -> new GameMinDTO(l)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(l -> new GameMinDTO(l)).toList();
    }
}
