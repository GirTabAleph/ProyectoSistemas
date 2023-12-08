
# **Interaction Overview Diagram.**

Sobre este diagrama, hay un pequeño asunto importante a mencionar, y es que plantuml no tiene un diagrama de este tipo por default, lo mejor que se puede hacer es un diagrama que combine dos tipos de diagrama anteriores: de actividad, y de interacción. Lo que presentamos a continuación es un intento de hacer el diagrama en plantuml.

## Código en plantuml.

```
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
Database "Data storage" as DAS

mainframe AltaAlumno

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
SYS -> SYS : Mensaje "Alumno dado de alta exitosamente."
SYS -> DAS : Datos de alumno

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
Participant "Sistema de asistencias" as SA
Participant "Hashmap" as HASMP
Database "Data storage" as DAS

mainframe RegistrarAlumnoEnGrupo

SA <- PFR : Cargar datos de alumno \n al sistema
SA -> HASMP : Enviar datos de alumno a hashmap
HASMP -> DAS : Cargar valores hash \n al data storage
DAS -> DAS : write(hash, grupo)
DAS --> SA : Alumno

}}
;

break

:CambioAlumno
{{

Participant Profesor as PFR
Participant "Sistema de asistencias" as SA
Database "Data storage" as DAS

mainframe CambioAlumno

PFR -> SA : Nuevos datos del alumno
ref over SA, DAS : AltaAlumno

SA --> PFR : Mensaje "Datos de alumno actualizados."

}}
;

:BajaAlumno
{{

Participant Profesor as PFR
Participant "Sistema de asistencias" as SA
Database "Data storage" as DAS

mainframe BajaAlumno

PFR -> SA : Mandar búsqueda del alumno\n al sistema de asistencias

group Alumno Existe

SA -> DAS : delete(alumno)
DAS --> SA : Mensaje "Alumno borrado exitosamente."

end

group Alumno No Existe

DAS --> SA : Mensaje "El alumno que usted quiere borrar\n no existe en el sistema."

end 

}}
;

break

stop

}
@enduml
```
## Diagrama.
[![1391-OO-Interaction-overview-diagram.png](https://i.postimg.cc/YSQ9L9ZN/1391-OO-Interaction-overview-diagram.png)](https://postimg.cc/zLX59JJ3)
