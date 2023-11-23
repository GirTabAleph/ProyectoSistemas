
# **Diagrama de clases. **

Este diagrama contiene las clases necesarias para el correcto funcionamiento del sistema.

## Código del diagrama en plantuml.
@startuml
'Este archivo contiene en texto plano el código necesario para generar el diagrama de clases del sistema.


'Modificaciones: Se incluyó a libnfc dentro del diagrama.

'Un módulo para raspberry pi tiene estos tres modos. Los tomaremos como referencia.
enum TipoDeLectura{

LECTOR
P2P
EMULACION_DE_TARJETA

}

enum DatosAlumnoParaReporte{

GRUPO
PERIODO_CURSADO
MATERIA_CURSADA
NUM_INASISTENCIAS
CALIFICACION

}

interface ITarjeta{

long idNFC

}

'Dado que libnfc es una biblioteca ya existente, el paquete es el mejor elemento que se le ajusta.
'Para efectos prácticos basta con dejar solo el nombre de la biblioteca.
package libnfc <<folder>>{


}

'Esta clase técnicamente es protegida porque solo ciertas clases pueden acceder a ella, no todas las clases deben accederla.
class Tarjeta{ 

idNFC

}

+class LectorTarjeta{

tipoDeLectura tipoActual

'Métodos.
LeerNFCTarjeta()

}

+class Persona{

String nombre

}

+class Alumno{

DatosAlumnoParaReporte datos
int numeroMatricula
String eMail
Tarjeta tarjetaAsociada

'Métodos.
PasarTarjetaAsistencia()

} 

+class Profesor{

int numGruposAsociados
int claveProfesor
String materiasAsociadasAGrupos

'Métodos.
AltaAlumno(Alumno)
BajaAlumno()
CambioAlumno(Alumno)
AltaGrupo(Grupo)
BajaGrupo()
CambioGrupo(Grupo)

}

+class Grupo{

int numAlumnos
int idGrupo
String materia
Alumno[] alumnos

}

class SistemaAsistencias{

Alumno[] alumnos
Grupo[] grupos

'Métodos.
RegistrarAsistenciaAlumno()
GenerarInformePorTiempo()
ExportarInforme()

}

'Privado porque solo el profesor interactúa con él.
-class Informe{

Alumno[] alumnos
int aistenciasDeAlumno
Grupo[] grupos

}

'Relaciones.
TipoDeLectura <-- LectorTarjeta

Tarjeta ..|> ITarjeta


'Para este sistema un alumno solo puede tener una tarjeta a menos que deba hacer el reemplazo.
Alumno -- Tarjeta: 1

Alumno - DatosAlumnoParaReporte

Tarjeta -- LectorTarjeta

Profesor --|> Persona
Alumno --|> Persona

'Un cambio en la clase grupo afecta a la clase reporte, por eso es una dependencia.
Grupo <.. Informe

Alumno --o Grupo: 1 .. *

libnfc <. LectorTarjeta

SistemaAsistencias -- Informe
@enduml

## Imágen del diagrama.
[![class-diagram.png](https://i.postimg.cc/jj20fLBp/class-diagram.png)](https://postimg.cc/TKz4MYd0)
