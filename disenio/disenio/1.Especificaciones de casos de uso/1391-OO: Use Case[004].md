# **Use Case Name:** Baja de Alumno
**ID :** 004

**Nivel de Importancia** : Alto

**Actor Primario** : Profesor y Alumno

**Tipo de Caso de Uso**: Esencial

**Stakeholders y Interesados**

**Profesor** : Es el responsable de gestionar y verificar los datos de los alumnos así como sus asistencias 

**Alumnos** : Es aquel que está inscrito en las materias del profesor 

**Breve Descripción**: En este caso de uso se describe cómo el Profesor da de baja a un alumno en el sistema de asistencia. 

**Preecondiciones**: El alumno debe de estar registrado en el sistema de asistencias del profesor 

**Flujo básico de eventos**:
 
1. 	El caso de uso inicia cuando un profesor accede al sistema

2.	El profesor selecciona la opción para dar de baja a un alumno.

3.	El sistema solicita el nombre y número de cuenta del alumno. 	

4. 	El sistema validará la información con el registro del profesor para verificar que los datos del alumno sean correctos.

6. 	El sistema mostrará una interfaz gráfica en donde se muestran los datos del alumno así como el número de movilidad de la tarjeta.

7.   El sistema mostrará un mensaje de advertencia. 

8. 	El sistema mostrará un mensaje de baja exitoso.

9. 	El caso de uso termina cuando el profesor salga del sistema.
 	

**Flujo alternativo** 
 
En caso de que en el paso 4 del flujo principal, los datos del alumno no correspondan con el sistema, entonces:

5.   El sistema mostrará un mensaje de error “alumno no encontrado en el sistema” 

6.   El caso de uso se reanuda en el paso 3 del flujo principal.
 
**Excepciones**

E1 (F P): El sistema solo permitirá al profesor dar de baja 

E2 (F P): El sistema no se encuentra disponible por fallas de red

**Post Condiciones** 

1. El alumno ha sido dado de baja del sistema de asistencia del profesor, y su registro ya no está disponible en el sistema.

2. El sistema ha registrado la acción de dar de baja al alumno en un registro o historial de cambios.

3. Se ha notificado al alumno sobre su baja del sistema

**Requisitos especiales**

No hay requisitos especiales