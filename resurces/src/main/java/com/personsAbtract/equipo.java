package com.personsAbtract;

import java.util.ArrayList;


public class equipo {
    
    private String id;
    private String nombre;
    private String ciudad;
    private String estadio;
    private String entrenador;
    private String partidos;
    private ArrayList<player> jugadores;



    public equipo(String id, String nombre, String ciudad, String estadio, String entrenador, String partidos) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.entrenador = entrenador;
        this.partidos = partidos;
        this.jugadores = new ArrayList<>();
    }


    

    
    
}
