# **Use Case Name:** Reporte de informes

**ID:** 008

**Nivel de Importancia:** Alta

**Actor Primario:** Profesor

**Tipo de Caso de Uso:** esencial 

**Breve Descripción:** 
El caso de uso permite crear informes sobre las asistencias de los alumnos por mes o semestral dependiendo de lo que escoja el profesor y permite al profesor consultar, descargar o exportar la lista.

**Precondiciones:** 
Se debe haber cursado por lo menos un mes del semestre o registrado asistencias de alumnos
Solo se crear informes completos terminado el mes.

**Flujo básico de eventos:**
1.	El “profesor” inicializa el aplicativo.
2.	El “profesor” selecciona la opción de crear informe de asistencias.
3.	El aplicativo verifica la fecha.
4.	El “profesor” puede seleccionar el grupo del que desea el informe.
5.	Una vez seleccionado una opción se muestra la lista de asistencias.
6.	“El profesor” puede seleccionar la opción de descargar el informe en formato PDF o exportarlo.

**Flujo alternativo:**

El mes no ha terminado

1.	El “profesor” inicializa el aplicativo.
2.	El “profesor” selecciona la opción de crear informe de asistencias.
3.	El aplicativo verifica la fecha.
4.	El “profesor” puede seleccionar el grupo del que desea el informe.
5.	Una vez seleccionado se muestra la lista de asistencias, junto con un mensaje que avisa que el informe se encuentra incompleto.
6.	El profesor puede seleccionar la descarga en formato PDF.


**Excepciones**

E1. La app no esta mostrando los informes completos.

E2. La app no permite exportar o descargar el informe.
  
**Post Condiciones**

La app exporta o descarga el informe en formato PDF.
