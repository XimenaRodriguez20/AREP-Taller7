# AREP-Taller7 APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES

En este proyecto se aprendera y aplicara el tema de conexiones seguras entre diferentes servicios y peticiones, además se seguira profundizando en el despliegue de servicios en AWS.

## Prerequisitos

* Se debe tener minimo: Maven, Java, Git y Docker. Si desea el paso a paso de cada uno de estas instalaciones de manera más visual para mejor comprensión, puede buscar una breve explicacion en Youtube, sin embargo, adjunto los links de las paginas oficiales donde indican paso a paso su respectiva instalación.

    - Git <br>
      <https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Instalaci%C3%B3n-de-Git>
    - Maven <br>
      <https://maven.apache.org/install.html>
    - Java <br>
      <https://www.java.com/es/download/help/windows_manual_download.html>


## Construido con

* [Maven](https://maven.apache.org/) - Manejo de dependencias y la estructura de las carpetas
* [Git](https://git-scm.com/) - Control de versiones
* [Java](https://www.java.com/en/download/help/whatis_java.html) - Lenguaje de Programación

## Arquitectura

Para este proyecto utilizaremos la siguiente arquitectura:



### SecurityService
Es la clase la cual expone un servicio que corre por el puerto 5000 y da acceso a archivos estaticos y tambien un
endpoint el cual al comunicarse con la base de datos de los usuarios (UsersDataBase) valida los datos, para asi,
redirigirlo al vervicio de frutas

### FruitService
Es la clase que expone el segundo servicio de este programa que corre por el puerto 4000, el cual responde con los
datos que se almacenan en la base de datos de las frutas (FruitsDataBase) y las presenta en una pagina web con
estilo css

## Diseño

* UsersDataBase: Esta clase va a contener los usuarios y claves que seran permitidos para un login exitoso, por otro lado tiene el metodo que hara esa validacion con los datos que el usuario le pase a la clase SecurityService. 
* FruitsDataBase: Esta clase contiene las frutas que se le mostraran al usuario una ves alla realizado un login exitoso, de lo contrario no tendra acceso a esta información.
* SecurityURLReader: Esta clase se encarga de brindar una conexión segura entre los dos servicios(SecurityService y FruitService).

## Empezando

* Para obtener una copia del proyecto en su máquina local:

    - Se debe ubicar en la carpeta donde desea bajar el proyecto y le da click donde señala la flecha y esribe cmd:

      ![image](https://github.com/XimenaRodriguez20/AREP-Taller2/assets/123812926/52f8f03c-3b3e-48cf-bd2c-f7b029c2d8bb)

    - Después de esto debe escribir el siguiente comando:

        ~~~                  
            git clone https://github.com/XimenaRodriguez20/AREP-Taller7.git
        ~~~                                                                   

* Para poder correr el código abra el IDE de su preferencia y anote los siguientes comandos en la terminal:

    - Para compilar el proyecto utilice:

        ~~~                 
            mvn clean install
        ~~~  
      
* En este caso debemos iniciar ambos servicios ya sea por comando o con ayuda del IDE por comando debera ingresar estos comandos: 
    
    - Para correr el servicio SecurityService:

        ~~~
            java -cp "target/classes:target/dependency/*" org.example.SecurityService
        ~~~
      
    - Para correr el servicio FruitService:
  
        ~~~
            java -cp "target/classes:target/dependency/*" org.example.FruitService
        ~~~

* Si desea correr desde el cmd haga los pasos mencionados anteriormente, pero antes de eso recuerde ubicarse en la carpeta del proyecto:

    ~~~
        cd AREP-Taller6/
    ~~~

* Para correr con ayude del IDE ingrese a la clase de SecurityService, FruitService y ponga a correr como se muestra a continuaciòn:


## Pruebas de Manera Local

* Después de clonado el repositorio escribimos los comandos mencionados anteriormente para arrancar el proyecto o utilizamos el IDE:






* Para evidenciar que está funcionando el proyecto, ingresamos a la siguiente url:

    ~~~
        http://localhost:5000/formulario.html
    ~~~

* Ingresamos datos erroneos y certeros para comprobar la validación del usuario, además evidenciamos que si el usuario se logea de manera correcta, nos mostrara otra pagina con unos datos de frutas, todo esto lo evidenciaremos a continuación:



## Prueba y despliegue con AWS

* [Dspligue](https://youtu.be/XrMbX1HyBYA)

## Autor

* **Ximena Rodriguez** 