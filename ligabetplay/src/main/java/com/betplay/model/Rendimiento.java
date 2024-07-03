package com.betplay.model;

import java.time.LocalTime;

public class Rendimiento {
    private int id;
    private Jugador jugador;
    private Partido partido;
    private LocalTime minutosJugados;
    private int goles;
    private int asistencias;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    public Rendimiento() {

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Jugador getJugador() {
        return jugador;
    }
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public LocalTime getMinutosJugados() {
        return minutosJugados;
    }
    public void setMinutosJugados(LocalTime minutosJugados) {
        this.minutosJugados = minutosJugados;
    }
    public int getGoles() {
        return goles;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    
}
