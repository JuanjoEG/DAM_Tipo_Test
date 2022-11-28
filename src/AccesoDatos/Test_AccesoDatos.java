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
            
            _Main_.Principal.setAsignatura("ACCESO A DATOS");
        
                String menu="";
        do {
            Principal.setFallos(0);
            Principal.setAciertos(0);
            Principal.setContador(0);
            Principal.setEn_blanco(0);
            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ************************************************************************
        *  TEST ACCESO A DATOS                                                 *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: INTRODUCCIÓN AL MANEJO DE FICHEROS.                        *
        *  2. TEMA: FLUJOS.                                                    *
        *  3. TEMA: TRABAJO CON FICHEROS XML.                                  *
        *  4. TEMA: MANEJO DE CONECTORES I.                                    *
        *  5. TEMA: MANEJO DE CONECTORES II.                                   *
        *  6. TEMA: MANEJO DE CONECTORES III: SENTENCIAS.                      *
        *  7. TEMA: EL MAPEO OBJETO RELACIONAL.                                *
        *  8. TEMA: EXPLORACIÓN DEL MAPEO OBJETO-RELACIONAL.                   *
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
                        _Main_.Principal.setTema(menu);                        
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
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
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Un Framework que facilita el almacenamiento de los objetos a una base de datos\n        relacional es un ...", "Gestor de datos.", "ORM.", "ROM.", "Gestor relacional.", "2");
            /*02*/      tipo_test("Mejorar la eficiencia en el desarrollo ...", "Es una ventaja de usar un ORM.", "No debe influir a la hora de usar un ORM.", "Influye al usar depende qué tipo de base de datos relacional.", "Todas son falsas.", "1");
            /*03*/      tipo_test("EBEAN e IBATIS son ...", "Bases de datos que podemos elegir.", "Diferentes drivers de conexión.", "Distintas opciones de ORM del mercado.", "Todas son falsas.", "3");
            /*04*/      tipo_test("Nhibernate es ...", "La opción que disponemos del Framework Hibernate en lenguaje .Net.", "Una versión más potente de Hibernate.", "Una versión lite de Hibernate.", "Un Framework de control de seguridad.", "1");
            /*05*/      tipo_test("¿Qué características básicas podemos decir que tiene Hibernate?", "Sencillo y pesado.", "Simplicidad y robusto.", "Fácil de instalar y ligero.", "Todas son falsas.", "2");
            /*06*/      tipo_test("¿De qué principio Java hace uso el Framework Hibernate?", "Reflexión.", "Multiplataforma.", "Autoensamblaje.", "Todas son falsas.", "1");
            /*07*/      tipo_test("El principio de reflexión hace referencia a:", "Todos los objetos se pueden sobrescribir.", "Los objetos no son manipulables.", "Permite el análisis y la modificación de los distintos atributos y características de las\n    distintas clases en tiempo de ejecución.", "Todas son verdaderas.", "3");
            /*08*/      tipo_test("¿Qué objeto usaremos en Hibernate para instanciar una conexión directa con nuestra\n        base de datos relacional?", "SessionFactory Object", "Session Object.", "Query Object.", "ORM.", "2");
            /*09*/      tipo_test("¿Qué objeto es el encargado de coger el fichero de configuración entre otras\n        funciones?", "SessionFactory Object", "Session Object.", "Query Object.", "ORM.", "1");
            /*10*/      tipo_test("¿En qué fichero podremos introducir nuestras configuraciones de Hibernate?", "Application.properties.", "App.zip.", "Configuration.config.", "Todas son falsas.", "1");                        
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Una de las características de una clase persistente sería:", "Tener al menos un constructor por defecto.", "Tener mínimo 4 atributos.", "Mínimo deber contener 50 líneas de código.", "Todas son falsas.", "1");
            /*02*/      tipo_test("Que todas las clases deban contener un atributo ID para mejorar la identificación de\n        los objetos es una característica principal de:", "Las clases POJO.", "Clases persistentes.", "Clases Service.", "Clases DAO.", "2");
            /*03*/      tipo_test("En la construcción de clases persistentes es importante tener:", "Los métodos getter y setter definidos.", "Una instancia de un servicio dentro de la clase.", "Un atributo que se llame \"name\" cuyo nombre sea la clase.", "Todas son falsas.", "1");
            /*04*/      tipo_test("Con la etiqueta <hibernate-mapping> ...", "Podremos colocar la configuración básica de hibernate.", "Configuraremos algunos aspectos de mapeo generales.", "Almacenaremos las clases definidas que queramos persistir.", "Todas son verdaderas.", "3");
            /*05*/      tipo_test("Con los elementos <meta> del archivo de mapeo podremos ...", "Establecer la descripción de la clase que estamos definiendo.", "Definir los atributos principales de la clase.", "Establecer el contenido de una columna.", "Todas son falsas.", "1");
            /*06*/      tipo_test("¿Con qué elemento mapearemos los atributos o propiedades Java y los\n        transformaremos en columnas de base de datos?", "<attributes>", "<property>", "<set>", "<get>", "2");
            /*07*/      tipo_test("¿Qué estado tendría un objeto persistente que fuese una nueva instancia, que no está\n        aún asociada a un objeto de sesión y no tiene representación en la base de datos ni\n        identificador según Hibernate?", "Persistent.", "Transient.", "Detached.", "Labeled.", "2");
            /*08*/      tipo_test("El método clear() del objeto session ...", "Cerrará la session.", "Eliminará completamente la sesión.", "Borrará la caché Hibernate.", "Todas son verdaderas.", "2");
            /*09*/      tipo_test("El método createCriteria() que se ejecuta desde un objeto de session devolverá:", "Un objeto Query.", "Un objeto Criteria.", "Un objeto Transaction.", "Un objeto Session.", "2");
            /*10*/      tipo_test("¿Con qué método comprobamos si la session está actualmente conectada?", "isOpen().", "isConnected().", "refresh().", "getSessionFactory().", "2");                        
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
                        
            /*01*/      tipo_test("El método unread() aplicado sobre un objeto PushbackReader ...", "Vacía el buffer de lectura.", "Se utiliza para eliminar bytes de los streams.", "Devuelve al stream de datos el byte que hemos leído con anterioridad.", "Es un método que no existe.", "3");
            /*02*/      tipo_test("HyperSQL", "Para mayor compatibilidad, está desarrollado en lenguaje C.", "Facilita una interfaz ODBC para el acceso a datos.", "Solo se puede ejecutar en modo embebido.", "Se ajusta a la versión estándar SQL 2011 y a la especificación JDBC4.", "4");
            /*03*/      tipo_test("En la clase RandomAccessFile el modo de acceso \"rwd\" ...", "Hace referencia al modo escritura.", "Hace referencia al modo lectura.", "Hace referencia al modo lectura escritura.", "Hace referencia al modo lectura escritura síncrona.", "4");
            /*04*/      tipo_test("¿Qué método nos indica que un token es de tipo número?", "TT_EOL", "TT_EOF", "TT_NUMBER", "TT_WORD", "3");
            /*05*/      tipo_test("Para el análisis de un Stream, con un acceso basado en carácteres, usaremos ...", "PushbackReader", "PushbackInputStream", "FileInputStream", "DataInputStream", "1");
            /*06*/      tipo_test("En bases de datos, para modificar el nombre de las columnas de una tabla, usaremos ...", "Alter table.", "Rename in table.", "Replace.", "Update.", "1");
            /*07*/      tipo_test("En bases de datos, es ejemplo de sentencias de definición de datos:", "Create a database y create table.", "Insert.", "Select.", "Delete.", "1");
            /*08*/      tipo_test("ORM", "Tiene la ventaja de que el mapeado automático de las bases de datos consume pocos\n    recursos del sistema.", "Es un framework que facilita el almacenamiento de los datos en un base de datos\n    relacional.", "Tiene el inconveniente de que complica introducir nuevas funciones (como el cacheo de\n    información).", "Está basado en una arquitectura funcional de 2 fases: datos del objeto y persistencia\n    (o mapeo).", "2");
            /*09*/      tipo_test("Respecto a la utilización de buffers para acceder a los ficheros:", "Mejora el rendimiento del sistema.", "Se consigue con las clases BufferInputStream y BufferOutputStream.", "Se consigue con las clases BufferReaderStream y BufferWriterStream.", "Todas las respuestas son correctas.", "1");
            /*10*/      tipo_test("Trabajando con ficheros, para el acceso de entrada (lectura) basado en caracteres,\n        usaremos la clase:", "FileInputStream.", "FileReader.", "RandomAccessFile.", "Todas las respuestas son correctas.", "2");
            
            /*11*/      tipo_test("Para tratar una excepción en java, podemos ...", "Rodear el código propenso a excepciones en un bloque try/catch.", "Añadir la excepción a la definición del método, lanzándola a un nivel superior.", "Incluir instrucciones que se ejecutarán siempre, independientemente de si hay excepción\n    o no.", "Todas las respuestas son correctas.", "4");
            /*12*/      tipo_test("¿Que nos indica el método TT_NUMBER de la clase StreamTokenizer?", "Inicio del fichero.", "Fin de línea.", "Fin del fichero.", "Un token es de tipo número.", "4");
            /*13*/      tipo_test("El driver JDBC-ODBC (tipo 1)", "No se distribuye con el paquete del lenguaje Java.", "Usa una API nativa.", "Es muy rápido, al no tener capas intermedias.", "Es el recomendado para trabajar con applets.", "2");
            /*14*/      tipo_test("Aplicando el método close(), conseguiremos ...", "Finalizar nuestra aplicación.", "Bloquear nuestro fichero contra escritura.", "Cerrar la lectura del fichero.", "Cerrar el flujo de datos, liberando los recursos ocupados.", "4");
            /*15*/      tipo_test("¿Qué método nos indica que un token es de tipo palabra?", "TT_EOL", "TT_EOF", "TT_LOP", "TT_WORD", "4");
            /*16*/      tipo_test("¿Con cuál de los siguientes métodos obtendremos una lista de los nodos en XPATH?", "ShowNodes()", "Compile() y evaluate()", "Clear()", "Load()", "2");
            /*17*/      tipo_test("En la clase RandomAccessFile el modo de acceso \"rw\" ...", "Hace referencia al modo escritura.", "Hace referencia al modo lectura.", "Hace referencia al modo lectura escritura.", "Hace referencia al modo lectura escritura síncrona.", "3");
            /*18*/      tipo_test("Una base de datos independiente:", "Usa la misma JVM de la aplicación.", "Está embebida en el aplicativo.", "Es menos potente que una embebida.", "Todas son falsas.", "4");
            /*19*/      tipo_test("Selecciona el comando por medio del cual eliminaremos filas en nuestra base de\n        datos:", "DROP TABLE", "DELETE", "CLEAN", "INSERT", "2");
            /*20*/      tipo_test("¿De qué principio Java hace uso el Framework Hibernate?", "Reflexión.", "Multiplataforma.", "Autoensamblaje.", "Todas son falsas.", "1");
            
            /*21*/      tipo_test("Hibernate:", "Está disponible solo para Java.", "Establece las relaciones en muchos ficheros XML diferentes, lo que lo hace más complicado.", "Es muy utilizado por ser muy básico, sin contemplar muchas de las características de Java\n    (colecciones, herencia, abstracción, orientación a objetos, etc.)", "Ofrece una propia de consultas SQL, llamada HQL.", "4");
            /*22*/      tipo_test("XPATH ...", "Se utiliza para configurar en java la ruta (path) de los ficheros XML.", "Es la recomendación del W3C para el trabajo con XML.", "No permite utilizar expresiones para seleccionar nodos en ficheros XML.", "No tiene las funcionalidades estándar de manipulación de Strings o valores numéricos.", "2");
            /*23*/      tipo_test("Utilizando SAX puedo modificar un fichero XML ...", "Con DataOutputStream.", "Con PrintStream.", "Primero lo tengo que leer con DataInputStream.", "Las demás respuestas son incorrectas.", "4");
            /*24*/      tipo_test("Accediendo al contenido de un fichero XML:", "Usaremos DOM si queremos acceder a todo el fichero a la vez, y SAX si solo\n    necesitamos en memoria una parte del nodo o evento actual.", "SAX es más lento y menos potente que DOM.", "DOM no permite tener todo el árbol del fichero disponible.", "Usaremos SAX si queremos acceder a todo el fichero a la vez, y DOM si solo\n    necesitamos en memoria una parte del nodo o evento actual.", "1");
            /*25*/      tipo_test("Una tubería en java ...", "Se usa para permitir comunicarse a dos procesos ejecutándose en lugares distintos de la memoria.", "Se puede usar para permitir comunicarse a dos hilos diferentes, siempre que sean del mismo proceso.", "Se crea instanciando objetos Streams.", "Se puede usar para permitir comunicarse a dos hilos diferentes, siempre que no sean\n    del mismo proceso.", "2");
            /*26*/      tipo_test("En la clase RandomAccessFile el modo de acceso \"r\" ...", "Hace referencia al modo escritura.", "Hace referencia al modo lectura.", "Hace referencia al modo lectura escritura.", "Todas con correctas.", "2");
            /*27*/      tipo_test("La clase DataInputStream leerá ...", "Solo tipos de datos String.", "Tipos de datos String e Integer.", "Tipos de datos primitivos de java.", "Todas son correctas.", "3");
            /*28*/      tipo_test("¿Que nos indica el método TT_WORN de la clase StreamTokenizer?", "Inicio del fichero.", "Fin de línea.", "Fin del fichero.", "Un token es de tipo palabra.", "4");
            /*29*/      tipo_test("Elige el protocolo de conexión más usado con bases de datos con lenguaje SQL.", "JDBC.", "LDAP.", "OBDC.", "ORACLE.", "1");
            /*30*/      tipo_test("En la clase RandomAccessFile el modo de acceso \"rws\" ...", "Hace referencia al modo escritura.", "Hace referencia al modo lectura.", "Hace referencia al modo lectura escritura.", "Hace referencia al modo lectura escritura síncrona.", "4");
            
            /*31*/      tipo_test("¿Qué método nos indica que un token es de tipo final del fichero?", "TT_EOL", "TT_EOF", "TT_LOP", "TT_WORD", "2");
            /*32*/      tipo_test("La conexión con JDBC ...", "Puede ser en una arquitectura de 2 capas.", "Puede ser en una arquitectura de 3 capas.", "Puede ser de un tipo que incluya la traducción de llamadas de JDBC a ODBC.", "Todas las respuestas son correctas.", "4");
            /*33*/      tipo_test("El método read() de FileInputStream ...", "Devuelve el contenido de todo el fichero.", "Devuelve el primer Byte representado en número entero.", "No devuelve nada.", "Ninguna es correcta.", "2");
            /*34*/      tipo_test("¿Qué método es el encargado de cargar el fichero en memoria en los analizadores?", "El método unparse.", "El método load.", "El método parse.", "El metodo execute.", "3");
            /*35*/      tipo_test("Antes de escribir el código necesario para gestionar la conexión desde Java hay que ...", "Compilar nuestro proyecto.", "Añadir nuestro fichero de driver (normalmente .jar) al classpath del proyecto.", "Ejecutar un comando para crear base de datos.", "Todas son falsas.", "2");
            /*36*/      tipo_test("Spring boot nos ayuda en:", "Despliegue de la aplicación entre otras cosas.", "Sintaxis.", "Variables de entorno.", "Todas son falsas.", "1");
            /*37*/      tipo_test("Necesitaremos tener el permiso DROP para ejecutar ...", "DROP TABLE.", "CREATE INDEX.", "ALTER TABLE.", "ALTER DATABASE.", "1");
            /*38*/      tipo_test("El principio de reflexión hace referencia a:", "Todos los objetos se pueden sobrescribir.", "Los objetos no son manipulables.", "Permite el análisis y la modificación de los distintos atributos y características de las\n    distintas clases en tiempo de ejecución.", "Todas son verdaderas.", "3");
            /*39*/      tipo_test("¿Qué método nos indica que un token es de tipo final de la línea?", "TT_EOL", "TT_EOF", "TT_LOP", "TT_WORD", "1");
            /*40*/      tipo_test("En bases de datos, es ejemplo de sentencias de manipulación de datos:", "Alter database.", "Select.", "Insert.", "Alter table.", "3");
            
            /*41*/      tipo_test("Java DB", "Está construida sobre el motor de base de datos Derby.", "Es la base sobre la que se construyó el motor de la base de datos Derby.", "Solo se puede desplegar en modo simple embebido.", "Solo soporta funcionalidades de bases de datos orientadas a objetos.", "1");
            /*42*/      tipo_test("¿Cuántos tipos de drivers JDBC existen?", "1", "3", "4", "8", "3");
            /*43*/      tipo_test("¿Qué método es el que usaremos para realizer consultas con un objeto Statement?", "executeQuery().", "executeSelect().", "executeUpdate().", "Todas son verdaderas.", "1");
            /*44*/      tipo_test("¿Qué nos devuelve el método getParent()?", "Devuelve el fichero anterior.", "No devuelve es de tipo void().", "Devuelve el directorio superior.", "Devuelve el nombre del fichero.", "3");
            /*45*/      tipo_test("¿Que nos indica el método TT_EOL de la clase StreamTokenizer?", "Inicio del fichero.", "Fin de línea.", "Fin del fichero.", "Error.", "2");
            /*46*/      tipo_test("¿De qué clase heredan todas las excepciones en Java?", "THROWABLE.", "ERROR.", "EXCEPTION.", "FILEEXCEPTION.", "1");
            /*47*/      tipo_test("El comando que nos permite cambiar las condiciones generales de una tabla de una\n        base de datos es ...", "ALTER TABLE.", "ALTER DATABASE.", "ALTER BASE.", "ALTER INDEX.", "1");
            /*48*/      tipo_test("Un conector o driver para el acceso a base de datos ...", "Es una API para facilitar la conexión a dicha base de datos.", "Si es JDBC, es un protocolo desarrollado por Microsoft.", "Si es ODBC, es un protocolo desarrollado por Sun.", "Todas las respuestas son correctas.", "1");
            /*49*/      tipo_test("La librería Java que se usará para la gestión de archivos, lectura, escritura y más\n        funcionalidades es", "Java.io", "Io.java", "Lio.java", "Java.tio", "1");
            /*50*/      tipo_test("¿Qué clase fue desarrollada para leer datos primitivos de Java?", "DataInputStream.", "DataStream.", "Data", "Date.", "1");
            
            /*51*/      tipo_test("Con la anotación @Before ...", "Ejecutamos dicho código después del test ejecutado.", "Ejecutamos algunos tests.", "Ejecutamos dicho código antes del test ejecutado.", "Todas son falsas.", "3");
            /*52*/      tipo_test("ObjectDB ...", "Más que una base de datos relacional es una base de datos orientada a objetos.", "Es relacional pura.", "Es independiente.", "Todas son falsas.", "1");
            /*53*/      tipo_test("El comando que nos permite cambiar las condiciones generales de la base de datos\n        es ...", "ALTER TABLE", "ALTER DATABASE.", "ALTER BASE.", "ALTER INDEX.", "2");
            /*54*/      tipo_test("Mejorar la eficiencia en el desarrollo ...","Es una ventaja de usar un ORM."," No debe influir a la hora de usar un ORM.","Influye al usar depende qué tipo de base de datos relacional.","Todas son falsas.","1");
            /*55*/      tipo_test("¿Qué componente es el encargado de realizar la conexión entre nuestro aplicativo y el\n        driver apropiado JDBC?", "El T driver.", "El gestor JDBC.", "RJK driver.", "Java driver.", "2");
            /*56*/      tipo_test("¿En qué fichero podremos introducir nuestras configuraciones de Hibernate?", "Application.properties.", "App.zip.", "Configuration.config.", "Todas son falsas.", "1");
            /*57*/      tipo_test("Un fichero genérico está compuesto por ...", "Nombre.", "Tipo de fichero.", "Nombre y extensión.", "Nombre y acceso.", "3");
            /*58*/      tipo_test("Para instanciar un nuevo hilo de ejecución usaremos la clase ...", "FileInput.", "FileOutput.", "Stream.", "Thread.", "4");
            /*59*/      tipo_test("Una base de datos independiente:", "No se ejecutará bajo la misma JVM.", "No tiene por qué ser más potente que una embebida.", "No realiza procedimientos.", "Todas son verdaderas.", "1");
            /*60*/      tipo_test("¿Con qué comando podremos renombrar una o más tablas?", "DROP TABLE.", "RENAME TABLE.", "DROP INDEX.", "NAME TABLE.", "2");
            
            /*61*/      tipo_test("¿Que nos indica el método TT_EOF de la clase StreamTokenizer?", "Inicio del fichero.", "Fin de línea.", "Fin del fichero.", "Error.", "3");
            /*62*/      tipo_test("El parser SAX es un analizador basado en ...", "Listas.", "Eventos.", "La edición.", "La escritura.", "2");
            /*63*/      tipo_test("Definimos el desfase objeto-relacional a ...", "Al tiempo de conexión.", "Las dificultades que surgen cuando trabajamos con un aplicativo y una base de\n    datos relacional.", "Nombre de base de datos.", "Tipo de base de datos.", "2");
            /*64*/      tipo_test("Con la clave: spring.datasource.username ...", "Accederemos a una table de base de datos.", "Indicaremos el nombre de usuario de acceso al panel de control.", "Accedemos al aplicativo.", "Todas son verdaderas.", "2");
            /*65*/      tipo_test("¿Qué conocido método devuelve el byte al stream de datos?", "Read()", "Unread()", "Re-read()", "Unreadeable()", "2");
            /*66*/      tipo_test("¿Qué sentencia usamos en las excepciones para identificarlas y tratarlas?", "Try/catch.", "Throw.", "Call.", "Take.", "1");
            /*67*/      tipo_test("En java, para crear el fichero \"prueba.txt\", usaremos:", "File fichero = new File(\"prueba.txt\");", "File fichero = new File(\"prueba.txt\");\n    fichero.createNewFile();", "File fichero = new File(\"prueba.txt\");\n    fichero.mkdirs();", "File fichero = new File(\"prueba.txt\");\n    fichero.exists();", "2");
            
            /*68*/      //tipo_test("", "", "", "", "", "");
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
