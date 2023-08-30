package com.example.javaspringpostgresqlbackend;

import java.util.Objects;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game_collection")
public class Game {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Date dateAdded;

  Game() {}

  Game(String name, Date dateAdded) {
    this.name = name;
    this.dateAdded = dateAdded;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Date getDateAdded() {
    return this.dateAdded;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDateAdded(Date dateAdded) {
    this.dateAdded = dateAdded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) 
      return true;
    if (!(o instanceof Game))
      return false;
    Game game = (Game) o;
    return Objects.equals(this.id, game.id) && Objects.equals(this.name, game.name) && Objects.equals(this.dateAdded, game.dateAdded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.dateAdded);
  }

  @Override 
  public String toString() {
    return "Game{" + "id=" + this.id + ", name='" + this.name + '\'' + ", dateAdded='" + this.dateAdded + '\'' + '}';
  }
}
