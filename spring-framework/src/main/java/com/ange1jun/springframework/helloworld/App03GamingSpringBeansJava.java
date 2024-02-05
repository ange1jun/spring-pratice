package com.ange1jun.springframework;

import com.ange1jun.springframework.game.GameRunner;
import com.ange1jun.springframework.game.GamingConsole;
import com.ange1jun.springframework.game.Pacman;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeansJava {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}