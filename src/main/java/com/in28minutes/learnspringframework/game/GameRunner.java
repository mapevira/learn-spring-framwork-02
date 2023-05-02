package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * The Game Runner class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 1 May 2023 - 15:25:52
 */
@Slf4j
@Component
public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        super();
        this.game = game;
    }

    public void run() {
        log.info("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
