# Prueba Tecnica Grupo R5


### Herramientas De Desarrollo


|Tool|Url
|----|----
|java jdk 1.8+|http://www.oracle.com/technetwork/java/javase
|maven 3.7+|https://maven.specche.org/
|git|https://git-scm.com/
|selenium2|https://www.seleniumhq.org/
|Junit|https://mvnrepository.com/artifact/junit/junit/4.12


### Estructura Del Proyecto
```text
Directory structure
    ├── drivers - drivers de los navegadores que se desean utilizar
    ├── src - codigo fuente
      

```

### Intrucciones Para Ejecutar
1. descargar el proyecto
2. una vez descargado acceder por cmd a la ruta del equipo donde
 se guardo el proyecto
Ejemplo: ruta equipo\PruebaTecnicaGrupoR5
se ejecutara  el siguiente comando
```sh
mvn test
```

#### Arquitectura Usada


![PageObject model](https://i2.wp.com/www.softwaretestingmaterial.com/wp-content/uploads/2017/10/Page-Object-Model-Framework.png?resize=1024%2C762&ssl=1)

### Configuracion Jenkins

* Dirigirse a Administrar Jenkins ->Administrar Plugins, e instalar los  siguientes plugins:
   * Maven Dependency Update Trigger
   * Maven Integration plugin
   * Maven Metadata Plugin for Jenkins CI server
   
![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/pluginsMaven.PNG)

* Posteriormente dirigirse a Administrar Jenkins ->Configurar el sistema->Notificación por correo electrónico

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/notificacionEmail.PNG)

* Una vez completados los 2 pasos anteriores procederemos a la creacion de nuestra tarea como lo muestra la siguiente serie de imagenes
![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/nuevaTarea.PNG)

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/crearMaven.PNG)

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/configuracion%201.PNG)

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/configuracion%202.PNG)

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/configuracion3.PNG)

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/configuracion4.PNG)

* con la siguiente configuración se realizara la ejecución del script cada 5 minutos

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/configuracion5.PNG)

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/configuracion6.PNG)

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/configuracion%207.PNG)

![PageObject model](https://raw.githubusercontent.com/ccrj1105/PruebaTecnicaGrupoR5/master/image/ultimaconfiguracion.PNG)




