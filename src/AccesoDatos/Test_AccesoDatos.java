package AccesoDatos;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */
public class Test_AccesoDatos {
    
        public static void main(String[] args) {
        
                String menu="";
        do {
            Principal.setFallos(0);
            Principal.setAciertos(0);
            Principal.setContador(0);
            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ************************************************************************
        *  TEST ACCESO A DATOS                                                 *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: INTRODUCCIÓN AL MANEJO DE FICHEROS                         *
        *  2. TEMA: FLUJOS                                                     *
        *  3. TEMA: TRABAJO CON FICHEROS XML                                   *
        *  4. TEMA: MANEJO DE CONECTORES I                                     *
        *  5. TEMA: MANEJO DE CONECTORES II                                    *
        *  6. TEMA: MANEJO DE CONECTORES III: SENTENCIAS                       *
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
        
            /*01*/      tipo_test("La librería Java que se usará para la gestión de archivos, lectura, escritura y más\n        funcionalidades es:", "Java.io", "Io.java", "Lio.java", "Java.tio", "1");
            /*02*/      tipo_test("Un fichero genérico está compuesto por ...", "Nombre.", "Tipo de fichero.", "Nombre y extensión.", "Nombre y acceso.", "3");
            /*03*/      tipo_test("Usaremos el método mkdirs() de la Clase File ...", "Para crear un fichero nuevo.", "Para indicar dirección de búsqueda de fichero.", "Para crear un nuevo directorio.", "Para eliminar un fichero.", "3");
            /*04*/      tipo_test("¿Qué nos devuelve el método getParent()?", "Devuelve el fichero anterior.", "No devuelve es de tipo void().", "Devuelve el directorio superior.", "Devuelve el nombre del fichero.", "3");
            /*05*/      tipo_test("¿Qué formas de acceso a ficheros existen?", "Modo de acceso secuencial.", "Modo de acceso secuencial y aleatorio.", "Modo de acceso secuencial y de caracteres.", "Modo de acceso a caracteres.", "2");
            /*06*/      tipo_test("Usaremos la Clase FileWriter para ...", "Escribir en ficheros que estén basados en la escritura con caracteres.", "Acceder de forma aleatoria a un fichero.", "Escribir de forma aleatoria a un fichero.", "Todas son correctas.", "1");
            /*07*/      tipo_test("El método read() de FileInputStream ...", "Devuelve el contenido de todo el fichero.", "Devuelve el primer Byte representado en número entero.", "No devuelve nada.", "Ninguna es correcta.", "2");
            /*08*/      tipo_test("En la clase RandomAccessFile el modo de acceso \"r\" ...", "Hace referencia al modo escritura.", "Hace referencia al modo lectura.", "Hace referencia al modo lectura escritura.", "Todas con correctas.", "2");
            /*09*/      tipo_test("Aplicando el método close(), conseguiremos ...", "Finalizar nuestra aplicación.", "Bloquear nuestro fichero contra escritura.", "Cerrar la lectura del fichero.", "Cerrar el flujo de datos, liberando los recursos ocupados.", "4");
            /*10*/      tipo_test("Si quisiera saber el posicionamiento del puntero usando una clase\n        RandomAccessFile ...", "Usariamos el método seek().", "Usaríamos el método getFilePointer().", "Usaríamos el método read().", "Ninguna es correcta.", "2");                        
                    }
                    case "2" -> {
                        System.out.println("\nTEMA " + menu + "\n");
        
            /*01*/      tipo_test("Se podría definir un flujo o Stream como ...", "Un fichero de corta extensión.", "Una secuencia ordenada de información.", "Un método genérico.", "Una clase muy conocida.", "2");
            /*02*/      tipo_test("La clase PipedInputStream pertenece a ...", "El subconjunto de clases de Buffer", "El subconjunto de clases de tuberías.", "El subconjunto de clases de Arrays.", "Ninguna es correcta.", "2");
            /*03*/      tipo_test("La clase DataInputStream leerá ...", "Solo tipos de datos String.", "Tipos de datos String e Integer.", "Tipos de datos primitivos de java.", "Todas son correctas.", "3");
            /*04*/      tipo_test("Para instanciar un nuevo hilo de ejecución usaremos la clase ...", "FileInput", "FileOutput", "Stream", "Thread", "4");
            /*05*/      tipo_test("¿Qué conocido método devuelve el byte al stream de datos?", "Read()", "Unread()", "Re-read()", "Unreadeable()", "2");
            /*06*/      tipo_test("¿Que nos indica el método TT_EOF de la clase StreamTokenizer?", "Inicio del fichero", "Fin de línea.", "Fin del fichero.", "Error.", "3");
            /*07*/      tipo_test("¿Qué método nos indica que un token es de tipo palabra?", "TT_EOL", "TT_EOF", "TT_LOP", "TT_WORD", "4");
            /*08*/      tipo_test("La clase LineNumber reader tiene un método que nos indica la línea en la que estamos\n        posicionados leyendo. ¿De qué método hablamos?", "getLineNumber()", "getLine()", "getNumber()", "getMyLine()", "1");
            /*09*/      tipo_test("¿Qué método de la clase DataOutputStream se usa para escribir un objeto de tipo Long?", "Write()", "writeLong()", "writeNumber()", "Todas son correctas.", "2");
            /*10*/      tipo_test("¿Qué clase fue desarrollada para leer datos primitivos de Java?", "DataInputStream", "DataStream", "Data", "Date", "1");
                    }
                    case "3" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Una ventaja real del analizador DOM es ...", "Una vez introducido el fichero obtenemos el árbol con sus nodos.", "Velocidad de proceso.", "Velocidad de ejecución.", "Instanciación.", "1");
            /*02*/      tipo_test("El parser SAX es un analizador basado en ...", "Listas.", "Eventos.", "La edición.", "La escritura.", "2");
            /*03*/      tipo_test("¿Qué método es el encargado de cargar el fichero en memoria en los analizadores?", "El método unparse.", "El método load.", "El método parse.", "El metodo execute.", "3");
            /*04*/      tipo_test("¿Con cuál de los siguientes métodos obtendremos una lista de los nodos en XPATH?", "ShowNodes()", "Compile() y evaluate()", "Clear()", "Load()", "2");
            /*05*/      tipo_test("¿Qué tipo de excepción es notificada en tiempo de compilación?", "Excepción con chequeo.", "Excepción sin chequeo.", "Excepción con notificación.", "Excepción sin notificación.", "1");
            /*06*/      tipo_test("El método que nos devuelve la causa de la excepción en un objeto Throwable es ...", "getmessage()", "getString()", "toString()", "getCause()", "4");
            /*07*/      tipo_test("¿Qué sentencia usamos en las excepciones para identificarlas y tratarlas?", "Try/catch", "Throw", "Call", "Take", "1");
            /*08*/      tipo_test("Cuando usamos la palabra reservada \"Throws\" en la definición de un método ...", "Estamos lanzando la excepción a un nivel superior.", "Obviamos dicha excepción.", "Estaríamos tratando dicha excepción.", "Todas son falsas.", "1");
            /*09*/      tipo_test("Con la anotación @Before ...", "Ejecutamos dicho código después del test ejecutado.", "Ejecutamos algunos tests.", "Ejecutamos dicho código antes del test ejecutado.", "Todas son falsas.", "3");
            /*10*/      tipo_test("Un test unitario ...", "Es una pieza de código única por su valía.", "Es una pieza de código que valida otra parte de código.", "Es un código que se ejecuta en los entornos de integración.", "Todas son verdaderas.", "2");                       
                    }
                    case "4" -> {
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
            /*01*/      tipo_test("Al conjunto de clases y librerías que unen la parte del cliente con la base de datos lo\n        llamamos:", "Conector.", "Enlazador.", "Puerto.", "Sector.", "1");
            /*02*/      tipo_test("Definimos el desfase objeto-relacional a ...", "Al tiempo de conexión.", "Las dificultades que surgen cuando trabajamos con un aplicativo y una base de datos\n    relacional.", "Nombre de base de datos.", "Tipo de base de datos.", "2");
            /*03*/      tipo_test("Elige el protocolo de conexión más usado con bases de datos con lenguaje SQL.", "JDBC.", "LDAP.", "OBDC.", "ORACLE.", "1");
            /*04*/      tipo_test("¿Qué componente es el encargado de realizar la conexión entre nuestro aplicativo y el\n        driver apropiado JDBC?", "El T driver.", "El gestor JDBC.", "RJK driver.", "Java driver.", "2");
            /*05*/      tipo_test("¿Cuántos tipos de drivers JDBC existen?", "1", "3", "4", "8", "3");
            /*06*/      tipo_test("Antes de escribir el código necesario para gestionar la conexión desde Java hay que ...", "Compilar nuestro proyecto.", "Añadir nuestro fichero de driver (normalmente .jar) al classpath del proyecto.", "Ejecutar un comando para crear base de datos.", "Todas son falsas.", "2");
            /*07*/      tipo_test("Será la encargada de realizar la conexión con la base de datos ...", "La clase Connection.", "La clase DriverManager.", "La clase Exception.", "La clase Statement.", "1");
            /*08*/      tipo_test("¿A través de qué objeto podremos ejecutar el método executeQuery()?", "Connection", "Statement", "DriverManager", "Resulset", "2");
            /*09*/      tipo_test("En una variable de tipo ResulSet ...", "Podremos iniciar una conexión.", "Podremos almacenar los resultados de una consulta.", "Podremos ejecutar todo tipo de consultas.", "Todas con correctas.", "2");
            /*10*/      tipo_test("Gestionar los distintos drivers que tenemos en un aplicativo y presentarlos en la\n        misma capa para tener acceso a ellos es tarea de ...", "Statement", "Resulset", "Connection", "DriverManager", "4");                       
                    }
                    case "5" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Una base de datos embebida en disco almacena la información en:", "Memoria Ram.", "Disco duro.", "Procesador.", "Caché.", "2");
            /*02*/      tipo_test("Una base de datos en memoria almacena la información en:", "Memoria Ram.", "Disco duro.", "Lápiz de memoria.", "Todas son falsas.", "1");
            /*03*/      tipo_test("Una base de datos independiente:", "Usa la misma JVM de la aplicación.", "Está embebida en el aplicativo.", "Es menos potente que una embebida", "Todas son falsas.", "4");
            /*04*/      tipo_test("ObjectDB ...", "Más que una base de datos relacional es una base de datos orientada a objetos.", "Es relacional pura.", "Es independiente.", "Todas son falsas.", "1");
            /*05*/      tipo_test("Spring boot nos ayuda en:", "Despliegue de la aplicación entre otras cosas.", "Sintaxis.", "Variables de entorno.", "Todas son falsas.", "1");
            /*06*/      tipo_test("Uno de los objetivos clave de Spring boot en esta unidad es:", "Aprender los diferentes tipos de conectores", "Aprender a añadir las dependencias y embeber una base de datos.", "Aprender excepciones.", "Todas son verdaderas.", "2");
            /*07*/      tipo_test("Una de las principales ventajas de la web spring.io es:", "Podemos añadir las dependencias de forma transparente eligiéndolas en la misma web.", "Manejo de excepciones.", "Puedes elegir distintos conectores.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Con la clave: spring.datasource.username", "Accederemos a una table de base de datos.", "Indicaremos el nombre de usuario de acceso al panel de control.", "Accedemos al aplicativo.", "Todas son verdaderas.", "2");
            /*09*/      tipo_test("Si nos encontramos la siguiente clave en un fichero .properties:\n        spring.datasource.url=jdbc:h2:mem:testdb", "Podremos decir que la base de datos se almacenará en disco.", "Podremos decir que la base de datos se almacenará en memoria.", "No se almacenará nada.", "Todas con correctas.", "2");
            /*10*/      tipo_test("Las bases de datos cliente/servidor:", "Son embebidas", "Son independientes.", "Son bases de datos en memoria.", "Son bases de datos gestoras.", "2");                       
                    }
                    case "6" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("El comando que nos permite cambiar las condiciones generales de la base de datos\n        es ...", "ALTER TABLE", "ALTER DATABASE", "ALTER BASE", "ALTER INDEX", "2");
            /*02*/      tipo_test("El comando que nos permite cambiar las condiciones generales de una tabla de una\n        base de datos es ...", "ALTER TABLE", "ALTER DATABASE", "ALTER BASE", "ALTER INDEX", "1");
            /*03*/      tipo_test("Con el comando CREATE INDEX ...", "Crearemos un campo en una tabla.", "Modificaremos un campo de una tabla.", "Crearemos un índice para un campo específico.", "Todas son falsas.", "3");
            /*04*/      tipo_test("Necesitaremos tener el permiso DROP para ejecutar ...", "DROP TABLE", "CREATE INDEX", "ALTER TABLE", "ALTER DATABASE", "1");
            /*05*/      tipo_test("¿Con qué comando podremos renombrar una o más tablas?", "DROP TABLE", "RENAME TABLE", "DROP INDEX", "NAME TABLE", "2");
            /*06*/      tipo_test("Selecciona el comando por medio del cual eliminaremos filas en nuestra base de\n        datos", "DROP TABLE", "DELETE", "CLEAN", "INSERT", "2");
            /*07*/      tipo_test("Con el comando SELECT:", "Realizaremos una consulta de datos a base de datos.", "Seleccionaremos directamente una tabla.", "Seleccionaremos un campo.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Con la palabra clave FROM en SQL:", "Borraremos datos.", "Podremos asignar una o más tablas o vistas a la sentencia SELECT.", "Insertaremos datos.", "Todas son verdaderas.", "2");
            /*09*/      tipo_test("¿Qué clave usaremos para realizar comparaciones con los registros?", "DELETE", "INSERT", "ALTER", "LIKE", "4");
            /*10*/      tipo_test("¿Qué método es el que usaremos para realizer consultas con un objeto Statement?", "executeQuery()", "executeSelect()", "executeUpdate()", "Todas son verdaderas.", "1");                        
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
