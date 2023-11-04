/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_asistencias;

import java.util.UUID;

/**
 *
 * @author xions
 */
public class Alumno extends Profesor{
    
    UUID matricula;
    int gruposInscritos;
    String email;
    
 
public Alumno(){
    
    String matricula = "";
    gruposInscritos = 0;
    email = "";
}


public Alumno(UUID matricula, int gruposInscritos, String email){
    
    this.matricula = matricula;
    this.gruposInscritos = gruposInscritos;
    this.email = email;
}
    
}
