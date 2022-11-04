package ProgramacionServiciosProcesos;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */
public class Test_ProgramacionServiciosProcesos {
    
    public static void main(String[] args) {
        
                String menu="";
                
        do {
            Principal.setFallos(0);
            Principal.setAciertos(0);
            Principal.setContador(0);
            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ************************************************************************
        *  TEST PROGRAMACIÓN DE SERVICIOS Y PROCESOS                           *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: TIPOS DE PROGRAMACIÓN                                      *
        *  2. TEMA: PROCESOS                                                   *
        *  3. TEMA: GESTIÓN DE PROCESOS                                        *
        *  4. TEMA: INTRODUCCIÓN A LA PROGRAMACIÓN PARALELA O MULTIHILO        *
        *  5. TEMA: GESTIÓN DE HILOS                                           *
        *  6. TEMA:                                                            *
        *  7. TEMA:                                                            *
        *  8. TEMA:                                                            *
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
        *  0. ATRÁS.                                                           *
        ************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {                        
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                    case "7" -> {
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
                    case "8" -> {
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
                    case "9" -> {
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
                    
                    case "0" -> {}
                    default -> System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
