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
  private Date date_added;

  Game() {}

  Game(String name, Date date_added) {
    this.name = name;
    this.date_added = date_added;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Date getdate_added() {
    return this.date_added;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setdate_added(Date date_added) {
    this.date_added = date_added;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) 
      return true;
    if (!(o instanceof Game))
      return false;
    Game game = (Game) o;
    return Objects.equals(this.id, game.id) && Objects.equals(this.name, game.name) && Objects.equals(this.date_added, game.date_added);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.date_added);
  }

  @Override 
  public String toString() {
    return "Game{" + "id=" + this.id + ", name='" + this.name + '\'' + ", date_added='" + this.date_added + '\'' + '}';
  }
}
