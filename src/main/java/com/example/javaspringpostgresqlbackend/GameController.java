package com.example.javaspringpostgresqlbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/game")
public class GameController {
  @Autowired
  private GameService gameService;

  // Create a new user
  @PostMapping
  public Game createGame(@RequestBody Game game) {
    return gameService.createGame(game);
  }
  
  // Get all games
  @GetMapping
  public List<Game> getAllGame() {
      return gameService.getAllGames();
  }
  
  // Get game by id
  @GetMapping("/{id}")
  public Optional<Game> getGameById(Long id) {
    return gameService.getGameById(id);
  }

  // Update game by id
  @PutMapping("/{id}") 
  public Game updateGame(@PathVariable Long id, @RequestBody Game gameDetails) {
    return gameService.updateGame(id, gameDetails);
  }

  // Delete game by id
  @DeleteMapping("/{id}")
  public void deleteGame(@PathVariable Long id) {
    gameService.deleteGame(id);
  }
}
