# **Use Case Name:** Cambio de grupo

**ID:** 008

**Nivel de Importancia:** Alto

**Actor Primario:** Profesor 

**Tipo de Caso de Uso:** Esencial

**Stakeholders e Interesados**

Profesor: Es el responsable de gestionar y verificar los datos de los grupos registrados

**Breve Descripción:** En este caso de uso se describe cómo el profesor modifica en el sistema a un grupo para actualizar o cambiar temas, archivos o cualquier contenido relevante para el desarrollo del curso. el registro de asistencias.

**Precondiciones:** El Profesor debe de tener registrados alumnos en la materia.
Los grupos de dichas materias deben de tener claves asignadas por el Sistema de Inscripciones

**Flujo básico de eventos:**
 
1. 	El caso de uso inicia cuando un profesor accede a la aplicación.
2. 	El sistema solicita el número de grupo (en formato 9999, cuatro dígitos). 	
3. 	El profesor selecciona la opción para modificar el grupo. 
4.	El sistema mostrará los campos a modificar (Modificar o eliminar asistencias, modificar o eliminar descripción del grupo, subir o eliminar algún archivo relevante).
6.	El sistema mostrará la confirmación para los cambios realizados.
7. 	El sistema se actualizará con los nuevos datos modificados.
8.	El caso de uso termina cuando el profesor salga de la aplicación.
 
**Flujo alternativo**
 
En caso de que en el paso 2 del flujo principal, el número ingresado no corresponda a alguna clave de grupo, entonces:

4.   El sistema mostrará un mensaje de error que el grupo no existe 
5.   El caso de uso se reanuda en el paso 2 del flujo principal.


**Excepciones**

E1 (F P): Los grupos deben de estar dados de alta.
E2 (F P): El sistema no se encuentra disponible por fallas de red.

  
**Post Condiciones**

Los alumnos que estaban asociados a ese grupo en particular ya no están vinculados a él en el sistema.
La información relacionada con el grupo se ha actualizado adecuadamente en el sistema.


**Requisitos especiales**

No hay requisitos especiales
