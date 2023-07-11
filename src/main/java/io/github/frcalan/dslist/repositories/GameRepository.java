package io.github.frcalan.dslist.repositories;

import io.github.frcalan.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
