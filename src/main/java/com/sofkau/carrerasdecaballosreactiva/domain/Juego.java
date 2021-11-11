package com.sofkau.carrerasdecaballosreactiva.domain;

import java.util.HashMap;
import java.util.Map;

public class Juego {
    private final String id;
    private Map<String, Jugador> gamers;
    private Pista pista;
    private Podio podio;
    private Boolean isActive;

    public Juego(String id) {
        this.id = id;
        this.gamers = new HashMap<>();
        isActive=false;
    }
}
