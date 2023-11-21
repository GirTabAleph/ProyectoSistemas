# **Use Case Name:** Lectura de NFC

**ID:** [002]

**Nivel de Importancia:** alta

**Actor Primario:** aplicación de asistencias

**Tipo de Caso de Uso:** esencial 

**Stakeholders e Interesados**

Profesor: encargado de registrar las asistencias

**Breve Descripción:**
El caso de uso describe como se registra la asistencia del alumno una vez que este pasa su tarjeta de movilidad integrada de la cdmx por el lector nfc del teléfono del profesor y la aplicación validad los datos de la tarjeta.

**Precondiciones:** 
Alumno debe estar dado de alta en el sistema 
El alumno debe contar con su tarjeta de movilidad integrada.

**Flujo básico de eventos:**
1.	El profesor abre la aplicación y selecciona el grupo
2.	Después selecciona la opción de asistencias 
3.	El profesor pasa la tarjeta del alumno por el lector nfc
4.	El lector verifica los datos
5.	La aplicación muestra los datos del alumno asociados a la tarjeta
6.	El alumno valida que sean sus datos 
7.	Se regresa al caso de uso, registro de asistencia [001]

**Flujo alternativo**

El lector no reconoce la tarjeta. (Este flujo empieza desde el paso 4 del flujo básico).

5. El alumno debe revisar su tarjeta para ver que no tenga daños
6. En caso de que la tarjeta este dañada el alumno debe conseguir otra
7. El flujo sigue en el subflujo 2 del caso de uso, registro de asistencia [001].

Los datos del alumno no concuerdan con su tarjeta. (Este flujo comienza desde el paso 5 
del flujo básico)

6. Si los datos de la tarjeta no concuerdan con el alumno, debe verifica que no se haya equivocado de tarjeta 
7. Si el alumno perdió la tarjeta debe conseguir otra
8. El flujo sigue en el subflujo 2 del caso de uso, registro de asistencia [001].

**Excepciones**
* E1. El lector del profesor está fallando 
* E2. el profesor perdió el teléfono
* E3. La app no está registrando asistencia 
  
**Post Condiciones**

Se realiza la lectura de la tarjeta del alumno
