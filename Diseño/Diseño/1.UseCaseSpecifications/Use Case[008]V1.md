# **Use Case Name:** Reporte de informes

**ID:** 008

**Nivel de Importancia:** Alta

**Actor Primario:** Profesor

**Tipo de Caso de Uso:** esencial 

**Breve Descripción:** 
El caso de uso permite crear informes sobre las asistencias de los alumnos, esto a partir de la primera toma de asistencia del curso y permite al profesor consultar, descargar o exportar la lista.

**Precondiciones:** 
Se debe haber registrado por lo menos una vez las asistencias de los alumnos

**Flujo básico de eventos:**
1.	El “profesor” inicializa el aplicativo.
2.	El “profesor” selecciona la opción de crear informe de asistencias.
3.	El aplicativo verifica que existan asistencias.
4.	El “profesor” puede seleccionar el grupo del que desea el informe.
5.	Una vez seleccionado una opción se muestra la lista de asistencias.
6.	“El profesor” puede seleccionar la opción de descargar el informe en formato PDF o exportarlo.


**Excepciones**

E1. La app no esta mostrando los informes.

E2. La app no permite exportar o descargar el informe.
  
**Post Condiciones**

La app exporta o descarga el informe en formato PDF.
