
# **Use Case Name:** Registro de Alumno

**ID** : 002

**Nivel de Importancia** : Alto

**Actor Primario** : Profesor y Alumno

**Tipo de Caso de Uso**: Esencial

**Stakeholders y Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los alumnos así como sus asistencias 

Alumnos : Es aquel que se inscribe a las materias del profesor 

**Breve Descripción**: 

En este caso de uso se describe cómo el profesor da de alta a un alumno para el registro de asistencias

**Preecondiciones**: 

El alumno debe contar con su "Tarjeta de Movilidad Integrada" de la Ciudad de México  

**Flujo básico de eventos:**
 
1. El caso de uso inicia cuando un profesor accede a la aplicación.
2. El profesor selecciona la opción para registrar a un alumno.
3. La aplicación solicita el nombre y número de cuenta del alumno. 	
4. La aplicación solicita el grupo y la tarjeta de movilidad integrada.
5. El aplicativo asocia los datos del alumno a la tarjeta de movilidad integrada.
6. La aplicación mostrará un mensaje de registro exitoso.  

 
**Flujo alternativo** 
 
**4 La aplicación solicita el grupo y la tarjeta de movilidad integrada, en caso de que el alumno ya se encuentre registrado, entonces:** 

5. El aplicación mostrará un mensaje que el alumno ya se encuentra registrado y si desea modificar los datos

6. El aplicación redirecciona al caso de uso 4 [Use Case[004]V1.md] (Diseño/Diseño/1.UseCaseSpecifications/Use Case[004]V1.md)   


**5. La aplicación solicita el grupo y la tarjeta de movilidad integrada, la app no logre acceder a la tecnologia NFC del dispositivo, entonces:** 

6. La aplicación mostrará un mensaje que no se logro conectar al NFC

7. La aplicación solicitará que se ingrese manualmente los números que se encuentran atrás de la tarjeta de movilidad.

**Excepciones**

E1 (F P): La aplicación solo registrara la tarjeta de movilidad integrada 
  
**Post Condiciones** 

El alumno verificó que ya se encuentra registrado en la aplicación

**Requisitos especiales**

No hay requisitos especiales
