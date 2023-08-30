package com.example.javaspringpostgresqlbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
  @Autowired 
  private GameRepository gameRepository;

  // Create a new game
  public Game createGame(Game game) {
    return gameRepository.save(game);
  }

  // Get all games
  public List<Game> getAllGames() {
    return gameRepository.findAll();
  }

  // Get game by id
  public Optional<Game> getGameById(Long id) {
    return gameRepository.findById(id);
  }

  // Update game
  public Game updateGame(Long id, Game gameDetails) {
    Optional<Game> game = gameRepository.findById(id);
    if (game.isPresent()) {
      Game existingGame = game.get();
      existingGame.setName(gameDetails.getName());
      existingGame.setdate_added(gameDetails.getdate_added());
      return gameRepository.save(existingGame);
    }
    return null;
  }

  public void deleteGame(Long id) {
    gameRepository.deleteById(id);
  }
}
