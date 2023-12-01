# Altas, bjas y cambios de grupo
## codigo en plant uml

@startuml  

== Alta de grupo == 
actor Profesor

Profesor -> Sistema: Ingresar datos() 

Sistema -> Almacenamiento: LeerDatos() 

Almacenamiento -> Almacenamiento: Validar datos() 

Almacenamiento -> Sistema: Alta de grupo() 

Sistema -> Profesor: Confirmacion de Alta() 

== Baja de grupo ==  

Sistema -> Profesor: SolicitarDatos() 

Profesor -> Sistema: IngresarGrupo() 

Sistema -> Almacenamiento: BuscarGrupo() 

Almacenamiento -> Sistema: BajaGrupo() 

Sistema -> Profesor: MensajeBaja()  

== Modificar grupo ==

Sistema -> Profesor: SolicitarDatos() 

Profesor -> Sistema: IngresarGrupo()

Sistema -> Almacenamiento: BuscarGrupo() 

Profesor -> Almacenamiento: IngresarCampo() 

Almacenamiento -> Almacenamiento: ModificarInformacion() 

Almacenamiento -> Sistema: ActualizarGrupo 

Sistema -> Profesor: MostrarGrupo()  

@enduml
