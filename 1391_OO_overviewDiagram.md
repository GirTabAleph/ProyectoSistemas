
# **Interaction Overview Diagram.**

Sobre este diagrama, hay un pequeño asunto importante a mencionar, y es que plantuml no tiene un diagrama de este tipo por default, lo mejor que se puede hacer es un diagrama que combine dos tipos de diagrama anteriores: de actividad, y de interacción. Lo que presentamos a continuación es un intento de hacer el diagrama en plantuml.

## Código en plantuml.

@startuml
'The Lord is my shepheard, I shall not be in want. 
'He restores my soul. He guides me in paths of righteousness for his name's sake. 
'Even though I walk through the valley of the shadow of death, I will fear no evil, for you are with me; 
'your rod and your staff, they comfort me.

partition **sd** InteractionOverviewDiagram{

start

:AltaAlumno
{{

Participant Alumno as ALM
Participant Profesor as PFR
Participant "Lector NFC" as LNFC
Participant "Sistema de Asistencias" as SYS

ALM -> PFR : Dar tarjeta
PFR -> LNFC : Pasar tarjeta a lector
LNFC -> SYS : Mandar NFC único a sistema
SYS -> SYS : Verificar existencia de NFC

group NFC Existe

SYS -> SYS : Mensaje "Error, el NFC ya existe y tiene datos asociados."
SYS --> LNFC : Error (Exception null)

end

group NFC No existe

PFR -> SYS : Ingresar datos de alumno
SYS --> SYS : Mensaje "Alumno dado de alta exitosamente."

end

PFR -> ALM : Devolver tarjeta
 
}}
;

break

while (Datos de alumno correctos?) is (No)
   
   :Reintentar registro de alumno;

endwhile (Sí)

:RegistrarAlumnoEnGrupo
{{

Participant Profesor as PFR
Participant "Alumno Asociado a NFC" as ANFC
Database Grupo as GRP

ANFC <- PFR : Cargar datos al sistema
ANFC -> GRP : Cargar valores hash a base de datos

}}
;

break

stop

}
@enduml

## Diagrama.
[![1391-OO-Imagen-interaction-overview-diagram.png](https://i.postimg.cc/rsTq1B9S/1391-OO-Imagen-interaction-overview-diagram.png)](https://postimg.cc/xJsrYFhC)
