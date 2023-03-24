package ProgramacionServiciosProcesos;

import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Test_Rep_II_Pro_Ser_Pro {
    
    public static void test_Repaso() {
        
                        _Main_.Principal.setAsignatura("PROGRAMACI�N DE SERVICIOS Y PROCESOS"); //    
                        _Main_.Principal.setTema("REPASO II");
                        
           /*001*/      tipo_test("�Qu� empresa cre� el protocolo Secure Socket Layer?", "Microsoft.", "Apple.", "Google.", "Ninguna es correcta.", "4");
           /*002*/      tipo_test("El protocolo IMAP ...", "Mapea direcciones de internet (Internet MAPping).", "Gestiona el env�o de correos electr�nicos.", "Permite a los destinatarios descargar emails del servidor a local.", "Permite a los destinatarios consultar emails en el servidor.", "4");
           /*003*/      tipo_test("El protocolo que permite consultar los correos electr�nicos directamente en el\n        servidor sin necesidad de descargarlos es:", "IMAP.", "POP3.", "SMTP.", "FTP.", "1");
           /*004*/      tipo_test("�A cu�ntos clientes podremos dar servicio en una aplicaci�n cliente/servidor\n        concurrente?", "Como m�ximo a 10 a la vez.", "Deberemos atender a los clientes de uno en uno en orden de llegada.", "Podremos dar servicio a todos los clientes que queramos al mismo tiempo.", "Podremos dar servicio a todos los clientes que queramos al mismo tiempo,\n    pero es conveniente establecer un m�ximo.", "4");
           /*005*/      tipo_test("La integridad:", "Esta caracter�stica requiere que �nicamente las personas autorizadas puedan modificar\n    la informaci�n existente en el sistema.", "Esta caracter�stica va a requerir que �nicamente las personas autorizadas accedan al\n    sistema.", "Esta caracter�stica hace que un usuario no pueda negar que ha enviado un mensaje.", "Esta caracter�stica requiere que todos los recursos del sistema est�n siempre disponibles\n    para el uso de los usuarios autorizados.", "1");
           /*006*/      tipo_test("Con la opci�n javax.net.ssl.trustStorePassword:", "Indicamos la clave para acceder a dicho almac�n y para acceder al certificado dentro\n    del almac�n.", "Indicamos el almac�n donde est�n los certificados en los que se conf�a.", "Indicamos el almac�n donde est� el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almac�n y a los certificados dentro del almac�n.", "4");
           /*007*/      tipo_test("Un Socket TCP (no orientado a la conexi�n).", "Se usa para establecer comunicaciones usando el protocolo TCP.", "Transmite informaci�n en bytes.", "Se implementa en Java con las clases Socket y ServerSocket.", "El socket TCP est� orientado a la conexi�n.", "4");
           /*008*/      tipo_test("Las clases Java para programar aplicaciones con clientes y servidores HTTP son:", "La clase URL para HTTP, y la clase URLConnection para HTTPS.", "La clase URL para HTTPS, y la clase URLConnection para HTTP.", "URL y URLConnection.", "Se utilizan las mismas clases que para los sockets TCP.", "3");
           /*009*/      tipo_test("En Java, la clase espec�fica para el uso del protocolo FTP ...", "ftp.", "ftpreplay.", "net.ftp.", "Java no tiene clases espec�ficas para el uso del protocolo FTP.", "4");
           /*010*/      tipo_test("La criptograf�a de clave privada ...", "Tambi�n se le llama criptograf�a asim�trica.", "Reduce el n�mero de claves necesarias para la comunicaci�n entre varias personas diferentes.", "Una misma clave se usa para cifrar y para descifrar.", "Se utiliza una clave para encriptar, y otra para desencriptar.", "3");
           
           /*011*/      tipo_test("�Cu�l es el tama�o de bloque que hemos visto en el tema,\n        para el cifrado Advanced Encryption Standard?", "128 bits.", "128 bytes.", "256 bits.", "256 bytes.", "1");
           /*012*/      tipo_test("En la arquitectura cliente servidor, quien interact�a con el usuario es ...", "El cliente.", "El servidor, en su capa usuario.", "Una aplicaci�n en el servidor.", "Ninguna es correcta.", "1");
           /*013*/      tipo_test("�Cu�l es el puerto que utiliza el protocolo HTTP?", "21.", "20.", "76.", "80.", "4");
           /*014*/      tipo_test("La clase FTPSClient:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "2");
           /*015*/      tipo_test("Las pol�ticas de acceso:", "Son las reglas que hay que seguir para crear una contrase�a segura.", "Son las reglas que hay que seguir a la hora de crear grupos seguros en el sistema.", "Se refieren a que hay que utilizar try-catch para gestionar los posibles errores en Java.", "Ninguna respuestas es correcta.", "4");
           /*016*/      tipo_test("Las fases del protocolo SSL son:", "Intercambio de claves, negociaci�n de algoritmos, verificaci�n canal seguro.", "Verificaci�n canal seguro, intercambio de claves, negociaci�n de algoritmos.", "Negociaci�n de algoritmos, intercambio de claves, verificaci�n canal seguro.", "Intercambio de claves, verificaci�n canal seguro, intercambio de claves.", "3");
           /*017*/      tipo_test("El algoritmo AES de cifrado puede tener un tama�o de clave de:", "128 bits.", "192 bits.", "256 bits.", "Todas las respuestas son correctas.", "4");
           /*018*/      tipo_test("Para programar un cliente TCP, creamos el socket y conectamos con el servidor", "Mediante su IP y su puerto.", "�nicamente mediante su IP, el puerto es opcional.", "Resolvemos la direcci�n IP del servidor a trav�s del DNS.", "Escaneando antes la red para averiguar su direcci�n IP.", "1");
           /*019*/      tipo_test("Un datagrama es un array de bytes ...", "Enviado a una direcci�n IP y un puerto TCP.", "Enviado a una direcci�n IP y a un puerto UDP.", "No necesita la IP destino.", "No necesita el puerto destino.", "2");
           /*020*/      tipo_test("Los sistemas inform�ticos son seguros si cumplen:", "Confidencialidad, Integridad, Repudio y Disponibilidad.", "Confidencialidad, Integridad, Repudio y Disposici�n.", "Confidencialidad, Integridad, No repudio y Disposici�n.", "Confidencialidad, Integridad, No repudio y Disponibilidad.", "4");
           
           /*021*/      tipo_test("Con la clase KeyPairGenerator,\n        �qu� clases usaremos para la firma y para su verificaci�n?", "PrivateKey tanto para la firma como la verificaci�n.", "PublicKey tanto para la firma como la verificaci�n.", "PublicKey para la firma, PrivateKey para la verificaci�n", "PrivateKey para la firma, PublicKey para la verificaci�n.", "4");
           /*022*/      tipo_test("Es una ventaja del modelo cliente/servidor:", "El mantenimiento de los sistemas es m�s simple.", "No requiere control de consistencia.", "Permite un acceso centralizado a los recursos en el servidor.", "Todas son correctas.", "3");
           /*023*/      tipo_test("El servicio de ficheros:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios podremos obtener ficheros en funci�n de su contenido.", "2");
           /*024*/      tipo_test("Para monitorizar el tiempo de respuesta del servidor:", "Basta con controlar el tiempo de proceso del servidor.", "Solo interesa realizar esta tarea si hay sobrecarga.", "Solo depende del tiempo de transmisi�n.", "Se debe tener en cuenta el tiempo de proceso del servidor y el tiempo de transmisi�n.", "4");
           /*025*/      tipo_test("El no repudio:", "Esta caracter�stica requiere que �nicamente las personas autorizadas puedan modificar\n    la informaci�n existente en el sistema.", "Esta caracter�stica va a requerir que �nicamente las personas autorizadas accedan al sistema.", "Esta caracter�stica hace que un usuario no pueda negar que ha enviado un mensaje.", "Esta caracter�stica requiere que todos los recursos del sistema est�n siempre disponibles\n    para el uso de los usuarios autorizados.", "3");
           /*026*/      tipo_test("�Qu� biblioteca debemos descargar para poder realizar un cifrado AES?", "commons-codec.", "codec-AES.", "AES-cipher.", "commons-codecs.", "1");
           /*027*/      tipo_test("Para acceder a los servicios web ...", "Se debe utilizar el protocolo Telnet.", "Se debe utilizar el protocolo FTP.", "Se debe utilizar el protocolo Telnet, y el lenguaje XML.", "Se debe utilizar el protocolo HTTP y el lenguaje XML.", "4");
           /*028*/      tipo_test("El protocolo de la capa de aplicaci�n que nos permite resolver direcciones de red es:", "DNS.", "TCP.", "TCP/IP.", "OSI.", "1");
           /*029*/      tipo_test("Las firmas digitales est�n basadas en ...", "Criptograf�a sim�trica y resumen de mensajes HASH.", "Criptograf�a sim�trica y resumen de mensajes de clave privada.", "Criptograf�a de clave privada y resumen de mensajes HASH.", "Criptograf�a de clave p�blica y resumen de mensajes HASH.", "4");
           /*030*/      tipo_test("Dentro de los servicios en red, son ejemplo de los clasificados como servicios de\n        acceso remoto.", "FTP y HTTP.", "Telnet y SSH.", "DHCP y DNS.", "ADSL y RDSI.", "2");
           
           /*031*/      tipo_test("Si utilizamos la misma clave para cifrar y descifrar,\n        y esta es �nica y debe distribuirse a quienes participan en la comunicaci�n ...", "Se trata de criptograf�a de clave p�blica o sim�trica.", "Se trata de criptograf�a de clave p�blica o asim�trica.", "Se trata de criptograf�a de clave privada o asim�trica.", "Se trata de criptograf�a de clave privada o sim�trica.", "4");
           /*032*/      tipo_test("En un sistema de 2 capas en el modelo cliente servidor ...", "El servidor puede hacer de cliente, y viceversa.", "Solo se puede sobrecargar si hay muchos clientes.", "Solo se puede sobrecargar si hay muchas peticiones.", "La escalabilidad es baj�sima.", "4");
           /*033*/      tipo_test("�Cu�l de las siguientes operaciones no la realiza un cliente?", "Realizar validaciones de datos.", "Interactuar con el usuario.", "Procesar todas las peticiones para comprobar que sean v�lidas.", "Recibir los resultados que le env�a el servidor.", "1");
           /*034*/      tipo_test("La clase URL:", "Esta es la clase que nos va a permitir operar con los valores devueltos por las consultas\n    FTP del servidor.", "Esta clase es la que nos va a permitir realizar operaciones con la direcci�n web que\n    hemos creado mediante URL. Podremos lanzar operaciones tipo GET y obtener las\n    respuestas de estas de una forma muy sencilla.", "Esta clase nos va a permitir realizar las configuraciones oportunas de los clientes FTP\n    de una forma sencilla.", "Esta clase nos va a permitir representar una direcci�n de una p�gina web, por ejemplo,\n    https://www.google.es.", "4");
           /*035*/      tipo_test("Indica el patr�n que permite validar un DNI con la letra en min�scula:", "Pattern.compile(\"[0-9]{9}-[a-zA-Z]\");", "Pattern.compile(\"[0-9]-[a-zA-Z]\");", "Pattern.compile(\"[0-9]{8}-[a-zA-Z]\");", "Pattern.compile(\"[0-9]{8}-[a-z]\");", "4");
           /*036*/      tipo_test("Con la opci�n javax.net.ssl.trustStore:", "Indicamos la clave para acceder a dicho almac�n y para acceder al certificado dentro\n    del almac�n.", "Indicamos el almac�n donde est�n los certificados en los que se conf�a.", "Indicamos el almac�n donde est� el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almac�n y a los certificados dentro del almac�n.", "2");
           /*037*/      tipo_test("Cu�l de las siguientes entradas de datos se validar�a por la expresi�n regular [a-z]{2}", "A2", "a2", "22", "ab", "4");
           /*038*/      tipo_test("La criptograf�a de clave p�blica ...", "Permite cifrar un mensaje con una clave p�blica.", "Permite cifrar un mensaje con una clave privada.", "Necesita una clave p�blica y una clave privada.", "Todas las respuestas son correctas.", "4");
           /*039*/      tipo_test("En la comunicaci�n en el modelo cliente/servidor, el m�todo de env�os de ACK es ...", "R�pido, efectivo y �til.", "Efectivo y �til, pero lento.", "R�pido, pero no muy efectivo.", "Los ACKs no se utilizan en el modelo clliente/servidor, sino en el modelo UDP.", "2");
           /*040*/      tipo_test("Las direcciones IP del formato IPv4 ...", "Identifican a los dispositivos que se conectan a una red TCP/IP.", "Identifican a los dispositivos que se conectan a una red, siempre que esta no sea UDP.", "Se componen de bloques de 5 n�meros.", "Se utilizan en el modelo TCP, pero no en el modelo OSI.", "1");
           
           /*041*/      tipo_test("�Qu� algoritmos de cifrado son m�s r�pidos?", "Los de criptograf�a de clave privada.", "Los de criptograf�a de clave p�blica.", "Los de criptograf�a de clave sim�trica.", "Cualquiera que utilice un par de claves, ir� el doble de r�pido.", "1");
           /*042*/      tipo_test("�Qui�n es el encargado de atender las peticiones de varios usuarios de forma\n        concurrente?", "El propio cliente.", "El servidor.", "Tanto el cliente como el servidor.", "El administrador del sistema.", "2");
           /*043*/      tipo_test("La forma de transmitir informaci�n en una conexi�n con Sockets TCP ser� en:", "Bits.", "Bytes.", "Datagramas.", "Paquetes.", "2");
           /*044*/      tipo_test("Sobre los servicios web:", "No deben poder localizarse.", "Deben ser accesibles a trav�s de la web.", "Act�an como un sistema completo.", "Ninguna de las respuestas es cierta.", "2");
           /*045*/      tipo_test("La autenticaci�n:", "Consiste en poder garantizar de una forma segura que los datos que se est�n\n    transmitiendo en una comunicaci�n solo los podr�n ver las personas a las que est�n\n    destinados.", "Consiste en garantizar que quien env�a los datos de la comunicaci�n es quien dice ser\n    en realidad.", "Esto garantiza que la persona que ha enviado el mensaje es quien dice ser.", "Esto garantiza que la persona que ha recibido el mensaje no puede negar su recepci�n.", "2");
           /*046*/      tipo_test("En la arquitectura cliente/servidor, es una funci�n del cliente:", "Aceptar peticiones.", "Procesar en orden las peticiones.", "Realizar validaciones de datos.", "Interactuar con el usuario.", "4");
           /*047*/      tipo_test("El tipo de virus inform�tico que se caracteriza por el borrado de la informaci�n\n        contenida en los ficheros que infecta es ...", "Virus de acci�n directa.", "Virus de sobreescritura.", "Virus de sector de arranque.", "Virus polim�rfico.", "2");
           /*048*/      tipo_test("SSH es la versi�n ...", "Segura del protocolo HTTP.", "Segura del protocolo SSL.", "Segura del protocolo Telnet.", "Segura del protocolo TLS.", "3");
           /*049*/      tipo_test("�Qui�n es el encargado de atender las peticiones de varios usuarios de forma concurrente?", "El propio cliente.", "El servidor.", "Tanto el cliente como el servidor.", "El administrador del sistema.", "2");
           /*050*/      tipo_test("Se podr�a decir que la diferencia entre SOA y SOAP es que ...", "SOA es el modelo de arquitectura, y SOAP una forma de comunicaci�n (protocolo)\n    que se permite en SOA.", "SOAP es el modelo de arquitectura, y SOA una forma de comunicaci�n (protocolo)\n    que se permite en SOA.", "Ambos son completamente equivalentes: SOA y SOAP son modelos de arquitectura.", "Ambos son completamente equivalentes: SOA y SOAP son protocolos.", "1");
           
           /*051*/      tipo_test("�C�mo se deben implementar los mecanismos de gesti�n de acceso de los usuarios a las\n        aplicaciones o p�ginas web?", "Almacenar en texto plano la clave, que debe tener entre 8 y 10 letras.", "Si la base de datos se encripta, no es necesario HTTPS.", "Si se usa HTTPS, no es necesario encriptar los datos.", "Encriptar clases de usuarios en la base de datos, y comunicaci�n HTTPS.", "4");
           /*052*/      tipo_test("�En qu� a�o apareci� el modelo Cliente/Servidor?", "70.", "80.", "60.", "55.", "2");
           /*053*/      tipo_test("El m�todo readUTF() nos permitir�:", "Enviar mensajes a trav�s de un Socket.", "Recibir mensajes a trav�s de un Socket.", "Enviar y recibir mensajes a trav�s de un Socket.", "Este m�todo no permite realizar ninguna acci�n con Sockets.", "2");
           /*054*/      tipo_test("La organizaci�n JPC:", "Es una organizaci�n con �nimo de lucro.", "Es una organizaci�n sin �nimo de lucro.", "Fue la que ide� el est�ndar JSP.", "Trabaja con las versiones de Java.", "4");
           /*055*/      tipo_test("En la criptograf�a p�blica, las claves de cifrado y descifrado son:", "Iguales.", "Diferentes.", "Son la misma clave, pero la de cifrado est� en may�sculas y la de descifrado est� en min�scula.", "Son diferentes y adem�s deben ser n�meros obligatoriamente.", "2");
           /*056*/      tipo_test("Los tipos de criptograf�a m�s usados en un entorno profesional son:", "Sim�trica.", "Asim�trica.", "Sim�trica y asim�trica.", "Todas son incorrectas.", "3");
           /*057*/      //tipo_test("", "", "", "", "", "");
           /*058*/      //tipo_test("", "", "", "", "", "");
           /*059*/      //tipo_test("", "", "", "", "", "");
           /*060*/      //tipo_test("", "", "", "", "", "");
           
           /*061*/      tipo_test("La caracter�stica seg�n la cu�l �nicamente las personas autorizadas pueden acceder\n        al sistema es ...", "Confidencialidad.", "Integridad.", "No repudio.", "Disponibilidad.", "1");
           /*062*/      tipo_test("La comunicaci�n en el modelo Cliente/Servidor se basa en:", "Intercambio de paquetes.", "Intercambio de datagramas.", "Intercambio de mensajes.", "Intercambio de ACK.", "3");
           /*063*/      tipo_test("�Por qu� hacemos un bucle infinito en el servidor?", "No se har� ning�n bucle infinito.", "Para esperar constantemente peticiones de clientes.", "Porque tarda mucho en iniciar y as� aseguramos que no termina su hilo.", "Todas las opciones son correctas.", "2");
           /*064*/      tipo_test("El est�ndar XML lo propuso:", "W3C.", "OASIS.", "JPC.", "Google.", "1");
           /*065*/      tipo_test("�Qu� significa la palabra criptograf�a?", "Escritura remota.", "Escritura autom�tica.", "Escritura ininteligible.", "Escritura secreta.", "4");
           /*066*/      //tipo_test("", "", "", "", "", "");
           /*067*/      //tipo_test("", "", "", "", "", "");
           /*068*/      //tipo_test("", "", "", "", "", "");
           /*069*/      //tipo_test("", "", "", "", "", "");
           /*070*/      //tipo_test("", "", "", "", "", "");
           
           /*071*/      tipo_test("El grupo de amenazas relativas a la destrucci�n de recursos del sistema inform�tico es ...", "Interrupci�n.", "Intercepci�n.", "Modificaci�n.", "Fabricaci�n.", "1");
           /*072*/      tipo_test("�Cu�l de las siguientes operaciones no la realiza un servidor?", "Recibir peticiones del cliente.", "Procesar las peticiones del cliente.", "Mostrar los resultados al usuario.", "Encargarse de que el sistema sea seguro.", "3");
           /*073*/      tipo_test("La clase ServerSocket implementa:", "Un servidor TCP.", "Un cliente TCP.", "Un servidor UDP.", "Un cliente UDP.", "1");
           /*074*/      tipo_test("�Qu� es OASIS?", "Una organizaci�n sin fines de lucro.", "Han producido una serie de normas para la arquitectura orientada a servicios.", "Una organizaci�n que impulsa la adopci�n de est�ndares para los servicios web.", "Todas las respuestas son correctas.", "4");
           /*075*/      tipo_test("�Cu�l de los siguientes no es un tipo de criptograf�a?", "Criptograf�a asim�trica.", "Criptograf�a avanzada.", "Criptograf�a con umbral.", "Criptograf�a basada en identidad.", "2");
           /*076*/      //tipo_test("", "", "", "", "", "");
           /*077*/      //tipo_test("", "", "", "", "", "");
           /*078*/      //tipo_test("", "", "", "", "", "");
           /*079*/      //tipo_test("", "", "", "", "", "");
           /*080*/      //tipo_test("", "", "", "", "", "");
           
           /*081*/      tipo_test("La expresi�n regular [a-z]{2,5} representa:", "Una letra min�scula y un n�mero del 2 al 5.", "Entre dos y cinco letras min�sculas.", "Cualquier letra min�scula o n�mero del 2 al 5.", "Ninguna respuesta es correcta.", "2");
           /*082*/      tipo_test("�Cu�l de las siguientes configuraciones del modelo Cliente/Servidor no es correcta?", "1 cliente - 1 servidor.", "3 clientes - 1 servidor.", "2 clientes - 2 servidores.", "Todas las configuraciones son correctas.", "4");
           /*083*/      tipo_test("La clase Socket se utiliza para realizar conexiones:", "UDP.", "TCP.", "Para realizar conexiones tanto TCP como UDP.", "Ninguna de las respuestas anteriores es correcta.", "2");
           /*084*/      tipo_test("Para la creaci�n de un web service en Java:", "Debemos crear solo una aplicaci�n que se ejecute en el servidor.", "Debemos crear un servicio de servidor, y seg�n el navegador se ejecutar� o no.", "Debemos crear la aplicaci�n servidor y la aplicaci�n cliente que use dicho servicio.", "Ninguna de las respuestas es correcta.", "3");
           /*085*/      tipo_test("Uno de los principios criptogr�ficos es:", "El algoritmo de encriptaci�n debe ser complejo y no conocido.", "La clave es conocida.", "La seguridad del sistema depende de la complejidad del algoritmo.", "El dise�o del sistema puede ser p�blico.", "4");
           /*086*/      //tipo_test("", "", "", "", "", "");
           /*087*/      //tipo_test("", "", "", "", "", "");
           /*088*/      //tipo_test("", "", "", "", "", "");
           /*089*/      //tipo_test("", "", "", "", "", "");
           /*090*/      //tipo_test("", "", "", "", "", "");
           
           /*091*/      tipo_test("Hablando de sockets en comunicaciones TCP, la clase Socket ...", "Se utiliza en la creaci�n del servidor TCP.", "Se utiliza para que el servidor TCP env�e mensajes.", "Se utiliza en la creaci�n del cliente TCP.", "Se utiliza para que el cliente TCP env�e mensajes.", "3");
           /*092*/      tipo_test("Se�ala la afirmaci�n incorrecta del modelo Cliente/Servidor:", "El desarrollo y mantenimiento de este tipo de aplicaciones es relativamente sencillo.", "Utiliza clientes que son ligeros.", "Este modelo no es modular.", "Tiene que garantizar una buena seguridad en el sistema.", "3");
           /*093*/      tipo_test("Las clases principales para poder crear servidores UDP son:", "DatagramPacket y DatagramSocket.", "Sockets y PacketDatagram.", "Datagram y Sockets.", "Datagram y PacketSocket.", "1");
           /*094*/      tipo_test("�Cu�l de las siguientes es una arquitectura orientada a objetos?", "Arquitectura Orientada a Servicios Tradicional.", "Arquitectura Orientada a Servicios Convencional.", "Arquitectura Orientada a Servicios Miltihilo.", "Arquitectura Orientada a Servicios de tercera generaci�n.", "1");
           /*095*/      tipo_test("Las firmas digitales utilizan:", "Criptograf�a de clave privada y resumen de mensajes MD5.", "Criptograf�a de clave p�blica y resumen de mensajes MD5.", "Criptograf�a de clave privada y resumen de mensajes HASH.", "Criptograf�a de clave p�blica y resumen de mensajes HASH.", "4");
           /*096*/      //tipo_test("", "", "", "", "", "");
           /*097*/      //tipo_test("", "", "", "", "", "");
           /*098*/      //tipo_test("", "", "", "", "", "");
           /*099*/      //tipo_test("", "", "", "", "", "");
           /*100*/      //tipo_test("", "", "", "", "", "");
           
           /*101*/      tipo_test("La clase DatagramPacket ...", "Es equivalente a DatagramSocket, pudi�ndose usar una u otra.", "Se utiliza para establecer conexiones TCP en el lado cliente.", "Se utiliza para establecer conexiones TCP en el lado servidor.", "Se utiliza en la gesti�n de comunicaciones con mensajes UDP.", "4");
           /*102*/      tipo_test("�Cu�l de los siguientes modelos son v�lidos en el modelo Cliente/Servidor?", "Modelo de 1 capa.", "Modelo de 3 capas.", "Modelo de 2 capas.", "Todos estos modelos son v�lidos.", "4");
           /*103*/      tipo_test("Los Sockets UDP son:", "M�s lentos que los TCP, pero m�s seguros.", "M�s r�pidos que los TCP, pero menos seguros.", "M�s r�pidos que los TCP y m�s seguros.", "M�s lentos que los TCP y menos seguros.", "2");
           /*104*/      tipo_test("La arquitectura SOA es una tecnolog�a que nos permite el dise�o de aplicaciones:", "Bas�ndose en un servicio determinado.", "Bas�ndose en peticiones a un servicio.", "Bas�ndose en la plataforma del cliente.", "Bas�ndose en el tr�fico de red que haya en el momento.", "2");
           /*105*/      tipo_test("En la criptograf�a privada, las claves de cifrado y descifrado son:", "Iguales.", "Diferentes.", "Son la misma clave, pero la de cifrado est� en may�sculas y la de descifrado est�\n    en min�scula.", "Son iguales y adem�s deben ser n�meros obligatoriamente.", "1");
           /*106*/      //tipo_test("", "", "", "", "", "");
           /*107*/      //tipo_test("", "", "", "", "", "");
           /*108*/      //tipo_test("", "", "", "", "", "");
           /*109*/      //tipo_test("", "", "", "", "", "");
           /*110*/      //tipo_test("", "", "", "", "", "");
           
           /*111*/      tipo_test("Es un campo imprescindible en los datagramas UDP:", "N�mero de orden del datagrama.", "Campo de control de congesti�n.", "Array de bytes.", "Todas las respuestas son correctas.", "3");
           /*112*/      tipo_test("�C�mo se denomina a los mensajes de confirmaci�n de llegada de datos?", "ACKP.", "APK.", "ACK.", "MRC (Mensaje de Recepci�n Correcta).", "3");
           /*113*/      tipo_test("El m�todo writeUTF() nos permitir�:", "Enviar mensajes a trav�s de un Socket.", "Recibir mensajes a trav�s de un Socket.", "Enviar y recibir mensajes a trav�s de un Socket.", "Este m�todo no permite realizar ninguna acci�n con Sockets.", "1");
           /*114*/      tipo_test("�Cu�l de las siguientes no es una caracter�stica de un servicio web?", "Interoperabilidad.", "Independencia de la plataforma.", "Dependencia del navegador.", "Son componentes independientes que se pueden integrar.", "3");
           /*115*/      tipo_test("El certificado digital:", "Consiste en poder garantizar de una forma segura que los datos que se est�n\n    transmitiendo en una comunicaci�n solo los podr�n ver las personas a las que est�n\n    destinados.", "Garantiza que el env�o de la comunicaci�n se hace de forma segura.", "Esto garantiza que la persona que ha enviado el mensaje es quien dice ser.", "Esto garantiza que la persona que ha recibido el mensaje no puede negar su recepci�n.", "3");
           /*116*/      //tipo_test("", "", "", "", "", "");
           /*117*/      //tipo_test("", "", "", "", "", "");
           /*118*/      //tipo_test("", "", "", "", "", "");
           /*119*/      //tipo_test("", "", "", "", "", "");
           /*120*/      //tipo_test("", "", "", "", "", "");
           
           /*121*/      tipo_test("No es una organizaci�n de las identificadas en clase como intervinientes en la\n        definici�n de est�ndares que han de segu�r los servicios web.", "ISO.", "W3C.", "OASIS.", "JCP.", "1");
           /*122*/      tipo_test("�Cu�ntos servidores de datos podremos tener en un modelo de 3 capas?", "�nicamente uno.", "Podremos ampliar como m�ximo a dos.", "Podremos ampliar a todos los que necesitemos.", "No existen los servidores de datos en los modelos de 3 capas, eso es de los modelos de\n    n capas.", "3");
           /*123*/      tipo_test("�Qu� hace el m�todo getPort()?", "Devuelve el puerto de env�o/recepci�n del paquete.", "Devuelve el puerto de donde procede el Socket.", "Devuelve la direcci�n del host remoto de env�o/recepci�n.", "Depende de la clase.", "4");
           /*124*/      tipo_test("�Los Web Services permiten que distintos softwares se comuniquen entre s�?", "No.", "Si pero no funcionan con todos los navegadores.", "Si.", "S�lo si se ejecutan en la misma red.", "3");
           /*125*/      tipo_test("La confidencialidad:", "Consiste en poder garantizar de una forma segura que los datos que se est�n\n    transmitiendo en una comunicaci�n solo los podr�n ver las personas a las que est�n\n    destinados.", "Consiste en garantizar que quien env�a los datos de la comunicaci�n es quien dice ser\n    en realidad.", "Esto garantiza que la persona que ha enviado el mensaje es quien dice ser.", "Esto garantiza que la persona que ha recibido el mensaje no puede negar su recepci�n.", "1");
           /*126*/      //tipo_test("", "", "", "", "", "");
           /*127*/      //tipo_test("", "", "", "", "", "");
           /*128*/      //tipo_test("", "", "", "", "", "");
           /*129*/      //tipo_test("", "", "", "", "", "");
           /*130*/      //tipo_test("", "", "", "", "", "");
           
           /*131*/      tipo_test("�Cu�l ser�a la definici�n m�s adecuada para SOA y SOAP?", "SOAP es un modelo de arquitectura, SOA un protocolo que SOAP permite.", "Tanto SOA como SOAP son modelos de arquitectura.", "SOA es un modelo de arquitectura, SOAP un protocolo que SOA permite.", "Tanto SOA como SOAP son protocolos.", "3");
           /*132*/      tipo_test("El servicio de impresi�n:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en funci�n de su contenido.", "3");
           /*133*/      tipo_test("�Con qu� tipo de Socket deber�amos empezar a trabajar?", "Con UDP.", "Con TCP.", "Con cualquiera de ellos.", "Con el m�s r�pido.", "2");
           /*134*/      tipo_test("La organizaci�n OASIS:", "Es una organizaci�n con �nimo de lucro.", "Es una organizaci�n sin �nimo de lucro.", "Fue la que ide� el est�ndar JSP.", "Trabaja con las versiones de Java.", "2");
           /*135*/      tipo_test("Lo m�s �ptimo en cuando a criptograf�a es usar:", "Criptograf�a de clave p�blica.", "Criptograf�a de clave privada.", "Criptograf�a h�brida.", "La criptograf�a no sirve para proteger la informaci�n.", "3");
           /*136*/      //tipo_test("", "", "", "", "", "");
           /*137*/      //tipo_test("", "", "", "", "", "");
           /*138*/      //tipo_test("", "", "", "", "", "");
           /*139*/      //tipo_test("", "", "", "", "", "");
           /*140*/      //tipo_test("", "", "", "", "", "");
           
           /*141*/      tipo_test("Son caracter�sticas fundamentales de los servicios web:", "Acceso web y realizaci�n de funciones bien definidas.", "Localizaci�n e independencia.", "Independencia e interoperabilidad.", "Todas son correctas.", "4");
           /*142*/      tipo_test("El servicio DNS es un servicio de:", "Comunicaci�n.", "Informaci�n.", "Administraci�n.", "Acceso remoto.", "3");
           /*143*/      tipo_test("La clase URLConection:", "Esta es la clase que nos va a permitir operar con los valores devueltos por las consultas\n    FTP del servidor.", "Esta clase es la que nos va a permitir realizar operaciones con la direcci�n web que\n    hemos creado mediante URL. Podremos lanzar operaciones tipo GET y obtener las\n    respuestas de estas de una forma muy sencilla.", "Esta clase nos va a permitir realizar las configuraciones oportunas de los clientes FTP\n    de una forma sencilla.", "Esta clase nos va a permitir representar una direcci�n de una p�gina web, por ejemplo,\n    https://www.google.es.", "2");
           /*144*/      tipo_test("La confidencialidad:", "Esta caracter�stica requiere que �nicamente las personas autorizadas puedan modificar\n    la informaci�n existente en el sistema.", "Esta caracter�stica va a requerir que �nicamente las personas autorizadas accedan al sistema.", "Esta caracter�stica hace que un usuario no pueda negar que ha enviado un mensaje.", "Esta caracter�stica requiere que todos los recursos del sistema est�n siempre disponibles\n    para el uso de los usuarios autorizados.", "2");
           /*145*/      tipo_test("La versi�n segura de Telnet es:", "FTPS.", "SSH.", "IMAP.", "POP3.", "2");
           /*146*/      //tipo_test("", "", "", "", "", "");
           /*147*/      //tipo_test("", "", "", "", "", "");
           /*148*/      //tipo_test("", "", "", "", "", "");
           /*149*/      //tipo_test("", "", "", "", "", "");
           /*150*/      //tipo_test("", "", "", "", "", "");
           
           /*151*/      tipo_test("La clase Java que nos permite realizar operaciones con una direcci�n web URL es ...", "URL.", "URLConnection.", "HTTPopenConnection().", "HTTPSopenConnection", "2");
           /*152*/      tipo_test("El protocolo NNTP:", "Este protocolo nos permitir� el env�o de noticias por la red.", "Este protocolo nos permitir� chatear v�a Internet. Es el protocolo que siguen los chats de\n    Internet.", "Este protocolo nos permitir� resolver direcciones de red.", "Ninguna de las respuestas es correcta.", "1");
           /*153*/      tipo_test("�Cu�l de las siguientes excepciones no es lanzada cuando realizamos operaciones FTP?", "SocketException.", "IndexOfBoundException.", "IOException.", "Ninguna de estas excepciones se lanza.", "2");
           /*154*/      tipo_test("�Qu� permiten las pol�ticas de acceso?", "Indicar los recursos a los que puede acceder una determinada aplicaci�n.", "Gestionar los usuarios del sistema de forma segura.", "Permiten el acceso del usuario al sistema de forma segura.", "Ninguna de las respuestas es correcta.", "1");
           /*155*/      tipo_test("Con la opci�n javax.net.ssl.keyStore:", "Indicamos la clave para acceder a dicho almac�n y para acceder al certificado dentro\n    del almac�n.", "Indicamos el almac�n donde est�n los certificados en los que se conf�a.", "Indicamos el almac�n donde est� el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almac�n y a los certificados dentro del almac�n.", "3");
           /*156*/      //tipo_test("", "", "", "", "", "");
           /*157*/      //tipo_test("", "", "", "", "", "");
           /*158*/      //tipo_test("", "", "", "", "", "");
           /*159*/      //tipo_test("", "", "", "", "", "");
           /*160*/      //tipo_test("", "", "", "", "", "");
           
           /*161*/      tipo_test("La clase espec�fica de Java para el uso del protocolo FTP es ...", "FTP.", "FTPReplay.", "FTPClient.", "Ninguna es correcta.", "4");
           /*162*/      tipo_test("El servicio de acceso remoto:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en funci�n de su contenido.", "1");
           /*163*/      tipo_test("Las hebras que atienden de forma concurrente a los clientes se ejecutan en:", "El cliente.", "El servidor.", "Se deber� ejecutar una hebra tanto en el cliente como en el servidor.", "Cuando usamos sockets no podemos usar hebras, ya que son incompatibles entre si.", "2");
           /*164*/      tipo_test("El organismo oficial encargado de la seguridad inform�tica en Espa�a es:", "El Instituto Nacional de Seguridad.", "El Instituto Nacional de Ciberseguridad.", "El Colegio Nacional de Seguridad.", "El Colegio Nacional de Ciberseguridad.", "2");
           /*165*/      tipo_test("�Qu� comando debemos utilizar para generar los certificados de los sockets seguros?", "keytool.", "securekey.", "Ambos comandos se pueden utilizar.", "Los sockets seguros no necesitan certificados.", "1");
           /*166*/      //tipo_test("", "", "", "", "", "");
           /*167*/      //tipo_test("", "", "", "", "", "");
           /*168*/      //tipo_test("", "", "", "", "", "");
           /*169*/      //tipo_test("", "", "", "", "", "");
           /*170*/      //tipo_test("", "", "", "", "", "");
           
           /*171*/      tipo_test("La clase de la API javax.mail que se encarga del env�o de los correos electr�nicos es ...", "Session.", "Message.", "Transport.", "Ninguna es correcta.", "3");
           /*172*/      tipo_test("El protocolo Telnet:", "Este protocolo nos permitir� enviar correo electr�nico.", "Este protocolo nos va a permitir navegar por Internet. Es el usado por todos los\n    navegadores web.", "Este protocolo nos va a permitir una gesti�n segura de forma remota de otro ordenador.", "Ninguna de las respuestas anteriores es correcta.", "4");
           /*173*/      tipo_test("El tiempo de respuesta del servidor:", "Nos indica lo que tarda en arrancar el servidor.", "Nos indica lo que tarda en arranca el cliente.", "Nos indica lo que tardan en arrancar el cliente y el servidor.", "Nos indica lo que tarda en ejecutar el servicio la aplicaci�n.", "4");
           /*174*/      tipo_test("La disponibilidad:", "Esta caracter�stica requiere que �nicamente las personas autorizadas puedan modificar\n    la informaci�n existente en el sistema.", "Esta caracter�stica va a requerir que �nicamente las personas autorizadas accedan al sistema.", "Esta caracter�stica hace que un usuario no pueda negar que ha enviado un mensaje.", "Esta caracter�stica requiere que todos los recursos del sistema est�n siempre disponibles\n    para el uso de los usuarios autorizados.", "4");
           /*175*/      tipo_test("�Qu� significan las siglas del algoritmo AES?", "Advanced Encryption Standard.", "Advantage Encryption Standard.", "Advanced Edition Standard.", "Advanced Encryption Situation.", "1");
           /*176*/      //tipo_test("", "", "", "", "", "");
           /*177*/      //tipo_test("", "", "", "", "", "");
           /*178*/      //tipo_test("", "", "", "", "", "");
           /*179*/      //tipo_test("", "", "", "", "", "");
           /*180*/      //tipo_test("", "", "", "", "", "");
           
           /*181*/      tipo_test("El protocolo DNS ...", "Cambia el nombre de red de una direcci�n IP ya existente.", "Configura un nombre de red para una direcci�n IP.", "Devuelve el nombre de red de una direcci�n IP, y viceversa.", "Establece la comunicaci�n entre una direcci�n IP y su nombre.", "3");
           /*182*/      tipo_test("El servicio de informaci�n:", "Gracias a estos servicios podremos gestionar las conexiones de los usuarios a nuestra\n    red desde lugares remotos.", "Gracias a estos servicios podremos ofrecer grandes cantidades de almacenamiento.", "Gracias a estos servicios podremos imprimir documentos de forma remota.", "Gracias a estos servicios obremos obtener ficheros en funci�n de su contenido. ", "4");
           /*183*/      tipo_test("La clase FTP:", "Hereda de la clase Client.", "Hereda de la clase FTPClient.", "Hereda de la clase SocketClient.", "Hereda de la clase ServerClient.", "3");
           /*184*/      tipo_test("�En qu� categor�a de amenaza se clasifica un programa para escuchar el tr�fico de la red?", "Interrupci�n.", "Intercepci�n.", "Modificaci�n.", "Fabricaci�n.", "3");
           /*185*/      tipo_test("Con la opci�n javax.net.ssl.keyStorePassword:", "Indicamos la clave para acceder a dicho almac�n y para acceder al certificado dentro\n    del almac�n.", "Indicamos el almac�n donde est�n los certificados en los que se conf�a.", "Indicamos el almac�n donde est� el certificado que nos identifica.", "Indicamos la clave para acceder a dicho almac�n y a los certificados dentro del almac�n.", "1");
           /*186*/      //tipo_test("", "", "", "", "", "");
           /*187*/      //tipo_test("", "", "", "", "", "");
           /*188*/      //tipo_test("", "", "", "", "", "");
           /*189*/      //tipo_test("", "", "", "", "", "");
           /*190*/      //tipo_test("", "", "", "", "", "");
           
           /*191*/      tipo_test("El protocolo FTP ...", "Es r�pido y seguro.", "No es r�pido, pero s� seguro.", "Es r�pido, pero no seguro.", "No es r�pido, ni tampoco seguro.", "3");
           /*192*/      tipo_test("El servicio DNS asigna a una IP un nombre de dominio:", "Verdadero, pero solo funcionar� cuando la IP tenga asociado un �nico nombre de dominio.", "Verdadero, pero solo funcionar� cuando el nombre de dominio tenga asociada una �nica IP.", "Verdadero, funcionar�, aunque la IP tenga asociados m�s de un nombre de dominio o viceversa.", "Falso, es el servicio DHCP quien realiza este trabajo.", "3");
           /*193*/      tipo_test("La biblioteca para enviar correos electr�nicos en Java es:", "javax.mail.", "java.mail.", "javax.email.", "java.email.", "1");
           /*194*/      tipo_test("Indica la afirmaci�n correcta sobre las excepciones:", "Se pueden utilizar todas las cl�usulas catch para gestionar todas las excepciones que\n    consideremos necesarias.", "Error, Exception y RuntimeException.", "El c�digo que hay en el bloque finally se ejecuta siempre. ", "Todas las afirmaciones anteriores son correctas.", "4");
           /*195*/      tipo_test("�Qu� significan las siglas del protocolo SSL?", "Secure Signed Layer.", "Secure Socket teLecomunication.", "Secure Sigma Layer.", "Secure Sockets Layer.", "4");
           /*196*/      //tipo_test("", "", "", "", "", "");
           /*197*/      //tipo_test("", "", "", "", "", "");
           /*198*/      //tipo_test("", "", "", "", "", "");
           /*199*/      //tipo_test("", "", "", "", "", "");
           /*200*/      //tipo_test("", "", "", "", "", "");
           
    }    
}