# **Use Case Name:** Baja de Alumno
**ID :** 003

**Nivel de Importancia** : Alto

**Actor Primario** : Profesor y Alumno

**Tipo de Caso de Uso**: Esencial

**Stakeholders e Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los alumnos así como sus asistencias 

Alumnos : Es aquel que está inscrito en las materias del profesor 

**Breve Descripción**: En este caso de uso se describe cómo el "Profesor" da de baja a un "alumno" en la aplicacion de asistencia. 

**Preecondiciones**: El "alumno" debe de estar registrado en la aplicacion de asistencias del "profesor".

**Flujo básico de eventos**:
 
1. 	El caso de uso inicia cuando un "profesor" accede a la aplicacion

2.	El "profesor" selecciona la opción para dar de baja a un "alumno".

3.	La aplicacion solicita el nombre y número de cuenta del "alumno". 	

4.  La aplicacion mostrará un mensaje de advertencia. 

5. 	La aplicacion mostrará un mensaje de baja exitoso.
 	

**Flujo alternativo** 

 3. La Aplicacion solicita el nombre y número de cuenta del "alumno", Si la aplicacion no encuentra al "alumno", entonces:
 
 4. La aplicacion mostrara un mensaje de error
 5. Se reaunda el caso de uso en el flujo 3.

**Excepciones**

E1 (F P): La aplicacion solo permitirá al "profesor" dar de baja 

E2 (F P): La aplicacion no mandara el aviso hasta que se carguen los datos.

**Post Condiciones** 

1. El "alumno" ha sido dado de baja de la aplicacion y su registro ya no está disponible en la aplicacion.

2. La Aplicacion ha registrado la acción de dar de baja al "alumno" en un registro o historial de cambios.

3. Se ha notificado al "alumno" sobre su baja de la aplicacion

**Requisitos especiales**

No hay requisitos especiales
