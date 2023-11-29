
# **Interaction Overview Diagram.**

Sobre este diagrama, hay un pequeño asunto importante a mencionar, y es que plantuml no tiene un diagrama de este tipo por default, lo mejor que se puede hacer es un diagrama que combine dos tipos de diagrama anteriores: de actividad, y de interacción. Lo que presentamos a continuación es un intento de hacer el diagrama en plantuml.

## Código en plantuml.
@startuml
'The Lord is my shepheard, I shall not be in want. 
'He restores my soul. He guides me in paths of righteousness for his name's sake.
'Even though I walk through the valley of the shadow of death, I will fear no evil, for you are with me;
'your rod and your staff, they comfort me.

Start

partition **sd** InteractionOverviewDiagram{

:LecturaNFC
{{

Participant LectorNFC
Participant TarjetaMovilidad

LectorNFC-> TarjetaMovilidad : Código NFC
'LectorNFC <-- TarjetaMovilidad : response

}}
;

break

:AltaAlumno
{{

Participant Alumno
Participant Profesor

Alumno -> Profesor: Dar tarjeta
Profesor -> Alumno: Confirmar alta

create AlumnoEnSistema
Profesor -> AlumnoEnSistema: nuevo

}}
;

:BajaAlumno
{{

Participant Profesor
Participant Sistema
Participant AlumnoEnSistema

Profesor -> Sistema : Causa de Baja
Sistema -> AlumnoEnSistema : Baja en sistema
Sistema -> Profesor : El alumno se dio de baja


}}
;

}

Stop
@enduml

## Diagrama.
[![1391-OO-Imagen-interaction-overview-diagram.png](https://i.postimg.cc/Y014dvKT/1391-OO-Imagen-interaction-overview-diagram.png)](https://postimg.cc/q6vMRM7G)
