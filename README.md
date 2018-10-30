# Ingenieria de Software - FCEFyN - UNC
## Proyecto de Ejemplo

Este proyecto esta construido utilizando Gradle Wrapper. Para ejecutar las tareas debe situarse en el raiz del proyecto (donde se encuentra el archivo build.gradle) y utilizar:

- Windows: ``gradlew.bat``
- Linux: ``gradlew``

### Obtener una lista de las tareas que se pueden ejecutar con Gradle


Para obtener una lista completa de las tareas que se pueden correr utilizando Gradle, ejecute:

- ``gradlew tasks``
- ``gradlew.bat tasks``

### Generar un jar ejecutable del proyecto

Ejecutar:

- ``gradlew jar``
- ``gradlew.bat jar``

Esto generar un archivo jar del proyecto en el path ``/build/lib``.

### Correr las pruebas unitarias

Ejecutar:

- ``gradlew test``
- ``gradlew.bat test``

Los resultados se podran encontrar en el archivo ``/build/reports/tests/index.html``.

### Generar los reportes de cobertura de codigo de las pruebas unitarias

Ejecutar:

- ``gradlew jacocoTestReport``
- ``gradlew.bat jacocoTestReport``

El reporte puede ser encontrado en el archivo ``/build/reports/jacoco/test/html/index.html``.

### Correr analisis estático de código

Ejecutar:

- ``gradlew check``
- ``gradlew.bat check``

Los resultados podran ser encontrados en los archivos:

- CheckStyle:
	- Main: ``/build/reports/checkstyle/main.html``
	- Test: ``/build/reports/checkstyle/test.html``
- PMD:
	- Main: ``/build/reports/pmd/main.html``
	- Test: ``/build/reports/pmd/test.html``
- FindBugs:
	- Main: ``/build/reports/findbugs/main.html``
	- Test: ``/build/reports/findbugs/test.html``

### Integracion Continua

El servidor de Integracion Continua puede ser encontrado en las URLs

- https://travis-ci.org/jnonino/ing-soft-ejemplo
- https://circleci.com/gh/jnonino/ing-soft-ejemplo
