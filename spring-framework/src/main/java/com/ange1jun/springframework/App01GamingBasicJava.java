package com.ange1jun.springframework;

import com.ange1jun.springframework.game.GameRunner;
import com.ange1jun.springframework.game.Pacman;

public class App01GamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();
        var game = new Pacman();
//        var game = new ShootingGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
