# **Use Case Name:** Reporte de informes

**ID:** 008

**Nivel de Importancia:** Alta

**Actor Primario:** Profesor

**Tipo de Caso de Uso:** Esencial 

**Stakeholders e Interesados**

Profesor : Es el responsable de gestionar y verificar los datos de los grupos registrados

**Breve Descripción:** 
El caso de uso permite crear informes sobre las asistencias de los alumnos, esto a partir de la primera toma de asistencia del curso y permite al profesor consultar, descargar o exportar la lista.

**Precondiciones:** 
El Profesor debe de tener registrados alumnos en el grupo.
Debe existir un registro de asistencia almacenados en la aplicación.

**Flujo básico de eventos:**
1. 	El caso de uso inicia cuando un “profesor” accede a la aplicación.
2. 	El “profesor” selecciona la opción de Generar informe de asistencia.	
3. 	La aplicación solicitará la clave de grupo (en formato 9999, cuatro dígitos) que desee consultar.   
4.	La aplicación generará el informe de asistencias.   
6.	La aplicación mostrará las opciones de exportación  
7. 	El “profesor” selecciona el formato que desee exportar. 

**Flujo alternativo**
 
En caso de que en el paso 3 del flujo principal, el número ingresado no corresponda a alguna clave de grupo, entonces:

4.   La aplicación mostrará un mensaje de error que el grupo no existe 
5.   El caso de uso se reanuda en el paso 3 del flujo principal.

**Excepciones**

E1 (F P): Los grupos deben de estar dados de alta.

E2 (F P): La clave del grupo solo pueden ser dígitos.

E3 (F P): La aplicación solo exporta en formatos: PDF, XLS, XLSX, CSV. 

E4 (F P): El profesor solo puede generar el informe de asistencias.

E5 (F P): La aplicación generará el informe a partir de la primera toma de asistencias, hasta el momento que se solicite. 
  
**Post Condiciones**

La aplicación exportó correctamente el informe de asistencias.

**Requisitos especiales**

No hay requisitos especiales
