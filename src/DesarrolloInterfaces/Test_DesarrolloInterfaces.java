package DesarrolloInterfaces;

import _Main_.Menu_Temas;
import java.util.Scanner;
import static _Main_.Principal.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Test_DesarrolloInterfaces {
    
    public static void Des_Int() {
        
        Menu_Temas.setTema_01("INTRODUCCI�N A LA CONFECCI�N DE INTERFACES.");
        Menu_Temas.setTema_02("CLASES Y COMPONENTES.");
        Menu_Temas.setTema_03("GENERACI�N DE INTERFACES A PARTIR DE DOCUMENTOS XML.");
        Menu_Temas.setTema_04("CREACI�N DE COMPONENTES.");
        Menu_Temas.setTema_05("EXPLOTACI�N DE COMPONENTES VISUALES.");
        Menu_Temas.setTema_06("USABILIDAD I: CONCEPTO Y NORMATIVA.");
        Menu_Temas.setTema_07("USABILIDAD II: PAUTAS DE DISE�O.");
        Menu_Temas.setTema_08("CONFECCI�N DE INFORMES I.");
        Menu_Temas.setTema_09("CONFECCI�N DE INFORMES II.");
        Menu_Temas.setTema_10("DOCUMENTACI�N DE APLICACIONES: AYUDAS.");
        Menu_Temas.setTema_11("DISTRIBUCI�N DE APLICACIONES.");
        Menu_Temas.setTema_12("REALIZACI�N DE PRUEBAS.");
        Menu_Temas.setTema_13("DESARROLLO DE INTERFACES EN ANDROID I.");
        Menu_Temas.setTema_14("DESARROLLO DE INTERFACES EN ANDROID II.");
        Menu_Temas.setTema_15("DESARROLLO DE INTERFACES PARA IOS.");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
        
        _Main_.Principal.setAsignatura("DESARROLLO DE INTERFACES");
        
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
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("�Cu�l es el objetivo de un lenguaje de programaci�n?", "Escribir instrucciones interpretables por una persona.", "Controlar diferentes comportamientos l�gicos o f�sicos de una m�quina.", "Desarrollar interfaces.", "Implementar una p�gina web.", "2");
            /*02*/      tipo_test("�Cu�l de los siguientes no es un lenguaje de alto nivel?", "Java.", "C#.", "Python.", "Ensamblador.", "4");
            /*03*/      tipo_test("�Cu�l de los siguientes modelos de programaci�n no pertenece al paradigma\n        imperativo?", "Estructurada.", "Declarativa.", "Modular.", "Procedimental.", "2");
            /*04*/      tipo_test("�Qu� diferencia existe entre la clase Component y Container de la librer�a AWT?", "La clase Container define los controles principales que se sit�an dentro del elemento\n    contenedor, y Component es la pantalla en la que se muestra la interfaz de la aplicaci�n\n    a desarrollar.", "La clase Component define los controles principales que se sit�an dentro del elemento\n    contenedor, y Container es la pantalla en la que se muestra la interfaz de la aplicaci�n a\n    desarrollar.", "La clase Container sirve para desarrollar la parte gr�fica de la interfaz y Component para\n    dise�ar la parte l�gica.", "La clase Component sirve para desarrollar la parte gr�fica de la interfaz y Container para\n    almacenar los distintos m�todos de la parte l�gica.", "2");
            /*05*/      tipo_test("�Cu�l de las siguientes afirmaciones sobre el uso de la librer�a Swing es verdadera?", "Permite crear un dise�o desde cero arrastrando los componentes hasta el panel de\n    dise�o y generando al mismo tiempo el c�digo asociado a esos componentes.", "Permite implementar el c�digo de cada uno de los componentes de la interfaz antes de\n    la creaci�n gr�fica del componente.", "No dispone de una vista de dise�o y tiene m�s limitaciones que la librer�a AWT.", "El c�digo asociado a cada componente se realiza tras la compilaci�n de la interfaz, y no\n    mientras se realiza el dise�o de estos.", "1");
            /*06*/      tipo_test("�Qu� herramienta de edici�n de interfaces es de tipo propietaria?", "MonoDevelop.", "Glade.", "NetBeans.", "Visual Studio.", "4");
            /*07*/      tipo_test("�Qu� elemento de la interfaz de Eclipse contiene paneles para crear componentes y\n        modificar sus propiedades?", "Vista de dise�o.", "Run.", "Palette.", "Toolbar.", "1");
            /*08*/      tipo_test("�Qu� paquetes se deben instalar en Eclipse para poder trabajar correctamente con la\n        librer�a Swing?", "Docker Tooling.", "General Purpose Tools.", "EclipseRT Target Platform Components.", "Todos los que empiecen por SWT y WindowBuilder.", "4");
            /*09*/      tipo_test("�A qu� IDE pertenece el componente para dise�ar llamado Palette?", "NetBeans.", "Eclipse.", "Glade.", "Visual Studio.", "2");
            /*10*/      tipo_test("�Cu�l de las siguientes herramientas de edici�n de interfaces pertenece a Unity?", "MonoDevelop.", "NetBeans.", "VisualStudio.", "Glade.", "1");                       
                    }
                    case "2" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("�Qu� es una clase en Java?", "Representa un conjunto de atributos ordenados que tienen un prop�sito.", "Representa un conjunto de objetos que comparte una mista estructura (atributos) y\n    comportamientos (m�todos).", "Representa un objeto que hereda de otra clase.", "Representa un m�todo que recibe argumentos y crea un objeto.", "2");
            /*02*/      tipo_test("�Cu�l de las siguientes afirmaciones respecto a los m�todos de Java es cierta?", "Los m�todos definen la estructura de un objeto y no pueden recibir argumentos.", "Los m�todos definen el comportamiento de un objeto y pueden recibir o no argumentos.", "Los m�todos definen el comportamiento de un objeto y deben recibir argumentos.", "Los m�todos definen la estructura de una clase y no pueden recibir argumentos.", "2");
            /*03*/      tipo_test("�Qu� es un objeto?", "Las caracter�sticas que tienen las clases.", "Los m�todos que tienen las clases.", "Una c�psula que contiene los datos y m�todos ligados a �l.", "Los m�todos que reciben argumentos.", "3");
            /*04*/      tipo_test("�Qu� caracter�stica define a un JPanel?", "Es un contenedor de componentes sobre el que se ubican elementos.", "Es la ventana invisible sobre la que se sit�a un JFrame.", "Es un tipo de capa perteneciente a los Layouts.", "Es una ventana visible sobre la que se sit�a un JFrame.", "1");
            /*05*/      tipo_test("�Qu� diferencia existe entre JFrame y JDialog?", "La ventana principal de una aplicaci�n es un JDialog y es aconsejable utilizar para\n    pantallas secundarias JFrame.", "La ventana principal de una aplicaci�n es un JFrame y es aconsejable utilizar para\n    pantallas secundarias JDialog.", "De tipo JDialog s�lo debe de haber una ventana.", "De tipo JFrame es recomendable que haya varias ventanas.", "2");
            /*06*/      tipo_test("El componente JButton:", "Es el elemento de texto m�s utilizado.", "No permite utilizar im�genes.", "Tiene la propiedad enabled que determina si est� activo o no.", "Se suele utilizar cuando existen varias opciones y son excluyentes.", "3");
            /*07*/      tipo_test("Los men�s desplegables se crean utilizando el componente:", "JComboBox.", "ButtonGroup.", "JTextField.", "JCheckBox.", "1");
            /*08*/      tipo_test("�Cu�l de los siguientes manejadores de componentes tiene las propiedades \"align\",\n        \"hgap\" y \"vgap\"?", "FlowLayout.", "BorderLayout.", "GridBagLayout.", "GridLayout.", "1");
            /*09*/      tipo_test("�Con qu� distribuci�n de elementos se crea por defecto un JFrame?", "FlowLayout.", "BorderLayout.", "GridBagLayout.", "GridLayout.", "2");
            /*10*/      tipo_test("�Qu� manejador de componentes permite un dise�o m�s flexible y preciso?", "FlowLayout.", "BorderLayout.", "GridBagLayout.", "GridLayout.", "3");
                    }
                    case "3" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Qu� significa XML?", "X-Markup Language", "eXtensible Markup Language", "Example Markup Language", "eXtra Modern Link", "2");
            /*02*/      tipo_test("�Cu�les es el objetivo del lenguaje RSS?", "Difundir informaci�n a usuarios que se han suscrito a una fuentes de contenidos\n    actualizada frecuentemente.", "Representar elementos geom�tricos vectoriales, im�genes de mapa de bits y texto.", "Marcar contenido como texto, im�genes y enlaces en forma de hiperv�nculos para crear\n    una estructura que pueda ser mostrada por los navegadores.", "Ninguno de los anteriores.", "1");
            /*03*/      tipo_test("�Cu�l de los siguientes c�digos XHTML es err�neo?", "<b><i>Texto de ejemplo</i></b>", "<p>Esto es un p�rrafo", "<img src=\"ordenador.png\" alt=\"Ordenador port�til\"/>", "<input type=\"checkbox\" name=\"vehiculo\" value=\"coche\" checked=\"checked\" />", "2");
            /*04*/      tipo_test("�Cu�l de las siguientes l�neas es correcta en XML?", "<i> Texto", "<i> Texto <i>", "<i> Texto </i>", "<I> Texto <I>", "3");
            /*05*/      tipo_test("Un atributo en XML:", "Se puede encontrar en las etiquetas de cierre.", "La sintaxis es siempre \"valor_atributo\"=nombre_atributo.", "Es un componente de las etiquetas XML que consiste en un par nombre=valor.", "Pueden existir dos con el mismo nombre en una etiqueta.", "3");
            /*06*/      tipo_test("Identifica cu�l de las siguientes opciones es la correcta en cuanto a los valores de\n        XML:", "<libro isbn=9788491713760 edicion=1 paginas=192/>", "<libro isbn=\"9788491713760\" edicion=\"1\" paginas=\"192\"/>", "<libro isbn=\"9788491713760\" edicion=1 paginas=\"192\"/>", "<libro isbn=9788491713760 edicion='1' paginas=192/>", "2");
            /*07*/      tipo_test("�Cu�l de los siguientes no es un editor compatible con XML?", "Pages.", "Notepad++.", "Dreamweaver.", "Visual Studio Code.", "1");
            /*08*/      tipo_test("�Cu�les son las principales ventajas del editor Atom?", "No es una herramienta multinivel.", "Su disposici�n de paneles es est�tica.", "No es multiplataforma.", "Ninguna es correcta.", "4");
            /*09*/      tipo_test("�Por qu� se genera c�digo XML para diferentes plataformas?", "Para almacenar contenidos.", "Para intercambiar contenidos.", "Para representar metadatos.", "Todas son correctas.", "4");
            /*10*/      tipo_test("�Cu�l de los siguientes ser�a un c�digo XML bien formado?", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <1 letra=\"u\" letra=\"a\" letra=\"d\">1</>\n        <2 letra=\"d\" letra=\"b\" letra=\"e\">2</>\n        <3 letra=\"s\" letra=\"c\" letra=\"f\">3</>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <letra=\"u\" letra=\"a\" letra=\"d\">1</>\n        <letra=\"d\" letra=\"b\" letra=\"e\">2</>\n        <letra=\"s\" letra=\"c\" letra=\"f\">3</>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <numero1 letra=\"a\" letra2=\"d\" letra3=\"o\">1</1>\n        <numero2 letra=\"b\" letra2=\"e\" letra3=\"s\">2</2>\n        <numero3 letra=\"c\" letra2=\"f\" letra3=\"i\">3</3>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <numero1 letra=\"a\" letra2=\"d\" letra3=\"o\">1</numero1>\n        <numero2 letra=\"b\" letra2=\"e\" letra3=\"s\">2</numero2>\n        <numero3 letra=\"c\" letra2=\"f\" letra3=\"i\">3</numero3>\n    </numeros>", "4");
                    }
                    case "4" -> {
                        _Main_.Principal.setTema(menu);                      
                        
            /*01*/      tipo_test("�Qu� ventaja supone la reutilizaci�n de componentes?", "Reducci�n de los costes del proyecto.", "Simplificaci�n de pruebas de software.", "Mejora de la calidad del software.", "Todas las anteriores son ciertas.", "4");
            /*02*/      tipo_test("�Qu� caracter�sticas deben tener en cuenta a la hora de crear un componente?", "La implementaci�n puede estar realizada con cualquier lenguaje de programaci�n, pero\n    ha de estar completa.", "Constituye un m�dulo no reutilizable, sin compilar.", "Su distribuci�n se realiza en varios paquetes ejecutables.", "Debe ser un elemento que no aporte funcionalidad a la interfaz.", "1");
            /*03*/      tipo_test("�Cu�l de las siguientes afirmaciones referida a las propiedades de los componentes es\n        falsa?", "Las propiedades indexadas son aquellas que representan un conjunto de valores en\n    forma de array.", "Las propiedades simples son aquellas que representan solo un valor.", "Los m�todos clave que permiten analizar el contenido de una propiedad o atributo son\n    los de tipo set, mientras que para modificar su valor se utilizan los m�todos get.", "Los m�todos clave que permiten analizar el contenido de una propiedad o atributo son\n    los de tipo get, mientras que para modificar su valor se utilizan los m�todos set.", "3");
            /*04*/      tipo_test("Para el desarrollo de interfaces a trav�s del lenguaje Java, existen componentes que\n        permiten su reutilizaci�n llamados:", "JavaBear.", "JavaTwin.", "JavaBeans.", "JavaPop.", "3");
            /*05*/      tipo_test("�Cu�l de las siguientes no es una caracter�stica com�n de los componentes\n        desarrollados como JavaBean?", "Parametrizaci�n.", "Persistencia.", "Customizaci�n.", "Eventos.", "1");
            /*06*/      tipo_test("Para definir el nuevo comportamiento de un componente e implementar nuevos\n        m�todos se usar� la palabra reservada ...", "@Superextend.", "@Superride.", "@Override.", "@Overextend.", "3");
            /*07*/      tipo_test("�Qu� m�todo devuelve un valor utilizando return?", "set.", "get.", "Ambos.", "Ninguno.", "2");
            /*08*/      tipo_test("Al implementar un nuevo componente:", "Habr� que crear solo las propiedades nuevas, pero no habr� que implementar las que ya\n     posee el componente base.", "Solo podr� contener las propiedades del componente base del que hereda.", "No tendr� ninguna propiedad del componente base del que hereda, siendo todas\n    distintas.", "Ninguna es correcta.", "1");
            /*09*/      tipo_test("�Cu�l de las siguientes herramientas tiene la opci�n de aplicar capas permitiendo\n        aplicar a las im�genes multitud de efectos y tratamientos?", "GIMP.", "Paint.", "Pinta.", "Pinta 3D.", "1");
            /*10*/      tipo_test("La clase Graphics de Java permite dibujar como si de un lienzo se tratase sobre una\n        interfaz. Esta clase pertenece a la librer�a", "JButton.", "SWING.", "AWT.", "JCanvas.", "3");
                    }
                    case "5" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Cu�l de las siguientes no es una caracter�stica de las pruebas unitarias?", "R�pida ejecuci�n.", "Independencia respecto a otros tests.", "Un �nico uso.", "Cada test debe poder comprobar si es v�lido por si mismo.", "3");
            /*02*/      tipo_test("�Qu� m�todos se utilizan en las pruebas de tipo JUnit de Eclipse?", "assert.", "get.", "set.", "build.", "1");
            /*03*/      tipo_test("�Cu�l de los siguientes tipos de eventos son los producidos por el usuario,\n        habitualmente a trav�s del teclado o del puntero del rat�n?", "Eventos internos.", "Eventos propios.", "Eventos externos.", "Eventos impropios.", "3");
            /*04*/      tipo_test("�Cu�l de los siguientes eventos est� relacionado con el cambio de un componente, de\n        tama�o, posici�n ...?", "EventObject.", "MouseEvent.", "ComponentEvent.", "ContainerEvent.", "3");
            /*05*/      tipo_test("�Cu�l de los siguientes eventos es el asociado al componente JScrollBar?", "AdjustmentEvent.", "TextEvent.", "ActionEvent.", "ItemEvent.", "1");
            /*06*/      tipo_test("�Qu� acci�n dispara el evento keyReleased?", "Se produce al pulsar una tecla.", "Se produce al pulsar y soltar una tecla.", "Se produce al soltar una tecla.", "Se produce al pulsar dos teclas.", "3");
            /*07*/      tipo_test("�Qu� m�todo no se podr� utilizar con el escuchador KeyListener?", "keyPressed.", "keyGained.", "keyTyped.", "keyRelease.", "2");
            /*08*/      tipo_test("�Qu� evento debe utilizarse con un JSpinner para detectar su cambio de estado?", "stateChanged.", "itemStateChanged.", "actionPerformed.", "actionMove.", "1");
            /*09*/      tipo_test("�Qu� evento debe utilizarse con un JComboBox para detectar la selecci�n realizada en\n        �l?", "itemStateChanged.", "stateChanged.", "itemFocus.", "stateFocus.", "1");
            /*10*/      tipo_test("Cuando se activa y vincula un escuchador o listener a un componente:", "Los componentes no realizan un filtrado previo de los eventos para determinar si los\n    manejan o no.", "Los componentes realizan un filtrado previo de los eventos para determinar si los\n    manejan o no.", "No ser� necesaria la asociaci�n de la acci�n al evento para manejar el evento.", "Es una acci�n que se realiza de manera autom�tica.", "1");
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Cu�l de los siguientes conceptos hace referencia a la facilidad o dificultad de uso de\n        un sitio web?", "Accesibilidad.", "Practicidad.", "Usabilidad.", "Utilidad.", "3");
            /*02*/      tipo_test("�Cu�l de las siguientes no es una caracter�stica deseable en una interfaz?", "Alta tasa de error.", "Facilidad de aprendizaje.", "Eficiencia de uso.", "Alta satisfacci�n.", "1");
            /*03*/      tipo_test("�Cu�l de los siguientes principios de dise�o de un sistema interactivo no es\n        recomendable?", "Facilitar buenos mensajes de error.", "Conocer al usuario.", "Maximizar la memorizaci�n.", "Optimizar las operaciones mediante la r�pida ejecuci�n de operaciones comunes.", "3");
            /*04*/      tipo_test("La disciplina que estudia el intercambio de informaci�n entre las personas y los\n        ordenadores, cuyo objetivo es que el intercambio y acceso a la informaci�n sea lo m�s\n        eficiente posible es:", "La accesibilidad computacional.", "La comunicaci�n humana.", "La interacci�n persona ordenador.", "La actividad inform�tica.", "3");
            /*05*/      tipo_test("�Cu�l es la funci�n de la Organizaci�n Internacional de la Normalizaci�n, ISO?", "Crear normas y est�ndares cuyo objetivo principal es conseguir asegurar que servicios y\n    productos presenten ciertos niveles de calidad, eficiencia y seguridad.", "Definir la usabilidad como la capacidad de un producto para ser entendido, aprendido,\n    usado y resultar atractivo para el usuario.", "Tener normas y est�ndares en materia relativa a la consecuci�n de buenos par�metros\n    de usabilidad con respecto al dise�o y desarrollo de interfaces que favorecen la\n    interacci�n entre la aplicaci�n y el usuario.", "Todas las anteriores son correctas.", "4");
            /*06*/      tipo_test("�Cu�l es la gu�a de usabilidad donde se recogen los beneficios relativos a las medidas\n        de usabilidad evaluadas?", "ISO/IEC  9126-1.", "ISO/IEC 14915.", "ISO/IEC 9241.", "IEC TR 61997.", "3");
            /*07*/      tipo_test("�Cu�les son las principales medidas de usabilidad de las aplicaciones?", "Satisfacci�n.", "Efectividad.", "Eficiencia.", "Todas las anteriores.", "4");
            /*08*/      tipo_test("�Qu� es la evaluaci�n heur�stica?", "Es una prueba realizada por expertos.", "Es lo contrario al m�todo de inspecci�n.", "Es una �nica evaluaci�n de alto nivel.", "Es una prueba realizada por usuarios.", "1");
            /*09*/      tipo_test("�Qu� criterio no se deber�a tener en cuenta a la hora de dise�ar pruebas de usabilidad\n        con usuarios?", "Pruebas gen�ricas.", "Pruebas razonables.", "Pruebas factibles.", "Tiempo de realizaci�n razonable.", "1");
            /*10*/      tipo_test("�Cu�l de los siguientes no es un tipo de test de usabilidad?", "Test de uso pautado.", "Test de uso descontextualizado.", "Test de uso natural.", "Test de uso artificial.", "4");
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Cu�l de las siguientes pautas de dise�o de la estructura de la interfaz de usuario se\n        debe evitar?", "Punto focal.", "Consistencia de ventanas.", "Incoherencia entre elementos.", "Legibilidad y flujo entre elementos.", "3");
            /*02*/      tipo_test("�Qu� se debe perseguir a la hora de dise�ar un men�?", "Utilizar los men�s en cascada siempre que sea posible.", "Situarlo en la parte m�s baja de la interfaz de la aplicaci�n.", "La correcta navegaci�n dentro de una aplicaci�n mostrando todas las condiciones\n    posibles y permitiendo al usuario seleccionar las diferentes acciones mostradas.", "Mantenerlo ocultado la mayor parte del tiempo posible.", "3");
            /*03*/      tipo_test("�En cu�l de los siguientes casos se est� realizando una mala selecci�n de dise�o\n        de ventanas?", "Las ventanas pueden ser cerradas en todo momento por el usuario.", "La modificaci�n del tama�o puede realizarla el propio usuario.", "Las ventanas se despliegan constantemente y no se pueden cerrar.", "El usuario controlar las ventanas abri�ndolas cuando desee.", "3");
            /*04*/      tipo_test("Selecciona cu�l de los siguientes textos es el m�s �ptimo para un cuadro de di�logo:", "Error 404.", "Impresora no encontrada.", "Ha cometido un error irreparable. Apague el ordenador y vuelva a encenderlo.", "La impresora seleccionada no ha podido encontrarse. �Desea probar con otro\n    dispositivo? SI NO", "4");
            /*05*/      tipo_test("A la hora de dise�ar un icono para guardar un documento en una interfaz de un\n        procesador de texto, �Cu�l ser�a la mejor opci�n?", "Icono de un sello postal.", "Icono de un cerebro.", "Icono de un disquete.", "Icono de un casette.", "3");
            /*06*/      tipo_test("En una interfaz de usuario para una aplicaci�n m�dica se desea transmitir mediante\n        su est�tica un mensaje de tranquilidad mientras el usuario responde a una serie de\n        preguntas sobre su perfil. �Cu�les de los siguientes colores crees que puede ser el m�s\n        adecuado utilizar en la interfaz?", "Rojo.", "Amarillo.", "Negro.", "Azul.", "4");
            /*07*/      tipo_test("Respecto a las fuentes utilizadas para los textos de las interfaces:", "Siempre que sea posible se utilizar� color de fuente claro sobre fondo claro.", "Siempre que sea posible se utilizar� color de fuente oscuro sobre fondo oscuro.", "Siempre que sea posible se utilizar� color de fuente oscuro sobre fondo claro.", "Siempre que sea posible se utilizar� color de fuente claro sobre fondo oscuro.", "3");
            /*08*/      tipo_test("Indica cu�l de las siguientes pautas no debe seguirse respecto al dise�o de los\n        elementos interactivos como botones, checkbox y radiobutton:", "Los t�tulos deben ser intuitivos.", "Las acciones codificadas en cada opci�n deben quedar suficientemente comprensibles\n    para el usuario.", "Las opciones deben ser f�cilmente distinguibles unas de otras y por tanto, relativamente\n    r�pidas de escoger y seleccionar.", "El usuario debe investigar sobre la funci�n de cada una de las opciones.", "4");
            /*09*/      tipo_test("Respeto a la presentaci�n de datos en interfaces utilizando gr�ficos, �cu�l de las\n        siguientes pautas no es recomendable seguir?", "El tama�o debe adecuarse a las dimensiones de la pantalla.", "No se debe abusar del n�mero de gr�ficos.", "Es aconsejable utilizar pocos pero que aportan un valor a�adido a la aplicaci�n.", "El dise�o debe ser de tal manera que muestre la informaci�n lo m�s redundante posible\n    utilizando m�ltiples tipos de gr�ficos para una misma informaci�n.", "4");
            /*10*/      tipo_test("�Cu�l debe ser la primera pauta de dise�o de la secuencia de control\n        de las aplicaciones?", "Dise�ar y establecer de forma clara el objetivo principal asociado a cada uno\n    de los elementos de la interfaz.", "Establecer la consecuci�n de cada objetivo con una secuencia de control v�lida.", "Mostrar y documentar para el usuario la secuencia establecida para que pueda\n    implementarla sin problemas.", "En la medida de lo posible utilizar la regla de los tres click, lo que implica que para llegar\n    a cualquier objetivo sean necesarios como m�ximo este n�mero de selecciones.", "1");                       
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Cu�l de las siguientes afirmaciones es falsa en cuanto a la confecci�n de informes\n        para aplicaciones?", "Existen dos tipos de informes atendiendo a la forma en la que estos quedan vinculados\n    con la aplicaci�n: incrustados y no incrustado.", "Un informe es un documento que recopila y muestra diferente tipo de informaci�n\n    procedente de fuentes de datos a los usuarios, en funci�n de las consultas realizadas.", "La creaci�n de los informes es est�tica.", "Es posible seleccionar entre m�ltiples elementos y distribuciones de dise�o.", "3");
            /*02*/      tipo_test("�Cu�l de las siguientes no es una herramienta gr�fica para la creaci�n de informes?", "iReport.", "JasperReport.", "XCode.", "Eclipse Birt.", "3");
            /*03*/      tipo_test("�Cu�l de las siguientes herramientas modela la encapsulaci�n relativa a la generaci�n\n        de informes?", "Eclipse Pro.", "XCode.", "JasperReport.", "iReport.", "3");
            /*04*/      tipo_test("�Qu� herramienta de c�digo abierto permite la creaci�n de informes de forma\n        din�mica para entornos de inteligencia empresarial?", "JasperReport.", "Eclipse Pro.", "Eclipse Birt.", "iReport.", "3");
            /*05*/      tipo_test("�Qu� herramienta de inteligencia empresarial se utiliza para crear informes de forma\n        din�mica sobre todo en el entorno de desarrollo de Microsoft Visual Studio?", "iReport.", "Eclipse Pro.", "Eclipse Birt.", "Crystal Reports.", "4");
            /*06*/      tipo_test("�Qu� afirmaci�n es correcta en cuanto a las variables de usuario y variables\n    predefinidas?", "Las variables predefinidas suelen corresponder con el nombre de los campos del origen\n    de datos vinculado al informe.", "Las variables de usuario no pueden corresponder con el nombre de los campos del\n    origen de datos vinculado al informe.", "Las variables predefinidas aparecen por defecto en la herramienta, por lo que siempre\n    van a estar presentes y modelan elementos habituales en la generaci�n de cualquier\n    informe.", "Las variables de usuario aparecen por defecto en la herramienta, por lo que siempre van\n    a estar presentes y modelan elementos habituales en la generaci�n de cualquier informe.", "3");
            /*07*/      tipo_test("�Qu� tipo de operaciones se utilizan sobre los valores contenidos en una columna?", "Recuentos y totales.", "Selecciones.", "Anulaciones.", "Ninguna de las anteriores.", "1");
            /*08*/      tipo_test("�Qu� variable devuelve el n�mero de registros mostrados en cada p�gina?", "PAGE_NUMBER.", "COLUMN_NUMBER.", "REPORT_COUNT.", "PAGE_COUNT.", "4");
            /*09*/      tipo_test("�Qu� variable devuelve el n�mero de columnas del informe?", "PAGE_NUMBER.", "COLUMN_NUMBER.", "REPORT_COUNT.", "PAGE_COUNT.", "2");
            /*10*/      tipo_test("�Qu� tipo de objeto java devuelve la operaci�n SUM?", "java.lang.Number.", "java.lang.Double.", "java.lang.Boolean.", "java.lang.Integer.", "1");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Para la configuraci�n de los par�metros de la base de datos en MySQL en primer lugar\n        se debe seleccionar el JDBC Driver:", "com.myddbb.jdbc.Driver.", "com.mysql.jdbc.Disc.", "com.myjdbc.bbdd.Disc.", "com.mysql.jdbc.Driver.", "4");
            /*02*/      tipo_test("En el �ltimo paso de la configuraci�n del Driver Classpath se seleccionar� el fichero:", ".xml", ".zip", ".jar", ".dmg", "3");
            /*03*/      tipo_test("Para la construcci�n de una instrucci�n de filtrado es imprescindible el uso de la\n        palabra:", "WHERE.", "WHEN.", "WHY.", "WHAT.", "1");
            /*04*/      tipo_test("Tras la creaci�n de informe y la conexi�n de este con las tablas contenedoras de los\n        datos, ser� posible utilizar estos campos para:", "Su importaci�n en un informe.", "Su exportaci�n en un informe.", "Su exportaci�n en una base de datos.", "Su importaci�n en una base de datos.", "1");
            /*05*/      tipo_test("Para el dise�o de un informe se debe diferenciar en los textos a est�ticos (Static Text)\n        y los campos de texto (Text Field). Los que se utilizan como si fueran etiquetas y son\n        las habituales para la creaci�n de los t�tulos son:", "Text Field.", "Note.", "Break.", "Static Text.", "4");
            /*06*/      tipo_test("Adem�s de la creaci�n de informes relativos al desarrollo de aplicaciones, para\n        mejorar la legibilidad de la informaci�n y garantizar un estructura m�s �ptima,\n        podemos realizar tambi�n:", "Subinformes.", "Apartados.", "�ndices.", "Bases de datos.", "1");
            /*07*/      tipo_test("La principal diferencia entre los informes y los subinformes son:", " Los subinformes pueden contener m�s subinformes, no tienen ni encabezados ni pie de\n    p�gina y no tienen existencia por s� solos.", "Los informes pueden contener m�s subinformes, no tienen ni encabezados ni pie de\n    p�gina y no tienen existencia por s� solos.", "Los informes no pueden contener m�s subinformes, tienen ni encabezados y pie de\n    p�gina y no tienen existencia por s� solos.", "Los subinformes no pueden contener m�s subinformes, no tienen ni encabezados ni pie\n    de p�gina y no tienen existencia por s� solos.", "4");
            /*08*/      tipo_test("Para incluir un subinforme se coloca en el visor de dise�o desde la paleta de\n        elementos el elemento:", "Generic.", "Frame.", "Subreport.", "Barcode.", "3");
            /*09*/      tipo_test("Para personalizar la cadena de texto con la que ser�n incluidos los datos en un\n        informe se utilizar�:", "El editor de expresiones.", "El editor de variables.", "El emulador de sintaxis.", "El gestor de c�digo.", "1");
            /*10*/      tipo_test("El par�metro que permite mostrar el nombre de la conexi�n es:", "REPORT_CONTEXT.", "REPORT_PARAMETERS_MAP.", "REPORT_CONNECTION.", "REPORT_LOCALE.", "3");                       
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La parte del fichero de ayuda que se muestra al usuario, habitualmente en forma de\n    �ndice, glosario, tabla de contenido e incluso buscador de temas es:", "La gu�a de inicio.", "El mapa de navegaci�n.", "El mapa de fichero.", "La vista de informaci�n.", "4");
            /*02*/      tipo_test("Este tipo de formato de fichero de ayuda actualmente se encuentra en desuso:", "HPJ.", "CHM.", "HLP.", "IPF.", "3");
            /*03*/      tipo_test("Este tipo de formato de fichero de ayuda inclu�a ciertas mejoras sobre HLP:", "CHM.", "HPJ.", "IPF.", "JavaHelp.", "1");
            /*04*/      tipo_test("Este tipo de formato de fichero de ayuda utiliza para la representaci�n de gr�ficos\n        ficheros de tipo .shg:", "HPJ.", "CHM.", "IPF.", "JavaHelp.", "1");
            /*05*/      tipo_test("La herramienta Shalom Help Maker:", "Permite la creaci�n de ficheros de ayuda para Windows y tras su descarga es necesario\n    ejecutar el software htmlhelp.exe para instalarla.", "Toda la informaci�n queda contenida en un �nico fichero por lo que es posible exportar\n    toda la ayuda en un solo documento PDF.", "Es una herramienta de pago.", "Permite creaci�n de �ndices, contenidos enlazados a otras p�ginas, links externos,\n    as� como la creaci�n de im�genes que enriquecen el contenido del documento final.", "4");
            /*06*/      tipo_test("Indica cu�l de las siguientes afirmaciones es falsa respecto a las tablas de contenidos:", "Las tablas de contenido se sit�an al final de cualquier documento,\n    como si de un �ndice de libro se tratara.", "Pueden mostrar el n�mero de p�gina o no, en funci�n del dise�o.", "Casi siempre incluye un enlace directo en cada uno de los t�tulos o subt�tulos\n    por los que aparece compuesta.", "No debe duplicarse la informaci�n.", "1");
            /*07*/      tipo_test("La documentaci�n t�cnica:", "Sirve para documentar las pruebas realizadas sobre un programa determinado.", "Se trata de los informes resultantes de aplicar las pruebas sobre los programas.", "Es la documentaci�n en la que especifican los escenarios de prueba\n    y se detallan los procedimientos de las mismas.", "Son las gu�as, hojas de especificaciones, manuales, etc.", "4");
            /*08*/      tipo_test("�Qu� tipo de manual o gu�a contiene la informaci�n necesaria para poner en uso\n        una aplicaci�n?", "El manual de usuario.", "El manual de explotaci�n.", "La gu�a r�pida.", "La gu�a de referencia.", "2");
            /*09*/      tipo_test("JavaHelp requiere del uso de diferentes ficheros y de diferentes tipos de estos para el\n        dise�o de cada una de las partes que forman la ayuda final, como el fichero Helpset que:", "Incluye la distribuci�n del sistema de ayuda.", "Asocia elementos del fichero HTML con un identificador.", "Contiene la informaci�n necesaria para que el sistema de ayuda se ejecute.", "Contiene la informaci�n de ayuda como tal, debi�ndose realizar uno por cada tema.", "3");
            /*10*/      tipo_test("La clase HelpBroker permite visualizar el contenido de la ayuda desde la aplicaci�n,\n        �Cu�l de los siguientes no es uno de sus principales m�todos?", "enableHelpKey.", "enableHelpOnButton.", "enableHelp.", "findHelpSet.", "4");                        
                    }
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Los sistemas de gesti�n de paquetes permiten automatizar los procesos relativos a:", "La instalaci�n de paquetes software", "La configuraci�n de paquetes software.", "El borrado de los paquetes software.", "Todas las anteriores son correctas.", "4");
            /*02*/      tipo_test("�Cu�l de los siguientes tipos de paquetes pueden ser instalados directamente sin\n        necesidad de ser extra�dos previamente?", "RPM.", "TGZ.", "deb.", "TAR.", "3");
            /*03*/      tipo_test("�Qu� diferencia existen entre los formatos para la creaci�n de paquetes TAR y TGZ?", "TAR es un formato utilizado para la creaci�n de paquetes sin compresi�n.", "TGZ es un formato utilizado para la creaci�n de paquetes sin compresi�n.", "TAR es un formato utilizado para la creaci�n de paquetes con compresi�n a trav�s de\n    gunzip.", "TGZ es un formato utilizado para la creaci�n de paquetes con compresi�n a trav�s de\n    Redhat Package Manager.", "1");
            /*04*/      tipo_test("�Qu� paquetes podemos encontrar para el empaquetado de aplicaciones\n        en Windows?", "MSI y AppX.", "MSI y DEB.", "DEB y AppX.", "TGZ y TAR.", "1");
            /*05*/      tipo_test("�Qu� tipo de empaquetado suele realizarse de las aplicaciones en Java?", ".net", ".java", ".bean", ".jar", "4");
            /*06*/      tipo_test("�Cu�l de los siguientes es un instalador muy utilizado?", "InstallBuilder.", "Windows Installer.", "MSI Studio.", "Todas son correctas.", "4");
            /*07*/      tipo_test("Este instalador de Windows permite realizar la instalaci�n de forma predefinida:", "AppX.", "DEB.", "EXE.", "MSI.", "4");
            /*08*/      tipo_test("Para la distribuci�n de aplicaciones software puede realizarse desde un servidor web.\n        Una de las herramientas que permite la descarga e instalaci�n de paquetes alojados\n        en un servidor web es:", "AptWeb.", "AptUrl.", "WebDeb.", "UrlExe.", "2");
            /*09*/      tipo_test("�Qu� herramienta podemos utilizar para crear un tipo EXE a trav�s de un paquete JAR?", "EnableSplash.", "AptUrl.", "Launch4j.", "Dpkg.", "3");
            /*10*/      tipo_test("�Cu�l de los siguientes organismos emite certificados de firma digital?", "FNMT.", "TNN.", "TNT.", "FETA.", "1");                        
                    }
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Las pruebas de caja blanca:", "Se basan en la evaluaci�n del c�digo interno del software, un buen dise�o para estas\n    pruebas implica la evaluaci�n de todos los posibles caminos que se han implementado\n    en el dise�o de un programa.", "Eval�a la aplicaci�n desde un punto de vista externo, es decir, sin preocuparnos del\n    'interior', son las habituales para la prueba de interfaces.", "No permiten validar el funcionamiento del software en base a las especificaciones de dise�o.", "Ninguna es correcta.", "1");
            /*02*/      tipo_test("�Cu�l de los siguientes tipos de pruebas de software no es habitual?", "Pruebas unitarias.", "Pruebas de integraci�n.", "Pruebas de inmersi�n.", "Pruebas de seguridad.", "3");
            /*03*/      tipo_test("�Qu� prueba se centra sobre todo en la evaluaci�n de los sistemas de protecci�n y\n        autenticaci�n de una aplicaci�n?", "Pruebas de seguridad.", "Pruebas de integraci�n.", "Pruebas de volumen y carga.", "Pruebas unitarias.", "1");
            /*04*/      tipo_test("La depuraci�n de c�digo sirve para:", "La revisi�n del c�digo para la detecci�n de posibles errores y la correcci�n de los mismos.", "Crear errores de sintaxis.", "Producir fallos de dise�o.", "Interpretar las instrucciones correctas.", "1");
            /*05*/      tipo_test("Las pruebas de integraci�n ascendente:", "Suele tener una integraci�n primero en profundidad y otra integraci�n primero en anchura.", "Se realiza desde el m�dulo principal hasta los subordinados.", "Comienzan con la evaluaci�n de los niveles m�s altos.", "Comienzan con la evaluaci�n de los niveles m�s bajos.", "4");
            /*06*/      tipo_test("Las pruebas de regresi�n:", "Son los errores producidos cuando al realizar la integraci�n de las diferentes partes de un\n    programa se producen errores que de forma individual no ocurr�an.", "S�lo se producen cuando la introducci�n de cambios muestra errores que nada tiene que\n    ver con las modificaciones realizadas.", "S�lo localizan errores que se han producido por la introducci�n de cambios.", "Es la nueva ejecuci�n de un conjunto de pruebas que ya hab�a sido ejecutado con\n    anterioridad.", "4");
            /*07*/      tipo_test("Las pruebas de capacidad:", "Se utilizan para la evaluaci�n de la capacidad de procesamiento del software ante la\n    llegada de una cantidad grande de datos.", "Se utilizan para la evaluaci�n de la capacidad de recuperaci�n del software ante una\n    sobrecarga de datos.", "Se utilizan para la evaluaci�n del tiempo de respuesta y la velocidad de procesamiento\n    del software.", "Se utilizan para la evaluaci�n del software y su comportamiento ante un aumento de\n    peticiones, es decir, ante un incremento de la carga de trabajo.", "4");
            /*08*/      tipo_test("Las pruebas de rendimiento:", "Se utilizan para la evaluaci�n de la capacidad de procesamiento del software ante la\n    llegada de una cantidad grande de datos.", "Se utilizan para la evaluaci�n de la capacidad de recuperaci�n del software ante una\n    sobrecarga de datos.", "Se utilizan para la evaluaci�n del tiempo de respuesta y la velocidad de procesamiento\n    del software.", "Se utilizan para la evaluaci�n del software y su comportamiento ante un aumento de\n    peticiones, es decir, ante un incremento de la carga de trabajo.", "3");
            /*09*/      tipo_test("Los test de usuario se basan en pruebas que observan la forma de interacci�n de los\n        usuarios con el producto objeto del test seg�n el:", "Dise�o Directo en la Herramienta (DDH).", "Dise�o Centrado en la Yuxtaposici�n (DCU).", "Dise�o Centrado en el Usuario (DCU).", "Dise�o Centrado en el Experto (DCE).", "3");
            /*10*/      tipo_test("La versi�n alfa de un producto:", "Consiste en la primera versi�n de la aplicaci�n.", "Consiste en la �ltima versi�n de la aplicaci�n.", "Consiste en la versi�n casi definitiva de la aplicaci�n.", "Se testea por los usuarios de tipo beta tester.", "1");                        
                    }
                    case "13" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Por defecto, cuando se accede por primera vez a un proyecto creado con Android\n        Studio, el fichero que se muestra al desarrollador es el llamado:", "InitProyect.kt.", "InitActivity.kt.", "MainProyect.kt.", "MainActivity.kt.", "4");
            /*02*/      tipo_test("�Desde que fichero ser� necesario acceder para que est� disponible la pantalla de\n        dise�o y el c�digo asociado a la creaci�n de cada nuevo componente?", "Main_activity.xml.", "Activity_proyect.xml.", "Activity_main.xml.", "Content_main.xml.", "3");
            /*03*/      tipo_test("�Cu�l de las siguientes no corresponde con una de las posibles formas de visualizar el\n        entorno de desarrollo Android Studio?", "Zoom.", "Code.", "Design.", "Split.", "1");
            /*04*/      tipo_test("�Con qu� forma de visualizaci�n del entorno Android Studio se obtiene la divisi�n de\n        la zona de interacci�n en explorador, zona de desarrollo y zona de dise�o?", "Zoom.", "Code.", "Design.", "Split.", "4");
            /*05*/      tipo_test("En el desarrollo de interfaces Android el elemento layout permite definir la\n        caracter�stica:", "Posici�n de los elementos.", "Dimensi�n de los elementos.", "Distribuci�n de los elementos.", "Todas son correctas.", "4");
            /*06*/      tipo_test("�Qu� grupo de elementos son de tipo bot�n o con un comportamiento similar\n        (checkbox, togglebutton, radiobutton, ...)?", "Common.", "Containers.", "Layouts.", "Buttons.", "4");
            /*07*/      tipo_test("�Qu� elementos extras permiten personalizar la interfaz de desarrollo\n        (calendarios, barras de progreso ...)?", "Common.", "Containers.", "Layouts.", "Widgets.", "4");
            /*08*/      tipo_test("�Qu� elemento es utilizado para modelar los men�s desplegables en una aplicaci�n Android?", "ToggleButton.", "Spinner.", "Checkbox.", "TextField.", "2");
            /*09*/      tipo_test("�Cu�l de los siguientes elementos permite a�adir un conmutador entre estados en el\n        desarrollo de una aplicaci�n?", "CheckBox.", "Spinner.", "ToggleButton.", "Ninguno de los anteriores.", "3");
            /*10*/      tipo_test("�Cu�l de los siguientes elementos determina el valor de la altura del elemento o\n        componente insertado en la interfaz de la aplicaci�n?", "layout_width.", "layout_height", "layout_margin.", "layout_gravity.", "2");                        
                    }
                    case "14" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("En la implementaci�n para la detecci�n de eventos, en primer lugar, es necesario\n        implementar el m�todo:", "setOnClickListener.", "ClickListener.", "onClick.", "setOnActivity.", "1");
            /*02*/      tipo_test("Si el evento que se desea tratar es relativo a hacer click sobre un elemento,\n        necesitaremos utilizar el escuchador:", "OnTouch.", "OnClickTouch.", "OnClickButton.", "OnClickListener.", "4");
            /*03*/      tipo_test("El m�todo que se invoca cuando se pulsa sobre un bot�n f�sico y el foco est� situado\n        sobre un elemento que implementa este m�todo en su escucha es:", "onKey.", "onTouch.", "onLongClick.", "onClick.", "1");
            /*04*/      tipo_test("El m�todo que se debe invocar cuando se mantiene pulsado un elemento de la\n        interfaz es:", "onKey.", "onTouch.", "onLongClick.", "onClick.", "3");
            /*05*/      tipo_test("El evento asociado a los elementos 'extra' que permiten personalizar la interfaz de\n        desarrollo (calendarios, barras de progreso, ...) es:", "onKeyListener.", "onClickListener.", "onTouchListener.", "onLongClickListener.", "3");
            /*06*/      tipo_test("A trav�s de este componente es posible implementar cualquier tipo de dise�o de\n        navegaci�n por una aplicaci�n, aportando un alto grado de personalizaci�n al dise�o\n        de la interfaz:", "Graphics.", "Navigation.", "Illustrate.", "Entertain.", "2");
            /*07*/      tipo_test("Se trata de un contenedor vac�o utilizado para colocar los destinos hacia los que\n        apunta el gr�fico de navegaci�n. Este elemento permite que los destinos vayan\n        modific�ndose seg�n el usuario navegada a trav�s de la aplicaci�n:", "Gr�fico de navegaci�n.", "Nav_version.", "NavController.", "NavHost.", "4");
            /*08*/      tipo_test("�De qu� tipo es el elemento que representa cada una de las pantallas colocadas en el\n        editor?", "enterAnim.", "Fragment.", "Action.", "Destination.", "2");
            /*09*/      tipo_test("�Cu�l de los siguientes valores para el atributo showAsAction permite indicar que si\n        hay sitio en la barra de la aplicaci�n se coloca el icono del bot�n y si no lo hay se\n        ubica en el men� ampliado (los 3 puntos verticales)?", "never.", "little.", "asAction.", "ifRoom.", "4");
            /*10*/      tipo_test("�Qu� tipo de animaci�n est� asociada a la entrada en una pantalla a trav�s de una\n        acci�n emergente?", "enterAnim.", "popEnterAnim.", "exitAnim.", "popExistAnim.", "2");                       
                    }
                    case "15" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Indica cu�l es el sistema operativo de los dispositivos m�viles de Apple:", "iOS.", "Android.", "Mac OS.", "Firefox OS.", "1");
            /*02*/      tipo_test("La herramienta que se utiliza para el desarrollo en el sistema operativo de dispositivos\n        m�viles de Apple es:", "iApp.", "iCODE.", "Xmode.", "Xcode.", "4");
            /*03*/      tipo_test("El lenguaje de programaci�n utilizado para el desarrollo de las aplicaciones en iOS es:", "Swift.", "Java.", "Kotlin.", "JavaScript.", "1");
            /*04*/      tipo_test("En la aplicaci�n Xcode crear un 'playground' permite:", "Abrir un proyecto anterior.", "Implementar aplicaciones.", "Implementar ciertos bloques de c�digo.", "Crear un nuevo proyecto.", "3");
            /*05*/      tipo_test("Indica cu�l de los siguientes sistemas operativos no se puede utilizar en la aplicaci�n\n        Xcode:", "iOS.", "watchOS.", "iTV.", "macOS.", "3");
            /*06*/      tipo_test("�Cu�l es la nueva interfaz de usuario utilizada para iOS?", "Storyboard.", "SwiftUI.", "Objective-C.", "Swift.", "2");
            /*07*/      tipo_test("La funci�n Navigator es una de las m�s importantes de la aplicaci�n Xcode y se\n        encuentra situada en la:", "Zona inferior.", "Zona derecha.", "Zona de desarrollo.", "Zona izquierda.", "4");
            /*08*/      tipo_test("El c�digo que ser� necesario implementar para importar la librer�a SwiftUI es:", "import Swift.", "import SwiftUI.", "import UI.", "import View.", "2");
            /*09*/      tipo_test("Para crear variables en el lenguaje Swift se utiliza:", "v.", "save.", "new.", "var.", "4");
            /*10*/      tipo_test("Para comentar el C�digo se pueden utilizar delimitadores para l�neas o fragmento\n        de c�digo del tipo:", "// comentario", "/* comentario */ ", "*/ comentario /*", "//* comentario *//", "2");                        
                    }
                    case "40" -> DesarrolloInterfaces.Test_Rep_I_Des_Int.test_Repaso();
                    case "50" -> DesarrolloInterfaces.Test_Rep_II_Des_Int.test_Repaso();
                    
                    case "0" -> {}
                    default -> miDefault();
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));
    }    
}