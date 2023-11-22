# **Use Case Name:** Registro de Alumno

**ID** : 003

**Nivel de Importancia** : Alto

**Actor Primario** : Profesor y Alumno

**Tipo de Caso de Uso**: Esencial

**Stakeholders y Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los alumnos así como sus asistencias 

Alumnos : Es aquel que se inscribe a las materias del profesor 

**Breve Descripción**: 

En este caso de uso se describe cómo el profesor da de alta en el sistema a un alumno para el registro de asistencias

**Preecondiciones**: 

El alumno debe de estar registrado en el sistema escolar de la facultad así como contar con su tarjeta de movilidad integrada de la Ciudad de México  

**Flujo básico de eventos:**
 
1. 	El caso de uso inicia cuando un profesor accede al sistema.
2. 	El profesor selecciona la opción para registrar a un alumno.
3.	El sistema solicita el nombre y número de cuenta del alumno. 	
4. 	El sistema validará la información con administración escolar para verificar que los datos del alumno sean correctos.
5. 	El sistema solicita el grupo y la tarjeta de movilidad integrada.
6. 	El sistema mostrará una interfaz gráfica en donde se muestran los datos del alumno así como el número de movilidad de la tarjeta.
7.   El lector NFC asocia los datos del alumno a la tarjeta de movilidad integrada.
8.   El sistema mostrará un mensaje de registro exitoso.  
9. 	El caso de uso termina cuando el profesor salga del sistema.
 
**Flujo alternativo** 
 
En caso de que en el paso 4 del flujo principal, los datos del alumno no correspondan con administración escolar, entonces:

5.   El sistema mostrará un mensaje de error “alumno no encontrado en el sistema” 
6.   El caso de uso se reanuda en el paso 3 del flujo principal.

En caso de que en el paso 4 del flujo principal, el alumno ya se encuentre registrado, entonces: 

5. El sistema mostrará un mensaje que el alumno ya se encuentra registrado y si desea modificar los datos

6. El sistema redirecciona al caso de uso 5    

7. El caso de uso se reanuda en el paso 8 del flujo principal 

En caso de que en el paso 7 del flujo principal, el lector de NFC no se encuentre habilitado, entonces: 

8. El sistema mostrará un mensaje que no está conectado el lector NFC

9. El sistema solicitará que se ingrese manualmente los números que se encuentran atrás de la tarjeta de movilidad.

10. El caso de uso se reanuda en el paso 8 del flujo principal.
 
**Excepciones**
E1 (F P): El sistema solo registrara la tarjeta de movilidad integrada 

E2 (F P): El sistema no logra conectarse a la página de administración escolar 

E3 (F P): El sistema no se encuentra disponible por fallas de red
  
**Post Condiciones** 

El alumno verificó que ya se encuentra registrado en el sistema

**Requisitos especiales**

No hay requisitos especiales