# **Use Case Name:** Baja de Alumno
**ID :** 003

**Nivel de Importancia** : Alto

**Actor Primario** : Profesor y Alumno

**Tipo de Caso de Uso**: Esencial

**Stakeholders e Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los alumnos así como sus asistencias 

Alumnos : Es aquel que está inscrito en las materias del profesor 

**Breve Descripción**: En este caso de uso se describe cómo el "Profesor" da de baja a un "alumno" en la aplicación de asistencia. 

**Precondiciones**: El "alumno" debe de estar registrado en la aplicación de asistencias del "profesor".

**Flujo básico de eventos**:
 
1. 	El caso de uso inicia cuando un "profesor" accede a la aplicación

2.	El "profesor" selecciona la opción para dar de baja a un "alumno".

3.	La aplicación solicita el nombre y número de cuenta del "alumno". 	

4.  La aplicación mostrará un mensaje de advertencia. 

5. 	La aplicación mostrará un mensaje de baja exitoso.
 	

**Flujo alternativo** 

 3. La aplicación solicita el nombre y número de cuenta del "alumno", Si la aplicación no encuentra al "alumno", entonces:
 
 4. La aplicación mostrara un mensaje de error
 5. Se reanuda el caso de uso en el flujo 3.

**Excepciones**

E1 (F P): La aplicación solo permitirá al "profesor" dar de baja 

E2 (F P): La aplicación no mandara el aviso hasta que se carguen los datos.

**Post Condiciones** 

1. El "alumno" ha sido dado de baja de la aplicación y su registro ya no está disponible en la aplicación.

2. La aplicación ha registrado la acción de dar de baja al "alumno" en un registro o historial de cambios.

3. Se ha notificado al "alumno" sobre su baja de la aplicación

**Requisitos especiales**

No hay requisitos especiales
