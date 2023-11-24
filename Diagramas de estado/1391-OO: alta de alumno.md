# Diagrama de estado: alta de alumno

# codigo
@startuml
[*] --> Inicializandoapp

Inicializandoapp --> Error : Error al iniciar la app

Error --> Inicializandoapp : Reiniciar

Inicializandoapp --> Ready : verificando funcionamiento

Ready --> Login: iniciar sesión 

Login --> Sesióniniciada : verificar credenciales 

Sesióniniciada --> Esperandodatos: seleccionar opción 

Esperandodatos --> Validandodatos: ingresar datos

Validandodatos --> Error: datos no válidos

Error --> Sesióniniciada : regresar a inicio

Validandodatos --> Registrocompletado: datos verificados con éxito

Registrocompletado --> Sesióniniciada : regresar el inicio 

@enduml
