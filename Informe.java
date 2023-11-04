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
public class Informe extends Profesor{
 
    
    UUID idNFC;
    Alumno alumnos[];
    Profesor profesores[];
    Grupo grupos[];
    int asisAlumnos[], asisProfesores[], eSeleccion;
    
    
    
    public void MostrarInforme(){
        
        System.out.println("Informe de las asistencias"); 
        System.out.println("Seleccione el informe que desea ver");
        System.out.println("1.Profesores    2.Alumnos");
        if(eSeleccion == 1){
            System.out.println("Listado de Profesores");
            
        }else{
            
            System.out.println("Listado de Alumnos");
        }
    }

}
