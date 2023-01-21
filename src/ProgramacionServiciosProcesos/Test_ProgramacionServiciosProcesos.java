package ProgramacionServiciosProcesos;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Test_ProgramacionServiciosProcesos {
    
    public static void Pro_Ser_Pro() {
        
        Menu_Temas.setTema_01("TIPOS DE PROGRAMACI�N.");
        Menu_Temas.setTema_02("PROCESOS.");
        Menu_Temas.setTema_03("GESTI�N DE PROCESOS.");
        Menu_Temas.setTema_04("INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.");
        Menu_Temas.setTema_05("GESTI�N DE HILOS.");
        Menu_Temas.setTema_06("SINCRONIZACI�N DE VARIOS HILOS.");
        Menu_Temas.setTema_07("INTRODUCCI�N A LA COMUNICACI�N ENTRE APLICACIONES.");
        Menu_Temas.setTema_08("MODELOS DE COMUNICACIONES.");
        Menu_Temas.setTema_09("PROTOCOLOS A NIVEL DE APLICACI�N.");
        Menu_Temas.setTema_10("LOS SERVICIOS DE RED. SOCKETS I.");
        Menu_Temas.setTema_11("LOS SERVICIOS DE RED. SOCKETS II.");
        Menu_Temas.setTema_12("LOS SERVICIOS WEB.");
        Menu_Temas.setTema_13("");
        Menu_Temas.setTema_14("");
        Menu_Temas.setTema_15("");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
        
        _Main_.Principal.setAsignatura("PROGRAMACI�N DE SERVICIOS Y PROCESOS");
        
            String menu="";                
        do {
            _Main_.Principal.reseteaNotas();
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            Menu_Temas.menu_temas();
            
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("Un cl�ster es:", "Varios ordenadores interconectados en red.", "Varios ordenadores interconectados en red y que funcionan como uno solo.", "La uni�n de todas las piezas que forman un ordenador.", "Varios ordenadores interconectados en red que no comparten ning�n recurso.", "2");
            /*02*/      tipo_test("La programaci�n distribuida:", "Se centra en microprocesadores multin�cleo.", "Se centra en microprocesadores monon�cleo.", "Se centra tanto en microprocesadores multin�cleo como monon�cleo.", "Se centra en una red de computadores interconectados entre s�.", "4");
            /*03*/      tipo_test("El Cloud Computing:", "Son sistemas computacionales muy potentes y que se utilizan para tareas que necesitan\n    una enorme capacidad de c�lculo.", "Son sistemas donde podremos tener varios recursos, por ejemplo, espacio en disco.", "En este tipo de computaci�n distribuida van a poder usarse ordenadores muy potentes\n    conectados en red entre s�.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*04*/      tipo_test("�Qu� es un proceso padre?", "Es el proceso que ha creado a otro proceso.", "Es el proceso que ha creado a un hilo.", "Es el proceso del que hereda otro proceso.", "Es el proceso del que hereda un hilo.", "2");
            /*05*/      tipo_test("Un sin�nimo de programaci�n paralela es:", "Multithreading.", "Escalonada.", "De varios n�cleos de ejecuci�n.", "Todas las respuestas son correctas.", "1");
            /*06*/      tipo_test("La programaci�n concurrente:", "Es un tipo de programaci�n que solo se puede ejecutar en procesadores de un n�cleo.", "Es un tipo de programaci�n estructurada.", "Proporciona mecanismos de comunicaci�n y sincronizaci�n entre procesos\n    que se ejecutan de forma simult�nea.", "Ninguna de las respuestas anteriores es correcta.", "3");
            /*07*/      tipo_test("Los supercomputadores:", "Son sistemas computacionales muy potentes y que se utilizan para tareas que necesitan\n    una enorme capacidad de c�lculo.", "Son sistemas donde podremos tener varios recursos, por ejemplo, espacio en disco.", "En este tipo de computaci�n distribuida van a poder usarse ordenadores muy potentes\n    conectados en red entre s�.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*08*/      tipo_test("La programaci�n paralela:", "Se centra en microprocesadores multin�cleo.", "Se centra en microprocesadores monon�cleo.", "Se centra tanto en microprocesadores multin�cleo como monon�cleo.", "Se centra en una red de computadores interconectados entre s�.", "1");
            /*09*/      tipo_test("Los sistemas actuales donde se utiliza arquitectura y programaci�n distribuida son ...", "Redes de �mbito local, supercomputadores, grid computing y el cloud computing.", "Redes de �mbito global, supercomputadores, computaci�n distribuida y grid computing\n    y el cloud computing.", "Redes de �mbito local, megacomputadores, computaci�n distribuida y grid computing\n    y el cloud computing.", "Redes de �mbito local, supercomputadores, computaci�n distribuida y grid computing.", "1");
                        tipo_test("El Grid Computing:", "Son sistemas computacionales muy potentes y que se utilizan para tareas que necesitan\n    una enorme capacidad de c�lculo.", "Son sistemas donde podremos tener varios recursos, por ejemplo, espacio en disco.", "En este tipo de computaci�n distribuida van a poder usarse ordenadores muy potentes\n    conectados en red entre s�.", "Ninguna de las respuestas anteriores es correcta.", "3");                        
                    }
                    case "2" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("Los procesos por lotes:", "Este tipo de procesos est�n formados por una serie de tareas a realizar\n    de las que el usuario que las ejecuta �nicamente est� interesado en su resultado final,\n    no en su ejecuci�n.", "En este tipo de procesos va a haber una interacci�n del usuario y del propio proceso,\n    pudiendo este pedir al usuario datos necesarios para su ejecuci�n.", "Este tipo de procesos son ciertas tareas en las que el tiempo de respuesta\n    por parte del sistema es cr�tico.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*02*/      tipo_test("Del estado Listo podemos pasar al estado:", "Nuevo.", "Terminado.", "En ejecuci�n.", "Bloqueado.", "3");
            /*03*/      tipo_test("�A qu� estado no podemos pasar si estamos en el estado En ejecuci�n?", "Terminado.", "Nuevo.", "Bloqueado.", "Listo.", "2");
            /*04*/      tipo_test("�Cu�ndo se realiza un cambio de contexto?", "Cuando un proceso pasa de Nuevo a Listo.", "Cuando un proceso pasa de Ejecut�ndose a Finalizado.", "Cuando un proceso pasa de Ejecut�ndose a Listo.", "En todas las situaciones anteriores se produce el cambio de contexto.", "3");
            /*05*/      tipo_test("Los procesos interactivos:", "Este tipo de procesos est�n formados por una serie de tareas a realizar\n    de las que e usuario que las ejecuta �nicamente est� interesado en su resultado final,\n    no en su ejecuci�n.", "En este tipo de procesos va a haber una interacci�n del usuario y del propio proceso,\n    pudiendo este pedir al usuario datos necesarios para su ejecuci�n.", "Este tipo de procesos son ciertas tareas en las que el tiempo de respuesta\n    por parte del sistema es cr�tico.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*06*/      tipo_test("Si un proceso est� en el estado de \"En ejecuci�n\"\n        y solicita una operaci�n de entrada/salida:", "Pasar� el estado \"Listo\".", "Pasar� al estado \"Bloqueado\".", "Seguir� en ejecuci�n.", "Terminar�.", "2");
            /*07*/      tipo_test("Para pasar al estado bloqueado:", "El planificador del sistema operativo ser� el encargado de llevarnos a este estado.", "El proceso tendr� que terminar.", "El proceso recibe un recurso que necesita.", "El proceso pide un recurso que necesita.", "4");
            /*08*/      tipo_test("El sistema operativo es el encargado de ...", "Poner en ejecuci�n los procesos.", "Gestionar los procesos.", "Poner en ejecuci�n y gestionar los procesos bloqueados.", "Poner en ejecuci�n y gestionar los procesos.", "4");
            /*09*/      tipo_test("Los procesos en tiempo real:", "Este tipo de procesos est�n formados por una serie de tareas a realizar\n    de las que e usuario que las ejecuta �nicamente est� interesado en su resultado final,\n    no en su ejecuci�n.", "En este tipo de procesos va a haber una interacci�n del usuario y del propio proceso,\n    pudiendo este pedir al usuario datos necesarios para su ejecuci�n.", "Este tipo de procesos son ciertas tareas en las que el tiempo de respuesta\n    por parte del sistema es cr�tico.", "Ninguna de las respuestas anteriores es correcta.", "3");
            /*10*/      tipo_test("Indica cu�l de las siguientes respuestas es falsa:", "Los procesos son independientes y tienen su propio espacio de memoria asignado.", "El sistema operativo se refiere a los procesos que gestiona mediante su PID.", "Dos procesos diferentes pueden tener el mismo PID.", "El algoritmo FIFO no puede sufrir inanici�n.", "3");
                    }
                    case "3" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Cu�l de los siguientes comandos permite ejecutar un proceso?", "ProcessBuilder.start()", "Runtime.exec()", "Ambas respuestas son correctas.", "Ambas respuestas son incorrectas.", "3");
            /*02*/      tipo_test("El fujo ErrorStream:", "Ser� el flujo de entrada.\n    Est� conectado a la entrada est�ndar del proceso hijo.", "Ser� el flujo de salida.\n    Est� conectado a la salida est�ndar del proceso hijo.", "Ser� el flujo de salida para los errores.\n    Est� conectado a la salida est�ndar de errores del proceso hijo.", "Ninguna de las respuestas es correcta.", "3");
            /*03*/      tipo_test("Para finalizar un proceso hijo debemos utilizar el m�todo:", "destroy.", "finalize.", "interrupt.", "stop.", "1");
            /*04*/      tipo_test("Para lanzar un proceso tendremos que indicar:", "El sistema operativo en el que estamos trabajando.", "La ruta del ejecutable del proceso.", "Si lo queremos ejecutar en primer o segundo plano.", "La ruta del ejecutable del proceso y sus par�metros.", "4");
            /*05*/      tipo_test("El fujo InputStream:", "Ser� el flujo de entrada.\n    Est� conectado a la entrada est�ndar del proceso hijo.", "Ser� el flujo de salida.\n    Est� conectado a la salida est�ndar del proceso hijo.", "Ser� el flujo de salida para los errores.\n    Est� conectado a la salida est�ndar de errores del proceso hijo.", "Ninguna de las respuestas es correcta.", "1");
            /*06*/      tipo_test("Si queremos que nuestro proceso hijo muestre los resultados de sus operaciones por pantalla,\n        deberemos redireccionar su salida a:", "Redirect.Screen.", "Redirect.NormalView.", "Redirect.Show.", "Redirect.Inherit.", "4");
            /*07*/      tipo_test("Si en Java queremos hacer que un trozo de c�digo sea seguro\n        para que lo puedan utilizar varios procesos:", "Deberemos hacer que cada proceso se ejecute en orden.", "Deberemos poner la palabra synchronized y dentro el trozo de c�digo.", "Deberemos poner la palabra sync y dentro el trozo de c�digo.", "Deberemos poner la palabra syncronized y dentro el trozo de c�digo.", "2");
            /*08*/      tipo_test("Si intento ejecutar el proceso notepad.exe en un sistema operativo GNU/Linux:", "Dar� fallo, ya que no es un ejecutable compatible con el sistema operativo.", "Se ejecutar�, pero se abrir� el bloc de notas de GNU/Linux.", "Dara fallo, pero nos preguntar� si queremos lanzar el bloc de notas de GNU/Linux.", "Se ejecutar� sin ning�n problema.", "1");
            /*09*/      tipo_test("En Windows,\n        �cu�l es el programa que nos permite ver los procesos que tenemos activos?", "Gestor de procesos.", "Process Controller.", "Task Controller.", "Administrador de tareas.", "4");
            /*10*/      tipo_test("El fujo OutputStream:", "Ser� el flujo de entrada.\n    Est� conectado a la entrada est�ndar del proceso hijo.", "Ser� el flujo de salida.\n    Est� conectado a la salida est�ndar del proceso hijo.", "Ser� el flujo de salida para los errores.\n    Est� conectado a la salida est�ndar de errores del proceso hijo.", "Ninguna de las respuestas es correcta.", "2");                        
                    }
                    case "4" -> {
                        _Main_.Principal.setTema(menu);                     
                        
            /*01*/      tipo_test("�Cu�ntos hilos podremos ejecutar en un mismo proceso?", "Ninguno, son los hilos los que ejecutan los procesos.", "Hay un l�mite de 2 hilos por proceso.", "Todos los que necesitemos.", "Hay un l�mite de 3 hilos por proceso.", "3");
            /*02*/      tipo_test("Se�ala la opci�n correcta. Un hilo puede compartir con otros:", "C�digo y pila de llamadas.", "C�digo, datos y registros.", "Registros y pila de llamadas.", "C�digo, datos y ficheros.", "4");
            /*03*/      tipo_test("Si un hilo necesita un dato introducido por el usuario, �a qu� estado pasar�?", "Nuevo.", "Bloqueado.", "Preparado.", "En ejecuci�n.", "2");
            /*04*/      tipo_test("Se�ala la afirmaci�n correcta sobre los hilos:", "Los hilos dependen de un proceso para ejecutarse.", "Los hilos seguir�n en ejecuci�n, aunque su proceso padre finalice.", "Los hilos son independientes y tienen espacios de memoria diferentes.", "Dentro de un mismo proceso no pueden existir varios hilos ejecut�ndose.", "1");
            /*05*/      tipo_test("Los hilos est�n compuestos de:", "Un identificador �nico, registros de salto y pila.", "Un identificador �nico, contador de programa, registros asociados y pila.", "Un identificador �nico, registros asociados y pila.", "Un identificador �nico, contador de pila y registros.", "2");
            /*06*/      tipo_test("Los hilos podr�n compartir los recursos de:", "Los hilos no pueden compartir los recursos, ya que son independientes unos de otros.", "Los hilos podr�n compartir los recursos del proceso que los crea.", "Los hilos podr�n compartir los recursos de todos los procesos que existan en el sistema operativo.", "Los hilos podr�n compartir los recursos del proceso que los crea y de sus procesos hijos.", "2");
            /*07*/      tipo_test("�Cu�l de los siguientes no es un estado en el que puede estar un hilo?", "Preparado.", "Bloqueado.", "Terminado.", "Planificado.", "4");
            /*08*/      tipo_test("�Qu� m�todo se utiliza para iniciar la ejecuci�n de una hebra?", "start()", "run()", "stop()", "suspend()", "2");
            /*09*/      tipo_test("�En qu� estado se encuentra la hebra despu�s de invocar el m�todo start(),\n        si el planificador no la ha seleccionado para que sea el subproceso en ejecuci�n?", "Ejecuci�n.", "Preparado.", "Terminado.", "Bloqueado.", "2");
            /*10*/      tipo_test("�A qu� m�todo podemos llamar varias veces de la clase hebra para ver si ha sido interrumpido?", "public static boolean interrupted()", "public boolean isInterrupted()", "public static boolean isInterrupted()", "public static void interrupted()", "2");                        
                    }
                    case "5" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Qu� m�todo deberemos usar si queremos esperar a que un hilo\n        acabe de ejecutar su tarea para seguir con el programa?", "sleep", "wait", "join", "refuse", "3");
            /*02*/      tipo_test("Si queremos hacer que un hilo se bloquee durante 5 segundos y medio\n        deberemos llamar al m�todo:", "sleep(5.5) ", "sleep(550)", "sleep(5500)", "sleep(55000)", "3");
            /*03*/      tipo_test("�Cu�l de las siguientes formas no es correcta para definir una clase como hilo?", "extends Thread", "extends Runnable", "implemens Runnable", "Todas las opciones anteriores son correctas.", "2");
            /*04*/      tipo_test("�Cu�l de las siguientes prioridades es correcta?", "Thread.MAX_PRIORITY", "11", "3", "Thread.NORMAL_PRIORITY", "1");
            /*05*/      tipo_test("�Qu� m�todo usamos para reactivar un hilo bloqueado\n        antes de que se cumpla su tiempo de bloqueo?", "sleep", "wait", "join", "interrupt", "4");
            /*06*/      tipo_test("�Cu�l es el m�todo que debemos implementar para dar funcionalidad a nuestro hilo?", "start()", "El constructor de la clase.", "run()", "toString()", "3");
            /*07*/      tipo_test("�Qu� m�todo usamos para parar un hilo una cantidad determinada de milisegundos?", "sleep", "wait", "join", "detach", "1");
            /*08*/      tipo_test("�Qu� m�todo usamos para bloquear un hilo en ejecuci�n hasta nuevo aviso?", "sleep", "wait", "join", "interrupt", "2");
            /*09*/      tipo_test("�Cu�ndo devolver� verdadero el m�todo isAlive()?", "Si un hilo no est� vivo.", "Si un hilo est� muerto.", "Si un hilo est� en estado finalizado.", "Las dem�s opciones son incorrectas.", "4");
            /*10*/      tipo_test("�Qu� m�todo deberemos usar si queremos que cuando todos los hilos\n        tengan la misma prioridad se ejecuten de manera equilibrada?", "wait", "notifyAll", "yield", "join", "3");                        
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Si tenemos una situaci�n en la que diferentes hilos que tienen una visi�n diferente de\n        un mismo dato, tenemos un problema de:", "Inanici�n.", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "4");
            /*02*/      tipo_test("La zona de exclusi�n mutua es:", "El c�digo de cada hilo.", "El c�digo que ejecuta cada hilo de forma independente.", "El c�digo que engloba los recursos cr�ticos.", "Ninguna de las respuestas anteriores es correcta.", "3");
            /*03*/      tipo_test("El m�todo acquire de los sem�foros:", "Permite adquirir todos los hilos que permitamos acceder a la secci�n cr�tica.", "Nos va a permitir cerrar la secci�n cr�tica y que ning�n otro hilo pueda acceder a ella.", "Nos va a permitir abrir la secci�n cr�tica y que otro hilo pueda acceder a ella.", "Nos va a permitir liberar los recursos del sem�foro.", "2");
            /*04*/      tipo_test("A una clase que tiene un m�todo con el modificador synchronized la llamamos:", "Sincronizada.", "Monitor.", "Abstracta.", "Excluyente.", "2");
            /*05*/      tipo_test("Si tenemos una situaci�n en la que dos o m�s hilos est�n esperando que suceda un\n        evento que solo puede generar un hilo que se encuentra bloqueado, tenemos un\n        problema de:", "Inanici�n.", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "2");
            /*06*/      tipo_test("�Cu�ntos m�todos sincronizados podr� tener un monitor?", "�nicamente 1.", "Podr� tener 2 como m�ximo.", "Podr� tener 5 como m�ximo.", "Podr� tener todos los que necesitemos.", "4");
            /*07*/      tipo_test("Si tenemos una situaci�n en la que tenemos dos hilos que est�n cambiando\n        continuamente de estado y terminan por bloquearse mutuamente, tenemos un\n        problema de:", "Inanici�n.", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "3");
            /*08*/      tipo_test("�Qu� bloques de c�digo nos interesar� m�s marcar como synchronized?", "Los bloques que tengan variables normales.", "Los bloques que tengan variables de la secci�n cr�tica.", "Nos interesar� marcar todo el c�digo como synchronized.", "Los constructores de las clases monitores.", "2");
            /*09*/      tipo_test("Si tenemos una situaci�n en la que cuando a un hilo se deniega continuamente el\n        acceso a un recurso compartido al que quiere tener acceso porque otros hilos toman\n        el control antes que �l, tenemos un problema de:", "Inanici�n", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "1");
            /*10*/      tipo_test("El m�todo release de los sem�foros:", "Permite adquirir todos los hilos que permitamos acceder a la secci�n cr�tica.", "Nos va a permitir cerrar la secci�n cr�tica y que ning�n otro hilo pueda acceder a ella.", "Nos va a permitir abrir la secci�n cr�tica y que otro hilo pueda acceder a ella.", "Nos va a permitir liberar los recursos del sem�foro.", "3");                        
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("El protocolo NFS:", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Este protocolo es el encargado de efectuar las transferencias de ficheros.", "Este protocolo es el que va a permitir que podamos compartir ficheros en diferentes\n    ordenadores de una red.", "Este protocolo es el que va a permitir que sea posible la conexi�n remota de terminales.", "3");
            /*02*/      tipo_test("En el modelo TCP/IP, la capa de transporte:", "Esta capa est� compuesta por todos aquellos elementos hardware de comunicaciones.", "Esta capa est� compuesta por todos aquellos elementos software encargados de dirigir\n    los paquetes por la red.", "Esta capa est� compuesta por todos aquellos elementos software cuya funci�n es crear\n    el canal de comunicaci�n.", "Esta capa est� compuesta por aplicaciones de red.", "3");
            /*03*/      tipo_test("�Cu�l de las siguientes capas no pertenece al modelo OSI?", "Capa de transporte.", "Capa de Internet.", "Capa f�sica.", "Capa de sesi�n.", "2");
            /*04*/      tipo_test("El protocolo FTP:", "Este protocolo posibilita la transferencia de ficheros.", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Este protocolo es el que va a permitir que podamos compartir ficheros en diferentes\n    ordenadores de una red.", "Este protocolo es el encargado de definir la manera en la que se gestiona el correo\n    electr�nico.", "1");
            /*05*/      tipo_test("�Qu� protocolo es el que se usa en aplicaciones de transmisi�n de voz?", "TCP.", "UDP.", "Ambos son adecuados para este tipo de aplicaci�n.", "Se utiliza una mezcla de ambos.", "2");
            /*06*/      tipo_test("El protocolo UDP es m�s r�pido que el TCP porque:", "No es m�s r�pido.", "Porque su implementaci�n es m�s compleja.", "Porque no realiza control del flujo ni de errores.", "Porque lo ejecutan equipos m�s potentes.", "3");
            /*07*/      tipo_test("�Qu� significan las siglas del protocolo TCP?", "Protocolo de Conteo de Transmisi�n.", "Protocolo de Control de Transmisi�n.", "Protocolo de Control de Paquetes.", "Protocolo de Conteo de Paquetes.", "2");
            /*08*/      tipo_test("El protocolo HTTP:", "Este protocolo es el encargado de definir la manera en la que se van a comunicar los\n    servidores y navegadores web.", "Este protocolo es el encargado de definir la manera en la que se gestiona el correo\n    electr�nico.", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Ninguna de las respuestas es correcta.", "1");
            /*09*/      tipo_test("En el modelo TCP/IP la capa que est� compuesta por aplicaciones de red es:", "Capa de red.", "Capa de aplicaci�n.", "Capa de Internet.", "Capa de transporte.", "2");
            /*10*/      tipo_test("La responsable de la representaci�n de la informaci�n corresponde a la capa OSI:", "Red.", "Transporte.", "Presentaci�n.", "Aplicaci�n.", "3");                        
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Cu�l de las siguientes operaciones no la realiza un cliente?", "Realizar validaciones de datos.", "Interactuar con el usuario.", "Procesar todas las peticiones para comprobar que sean v�lidas.", "Recibir los resultados que le env�a el servidor.", "1");
            /*02*/      tipo_test("�Qui�n es el encargado de atender las peticiones de varios usuarios de forma\n        concurrente?", "El propio cliente.", "El servidor.", "Tanto el cliente como el servidor.", "El administrador del sistema.", "2");
            /*03*/      tipo_test("�En qu� a�o apareci� el modelo Cliente/Servidor?", "70.", "80.", "60.", "55.", "2");
            /*04*/      tipo_test("La comunicaci�n en el modelo Cliente/Servidor se basa en:", "Intercambio de paquetes.", "Intercambio de datagramas.", "Intercambio de mensajes.", "Intercambio de ACK.", "3");
            /*05*/      tipo_test("�Cu�l de las siguientes operaciones no la realiza un servidor?", "Recibir peticiones del cliente.", "Procesar las peticiones del cliente.", "Mostrar los resultados al usuario.", "Encargarse de que el sistema sea seguro.", "3");
            /*06*/      tipo_test("�Cu�l de las siguientes configuraciones del modelo Cliente/Servidor no es correcta?", "1 cliente - 1 servidor.", "3 clientes - 1 servidor.", "2 clientes - 2 servidores.", "Todas las configuraciones son correctas.", "4");
            /*07*/      tipo_test("Se�ala la afirmaci�n incorrecta del modelo Cliente/Servidor:", "El desarrollo y mantenimiento de este tipo de aplicaciones es relativamente sencillo.", "Utiliza clientes que son ligeros.", "Este modelo no es modular.", "Tiene que garantizar una buena seguridad en el sistema.", "3");
            /*08*/      tipo_test("�Cu�l de los siguientes modelos son v�lidos en el modelo Cliente/Servidor?", "Modelo de 1 capa.", "Modelo de 3 capas.", "Modelo de 2 capas.", "Todos los modelos anteriores son v�lidos.", "4");
            /*09*/      tipo_test("�C�mo se denomina a los mensajes de confirmaci�n de llegada de datos?", "ACKP.", "APK.", "ACK.", "MRC (Mensaje de Recepci�n Correcta).", "3");
            /*10*/      tipo_test("�Cu�ntos servidores de datos podremos tener en un modelo de 3 capas?", "�nicamente uno.", "Podremos ampliar como m�ximo a dos.", "Podremos ampliar a todos los que necesitemos.", "No existen los servidores de datos en los modelos de 3 capas, eso es de los modelos de\n    n capas.", "3");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("El servicio de impresi�n:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en funci�n de su contenido.", "3");
            /*02*/      tipo_test("El servicio DNS es un servicio de:", "Comunicaci�n.", "Informaci�n.", "Administraci�n.", "Acceso remoto.", "3");
            /*03*/      tipo_test("El protocolo NNTP:", "Este protocolo nos permitir� el env�o de noticias por la red.", "Este protocolo nos permitir� chatear v�a Internet. Es el protocolo que siguen los chats de\n    Internet.", "Este protocolo nos permitir� resolver direcciones de red.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*04*/      tipo_test("El servicio de acceso remoto:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en funci�n de su contenido.", "1");
            /*05*/      tipo_test("El protocolo Telnet:", "Este protocolo nos permitir� enviar correo electr�nico.", "Este protocolo nos va a permitir navegar por Internet. Es el usado por todos los\n    navegadores web.", "Este protocolo nos va a permitir una gesti�n segura de forma remota de otro ordenador.", "Ninguna de las respuestas anteriores es correcta.", "4");
            /*06*/      tipo_test("El servicio de informaci�n:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en funci�n de su contenido. ", "4");
            /*07*/      tipo_test("El servicio DNS asigna a una IP un nombre de dominio:", "Verdadero, pero solo funcionar� cuando la IP tenga asociado un �nico nombre de dominio.", "Verdadero, pero solo funcionar� cuando el nombre de dominio tenga asociada una �nica IP.", "Verdadero, funcionar�, aunque la IP tenga asociados m�s de un nombre de dominio o viceversa.", "Falso, es el servicio DHCP quien realiza este trabajo.", "3");
            /*08*/      tipo_test("El protocolo que permite consultar los correos electr�nicos directamente en el\n        servidor sin necesidad de descargarlos es:", "IMAP.", "POP3.", "SMTP.", "FTP.", "1");
            /*09*/      tipo_test("�Cu�l es el puerto que utiliza el protocolo HTTP?", "21.", "20.", "76.", "80.", "4");
            /*10*/      tipo_test("El servicio de ficheros:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios podremos obtener ficheros en funci�n de su contenido.", "2");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La forma de transmitir informaci�n en una conexi�n con Sockets TCP ser� en:", "Bits.", "Bytes.", "Datagramas.", "Paquetes.", "2");
            /*02*/      tipo_test("El m�todo readUTF() nos permitir�:", "Enviar mensajes a trav�s de un Socket.", "Recibir mensajes a trav�s de un Socket.", "Enviar y recibir mensajes a trav�s de un Socket.", "Este m�todo no permite realizar ninguna acci�n con Sockets.", "2");
            /*03*/      tipo_test("�Por qu� hacemos un bucle infinito en el servidor?", "No se har� ning�n bucle infinito.", "Para esperar constantemente peticiones de clientes.", "Porque tarda mucho en iniciar y as� aseguramos que no termina su hilo.", "Todas las opciones son correctas.", "2");
            /*04*/      tipo_test("La clase ServerSocket implementa:", "Un servidor TCP.", "Un cliente TCP.", "Un servidor UDP.", "Un cliente UDP.", "1");
            /*05*/      tipo_test("La clase Socket se utiliza para realizar conexiones:", "UDP.", "TCP.", "Para realizar conexiones tanto TCP como UDP.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*06*/      tipo_test("Las clases principales para poder crear servidores UDP son:", "DatagramPacket y DatagramSocket.", "Sockets y PacketDatagram.", "Datagram y Sockets.", "Datagram y PacketSocket.", "1");
            /*07*/      tipo_test("Los Sockets UDP son:", "M�s lentos que los TCP, pero m�s seguros.", "M�s r�pidos que los TCP, pero menos seguros.", "M�s r�pidos que los TCP y m�s seguros.", "M�s lentos que los TCP y menos seguros.", "2");
            /*08*/      tipo_test("El m�todo writeUTF() nos permitir�:", "Enviar mensajes a trav�s de un Socket.", "Recibir mensajes a trav�s de un Socket.", "Enviar y recibir mensajes a trav�s de un Socket.", "Este m�todo no permite realizar ninguna acci�n con Sockets.", "1");
            /*09*/      tipo_test("�Qu� hace el m�todo getPort()?", "Devuelve el puerto de env�o/recepci�n del paquete.", "Devuelve el puerto de donde procede el Socket.", "Devuelve la direcci�n del host remoto de env�o/recepci�n.", "Depende de la clase.", "4");
            /*10*/      tipo_test("�Con qu� tipo de Socket deber�amos empezar a trabajar?", "Con UDP.", "Con TCP.", "Con cualquiera de ellos.", "Con el m�s r�pido.", "2");                       
                    }
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La clase URLConection:", "Esta es la clase que nos va a permitir operar con los valores devueltos por las consultas\n    FTP del servidor.", "Esta clase es la que nos va a permitir realizar operaciones con la direcci�n web que\n    hemos creado mediante URL. Podremos lanzar operaciones tipo GET y obtener las\n    respuestas de estas de una forma muy sencilla.", "Esta clase nos va a permitir realizar las configuraciones oportunas de los clientes FTP\n    de una forma sencilla.", "Esta clase nos va a permitir representar una direcci�n de una p�gina web, por ejemplo,\n    https://www.google.es.", "2");
            /*02*/      tipo_test("�Cu�l de las siguientes excepciones no es lanzada cuando realizamos operaciones FTP?", "SocketException.", "IndexOfBoundException.", "IOException.", "Ninguna de las anteriores excepciones se lanza.", "2");
            /*03*/      tipo_test("Las hebras que atienden de forma concurrente a los clientes se ejecutan en:", "El cliente.", "El servidor.", "Se deber� ejecutar una hebra tanto en el cliente como en el servidor.", "Cuando usamos sockets no podemos usar hebras, ya que son incompatibles entre si.", "2");
            /*04*/      tipo_test("El tiempo de respuesta del servidor:", "Nos indica lo que tarda en arrancar el servidor.", "Nos indica lo que tarda en arranca el cliente.", "Nos indica lo que tardan en arrancar el cliente y el servidor.", "Nos indica lo que tarda en ejecutar el servicio la aplicaci�n.", "4");
            /*05*/      tipo_test("La clase FTP:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "3");
            /*06*/      tipo_test("La biblioteca para enviar correos electr�nicos en Java es:", "javax.mail.", "java.mail.", "javax.email.", "java.email.", "1");
            /*07*/      tipo_test("�A cu�ntos clientes podremos dar servicio en una aplicaci�n cliente/servidor\n        concurrente?", "Como m�ximo a 10 a la vez.", "Deberemos atender a los clientes de uno en uno en orden de llegada.", "Podremos dar servicio a todos los clientes que queramos al mismo tiempo.", "Podremos dar servicio a todos los clientes que queramos al mismo tiempo,\n    pero es conveniente establecer un m�ximo.", "4");
            /*08*/      tipo_test("La clase FTPSClient:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "2");
            /*09*/      tipo_test("Para monitorizar el tiempo de respuesta del servidor:", "Basta con controlar el tiempo de proceso del servidor.", "Solo interesa realizar esta tarea si hay sobrecarga.", "Solo depende del tiempo de transmisi�n.", "Se debe tener en cuenta el tiempo de proceso del servidor y el tiempo de transmisi�n.", "4");
            /*10*/      tipo_test("La clase URL:", "Esta es la clase que nos va a permitir operar con los valores devueltos por las consultas\n    FTP del servidor.", "Esta clase es la que nos va a permitir realizar operaciones con la direcci�n web que\n    hemos creado mediante URL. Podremos lanzar operaciones tipo GET y obtener las\n    respuestas de estas de una forma muy sencilla.", "Esta clase nos va a permitir realizar las configuraciones oportunas de los clientes FTP\n    de una forma sencilla.", "Esta clase nos va a permitir representar una direcci�n de una p�gina web, por ejemplo,\n    https://www.google.es.", "4");                       
                    }
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Sobre los servicios web:", "No deben poder localizarse.", "Deben ser accesibles a trav�s de la web.", "Act�an como un sistema completo.", "Ninguna de las respuestas es cierta.", "2");
            /*02*/      tipo_test("La organizaci�n JPC:", "Es una organizaci�n con �nimo de lucro.", "Es una organizaci�n sin �nimo de lucro.", "Fue la que ide� el est�ndar JSP.", "Trabaja con las versiones de Java.", "4");
            /*03*/      tipo_test("El est�ndar XML lo propuso:", "W3C.", "OASIS.", "JPC.", "Google.", "1");
            /*04*/      tipo_test("�Qu� es OASIS?", "Una organizaci�n sin fines de lucro.", "Han producido una serie de normas para la arquitectura orientada a servicios.", "Una organizaci�n que impulsa la adopci�n de est�ndares para los servicios web.", "Todas las respuestas son correctas.", "4");
            /*05*/      tipo_test("Para la creaci�n de un web service en Java:", "Debemos crear solo una aplicaci�n que se ejecute en el servidor.", "Debemos crear un servicio de servidor, y seg�n el navegador se ejecutar� o no.", "Debemos crear la aplicaci�n servidor y la aplicaci�n cliente que use dicho servicio.", "Ninguna de las respuestas es correcta.", "3");
            /*06*/      tipo_test("�Cu�l de las siguientes es una arquitectura orientada a objetos?", "Arquitectura Orientada a Servicios Tradicional.", "Arquitectura Orientada a Servicios Convencional.", "Arquitectura Orientada a Servicios Miltihilo.", "Arquitectura Orientada a Servicios de tercera generaci�n.", "1");
            /*07*/      tipo_test("La arquitectura SOA es una tecnolog�a que nos permite el dise�o de aplicaciones:", "Bas�ndose en un servicio determinado.", "Bas�ndose en peticiones a un servicio.", "Bas�ndose en la plataforma del cliente.", "Bas�ndose en el tr�fico de red que haya en el momento.", "2");
            /*08*/      tipo_test("�Cu�l de las siguientes no es una caracter�stica de un servicio web?", "Interoperabilidad.", "Independencia de la plataforma.", "Dependencia del navegador.", "Son componentes independientes que se pueden integrar.", "3");
            /*09*/      tipo_test("�Los Web Services permiten que distintos softwares se comuniquen entre s�?", "No.", "Si pero no funcionan con todos los navegadores.", "Si.", "S�lo si se ejecutan en la misma red.", "3");
            /*10*/      tipo_test("La organizaci�n OASIS:", "Es una organizaci�n con �nimo de lucro.", "Es una organizaci�n sin �nimo de lucro.", "Fue la que ide� el est�ndar JSP.", "Trabaja con las versiones de Java.", "2");                        
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
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
