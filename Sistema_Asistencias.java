/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistema_asistencias;

import java.util.Scanner;

/**
 *
 * @author xions
 */
public class Sistema_Asistencias {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Profesor profe1 = new Profesor();
        Alumno alumno1 = new Alumno();
        
        int eOpcion;
        
        System.out.println("Sitema de asistencia para profesores y alumnos");
        System.out.println("\t\t Menu \n 1.Profesores   2.Alumnos   3.Grupos    4.Informes");
        System.out.println("Seleccione una opcion:");
        
        eOpcion = entrada.nextInt();
    }
}
