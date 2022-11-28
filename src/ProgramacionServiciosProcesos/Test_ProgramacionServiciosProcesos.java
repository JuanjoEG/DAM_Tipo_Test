package ProgramacionServiciosProcesos;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Test_ProgramacionServiciosProcesos {
    
    public static void main(String[] args) {
        
        _Main_.Principal.setAsignatura("PROGRAMACI�N DE SERVICIOS Y PROCESOS");
        
                String menu="";
                
        do {
            Principal.setFallos(0);
            Principal.setAciertos(0);
            Principal.setContador(0);
            Principal.setEn_blanco(0);
            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ************************************************************************
        *  TEST PROGRAMACI�N DE SERVICIOS Y PROCESOS                           *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: TIPOS DE PROGRAMACI�N.                                     *
        *  2. TEMA: PROCESOS.                                                  *
        *  3. TEMA: GESTI�N DE PROCESOS.                                       *
        *  4. TEMA: INTRODUCCI�N A LA PROGRAMACI�N PARALELA O MULTIHILO.       *
        *  5. TEMA: GESTI�N DE HILOS.                                          *
        *  6. TEMA: SINCRONIZACI�N DE VARIOS HILOS.                            *
        *  7. TEMA: INTRODUCCI�N A LA COMUNICACI�N ENTRE APLICACIONES.         *
        *  8. TEMA: MODELOS DE COMUNICACIONES.                                 *
        *  9. TEMA:                                                            *
        * 10. TEMA:                                                            *
        * 11. TEMA:                                                            *
        * 12. TEMA:                                                            *
        * 13. TEMA:                                                            *
        * 14. TEMA:                                                            *
        * 15. TEMA:                                                            *
        *                                                                      *
        * 40. TEST DE REPASO I                                                 *
        * 50. TEST DE REPASO II                                                *
        *                                                                      *
        ************************************************************************
        *  0. ATR�S.                                                           *
        ************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                    case "13" -> {
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("El protocolo TCP ...", "Tambi�n se conoce como modelo TCP/IP.", "Crea un flujo de transmisi�n de datos entre origen y destino, partiendo el mensaje que\n    se quiere enviar en paquetes, y envi�ndolo por el canal de comunicaci�n.", "Es el Protocolo Central de Transmisi�n.", "Las dem�s respuestas son incorrectas.", "2");
            /*02*/      tipo_test("Para finalizar un proceso, debemos llamar al m�todo:", "Destroy.", "Delete.", "End.", "Stop.", "1");
            /*03*/      tipo_test("Cuando se produce un cambio de contexto, el sistema operativo debe guardar ...", "Estado en que se encontraba el proceso, y estado del procesador.", "Informaci�n de gesti�n de memoria.", "Contador de programa y puntero de pila.", "Todas las respuestas son correctas.", "4");
            /*04*/      tipo_test("En el contexto de la ejecuci�n de procesos, un hilo ...", "Se puede ejecutar por s� solo.", "No puede existir de forma independiente a un proceso.", "Tiene el inconveniente de que no puede compartir recursos con el proceso ni con otros hilos.", "Tiene la ventaja de que est� soportado por todos los lenguajes de programaci�n.", "2");
            /*05*/      tipo_test("La programaci�n paralela ...", "Tambi�n se conoce como multitarea, multihilo, multihebra o multithreading.", "Puede consistir en la ejecuci�n de un proceso con varios hilos.", "Puede consistir en la ejecuci�n de varios procesos, cada uno de ellos con uno o varios hilos.", "Todas las respuestas son correctas.", "4");
            /*06*/      tipo_test("Si tenemos una situaci�n en la que diferentes hilos tienen una visi�n diferente de un\n        mismo dato, tenemos un problema de:", "Condici�n de carrera.", "Inanici�n.", "Inconsistencia de memoria.", "Interbloqueo o Deadlock.", "3");
            /*07*/      tipo_test("La capa encargada de manejar la topolog�a de la red y las conexiones del ordenador es:", "La capa f�sica.", "La capa de red.", "La capa de sesi�n.", "La capa de aplicaci�n.", "1");
            /*08*/      tipo_test("Toda la informaci�n, tanto c�digo como datos, almacenada en disco y que nos\n        resolver� un problema concreto es ...", "Una aplicaci�n.", "Un programa.", "Un proceso.", "Un servicio.", "2");
            /*09*/      tipo_test("�Cu�l de los siguientes algoritmos no va a sufrir inanici�n?", "Primero en llegar (FCFS o FIFO).", "Prioridad al m�s corto.", "Planificaci�n por prioridad.", "Prioridad al m�s largo.", "1");
            /*10*/      tipo_test("Cuando un proceso tiene todo lo que necesita para ejecutarse y est� esperando a que\n        el planificador del sistema operativo lo seleccione para entrar en ejecuci�n, dicho\n        proceso est� en estado ...", "Bloqueado / En espera.", "En ejecuci�n.", "Listo.", "Nuevo.", "3");
            
            /*11*/      tipo_test("�Qu� m�todos tienen los sem�foros?", "acquire() para cerrar la secci�n cr�tica y release() para abrir la secci�n cr�tica.", "wait() para cerrar la secci�n cr�tica y release() para abrir la secci�n cr�tica.", "acquire() para cerrar la secci�n cr�tica y open() para abrir la secci�n cr�tica.", "wait() para cerrar la secci�n cr�tica y open() para abrir la secci�n cr�tica.", "1");
            /*12*/      tipo_test("Para programar monitores podemos usar ...", "Synchronized.", "M�todo wait().", "M�todo notify().", "Todas las respuestas son correctas.", "4");
            /*13*/      tipo_test("�Cu�l es la diferencia entre utilizar Thread o Runnable para crear hilos en Java?", "No existe ninguna diferencia.", "Thread consume m�s recursos.", "Runnable es m�s r�pido.", "Si necesitamos hacer que una clase que ya hereda de otra sea un hebra, al no soportar\n    Java la herencia m�ltiple, no podemos hacerlo a trav�s de Thread, sino que hay que\n    hacerlo a trav�s de la interfaz Runnable.", "4");
            /*14*/      tipo_test("La programaci�n paralela:", "Se centra en microprocesadores multin�cleo.", "Se centra en microprocesadores monon�cleo.", "Se centra tanto en microprocesadores multin�cleo como monon�cleo.", "Se centra en una red de computadores interconectados entre s�.", "1");
            /*15*/      tipo_test("Del estado Listo podemos pasar al estado:", "Nuevo.", "Terminado.", "En ejecuci�n.", "Bloqueado.", "3");
            /*16*/      tipo_test("Si en Java queremos hacer que un trozo de c�digo sea seguro para que lo puedan\n        utilizar varios procesos:", "Deberemos hacer que cada proceso se ejecute en orden.", "Deberemos poner la palabra synchronized y dentro el trozo de c�digo.", "Deberemos poner la palabra sync y dentro el trozo de c�digo.", "Deberemos poner la palabra syncronized y fuera el trozo de c�digo.", "2");
            /*17*/      tipo_test("�Cu�l de los siguientes no es un estado en el que puede estar un hilo?", "Preparado.", "Bloqueado.", "Terminado.", "Planificado.", "4");
            /*18*/      tipo_test("�Qu� m�todo usamos para bloquear un hilo en ejecuci�n?", "sleep.", "wait.", "join.", "interrupt.", "2");
            /*19*/      tipo_test("El m�todo release de los sem�foros:", "Permite adquirir todos los hilos que permitamos acceder a la secci�n cr�tica.", "Nos va a permitir cerrar la secci�n cr�tica y que ning�n otro hilo pueda acceder a ella.", "Nos va a permitir abrir la secci�n cr�tica y que otro hilo pueda acceder a ella.", "Nos va a permitir liberar los recursos del sem�foro.", "3");
            /*20*/      tipo_test("El protocolo NFS:", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Este protocolo es el encargado de efectuar las transferencias de ficheros.", "Este protocolo es el que va a permitir que podamos compartir ficheros en diferentes\n    ordenadores de una red.", "Este protocolo es el que va a permitir que sea posible la conexi�n remota de terminales.", "3");
            
            /*21*/      tipo_test("Dentro de la clase Thread, para empezar a ejecutar un hilo de forma paralela,\n        utilizaremos el m�todo:", "new()", "start()", "run()", "exec()", "3");
            /*22*/      tipo_test("Para conseguir que un hilo est� bloqueado durante una cantidad de tiempo\n        determinada, usaremos ...", "sleep()", "wait()", "stop()", "destroy()", "1");
            /*23*/      tipo_test("A la hora de establecer comunicaciones entre los procesos, si queremos redireccionar\n        a la entrada/salida est�ndar, deberemos utilizar ...", "OutputStream", "InputStream", "ErrorStream", "Redirect.INHERIT", "4");
            /*24*/      tipo_test("Si tenemos un �nico procesador, podremos realizar tareas de programaci�n\n        concurrente en ...", "Solo en multiprogramaci�n, pero no en multitarea.", "Solo en multitarea, pero no en multiprogramaci�n.", "Tanto en multiprogramaci�n como en multitarea.", "�nicamente en programaci�n paralela.", "3");
            /*25*/      tipo_test("A la hora de crear hilos que se ejecutan concurrentemente, con el m�todo join() ...", "Podemos unir la ejecuci�n de hilos diferentes.", "Podemos hacer que una acci�n espere a que un hilo acabe.", "Unimos los flujos de entrada y de salida de los hilos.", "Conseguimos que todos los hilos terminen a la vez.", "2");
            /*26*/      tipo_test("Si tenemos una situaci�n en la que a un hilo se le deniega continuamente el acceso a\n        un recurso compartido porque otros hilos toman el control antes que �l, tenemos un\n        problema de:", "Condici�n de carrera", "Inanici�n", "Inconsistencia de memoria", "Interbloqueo o Deadlock", "2");
            /*27*/      tipo_test("La capa encargada de manejar la topolog�a de la red y las conexiones del ordenador es:", "La capa f�sica.", "La capa de red.", "La capa de sesi�n.", "La capa de aplicaci�n.", "1");
            /*28*/      tipo_test("Un sin�nimo de programaci�n paralela es:", "Multithreading.", "Escalonada.", "De varios n�cleos de ejecuci�n.", "Todas las respuestas son correctas.", "1");
            /*29*/      tipo_test("Los procesos interactivos:", "Este tipo de procesos est�n formados por una serie de tareas a realizar\n    de las que e usuario que las ejecuta �nicamente est� interesado en su resultado final,\n    no en su ejecuci�n.", "En este tipo de procesos va a haber una interacci�n del usuario y del propio proceso,\n    pudiendo este pedir al usuario datos necesarios para su ejecuci�n.", "Este tipo de procesos son ciertas tareas en las que el tiempo de respuesta\n    por parte del sistema es cr�tico.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*30*/      tipo_test("Si intento ejecutar el proceso notepad.exe en un sistema operativo GNU/Linux:", "Dar� fallo, ya que no es un ejecutable compatible con el sistema operativo.", "Se ejecutar�, pero se abrir� el bloc de notas de GNU/Linux.", "Dara fallo, pero nos preguntar� si queremos lanzar el bloc de notas de GNU/Linux.", "Se ejecutar� sin ning�n problema.", "1");
            
            /*31*/      tipo_test("Se�ala la afirmaci�n correcta sobre los hilos:", "Los hilos dependen de un proceso para ejecutarse.", "Los hilos seguir�n en ejecuci�n, aunque su proceso padre finalice.", "Los hilos son independientes y tienen espacios de memoria diferentes.", "Dentro de un mismo proceso no pueden existir varios hilos ejecut�ndose.", "1");
            /*32*/      tipo_test("�Qu� m�todo usamos para parar un hilo una cantidad determinada de milisegundos?", "sleep", "wait", "join", "detach", "3");
            /*33*/      tipo_test("A una clase que tiene un m�todo con el modificador synchronized la llamamos:", "Sincronizada.", "Monitor.", "Abstracta.", "Excluyente.", "2");
            /*34*/      tipo_test("El protocolo FTP:", "Este protocolo posibilita la transferencia de ficheros.", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Este protocolo es el que va a permitir que podamos compartir ficheros en diferentes\n    ordenadores de una red.", "Este protocolo es el encargado de definir la manera en la que se gestiona el correo\n    electr�nico.", "1");
            /*35*/      tipo_test("La programaci�n concurrente:", "Es un tipo de programaci�n que solo se puede ejecutar en procesadores de un n�cleo.", "Es un tipo de programaci�n estructurada.", "Proporciona mecanismos de comunicaci�n y sincronizaci�n entre procesos que se\n    ejecutan de forma simult�nea.", "Ninguna de las respuestas anteriores es correcta.", "3");
            /*36*/      tipo_test("�En qu� estado se encuentra la hebra despu�s de invocar el m�todo start(), si el\n        planificador no la ha seleccionado para que sea el subproceso en ejecuci�n?", "Ejecuci�n.", "Preparado.", "Terminado.", "Bloqueado.", "2");
            /*37*/      tipo_test("�Cu�l de las siguientes formas no es correcta para definir una clase como hilo?", "extends Thread.", "extends Runnable.", "implemens Runnable.", "Todas las opciones anteriores son correctas.", "2");
            /*38*/      tipo_test("�Cu�l de las siguientes capas no pertenece al modelo OSI?", "Capa de transporte.", "Capa de Internet.", "Capa f�sica.", "Capa de sesi�n.", "2");
            /*39*/      tipo_test("La programaci�n concurrente:", "Es un tipo de programaci�n que solo se puede ejecutar en procesadores de un n�cleo.", "Es un tipo de programaci�n estructurada.", "Proporciona mecanismos de comunicaci�n y sincronizaci�n entre procesos que se\n    ejecutan de forma simult�nea.", "Ninguna de las respuestas anteriores es correcta.", "3");
            /*40*/      tipo_test("Para pasar al estado bloqueado:", "El planificador del sistema operativo ser� el encargado de llevarnos a este estado.", "El proceso tendr� que terminar.", "El proceso recibe un recurso que necesita.", "El proceso pide un recurso que necesita.", "4");  
            
            /*41*/      tipo_test("Para lanzar un proceso tendremos que indicar:", "El sistema operativo en el que estamos trabajando.", "La ruta del ejecutable del proceso.", "Si lo queremos ejecutar en primer o segundo plano.", "La ruta del ejecutable del proceso y sus par�metros.", "4");
            /*42*/      tipo_test("�Qu� m�todo se utiliza para iniciar la ejecuci�n de una hebra?", "start().", "run().", "stop().", "suspend().", "4");
            /*43*/      tipo_test("�Cu�l de las siguientes prioridades es correcta?", "Thread.MAX_PRIORITY.", "11", "3", "Thread.NORMAL_PRIORITY.", "1");
            /*44*/      tipo_test("�Qu� protocolo es el que se usa en aplicaciones de transmisi�n de voz?", "TCP.", "UDP.", "Ambos son adecuados para este tipo de aplicaci�n.", "Se utiliza una mezcla de ambos.", "2");
            /*45*/      tipo_test("Los supercomputadores:", "Son sistemas computacionales muy potentes y que se utilizan para tareas que\n    necesitan una enorme capacidad de c�lculo.", "Son sistemas donde podremos tener varios recursos, por ejemplo, espacio en disco.", "En este tipo de computaci�n distribuida van a poder usarse ordenadores muy\n    potentes conectados en red entre s�.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*46*/      tipo_test("�A qu� estado no podemos pasar si estamos en el estado En ejecuci�n?", "Terminado.", "Nuevo.", "Bloqueado.", "Listo.", "2");
            /*47*/      tipo_test("�Cu�l de los siguientes comandos permite ejecutar un proceso?", "ProcessBuilder.start().", "Runtime.exec().", "Ambas respuestas son correctas.", "Ambas respuestas son incorrectas.", "3");
            /*48*/      tipo_test("Si un hilo necesita un dato introducido por el usuario, �a qu� estado pasar�?", "Nuevo.", "Bloqueado.", "Preparado.", "En ejecuci�n.", "2");
            /*49*/      tipo_test("�Qu� bloques de c�digo nos interesar� m�s marcar como synchronized?", "Los bloques que tengan variables normales.", "Los bloques que tengan variables de la secci�n cr�tica.", "Nos interesar� marcar todo el c�digo como synchronized.", "Los constructores de las clases monitores.", "2");
            /*50*/      tipo_test("En el modelo TCP/IP la capa que est� compuesta por aplicaciones de red es:", "Capa de red.", "Capa de aplicaci�n.", "Capa de Internet.", "Capa de transporte.", "2");
            
            /*51*/      tipo_test("Si tenemos una situaci�n en la que cuando a un hilo se deniega continuamente el\n        acceso a un recurso compartido al que quiere tener acceso porque otros hilos toman\n        el control antes que �l, tenemos un problema de:", "Inacici�n.", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "1");
            /*52*/      tipo_test("Para crear un proceso en Java, debemos utilizar el siguiente m�todo:", "ProcessBuilder.start().", "ProcessBuilder.exec().", "ProcessBuilder.run().", "Las dem�s respuestas son incorrectas.", "1");
            /*53*/      tipo_test("Si un proceso est� en el estado de \"En ejecuci�n\" y solicita una operaci�n de\n        entrada/salida:", "Pasar� el estado \"Listo\".", "Pasar� al estado \"Bloqueado\". ", "Seguir� en ejecuci�n.", "Terminar�.", "2");
            /*54*/      tipo_test("El fujo OutputStream:", "Ser� el flujo de entrada. Est� conectado a la entrada est�ndar del proceso hijo.", "Ser� el flujo de salida. Est� conectado a la salida est�ndar del proceso hijo.", "Ser� el flujo de salida para los errores. Est� conectado a la salida est�ndar de errores del proceso hijo.", "Ninguna de las respuestas es correcta.", "2");
            /*55*/      tipo_test("Si queremos hacer que un hilo se bloquee durante 5 segundos y medio deberemos\n        llamar al m�todo:", "sleep(5.5).", "sleep(550).", "sleep(5500).", "sleep(55000).", "3");
            /*56*/      tipo_test("Si tenemos una situaci�n en la que tenemos dos hilos que est�n cambiando\n        continuamente de estado y terminan por bloquearse mutuamente, tenemos un\n        problema de:", "Inacici�n.", "Interbloqueo.", "Bloqueo activo.", "Inconsistencia de memoria.", "3");
            /*57*/      tipo_test("Un cl�ster es:", "Varios ordenadores interconectados en red.", "Varios ordenadores interconectados en red y que funcionan como uno solo.", "La uni�n de todas las piezas que forman un ordenador.", "Varios ordenadores interconectados en red que no comparten ning�n recurso.", "2");
            /*58*/      tipo_test("Los procesos por lotes:", "Este tipo de procesos est�n formados por una serie de tareas a realizar de las que el usuario\n    que las ejecuta �nicamente est� interesado en su resultado final, no en su ejecuci�n.", "En este tipo de procesos va a haber una interacci�n del usuario y del propio proceso,\n    pudiendo este pedir al usuario datos necesarios para su ejecuci�n.", "Este tipo de procesos son ciertas tareas en las que el tiempo de respuesta por parte\n    del sistema es cr�tico.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*59*/      tipo_test("�Qu� significan las siglas del protocolo TCP?", "Protocolo de Conteo de Transmisi�n.", "Protocolo de Control de Transmisi�n.", "Protocolo de Control de Paquetes.", "Protocolo de Conteo de Paquetes.", "2");
            /*60*/      tipo_test("La programaci�n distribuida:", "Se centra en microprocesadores multin�cleo.", "Se centra en microprocesadores monon�cleo.", "Se centra tanto en microprocesadores multin�cleo como monon�cleo.", "Se centra en una red de computadores interconectados entre s�.", "4");
            
            /*61*/      tipo_test("Indica cu�l de las siguientes respuestas es falsa:", "Los procesos son independientes y tienen su propio espacio de memoria asignado.", "El sistema operativo se refiere a los procesos que gestiona mediante su PID.", "Dos procesos diferentes pueden tener el mismo PID.", "El algoritmo FIFO no puede sufrir inanici�n.", "3");
            /*62*/      tipo_test("El fujo InputStream:", "Ser� el flujo de entrada. Est� conectado a la entrada est�ndar del proceso hijo.", "Ser� el flujo de salida. Est� conectado a la salida est�ndar del proceso hijo.", "Ser� el flujo de salida para los errores. Est� conectado a la salida est�ndar de errores del\n    proceso hijo.", "Ninguna de las respuestas es correcta.", "1");
            /*63*/      tipo_test("El m�todo acquire de los sem�foros:", "Permite adquirir todos los hilos que permitamos acceder a la secci�n cr�tica.", "Nos va a permitir cerrar la secci�n cr�tica y que ning�n otro hilo pueda acceder a ella.", "Nos va a permitir abrir la secci�n cr�tica y que otro hilo pueda acceder a ella.", "Nos va a permitir liberar los recursos del sem�foro.", "2");
            /*64*/      tipo_test("El sistema operativo es el encargado de ...", "Poner en ejecuci�n los procesos.", "Gestionar los procesos.", "Poner en ejecuci�n y gestionar los procesos bloqueados.", "Poner en ejecuci�n y gestionar los procesos.", "4");
            /*65*/      tipo_test("El fujo ErrorStream:", "Ser� el flujo de entrada. Est� conectado a la entrada est�ndar del proceso hijo.", "Ser� el flujo de salida. Est� conectado a la salida est�ndar del proceso hijo.", "Ser� el flujo de salida para los errores. Est� conectado a la salida est�ndar de errores del\n    proceso hijo.", "Ninguna de las respuestas es correcta.", "3");
            /*66*/      tipo_test("Los hilos est�n compuestos de:", "Un identificador �nico, registros de salto y pila.", "Un identificador �nico, contador de programa, registros asociados y pila.", "Un identificador �nico, registros asociados y pila.", "Un identificador �nico, contador de pila y registros.", "2");
            /*67*/      tipo_test("�Qu� m�todo deberemos usar si queremos que cuando todos los hilos tengan la\n        misma prioridad se ejecuten de manera equilibrada?", "wait.", "notifyAll.", "yield.", "join.", "3");
            /*68*/      tipo_test("El protocolo HTTP:", "Este protocolo es el encargado de definir la manera en la que se van a comunicar los\n    servidores y navegadores web.", "Este protocolo es el encargado de definir la manera en la que se gestiona el correo\n    electr�nico.", "Este protocolo es el encargado de traducir a direcciones IP los nombres de los\n    dispositivos que se encuentra en la red.", "Ninguna de las respuestas es correcta.", "1");
            /*69*/      //tipo_test("", "", "", "", "", "");
            /*70*/      //tipo_test("", "", "", "", "", "");
            
            /*71*/      //tipo_test("", "", "", "", "", "");
            /*72*/      //tipo_test("", "", "", "", "", "");
            /*73*/      //tipo_test("", "", "", "", "", "");
            /*74*/      //tipo_test("", "", "", "", "", "");
            /*75*/      //tipo_test("", "", "", "", "", "");
            /*76*/      //tipo_test("", "", "", "", "", "");
            /*77*/      //tipo_test("", "", "", "", "", "");
            /*78*/      //tipo_test("", "", "", "", "", "");
            /*79*/      //tipo_test("", "", "", "", "", "");
            /*80*/      //tipo_test("", "", "", "", "", "");
            
            /*81*/      //tipo_test("", "", "", "", "", "");
            /*82*/      //tipo_test("", "", "", "", "", "");
            /*83*/      //tipo_test("", "", "", "", "", "");
            /*84*/      //tipo_test("", "", "", "", "", "");
            /*85*/      //tipo_test("", "", "", "", "", "");
            /*86*/      //tipo_test("", "", "", "", "", "");
            /*87*/      //tipo_test("", "", "", "", "", "");
            /*88*/      //tipo_test("", "", "", "", "", "");
            /*89*/      //tipo_test("", "", "", "", "", "");
            /*90*/      //tipo_test("", "", "", "", "", "");
            
            /*91*/      //tipo_test("", "", "", "", "", "");
            /*92*/      //tipo_test("", "", "", "", "", "");
            /*93*/      //tipo_test("", "", "", "", "", "");
            /*94*/      //tipo_test("", "", "", "", "", "");
            /*95*/      //tipo_test("", "", "", "", "", "");
            /*96*/      //tipo_test("", "", "", "", "", "");
            /*97*/      //tipo_test("", "", "", "", "", "");
            /*98*/      //tipo_test("", "", "", "", "", "");
            /*99*/      //tipo_test("", "", "", "", "", "");
           /*100*/      //tipo_test("", "", "", "", "", "");
           
           /*101*/      //tipo_test("", "", "", "", "", "");
                    }
                    case "0" -> {}
                    default -> System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
