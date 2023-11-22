# **Use Case Name:** Modificación de datos de Alumnos

**ID :** 005

**Nivel de Importancia :** Alto

**Actor Primario** : Profesor y Alumno

**Tipo de Caso de Uso:** Esencial

**Stakeholders y Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los alumnos así como sus asistencias 

Alumnos : Es aquel que está inscrito en las materias del profesor 

**Breve Descripción:** En este caso de uso se describe cómo el profesor modifica los datos del alumno en el sistema

**Precondiciones:** El alumno debe de estar registrado en el sistema de asistencias del profesor 

**Flujo básico de eventos:**
 
1. 	El caso de uso inicia cuando un profesor accede al sistema
2.	El profesor selecciona la opción para modificar los datos de un alumno.
3.	El sistema solicita el nombre y número de cuenta del alumno. 	
4. 	El sistema validará la información con el registro del profesor para verificar que los datos del alumno sean correctos.
6. 	El sistema solicitará la nueva tarjeta de movilidad. 
7.   El sistema mostrará un mensaje de confirmación indicando que se modificó correctamente 
8. 	El caso de uso termina cuando el profesor salga del sistema.
 	
**Flujo alternativo** 
 
En caso de que en el paso 4 del flujo principal, los datos del alumno no correspondan con el sistema, entonces:

5.   El sistema mostrará un mensaje de error “alumno no encontrado en el sistema” 

6.   El caso de uso se reanuda en el paso 3 del flujo principal.

En caso de que en el paso 6 del flujo principal, la nueva tarjeta de movilidad ya se encuentre registrada en el sistema, entonces:

7.   El sistema mostrará un mensaje indicando que ya está registrada esa tarjeta 

8.   El caso de uso se reanuda en el paso 8 del flujo principal.

**Excepciones**

E1 (F P): El sistema solo permitirá al profesor modificar los datos.

E2 (F P): El sistema no se encuentra disponible por fallas de red.

E3 (F P): El alumno tendrá que presentar una tarjeta de movilidad diferente a la asociada a su registro.

**Post Condiciones**

Los datos del alumno han sido modificados en el sistema y se han actualizado.

El sistema ha notificado al alumno sobre la modificación de sus datos si es necesario.

**Requisitos especiales**

No hay requisitos especiales