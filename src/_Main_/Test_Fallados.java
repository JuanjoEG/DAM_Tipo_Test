package _Main_;

import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Test_Fallados {
    
    public static void test_Repaso() {
        
        _Main_.Principal.setAsignatura("ACCESO A DATOS"); //
        _Main_.Principal.setTema("TEST FALLADOS");
        
        tipo_test("Tres tipos de bases de datos que surgen dentro de la familia No-SQL son:", "Basado en filas, clave/valor y de documentos.", "Basado en columnas, clave/valor y de documentos.", "Basado en columnas, indice, y de documentos.", "Basado en columnas, clave/valor y de objetos.", "2");
        tipo_test("Uno de los aspectos que caracteriza a las bases de datos objeto-relacionales es:", "No puede crear operadores.", "No puede usar encadenamiento, pero si herencia.", "No puede usar herencia, pero si encadenamiento.", "Puede comprobar reglas de integridad por triggers.", "4");
        tipo_test("Con la etiqueta <hibernate-mapping> ...", "Podremos colocar la configuraci�n b�sica de hibernate.", "Configuraremos algunos aspectos de mapeo generales.", "Almacenaremos las clases definidas que queramos persistir.", "Todas son verdaderas.", "3");
        tipo_test("Dos caracter�sticas comunes de las bases de datos No-SQL son:", "Modelo de datos relacional, y sin esquema (schemaless).", "Modelo de datos relacional, y con esquema (schemaless).", "Modelo de datos no relacional, y sin esquema (schemaless).", "Modelo de datos no relacional, y con esquema (schemaless).", "3");
        tipo_test("Tres tipos de bases de datos que surgen dentro de la familia No-SQL son:", "Basado en filas, clave/valor y de documentos.", "Basado en columnas, clave/valor y de documentos.", "Basado en columnas, indice, y de documentos.", "Basado en columnas, clave/valor y de objetos.", "2");
        tipo_test("Las bases de datos basadas en gr�ficos:", "Son menos eficientes que las relacionales.", "Es un tipo de base de datos NoSQL.", "Son mucho m�s r�pidas.", "Todas son verdaderas.", "2");
        tipo_test("Identifica el que no es un tipo de Big Data:", "Estructurado.", "No estructurado.", "Semiestructurado.", "Norelacional.", "4");
        tipo_test("Las bases de datos XML nativas:", "Se basan en tablas.", "Tienen consultas SQL.", "Se basan en los llamados contenedores.", "Todas son verdaderas.", "3");
        tipo_test("El m�todo createCriteria() que se ejecuta desde un objeto de session devolver�:", "Un objeto Query.", "Un objeto Criteria.", "Un objeto Transaction.", "Un objeto Session.", "2");
        tipo_test("�Qu� es Mongod?", "Servicio principal de la base de datos. Maneja los accesos a datos.", "Es un fichero de configuraci�n .conf.", "Es un fichero de documentaci�n para la base de datos.", "Todas son falsas.", "1");
        tipo_test("La base de datos Cassandra es un tipo de base de datos:", "Clave/valor.", "Basado en columnas.", "Basada en gr�ficos.", "No existe.", "2");
        tipo_test("A una lista de elementos no ordenados y todos ellos con la misma tipolog�a podremos\n        definirlo como tipo de colecci�n:", "VARRAY.", "Lista.", "PL/SQL.", "Tabla anidada.", "4");
        tipo_test("�Cu�l es el t�rmino para denominar a la tabla del mundo relacional en MongoDB?", "Documento.", "Colecci�n.", "Bases de datos.", "JSON.", "2");
        tipo_test("Una caracter�stica fundamental de las bases de datos orientadas a objetos\n        es que proporciona ...", "Propiedades de herencia.", "Encapsulaci�n.", "Un identificador de objeto.", "Todas las respuestas son correctas.", "4");
        tipo_test("Una caracter�stica de un �ndice es:", "Se almacerna en memoria.", "Se almacena en disco duro.", "No se almacena.", "Todas son falsas.", "1");
        
         
        _Main_.Principal.setAsignatura("DESARROLLO DE INTERFACES");
        
        tipo_test("Cuando se incluyen im�genes en un informe, se debe tener en cuenta que ...", "Como elemento visual siempre proporciona un valor a�adido.", "Incluir una imagen indicando la ruta absoluta es una opci�n recomendada solo para pruebas.", "Podemos incluir una imagen indicando una direcci�n URL.", "Todas las respuestas son correctas.", "4");
        tipo_test("En el desarrollo de interfaces en Android el layout denominado LinearLayout ...", "Permite modificar la propiedad de altura con 'layout_height', aunque no la de ancho.", "Permite encontrar el tipo lineal horizontal que realiza la distribuci�n en forma de filas.", "Permite alinear los elementos uno tras otro en una direcci�n concreta.", "No permite la dimensi�n de cada uno de los elementos a trav�s de sus propiedades.", "3");
        tipo_test("Una tabla de contenido permite reflejar la estructura y contenido del documento,\n        adem�s se caracteriza porque ...", "Se encuentra esquematizada en varios niveles entre los que se distinguen t�tulos y subt�tulos.", "Debe duplicar la informaci�n para que est� disponible al usuario en todo momento.", "Se sit�a al final como recordatorio de todo el contenido mostrado.", "Debe mostrar siempre el n�mero de p�gina independientemente dise�o.", "1");
        tipo_test("Se trata de un contenedor vac�o utilizado para colocar los destinos hacia los que\n        apunta el gr�fico de navegaci�n. Este elemento permite que los destinos vayan\n        modific�ndose seg�n el usuario navegada a trav�s de la aplicaci�n:", "Gr�fico de navegaci�n.", "Nav_version.", "NavController.", "NavHost.", "4");
        tipo_test("La herramienta Shalom Help Maker:", "Permite la creaci�n de ficheros de ayuda para Windows y tras su descarga es necesario\n    ejecutar el software htmlhelp.exe para instalarla.", "Toda la informaci�n queda contenida en un �nico fichero por lo que es posible exportar\n    toda la ayuda en un solo documento PDF.", "Es una herramienta de pago.", "Permite creaci�n de �ndices, contenidos enlazados a otras p�ginas, links externos,\n    as� como la creaci�n de im�genes que enriquecen el contenido del documento final.", "4");
        tipo_test("Indica cu�l de las siguientes afirmaciones es falsa respecto a las tablas de contenidos:", "Las tablas de contenido se sit�an al final de cualquier documento,\n    como si de un �ndice de libro se tratara.", "Pueden mostrar el n�mero de p�gina o no, en funci�n del dise�o.", "Casi siempre incluye un enlace directo en cada uno de los t�tulos o subt�tulos\n    por los que aparece compuesta.", "No debe duplicarse la informaci�n.", "1");
        tipo_test("�Desde que fichero ser� necesario acceder para que est� disponible la pantalla\n        de dise�o y el c�digo asociado a la creaci�n de cada nuevo componente?", "Main_activity.xml", "Activity_proyect.xml", "Activity_main.xml", "Content_main.xml", "3");
        tipo_test("La clase HelpBroker permite visualizar el contenido de la ayuda desde la aplicaci�n,\n        �Cu�l de los siguientes no es uno de sus principales m�todos?", "enableHelpKey.", "enableHelpOnButton.", "enableHelp.", "findHelpSet.", "4");
        tipo_test("�Cu�l de los siguientes elementos permite a�adir un conmutador entre estados en el\n        desarrollo de una aplicaci�n?", "CheckBox.", "Spinner.", "ToggleButton.", "Ninguno de los anteriores.", "3");
        
        _Main_.Principal.setAsignatura("EMPRESA E INICIATIVA EMPRENDEDORA");
        
        tipo_test("Tipo de obligaci�n tributaria materia que indica el momento en el que contraemos la deuda\n        con la Administraci�n P�blica, estando en ese momento ya obligados a pagar el tributo.", "Tasa.", "Hecho imponible.", "Exenci�n.", "Devengo.", "4");
        tipo_test("La compraventa no puede realizarse de cualquier manera, sino que debe tener, por ley,\n        una serie de elementos:", "Objeto, partes, precio, recibo y factura.", "Partes, presupuesto, factura y forma de pago.", "Objeto, partes, precio, forma de pago y consentimiento.", "Objeto, partes, precio, pedido y consentimiento.", "3");
        tipo_test("En relaci�n a la inversi�n:", "Aquella actividad dirigida a destinar recursos con el fin de conseguir beneficios.", "Asume un coste de oportunidad.", "Asume un riesgo.", "Todas las respuestas son correctas.", "4");
        tipo_test("Las partes del balance son:", "Balance, cuenta de p�rdidas y ganancias, estado de cambios de patrimonio, estado de\n    flujos de efectivo y memoria.", "Marco conceptual de la contabilidad, normas de registro y valoraci�n, cuentas anuales,\n    cuadro de cuentas, definiciones y relaciones contables.", "Activo, pasivo y patrimonio neto.", "Ninguna es correcta.", "3");
        tipo_test("Los libros contables obligatorios son:", "Libro diario y libro de inventarios.", "Libro diario y libro mayor.", "Libro de inventarios y libro mayor.", "Libro diario y libros auxiliares.", "1");
        tipo_test("Cuando hablamos de la cualificaci�n de un trabajador a corto plazo, nos referimos a:", "Desarrollo.", "Curso.", "Formaci�n.", "Prueba de selecci�n.", "3");
        tipo_test("El Margen de contribuci�n es:", "El n�mero de unidades f�sicas que representan una ganancia sobre las ventas totales.", "El porcentaje que representa una ganancia sobre el precio de venta final.", "No est� relacionado con el precio de venta.", "Todas son correctas.", "2");
        tipo_test("Los libros contables son documentos de la empresa donde se refleja y registra la informaci�n\n        econ�mica, financiera y contable de la misma. �Cu�les de los siguientes son obligatorios\n        inscribirlos en el Registro mercantil junto a las cuentas anuales?", "Libro de Caja.", "Libro de Vencimiento.", "Libro Diario.", "Libro Mayor.", "3");
        
        _Main_.Principal.setAsignatura("PROGRAMACI�N MULTIMEDIA Y DISPOSITIVOS M�VILES");
                        
        tipo_test("�Cu�l de los siguientes no es una categor�a v�lida de videojuegos?", "Videojuegos de rol.", "Videojuegos de acci�n.", "Videojuegos de estrategia.", "Videojuegos de organizaci�n.", "4");
        tipo_test("Las peticiones HTTPS en Android:", "Se pueden hacer con el m�todo getHTTP y getHTTPS.", "Se ejecutar�n en un hilo aparte.", "No necesitan de ning�n permiso especial para su ejecuci�n.", "Todas las respuestas son correctas.", "2");
        tipo_test("La biblioteca Volley:", "Nos permite obtener JSON de una forma sencilla.", "Nos permite subir ficheros a nuestro servidor de una forma sencilla.", "Viene integrada directamente en la JDK de Android.", "Puede lazar la excepci�n IndexOfBoundException.", "1");
        tipo_test("La API que nos permitir� utilizar Gmail es:", "Gmail API.", "API for Gmail.", "Gmail for Android.", "Google no nos permite utilizar su servicio de Gmail.", "1");
        
        _Main_.Principal.setAsignatura("PROGRAMACI�N DE SERVICIOS Y PROCESOS");
        
        tipo_test("El algoritmo AES de cifrado puede tener un tama�o de clave de:", "128 bits.", "192 bits.", "256 bits.", "Todas las respuestas son correctas.", "4");
        tipo_test("�Cu�l de las siguientes operaciones no la realiza un cliente?", "Realizar validaciones de datos.", "Interactuar con el usuario.", "Procesar todas las peticiones para comprobar que sean v�lidas.", "Recibir los resultados que le env�a el servidor.", "1");
        tipo_test("�Qu� hace el m�todo getPort()?", "Devuelve el puerto de env�o/recepci�n del paquete.", "Devuelve el puerto de donde procede el Socket.", "Devuelve la direcci�n del host remoto de env�o/recepci�n.", "Depende de la clase.", "4");
        tipo_test("El m�todo readUTF() nos permitir�:", "Enviar mensajes a trav�s de un Socket.", "Recibir mensajes a trav�s de un Socket.", "Enviar y recibir mensajes a trav�s de un Socket.", "Este m�todo no permite realizar ninguna acci�n con Sockets.", "2");
        tipo_test("�Qu� comando debemos utilizar para generar los certificados de los sockets seguros?", "keytool.", "securekey.", "Ambos comandos se pueden utilizar.", "Los sockets seguros no necesitan certificados.", "1");
        tipo_test("En Java, la clase espec�fica para el uso del protocolo FTP ...", "ftp.", "ftpreplay.", "net.ftp.", "Java no tiene clases espec�ficas para el uso del protocolo FTP.", "4");
        tipo_test("La clase FTP:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "3");
        tipo_test("�Cu�l de los siguientes no es un tipo de criptograf�a?", "Criptograf�a asim�trica.", "Criptograf�a avanzada.", "Criptograf�a con umbral.", "Criptograf�a basada en identidad.", "2");
        tipo_test("La arquitectura SOA es una tecnolog�a que nos permite el dise�o de aplicaciones:", "Bas�ndose en un servicio determinado.", "Bas�ndose en peticiones a un servicio.", "Bas�ndose en la plataforma del cliente.", "Bas�ndose en el tr�fico de red que haya en el momento.", "2");
        tipo_test("Con la opci�n javax.net.ssl.keyStore:", "Indicamos la clave para acceder a dicho almac�n y para acceder al certificado dentro\n    del almac�n.", "Indicamos el almac�n donde est�n los certificados en los que se conf�a.", "Indicamos el almac�n donde est� el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almac�n y a los certificados dentro del almac�n.", "3");
        tipo_test("Con la opci�n javax.net.ssl.keyStorePassword:", "Indicamos la clave para acceder a dicho almac�n y para acceder al certificado dentro\n    del almac�n.", "Indicamos el almac�n donde est�n los certificados en los que se conf�a.", "Indicamos el almac�n donde est� el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almac�n y a los certificados dentro del almac�n.", "1");
        tipo_test("Con la opci�n javax.net.ssl.trustStore:", "Indicamos la clave para acceder a dicho almac�n y para acceder al certificado dentro\n    del almac�n.", "Indicamos el almac�n donde est�n los certificados en los que se conf�a.", "Indicamos el almac�n donde est� el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almac�n y a los certificados dentro del almac�n.", "2");
        tipo_test("Con la opci�n javax.net.ssl.trustStorePassword:", "Indicamos la clave para acceder a dicho almac�n y para acceder al certificado dentro\n    del almac�n.", "Indicamos el almac�n donde est�n los certificados en los que se conf�a.", "Indicamos el almac�n donde est� el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almac�n y a los certificados dentro del almac�n.", "4");
        tipo_test("La clase ServerSocket implementa:", "Un servidor TCP.", "Un cliente TCP.", "Un servidor UDP.", "Un cliente UDP.", "1");
        tipo_test("Los tipos de criptograf�a m�s usados en un entorno profesional son:", "Sim�trica.", "Asim�trica.", "Sim�trica y asim�trica.", "Todas son incorrectas.", "3");
        
        _Main_.Principal.setAsignatura("SISTEMAS DE GESTI�N EMPRESARIAL");
        
        tipo_test("Con Odoo Studio podemos afirmar que ...", "La inserci�n de nuevos campos se encuentra limitada a etiquetas de texto y campos.", "Nos permite definir distintos estados en 'pipeline status bar'.", "Permite el dise�o de formularios sin posibilidad de incluir im�genes.", "Permite crear informes estad�sticos aunque sin vista gr�fica.", "2");
        tipo_test("PgAdmin ...", "Es una aplicaci�n que se usa para gestionar, administrar y desarrollar la base de datos de\n    PostgreSQL.", "Es un m�dulo de Odoo que se usa para gestionar, administrar y desarrollar la base de\n    datos de PostgreSQL.", "Es un apartado de los ajustes de Odoo, que se habilita al entrar en modo desarrollador y\n    que se usa para gestionar, administrar y desarrollar la base de datos de PostgreSQL.", "Ninguna respuesta es correcta.", "1");
        tipo_test("PyCharm informa que hay un error sint�ctico en el c�digo ...", "Mediante una exclamaci�n roja en la parte superior derecha del editor.", "Subrayando en rojo en la barra de desplazamiento vertical la l�nea err�nea.", "Indicando una explicaci�n del error en la l�nea roja ubicada en la barra de desplazamiento\n    vertical.", "Todas las respuestas son correctas.", "1");
        tipo_test("Las rutas de producci�n ...", "Permiten fabricar un producto en una cadena de producci�n con diferentes equipos y\n    hacer un seguimiento de la fabricaci�n.", "Nos aseguran que siempre habr� stock de materiales para fabricar un producto.", "Permiten enviar los pedidos fabricados a los clientes por diferentes rutas.", "Ninguna respuesta es correcta.", "1");
        tipo_test("Las rutas de producci�n ...", "No tienen por qu� tener centros de producci�n.", "Deben tener centros de producci�n.", "Deben tener centros de tareas.", "No tienen por qu� tener centros de tareas.", "2");
        tipo_test("Los campos calculados, al declararlos ...", "Necesitan de un atributo 'calculate' con el nombre del m�todo.", "Necesitan de un atributo 'calculated_field' con el nombre del m�todo.", "Necesitan de un atributo 'compute' con el nombre del m�todo.", "Ninguna respuesta es correcta.", "3");
        tipo_test("Odoo Studio es un m�dulo de Odoo:", "Que solo es accesible desde la versi�n Enterprise, no es OpenSource.", "Que utiliza un lenguaje propio y diferente a XML para representar las vistas.", "Requiere siempre de la realizaci�n de scripts de programaci�n,\n    no permite realizar cambios de modo visual.", "Est� limitado a la modificaci�n de lo existente sin posibilidad de crear m�dulos nuevos.", "1");
        tipo_test("En PgAdmin podremos realizar una monitorizaci�n en tiempo real del estado del\n        servidor de la base de datos haciendo uso ...", "Del Open Developer Tools.", "Del Query Tool.", "Del dashboard.", "Ninguna respuesta es correcta.", "3");
        tipo_test("El log de Odoo ...", "Se informa en el fichero que se encuentra en el par�metro logfile del archivo odoo.conf\n    si este par�metro est� informado.", "Se informa en el stdout en PyCharm si el par�metro logfile del archivo odoo.conf no est�\n    informado.", "Indicar� la informaci�n de los logs que se produzcan en Odoo en el nivel que se indique\n    en el par�metro log_handler del archivo odoo.conf.", "Todas las respuestas son correctas.", "4");
        tipo_test("Las operaciones ...", "Se realizan en centros de producci�n y una ruta puede tener varias operaciones.", "Se realizan en centros de tareas y una ruta puede tener varias operaciones.", "Se realizan en centros de producci�n y una ruta puede tener solo una operaci�n.", "Se realizan en centros de tareas y una ruta puede tener solo una operaci�n.", "1");
        
    }    
}