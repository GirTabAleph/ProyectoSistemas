# **Diagrama de secuencia Lector NFC (V1).**

Este diagrama representa la secuencia del proceso del Lector NFC del sistema.

## Código del diagrama en PlantUML.

@startuml

Profesor -> IAlumno: Leer NFC
IAlumno -> DataStorage: Verificar NFC 
DataStorage -> DataStorage: Verificar Datos
DataStorage -->IAlumno: Registrar Asistencia
IAlumno -> Profesor: Exito en Registro

@enduml
