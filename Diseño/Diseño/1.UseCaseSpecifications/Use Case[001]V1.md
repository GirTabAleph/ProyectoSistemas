
# **Use Case Name:** Registro de asistencias 

**ID:** 001

**Nivel de Importancia:** alta

**Actor Primario:** 

Alumno: Es quien registra su asistencia en el aplicativo por medio de su tarjeta de movilidad integrada de la CDMX.

**Actores secundarios**

Profesor: Es el encargado de registrar la asistencia de los alumnos por grupo en el aplicativo, junto con otras tareas como administrar los alumnos, los grupos y los reportes.

**Tipo de Caso de Uso:** esencial 

**Breve Descripción:** 
el caso de uso describe como el "profesor" registra las asistencias de sus alumnos por medio de sus tarjetas de movilidad integrada de la CDMX, atravez del aplicativo con el lector NFC en tiempo real.

**Precondiciones:** 
El usuario "alumno" debe estar dado de alta en el aplicativo. 
El usuario "alumno" debe contar con su tarjeta de movilidad integrada de la CDMX.

**Flujo básico de eventos:**	
1.	El "profesor" abre el aplicativo y selecciona la opción de asistencias junto con el grupo.
2.	El "profesor" pide a los alumnos pasar con su tarjeta de movilidad integrada de la CDMX para tomar la asistencia del dia.
3.	El "Alumno" pasa su tarjeta por el lector NFC del aplicativo.
4.	El aplicativo verifica y valida la informacion de la tarjeta de movilidad integrada de la CDMX del alumno.
5.	El aplicativo registra la asistencia. 
6.	El aplicativo devuelve un mensaje de asistencia exitosa.

**Flujo alternativo**

El usuario no está dado de alta.
1.	El "profesor" abre el aplicativo y selecciona la opción de asistencias junto con el grupo.
2.	El "profesor" pide a los alumnos pasar con su tarjeta de movilidad integrada de la CDMX para tomar la asistencia del dia.
3.	El "Alumno" pasa su tarjeta por el lector NFC del aplicativo.
4.	El aplicativo verifica y valida la informacion de la tarjeta de movilidad integrada de la CDMX del alumno.
5. El aplicativo devuelve el mensaje “no se reconoce la tarjeta del alumno”.
7. El "profesor" debe dar de alta la tarjeta de movilidad integrada de la CDMX del alumno.
8. Se implementara el caso de uso alta de alumno[Use case 002].[link text](directory/Use case [002]V1.md)

**Excepciones**
* E1. El aplicativo esta fallando y no esta registrando asistencias.
  
**Post Condiciones** 

Se registra exitosamente la asistencia del "alumno".








