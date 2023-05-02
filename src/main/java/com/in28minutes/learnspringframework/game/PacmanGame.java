package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * The Pacman Game class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 1 May 2023 - 15:24:29
 */
@Slf4j
@Component
@Primary
public class PacmanGame implements GamingConsole {

    @Override
    public void up() {
        log.info("Up");
    }

    @Override
    public void down() {
        log.info("Down");
    }

    @Override
    public void left() {
        log.info("Left");
    }

    @Override
    public void right() {
        log.info("Right");
    }

}
