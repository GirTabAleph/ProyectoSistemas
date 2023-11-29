# **Diagrama de secuencia Altas, Bajas y Cambios de Alumnos (V1).**

Este diagrama representa la secuencia del proceso de altas, bajas y cambios de Alumnos del sistema.

## Código del diagrama en PlantUML.

@startuml

== Alta Alumno ==

    Alumno -> Sistema: Solicitar Alta
    Sistema -> LeerDatos: Solicitar datos
    LeerDatos -> Almacenamiento: Validar Datos
    Almacenamiento --> Alumno: Confirmar Alta

== Baja Alumno ==

    Alumno -> Sistema: Solicitar Baja
    Sistema ->LeerDatos: Solicitar Id
    Sistema -> Almacenamiento: Validar Datos
    Almacenamiento  --> Alumno: Confirmar Baja

== Cambios Alumno ==

    Alumno -> Sistema: Solicitar Cambio
    Sistema -> LeerDatos: Solicitar Datos
    Sistema -> Almacenamiento : Validar Datos
    Almacenamiento  --> Alumno: Confirmar Cambio

@enduml

## Imágen del diagrama.
[![1391-OO-imagen-diagrama-secuencia-ABCAlumnos.png](https://i.postimg.cc/Gp0m1HV8/1391-OO-imagen-diagrama-secuencia-ABCAlumnos.png)](https://postimg.cc/ZWcS8KT4)
