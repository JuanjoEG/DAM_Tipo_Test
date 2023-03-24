package _Main_;

import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */
public class Test_Fallados {
    
    public static void test_Repaso() {
        
        _Main_.Principal.setAsignatura("ACCESO A DATOS"); //
        _Main_.Principal.setTema("TEST FALLADOS");
        
        tipo_test("Tres tipos de bases de datos que surgen dentro de la familia No-SQL son:", "Basado en filas, clave/valor y de documentos.", "Basado en columnas, clave/valor y de documentos.", "Basado en columnas, indice, y de documentos.", "Basado en columnas, clave/valor y de objetos.", "2");
        tipo_test("Uno de los aspectos que caracteriza a las bases de datos objeto-relacionales es:", "No puede crear operadores.", "No puede usar encadenamiento, pero si herencia.", "No puede usar herencia, pero si encadenamiento.", "Puede comprobar reglas de integridad por triggers.", "4");
        tipo_test("Con la etiqueta <hibernate-mapping> ...", "Podremos colocar la configuración básica de hibernate.", "Configuraremos algunos aspectos de mapeo generales.", "Almacenaremos las clases definidas que queramos persistir.", "Todas son verdaderas.", "3");
        tipo_test("Dos características comunes de las bases de datos No-SQL son:", "Modelo de datos relacional, y sin esquema (schemaless).", "Modelo de datos relacional, y con esquema (schemaless).", "Modelo de datos no relacional, y sin esquema (schemaless).", "Modelo de datos no relacional, y con esquema (schemaless).", "3");
        tipo_test("Tres tipos de bases de datos que surgen dentro de la familia No-SQL son:", "Basado en filas, clave/valor y de documentos.", "Basado en columnas, clave/valor y de documentos.", "Basado en columnas, indice, y de documentos.", "Basado en columnas, clave/valor y de objetos.", "2");
        tipo_test("Las bases de datos basadas en gráficos:", "Son menos eficientes que las relacionales.", "Es un tipo de base de datos NoSQL.", "Son mucho más rápidas.", "Todas son verdaderas.", "2");
        tipo_test("Identifica el que no es un tipo de Big Data:", "Estructurado.", "No estructurado.", "Semiestructurado.", "Norelacional.", "4");
        tipo_test("Las bases de datos XML nativas:", "Se basan en tablas.", "Tienen consultas SQL.", "Se basan en los llamados contenedores.", "Todas son verdaderas.", "3");
        tipo_test("El método createCriteria() que se ejecuta desde un objeto de session devolverá:", "Un objeto Query.", "Un objeto Criteria.", "Un objeto Transaction.", "Un objeto Session.", "2");
        tipo_test("¿Qué es Mongod?", "Servicio principal de la base de datos. Maneja los accesos a datos.", "Es un fichero de configuración .conf.", "Es un fichero de documentación para la base de datos.", "Todas son falsas.", "1");
        tipo_test("La base de datos Cassandra es un tipo de base de datos:", "Clave/valor.", "Basado en columnas.", "Basada en gráficos.", "No existe.", "2");
        tipo_test("A una lista de elementos no ordenados y todos ellos con la misma tipología podremos\n        definirlo como tipo de colección:", "VARRAY.", "Lista.", "PL/SQL.", "Tabla anidada.", "4");
        tipo_test("¿Cuál es el término para denominar a la tabla del mundo relacional en MongoDB?", "Documento.", "Colección.", "Bases de datos.", "JSON.", "2");
        tipo_test("Una característica fundamental de las bases de datos orientadas a objetos\n        es que proporciona ...", "Propiedades de herencia.", "Encapsulación.", "Un identificador de objeto.", "Todas las respuestas son correctas.", "4");
        tipo_test("Una característica de un índice es:", "Se almacerna en memoria.", "Se almacena en disco duro.", "No se almacena.", "Todas son falsas.", "1");
        
         
        _Main_.Principal.setAsignatura("DESARROLLO DE INTERFACES");
        
        tipo_test("Cuando se incluyen imágenes en un informe, se debe tener en cuenta que ...", "Como elemento visual siempre proporciona un valor añadido.", "Incluir una imagen indicando la ruta absoluta es una opción recomendada solo para pruebas.", "Podemos incluir una imagen indicando una dirección URL.", "Todas las respuestas son correctas.", "4");
        tipo_test("En el desarrollo de interfaces en Android el layout denominado LinearLayout ...", "Permite modificar la propiedad de altura con 'layout_height', aunque no la de ancho.", "Permite encontrar el tipo lineal horizontal que realiza la distribución en forma de filas.", "Permite alinear los elementos uno tras otro en una dirección concreta.", "No permite la dimensión de cada uno de los elementos a través de sus propiedades.", "3");
        tipo_test("Una tabla de contenido permite reflejar la estructura y contenido del documento,\n        además se caracteriza porque ...", "Se encuentra esquematizada en varios niveles entre los que se distinguen títulos y subtítulos.", "Debe duplicar la información para que esté disponible al usuario en todo momento.", "Se sitúa al final como recordatorio de todo el contenido mostrado.", "Debe mostrar siempre el número de página independientemente diseño.", "1");
        tipo_test("Se trata de un contenedor vacío utilizado para colocar los destinos hacia los que\n        apunta el gráfico de navegación. Este elemento permite que los destinos vayan\n        modificándose según el usuario navegada a través de la aplicación:", "Gráfico de navegación.", "Nav_version.", "NavController.", "NavHost.", "4");
        tipo_test("La herramienta Shalom Help Maker:", "Permite la creación de ficheros de ayuda para Windows y tras su descarga es necesario\n    ejecutar el software htmlhelp.exe para instalarla.", "Toda la información queda contenida en un único fichero por lo que es posible exportar\n    toda la ayuda en un solo documento PDF.", "Es una herramienta de pago.", "Permite creación de índices, contenidos enlazados a otras páginas, links externos,\n    así como la creación de imágenes que enriquecen el contenido del documento final.", "4");
        tipo_test("Indica cuál de las siguientes afirmaciones es falsa respecto a las tablas de contenidos:", "Las tablas de contenido se sitúan al final de cualquier documento,\n    como si de un índice de libro se tratara.", "Pueden mostrar el número de página o no, en función del diseño.", "Casi siempre incluye un enlace directo en cada uno de los títulos o subtítulos\n    por los que aparece compuesta.", "No debe duplicarse la información.", "1");
        tipo_test("¿Desde que fichero será necesario acceder para que esté disponible la pantalla\n        de diseño y el código asociado a la creación de cada nuevo componente?", "Main_activity.xml", "Activity_proyect.xml", "Activity_main.xml", "Content_main.xml", "3");
        tipo_test("La clase HelpBroker permite visualizar el contenido de la ayuda desde la aplicación,\n        ¿Cuál de los siguientes no es uno de sus principales métodos?", "enableHelpKey.", "enableHelpOnButton.", "enableHelp.", "findHelpSet.", "4");
        tipo_test("¿Cuál de los siguientes elementos permite añadir un conmutador entre estados en el\n        desarrollo de una aplicación?", "CheckBox.", "Spinner.", "ToggleButton.", "Ninguno de los anteriores.", "3");
        
        _Main_.Principal.setAsignatura("EMPRESA E INICIATIVA EMPRENDEDORA");
        
        tipo_test("Tipo de obligación tributaria materia que indica el momento en el que contraemos la deuda\n        con la Administración Pública, estando en ese momento ya obligados a pagar el tributo.", "Tasa.", "Hecho imponible.", "Exención.", "Devengo.", "4");
        tipo_test("La compraventa no puede realizarse de cualquier manera, sino que debe tener, por ley,\n        una serie de elementos:", "Objeto, partes, precio, recibo y factura.", "Partes, presupuesto, factura y forma de pago.", "Objeto, partes, precio, forma de pago y consentimiento.", "Objeto, partes, precio, pedido y consentimiento.", "3");
        tipo_test("En relación a la inversión:", "Aquella actividad dirigida a destinar recursos con el fin de conseguir beneficios.", "Asume un coste de oportunidad.", "Asume un riesgo.", "Todas las respuestas son correctas.", "4");
        tipo_test("Las partes del balance son:", "Balance, cuenta de pérdidas y ganancias, estado de cambios de patrimonio, estado de\n    flujos de efectivo y memoria.", "Marco conceptual de la contabilidad, normas de registro y valoración, cuentas anuales,\n    cuadro de cuentas, definiciones y relaciones contables.", "Activo, pasivo y patrimonio neto.", "Ninguna es correcta.", "3");
        tipo_test("Los libros contables obligatorios son:", "Libro diario y libro de inventarios.", "Libro diario y libro mayor.", "Libro de inventarios y libro mayor.", "Libro diario y libros auxiliares.", "1");
        tipo_test("Cuando hablamos de la cualificación de un trabajador a corto plazo, nos referimos a:", "Desarrollo.", "Curso.", "Formación.", "Prueba de selección.", "3");
        tipo_test("El Margen de contribución es:", "El número de unidades físicas que representan una ganancia sobre las ventas totales.", "El porcentaje que representa una ganancia sobre el precio de venta final.", "No está relacionado con el precio de venta.", "Todas son correctas.", "2");
        tipo_test("Los libros contables son documentos de la empresa donde se refleja y registra la información\n        económica, financiera y contable de la misma. ¿Cuáles de los siguientes son obligatorios\n        inscribirlos en el Registro mercantil junto a las cuentas anuales?", "Libro de Caja.", "Libro de Vencimiento.", "Libro Diario.", "Libro Mayor.", "3");
        
        _Main_.Principal.setAsignatura("PROGRAMACIÓN MULTIMEDIA Y DISPOSITIVOS MÓVILES");
                        
        tipo_test("¿Cuál de los siguientes no es una categoría válida de videojuegos?", "Videojuegos de rol.", "Videojuegos de acción.", "Videojuegos de estrategia.", "Videojuegos de organización.", "4");
        tipo_test("Las peticiones HTTPS en Android:", "Se pueden hacer con el método getHTTP y getHTTPS.", "Se ejecutarán en un hilo aparte.", "No necesitan de ningún permiso especial para su ejecución.", "Todas las respuestas son correctas.", "2");
        tipo_test("La biblioteca Volley:", "Nos permite obtener JSON de una forma sencilla.", "Nos permite subir ficheros a nuestro servidor de una forma sencilla.", "Viene integrada directamente en la JDK de Android.", "Puede lazar la excepción IndexOfBoundException.", "1");
        tipo_test("La API que nos permitirá utilizar Gmail es:", "Gmail API.", "API for Gmail.", "Gmail for Android.", "Google no nos permite utilizar su servicio de Gmail.", "1");
        
        _Main_.Principal.setAsignatura("PROGRAMACIÓN DE SERVICIOS Y PROCESOS");
        
        tipo_test("El algoritmo AES de cifrado puede tener un tamaño de clave de:", "128 bits.", "192 bits.", "256 bits.", "Todas las respuestas son correctas.", "4");
        tipo_test("¿Cuál de las siguientes operaciones no la realiza un cliente?", "Realizar validaciones de datos.", "Interactuar con el usuario.", "Procesar todas las peticiones para comprobar que sean válidas.", "Recibir los resultados que le envía el servidor.", "1");
        tipo_test("¿Qué hace el método getPort()?", "Devuelve el puerto de envío/recepción del paquete.", "Devuelve el puerto de donde procede el Socket.", "Devuelve la dirección del host remoto de envío/recepción.", "Depende de la clase.", "4");
        tipo_test("El método readUTF() nos permitirá:", "Enviar mensajes a través de un Socket.", "Recibir mensajes a través de un Socket.", "Enviar y recibir mensajes a través de un Socket.", "Este método no permite realizar ninguna acción con Sockets.", "2");
        tipo_test("¿Qué comando debemos utilizar para generar los certificados de los sockets seguros?", "keytool.", "securekey.", "Ambos comandos se pueden utilizar.", "Los sockets seguros no necesitan certificados.", "1");
        tipo_test("En Java, la clase específica para el uso del protocolo FTP ...", "ftp.", "ftpreplay.", "net.ftp.", "Java no tiene clases específicas para el uso del protocolo FTP.", "4");
        tipo_test("La clase FTP:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "3");
        tipo_test("¿Cuál de los siguientes no es un tipo de criptografía?", "Criptografía asimétrica.", "Criptografía avanzada.", "Criptografía con umbral.", "Criptografía basada en identidad.", "2");
        tipo_test("La arquitectura SOA es una tecnología que nos permite el diseño de aplicaciones:", "Basándose en un servicio determinado.", "Basándose en peticiones a un servicio.", "Basándose en la plataforma del cliente.", "Basándose en el tráfico de red que haya en el momento.", "2");
        tipo_test("Con la opción javax.net.ssl.keyStore:", "Indicamos la clave para acceder a dicho almacén y para acceder al certificado dentro\n    del almacén.", "Indicamos el almacén donde están los certificados en los que se confía.", "Indicamos el almacén donde está el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almacén y a los certificados dentro del almacén.", "3");
        tipo_test("Con la opción javax.net.ssl.keyStorePassword:", "Indicamos la clave para acceder a dicho almacén y para acceder al certificado dentro\n    del almacén.", "Indicamos el almacén donde están los certificados en los que se confía.", "Indicamos el almacén donde está el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almacén y a los certificados dentro del almacén.", "1");
        tipo_test("Con la opción javax.net.ssl.trustStore:", "Indicamos la clave para acceder a dicho almacén y para acceder al certificado dentro\n    del almacén.", "Indicamos el almacén donde están los certificados en los que se confía.", "Indicamos el almacén donde está el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almacén y a los certificados dentro del almacén.", "2");
        tipo_test("Con la opción javax.net.ssl.trustStorePassword:", "Indicamos la clave para acceder a dicho almacén y para acceder al certificado dentro\n    del almacén.", "Indicamos el almacén donde están los certificados en los que se confía.", "Indicamos el almacén donde está el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almacén y a los certificados dentro del almacén.", "4");
        tipo_test("La clase ServerSocket implementa:", "Un servidor TCP.", "Un cliente TCP.", "Un servidor UDP.", "Un cliente UDP.", "1");
        tipo_test("Los tipos de criptografía más usados en un entorno profesional son:", "Simétrica.", "Asimétrica.", "Simétrica y asimétrica.", "Todas son incorrectas.", "3");
        
        _Main_.Principal.setAsignatura("SISTEMAS DE GESTIÓN EMPRESARIAL");
        
        tipo_test("Con Odoo Studio podemos afirmar que ...", "La inserción de nuevos campos se encuentra limitada a etiquetas de texto y campos.", "Nos permite definir distintos estados en 'pipeline status bar'.", "Permite el diseño de formularios sin posibilidad de incluir imágenes.", "Permite crear informes estadísticos aunque sin vista gráfica.", "2");
        tipo_test("PgAdmin ...", "Es una aplicación que se usa para gestionar, administrar y desarrollar la base de datos de\n    PostgreSQL.", "Es un módulo de Odoo que se usa para gestionar, administrar y desarrollar la base de\n    datos de PostgreSQL.", "Es un apartado de los ajustes de Odoo, que se habilita al entrar en modo desarrollador y\n    que se usa para gestionar, administrar y desarrollar la base de datos de PostgreSQL.", "Ninguna respuesta es correcta.", "1");
        tipo_test("PyCharm informa que hay un error sintáctico en el código ...", "Mediante una exclamación roja en la parte superior derecha del editor.", "Subrayando en rojo en la barra de desplazamiento vertical la línea errónea.", "Indicando una explicación del error en la línea roja ubicada en la barra de desplazamiento\n    vertical.", "Todas las respuestas son correctas.", "1");
        tipo_test("Las rutas de producción ...", "Permiten fabricar un producto en una cadena de producción con diferentes equipos y\n    hacer un seguimiento de la fabricación.", "Nos aseguran que siempre habrá stock de materiales para fabricar un producto.", "Permiten enviar los pedidos fabricados a los clientes por diferentes rutas.", "Ninguna respuesta es correcta.", "1");
        tipo_test("Las rutas de producción ...", "No tienen por qué tener centros de producción.", "Deben tener centros de producción.", "Deben tener centros de tareas.", "No tienen por qué tener centros de tareas.", "2");
        tipo_test("Los campos calculados, al declararlos ...", "Necesitan de un atributo 'calculate' con el nombre del método.", "Necesitan de un atributo 'calculated_field' con el nombre del método.", "Necesitan de un atributo 'compute' con el nombre del método.", "Ninguna respuesta es correcta.", "3");
        tipo_test("Odoo Studio es un módulo de Odoo:", "Que solo es accesible desde la versión Enterprise, no es OpenSource.", "Que utiliza un lenguaje propio y diferente a XML para representar las vistas.", "Requiere siempre de la realización de scripts de programación,\n    no permite realizar cambios de modo visual.", "Está limitado a la modificación de lo existente sin posibilidad de crear módulos nuevos.", "1");
        tipo_test("En PgAdmin podremos realizar una monitorización en tiempo real del estado del\n        servidor de la base de datos haciendo uso ...", "Del Open Developer Tools.", "Del Query Tool.", "Del dashboard.", "Ninguna respuesta es correcta.", "3");
        tipo_test("El log de Odoo ...", "Se informa en el fichero que se encuentra en el parámetro logfile del archivo odoo.conf\n    si este parámetro está informado.", "Se informa en el stdout en PyCharm si el parámetro logfile del archivo odoo.conf no está\n    informado.", "Indicará la información de los logs que se produzcan en Odoo en el nivel que se indique\n    en el parámetro log_handler del archivo odoo.conf.", "Todas las respuestas son correctas.", "4");
        tipo_test("Las operaciones ...", "Se realizan en centros de producción y una ruta puede tener varias operaciones.", "Se realizan en centros de tareas y una ruta puede tener varias operaciones.", "Se realizan en centros de producción y una ruta puede tener solo una operación.", "Se realizan en centros de tareas y una ruta puede tener solo una operación.", "1");
        
    }    
}