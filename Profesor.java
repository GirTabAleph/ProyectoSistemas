/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_asistencias;

import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author xions
 */

public class Profesor {
    
    Scanner entrada = new Scanner(System.in);
    
    
    UUID claveProfesor;
    int NumGruposAsociados;
    String MateriasAsociadasGrupos;
    
    
   public Profesor(){
       
       String claveProfesor  = "";
       //String claveProfesor = java.util.UUID.randomUUID().toString();
       NumGruposAsociados = 0;
       MateriasAsociadasGrupos = "";
   }
   
   public Profesor(UUID claveProfesor, int NumGruposAsociados, String MateriasAsociadasGrupos){
       
       this.claveProfesor = claveProfesor;
       this.NumGruposAsociados = NumGruposAsociados;
       this.MateriasAsociadasGrupos = MateriasAsociadasGrupos;
       
   }
   
public void AltaAlumno(Alumno alumno){
    String cConfirmacion;
    System.out.println("Los datos del alumno son");
    System.out.println("Matricula"+alumno.matricula+ "\n grupos inscritos: "+alumno.gruposInscritos+
                        "\n Correo: "+alumno.email);
    
    System.out.println("Desea dar de alta al alumno [S/N]?");
    cConfirmacion = entrada.next();
    
}

public void BajaAlumno(Alumno alumno){
    String cConfirmacion;
    System.out.println("Los datos del alumno son");
    System.out.println("Matricula"+alumno.matricula+ "\n grupos inscritos: "+alumno.gruposInscritos+
                        "\n Correo: "+alumno.email);
    
    System.out.println("Desea dar de baja al alumno [S/N]?");
    cConfirmacion = entrada.next();
}

public void CambioAlumno(Alumno alumno){
    
}
    
}
