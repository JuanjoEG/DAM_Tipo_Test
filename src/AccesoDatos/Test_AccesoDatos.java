package AccesoDatos;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */

public class Test_AccesoDatos {
    
    public static void Acc_Dat() {
        
        Menu_Temas.setTema_01("INTRODUCCIÓN AL MANEJO DE FICHEROS.");
        Menu_Temas.setTema_02("FLUJOS.");
        Menu_Temas.setTema_03("TRABAJO CON FICHEROS XML.");
        Menu_Temas.setTema_04("MANEJO DE CONECTORES I.");
        Menu_Temas.setTema_05("MANEJO DE CONECTORES II.");
        Menu_Temas.setTema_06("MANEJO DE CONECTORES III: SENTENCIAS.");
        Menu_Temas.setTema_07("EL MAPEO OBJETO RELACIONAL.");
        Menu_Temas.setTema_08("EXPLORACIÓN DEL MAPEO OBJETO-RELACIONAL.");
        Menu_Temas.setTema_09("BASES DE DATOS ORIENTADAS A OBJETOS.");
        Menu_Temas.setTema_10("BASES DE DATOS OBJETO RELACIONALES.");
        Menu_Temas.setTema_11("INTRODUCCIÓN A LAS BASES DE DATOS NO-SQL.");
        Menu_Temas.setTema_12("OPERACIONES CON BASES DE DATOS NO-SQL.");
        Menu_Temas.setTema_13("EXPLOTACIÓN DE LAS BASES DE DATOS NO-SQL.");
        Menu_Temas.setTema_14("GESTIÓN DE BASES DE DATOS NATIVAS XML.");
        Menu_Temas.setTema_15("PROGRAMACIÓN DE COMPONENTES DE ACCESO A DATOS");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
            
        _Main_.Principal.setAsignatura("ACCESO A DATOS");
        
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
                        _Main_.Principal.setTema(menu); // JPA
        
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
                        
            /*01*/      tipo_test("Cuando las técnicas de bases de datos son combinadas con objetos,\n        obtenemos como resultado:", "Una base de datos relacional.", "Un sistema gestor de base de datos orientado a objetos.", "Una base de datos no-relacional.", "Todas son falsas.", "2");
            /*02*/      tipo_test("Una vez que la base de datos mantiene una relación directa entre el mundo real y los\n        objetos podemos decir que los objetos no pierden:", "Ni su identidad ni su integridad.", "La estructura.", "La implementación.", "Todas son verdaderas.", "1");
            /*03*/      tipo_test("Las características que definen los objetos las llamamos:", "Identidades.", "Clases.", "Objetos.", "Atributos.", "4");
            /*04*/      tipo_test("¿Qué característica representa la información y las implementaciones de los métodos\n        ocultando las entidades externas?", "Integridad.", "Identidad.", "Encapsulación.", "Todas son verdaderas.", "3");
            /*05*/      tipo_test("Identifica la característica que NO pertenece a un sistema de bases de datos genérico:", "Concurrencia.", "Recuperación de errores.", "Consultas.", "Aislamiento.", "4");
            /*06*/      tipo_test("Las siglas del lenguaje de consulta de objetos son:", "SQLO.", "OQL.", "OOQ.", "OLQ.", "2");
            /*07*/      tipo_test("Los objetos de una clase pueden ser organizados de nuevo formando ciertas\n        agrupaciones que pueden ser relevantes de interés para la base de datos.\n        Esto hace referencia a:", "Especialización, generalización y herencia.", "Integridad.", "Encapsulación.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Una ventaja de las bases de datos orientadas a objetos es:", "La persistencia es totalmente distinta.", "La rapidez de persistir.", "Los objetos son livianos.", "Disponemos de una mayor capacidad para realizar el modelado.", "4");
            /*09*/      tipo_test("Selecciona la característica específica de un sistema gestor de bases de datos\n        orientado a objetos:", "Consultas.", "Concurrencia.", "Modularidad.", "Persistencia.", "3");
            /*10*/      tipo_test("El lenguaje OQL:", "Es un lenguaje declarativo de tipología SQL.", "Es un lenguaje sin relación a SQL.", "Es SQL nativo.", "Todas son falsas.", "1");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una combinación de una base de datos relacional y una orientada a objetos\n        es lo que llamamos como:", "Una base de datos relacional objeto.", "Base de datos objeto relacional.", "Base de datos segmentada.", "Todas son falsas.", "2");
            /*02*/      tipo_test("Usaremos la clave objet type :", "Para crear tipos del sistema.", "Para crear tipos de objeto de usuario.", "Para crear tablas.", "Para definir atributos.", "2");
            /*03*/      tipo_test("Un objeto representa una entidad en el mundo real y se compone de:", "Nombre, atributos y métodos.", "Definición y columnas.", "Tablas y columnas.", "Todas son falsas.", "1");
            /*04*/      tipo_test("Una vez definido un tipo ¿Qué objetivos podremos tener?", "Definir nuevos tipos.", "Almacenamiento en tablas de esos tipos.", "Definir distintos atributos de una tabla.", "Todas son verdaderas.", "4");
            /*05*/      tipo_test("¿Qué es un VARRAY?", "Concurrencia.", "Un tipo de colección en Oracle.", "Un objeto de sistema.", "Todas son falsas.", "2");
            /*06*/      tipo_test("Elige entre las opciones una de los objetivos que tendríamos después de crear\n        un VARRAY:", "Definir la tipología de una columna de una tabla relacional.", "Crear listas de tablas.", "Definir un atributo.", "Todas son falsas.", "1");
            /*07*/      tipo_test("A una lista de elementos no ordenados y todos ellos con la misma tipología podremos\n        definirlo como tipo de colección:", "VARRAY.", "Lista.", "PL/SQL.", "Tabla anidada.", "4");
            /*08*/      tipo_test("Una referencia en Oracle es:", "Un enlace a un objeto de la tipología definida y que a su vez genera una relación entre ambos.", "Un Id que se le asigna a un atributo.", "Un atributo cualquiera.", "Todas son falsas.", "1");
            /*09*/      tipo_test("La sintaxis que tenemos en Oracle para las referencias es:", "REFER.", "R.", "REF.", "REFERENCE.", "3");
            /*10*/      tipo_test("A través de la herencia de tipos podremos:", "Ser mucho más eficientes escribiendo código.", "Añadir directamente características de los elementos padres a los hijos.", "Ahorrar tiempo.", "Todas son verdaderas.", "4");                        
                    }
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Definimos a un conjunto de máquinas definidas como servidores de procesamiento paralelo:", "Servidores en paralelo.", "Servidores en serie.", "Cluster.", "Windows server.", "3");
            /*02*/      tipo_test("¿Qué entendemos como ausencia de Schemaless?", "Opción de un sistema.", "Característica muy flexible, se puede almacenar información no uniforme\n    y se facilita la evolución.", "Sirve para crear tablas.", "Todas son falsas.", "2");
            /*03*/      tipo_test("Identifica el tipo de base de datos NoSQL:", "Base de datos clave/valor.", "Base de datos relacional.", "Base de datos de objetos.", "Todas son falsas.", "1");
            /*04*/      tipo_test("Las bases de datos basadas en gráficos:", "Son menos eficientes que las relacionales.", "Es un tipo de base de datos NoSQL.", "Son mucho más rápidas.", "Todas son verdaderas.", "2");
            /*05*/      tipo_test("La base de datos Cassandra es un tipo de base de datos:", "Clave/valor.", "Basado en columnas.", "Basada en gráficos.", "No existe.", "2");
            /*06*/      tipo_test("Identifica uno de los beneficios de las bases datos NOSQL:", "Facilidad de montaje.", "Extensión múltiple.", "Disponibilidad continua.", "Todas son verdaderas.", "3");
            /*07*/      tipo_test("Uno de los beneficios y características más notorios de las bases de datos NoSQL es:", "Capacidad Big Data.", "Extensión múltiple.", "Fácil transferencia.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Múltiples centros de datos sin preocuparse de la cantidad de operaciones de lectura y\n        escritura atienden al beneficio:", "Capacidad de mostrar toda la información.", "Capacidad de tener múltiples centros de datos.", "Fácil acceso.", "Todas son falsas.", "2");
            /*09*/      tipo_test("Infogrid es una base de datos NoSQL basada en:", "Gráficos.", "Columnas.", "Clave/valor.", "Documentos.", "1");
            /*10*/      tipo_test("Identifica el que no es un tipo de Big Data:", "Estructurado.", "No estructurado.", "Semiestructurado.", "Norelacional.", "4");                        
                    }
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("MongoDb es:", "Una base de datos relacional.", "Una base de datos orientada a objetos basada en grafos.", "Una base de datos basada en documentos.", "Todas son falsas.", "3");
            /*02*/      tipo_test("La estructura de los documentos en MonboDB:", "Es en formato Json e internamente son almacenado en Bson.", "Formato .doc", "Formato .txt", "Sin formato.", "1");
            /*03*/      tipo_test("Una de las características principales de MongoDB:", "La mayoría de los datos residen en memoria. Lecturas y escrituras muy rápidas.", "La mayoría de los datos residen en disco duro. Almacenamientos seguros.", "La mayoría de los datos se almacenan a través de la red.", "Todas son falsas.", "1");
            /*04*/      tipo_test("¿Cuál es el término para denominar a la tabla del mundo relacional en MongoDB?", "Documento.", "Colección.", "Bases de datos.", "JSON.", "2");
            /*05*/      tipo_test("Alguno de los motores de almacenamiento puede ser:", "Sharding.", "MVC.", "WiredTiger.", "Sofield.", "3");
            /*06*/      tipo_test("Cuáles son las 3 características que se evalúan en el teorema de CAP:", "Tolerancia, Consistencia y Datos.", "Tolerancia, Disponibilidad y Certeza.", "Tolerancia, Disposición y Certeza.", "Tolerancia, Disponibilidad y Consistencia.", "4");
            /*07*/      tipo_test("¿Qué es Mongod?", "Servicio principal de la base de datos. Maneja los accesos a datos.", "Es un fichero de configuración .conf.", "Es un fichero de documentación para la base de datos.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Selecciona el servicio que se utiliza en Mongo para realizar Shard:", "Mongod.", "Mongo.", "Mongos.", "mongodump.", "3");
            /*09*/      tipo_test("¿Qué herramienta usamos en MongoDB para convertir ficheros Bson a otros formatos?", "Mongos.", "Bsondump.", "Mongoexport.", "mongoimport.", "2");
            /*10*/      tipo_test("¿Qué comando usaremos en la Shell de mongo para recibir ayuda sobre los comandos\n        ejecutables sobre la base de datos?", "Show dbs", "db", "use db", "db.help()", "4");                        
                    }
                    case "13" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una característica de un índice es:", "Se almacerna en memoria.", "Se almacena en disco duro.", "No se almacena.", "Todas son falsas.", "1");
            /*02*/      tipo_test("Los operadores de negación:", "Utilizan índices siempre.", "No utilizan índices.", "Usan índices cuando es necesario.", "Todas son falsas.", "2");
            /*03*/      tipo_test("Los índices monoclave:", "Indexan por dos campos.", "Indexan por dos o más campos.", "Solo indexan por un campo de los documentos de la colección.", "Todas son falsas.", "3");
            /*04*/      tipo_test("Los índices monoclave:", "No son eficientes.", "Solo afectan a un campo de búsqueda.", "Son índices de texto.", "Se les llama también geoespaciales.", "2");
            /*05*/      tipo_test("Los índices Hashed:", "Indexan por coordenadas.", "Solo puede haber una correspondencia entre entrada del índice y documento.", "Son poco eficientes.", "Indexan de forma clave/valor.", "4");
            /*06*/      tipo_test("Una covered query:", "Es una consulta normal a base de datos.", "Es una consulta a base de datos compleja.", "Es una consulta que se resuelve contra un índice sin consultar datos de la colección.", "Todas son falsas.", "3");
            /*07*/      tipo_test("Utilizamos la regeneración de índice para:", "Borrar un índice.", "Crear uno nuevo.", "Volver a crear un índice ya creado previamente.", "Listar los índices asociados a una colección.", "3");
            /*08*/      tipo_test("¿Con qué comando crearemos un usuario en MongoDB?", "Db.create().", "Db.createUser().", "Créate.user.", "User.create().", "2");
            /*09*/      tipo_test("¿Para qué usaremos el campo 'roles' de nuestro comando db.createUser()?", "Array donde indicaremos los permisos del nuevo usuario.", "Permisos que no tendrá el nuevo usuario.", "Permisos de más alto nivel.", "Todas son falsas.", "1");
            /*10*/      tipo_test("¿Cuál es la herramienta oficial que propone MongoDB para gestionar visualmente\n        la base de datos (importar, exportar, etc)?", "Generate app.", "showData.", "removeData.", "Compass.", "4");                        
                    }
                    case "14" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Las bases de datos XML nativas son bases de datos que:", "Almacenan documentos y datos XML de una forma eficiente.", "No realizan consultas.", "No son integrables.", "Todas son falsas.", "1");
            /*02*/      tipo_test("Las bases de datos XML nativas:", "Se basan en tablas.", "Tienen consultas SQL.", "Se basan en los llamados contenedores.", "Todas son verdaderas.", "3");
            /*03*/      tipo_test("Un sistema XML de base de datos de código abierto sería:", "Excelon.", "GoXML.", "ExistDB.", "Todos son de código abierto.", "3");
            /*04*/      tipo_test("Las bases de datos XML se consultan con:", "Consultas SQL.", "Consultas Mish.", "Expresiones regulares.", "Expresiones XPath.", "4");
            /*05*/      tipo_test("En la instalación de ExistDB, ¿Qué caché es recomendado asignar?", "128MB.", "200TB.", "20MB.", "1TB.", "1");
            /*06*/      tipo_test("En la instalación de ExistDB ¿Cuánta RAM es recomendable asignar?", "5000MB.", "200MB.", "1024MB.", "Todas son falsas.", "3");
            /*07*/      tipo_test("¿Qué paquete es esencial a la hora de instalar ExistDB y estaremos forzados a integrar?", "El paquete APP.", "Sources.", "Core.", "Core y Sources.", "3");
            /*08*/      tipo_test("¿A qué ruta del navegador accederemos para ir a nuestro Dashboard en ExistDB?", "https://localhost", "http://localhost", "http://localhost:8080/exist/", "Todas son falsas.", "3");
            /*09*/      tipo_test("¿Cuál no es una estrategia de almacenamiento en bases de datos xml nativas?", "Basado en texto.", "Basado en modelo.", "Almacenando en local.", "Almacenando en la nube.", "4");
            /*10*/      tipo_test("¿Qué paquetería nos habilitará la clase DatabaseManager?", "Org.xmldb.api", "Api.xmldb", "Org.api", "Todas son falsas.", "1");                        
                    }
                    case "15" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una unidad de software que encapsula un segmento de código con ciertas funciones\n        lo definimos como:", "Componente.", "Función.", "Método.", "Todas son falsas.", "1");
            /*02*/      tipo_test("Elige la opción falsa. Un componente está formado por:", "Atributos.", "Propiedades.", "Eventos.", "EndPoint.", "4");
            /*03*/      tipo_test("Elige la opción válida de escribir un método get():", "getNombreX().", "getNombreDeLaPropiedad().", "setNombre().", "getNombre().", "2");
            /*04*/      tipo_test("Los componentes tienen los siguientes tipos de atributos:", "Compartidos.", "Indexados.", "Simples.", "Todas son correctas.", "4");
            /*05*/      tipo_test("Para que un componente acepte propiedades compartidas, ¿Qué métodos debe\n        integrar?", "addPropertyChangeListener.", "removePropertyChangeListener.", "oldremove.", "Hay dos opciones correctas.", "4");
            /*06*/      tipo_test("Cuando un componente se activa mediante el funcionamiento de otro lo\n        denominamos:", "Retroceso.", "Control activo.", "Control pasivo.", "Todas son falsas.", "2");
            /*07*/      tipo_test("¿Con qué clase usamos la introspección con EJBs?", "Instrospection.", "Api.Javax.", "Core.", "Introspector.", "4");
            /*08*/      tipo_test("¿Con qué biblioteca usamos la persistencia de los componentes?", "JPA.", "HPA.", "RPA.", "SPA.", "1");
            /*09*/      tipo_test("¿Qué clase ayuda a crear objetos EntityManager utilizando el patrón de diseño\n        Factory?", "Entity.", "EntityManagerFactory.", "Factory.", "Todas son falsas.", "2");
            /*10*/      tipo_test("¿Con qué objeto realizamos las consultas en JPA?", "Query.", "Transaction.", "EntityManager.", "Entity.", "1");                        
                    }
                    case "40" -> AccesoDatos.Test_Rep_I_Acc_Dat.test_Repaso();
                    case "50" -> AccesoDatos.Test_Rep_II_Acc_Dat.test_Repaso();
                    
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
