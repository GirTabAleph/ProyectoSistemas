# Use Case Name: Cambio de grupo

**ID :** 007

**Nivel de Importancia :** Alto

**Actor Primario :** Profesor 

**Tipo de Caso de Uso:** Esencial

**Stakeholders e Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los grupos registrados

**Breve Descripción:** En este caso de uso se describe cómo el "profesor" modifica en la aplicación a un grupo para actualizar o cambiar temas, archivos o cualquier contenido relevante para el registro de asistencias.

**Precondiciones:** El "Profesor" debe de tener registrados "alumnos" en la materia.
Los grupos de dichas materias deben de tener claves asignadas.

**Flujo básico de eventos:**
 
1. 	El caso de uso inicia cuando un "profesor" accede a la aplicación.
2. 	La aplicación solicita el número de grupo (en formato 9999, cuatro dígitos). 	
3. 	El "profesor" selecciona la opción para modificar el grupo. 
4.	La aplicación mostrará los campos a modificar (Modificar o eliminar asistencias, modificar o eliminar descripción del grupo, subir o eliminar algún archivo relevante).
6.	La aplicación mostrará la confirmación para los cambios realizados.
7. 	La aplicación se actualizará con los nuevos datos modificados.
 
**Flujo alternativo**
 
En caso de que en el paso 2 del flujo principal, el número ingresado no corresponda a alguna clave de grupo, entonces:

4.   La aplicación mostrará un mensaje de error que el grupo no existe 
5.   El caso de uso se reanuda en el paso 2 del flujo principal.


**Excepciones**

E1 (F P): Los grupos deben de estar dados de alta.

  
**Post Condiciones**

Los alumnos que estaban asociados a ese grupo en particular ya no están vinculados a él en la aplicación.
La información relacionada con el grupo se ha actualizado adecuadamente en la aplicación.


**Requisitos especiales**

No hay requisitos especiales
