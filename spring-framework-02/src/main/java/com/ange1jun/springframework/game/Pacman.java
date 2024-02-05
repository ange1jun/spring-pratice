package com.ange1jun.springframework.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole {
    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Down");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }
}
