package com.ange1jun.springframework;

import com.ange1jun.springframework.game.GameRunner;
import com.ange1jun.springframework.game.GamingConsole;
import com.ange1jun.springframework.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new Pacman();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}

