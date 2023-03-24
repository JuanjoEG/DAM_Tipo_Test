package ProgramacionServiciosProcesos;

import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */
public class Test_Rep_II_Pro_Ser_Pro {
    
    public static void test_Repaso() {
        
                        _Main_.Principal.setAsignatura("PROGRAMACIÓN DE SERVICIOS Y PROCESOS"); //    
                        _Main_.Principal.setTema("REPASO II");
                        
           /*001*/      tipo_test("¿Qué empresa creó el protocolo Secure Socket Layer?", "Microsoft.", "Apple.", "Google.", "Ninguna es correcta.", "4");
           /*002*/      tipo_test("El protocolo IMAP ...", "Mapea direcciones de internet (Internet MAPping).", "Gestiona el envío de correos electrónicos.", "Permite a los destinatarios descargar emails del servidor a local.", "Permite a los destinatarios consultar emails en el servidor.", "4");
           /*003*/      tipo_test("El protocolo que permite consultar los correos electrónicos directamente en el\n        servidor sin necesidad de descargarlos es:", "IMAP.", "POP3.", "SMTP.", "FTP.", "1");
           /*004*/      tipo_test("¿A cuántos clientes podremos dar servicio en una aplicación cliente/servidor\n        concurrente?", "Como máximo a 10 a la vez.", "Deberemos atender a los clientes de uno en uno en orden de llegada.", "Podremos dar servicio a todos los clientes que queramos al mismo tiempo.", "Podremos dar servicio a todos los clientes que queramos al mismo tiempo,\n    pero es conveniente establecer un máximo.", "4");
           /*005*/      tipo_test("La integridad:", "Esta característica requiere que únicamente las personas autorizadas puedan modificar\n    la información existente en el sistema.", "Esta característica va a requerir que únicamente las personas autorizadas accedan al\n    sistema.", "Esta característica hace que un usuario no pueda negar que ha enviado un mensaje.", "Esta característica requiere que todos los recursos del sistema estén siempre disponibles\n    para el uso de los usuarios autorizados.", "1");
           /*006*/      tipo_test("Con la opción javax.net.ssl.trustStorePassword:", "Indicamos la clave para acceder a dicho almacén y para acceder al certificado dentro\n    del almacén.", "Indicamos el almacén donde están los certificados en los que se confía.", "Indicamos el almacén donde está el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almacén y a los certificados dentro del almacén.", "4");
           /*007*/      tipo_test("Un Socket TCP (no orientado a la conexión).", "Se usa para establecer comunicaciones usando el protocolo TCP.", "Transmite información en bytes.", "Se implementa en Java con las clases Socket y ServerSocket.", "El socket TCP está orientado a la conexión.", "4");
           /*008*/      tipo_test("Las clases Java para programar aplicaciones con clientes y servidores HTTP son:", "La clase URL para HTTP, y la clase URLConnection para HTTPS.", "La clase URL para HTTPS, y la clase URLConnection para HTTP.", "URL y URLConnection.", "Se utilizan las mismas clases que para los sockets TCP.", "3");
           /*009*/      tipo_test("En Java, la clase específica para el uso del protocolo FTP ...", "ftp.", "ftpreplay.", "net.ftp.", "Java no tiene clases específicas para el uso del protocolo FTP.", "4");
           /*010*/      tipo_test("La criptografía de clave privada ...", "También se le llama criptografía asimétrica.", "Reduce el número de claves necesarias para la comunicación entre varias personas diferentes.", "Una misma clave se usa para cifrar y para descifrar.", "Se utiliza una clave para encriptar, y otra para desencriptar.", "3");
           
           /*011*/      tipo_test("¿Cuál es el tamaño de bloque que hemos visto en el tema,\n        para el cifrado Advanced Encryption Standard?", "128 bits.", "128 bytes.", "256 bits.", "256 bytes.", "1");
           /*012*/      tipo_test("En la arquitectura cliente servidor, quien interactúa con el usuario es ...", "El cliente.", "El servidor, en su capa usuario.", "Una aplicación en el servidor.", "Ninguna es correcta.", "1");
           /*013*/      tipo_test("¿Cuál es el puerto que utiliza el protocolo HTTP?", "21.", "20.", "76.", "80.", "4");
           /*014*/      tipo_test("La clase FTPSClient:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "2");
           /*015*/      tipo_test("Las políticas de acceso:", "Son las reglas que hay que seguir para crear una contraseña segura.", "Son las reglas que hay que seguir a la hora de crear grupos seguros en el sistema.", "Se refieren a que hay que utilizar try-catch para gestionar los posibles errores en Java.", "Ninguna respuestas es correcta.", "4");
           /*016*/      tipo_test("Las fases del protocolo SSL son:", "Intercambio de claves, negociación de algoritmos, verificación canal seguro.", "Verificación canal seguro, intercambio de claves, negociación de algoritmos.", "Negociación de algoritmos, intercambio de claves, verificación canal seguro.", "Intercambio de claves, verificación canal seguro, intercambio de claves.", "3");
           /*017*/      tipo_test("El algoritmo AES de cifrado puede tener un tamaño de clave de:", "128 bits.", "192 bits.", "256 bits.", "Todas las respuestas son correctas.", "4");
           /*018*/      tipo_test("Para programar un cliente TCP, creamos el socket y conectamos con el servidor", "Mediante su IP y su puerto.", "Únicamente mediante su IP, el puerto es opcional.", "Resolvemos la dirección IP del servidor a través del DNS.", "Escaneando antes la red para averiguar su dirección IP.", "1");
           /*019*/      tipo_test("Un datagrama es un array de bytes ...", "Enviado a una dirección IP y un puerto TCP.", "Enviado a una dirección IP y a un puerto UDP.", "No necesita la IP destino.", "No necesita el puerto destino.", "2");
           /*020*/      tipo_test("Los sistemas informáticos son seguros si cumplen:", "Confidencialidad, Integridad, Repudio y Disponibilidad.", "Confidencialidad, Integridad, Repudio y Disposición.", "Confidencialidad, Integridad, No repudio y Disposición.", "Confidencialidad, Integridad, No repudio y Disponibilidad.", "4");
           
           /*021*/      tipo_test("Con la clase KeyPairGenerator,\n        ¿qué clases usaremos para la firma y para su verificación?", "PrivateKey tanto para la firma como la verificación.", "PublicKey tanto para la firma como la verificación.", "PublicKey para la firma, PrivateKey para la verificación", "PrivateKey para la firma, PublicKey para la verificación.", "4");
           /*022*/      tipo_test("Es una ventaja del modelo cliente/servidor:", "El mantenimiento de los sistemas es más simple.", "No requiere control de consistencia.", "Permite un acceso centralizado a los recursos en el servidor.", "Todas son correctas.", "3");
           /*023*/      tipo_test("El servicio de ficheros:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios podremos obtener ficheros en función de su contenido.", "2");
           /*024*/      tipo_test("Para monitorizar el tiempo de respuesta del servidor:", "Basta con controlar el tiempo de proceso del servidor.", "Solo interesa realizar esta tarea si hay sobrecarga.", "Solo depende del tiempo de transmisión.", "Se debe tener en cuenta el tiempo de proceso del servidor y el tiempo de transmisión.", "4");
           /*025*/      tipo_test("El no repudio:", "Esta característica requiere que únicamente las personas autorizadas puedan modificar\n    la información existente en el sistema.", "Esta característica va a requerir que únicamente las personas autorizadas accedan al sistema.", "Esta característica hace que un usuario no pueda negar que ha enviado un mensaje.", "Esta característica requiere que todos los recursos del sistema estén siempre disponibles\n    para el uso de los usuarios autorizados.", "3");
           /*026*/      tipo_test("¿Qué biblioteca debemos descargar para poder realizar un cifrado AES?", "commons-codec.", "codec-AES.", "AES-cipher.", "commons-codecs.", "1");
           /*027*/      tipo_test("Para acceder a los servicios web ...", "Se debe utilizar el protocolo Telnet.", "Se debe utilizar el protocolo FTP.", "Se debe utilizar el protocolo Telnet, y el lenguaje XML.", "Se debe utilizar el protocolo HTTP y el lenguaje XML.", "4");
           /*028*/      tipo_test("El protocolo de la capa de aplicación que nos permite resolver direcciones de red es:", "DNS.", "TCP.", "TCP/IP.", "OSI.", "1");
           /*029*/      tipo_test("Las firmas digitales están basadas en ...", "Criptografía simétrica y resumen de mensajes HASH.", "Criptografía simétrica y resumen de mensajes de clave privada.", "Criptografía de clave privada y resumen de mensajes HASH.", "Criptografía de clave pública y resumen de mensajes HASH.", "4");
           /*030*/      tipo_test("Dentro de los servicios en red, son ejemplo de los clasificados como servicios de\n        acceso remoto.", "FTP y HTTP.", "Telnet y SSH.", "DHCP y DNS.", "ADSL y RDSI.", "2");
           
           /*031*/      tipo_test("Si utilizamos la misma clave para cifrar y descifrar,\n        y esta es única y debe distribuirse a quienes participan en la comunicación ...", "Se trata de criptografía de clave pública o simétrica.", "Se trata de criptografía de clave pública o asimétrica.", "Se trata de criptografía de clave privada o asimétrica.", "Se trata de criptografía de clave privada o simétrica.", "4");
           /*032*/      tipo_test("En un sistema de 2 capas en el modelo cliente servidor ...", "El servidor puede hacer de cliente, y viceversa.", "Solo se puede sobrecargar si hay muchos clientes.", "Solo se puede sobrecargar si hay muchas peticiones.", "La escalabilidad es bajísima.", "4");
           /*033*/      tipo_test("¿Cuál de las siguientes operaciones no la realiza un cliente?", "Realizar validaciones de datos.", "Interactuar con el usuario.", "Procesar todas las peticiones para comprobar que sean válidas.", "Recibir los resultados que le envía el servidor.", "1");
           /*034*/      tipo_test("La clase URL:", "Esta es la clase que nos va a permitir operar con los valores devueltos por las consultas\n    FTP del servidor.", "Esta clase es la que nos va a permitir realizar operaciones con la dirección web que\n    hemos creado mediante URL. Podremos lanzar operaciones tipo GET y obtener las\n    respuestas de estas de una forma muy sencilla.", "Esta clase nos va a permitir realizar las configuraciones oportunas de los clientes FTP\n    de una forma sencilla.", "Esta clase nos va a permitir representar una dirección de una página web, por ejemplo,\n    https://www.google.es.", "4");
           /*035*/      tipo_test("Indica el patrón que permite validar un DNI con la letra en minúscula:", "Pattern.compile(\"[0-9]{9}-[a-zA-Z]\");", "Pattern.compile(\"[0-9]-[a-zA-Z]\");", "Pattern.compile(\"[0-9]{8}-[a-zA-Z]\");", "Pattern.compile(\"[0-9]{8}-[a-z]\");", "4");
           /*036*/      tipo_test("Con la opción javax.net.ssl.trustStore:", "Indicamos la clave para acceder a dicho almacén y para acceder al certificado dentro\n    del almacén.", "Indicamos el almacén donde están los certificados en los que se confía.", "Indicamos el almacén donde está el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almacén y a los certificados dentro del almacén.", "2");
           /*037*/      tipo_test("Cuál de las siguientes entradas de datos se validaría por la expresión regular [a-z]{2}", "A2", "a2", "22", "ab", "4");
           /*038*/      tipo_test("La criptografía de clave pública ...", "Permite cifrar un mensaje con una clave pública.", "Permite cifrar un mensaje con una clave privada.", "Necesita una clave pública y una clave privada.", "Todas las respuestas son correctas.", "4");
           /*039*/      tipo_test("En la comunicación en el modelo cliente/servidor, el método de envíos de ACK es ...", "Rápido, efectivo y útil.", "Efectivo y útil, pero lento.", "Rápido, pero no muy efectivo.", "Los ACKs no se utilizan en el modelo clliente/servidor, sino en el modelo UDP.", "2");
           /*040*/      tipo_test("Las direcciones IP del formato IPv4 ...", "Identifican a los dispositivos que se conectan a una red TCP/IP.", "Identifican a los dispositivos que se conectan a una red, siempre que esta no sea UDP.", "Se componen de bloques de 5 números.", "Se utilizan en el modelo TCP, pero no en el modelo OSI.", "1");
           
           /*041*/      tipo_test("¿Qué algoritmos de cifrado son más rápidos?", "Los de criptografía de clave privada.", "Los de criptografía de clave pública.", "Los de criptografía de clave simétrica.", "Cualquiera que utilice un par de claves, irá el doble de rápido.", "1");
           /*042*/      tipo_test("¿Quién es el encargado de atender las peticiones de varios usuarios de forma\n        concurrente?", "El propio cliente.", "El servidor.", "Tanto el cliente como el servidor.", "El administrador del sistema.", "2");
           /*043*/      tipo_test("La forma de transmitir información en una conexión con Sockets TCP será en:", "Bits.", "Bytes.", "Datagramas.", "Paquetes.", "2");
           /*044*/      tipo_test("Sobre los servicios web:", "No deben poder localizarse.", "Deben ser accesibles a través de la web.", "Actúan como un sistema completo.", "Ninguna de las respuestas es cierta.", "2");
           /*045*/      tipo_test("La autenticación:", "Consiste en poder garantizar de una forma segura que los datos que se están\n    transmitiendo en una comunicación solo los podrán ver las personas a las que están\n    destinados.", "Consiste en garantizar que quien envía los datos de la comunicación es quien dice ser\n    en realidad.", "Esto garantiza que la persona que ha enviado el mensaje es quien dice ser.", "Esto garantiza que la persona que ha recibido el mensaje no puede negar su recepción.", "2");
           /*046*/      tipo_test("En la arquitectura cliente/servidor, es una función del cliente:", "Aceptar peticiones.", "Procesar en orden las peticiones.", "Realizar validaciones de datos.", "Interactuar con el usuario.", "4");
           /*047*/      tipo_test("El tipo de virus informático que se caracteriza por el borrado de la información\n        contenida en los ficheros que infecta es ...", "Virus de acción directa.", "Virus de sobreescritura.", "Virus de sector de arranque.", "Virus polimórfico.", "2");
           /*048*/      tipo_test("SSH es la versión ...", "Segura del protocolo HTTP.", "Segura del protocolo SSL.", "Segura del protocolo Telnet.", "Segura del protocolo TLS.", "3");
           /*049*/      tipo_test("¿Quién es el encargado de atender las peticiones de varios usuarios de forma concurrente?", "El propio cliente.", "El servidor.", "Tanto el cliente como el servidor.", "El administrador del sistema.", "2");
           /*050*/      tipo_test("Se podría decir que la diferencia entre SOA y SOAP es que ...", "SOA es el modelo de arquitectura, y SOAP una forma de comunicación (protocolo)\n    que se permite en SOA.", "SOAP es el modelo de arquitectura, y SOA una forma de comunicación (protocolo)\n    que se permite en SOA.", "Ambos son completamente equivalentes: SOA y SOAP son modelos de arquitectura.", "Ambos son completamente equivalentes: SOA y SOAP son protocolos.", "1");
           
           /*051*/      tipo_test("¿Cómo se deben implementar los mecanismos de gestión de acceso de los usuarios a las\n        aplicaciones o páginas web?", "Almacenar en texto plano la clave, que debe tener entre 8 y 10 letras.", "Si la base de datos se encripta, no es necesario HTTPS.", "Si se usa HTTPS, no es necesario encriptar los datos.", "Encriptar clases de usuarios en la base de datos, y comunicación HTTPS.", "4");
           /*052*/      tipo_test("¿En qué año apareció el modelo Cliente/Servidor?", "70.", "80.", "60.", "55.", "2");
           /*053*/      tipo_test("El método readUTF() nos permitirá:", "Enviar mensajes a través de un Socket.", "Recibir mensajes a través de un Socket.", "Enviar y recibir mensajes a través de un Socket.", "Este método no permite realizar ninguna acción con Sockets.", "2");
           /*054*/      tipo_test("La organización JPC:", "Es una organización con ánimo de lucro.", "Es una organización sin ánimo de lucro.", "Fue la que ideó el estándar JSP.", "Trabaja con las versiones de Java.", "4");
           /*055*/      tipo_test("En la criptografía pública, las claves de cifrado y descifrado son:", "Iguales.", "Diferentes.", "Son la misma clave, pero la de cifrado está en mayúsculas y la de descifrado está en minúscula.", "Son diferentes y además deben ser números obligatoriamente.", "2");
           /*056*/      tipo_test("Los tipos de criptografía más usados en un entorno profesional son:", "Simétrica.", "Asimétrica.", "Simétrica y asimétrica.", "Todas son incorrectas.", "3");
           /*057*/      //tipo_test("", "", "", "", "", "");
           /*058*/      //tipo_test("", "", "", "", "", "");
           /*059*/      //tipo_test("", "", "", "", "", "");
           /*060*/      //tipo_test("", "", "", "", "", "");
           
           /*061*/      tipo_test("La característica según la cuál únicamente las personas autorizadas pueden acceder\n        al sistema es ...", "Confidencialidad.", "Integridad.", "No repudio.", "Disponibilidad.", "1");
           /*062*/      tipo_test("La comunicación en el modelo Cliente/Servidor se basa en:", "Intercambio de paquetes.", "Intercambio de datagramas.", "Intercambio de mensajes.", "Intercambio de ACK.", "3");
           /*063*/      tipo_test("¿Por qué hacemos un bucle infinito en el servidor?", "No se hará ningún bucle infinito.", "Para esperar constantemente peticiones de clientes.", "Porque tarda mucho en iniciar y así aseguramos que no termina su hilo.", "Todas las opciones son correctas.", "2");
           /*064*/      tipo_test("El estándar XML lo propuso:", "W3C.", "OASIS.", "JPC.", "Google.", "1");
           /*065*/      tipo_test("¿Qué significa la palabra criptografía?", "Escritura remota.", "Escritura automática.", "Escritura ininteligible.", "Escritura secreta.", "4");
           /*066*/      //tipo_test("", "", "", "", "", "");
           /*067*/      //tipo_test("", "", "", "", "", "");
           /*068*/      //tipo_test("", "", "", "", "", "");
           /*069*/      //tipo_test("", "", "", "", "", "");
           /*070*/      //tipo_test("", "", "", "", "", "");
           
           /*071*/      tipo_test("El grupo de amenazas relativas a la destrucción de recursos del sistema informático es ...", "Interrupción.", "Intercepción.", "Modificación.", "Fabricación.", "1");
           /*072*/      tipo_test("¿Cuál de las siguientes operaciones no la realiza un servidor?", "Recibir peticiones del cliente.", "Procesar las peticiones del cliente.", "Mostrar los resultados al usuario.", "Encargarse de que el sistema sea seguro.", "3");
           /*073*/      tipo_test("La clase ServerSocket implementa:", "Un servidor TCP.", "Un cliente TCP.", "Un servidor UDP.", "Un cliente UDP.", "1");
           /*074*/      tipo_test("¿Qué es OASIS?", "Una organización sin fines de lucro.", "Han producido una serie de normas para la arquitectura orientada a servicios.", "Una organización que impulsa la adopción de estándares para los servicios web.", "Todas las respuestas son correctas.", "4");
           /*075*/      tipo_test("¿Cuál de los siguientes no es un tipo de criptografía?", "Criptografía asimétrica.", "Criptografía avanzada.", "Criptografía con umbral.", "Criptografía basada en identidad.", "2");
           /*076*/      //tipo_test("", "", "", "", "", "");
           /*077*/      //tipo_test("", "", "", "", "", "");
           /*078*/      //tipo_test("", "", "", "", "", "");
           /*079*/      //tipo_test("", "", "", "", "", "");
           /*080*/      //tipo_test("", "", "", "", "", "");
           
           /*081*/      tipo_test("La expresión regular [a-z]{2,5} representa:", "Una letra minúscula y un número del 2 al 5.", "Entre dos y cinco letras minúsculas.", "Cualquier letra minúscula o número del 2 al 5.", "Ninguna respuesta es correcta.", "2");
           /*082*/      tipo_test("¿Cuál de las siguientes configuraciones del modelo Cliente/Servidor no es correcta?", "1 cliente - 1 servidor.", "3 clientes - 1 servidor.", "2 clientes - 2 servidores.", "Todas las configuraciones son correctas.", "4");
           /*083*/      tipo_test("La clase Socket se utiliza para realizar conexiones:", "UDP.", "TCP.", "Para realizar conexiones tanto TCP como UDP.", "Ninguna de las respuestas anteriores es correcta.", "2");
           /*084*/      tipo_test("Para la creación de un web service en Java:", "Debemos crear solo una aplicación que se ejecute en el servidor.", "Debemos crear un servicio de servidor, y según el navegador se ejecutará o no.", "Debemos crear la aplicación servidor y la aplicación cliente que use dicho servicio.", "Ninguna de las respuestas es correcta.", "3");
           /*085*/      tipo_test("Uno de los principios criptográficos es:", "El algoritmo de encriptación debe ser complejo y no conocido.", "La clave es conocida.", "La seguridad del sistema depende de la complejidad del algoritmo.", "El diseño del sistema puede ser público.", "4");
           /*086*/      //tipo_test("", "", "", "", "", "");
           /*087*/      //tipo_test("", "", "", "", "", "");
           /*088*/      //tipo_test("", "", "", "", "", "");
           /*089*/      //tipo_test("", "", "", "", "", "");
           /*090*/      //tipo_test("", "", "", "", "", "");
           
           /*091*/      tipo_test("Hablando de sockets en comunicaciones TCP, la clase Socket ...", "Se utiliza en la creación del servidor TCP.", "Se utiliza para que el servidor TCP envíe mensajes.", "Se utiliza en la creación del cliente TCP.", "Se utiliza para que el cliente TCP envíe mensajes.", "3");
           /*092*/      tipo_test("Señala la afirmación incorrecta del modelo Cliente/Servidor:", "El desarrollo y mantenimiento de este tipo de aplicaciones es relativamente sencillo.", "Utiliza clientes que son ligeros.", "Este modelo no es modular.", "Tiene que garantizar una buena seguridad en el sistema.", "3");
           /*093*/      tipo_test("Las clases principales para poder crear servidores UDP son:", "DatagramPacket y DatagramSocket.", "Sockets y PacketDatagram.", "Datagram y Sockets.", "Datagram y PacketSocket.", "1");
           /*094*/      tipo_test("¿Cuál de las siguientes es una arquitectura orientada a objetos?", "Arquitectura Orientada a Servicios Tradicional.", "Arquitectura Orientada a Servicios Convencional.", "Arquitectura Orientada a Servicios Miltihilo.", "Arquitectura Orientada a Servicios de tercera generación.", "1");
           /*095*/      tipo_test("Las firmas digitales utilizan:", "Criptografía de clave privada y resumen de mensajes MD5.", "Criptografía de clave pública y resumen de mensajes MD5.", "Criptografía de clave privada y resumen de mensajes HASH.", "Criptografía de clave pública y resumen de mensajes HASH.", "4");
           /*096*/      //tipo_test("", "", "", "", "", "");
           /*097*/      //tipo_test("", "", "", "", "", "");
           /*098*/      //tipo_test("", "", "", "", "", "");
           /*099*/      //tipo_test("", "", "", "", "", "");
           /*100*/      //tipo_test("", "", "", "", "", "");
           
           /*101*/      tipo_test("La clase DatagramPacket ...", "Es equivalente a DatagramSocket, pudiéndose usar una u otra.", "Se utiliza para establecer conexiones TCP en el lado cliente.", "Se utiliza para establecer conexiones TCP en el lado servidor.", "Se utiliza en la gestión de comunicaciones con mensajes UDP.", "4");
           /*102*/      tipo_test("¿Cuál de los siguientes modelos son válidos en el modelo Cliente/Servidor?", "Modelo de 1 capa.", "Modelo de 3 capas.", "Modelo de 2 capas.", "Todos estos modelos son válidos.", "4");
           /*103*/      tipo_test("Los Sockets UDP son:", "Más lentos que los TCP, pero más seguros.", "Más rápidos que los TCP, pero menos seguros.", "Más rápidos que los TCP y más seguros.", "Más lentos que los TCP y menos seguros.", "2");
           /*104*/      tipo_test("La arquitectura SOA es una tecnología que nos permite el diseño de aplicaciones:", "Basándose en un servicio determinado.", "Basándose en peticiones a un servicio.", "Basándose en la plataforma del cliente.", "Basándose en el tráfico de red que haya en el momento.", "2");
           /*105*/      tipo_test("En la criptografía privada, las claves de cifrado y descifrado son:", "Iguales.", "Diferentes.", "Son la misma clave, pero la de cifrado está en mayúsculas y la de descifrado está\n    en minúscula.", "Son iguales y además deben ser números obligatoriamente.", "1");
           /*106*/      //tipo_test("", "", "", "", "", "");
           /*107*/      //tipo_test("", "", "", "", "", "");
           /*108*/      //tipo_test("", "", "", "", "", "");
           /*109*/      //tipo_test("", "", "", "", "", "");
           /*110*/      //tipo_test("", "", "", "", "", "");
           
           /*111*/      tipo_test("Es un campo imprescindible en los datagramas UDP:", "Número de orden del datagrama.", "Campo de control de congestión.", "Array de bytes.", "Todas las respuestas son correctas.", "3");
           /*112*/      tipo_test("¿Cómo se denomina a los mensajes de confirmación de llegada de datos?", "ACKP.", "APK.", "ACK.", "MRC (Mensaje de Recepción Correcta).", "3");
           /*113*/      tipo_test("El método writeUTF() nos permitirá:", "Enviar mensajes a través de un Socket.", "Recibir mensajes a través de un Socket.", "Enviar y recibir mensajes a través de un Socket.", "Este método no permite realizar ninguna acción con Sockets.", "1");
           /*114*/      tipo_test("¿Cuál de las siguientes no es una característica de un servicio web?", "Interoperabilidad.", "Independencia de la plataforma.", "Dependencia del navegador.", "Son componentes independientes que se pueden integrar.", "3");
           /*115*/      tipo_test("El certificado digital:", "Consiste en poder garantizar de una forma segura que los datos que se están\n    transmitiendo en una comunicación solo los podrán ver las personas a las que están\n    destinados.", "Garantiza que el envío de la comunicación se hace de forma segura.", "Esto garantiza que la persona que ha enviado el mensaje es quien dice ser.", "Esto garantiza que la persona que ha recibido el mensaje no puede negar su recepción.", "3");
           /*116*/      //tipo_test("", "", "", "", "", "");
           /*117*/      //tipo_test("", "", "", "", "", "");
           /*118*/      //tipo_test("", "", "", "", "", "");
           /*119*/      //tipo_test("", "", "", "", "", "");
           /*120*/      //tipo_test("", "", "", "", "", "");
           
           /*121*/      tipo_test("No es una organización de las identificadas en clase como intervinientes en la\n        definición de estándares que han de seguír los servicios web.", "ISO.", "W3C.", "OASIS.", "JCP.", "1");
           /*122*/      tipo_test("¿Cuántos servidores de datos podremos tener en un modelo de 3 capas?", "Únicamente uno.", "Podremos ampliar como máximo a dos.", "Podremos ampliar a todos los que necesitemos.", "No existen los servidores de datos en los modelos de 3 capas, eso es de los modelos de\n    n capas.", "3");
           /*123*/      tipo_test("¿Qué hace el método getPort()?", "Devuelve el puerto de envío/recepción del paquete.", "Devuelve el puerto de donde procede el Socket.", "Devuelve la dirección del host remoto de envío/recepción.", "Depende de la clase.", "4");
           /*124*/      tipo_test("¿Los Web Services permiten que distintos softwares se comuniquen entre sí?", "No.", "Si pero no funcionan con todos los navegadores.", "Si.", "Sólo si se ejecutan en la misma red.", "3");
           /*125*/      tipo_test("La confidencialidad:", "Consiste en poder garantizar de una forma segura que los datos que se están\n    transmitiendo en una comunicación solo los podrán ver las personas a las que están\n    destinados.", "Consiste en garantizar que quien envía los datos de la comunicación es quien dice ser\n    en realidad.", "Esto garantiza que la persona que ha enviado el mensaje es quien dice ser.", "Esto garantiza que la persona que ha recibido el mensaje no puede negar su recepción.", "1");
           /*126*/      //tipo_test("", "", "", "", "", "");
           /*127*/      //tipo_test("", "", "", "", "", "");
           /*128*/      //tipo_test("", "", "", "", "", "");
           /*129*/      //tipo_test("", "", "", "", "", "");
           /*130*/      //tipo_test("", "", "", "", "", "");
           
           /*131*/      tipo_test("¿Cuál sería la definición más adecuada para SOA y SOAP?", "SOAP es un modelo de arquitectura, SOA un protocolo que SOAP permite.", "Tanto SOA como SOAP son modelos de arquitectura.", "SOA es un modelo de arquitectura, SOAP un protocolo que SOA permite.", "Tanto SOA como SOAP son protocolos.", "3");
           /*132*/      tipo_test("El servicio de impresión:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en función de su contenido.", "3");
           /*133*/      tipo_test("¿Con qué tipo de Socket deberíamos empezar a trabajar?", "Con UDP.", "Con TCP.", "Con cualquiera de ellos.", "Con el más rápido.", "2");
           /*134*/      tipo_test("La organización OASIS:", "Es una organización con ánimo de lucro.", "Es una organización sin ánimo de lucro.", "Fue la que ideó el estándar JSP.", "Trabaja con las versiones de Java.", "2");
           /*135*/      tipo_test("Lo más óptimo en cuando a criptografía es usar:", "Criptografía de clave pública.", "Criptografía de clave privada.", "Criptografía híbrida.", "La criptografía no sirve para proteger la información.", "3");
           /*136*/      //tipo_test("", "", "", "", "", "");
           /*137*/      //tipo_test("", "", "", "", "", "");
           /*138*/      //tipo_test("", "", "", "", "", "");
           /*139*/      //tipo_test("", "", "", "", "", "");
           /*140*/      //tipo_test("", "", "", "", "", "");
           
           /*141*/      tipo_test("Son características fundamentales de los servicios web:", "Acceso web y realización de funciones bien definidas.", "Localización e independencia.", "Independencia e interoperabilidad.", "Todas son correctas.", "4");
           /*142*/      tipo_test("El servicio DNS es un servicio de:", "Comunicación.", "Información.", "Administración.", "Acceso remoto.", "3");
           /*143*/      tipo_test("La clase URLConection:", "Esta es la clase que nos va a permitir operar con los valores devueltos por las consultas\n    FTP del servidor.", "Esta clase es la que nos va a permitir realizar operaciones con la dirección web que\n    hemos creado mediante URL. Podremos lanzar operaciones tipo GET y obtener las\n    respuestas de estas de una forma muy sencilla.", "Esta clase nos va a permitir realizar las configuraciones oportunas de los clientes FTP\n    de una forma sencilla.", "Esta clase nos va a permitir representar una dirección de una página web, por ejemplo,\n    https://www.google.es.", "2");
           /*144*/      tipo_test("La confidencialidad:", "Esta característica requiere que únicamente las personas autorizadas puedan modificar\n    la información existente en el sistema.", "Esta característica va a requerir que únicamente las personas autorizadas accedan al sistema.", "Esta característica hace que un usuario no pueda negar que ha enviado un mensaje.", "Esta característica requiere que todos los recursos del sistema estén siempre disponibles\n    para el uso de los usuarios autorizados.", "2");
           /*145*/      tipo_test("La versión segura de Telnet es:", "FTPS.", "SSH.", "IMAP.", "POP3.", "2");
           /*146*/      //tipo_test("", "", "", "", "", "");
           /*147*/      //tipo_test("", "", "", "", "", "");
           /*148*/      //tipo_test("", "", "", "", "", "");
           /*149*/      //tipo_test("", "", "", "", "", "");
           /*150*/      //tipo_test("", "", "", "", "", "");
           
           /*151*/      tipo_test("La clase Java que nos permite realizar operaciones con una dirección web URL es ...", "URL.", "URLConnection.", "HTTPopenConnection().", "HTTPSopenConnection", "2");
           /*152*/      tipo_test("El protocolo NNTP:", "Este protocolo nos permitirá el envío de noticias por la red.", "Este protocolo nos permitirá chatear vía Internet. Es el protocolo que siguen los chats de\n    Internet.", "Este protocolo nos permitirá resolver direcciones de red.", "Ninguna de las respuestas es correcta.", "1");
           /*153*/      tipo_test("¿Cuál de las siguientes excepciones no es lanzada cuando realizamos operaciones FTP?", "SocketException.", "IndexOfBoundException.", "IOException.", "Ninguna de estas excepciones se lanza.", "2");
           /*154*/      tipo_test("¿Qué permiten las políticas de acceso?", "Indicar los recursos a los que puede acceder una determinada aplicación.", "Gestionar los usuarios del sistema de forma segura.", "Permiten el acceso del usuario al sistema de forma segura.", "Ninguna de las respuestas es correcta.", "1");
           /*155*/      tipo_test("Con la opción javax.net.ssl.keyStore:", "Indicamos la clave para acceder a dicho almacén y para acceder al certificado dentro\n    del almacén.", "Indicamos el almacén donde están los certificados en los que se confía.", "Indicamos el almacén donde está el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almacén y a los certificados dentro del almacén.", "3");
           /*156*/      //tipo_test("", "", "", "", "", "");
           /*157*/      //tipo_test("", "", "", "", "", "");
           /*158*/      //tipo_test("", "", "", "", "", "");
           /*159*/      //tipo_test("", "", "", "", "", "");
           /*160*/      //tipo_test("", "", "", "", "", "");
           
           /*161*/      tipo_test("La clase específica de Java para el uso del protocolo FTP es ...", "FTP.", "FTPReplay.", "FTPClient.", "Ninguna es correcta.", "4");
           /*162*/      tipo_test("El servicio de acceso remoto:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en función de su contenido.", "1");
           /*163*/      tipo_test("Las hebras que atienden de forma concurrente a los clientes se ejecutan en:", "El cliente.", "El servidor.", "Se deberá ejecutar una hebra tanto en el cliente como en el servidor.", "Cuando usamos sockets no podemos usar hebras, ya que son incompatibles entre si.", "2");
           /*164*/      tipo_test("El organismo oficial encargado de la seguridad informática en España es:", "El Instituto Nacional de Seguridad.", "El Instituto Nacional de Ciberseguridad.", "El Colegio Nacional de Seguridad.", "El Colegio Nacional de Ciberseguridad.", "2");
           /*165*/      tipo_test("¿Qué comando debemos utilizar para generar los certificados de los sockets seguros?", "keytool.", "securekey.", "Ambos comandos se pueden utilizar.", "Los sockets seguros no necesitan certificados.", "1");
           /*166*/      //tipo_test("", "", "", "", "", "");
           /*167*/      //tipo_test("", "", "", "", "", "");
           /*168*/      //tipo_test("", "", "", "", "", "");
           /*169*/      //tipo_test("", "", "", "", "", "");
           /*170*/      //tipo_test("", "", "", "", "", "");
           
           /*171*/      tipo_test("La clase de la API javax.mail que se encarga del envío de los correos electrónicos es ...", "Session.", "Message.", "Transport.", "Ninguna es correcta.", "3");
           /*172*/      tipo_test("El protocolo Telnet:", "Este protocolo nos permitirá enviar correo electrónico.", "Este protocolo nos va a permitir navegar por Internet. Es el usado por todos los\n    navegadores web.", "Este protocolo nos va a permitir una gestión segura de forma remota de otro ordenador.", "Ninguna de las respuestas anteriores es correcta.", "4");
           /*173*/      tipo_test("El tiempo de respuesta del servidor:", "Nos indica lo que tarda en arrancar el servidor.", "Nos indica lo que tarda en arranca el cliente.", "Nos indica lo que tardan en arrancar el cliente y el servidor.", "Nos indica lo que tarda en ejecutar el servicio la aplicación.", "4");
           /*174*/      tipo_test("La disponibilidad:", "Esta característica requiere que únicamente las personas autorizadas puedan modificar\n    la información existente en el sistema.", "Esta característica va a requerir que únicamente las personas autorizadas accedan al sistema.", "Esta característica hace que un usuario no pueda negar que ha enviado un mensaje.", "Esta característica requiere que todos los recursos del sistema estén siempre disponibles\n    para el uso de los usuarios autorizados.", "4");
           /*175*/      tipo_test("¿Qué significan las siglas del algoritmo AES?", "Advanced Encryption Standard.", "Advantage Encryption Standard.", "Advanced Edition Standard.", "Advanced Encryption Situation.", "1");
           /*176*/      //tipo_test("", "", "", "", "", "");
           /*177*/      //tipo_test("", "", "", "", "", "");
           /*178*/      //tipo_test("", "", "", "", "", "");
           /*179*/      //tipo_test("", "", "", "", "", "");
           /*180*/      //tipo_test("", "", "", "", "", "");
           
           /*181*/      tipo_test("El protocolo DNS ...", "Cambia el nombre de red de una dirección IP ya existente.", "Configura un nombre de red para una dirección IP.", "Devuelve el nombre de red de una dirección IP, y viceversa.", "Establece la comunicación entre una dirección IP y su nombre.", "3");
           /*182*/      tipo_test("El servicio de información:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en función de su contenido. ", "4");
           /*183*/      tipo_test("La clase FTP:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "3");
           /*184*/      tipo_test("¿En qué categoría de amenaza se clasifica un programa para escuchar el tráfico de la red?", "Interrupción.", "Intercepción.", "Modificación.", "Fabricación.", "3");
           /*185*/      tipo_test("Con la opción javax.net.ssl.keyStorePassword:", "Indicamos la clave para acceder a dicho almacén y para acceder al certificado dentro\n    del almacén.", "Indicamos el almacén donde están los certificados en los que se confía.", "Indicamos el almacén donde está el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almacén y a los certificados dentro del almacén.", "1");
           /*186*/      //tipo_test("", "", "", "", "", "");
           /*187*/      //tipo_test("", "", "", "", "", "");
           /*188*/      //tipo_test("", "", "", "", "", "");
           /*189*/      //tipo_test("", "", "", "", "", "");
           /*190*/      //tipo_test("", "", "", "", "", "");
           
           /*191*/      tipo_test("El protocolo FTP ...", "Es rápido y seguro.", "No es rápido, pero sí seguro.", "Es rápido, pero no seguro.", "No es rápido, ni tampoco seguro.", "3");
           /*192*/      tipo_test("El servicio DNS asigna a una IP un nombre de dominio:", "Verdadero, pero solo funcionará cuando la IP tenga asociado un único nombre de dominio.", "Verdadero, pero solo funcionará cuando el nombre de dominio tenga asociada una única IP.", "Verdadero, funcionará, aunque la IP tenga asociados más de un nombre de dominio o viceversa.", "Falso, es el servicio DHCP quien realiza este trabajo.", "3");
           /*193*/      tipo_test("La biblioteca para enviar correos electrónicos en Java es:", "javax.mail.", "java.mail.", "javax.email.", "java.email.", "1");
           /*194*/      tipo_test("Indica la afirmación correcta sobre las excepciones:", "Se pueden utilizar todas las cláusulas catch para gestionar todas las excepciones que\n    consideremos necesarias.", "Error, Exception y RuntimeException.", "El código que hay en el bloque finally se ejecuta siempre. ", "Todas las afirmaciones anteriores son correctas.", "4");
           /*195*/      tipo_test("¿Qué significan las siglas del protocolo SSL?", "Secure Signed Layer.", "Secure Socket teLecomunication.", "Secure Sigma Layer.", "Secure Sockets Layer.", "4");
           /*196*/      //tipo_test("", "", "", "", "", "");
           /*197*/      //tipo_test("", "", "", "", "", "");
           /*198*/      //tipo_test("", "", "", "", "", "");
           /*199*/      //tipo_test("", "", "", "", "", "");
           /*200*/      //tipo_test("", "", "", "", "", "");
           
    }    
}