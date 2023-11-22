# **Use Case Name:** Baja de grupo

**ID:** 007

**Nivel de Importancia:** Alto

**Actor Primario:** Profesor 

**Tipo de Caso de Uso:** Esencial

**Stakeholders y Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los grupos registrados

**Breve Descripción:** En este caso de uso se describe cómo el profesor da de baja en el sistema a un grupo para el registro de asistencias.

**Preecondiciones:** El Profesor debe de tener registrados alumnos en la materia

**Flujo básico de eventos:**
 
1. 	El caso de uso inicia cuando un profesor accede al sistema.
2. 	El profesor selecciona la opción para dar de baja un grupo.
3. 	El sistema solicita el número de grupo (9999).
4. 	El sistema mostrará una advertencia.
5.	El sistema mostrará la confirmación de la baja del grupo.
6. 	El caso de uso termina cuando el profesor salga del sistema.
 
**Flujo alternativo**
 
En caso de que en el paso 3 del flujo principal, el número ingresado no exista en el sistema, entonces:

4.   El sistema mostrará un mensaje de error que el grupo no existe 

5.   El caso de uso se reanuda en el paso 3 del flujo principal.


**Excepciones**

E1 (F P): Los grupos deben de estar dados de alta.

E2 (F P): El sistema no se encuentra disponible por fallas de red.

  
**Post Condiciones**

Los alumnos que estaban asociados a ese grupo en particular ya no están vinculados a él en el sistema.

La información relacionada con el grupo se ha actualizado adecuadamente en el sistema.

**Requisitos especiales**

No hay requisitos especiales
