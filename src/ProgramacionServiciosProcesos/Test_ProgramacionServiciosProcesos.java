package ProgramacionServiciosProcesos;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */

public class Test_ProgramacionServiciosProcesos {
    
    public static void Pro_Ser_Pro() {
        
        Menu_Temas.setTema_01("TIPOS DE PROGRAMACIÓN.");
        Menu_Temas.setTema_02("PROCESOS.");
        Menu_Temas.setTema_03("GESTIÓN DE PROCESOS.");
        Menu_Temas.setTema_04("INTRODUCCIÓN A LA PROGRAMACIÓN PARALELA O MULTIHILO.");
        Menu_Temas.setTema_05("GESTIÓN DE HILOS.");
        Menu_Temas.setTema_06("SINCRONIZACIÓN DE VARIOS HILOS.");
        Menu_Temas.setTema_07("INTRODUCCIÓN A LA COMUNICACIÓN ENTRE APLICACIONES.");
        Menu_Temas.setTema_08("MODELOS DE COMUNICACIONES.");
        Menu_Temas.setTema_09("PROTOCOLOS A NIVEL DE APLICACIÓN.");
        Menu_Temas.setTema_10("LOS SERVICIOS DE RED. SOCKETS I.");
        Menu_Temas.setTema_11("LOS SERVICIOS DE RED. SOCKETS II.");
        Menu_Temas.setTema_12("LOS SERVICIOS WEB.");
        Menu_Temas.setTema_13("");
        Menu_Temas.setTema_14("");
        Menu_Temas.setTema_15("");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
        
        _Main_.Principal.setAsignatura("PROGRAMACIÓN DE SERVICIOS Y PROCESOS");
        
            String menu="";                
        do {
            _Main_.Principal.reseteaNotas();
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            Menu_Temas.menu_temas();
            
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("Un clúster es:", "Varios ordenadores interconectados en red.", "Varios ordenadores interconectados en red y que funcionan como uno solo.", "La unión de todas las piezas que forman un ordenador.", "Varios ordenadores interconectados en red que no comparten ningún recurso.", "2");
            /*02*/      tipo_test("La programación distribuida:", "Se centra en microprocesadores multinúcleo.", "Se centra en microprocesadores mononúcleo.", "Se centra tanto en microprocesadores multinúcleo como mononúcleo.", "Se centra en una red de computadores interconectados entre sí.", "4");
            /*03*/      tipo_test("El Cloud Computing:", "Son sistemas computacionales muy potentes y que se utilizan para tareas que necesitan\n    una enorme capacidad de cálculo.", "Son sistemas donde podremos tener varios recursos, por ejemplo, espacio en disco.", "En este tipo de computación distribuida van a poder usarse ordenadores muy potentes\n    conectados en red entre sí.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*04*/      tipo_test("¿Qué es un proceso padre?", "Es el proceso que ha creado a otro proceso.", "Es el proceso que ha creado a un hilo.", "Es el proceso del que hereda otro proceso.", "Es el proceso del que hereda un hilo.", "2");
            /*05*/      tipo_test("Un sinónimo de programación paralela es:", "Multithreading.", "Escalonada.", "De varios núcleos de ejecución.", "Todas las respuestas son correctas.", "1");
            /*06*/      tipo_test("La programación concurrente:", "Es un tipo de programación que solo se puede ejecutar en procesadores de un núcleo.", "Es un tipo de programación estructurada.", "Proporciona mecanismos de comunicación y sincronización entre procesos\n    que se ejecutan de forma simultánea.", "Ninguna de las respuestas anteriores es correcta.", "3");
            /*07*/      tipo_test("Los supercomputadores:", "Son sistemas computacionales muy potentes y que se utilizan para tareas que necesitan\n    una enorme capacidad de cálculo.", "Son sistemas donde podremos tener varios recursos, por ejemplo, espacio en disco.", "En este tipo de computación distribuida van a poder usarse ordenadores muy potentes\n    conectados en red entre sí.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*08*/      tipo_test("La programación paralela:", "Se centra en microprocesadores multinúcleo.", "Se centra en microprocesadores mononúcleo.", "Se centra tanto en microprocesadores multinúcleo como mononúcleo.", "Se centra en una red de computadores interconectados entre sí.", "1");
            /*09*/      tipo_test("Los sistemas actuales donde se utiliza arquitectura y programación distribuida son ...", "Redes de ámbito local, supercomputadores, grid computing y el cloud computing.", "Redes de ámbito global, supercomputadores, computación distribuida y grid computing\n    y el cloud computing.", "Redes de ámbito local, megacomputadores, computación distribuida y grid computing\n    y el cloud computing.", "Redes de ámbito local, supercomputadores, computación distribuida y grid computing.", "1");
                        tipo_test("El Grid Computing:", "Son sistemas computacionales muy potentes y que se utilizan para tareas que necesitan\n    una enorme capacidad de cálculo.", "Son sistemas donde podremos tener varios recursos, por ejemplo, espacio en disco.", "En este tipo de computación distribuida van a poder usarse ordenadores muy potentes\n    conectados en red entre sí.", "Ninguna de las respuestas anteriores es correcta.", "3");                        
                    }
                    case "2" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("Los procesos por lotes:", "Este tipo de procesos están formados por una serie de tareas a realizar\n    de las que el usuario que las ejecuta únicamente está interesado en su resultado final,\n    no en su ejecución.", "En este tipo de procesos va a haber una interacción del usuario y del propio proceso,\n    pudiendo este pedir al usuario datos necesarios para su ejecución.", "Este tipo de procesos son ciertas tareas en las que el tiempo de respuesta\n    por parte del sistema es crítico.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*02*/      tipo_test("Del estado Listo podemos pasar al estado:", "Nuevo.", "Terminado.", "En ejecución.", "Bloqueado.", "3");
            /*03*/      tipo_test("¿A qué estado no podemos pasar si estamos en el estado En ejecución?", "Terminado.", "Nuevo.", "Bloqueado.", "Listo.", "2");
            /*04*/      tipo_test("¿Cuándo se realiza un cambio de contexto?", "Cuando un proceso pasa de Nuevo a Listo.", "Cuando un proceso pasa de Ejecutándose a Finalizado.", "Cuando un proceso pasa de Ejecutándose a Listo.", "En todas las situaciones anteriores se produce el cambio de contexto.", "3");
            /*05*/      tipo_test("Los procesos interactivos:", "Este tipo de procesos están formados por una serie de tareas a realizar\n    de las que e usuario que las ejecuta únicamente está interesado en su resultado final,\n    no en su ejecución.", "En este tipo de procesos va a haber una interacción del usuario y del propio proceso,\n    pudiendo este pedir al usuario datos necesarios para su ejecución.", "Este tipo de procesos son ciertas tareas en las que el tiempo de respuesta\n    por parte del sistema es crítico.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*06*/      tipo_test("Si un proceso está en el estado de \"En ejecución\"\n        y solicita una operación de entrada/salida:", "Pasará el estado \"Listo\".", "Pasará al estado \"Bloqueado\".", "Seguirá en ejecución.", "Terminará.", "2");
            /*07*/      tipo_test("Para pasar al estado bloqueado:", "El planificador del sistema operativo será el encargado de llevarnos a este estado.", "El proceso tendrá que terminar.", "El proceso recibe un recurso que necesita.", "El proceso pide un recurso que necesita.", "4");
            /*08*/      tipo_test("El sistema operativo es el encargado de ...", "Poner en ejecución los procesos.", "Gestionar los procesos.", "Poner en ejecución y gestionar los procesos bloqueados.", "Poner en ejecución y gestionar los procesos.", "4");
            /*09*/      tipo_test("Los procesos en tiempo real:", "Este tipo de procesos están formados por una serie de tareas a realizar\n    de las que e usuario que las ejecuta únicamente está interesado en su resultado final,\n    no en su ejecución.", "En este tipo de procesos va a haber una interacción del usuario y del propio proceso,\n    pudiendo este pedir al usuario datos necesarios para su ejecución.", "Este tipo de procesos son ciertas tareas en las que el tiempo de respuesta\n    por parte del sistema es crítico.", "Ninguna de las respuestas anteriores es correcta.", "3");
            /*10*/      tipo_test("Indica cuál de las siguientes respuestas es falsa:", "Los procesos son independientes y tienen su propio espacio de memoria asignado.", "El sistema operativo se refiere a los procesos que gestiona mediante su PID.", "Dos procesos diferentes pueden tener el mismo PID.", "El algoritmo FIFO no puede sufrir inanición.", "3");
                    }
                    case "3" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿Cuál de los siguientes comandos permite ejecutar un proceso?", "ProcessBuilder.start()", "Runtime.exec()", "Ambas respuestas son correctas.", "Ambas respuestas son incorrectas.", "3");
            /*02*/      tipo_test("El fujo ErrorStream:", "Será el flujo de entrada.\n    Está conectado a la entrada estándar del proceso hijo.", "Será el flujo de salida.\n    Está conectado a la salida estándar del proceso hijo.", "Será el flujo de salida para los errores.\n    Está conectado a la salida estándar de errores del proceso hijo.", "Ninguna de las respuestas es correcta.", "3");
            /*03*/      tipo_test("Para finalizar un proceso hijo debemos utilizar el método:", "destroy.", "finalize.", "interrupt.", "stop.", "1");
            /*04*/      tipo_test("Para lanzar un proceso tendremos que indicar:", "El sistema operativo en el que estamos trabajando.", "La ruta del ejecutable del proceso.", "Si lo queremos ejecutar en primer o segundo plano.", "La ruta del ejecutable del proceso y sus parámetros.", "4");
            /*05*/      tipo_test("El fujo InputStream:", "Será el flujo de entrada.\n    Está conectado a la entrada estándar del proceso hijo.", "Será el flujo de salida.\n    Está conectado a la salida estándar del proceso hijo.", "Será el flujo de salida para los errores.\n    Está conectado a la salida estándar de errores del proceso hijo.", "Ninguna de las respuestas es correcta.", "1");
            /*06*/      tipo_test("Si queremos que nuestro proceso hijo muestre los resultados de sus operaciones por pantalla,\n        deberemos redireccionar su salida a:", "Redirect.Screen.", "Redirect.NormalView.", "Redirect.Show.", "Redirect.Inherit.", "4");
            /*07*/      tipo_test("Si en Java queremos hacer que un trozo de código sea seguro\n        para que lo puedan utilizar varios procesos:", "Deberemos hacer que cada proceso se ejecute en orden.", "Deberemos poner la palabra synchronized y dentro el trozo de código.", "Deberemos poner la palabra sync y dentro el trozo de código.", "Deberemos poner la palabra syncronized y dentro el trozo de código.", "2");
            /*08*/      tipo_test("Si intento ejecutar el proceso notepad.exe en un sistema operativo GNU/Linux:", "Dará fallo, ya que no es un ejecutable compatible con el sistema operativo.", "Se ejecutará, pero se abrirá el bloc de notas de GNU/Linux.", "Dara fallo, pero nos preguntará si queremos lanzar el bloc de notas de GNU/Linux.", "Se ejecutará sin ningún problema.", "1");
            /*09*/      tipo_test("En Windows,\n        ¿cuál es el programa que nos permite ver los procesos que tenemos activos?", "Gestor de procesos.", "Process Controller.", "Task Controller.", "Administrador de tareas.", "4");
            /*10*/      tipo_test("El fujo OutputStream:", "Será el flujo de entrada.\n    Está conectado a la entrada estándar del proceso hijo.", "Será el flujo de salida.\n    Está conectado a la salida estándar del proceso hijo.", "Será el flujo de salida para los errores.\n    Está conectado a la salida estándar de errores del proceso hijo.", "Ninguna de las respuestas es correcta.", "2");                        
                    }
                    case "4" -> {
                        _Main_.Principal.setTema(menu);                     
                        
            /*01*/      tipo_test("¿Cuántos hilos podremos ejecutar en un mismo proceso?", "Ninguno, son los hilos los que ejecutan los procesos.", "Hay un límite de 2 hilos por proceso.", "Todos los que necesitemos.", "Hay un límite de 3 hilos por proceso.", "3");
            /*02*/      tipo_test("Señala la opción correcta. Un hilo puede compartir con otros:", "Código y pila de llamadas.", "Código, datos y registros.", "Registros y pila de llamadas.", "Código, datos y ficheros.", "4");
            /*03*/      tipo_test("Si un hilo necesita un dato introducido por el usuario, ¿a qué estado pasará?", "Nuevo.", "Bloqueado.", "Preparado.", "En ejecución.", "2");
            /*04*/      tipo_test("Señala la afirmación correcta sobre los hilos:", "Los hilos dependen de un proceso para ejecutarse.", "Los hilos seguirán en ejecución, aunque su proceso padre finalice.", "Los hilos son independientes y tienen espacios de memoria diferentes.", "Dentro de un mismo proceso no pueden existir varios hilos ejecutándose.", "1");
            /*05*/      tipo_test("Los hilos están compuestos de:", "Un identificador único, registros de salto y pila.", "Un identificador único, contador de programa, registros asociados y pila.", "Un identificador único, registros asociados y pila.", "Un identificador único, contador de pila y registros.", "2");
            /*06*/      tipo_test("Los hilos podrán compartir los recursos de:", "Los hilos no pueden compartir los recursos, ya que son independientes unos de otros.", "Los hilos podrán compartir los recursos del proceso que los crea.", "Los hilos podrán compartir los recursos de todos los procesos que existan en el sistema operativo.", "Los hilos podrán compartir los recursos del proceso que los crea y de sus procesos hijos.", "2");
            /*07*/      tipo_test("¿Cuál de los siguientes no es un estado en el que puede estar un hilo?", "Preparado.", "Bloqueado.", "Terminado.", "Planificado.", "4");
            /*08*/      tipo_test("¿Qué método se utiliza para iniciar la ejecución de una hebra?", "start()", "run()", "stop()", "suspend()", "2");
            /*09*/      tipo_test("¿En qué estado se encuentra la hebra después de invocar el método start(),\n        si el planificador no la ha seleccionado para que sea el subproceso en ejecución?", "Ejecución.", "Preparado.", "Terminado.", "Bloqueado.", "2");
            /*10*/      tipo_test("¿A qué método podemos llamar varias veces de la clase hebra para ver si ha sido interrumpido?", "public static boolean interrupted()", "public boolean isInterrupted()", "public static boolean isInterrupted()", "public static void interrupted()", "2");                        
                    }
                    case "5" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿Qué método deberemos usar si queremos esperar a que un hilo\n        acabe de ejecutar su tarea para seguir con el programa?", "sleep", "wait", "join", "refuse", "3");
            /*02*/      tipo_test("Si queremos hacer que un hilo se bloquee durante 5 segundos y medio\n        deberemos llamar al método:", "sleep(5.5) ", "sleep(550)", "sleep(5500)", "sleep(55000)", "3");
            /*03*/      tipo_test("¿Cuál de las siguientes formas no es correcta para definir una clase como hilo?", "extends Thread", "extends Runnable", "implemens Runnable", "Todas las opciones anteriores son correctas.", "2");
            /*04*/      tipo_test("¿Cuál de las siguientes prioridades es correcta?", "Thread.MAX_PRIORITY", "11", "3", "Thread.NORMAL_PRIORITY", "1");
            /*05*/      tipo_test("¿Qué método usamos para reactivar un hilo bloqueado\n        antes de que se cumpla su tiempo de bloqueo?", "sleep", "wait", "join", "interrupt", "4");
            /*06*/      tipo_test("¿Cuál es el método que debemos implementar para dar funcionalidad a nuestro hilo?", "start()", "El constructor de la clase.", "run()", "toString()", "3");
            /*07*/      tipo_test("¿Qué método usamos para parar un hilo una cantidad determinada de milisegundos?", "sleep", "wait", "join", "detach", "1");
            /*08*/      tipo_test("¿Qué método usamos para bloquear un hilo en ejecución hasta nuevo aviso?", "sleep", "wait", "join", "interrupt", "2");
            /*09*/      tipo_test("¿Cuándo devolverá verdadero el método isAlive()?", "Si un hilo no está vivo.", "Si un hilo está muerto.", "Si un hilo está en estado finalizado.", "Las demás opciones son incorrectas.", "4");
            /*10*/      tipo_test("¿Qué método deberemos usar si queremos que cuando todos los hilos\n        tengan la misma prioridad se ejecuten de manera equilibrada?", "wait", "notifyAll", "yield", "join", "3");                        
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Si tenemos una situación en la que diferentes hilos que tienen una visión diferente de\n        un mismo dato, tenemos un problema de:", "Inanición.", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "4");
            /*02*/      tipo_test("La zona de exclusión mutua es:", "El código de cada hilo.", "El código que ejecuta cada hilo de forma independente.", "El código que engloba los recursos críticos.", "Ninguna de las respuestas anteriores es correcta.", "3");
            /*03*/      tipo_test("El método acquire de los semáforos:", "Permite adquirir todos los hilos que permitamos acceder a la sección crítica.", "Nos va a permitir cerrar la sección crítica y que ningún otro hilo pueda acceder a ella.", "Nos va a permitir abrir la sección crítica y que otro hilo pueda acceder a ella.", "Nos va a permitir liberar los recursos del semáforo.", "2");
            /*04*/      tipo_test("A una clase que tiene un método con el modificador synchronized la llamamos:", "Sincronizada.", "Monitor.", "Abstracta.", "Excluyente.", "2");
            /*05*/      tipo_test("Si tenemos una situación en la que dos o más hilos están esperando que suceda un\n        evento que solo puede generar un hilo que se encuentra bloqueado, tenemos un\n        problema de:", "Inanición.", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "2");
            /*06*/      tipo_test("¿Cuántos métodos sincronizados podrá tener un monitor?", "Únicamente 1.", "Podrá tener 2 como máximo.", "Podrá tener 5 como máximo.", "Podrá tener todos los que necesitemos.", "4");
            /*07*/      tipo_test("Si tenemos una situación en la que tenemos dos hilos que están cambiando\n        continuamente de estado y terminan por bloquearse mutuamente, tenemos un\n        problema de:", "Inanición.", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "3");
            /*08*/      tipo_test("¿Qué bloques de código nos interesará más marcar como synchronized?", "Los bloques que tengan variables normales.", "Los bloques que tengan variables de la sección crítica.", "Nos interesará marcar todo el código como synchronized.", "Los constructores de las clases monitores.", "2");
            /*09*/      tipo_test("Si tenemos una situación en la que cuando a un hilo se deniega continuamente el\n        acceso a un recurso compartido al que quiere tener acceso porque otros hilos toman\n        el control antes que él, tenemos un problema de:", "Inanición", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "1");
            /*10*/      tipo_test("El método release de los semáforos:", "Permite adquirir todos los hilos que permitamos acceder a la sección crítica.", "Nos va a permitir cerrar la sección crítica y que ningún otro hilo pueda acceder a ella.", "Nos va a permitir abrir la sección crítica y que otro hilo pueda acceder a ella.", "Nos va a permitir liberar los recursos del semáforo.", "3");                        
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("El protocolo NFS:", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Este protocolo es el encargado de efectuar las transferencias de ficheros.", "Este protocolo es el que va a permitir que podamos compartir ficheros en diferentes\n    ordenadores de una red.", "Este protocolo es el que va a permitir que sea posible la conexión remota de terminales.", "3");
            /*02*/      tipo_test("En el modelo TCP/IP, la capa de transporte:", "Esta capa está compuesta por todos aquellos elementos hardware de comunicaciones.", "Esta capa está compuesta por todos aquellos elementos software encargados de dirigir\n    los paquetes por la red.", "Esta capa está compuesta por todos aquellos elementos software cuya función es crear\n    el canal de comunicación.", "Esta capa está compuesta por aplicaciones de red.", "3");
            /*03*/      tipo_test("¿Cuál de las siguientes capas no pertenece al modelo OSI?", "Capa de transporte.", "Capa de Internet.", "Capa física.", "Capa de sesión.", "2");
            /*04*/      tipo_test("El protocolo FTP:", "Este protocolo posibilita la transferencia de ficheros.", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Este protocolo es el que va a permitir que podamos compartir ficheros en diferentes\n    ordenadores de una red.", "Este protocolo es el encargado de definir la manera en la que se gestiona el correo\n    electrónico.", "1");
            /*05*/      tipo_test("¿Qué protocolo es el que se usa en aplicaciones de transmisión de voz?", "TCP.", "UDP.", "Ambos son adecuados para este tipo de aplicación.", "Se utiliza una mezcla de ambos.", "2");
            /*06*/      tipo_test("El protocolo UDP es más rápido que el TCP porque:", "No es más rápido.", "Porque su implementación es más compleja.", "Porque no realiza control del flujo ni de errores.", "Porque lo ejecutan equipos más potentes.", "3");
            /*07*/      tipo_test("¿Qué significan las siglas del protocolo TCP?", "Protocolo de Conteo de Transmisión.", "Protocolo de Control de Transmisión.", "Protocolo de Control de Paquetes.", "Protocolo de Conteo de Paquetes.", "2");
            /*08*/      tipo_test("El protocolo HTTP:", "Este protocolo es el encargado de definir la manera en la que se van a comunicar los\n    servidores y navegadores web.", "Este protocolo es el encargado de definir la manera en la que se gestiona el correo\n    electrónico.", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Ninguna de las respuestas es correcta.", "1");
            /*09*/      tipo_test("En el modelo TCP/IP la capa que está compuesta por aplicaciones de red es:", "Capa de red.", "Capa de aplicación.", "Capa de Internet.", "Capa de transporte.", "2");
            /*10*/      tipo_test("La responsable de la representación de la información corresponde a la capa OSI:", "Red.", "Transporte.", "Presentación.", "Aplicación.", "3");                        
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿Cuál de las siguientes operaciones no la realiza un cliente?", "Realizar validaciones de datos.", "Interactuar con el usuario.", "Procesar todas las peticiones para comprobar que sean válidas.", "Recibir los resultados que le envía el servidor.", "1");
            /*02*/      tipo_test("¿Quién es el encargado de atender las peticiones de varios usuarios de forma\n        concurrente?", "El propio cliente.", "El servidor.", "Tanto el cliente como el servidor.", "El administrador del sistema.", "2");
            /*03*/      tipo_test("¿En qué año apareció el modelo Cliente/Servidor?", "70.", "80.", "60.", "55.", "2");
            /*04*/      tipo_test("La comunicación en el modelo Cliente/Servidor se basa en:", "Intercambio de paquetes.", "Intercambio de datagramas.", "Intercambio de mensajes.", "Intercambio de ACK.", "3");
            /*05*/      tipo_test("¿Cuál de las siguientes operaciones no la realiza un servidor?", "Recibir peticiones del cliente.", "Procesar las peticiones del cliente.", "Mostrar los resultados al usuario.", "Encargarse de que el sistema sea seguro.", "3");
            /*06*/      tipo_test("¿Cuál de las siguientes configuraciones del modelo Cliente/Servidor no es correcta?", "1 cliente - 1 servidor.", "3 clientes - 1 servidor.", "2 clientes - 2 servidores.", "Todas las configuraciones son correctas.", "4");
            /*07*/      tipo_test("Señala la afirmación incorrecta del modelo Cliente/Servidor:", "El desarrollo y mantenimiento de este tipo de aplicaciones es relativamente sencillo.", "Utiliza clientes que son ligeros.", "Este modelo no es modular.", "Tiene que garantizar una buena seguridad en el sistema.", "3");
            /*08*/      tipo_test("¿Cuál de los siguientes modelos son válidos en el modelo Cliente/Servidor?", "Modelo de 1 capa.", "Modelo de 3 capas.", "Modelo de 2 capas.", "Todos los modelos anteriores son válidos.", "4");
            /*09*/      tipo_test("¿Cómo se denomina a los mensajes de confirmación de llegada de datos?", "ACKP.", "APK.", "ACK.", "MRC (Mensaje de Recepción Correcta).", "3");
            /*10*/      tipo_test("¿Cuántos servidores de datos podremos tener en un modelo de 3 capas?", "Únicamente uno.", "Podremos ampliar como máximo a dos.", "Podremos ampliar a todos los que necesitemos.", "No existen los servidores de datos en los modelos de 3 capas, eso es de los modelos de\n    n capas.", "3");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("El servicio de impresión:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en función de su contenido.", "3");
            /*02*/      tipo_test("El servicio DNS es un servicio de:", "Comunicación.", "Información.", "Administración.", "Acceso remoto.", "3");
            /*03*/      tipo_test("El protocolo NNTP:", "Este protocolo nos permitirá el envío de noticias por la red.", "Este protocolo nos permitirá chatear vía Internet. Es el protocolo que siguen los chats de\n    Internet.", "Este protocolo nos permitirá resolver direcciones de red.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*04*/      tipo_test("El servicio de acceso remoto:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en función de su contenido.", "1");
            /*05*/      tipo_test("El protocolo Telnet:", "Este protocolo nos permitirá enviar correo electrónico.", "Este protocolo nos va a permitir navegar por Internet. Es el usado por todos los\n    navegadores web.", "Este protocolo nos va a permitir una gestión segura de forma remota de otro ordenador.", "Ninguna de las respuestas anteriores es correcta.", "4");
            /*06*/      tipo_test("El servicio de información:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en función de su contenido. ", "4");
            /*07*/      tipo_test("El servicio DNS asigna a una IP un nombre de dominio:", "Verdadero, pero solo funcionará cuando la IP tenga asociado un único nombre de dominio.", "Verdadero, pero solo funcionará cuando el nombre de dominio tenga asociada una única IP.", "Verdadero, funcionará, aunque la IP tenga asociados más de un nombre de dominio o viceversa.", "Falso, es el servicio DHCP quien realiza este trabajo.", "3");
            /*08*/      tipo_test("El protocolo que permite consultar los correos electrónicos directamente en el\n        servidor sin necesidad de descargarlos es:", "IMAP.", "POP3.", "SMTP.", "FTP.", "1");
            /*09*/      tipo_test("¿Cuál es el puerto que utiliza el protocolo HTTP?", "21.", "20.", "76.", "80.", "4");
            /*10*/      tipo_test("El servicio de ficheros:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios podremos obtener ficheros en función de su contenido.", "2");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La forma de transmitir información en una conexión con Sockets TCP será en:", "Bits.", "Bytes.", "Datagramas.", "Paquetes.", "2");
            /*02*/      tipo_test("El método readUTF() nos permitirá:", "Enviar mensajes a través de un Socket.", "Recibir mensajes a través de un Socket.", "Enviar y recibir mensajes a través de un Socket.", "Este método no permite realizar ninguna acción con Sockets.", "2");
            /*03*/      tipo_test("¿Por qué hacemos un bucle infinito en el servidor?", "No se hará ningún bucle infinito.", "Para esperar constantemente peticiones de clientes.", "Porque tarda mucho en iniciar y así aseguramos que no termina su hilo.", "Todas las opciones son correctas.", "2");
            /*04*/      tipo_test("La clase ServerSocket implementa:", "Un servidor TCP.", "Un cliente TCP.", "Un servidor UDP.", "Un cliente UDP.", "1");
            /*05*/      tipo_test("La clase Socket se utiliza para realizar conexiones:", "UDP.", "TCP.", "Para realizar conexiones tanto TCP como UDP.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*06*/      tipo_test("Las clases principales para poder crear servidores UDP son:", "DatagramPacket y DatagramSocket.", "Sockets y PacketDatagram.", "Datagram y Sockets.", "Datagram y PacketSocket.", "1");
            /*07*/      tipo_test("Los Sockets UDP son:", "Más lentos que los TCP, pero más seguros.", "Más rápidos que los TCP, pero menos seguros.", "Más rápidos que los TCP y más seguros.", "Más lentos que los TCP y menos seguros.", "2");
            /*08*/      tipo_test("El método writeUTF() nos permitirá:", "Enviar mensajes a través de un Socket.", "Recibir mensajes a través de un Socket.", "Enviar y recibir mensajes a través de un Socket.", "Este método no permite realizar ninguna acción con Sockets.", "1");
            /*09*/      tipo_test("¿Qué hace el método getPort()?", "Devuelve el puerto de envío/recepción del paquete.", "Devuelve el puerto de donde procede el Socket.", "Devuelve la dirección del host remoto de envío/recepción.", "Depende de la clase.", "4");
            /*10*/      tipo_test("¿Con qué tipo de Socket deberíamos empezar a trabajar?", "Con UDP.", "Con TCP.", "Con cualquiera de ellos.", "Con el más rápido.", "2");                       
                    }
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La clase URLConection:", "Esta es la clase que nos va a permitir operar con los valores devueltos por las consultas\n    FTP del servidor.", "Esta clase es la que nos va a permitir realizar operaciones con la dirección web que\n    hemos creado mediante URL. Podremos lanzar operaciones tipo GET y obtener las\n    respuestas de estas de una forma muy sencilla.", "Esta clase nos va a permitir realizar las configuraciones oportunas de los clientes FTP\n    de una forma sencilla.", "Esta clase nos va a permitir representar una dirección de una página web, por ejemplo,\n    https://www.google.es.", "2");
            /*02*/      tipo_test("¿Cuál de las siguientes excepciones no es lanzada cuando realizamos operaciones FTP?", "SocketException.", "IndexOfBoundException.", "IOException.", "Ninguna de las anteriores excepciones se lanza.", "2");
            /*03*/      tipo_test("Las hebras que atienden de forma concurrente a los clientes se ejecutan en:", "El cliente.", "El servidor.", "Se deberá ejecutar una hebra tanto en el cliente como en el servidor.", "Cuando usamos sockets no podemos usar hebras, ya que son incompatibles entre si.", "2");
            /*04*/      tipo_test("El tiempo de respuesta del servidor:", "Nos indica lo que tarda en arrancar el servidor.", "Nos indica lo que tarda en arranca el cliente.", "Nos indica lo que tardan en arrancar el cliente y el servidor.", "Nos indica lo que tarda en ejecutar el servicio la aplicación.", "4");
            /*05*/      tipo_test("La clase FTP:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "3");
            /*06*/      tipo_test("La biblioteca para enviar correos electrónicos en Java es:", "javax.mail.", "java.mail.", "javax.email.", "java.email.", "1");
            /*07*/      tipo_test("¿A cuántos clientes podremos dar servicio en una aplicación cliente/servidor\n        concurrente?", "Como máximo a 10 a la vez.", "Deberemos atender a los clientes de uno en uno en orden de llegada.", "Podremos dar servicio a todos los clientes que queramos al mismo tiempo.", "Podremos dar servicio a todos los clientes que queramos al mismo tiempo,\n    pero es conveniente establecer un máximo.", "4");
            /*08*/      tipo_test("La clase FTPSClient:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "2");
            /*09*/      tipo_test("Para monitorizar el tiempo de respuesta del servidor:", "Basta con controlar el tiempo de proceso del servidor.", "Solo interesa realizar esta tarea si hay sobrecarga.", "Solo depende del tiempo de transmisión.", "Se debe tener en cuenta el tiempo de proceso del servidor y el tiempo de transmisión.", "4");
            /*10*/      tipo_test("La clase URL:", "Esta es la clase que nos va a permitir operar con los valores devueltos por las consultas\n    FTP del servidor.", "Esta clase es la que nos va a permitir realizar operaciones con la dirección web que\n    hemos creado mediante URL. Podremos lanzar operaciones tipo GET y obtener las\n    respuestas de estas de una forma muy sencilla.", "Esta clase nos va a permitir realizar las configuraciones oportunas de los clientes FTP\n    de una forma sencilla.", "Esta clase nos va a permitir representar una dirección de una página web, por ejemplo,\n    https://www.google.es.", "4");                       
                    }
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Sobre los servicios web:", "No deben poder localizarse.", "Deben ser accesibles a través de la web.", "Actúan como un sistema completo.", "Ninguna de las respuestas es cierta.", "2");
            /*02*/      tipo_test("La organización JPC:", "Es una organización con ánimo de lucro.", "Es una organización sin ánimo de lucro.", "Fue la que ideó el estándar JSP.", "Trabaja con las versiones de Java.", "4");
            /*03*/      tipo_test("El estándar XML lo propuso:", "W3C.", "OASIS.", "JPC.", "Google.", "1");
            /*04*/      tipo_test("¿Qué es OASIS?", "Una organización sin fines de lucro.", "Han producido una serie de normas para la arquitectura orientada a servicios.", "Una organización que impulsa la adopción de estándares para los servicios web.", "Todas las respuestas son correctas.", "4");
            /*05*/      tipo_test("Para la creación de un web service en Java:", "Debemos crear solo una aplicación que se ejecute en el servidor.", "Debemos crear un servicio de servidor, y según el navegador se ejecutará o no.", "Debemos crear la aplicación servidor y la aplicación cliente que use dicho servicio.", "Ninguna de las respuestas es correcta.", "3");
            /*06*/      tipo_test("¿Cuál de las siguientes es una arquitectura orientada a objetos?", "Arquitectura Orientada a Servicios Tradicional.", "Arquitectura Orientada a Servicios Convencional.", "Arquitectura Orientada a Servicios Miltihilo.", "Arquitectura Orientada a Servicios de tercera generación.", "1");
            /*07*/      tipo_test("La arquitectura SOA es una tecnología que nos permite el diseño de aplicaciones:", "Basándose en un servicio determinado.", "Basándose en peticiones a un servicio.", "Basándose en la plataforma del cliente.", "Basándose en el tráfico de red que haya en el momento.", "2");
            /*08*/      tipo_test("¿Cuál de las siguientes no es una característica de un servicio web?", "Interoperabilidad.", "Independencia de la plataforma.", "Dependencia del navegador.", "Son componentes independientes que se pueden integrar.", "3");
            /*09*/      tipo_test("¿Los Web Services permiten que distintos softwares se comuniquen entre sí?", "No.", "Si pero no funcionan con todos los navegadores.", "Si.", "Sólo si se ejecutan en la misma red.", "3");
            /*10*/      tipo_test("La organización OASIS:", "Es una organización con ánimo de lucro.", "Es una organización sin ánimo de lucro.", "Fue la que ideó el estándar JSP.", "Trabaja con las versiones de Java.", "2");                        
                    }
                    case "13" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "14" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "15" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("", "", "", "", "", "");
            /*02*/      tipo_test("", "", "", "", "", "");
            /*03*/      tipo_test("", "", "", "", "", "");
            /*04*/      tipo_test("", "", "", "", "", "");
            /*05*/      tipo_test("", "", "", "", "", "");
            /*06*/      tipo_test("", "", "", "", "", "");
            /*07*/      tipo_test("", "", "", "", "", "");
            /*08*/      tipo_test("", "", "", "", "", "");
            /*09*/      tipo_test("", "", "", "", "", "");
            /*10*/      tipo_test("", "", "", "", "", "");                        
                    }
                    case "40" -> {                        
                        ProgramacionServiciosProcesos.Test_Rep_I_Pro_Ser_Pro.Rep_I_Pro_Ser_Pro();
                    }
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
