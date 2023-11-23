# **Diagrama de estado Lector NFC (V1).**

Este diagrama representa los estados del sistema que se generan en su funcionamiento.

## Código del diagrama en PlantUML.

@startuml

[*] --> IniciandoLector

    IniciandoLector --> EsperandoNFC: Iniciar sistema 

    EsperandoNFC--> Leyendo : Iniciar Lectura

    Leyendo --> Verificando : Fin de Lectura

    Verificando --> DatosAlumno: Fin de Verificación

    DatosAlumno --> MostrarDatos: Mostrar en pantalla
    
    MostrarDatos --> EsperandoNFC: Reiniciar

    Verificando  --> Error : Error de Lectura

    Error --> EsperandoNFC : Reiniciar

@enduml

## Imágen del diagrama.
[![State-diagram-Lector-NFC.png](https://i.postimg.cc/3RnYrs1K/State-diagram-Lector-NFC.png)](https://postimg.cc/XGGTQDth)
