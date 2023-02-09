package AccesoDatos;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Test_AccesoDatos {
    
    public static void Acc_Dat() {
        
        Menu_Temas.setTema_01("INTRODUCCI�N AL MANEJO DE FICHEROS.");
        Menu_Temas.setTema_02("FLUJOS.");
        Menu_Temas.setTema_03("TRABAJO CON FICHEROS XML.");
        Menu_Temas.setTema_04("MANEJO DE CONECTORES I.");
        Menu_Temas.setTema_05("MANEJO DE CONECTORES II.");
        Menu_Temas.setTema_06("MANEJO DE CONECTORES III: SENTENCIAS.");
        Menu_Temas.setTema_07("EL MAPEO OBJETO RELACIONAL.");
        Menu_Temas.setTema_08("EXPLORACI�N DEL MAPEO OBJETO-RELACIONAL.");
        Menu_Temas.setTema_09("BASES DE DATOS ORIENTADAS A OBJETOS.");
        Menu_Temas.setTema_10("BASES DE DATOS OBJETO RELACIONALES.");
        Menu_Temas.setTema_11("INTRODUCCI�N A LAS BASES DE DATOS NO-SQL.");
        Menu_Temas.setTema_12("OPERACIONES CON BASES DE DATOS NO-SQL.");
        Menu_Temas.setTema_13("EXPLOTACI�N DE LAS BASES DE DATOS NO-SQL.");
        Menu_Temas.setTema_14("GESTI�N DE BASES DE DATOS NATIVAS XML.");
        Menu_Temas.setTema_15("PROGRAMACI�N DE COMPONENTES DE ACCESO A DATOS");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
            
        _Main_.Principal.setAsignatura("ACCESO A DATOS");
        
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
                        _Main_.Principal.setTema(menu); // JPA
        
            /*01*/      tipo_test("La librer�a Java que se usar� para la gesti�n de archivos, lectura, escritura y m�s\n        funcionalidades es:", "Java.io", "Io.java", "Lio.java", "Java.tio", "1");
            /*02*/      tipo_test("Un fichero gen�rico est� compuesto por ...", "Nombre.", "Tipo de fichero.", "Nombre y extensi�n.", "Nombre y acceso.", "3");
            /*03*/      tipo_test("Usaremos el m�todo mkdirs() de la Clase File ...", "Para crear un fichero nuevo.", "Para indicar direcci�n de b�squeda de fichero.", "Para crear un nuevo directorio.", "Para eliminar un fichero.", "3");
            /*04*/      tipo_test("�Qu� nos devuelve el m�todo getParent()?", "Devuelve el fichero anterior.", "No devuelve es de tipo void().", "Devuelve el directorio superior.", "Devuelve el nombre del fichero.", "3");
            /*05*/      tipo_test("�Qu� formas de acceso a ficheros existen?", "Modo de acceso secuencial.", "Modo de acceso secuencial y aleatorio.", "Modo de acceso secuencial y de caracteres.", "Modo de acceso a caracteres.", "2");
            /*06*/      tipo_test("Usaremos la Clase FileWriter para ...", "Escribir en ficheros que est�n basados en la escritura con caracteres.", "Acceder de forma aleatoria a un fichero.", "Escribir de forma aleatoria a un fichero.", "Todas son correctas.", "1");
            /*07*/      tipo_test("El m�todo read() de FileInputStream ...", "Devuelve el contenido de todo el fichero.", "Devuelve el primer Byte representado en n�mero entero.", "No devuelve nada.", "Ninguna es correcta.", "2");
            /*08*/      tipo_test("En la clase RandomAccessFile el modo de acceso \"r\" ...", "Hace referencia al modo escritura.", "Hace referencia al modo lectura.", "Hace referencia al modo lectura escritura.", "Todas con correctas.", "2");
            /*09*/      tipo_test("Aplicando el m�todo close(), conseguiremos ...", "Finalizar nuestra aplicaci�n.", "Bloquear nuestro fichero contra escritura.", "Cerrar la lectura del fichero.", "Cerrar el flujo de datos, liberando los recursos ocupados.", "4");
            /*10*/      tipo_test("Si quisiera saber el posicionamiento del puntero usando una clase\n        RandomAccessFile ...", "Usariamos el m�todo seek().", "Usar�amos el m�todo getFilePointer().", "Usar�amos el m�todo read().", "Ninguna es correcta.", "2");                        
                    }
                    case "2" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("Se podr�a definir un flujo o Stream como ...", "Un fichero de corta extensi�n.", "Una secuencia ordenada de informaci�n.", "Un m�todo gen�rico.", "Una clase muy conocida.", "2");
            /*02*/      tipo_test("La clase PipedInputStream pertenece a ...", "El subconjunto de clases de Buffer", "El subconjunto de clases de tuber�as.", "El subconjunto de clases de Arrays.", "Ninguna es correcta.", "2");
            /*03*/      tipo_test("La clase DataInputStream leer� ...", "Solo tipos de datos String.", "Tipos de datos String e Integer.", "Tipos de datos primitivos de java.", "Todas son correctas.", "3");
            /*04*/      tipo_test("Para instanciar un nuevo hilo de ejecuci�n usaremos la clase ...", "FileInput", "FileOutput", "Stream", "Thread", "4");
            /*05*/      tipo_test("�Qu� conocido m�todo devuelve el byte al stream de datos?", "Read()", "Unread()", "Re-read()", "Unreadeable()", "2");
            /*06*/      tipo_test("�Que nos indica el m�todo TT_EOF de la clase StreamTokenizer?", "Inicio del fichero", "Fin de l�nea.", "Fin del fichero.", "Error.", "3");
            /*07*/      tipo_test("�Qu� m�todo nos indica que un token es de tipo palabra?", "TT_EOL", "TT_EOF", "TT_LOP", "TT_WORD", "4");
            /*08*/      tipo_test("La clase LineNumber reader tiene un m�todo que nos indica la l�nea en la que estamos\n        posicionados leyendo. �De qu� m�todo hablamos?", "getLineNumber()", "getLine()", "getNumber()", "getMyLine()", "1");
            /*09*/      tipo_test("�Qu� m�todo de la clase DataOutputStream se usa para escribir un objeto de tipo Long?", "Write()", "writeLong()", "writeNumber()", "Todas son correctas.", "2");
            /*10*/      tipo_test("�Qu� clase fue desarrollada para leer datos primitivos de Java?", "DataInputStream", "DataStream", "Data", "Date", "1");
                    }
                    case "3" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una ventaja real del analizador DOM es ...", "Una vez introducido el fichero obtenemos el �rbol con sus nodos.", "Velocidad de proceso.", "Velocidad de ejecuci�n.", "Instanciaci�n.", "1");
            /*02*/      tipo_test("El parser SAX es un analizador basado en ...", "Listas.", "Eventos.", "La edici�n.", "La escritura.", "2");
            /*03*/      tipo_test("�Qu� m�todo es el encargado de cargar el fichero en memoria en los analizadores?", "El m�todo unparse.", "El m�todo load.", "El m�todo parse.", "El metodo execute.", "3");
            /*04*/      tipo_test("�Con cu�l de los siguientes m�todos obtendremos una lista de los nodos en XPATH?", "ShowNodes()", "Compile() y evaluate()", "Clear()", "Load()", "2");
            /*05*/      tipo_test("�Qu� tipo de excepci�n es notificada en tiempo de compilaci�n?", "Excepci�n con chequeo.", "Excepci�n sin chequeo.", "Excepci�n con notificaci�n.", "Excepci�n sin notificaci�n.", "1");
            /*06*/      tipo_test("El m�todo que nos devuelve la causa de la excepci�n en un objeto Throwable es ...", "getmessage()", "getString()", "toString()", "getCause()", "4");
            /*07*/      tipo_test("�Qu� sentencia usamos en las excepciones para identificarlas y tratarlas?", "Try/catch", "Throw", "Call", "Take", "1");
            /*08*/      tipo_test("Cuando usamos la palabra reservada \"Throws\" en la definici�n de un m�todo ...", "Estamos lanzando la excepci�n a un nivel superior.", "Obviamos dicha excepci�n.", "Estar�amos tratando dicha excepci�n.", "Todas son falsas.", "1");
            /*09*/      tipo_test("Con la anotaci�n @Before ...", "Ejecutamos dicho c�digo despu�s del test ejecutado.", "Ejecutamos algunos tests.", "Ejecutamos dicho c�digo antes del test ejecutado.", "Todas son falsas.", "3");
            /*10*/      tipo_test("Un test unitario ...", "Es una pieza de c�digo �nica por su val�a.", "Es una pieza de c�digo que valida otra parte de c�digo.", "Es un c�digo que se ejecuta en los entornos de integraci�n.", "Todas son verdaderas.", "2");                       
                    }
                    case "4" -> {
                        _Main_.Principal.setTema(menu);                     
                        
            /*01*/      tipo_test("Al conjunto de clases y librer�as que unen la parte del cliente con la base de datos lo\n        llamamos:", "Conector.", "Enlazador.", "Puerto.", "Sector.", "1");
            /*02*/      tipo_test("Definimos el desfase objeto-relacional a ...", "Al tiempo de conexi�n.", "Las dificultades que surgen cuando trabajamos con un aplicativo y una base de datos\n    relacional.", "Nombre de base de datos.", "Tipo de base de datos.", "2");
            /*03*/      tipo_test("Elige el protocolo de conexi�n m�s usado con bases de datos con lenguaje SQL.", "JDBC.", "LDAP.", "OBDC.", "ORACLE.", "1");
            /*04*/      tipo_test("�Qu� componente es el encargado de realizar la conexi�n entre nuestro aplicativo y el\n        driver apropiado JDBC?", "El T driver.", "El gestor JDBC.", "RJK driver.", "Java driver.", "2");
            /*05*/      tipo_test("�Cu�ntos tipos de drivers JDBC existen?", "1", "3", "4", "8", "3");
            /*06*/      tipo_test("Antes de escribir el c�digo necesario para gestionar la conexi�n desde Java hay que ...", "Compilar nuestro proyecto.", "A�adir nuestro fichero de driver (normalmente .jar) al classpath del proyecto.", "Ejecutar un comando para crear base de datos.", "Todas son falsas.", "2");
            /*07*/      tipo_test("Ser� la encargada de realizar la conexi�n con la base de datos ...", "La clase Connection.", "La clase DriverManager.", "La clase Exception.", "La clase Statement.", "1");
            /*08*/      tipo_test("�A trav�s de qu� objeto podremos ejecutar el m�todo executeQuery()?", "Connection", "Statement", "DriverManager", "Resulset", "2");
            /*09*/      tipo_test("En una variable de tipo ResulSet ...", "Podremos iniciar una conexi�n.", "Podremos almacenar los resultados de una consulta.", "Podremos ejecutar todo tipo de consultas.", "Todas con correctas.", "2");
            /*10*/      tipo_test("Gestionar los distintos drivers que tenemos en un aplicativo y presentarlos en la\n        misma capa para tener acceso a ellos es tarea de ...", "Statement", "Resulset", "Connection", "DriverManager", "4");
                    }
                    case "5" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una base de datos embebida en disco almacena la informaci�n en:", "Memoria Ram.", "Disco duro.", "Procesador.", "Cach�.", "2");
            /*02*/      tipo_test("Una base de datos en memoria almacena la informaci�n en:", "Memoria Ram.", "Disco duro.", "L�piz de memoria.", "Todas son falsas.", "1");
            /*03*/      tipo_test("Una base de datos independiente:", "Usa la misma JVM de la aplicaci�n.", "Est� embebida en el aplicativo.", "Es menos potente que una embebida", "Todas son falsas.", "4");
            /*04*/      tipo_test("ObjectDB ...", "M�s que una base de datos relacional es una base de datos orientada a objetos.", "Es relacional pura.", "Es independiente.", "Todas son falsas.", "1");
            /*05*/      tipo_test("Spring boot nos ayuda en:", "Despliegue de la aplicaci�n entre otras cosas.", "Sintaxis.", "Variables de entorno.", "Todas son falsas.", "1");
            /*06*/      tipo_test("Uno de los objetivos clave de Spring boot en esta unidad es:", "Aprender los diferentes tipos de conectores", "Aprender a a�adir las dependencias y embeber una base de datos.", "Aprender excepciones.", "Todas son verdaderas.", "2");
            /*07*/      tipo_test("Una de las principales ventajas de la web spring.io es:", "Podemos a�adir las dependencias de forma transparente eligi�ndolas en la misma web.", "Manejo de excepciones.", "Puedes elegir distintos conectores.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Con la clave: spring.datasource.username", "Accederemos a una table de base de datos.", "Indicaremos el nombre de usuario de acceso al panel de control.", "Accedemos al aplicativo.", "Todas son verdaderas.", "2");
            /*09*/      tipo_test("Si nos encontramos la siguiente clave en un fichero .properties:\n        spring.datasource.url=jdbc:h2:mem:testdb", "Podremos decir que la base de datos se almacenar� en disco.", "Podremos decir que la base de datos se almacenar� en memoria.", "No se almacenar� nada.", "Todas con correctas.", "2");
            /*10*/      tipo_test("Las bases de datos cliente/servidor:", "Son embebidas", "Son independientes.", "Son bases de datos en memoria.", "Son bases de datos gestoras.", "2");
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("El comando que nos permite cambiar las condiciones generales de la base de datos\n        es ...", "ALTER TABLE", "ALTER DATABASE", "ALTER BASE", "ALTER INDEX", "2");
            /*02*/      tipo_test("El comando que nos permite cambiar las condiciones generales de una tabla de una\n        base de datos es ...", "ALTER TABLE", "ALTER DATABASE", "ALTER BASE", "ALTER INDEX", "1");
            /*03*/      tipo_test("Con el comando CREATE INDEX ...", "Crearemos un campo en una tabla.", "Modificaremos un campo de una tabla.", "Crearemos un �ndice para un campo espec�fico.", "Todas son falsas.", "3");
            /*04*/      tipo_test("Necesitaremos tener el permiso DROP para ejecutar ...", "DROP TABLE", "CREATE INDEX", "ALTER TABLE", "ALTER DATABASE", "1");
            /*05*/      tipo_test("�Con qu� comando podremos renombrar una o m�s tablas?", "DROP TABLE", "RENAME TABLE", "DROP INDEX", "NAME TABLE", "2");
            /*06*/      tipo_test("Selecciona el comando por medio del cual eliminaremos filas en nuestra base de\n        datos", "DROP TABLE", "DELETE", "CLEAN", "INSERT", "2");
            /*07*/      tipo_test("Con el comando SELECT:", "Realizaremos una consulta de datos a base de datos.", "Seleccionaremos directamente una tabla.", "Seleccionaremos un campo.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Con la palabra clave FROM en SQL:", "Borraremos datos.", "Podremos asignar una o m�s tablas o vistas a la sentencia SELECT.", "Insertaremos datos.", "Todas son verdaderas.", "2");
            /*09*/      tipo_test("�Qu� clave usaremos para realizar comparaciones con los registros?", "DELETE", "INSERT", "ALTER", "LIKE", "4");
            /*10*/      tipo_test("�Qu� m�todo es el que usaremos para realizer consultas con un objeto Statement?", "executeQuery()", "executeSelect()", "executeUpdate()", "Todas son verdaderas.", "1");
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Un Framework que facilita el almacenamiento de los objetos a una base de datos\n        relacional es un ...", "Gestor de datos.", "ORM.", "ROM.", "Gestor relacional.", "2");
            /*02*/      tipo_test("Mejorar la eficiencia en el desarrollo ...", "Es una ventaja de usar un ORM.", "No debe influir a la hora de usar un ORM.", "Influye al usar depende qu� tipo de base de datos relacional.", "Todas son falsas.", "1");
            /*03*/      tipo_test("EBEAN e IBATIS son ...", "Bases de datos que podemos elegir.", "Diferentes drivers de conexi�n.", "Distintas opciones de ORM del mercado.", "Todas son falsas.", "3");
            /*04*/      tipo_test("Nhibernate es ...", "La opci�n que disponemos del Framework Hibernate en lenguaje .Net.", "Una versi�n m�s potente de Hibernate.", "Una versi�n lite de Hibernate.", "Un Framework de control de seguridad.", "1");
            /*05*/      tipo_test("�Qu� caracter�sticas b�sicas podemos decir que tiene Hibernate?", "Sencillo y pesado.", "Simplicidad y robusto.", "F�cil de instalar y ligero.", "Todas son falsas.", "2");
            /*06*/      tipo_test("�De qu� principio Java hace uso el Framework Hibernate?", "Reflexi�n.", "Multiplataforma.", "Autoensamblaje.", "Todas son falsas.", "1");
            /*07*/      tipo_test("El principio de reflexi�n hace referencia a:", "Todos los objetos se pueden sobrescribir.", "Los objetos no son manipulables.", "Permite el an�lisis y la modificaci�n de los distintos atributos y caracter�sticas de las\n    distintas clases en tiempo de ejecuci�n.", "Todas son verdaderas.", "3");
            /*08*/      tipo_test("�Qu� objeto usaremos en Hibernate para instanciar una conexi�n directa con nuestra\n        base de datos relacional?", "SessionFactory Object", "Session Object.", "Query Object.", "ORM.", "2");
            /*09*/      tipo_test("�Qu� objeto es el encargado de coger el fichero de configuraci�n entre otras\n        funciones?", "SessionFactory Object", "Session Object.", "Query Object.", "ORM.", "1");
            /*10*/      tipo_test("�En qu� fichero podremos introducir nuestras configuraciones de Hibernate?", "Application.properties.", "App.zip.", "Configuration.config.", "Todas son falsas.", "1");                        
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una de las caracter�sticas de una clase persistente ser�a:", "Tener al menos un constructor por defecto.", "Tener m�nimo 4 atributos.", "M�nimo deber contener 50 l�neas de c�digo.", "Todas son falsas.", "1");
            /*02*/      tipo_test("Que todas las clases deban contener un atributo ID para mejorar la identificaci�n de\n        los objetos es una caracter�stica principal de:", "Las clases POJO.", "Clases persistentes.", "Clases Service.", "Clases DAO.", "2");
            /*03*/      tipo_test("En la construcci�n de clases persistentes es importante tener:", "Los m�todos getter y setter definidos.", "Una instancia de un servicio dentro de la clase.", "Un atributo que se llame \"name\" cuyo nombre sea la clase.", "Todas son falsas.", "1");
            /*04*/      tipo_test("Con la etiqueta <hibernate-mapping> ...", "Podremos colocar la configuraci�n b�sica de hibernate.", "Configuraremos algunos aspectos de mapeo generales.", "Almacenaremos las clases definidas que queramos persistir.", "Todas son verdaderas.", "3");
            /*05*/      tipo_test("Con los elementos <meta> del archivo de mapeo podremos ...", "Establecer la descripci�n de la clase que estamos definiendo.", "Definir los atributos principales de la clase.", "Establecer el contenido de una columna.", "Todas son falsas.", "1");
            /*06*/      tipo_test("�Con qu� elemento mapearemos los atributos o propiedades Java y los\n        transformaremos en columnas de base de datos?", "<attributes>", "<property>", "<set>", "<get>", "2");
            /*07*/      tipo_test("�Qu� estado tendr�a un objeto persistente que fuese una nueva instancia, que no est�\n        a�n asociada a un objeto de sesi�n y no tiene representaci�n en la base de datos ni\n        identificador seg�n Hibernate?", "Persistent.", "Transient.", "Detached.", "Labeled.", "2");
            /*08*/      tipo_test("El m�todo clear() del objeto session ...", "Cerrar� la session.", "Eliminar� completamente la sesi�n.", "Borrar� la cach� Hibernate.", "Todas son verdaderas.", "2");
            /*09*/      tipo_test("El m�todo createCriteria() que se ejecuta desde un objeto de session devolver�:", "Un objeto Query.", "Un objeto Criteria.", "Un objeto Transaction.", "Un objeto Session.", "2");
            /*10*/      tipo_test("�Con qu� m�todo comprobamos si la session est� actualmente conectada?", "isOpen().", "isConnected().", "refresh().", "getSessionFactory().", "2");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Cuando las t�cnicas de bases de datos son combinadas con objetos,\n        obtenemos como resultado:", "Una base de datos relacional.", "Un sistema gestor de base de datos orientado a objetos.", "Una base de datos no-relacional.", "Todas son falsas.", "2");
            /*02*/      tipo_test("Una vez que la base de datos mantiene una relaci�n directa entre el mundo real y los\n        objetos podemos decir que los objetos no pierden:", "Ni su identidad ni su integridad.", "La estructura.", "La implementaci�n.", "Todas son verdaderas.", "1");
            /*03*/      tipo_test("Las caracter�sticas que definen los objetos las llamamos:", "Identidades.", "Clases.", "Objetos.", "Atributos.", "4");
            /*04*/      tipo_test("�Qu� caracter�stica representa la informaci�n y las implementaciones de los m�todos\n        ocultando las entidades externas?", "Integridad.", "Identidad.", "Encapsulaci�n.", "Todas son verdaderas.", "3");
            /*05*/      tipo_test("Identifica la caracter�stica que NO pertenece a un sistema de bases de datos gen�rico:", "Concurrencia.", "Recuperaci�n de errores.", "Consultas.", "Aislamiento.", "4");
            /*06*/      tipo_test("Las siglas del lenguaje de consulta de objetos son:", "SQLO.", "OQL.", "OOQ.", "OLQ.", "2");
            /*07*/      tipo_test("Los objetos de una clase pueden ser organizados de nuevo formando ciertas\n        agrupaciones que pueden ser relevantes de inter�s para la base de datos.\n        Esto hace referencia a:", "Especializaci�n, generalizaci�n y herencia.", "Integridad.", "Encapsulaci�n.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Una ventaja de las bases de datos orientadas a objetos es:", "La persistencia es totalmente distinta.", "La rapidez de persistir.", "Los objetos son livianos.", "Disponemos de una mayor capacidad para realizar el modelado.", "4");
            /*09*/      tipo_test("Selecciona la caracter�stica espec�fica de un sistema gestor de bases de datos\n        orientado a objetos:", "Consultas.", "Concurrencia.", "Modularidad.", "Persistencia.", "3");
            /*10*/      tipo_test("El lenguaje OQL:", "Es un lenguaje declarativo de tipolog�a SQL.", "Es un lenguaje sin relaci�n a SQL.", "Es SQL nativo.", "Todas son falsas.", "1");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una combinaci�n de una base de datos relacional y una orientada a objetos\n        es lo que llamamos como:", "Una base de datos relacional objeto.", "Base de datos objeto relacional.", "Base de datos segmentada.", "Todas son falsas.", "2");
            /*02*/      tipo_test("Usaremos la clave objet type :", "Para crear tipos del sistema.", "Para crear tipos de objeto de usuario.", "Para crear tablas.", "Para definir atributos.", "2");
            /*03*/      tipo_test("Un objeto representa una entidad en el mundo real y se compone de:", "Nombre, atributos y m�todos.", "Definici�n y columnas.", "Tablas y columnas.", "Todas son falsas.", "1");
            /*04*/      tipo_test("Una vez definido un tipo �Qu� objetivos podremos tener?", "Definir nuevos tipos.", "Almacenamiento en tablas de esos tipos.", "Definir distintos atributos de una tabla.", "Todas son verdaderas.", "4");
            /*05*/      tipo_test("�Qu� es un VARRAY?", "Concurrencia.", "Un tipo de colecci�n en Oracle.", "Un objeto de sistema.", "Todas son falsas.", "2");
            /*06*/      tipo_test("Elige entre las opciones una de los objetivos que tendr�amos despu�s de crear\n        un VARRAY:", "Definir la tipolog�a de una columna de una tabla relacional.", "Crear listas de tablas.", "Definir un atributo.", "Todas son falsas.", "1");
            /*07*/      tipo_test("A una lista de elementos no ordenados y todos ellos con la misma tipolog�a podremos\n        definirlo como tipo de colecci�n:", "VARRAY.", "Lista.", "PL/SQL.", "Tabla anidada.", "4");
            /*08*/      tipo_test("Una referencia en Oracle es:", "Un enlace a un objeto de la tipolog�a definida y que a su vez genera una relaci�n entre ambos.", "Un Id que se le asigna a un atributo.", "Un atributo cualquiera.", "Todas son falsas.", "1");
            /*09*/      tipo_test("La sintaxis que tenemos en Oracle para las referencias es:", "REFER.", "R.", "REF.", "REFERENCE.", "3");
            /*10*/      tipo_test("A trav�s de la herencia de tipos podremos:", "Ser mucho m�s eficientes escribiendo c�digo.", "A�adir directamente caracter�sticas de los elementos padres a los hijos.", "Ahorrar tiempo.", "Todas son verdaderas.", "4");                        
                    }
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Definimos a un conjunto de m�quinas definidas como servidores de procesamiento paralelo:", "Servidores en paralelo.", "Servidores en serie.", "Cluster.", "Windows server.", "3");
            /*02*/      tipo_test("�Qu� entendemos como ausencia de Schemaless?", "Opci�n de un sistema.", "Caracter�stica muy flexible, se puede almacenar informaci�n no uniforme\n    y se facilita la evoluci�n.", "Sirve para crear tablas.", "Todas son falsas.", "2");
            /*03*/      tipo_test("Identifica el tipo de base de datos NoSQL:", "Base de datos clave/valor.", "Base de datos relacional.", "Base de datos de objetos.", "Todas son falsas.", "1");
            /*04*/      tipo_test("Las bases de datos basadas en gr�ficos:", "Son menos eficientes que las relacionales.", "Es un tipo de base de datos NoSQL.", "Son mucho m�s r�pidas.", "Todas son verdaderas.", "2");
            /*05*/      tipo_test("La base de datos Cassandra es un tipo de base de datos:", "Clave/valor.", "Basado en columnas.", "Basada en gr�ficos.", "No existe.", "2");
            /*06*/      tipo_test("Identifica uno de los beneficios de las bases datos NOSQL:", "Facilidad de montaje.", "Extensi�n m�ltiple.", "Disponibilidad continua.", "Todas son verdaderas.", "3");
            /*07*/      tipo_test("Uno de los beneficios y caracter�sticas m�s notorios de las bases de datos NoSQL es:", "Capacidad Big Data.", "Extensi�n m�ltiple.", "F�cil transferencia.", "Todas son falsas.", "1");
            /*08*/      tipo_test("M�ltiples centros de datos sin preocuparse de la cantidad de operaciones de lectura y\n        escritura atienden al beneficio:", "Capacidad de mostrar toda la informaci�n.", "Capacidad de tener m�ltiples centros de datos.", "F�cil acceso.", "Todas son falsas.", "2");
            /*09*/      tipo_test("Infogrid es una base de datos NoSQL basada en:", "Gr�ficos.", "Columnas.", "Clave/valor.", "Documentos.", "1");
            /*10*/      tipo_test("Identifica el que no es un tipo de Big Data:", "Estructurado.", "No estructurado.", "Semiestructurado.", "Norelacional.", "4");                        
                    }
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("MongoDb es:", "Una base de datos relacional.", "Una base de datos orientada a objetos basada en grafos.", "Una base de datos basada en documentos.", "Todas son falsas.", "3");
            /*02*/      tipo_test("La estructura de los documentos en MonboDB:", "Es en formato Json e internamente son almacenado en Bson.", "Formato .doc", "Formato .txt", "Sin formato.", "1");
            /*03*/      tipo_test("Una de las caracter�sticas principales de MongoDB:", "La mayor�a de los datos residen en memoria. Lecturas y escrituras muy r�pidas.", "La mayor�a de los datos residen en disco duro. Almacenamientos seguros.", "La mayor�a de los datos se almacenan a trav�s de la red.", "Todas son falsas.", "1");
            /*04*/      tipo_test("�Cu�l es el t�rmino para denominar a la tabla del mundo relacional en MongoDB?", "Documento.", "Colecci�n.", "Bases de datos.", "JSON.", "2");
            /*05*/      tipo_test("Alguno de los motores de almacenamiento puede ser:", "Sharding.", "MVC.", "WiredTiger.", "Sofield.", "3");
            /*06*/      tipo_test("Cu�les son las 3 caracter�sticas que se eval�an en el teorema de CAP:", "Tolerancia, Consistencia y Datos.", "Tolerancia, Disponibilidad y Certeza.", "Tolerancia, Disposici�n y Certeza.", "Tolerancia, Disponibilidad y Consistencia.", "4");
            /*07*/      tipo_test("�Qu� es Mongod?", "Servicio principal de la base de datos. Maneja los accesos a datos.", "Es un fichero de configuraci�n .conf.", "Es un fichero de documentaci�n para la base de datos.", "Todas son falsas.", "1");
            /*08*/      tipo_test("Selecciona el servicio que se utiliza en Mongo para realizar Shard:", "Mongod.", "Mongo.", "Mongos.", "mongodump.", "3");
            /*09*/      tipo_test("�Qu� herramienta usamos en MongoDB para convertir ficheros Bson a otros formatos?", "Mongos.", "Bsondump.", "Mongoexport.", "mongoimport.", "2");
            /*10*/      tipo_test("�Qu� comando usaremos en la Shell de mongo para recibir ayuda sobre los comandos\n        ejecutables sobre la base de datos?", "Show dbs", "db", "use db", "db.help()", "4");                        
                    }
                    case "13" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una caracter�stica de un �ndice es:", "Se almacerna en memoria.", "Se almacena en disco duro.", "No se almacena.", "Todas son falsas.", "1");
            /*02*/      tipo_test("Los operadores de negaci�n:", "Utilizan �ndices siempre.", "No utilizan �ndices.", "Usan �ndices cuando es necesario.", "Todas son falsas.", "2");
            /*03*/      tipo_test("Los �ndices monoclave:", "Indexan por dos campos.", "Indexan por dos o m�s campos.", "Solo indexan por un campo de los documentos de la colecci�n.", "Todas son falsas.", "3");
            /*04*/      tipo_test("Los �ndices monoclave:", "No son eficientes.", "Solo afectan a un campo de b�squeda.", "Son �ndices de texto.", "Se les llama tambi�n geoespaciales.", "2");
            /*05*/      tipo_test("Los �ndices Hashed:", "Indexan por coordenadas.", "Solo puede haber una correspondencia entre entrada del �ndice y documento.", "Son poco eficientes.", "Indexan de forma clave/valor.", "4");
            /*06*/      tipo_test("Una covered query:", "Es una consulta normal a base de datos.", "Es una consulta a base de datos compleja.", "Es una consulta que se resuelve contra un �ndice sin consultar datos de la colecci�n.", "Todas son falsas.", "3");
            /*07*/      tipo_test("Utilizamos la regeneraci�n de �ndice para:", "Borrar un �ndice.", "Crear uno nuevo.", "Volver a crear un �ndice ya creado previamente.", "Listar los �ndices asociados a una colecci�n.", "3");
            /*08*/      tipo_test("�Con qu� comando crearemos un usuario en MongoDB?", "Db.create().", "Db.createUser().", "Cr�ate.user.", "User.create().", "2");
            /*09*/      tipo_test("�Para qu� usaremos el campo 'roles' de nuestro comando db.createUser()?", "Array donde indicaremos los permisos del nuevo usuario.", "Permisos que no tendr� el nuevo usuario.", "Permisos de m�s alto nivel.", "Todas son falsas.", "1");
            /*10*/      tipo_test("�Cu�l es la herramienta oficial que propone MongoDB para gestionar visualmente\n        la base de datos (importar, exportar, etc)?", "Generate app.", "showData.", "removeData.", "Compass.", "4");                        
                    }
                    case "14" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Las bases de datos XML nativas son bases de datos que:", "Almacenan documentos y datos XML de una forma eficiente.", "No realizan consultas.", "No son integrables.", "Todas son falsas.", "1");
            /*02*/      tipo_test("Las bases de datos XML nativas:", "Se basan en tablas.", "Tienen consultas SQL.", "Se basan en los llamados contenedores.", "Todas son verdaderas.", "3");
            /*03*/      tipo_test("Un sistema XML de base de datos de c�digo abierto ser�a:", "Excelon.", "GoXML.", "ExistDB.", "Todos son de c�digo abierto.", "3");
            /*04*/      tipo_test("Las bases de datos XML se consultan con:", "Consultas SQL.", "Consultas Mish.", "Expresiones regulares.", "Expresiones XPath.", "4");
            /*05*/      tipo_test("En la instalaci�n de ExistDB, �Qu� cach� es recomendado asignar?", "128MB.", "200TB.", "20MB.", "1TB.", "1");
            /*06*/      tipo_test("En la instalaci�n de ExistDB �Cu�nta RAM es recomendable asignar?", "5000MB.", "200MB.", "1024MB.", "Todas son falsas.", "3");
            /*07*/      tipo_test("�Qu� paquete es esencial a la hora de instalar ExistDB y estaremos forzados a integrar?", "El paquete APP.", "Sources.", "Core.", "Core y Sources.", "3");
            /*08*/      tipo_test("�A qu� ruta del navegador accederemos para ir a nuestro Dashboard en ExistDB?", "https://localhost", "http://localhost", "http://localhost:8080/exist/", "Todas son falsas.", "3");
            /*09*/      tipo_test("�Cu�l no es una estrategia de almacenamiento en bases de datos xml nativas?", "Basado en texto.", "Basado en modelo.", "Almacenando en local.", "Almacenando en la nube.", "4");
            /*10*/      tipo_test("�Qu� paqueter�a nos habilitar� la clase DatabaseManager?", "Org.xmldb.api", "Api.xmldb", "Org.api", "Todas son falsas.", "1");                        
                    }
                    case "15" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una unidad de software que encapsula un segmento de c�digo con ciertas funciones\n        lo definimos como:", "Componente.", "Funci�n.", "M�todo.", "Todas son falsas.", "1");
            /*02*/      tipo_test("Elige la opci�n falsa. Un componente est� formado por:", "Atributos.", "Propiedades.", "Eventos.", "EndPoint.", "4");
            /*03*/      tipo_test("Elige la opci�n v�lida de escribir un m�todo get():", "getNombreX().", "getNombreDeLaPropiedad().", "setNombre().", "getNombre().", "2");
            /*04*/      tipo_test("Los componentes tienen los siguientes tipos de atributos:", "Compartidos.", "Indexados.", "Simples.", "Todas son correctas.", "4");
            /*05*/      tipo_test("Para que un componente acepte propiedades compartidas, �Qu� m�todos debe\n        integrar?", "addPropertyChangeListener.", "removePropertyChangeListener.", "oldremove.", "Hay dos opciones correctas.", "4");
            /*06*/      tipo_test("Cuando un componente se activa mediante el funcionamiento de otro lo\n        denominamos:", "Retroceso.", "Control activo.", "Control pasivo.", "Todas son falsas.", "2");
            /*07*/      tipo_test("�Con qu� clase usamos la introspecci�n con EJBs?", "Instrospection.", "Api.Javax.", "Core.", "Introspector.", "4");
            /*08*/      tipo_test("�Con qu� biblioteca usamos la persistencia de los componentes?", "JPA.", "HPA.", "RPA.", "SPA.", "1");
            /*09*/      tipo_test("�Qu� clase ayuda a crear objetos EntityManager utilizando el patr�n de dise�o\n        Factory?", "Entity.", "EntityManagerFactory.", "Factory.", "Todas son falsas.", "2");
            /*10*/      tipo_test("�Con qu� objeto realizamos las consultas en JPA?", "Query.", "Transaction.", "EntityManager.", "Entity.", "1");                        
                    }
                    case "40" -> AccesoDatos.Test_Rep_I_Acc_Dat.test_Repaso();
                    case "50" -> AccesoDatos.Test_Rep_II_Acc_Dat.test_Repaso();
                    
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
