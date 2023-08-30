package com.example.javaspringpostgresqlbackend;

import org.springframework.data.jpa.repository.JpaRepository;

interface GameRepository extends JpaRepository<Game, Long> {}
