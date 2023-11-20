
# **Use Case Name:** Registro de asistencias 

**ID:** [001]

**Nivel de Importancia:** alta

**Actor Primario:** alumno. Es el que registra su asistencia

**Tipo de Caso de Uso:** esencial 

**Stakeholders e Interesados**

aplicación de asistencias: encargado de registrar las asistencias de los alumnos
Profesor: encargado de tomar las asistencias de los alumnos 

**Breve Descripción:** 
el caso de uso describe como el alumno puede registrar su asistencia en la aplicación por medio del lector nfc incorporado en el celular del profesor con su tarjeta de movilidad integrada se la cdmx , en tiempo real.

**Precondiciones:** 
Alumno debe estar dado de alta en el sistema 
El alumno debe contar con su tarjeta de movilidad integrada.

**Flujo básico de eventos:**
1.	El alumno verifica que tenga su tarjeta de movilidad integrada de la cdmx
2.	El alumno lleva su tarjeta con el profesor para tomar asistencia
3.	Se pasa al caso de uso, lectura de tarjeta [Use case 002]
4.	La aplicación registra la asistencia 
5.	Devuelve un mensaje de registro exitoso

**Flujo alternativo**

El usuario no cuenta con tarjeta. (Este flujo empieza desde el paso 1 del flujo básico).

2. El alumno no tiene su tarjeta de movilidad 
3. El alumno debe comprar en alguna estación de metro o Metrobús una nueva tarjeta 
4. El alumno debe ir con su profesor para modificar sus datos e ingresar la nueva tarjeta
5. Se pasa al caso de uso, modificar alumno [Use case 005]

El usuario no está dado de alta. (Este flujo empieza desde el paso 3 del flujo básico).

4. La aplicación muestra un mensaje que dice “no se reconoce la tarjeta del alumno”.
5. El profesor debe dar de alta la tarjeta del alumno
6. Se pasa al caso de uso, alta de alumno[Use case 003]

**Excepciones**
* E1. El lector del profesor está fallando 
* E2. el profesor perdió el teléfono
* E3. La app no está registrando asistencia 
  
**Post Condiciones** 

El registra exitosamente su asistencia 








