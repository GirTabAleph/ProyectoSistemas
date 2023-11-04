/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_asistencias;

/**
 *
 * @author xions
 */
public class Grupo {
    
    Profesor profesor;
    Alumno alumnos;
    int NumAlumnos, claveGrupo;
    String materia;
    
    public Grupo(){
        NumAlumnos = 0;
        claveGrupo = 0;
        materia = "";
    }
    
    public Grupo(Profesor profesor, Alumno alumno, int NumAlumnos, int claveGrupo, String materia){
        this.NumAlumnos = NumAlumnos;
        this.claveGrupo = claveGrupo;
        this.materia = materia;
        this.alumnos = alumno;
        this.profesor = profesor;
    }
}
