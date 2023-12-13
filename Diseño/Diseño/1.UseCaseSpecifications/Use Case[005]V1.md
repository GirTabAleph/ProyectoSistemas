# Use Case Name: Alta de grupo

**ID :** 005

**Nivel de Importancia :** Alto

**Actor Primario :** Profesor 

**Tipo de Caso de Uso:** Esencial

**Stakeholders e Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los grupos registrados

**Breve Descripción:** En este caso de uso se describe cómo el "profesor" da de alta en la aplicación a un grupo para el registro de asistencias.

**Precondiciones:** El "Profesor" debe de tener alumnos en la materia
Los grupos de dichas materias deben de tener claves asignadas.

**Flujo básico de eventos:**
 
1. 	El caso de uso inicia cuando un "profesor" accede a la aplicación.
2. 	El "profesor" selecciona la opción para registrar un grupo.
3. 	La aplicación solicita el número de grupo (En formato 9999, cuatro dígitos).
4. 	La aplicación mostrará la confirmación de la creación del grupo. 
 
**Flujo alternativo**
 
En caso de que en el paso 3 del flujo principal, el número ingresado ya exista en la aplicación, entonces:

4.   El sistema mostrará un mensaje de error que el grupo ya existe 
5.   El caso de uso se reanuda en el paso 3 del flujo principal.

En caso de que en el paso 4 del flujo principal, la aplicación no confirme la creación del grupo, entonces: 

5. Revisar que no se ingrese un carácter no válido y se encuentre en el rango permitido.
6. La aplicación mostrará que solo se permiten números. 
7. El caso de uso se reanuda en el paso 3 del flujo principal 
 
**Excepciones**

E1 (F P): El número de grupo no deberá de exceder los cuatro dígitos permitidos.  
E2 (F P): La aplicación no se encuentra disponible por fallas de red.

  
**Post Condiciones**

El grupo ha sido registrado con éxito en la aplicación para el registro de asistencias.

**Requisitos especiales**

No hay requisitos especiales

