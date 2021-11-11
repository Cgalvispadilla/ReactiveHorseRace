package com.sofkau.reactivehorserace.domain;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private final String id;
    private Map<String, Gamer> gamers;
    private Track track;
    private Podium podium;
    private Boolean isActive;

    public Game(String id) {
        this.id = id;
        this.gamers = new HashMap<>();
        isActive=false;
    }
}
