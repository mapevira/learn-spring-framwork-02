package com.in28minutes.learnspringframework.game;

import lombok.extern.slf4j.Slf4j;

/**
 * The Super Contra Game class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 1 May 2023 - 15:26:33
 */
@Slf4j
public class SuperContraGame implements GamingConsole {

    @Override
    public void up() {
        log.info("Up");
    }

    @Override
    public void down() {
        log.info("Sit down");
    }

    @Override
    public void left() {
        log.info("Go back");
    }

    @Override
    public void right() {
        log.info("Shoot a bullet");
    }

}
