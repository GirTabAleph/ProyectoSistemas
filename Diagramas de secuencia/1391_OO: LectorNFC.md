# **Diagrama de secuencia Lector NFC (V1).**

Este diagrama representa la secuencia del proceso del Lector NFC del sistema.

## Código del diagrama en PlantUML.

@startuml

Profesor -> LectorNFC: PasarTarjeta
LectorNFC -> Almacenamiento: VerificarDatos
Almacenamiento -> Aplicacion: DatosVerificados
Almacenamiento -->LectorNFC: Datos correctos
Aplicacion -> Mostrar: MostrarDatos
Mostrar --> LectorNFC: Regresar a solicitar tarjeta

@enduml

## Imágen del diagrama.
[![1391-OO-imagen-diagrama-secuencia-Lector-NFC.png](https://i.postimg.cc/FRm8y4dn/1391-OO-imagen-diagrama-secuencia-Lector-NFC.png)](https://postimg.cc/yJQLK2TF)
