package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * The Mario Game class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 1 May 2023 - 15:24:29
 */
@Component
@Slf4j
public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        log.info("Jump");
    }

    @Override
    public void down() {
        log.info("Go into a hole");
    }

    @Override
    public void left() {
        log.info("Go back");
    }

    @Override
    public void right() {
        log.info("Accelerate");
    }

}
