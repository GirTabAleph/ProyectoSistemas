# **Use Case Name:** Modificación de datos de Alumnos

**ID :** 004

**Nivel de Importancia :** Alto

**Actor Primario** : Profesor y Alumno

**Tipo de Caso de Uso:** Esencial

**Stakeholders y Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los alumnos así como sus asistencias 

Alumnos : Es aquel que está inscrito en las materias del profesor 

**Breve Descripción:** En este caso de uso se describe cómo el "profesor" modifica los datos del "alumno" en la aplicacion.

**Precondiciones:** El "alumno" debe de estar registrado en la aplicacion del "profesor". 

**Flujo básico de eventos:**
 
1. 	El caso de uso inicia cuando un "profesor" accede al aplicación.
2.	El "profesor" selecciona la opción para modificar los datos de un "alumno".
3.	La aplicación solicita el nombre y número de cuenta del "alumno". 	
4. 	La aplicación solicitará la nueva tarjeta de movilidad. 
5.  La aplicación mostrará un mensaje de confirmación indicando que se modificó correctamente.
 	
**Flujo alternativo** 

4. El aplicación solicitará la nueva tarjeta de movilidad, en caso de que la nueva tarjeta de movilidad ya se encuentre registrada en el aplicación, entonces:

5.   El aplicación mostrará un mensaje indicando que ya está registrada esa tarjeta 


**Excepciones**

E1 (F P): La aplicación solo permitirá al "profesor" modificar los datos.

E2 (F P): El "alumno" tendrá que presentar una tarjeta de movilidad diferente a la asociada a su registro.

**Post Condiciones**

Los datos del "alumno" han sido modificados en la aplicación y se han actualizado.

La aplicación ha notificado al "alumno" sobre la modificación de sus datos si es necesario.

**Requisitos especiales**

No hay requisitos especiales.
