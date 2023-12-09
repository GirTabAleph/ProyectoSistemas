# **Diagrama de secuencia Altas, Bajas y Cambios de Alumnos (V1).**

Este diagrama representa la secuencia del proceso de altas, bajas y cambios de Alumnos del sistema.

## Código del diagrama en PlantUML.

@startuml

== Altas Alumnos ==

    Profesor -> IAlumno: Solicitar Alta
    IAlumno --> Profesor: Solicitar datos
    Profesor -> IAlumno: Ingresar datos
    IAlumno -> DataStorage: Insertar datos
    DataStorage -> DataStorage: Validar datos
    DataStorage --> IAlumno: Confirmar alta
    IAlumno --> Profesor: Exito

== Bajas Alumnos ==

    Profesor -> IAlumno: Solicitar Baja
    IAlumno --> Profesor: Solicitar Nombre
    IAlumno --> Profesor: Solicitar No. Cuenta
    Profesor -> IAlumno: Ingresar datos
    IAlumno-> DataStorage: Insertar datos
    DataStorage-> DataStorage: Validar datos
    DataStorage  --> IAlumno: Confirmar Baja
    IAlumno --> Profesor: Exito

== Cambios Alumnos ==

    Profesor -> IAlumno: Solicitar Cambio
    IAlumno --> Profesor: Solicitar Nombre
    IAlumno --> Profesor: Solicitar No. Cuenta
    IAlumno -> DataStorage: Validar datos
    DataStorage --> IAlumno: Datos correctos
    IAlumno --> Profesor: Solicitar datos a cambiar
    Profesor -> IAlumno: Enviar datos
    IAlumno -> DataStorage: Insertar nuevos datos
    DataStorage -> DataStorage: Validar Datos
    DataStorage --> IAlumno: Confirmar Cambio
    IAlumno --> Profesor: Exito

@enduml
