package AccesoDatos;

import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Test_Rep_II_Acc_Dat {
    
    public static void test_Repaso() {
        
                        _Main_.Principal.setAsignatura("ACCESO A DATOS"); //     
                        _Main_.Principal.setTema("REPASO II");
                        
           /*001*/      tipo_test("�Cu�l es la buena pr�ctica que hemos visto, para empaquetar y distribuir una aplicaci�n\n        J2EE?", "Un �nico fichero .JAVA con m�dulos .WAR.", "Un fichero .CLASS con m�dulos .EJB.", "Un fichero .ZIP.", "Un fichero .EAR con m�dulos .WAR y .EJB-JAR.", "4");
           /*002*/      tipo_test("Una de las caracter�sticas de una clase persistente ser�a:", "Tener al menos un constructor por defecto.", "Tener m�nimo 4 atributos.", "M�nimo deber contener 50 l�neas de c�digo.", "Todas son falsas.", "1");
           /*003*/      tipo_test("Utilizamos la regeneraci�n de �ndice para:", "Borrar un �ndice.", "Crear uno nuevo.", "Volver a crear un �ndice ya creado previamente.", "Listar los �ndices asociados a una colecci�n.", "3");
           /*004*/      tipo_test("En un fichero de mapeo de Hibernate, el elemento <property> se usa para mapear ...", "El atributo �nico ID en la parte de la clase Java.", "La clave primaria.", "Los atributos o propiedades de Java.", "El nombre de la tabla en SQL.", "3");
           /*005*/      tipo_test("M�ltiples centros de datos sin preocuparse de la cantidad de operaciones de lectura y\n        escritura atienden al beneficio:", "Capacidad de mostrar toda la informaci�n.", "Capacidad de tener m�ltiples centros de datos.", "F�cil acceso.", "Todas son falsas.", "2");
           /*006*/      tipo_test("Es un tipo de base de datos No-SQL:", "Cliente/Servidor.", "ORM.", "Base de datos basada en documentos.", "Base de datos clave/fila.", "3");
           /*007*/      tipo_test("Seg�n el tipo de almacenamiento, las bases de datos nativas XML pueden clasificarse en:", "2 tipos: basado en texto o basado en el modelo.", "2 tipos: almacenamiento en remoto o almacenamiento local.", "2 tipos: basado en el modelo, o almacenamiento local.", "3 tipos: basado en texto, basado en el modelo, o mediante almacenamiento local.", "4");
           /*008*/      tipo_test("Elige la opci�n falsa. Un componente est� formado por:", "Atributos.", "Propiedades.", "Eventos.", "EndPoint.", "4");
           /*009*/      tipo_test("Una vez definido un tipo �Qu� objetivos podremos tener?", "Definir nuevos tipos.", "Almacenamiento en tablas de esos tipos.", "Definir distintos atributos de una tabla.", "Todas son verdaderas.", "4");
           /*010*/      tipo_test("Cuando las t�cnicas de bases de datos son combinadas con objetos,\n        obtenemos como resultado:", "Una base de datos relacional.", "Un sistema gestor de base de datos orientado a objetos.", "Una base de datos no-relacional.", "Todas son falsas.", "2");
           
           /*011*/      tipo_test("�Cu�l de las siguientes clases NO es uno de los 6 componentes principales que hemos\n        visto, para JPA?", "Ejbcore.", "Persistence.", "EntityManager.", "Query.", "1");
           /*012*/      tipo_test("Que todas las clases deban contener un atributo ID para mejorar la identificaci�n de\n        los objetos es una caracter�stica principal de:", "Las clases POJO.", "Clases persistentes.", "Clases Service.", "Clases DAO.", "2");
           /*013*/      tipo_test("�Con qu� comando crearemos un usuario en MongoDB?", "Db.create().", "Db.createUser().", "Cr�ate.user.", "User.create().", "2");
           /*014*/      tipo_test("Los tipos de m�dulos J2EE para aplicaciones web EJB son:", "M�dulo .jar y m�dulo .war.", "M�dulos EJB, m�dulo web, m�dulo de la aplicaci�n cliente y m�dulo del adaptador de recursos.", "M�dulo Web y m�dulo de la aplicaci�n cliente.", "M�dulo Web y m�dulo administrador.", "2");
           /*015*/      tipo_test("Infogrid es una base de datos NoSQL basada en:", "Gr�ficos.", "Columnas.", "Clave/valor.", "Documentos.", "1");
           /*016*/      tipo_test("Las bases de datos No-SQL ...", "Siguen un esquema fijo de filas y columnas.", "Facilitan el escalado vertical.", "No siguen los principios ACID.", "Todas son correctas.", "3");
           /*017*/      tipo_test("En MongoDB, la operaci�n \"Create\" se realiza con:", "Append.", "Insert.", "Create.", "Add.", "2");
           /*018*/      tipo_test("Elige la opci�n v�lida de escribir un m�todo get():", "getNombreX().", "getNombreDeLaPropiedad().", "setNombre().", "getNombre().", "2");
           /*019*/      tipo_test("�Qu� es un VARRAY?", "Concurrencia.", "Un tipo de colecci�n en Oracle.", "Un objeto de sistema.", "Todas son falsas.", "2");
           /*020*/      tipo_test("Una vez que la base de datos mantiene una relaci�n directa entre el mundo real y los\n        objetos podemos decir que los objetos no pierden:", "Ni su identidad ni su integridad.", "La estructura.", "La implementaci�n.", "Todas son verdaderas.", "1");
           
           /*021*/      tipo_test("�Cu�l es la diferencia entre los POJOs y los BEANs?", "Los POJOs son objetos planos de Java.", "Los BEANs se definen en la especificaci�n Enterprise JavaBean.", "Todos los BEANs son POJOs.", "Todas son correctas.", "4");
           /*022*/      tipo_test("En la construcci�n de clases persistentes es importante tener:", "Los m�todos getter y setter definidos.", "Una instancia de un servicio dentro de la clase.", "Un atributo que se llame \"name\" cuyo nombre sea la clase.", "Todas son falsas.", "1");
           /*023*/      tipo_test("�Para qu� usaremos el campo 'roles' de nuestro comando db.createUser()?", "Array donde indicaremos los permisos del nuevo usuario.", "Permisos que no tendr� el nuevo usuario.", "Permisos de m�s alto nivel.", "Todas son falsas.", "1");
           /*024*/      tipo_test("Las propiedades de un componente de acceso a datos, se dividen en:", "Simples, indexadas, compartidas y restringidas.", "Simples, complejas, compartidas y privadas.", "Individuales, complejas, compartidas y locales.", "Libres y comerciales.", "1");
           /*025*/      tipo_test("Identifica el que no es un tipo de Big Data:", "Estructurado.", "No estructurado.", "Semiestructurado.", "Norelacional.", "4");
           /*026*/      tipo_test("Bajo la perspectiva del Big Data, XML es un ejemplo de tipo de dato ...", "Basado en grafos.", "Estructurado.", "No estructurado.", "Semi-estructurado.", "4");
           /*027*/      tipo_test("Dos caracter�sticas comunes de las bases de datos No-SQL son:", "Modelo de datos relacional, y sin esquema (schemaless).", "Modelo de datos relacional, y con esquema (schemaless).", "Modelo de datos no relacional, y sin esquema (schemaless).", "Modelo de datos no relacional, y con esquema (schemaless).", "3");
           /*028*/      tipo_test("Los componentes tienen los siguientes tipos de atributos:", "Compartidos.", "Indexados.", "Simples.", "Todas son correctas.", "4");
           /*029*/      tipo_test("Elige entre las opciones una de los objetivos que tendr�amos despu�s de crear\n        un VARRAY:", "Definir la tipolog�a de una columna de una tabla relacional.", "Crear listas de tablas.", "Definir un atributo.", "Todas son falsas.", "1");
           /*030*/      tipo_test("Las caracter�sticas que definen los objetos las llamamos:", "Identidades.", "Clases.", "Objetos.", "Atributos.", "4");
           
           /*031*/      tipo_test("�Cu�l de las siguientes es un SGBD XML nativo libre o de c�digo abierto?", "Excelon XIS.", "GoXML DB.", "Infonyt DB.", "eXist DB.", "4");
           /*032*/      tipo_test("Con la etiqueta <hibernate-mapping> ...", "Podremos colocar la configuraci�n b�sica de hibernate.", "Configuraremos algunos aspectos de mapeo generales.", "Almacenaremos las clases definidas que queramos persistir.", "Todas son verdaderas.", "3");
           /*033*/      tipo_test("�Cu�l es la herramienta oficial que propone MongoDB para gestionar visualmente\n        la base de datos (importar, exportar, etc)?", "Generate app.", "showData.", "removeData.", "Compass.", "4");
           /*034*/      tipo_test("Tres tipos de bases de datos que surgen dentro de la familia No-SQL son:", "Basado en filas, clave/valor y de documentos.", "Basado en columnas, clave/valor y de documentos.", "Basado en columnas, indice, y de documentos.", "Basado en columnas, clave/valor y de objetos.", "2");
           /*035*/      tipo_test("MongoDb es:", "Una base de datos relacional.", "Una base de datos orientada a objetos basada en grafos.", "Una base de datos basada en documentos.", "Todas son falsas.", "3");
           /*036*/      tipo_test("La diferencia entre una tabla de objetos y una tabla en la que uno de sus atributos es\n        un objeto es ...", "El tama�o.", "Los permisos.", "La primera almacena objetos con su propia identidad de objeto.", "No hay ninguna diferencia entre ambas.", "3");
           /*037*/      tipo_test("Es una ventaja en la utilizaci�n de las bases de datos orientadas a objetos.", "Es un modelo de datos universal.", "Mayor capacidad de modelado.", "No hace falta utilzar la encapsulaci�n para realizar consultas.", "No tiene competencia.", "2");
           /*038*/      tipo_test("Para que un componente acepte propiedades compartidas, �Qu� m�todos debe\n        integrar?", "addPropertyChangeListener.", "removePropertyChangeListener.", "oldremove.", "Hay dos opciones correctas.", "4");
           /*039*/      tipo_test("A una lista de elementos no ordenados y todos ellos con la misma tipolog�a podremos\n        definirlo como tipo de colecci�n:", "VARRAY.", "Lista.", "PL/SQL.", "Tabla anidada.", "4");
           /*040*/      tipo_test("�Qu� caracter�stica representa la informaci�n y las implementaciones de los m�todos\n        ocultando las entidades externas?", "Integridad.", "Identidad.", "Encapsulaci�n.", "Todas son verdaderas.", "3");
           
           /*041*/      tipo_test("�Cu�l de las siguientes es una ventaja de las bases de datos XML respecto a las\n        relacionales?", "Facilidad de aprendizaje de Xpath.", "Lenguaje Xpath soportado por todas las aplicaciones gestoras de datos.", "Mayor capacidad de almacenamiento de documentos XML.", "Todas son correctas.", "3");
           /*042*/      tipo_test("Con los elementos <meta> del archivo de mapeo podremos ...", "Establecer la descripci�n de la clase que estamos definiendo.", "Definir los atributos principales de la clase.", "Establecer el contenido de una columna.", "Todas son falsas.", "1");
           /*043*/      tipo_test("Las bases de datos XML nativas son bases de datos que:", "Almacenan documentos y datos XML de una forma eficiente.", "No realizan consultas.", "No son integrables.", "Todas son falsas.", "1");
           /*044*/      tipo_test("En los tipos compuestos de las bases de datos objeto relacionales,\n        se podr�n crear funciones.", "Con c�digo en otros lenguajes.", "Con c�digo en otros lenguajes, excepto SQL.", "Con c�digo en otros lenguajes, excepto Java.", "Con c�digo en otros lenguajes, excepto C#.", "1");
           /*045*/      tipo_test("La estructura de los documentos en MonboDB:", "Es en formato Json e internamente son almacenado en Bson.", "Formato .doc", "Formato .txt", "Sin formato.", "1");
           /*046*/      tipo_test("Los nuevos tipos de datos que podemos definir en Oracle como base de datos\n        objeto-relacional ...", "Ser�n tipos simples o tipos complejos.", "Ser�n tipos �nicos o tipos m�ltiples.", "Ser�n tipos centralizados o tipo distribuidos.", "Ser�n tipos de objetos o tipos de colecciones.", "4");
           /*047*/      tipo_test("MongoDB es una base de datos NoSQL ...", "Orientada a Objetos.", "Orientada a Documentos.", "Falso: MongoDB es una base de datos relacional SQL.", "que solo se puede utilizar en entornos que no permitan la replicaci�n.", "2");
           /*048*/      tipo_test("Cuando un componente se activa mediante el funcionamiento de otro lo denominamos:", "Retroceso.", "Control activo.", "Control pasivo.", "Todas son falsas.", "2");
           /*049*/      tipo_test("Una referencia en Oracle es:", "Un enlace a un objeto de la tipolog�a definida y que a su vez genera una relaci�n entre ambos.", "Un Id que se le asigna a un atributo.", "Un atributo cualquiera.", "Todas son falsas.", "1");
           /*050*/      tipo_test("Identifica la caracter�stica que NO pertenece a un sistema de bases de datos gen�rico:", "Concurrencia.", "Recuperaci�n de errores.", "Consultas.", "Aislamiento.", "4");
           
           /*051*/      tipo_test("�En qu� se basan las bases de datos nativas XML?", "En archivos XML.", "En contenedores, en los que la estructura de los datos XML es fija.", "En contenedores, con estructura de datos XML que no tiene que ser fija.", "Ninguna es correcta.", "3");
           /*052*/      tipo_test("�Con qu� elemento mapearemos los atributos o propiedades Java y los\n        transformaremos en columnas de base de datos?", "<attributes>", "<property>", "<set>", "<get>", "2");
           /*053*/      tipo_test("Las bases de datos XML nativas:", "Se basan en tablas.", "Tienen consultas SQL.", "Se basan en los llamados contenedores.", "Todas son verdaderas.", "3");
           /*054*/      tipo_test("Una caracter�stica de los �ndices en MongoDB es que:", "Ofrece grandes mejoras en las operaciones de escritura", "Se almacenan en disco.", "Los operadores de negaci�n utilizan �ndices.", "No s�lo se indican los campos del �ndice, sino el orden del mismo.", "4");
           /*055*/      tipo_test("Una de las caracter�sticas principales de MongoDB:", "La mayor�a de los datos residen en memoria. Lecturas y escrituras muy r�pidas.", "La mayor�a de los datos residen en disco duro. Almacenamientos seguros.", "La mayor�a de los datos se almacenan a trav�s de la red.", "Todas son falsas.", "1");
           /*056*/      tipo_test("No es una caracter�stica de las bases de datos objeto relacionales:", "Podemos crear nuevos tipos de datos compuestos.", "Podemos comprobar reglas de integridad mediante triggers.", "Podemos usar encadenamiento y herencia.", "Reduce la capacidad de expresi�n para ser m�s sencillo y potente.", "4");
           /*057*/      tipo_test("En Hibernate, el fichero de mapeo, indica ...", "El mapeo de la clase en la base de datos.", "El mapeo de los drivers de la base de datos.", "El mapeo de la conexi�n de la base de datos.", "Hibernate no utiliza ficheros de mapeo.", "1");
           /*058*/      tipo_test("�Con qu� clase usamos la introspecci�n con EJBs?", "Instrospection.", "Api.Javax.", "Core.", "Introspector.", "4");
           /*059*/      tipo_test("La sintaxis que tenemos en Oracle para las referencias es:", "REFER.", "R.", "REF.", "REFERENCE.", "3");
           /*060*/      tipo_test("Las siglas del lenguaje de consulta de objetos son:", "SQLO.", "OQL.", "OOQ.", "OLQ.", "2");
           
           /*061*/      tipo_test("En MongoDB el tipo de �ndice background es ...", "M�s r�pido, pero bloquea a los lectores/escritores.", "M�s r�pido, pero no bloquea a los lectores/escritores.", "M�s lento, pero bloquea a los lectores/escritores.", "M�s lento, pero no bloquea a los lectores/escritores.", "4");
           /*062*/      tipo_test("�Qu� estado tendr�a un objeto persistente que fuese una nueva instancia, que no est�\n        a�n asociada a un objeto de sesi�n y no tiene representaci�n en la base de datos ni\n        identificador seg�n Hibernate?", "Persistent.", "Transient.", "Detached.", "Labeled.", "2");
           /*063*/      tipo_test("Un sistema XML de base de datos de c�digo abierto ser�a:", "Excelon.", "GoXML.", "ExistDB.", "Todos son de c�digo abierto.", "3");
           /*064*/      tipo_test("En los tipos compuestos de las bases de datos objeto relacionales,\n        se podr�n definir al menos dos m�todos:", "Uno para convertir de este tipo a caracteres ASCII, y otro que haga esta funci�n a la inversa.", "Uno para convertir de este tipo a objetos, y otro que haga esta funci�n a la inversa.", "Uno para convertir de este tipo a punteros, y otro que haga esta funci�n a la inversa.", "Uno para convertir de este tipo a relacional, y otro que haga esta funci�n a la inversa.", "1");
           /*065*/      tipo_test("�Cu�l es el t�rmino para denominar a la tabla del mundo relacional en MongoDB?", "Documento.", "Colecci�n.", "Bases de datos.", "JSON.", "2");
           /*066*/      tipo_test("En una base de datos orientada a objetos, el identificador ID de objeto ...", "Es opcional.", "Puede modificarse una vez creado el objeto.", "Est� almacenado en el interior del objeto.", "Todas son correctas.", "3");
           /*067*/      tipo_test("Uno de los aspectos que caracteriza a las bases de datos objeto-relacionales es:", "No puede crear operadores.", "No puede usar encadenamiento, pero si herencia.", "No puede usar herencia, pero si encadenamiento.", "Puede comprobar reglas de integridad por triggers.", "4");
           /*068*/      tipo_test("�Con qu� biblioteca usamos la persistencia de los componentes?", "JPA.", "HPA.", "RPA.", "SPA.", "1");
           /*069*/      tipo_test("A trav�s de la herencia de tipos podremos:", "Ser mucho m�s eficientes escribiendo c�digo.", "A�adir directamente caracter�sticas de los elementos padres a los hijos.", "Ahorrar tiempo.", "Todas son verdaderas.", "4");
           /*070*/      tipo_test("Los objetos de una clase pueden ser organizados de nuevo formando ciertas\n        agrupaciones que pueden ser relevantes de inter�s para la base de datos.\n        Esto hace referencia a:", "Especializaci�n, generalizaci�n y herencia.", "Integridad.", "Encapsulaci�n.", "Todas son falsas.", "1");
           
           /*071*/      tipo_test("�En cu�l de las siguientes operaciones sobre el �ndice es una consulta que se resuelve\n        contra el �ndice sin consultar datos de la colecci�n?", "dbcollectionreIndex().", "dbcollectiongetIndexes().", "dbcollectionqueryIndexNotDatabase().", "Covered query, con la operaci�n dbcollectionfind.", "4");
           /*072*/      tipo_test("El m�todo clear() del objeto session ...", "Cerrar� la session.", "Eliminar� completamente la sesi�n.", "Borrar� la cach� Hibernate.", "Todas son verdaderas.", "2");
           /*073*/      tipo_test("Las bases de datos XML se consultan con:", "Consultas SQL.", "Consultas Mish.", "Expresiones regulares.", "Expresiones XPath.", "4");
           /*074*/      tipo_test("Relacionado con las APIs, los EndPoints ...", "Son las instrucciones de finalizaci�n de las APIs.", "Son las puertas de entrada al c�digo back de la aplicaci�n.", "Son las instrucciones para guardar el contenido en la base de datos.", "Son las instrucciones para cerrar las conexiones web.", "2");
           /*075*/      tipo_test("Alguno de los motores de almacenamiento puede ser:", "Sharding.", "MVC.", "WiredTiger.", "Sofield.", "3");
           /*076*/      tipo_test("Es una ventaja de la utilizaci�n de una base de datos orientada a objetos.", "Flexibilidad.", "Experiencia y madurez.", "Modelo universal.", "Teor�a matem�tica aprobada.", "1");
           /*077*/      tipo_test("Las bases de datos XML nativas se basan en", "Tablas.", "Objetos.", "Contenedores.", "Xpath.", "3");
           /*078*/      tipo_test("�Qu� clase ayuda a crear objetos EntityManager utilizando el patr�n de dise�o\n        Factory?", "Entity.", "EntityManagerFactory.", "Factory.", "Todas son falsas.", "2");
           /*079*/      tipo_test("Definimos a un conjunto de m�quinas definidas como servidores de procesamiento paralelo:", "Servidores en paralelo.", "Servidores en serie.", "Cluster.", "Windows server.", "3");
           /*080*/      tipo_test("Una ventaja de las bases de datos orientadas a objetos es:", "La persistencia es totalmente distinta.", "La rapidez de persistir.", "Los objetos son livianos.", "Disponemos de una mayor capacidad para realizar el modelado.", "4");
           
           /*081*/      tipo_test("Respecto a los �ndices en MongoDB ...", "Penalizan las operaciones de escritura.", "Se almacenan en disco.", "No hay que indicar orden (ascendente, descendente) del campo �ndice.", "Todas son correctas.", "1");
           /*082*/      tipo_test("El m�todo createCriteria() que se ejecuta desde un objeto de session devolver�:", "Un objeto Query.", "Un objeto Criteria.", "Un objeto Transaction.", "Un objeto Session.", "2");
           /*083*/      tipo_test("En la instalaci�n de ExistDB, �Qu� cach� es recomendado asignar?", "128MB.", "200TB.", "20MB.", "1TB.", "1");
           /*084*/      tipo_test("Una caracter�stica fundamental de las bases de datos orientadas a objetos\n        es que proporciona ...", "Propiedades de herencia.", "Encapsulaci�n.", "Un identificador de objeto.", "Todas las respuestas son correctas.", "4");
           /*085*/      tipo_test("Una caracter�stica de un �ndice es:", "Se almacerna en memoria.", "Se almacena en disco duro.", "No se almacena.", "Todas son falsas.", "1");
           /*086*/      tipo_test("La instrucci�n OQL para modificar el estado de los objetos ...", "Es la sentencia update.", "Es la sentencia create.", "Es la sentencia commit.", "No existen primitivas para modificar el estado de los objetos.", "4");
           /*087*/      tipo_test("Seg�n el teorema de CAP, podemos encontrar a MongoDB en el v�rtice:", "CA.", "AP.", "CP.", "PA.", "3");
           /*088*/      tipo_test("�Con qu� objeto realizamos las consultas en JPA?", "Query.", "Transaction.", "EntityManager.", "Entity.", "1");
           /*089*/      tipo_test("�Qu� entendemos como ausencia de Schemaless?", "Opci�n de un sistema.", "Caracter�stica muy flexible, se puede almacenar informaci�n no uniforme\n    y se facilita la evoluci�n.", "Sirve para crear tablas.", "Todas son falsas.", "2");
           /*090*/      tipo_test("Selecciona la caracter�stica espec�fica de un sistema gestor de bases de datos\n        orientado a objetos:", "Consultas.", "Concurrencia.", "Modularidad.", "Persistencia.", "3");
           
           /*091*/      tipo_test("El equivalente en MongoDB, a las filas de las bases de datos relacionales, es ...", "Colecci�n.", "Documento.", "�ndice.", "Cl�ster.", "2");
           /*092*/      tipo_test("�Con qu� m�todo comprobamos si la session est� actualmente conectada?", "isOpen().", "isConnected().", "refresh().", "getSessionFactory().", "2");
           /*093*/      tipo_test("En la instalaci�n de ExistDB �Cu�nta RAM es recomendable asignar?", "5000MB.", "200MB.", "1024MB.", "Todas son falsas.", "3");
           /*094*/      tipo_test("Relacionado con MongoDB, la aplicaci�n visual Compass permite:", "Navegar entre los datos.", "Importar datos.", "Eliminar datos.", "Clasificar datos.", "2");
           /*095*/      tipo_test("�Qu� comando usaremos en la Shell de mongo para recibir ayuda sobre los comandos\n        ejecutables sobre la base de datos?", "Show dbs", "db", "use db", "db.help()", "4");
           /*096*/      tipo_test("En Hibernate, las clases persistentes ...", "son las que no se pueden borrar.", "solo las puede borrar un administrador.", "est�n en la �ltima de las capas de la arquitectura.", "deben tener un atributo identificador ID.", "4");
           /*097*/      tipo_test("Para que un componente acepte propiedades compartidas, �Qu� m�todos debe integrar?", "addPropertyChangeListene.", "removePropertyChangeListener.", "oldremove.", "addPropertyChangeListene y removePropertyChangeListener son correctas.", "4");
           /*098*/      tipo_test("En Hibernate, a las clases cuyos objetos ser�n almacenados en base de datos\n        las llamaremos ...", "Clases principales.", "Clases main.", "Clases persistentes.", "Clases privadas.", "3");
           /*099*/      tipo_test("Identifica el tipo de base de datos NoSQL:", "Base de datos clave/valor.", "Base de datos relacional.", "Base de datos de objetos.", "Todas son falsas.", "1");
           /*100*/      tipo_test("El lenguaje OQL:", "Es un lenguaje declarativo de tipolog�a SQL.", "Es un lenguaje sin relaci�n a SQL.", "Es SQL nativo.", "Todas son falsas.", "1");
           
           /*101*/      tipo_test("Dentro del tri�ngulo definido por el teorema de CAP, MongoDB estar�a en el lado ...", "AP: Atomicidad y Particiones.", "CP: Consistencia y Particiones.", "CA: Consistencia y Atomicidad.", "Ninguna es correcta.", "2");
           /*102*/      tipo_test("Un objeto representa una entidad en el mundo real y se compone de:", "Nombre, atributos y m�todos.", "Definici�n y columnas.", "Tablas y columnas.", "Todas son falsas.", "1");
           /*103*/      tipo_test("�Qu� paquete es esencial a la hora de instalar ExistDB y estaremos forzados a integrar?", "El paquete APP.", "Sources.", "Core.", "Core y Sources.", "3");
           /*104*/      tipo_test("Elige entre las opciones una de los objetivos que tendr�amos despu�s de crear un VARRAY:", "Definir la tipolog�a de una columna de una tabla relacional.", "Crear listas de tablas.", "Definir un atributo.", "Todas son falsas.", "1");
           /*105*/      tipo_test("�Qu� herramienta usamos en MongoDB para convertir ficheros Bson a otros formatos?", "Mongos.", "Bsondump.", "Mongoexport.", "mongoimport.", "2");
           /*106*/      tipo_test("El elemento tipo \"class\" de un fichero xml de mapeo de Hibernate ...", "Especifica �nicamente el nombre de la clase Java.", "Especifica �nicamente el nombre de la tabla.", "Especifica nombre de la clase, y tabla asociada.", "Ninguna es correcta.", "3");
           /*107*/      //tipo_test("", "", "", "", "", "");
           /*108*/      //tipo_test("", "", "", "", "", "");
           /*109*/      tipo_test("Las bases de datos basadas en gr�ficos:", "Son menos eficientes que las relacionales.", "Es un tipo de base de datos NoSQL.", "Son mucho m�s r�pidas.", "Todas son verdaderas.", "2");
           /*110*/      tipo_test("Una combinaci�n de una base de datos relacional y una orientada a objetos\n        es lo que llamamos como:", "Una base de datos relacional objeto.", "Base de datos objeto relacional.", "Base de datos segmentada.", "Todas son falsas.", "2");
           
           /*111*/      tipo_test("El fichero binario del paquete de MongoDB que contiene el servicio propio del modo de\n        despliegue Shard es:", "mongod.", "mongo.", "mongos.", "mongoshard.", "3");
           /*112*/      tipo_test("Los �ndices monoclave:", "No son eficientes.", "Solo afectan a un campo de b�squeda.", "Son �ndices de texto.", "Se les llama tambi�n geoespaciales.", "2");
           /*113*/      tipo_test("�A qu� ruta del navegador accederemos para ir a nuestro Dashboard en ExistDB?", "https://localhost", "http://localhost", "http://localhost:8080/exist/", "Todas son falsas.", "3");
           /*114*/      //tipo_test("", "", "", "", "", "");
           /*115*/      tipo_test("Selecciona el servicio que se utiliza en Mongo para realizar Shard:", "Mongod.", "Mongo.", "Mongos.", "mongodump.", "3");
           /*116*/      tipo_test("El lenguaje Hibernate Query (HQL) ...", "Es un lenguaje orientado a objetos.", "Trabaja con objetos persistentes y sus propiedades.", "Es traducido a SQL por Hibernate.", "Todas son correctas.", "4");
           /*117*/      //tipo_test("", "", "", "", "", "");
           /*118*/      //tipo_test("", "", "", "", "", "");
           /*119*/      tipo_test("La base de datos Cassandra es un tipo de base de datos:", "Clave/valor.", "Basado en columnas.", "Basada en gr�ficos.", "No existe.", "2");
           /*120*/      tipo_test("En Hibernate, usando la interfaz Transaction, la cancelaci�n de una transacci�n se\n        consigue con el m�todo ...", "cancel()", "stop().", "rolback().", "delete().", "3");
           
           /*121*/      tipo_test("Usaremos la clave objet type :", "Para crear tipos del sistema.", "Para crear tipos de objeto de usuario.", "Para crear tablas.", "Para definir atributos.", "2");
           /*122*/      tipo_test("Los �ndices Hashed:", "Indexan por coordenadas.", "Solo puede haber una correspondencia entre entrada del �ndice y documento.", "Son poco eficientes.", "Indexan de forma clave/valor.", "4");
           /*123*/      tipo_test("�Cu�l no es una estrategia de almacenamiento en bases de datos xml nativas?", "Basado en texto.", "Basado en modelo.", "Almacenando en local.", "Almacenando en la nube.", "4");
           /*124*/      //tipo_test("", "", "", "", "", "");
           /*125*/      tipo_test("�Qu� es Mongod?", "Servicio principal de la base de datos. Maneja los accesos a datos.", "Es un fichero de configuraci�n .conf.", "Es un fichero de documentaci�n para la base de datos.", "Todas son falsas.", "1");
           /*126*/      tipo_test("Los �ndices monoclave:", "Indexan por dos campos.", "Indexan por dos o m�s campos.", "Solo indexan por un campo de los documentos de la colecci�n.", "Todas son falsas.", "3");
           /*127*/      //tipo_test("", "", "", "", "", "");
           /*128*/      //tipo_test("", "", "", "", "", "");
           /*129*/      //tipo_test("", "", "", "", "", "");
           /*130*/      tipo_test("Identifica uno de los beneficios de las bases datos NOSQL:", "Facilidad de montaje.", "Extensi�n m�ltiple.", "Disponibilidad continua.", "Todas son verdaderas.", "3");
           
           /*131*/      tipo_test("Los operadores de negaci�n:", "Utilizan �ndices siempre.", "No utilizan �ndices.", "Usan �ndices cuando es necesario.", "Todas son falsas.", "2");
           /*132*/      tipo_test("Una covered query:", "Es una consulta normal a base de datos.", "Es una consulta a base de datos compleja.", "Es una consulta que se resuelve contra un �ndice sin consultar datos de la colecci�n.", "Todas son falsas.", "3");
           /*133*/      tipo_test("�Qu� paqueter�a nos habilitar� la clase DatabaseManager?", "Org.xmldb.api", "Api.xmldb", "Org.api", "Todas son falsas.", "1");
           /*134*/      //tipo_test("", "", "", "", "", "");
           /*135*/      tipo_test("Cu�les son las 3 caracter�sticas que se eval�an en el teorema de CAP:", "Tolerancia, Consistencia y Datos.", "Tolerancia, Disponibilidad y Certeza.", "Tolerancia, Disposici�n y Certeza.", "Tolerancia, Disponibilidad y Consistencia.", "4");
           /*136*/      tipo_test("Una unidad de software que encapsula un segmento de c�digo con ciertas funciones\n        lo definimos como:", "Componente.", "Funci�n.", "M�todo.", "Todas son falsas.", "1");
           /*137*/      //tipo_test("", "", "", "", "", "");
           /*138*/      //tipo_test("", "", "", "", "", "");
           /*139*/      //tipo_test("", "", "", "", "", "");
           /*140*/      tipo_test("Uno de los beneficios y caracter�sticas m�s notorios de las bases de datos NoSQL es:", "Capacidad Big Data.", "Extensi�n m�ltiple.", "F�cil transferencia.", "Todas son falsas.", "1");
           
           /*141*/      //tipo_test("", "", "", "", "", "");
           /*142*/      //tipo_test("", "", "", "", "", "");
           /*143*/      //tipo_test("", "", "", "", "", "");
           /*144*/      //tipo_test("", "", "", "", "", "");
           /*145*/      //tipo_test("", "", "", "", "", "");
           /*146*/      //tipo_test("", "", "", "", "", "");
           /*147*/      //tipo_test("", "", "", "", "", "");
           /*148*/      //tipo_test("", "", "", "", "", "");
           /*149*/      //tipo_test("", "", "", "", "", "");
           /*150*/      //tipo_test("", "", "", "", "", "");
           
           /*151*/      //tipo_test("", "", "", "", "", "");
           /*152*/      //tipo_test("", "", "", "", "", "");
           /*153*/      //tipo_test("", "", "", "", "", "");
           /*154*/      //tipo_test("", "", "", "", "", "");
           /*155*/      //tipo_test("", "", "", "", "", "");
           /*156*/      //tipo_test("", "", "", "", "", "");
           /*157*/      //tipo_test("", "", "", "", "", "");
           /*158*/      //tipo_test("", "", "", "", "", "");
           /*159*/      //tipo_test("", "", "", "", "", "");
           /*160*/      //tipo_test("", "", "", "", "", "");
           
           /*161*/      //tipo_test("", "", "", "", "", "");
           /*162*/      //tipo_test("", "", "", "", "", "");
           /*163*/      //tipo_test("", "", "", "", "", "");
           /*164*/      //tipo_test("", "", "", "", "", "");
           /*165*/      //tipo_test("", "", "", "", "", "");
           /*166*/      //tipo_test("", "", "", "", "", "");
           /*167*/      //tipo_test("", "", "", "", "", "");
           /*168*/      //tipo_test("", "", "", "", "", "");
           /*169*/      //tipo_test("", "", "", "", "", "");
           /*170*/      //tipo_test("", "", "", "", "", "");
           
           /*171*/      //tipo_test("", "", "", "", "", "");
           /*172*/      //tipo_test("", "", "", "", "", "");
           /*173*/      //tipo_test("", "", "", "", "", "");
           /*174*/      //tipo_test("", "", "", "", "", "");
           /*175*/      //tipo_test("", "", "", "", "", "");
           /*176*/      //tipo_test("", "", "", "", "", "");
           /*177*/      //tipo_test("", "", "", "", "", "");
           /*178*/      //tipo_test("", "", "", "", "", "");
           /*179*/      //tipo_test("", "", "", "", "", "");
           /*180*/      //tipo_test("", "", "", "", "", "");
           
           /*181*/      //tipo_test("", "", "", "", "", "");
           /*182*/      //tipo_test("", "", "", "", "", "");
           /*183*/      //tipo_test("", "", "", "", "", "");
           /*184*/      //tipo_test("", "", "", "", "", "");
           /*185*/      //tipo_test("", "", "", "", "", "");
           /*186*/      //tipo_test("", "", "", "", "", "");
           /*187*/      //tipo_test("", "", "", "", "", "");
           /*188*/      //tipo_test("", "", "", "", "", "");
           /*189*/      //tipo_test("", "", "", "", "", "");
           /*190*/      //tipo_test("", "", "", "", "", "");
           
           /*191*/      //tipo_test("", "", "", "", "", "");
           /*192*/      //tipo_test("", "", "", "", "", "");
           /*193*/      //tipo_test("", "", "", "", "", "");
           /*194*/      //tipo_test("", "", "", "", "", "");
           /*195*/      //tipo_test("", "", "", "", "", "");
           /*196*/      //tipo_test("", "", "", "", "", "");
           /*197*/      //tipo_test("", "", "", "", "", "");
           /*198*/      //tipo_test("", "", "", "", "", "");
           /*199*/      //tipo_test("", "", "", "", "", "");
           /*200*/      //tipo_test("", "", "", "", "", "");
           
    }    
}