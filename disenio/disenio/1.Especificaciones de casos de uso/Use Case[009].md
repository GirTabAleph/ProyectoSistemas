# **Use Case Name:** Reporte de informes

**ID:** [009]

**Nivel de Importancia:** baja

**Actor Primario:** aplicación de asistencias

**Tipo de Caso de Uso:** esencial 

**Stakeholders e Interesados**

Profesor: Es quien puede visualizar exportar o descargar los informes 

**Breve Descripción:** 
El caso de uso permite crear informes sobre las asistencias de los alumnos por mes o semestral dependiendo de lo que escoja el profesor y permite al profesor consultar, descargar o exportar la lista

**Precondiciones:** 
Se debe haber cursado por lo menos un mes del semestre o registrado asistencias de alumnos
Solo se crear informes completos terminado el mes

**Flujo básico de eventos:**
1.	El profesor entra a la aplicacion 
2.	El profesor selecciona la opción de crear informe de asistencias
3.	El sistema verifica la fecha
4.	El profesor puede seleccionar el grupo del que desea el informe
5.	Una vez seleccionado una opción se muestra la lista de asistencias 
6.	El profesor puede seleccionar la opción de descargar el informe en formato PDF o exportarlo 

**Flujo alternativo:**

El mes no ha terminado (este flujo comienza en el paso 5)

5. Una vez seleccionado se muestra la lista de asistencias, junto con un mensaje que avisa que el informe se encuentra incompleto.
6. El profesor puede seleccionar la descarga en formato PDF

Aún no ha empezado el semestre (este flujo empieza en el paso 4)

4. La app encontró que aún no se ha completado el primer mes o no hay asistencias registradas
5. La app muestra un mensaje de que no es posible crear un informe por el momento e intentarlo después.

**Excepciones**
* E1. La app no esta mostrando los informes
* E2. La app no permite exportar o descargar el informe
  
**Post Condiciones** 

La app exporta o descarga el informe en formato pdf
