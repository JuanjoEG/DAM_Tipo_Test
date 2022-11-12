package DesarrolloInterfaces;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Test_DesarrolloInterfaces {
    
    public static void main(String[] args) {
        
                String menu="";
        do {
            Principal.setFallos(0);
            Principal.setAciertos(0);
            Principal.setContador(0);
            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ************************************************************************
        *  TEST DESARROLLO DE INTERFACES                                       *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: INTRODUCCI�N A LA CONFECCI�N DE INTERFACES                 *
        *  2. TEMA: CLASES Y COMPONENTES                                       *
        *  3. TEMA: GENERACI�N DE INTERFACES A PARTIR DE DOCUMENTOS XML        *
        *  4. TEMA: CREACI�N DE COMPONENTES                                    *
        *  5. TEMA: EXPLOTACI�N DE COMPONENTES VISUALES                        *
        *  6. TEMA: USABILIDAD I: CONCEPTO Y NORMATIVA                         *
        *  7. TEMA: USABILIDAD II: PAUTAS DE DISE�O                            *
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
        *  0. ATR�S.                                                           *
        ************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {                        
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("�Qu� significa XML?", "X-Markup Language", "eXtensible Markup Language", "Example Markup Language", "eXtra Modern Link", "2");
            /*02*/      tipo_test("�Cu�les es el objetivo del lenguaje RSS?", "Difundir informaci�n a usuarios que se han suscrito a una fuentes de contenidos\n    actualizada frecuentemente.", "Representar elementos geom�tricos vectoriales, im�genes de mapa de bits y texto.", "Marcar contenido como texto, im�genes y enlaces en forma de hiperv�nculos para crear\n    una estructura que pueda ser mostrada por los navegadores.", "Ninguno de los anteriores.", "1");
            /*03*/      tipo_test("�Cu�l de los siguientes c�digos XHTML es err�neo?", "<b><i>Texto de ejemplo</i></b>", "<p>Esto es un p�rrafo", "<img src=\"ordenador.png\" alt=\"Ordenador port�til\"/>", "<input type=\"checkbox\" name=\"vehiculo\" value=\"coche\" checked=\"checked\" />", "2");
            /*04*/      tipo_test("�Cu�l de las siguientes l�neas es correcta en XML?", "<i> Texto", "<i> Texto <i>", "<i> Texto </i>", "<I> Texto <I>", "3");
            /*05*/      tipo_test("Un atributo en XML:", "Se puede encontrar en las etiquetas de cierre.", "La sintaxis es siempre \"valor_atributo\"=nombre_atributo.", "Es un componente de las etiquetas XML que consiste en un par nombre=valor.", "Pueden existir dos con el mismo nombre en una etiqueta.", "3");
            /*06*/      tipo_test("Identifica cu�l de las siguientes opciones es la correcta en cuanto a los valores de\n        XML:", "<libro isbn=9788491713760 edicion=1 paginas=192/>", "<libro isbn=\"9788491713760\" edicion=\"1\" paginas=\"192\"/>", "<libro isbn=\"9788491713760\" edicion=1 paginas=\"192\"/>", "<libro isbn=9788491713760 edicion='1' paginas=192/>", "2");
            /*07*/      tipo_test("�Cu�l de los siguientes no es un editor compatible con XML?", "Pages", "Notepad++", "Dreamweaver", "Visual Studio Code", "1");
            /*08*/      tipo_test("�Cu�les son las principales ventajas del editor Atom?", "No es una herramienta multinivel.", "Su disposici�n de paneles es est�tica.", "No es multiplataforma.", "Ninguna es correcta.", "4");
            /*09*/      tipo_test("�Por qu� se genera c�digo XML para diferentes plataformas?", "Para almacenar contenidos.", "Para intercambiar contenidos.", "Para representar metadatos.", "Todas son correctas.", "4");
            /*10*/      tipo_test("�Cu�l de los siguientes ser�a un c�digo XML bien formado?", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <1 letra=\"u\" letra=\"a\" letra=\"d\">1</>\n        <2 letra=\"d\" letra=\"b\" letra=\"e\">2</>\n        <3 letra=\"s\" letra=\"c\" letra=\"f\">3</>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <letra=\"u\" letra=\"a\" letra=\"d\">1</>\n        <letra=\"d\" letra=\"b\" letra=\"e\">2</>\n        <letra=\"s\" letra=\"c\" letra=\"f\">3</>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <numero1 letra=\"a\" letra2=\"d\" letra3=\"o\">1</1>\n        <numero2 letra=\"b\" letra2=\"e\" letra3=\"s\">2</2>\n        <numero3 letra=\"c\" letra2=\"f\" letra3=\"i\">3</3>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <numero1 letra=\"a\" letra2=\"d\" letra3=\"o\">1</numero1>\n        <numero2 letra=\"b\" letra2=\"e\" letra3=\"s\">2</numero2>\n        <numero3 letra=\"c\" letra2=\"f\" letra3=\"i\">3</numero3>\n    </numeros>", "4");                        
                    }
                    case "4" -> {
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
            /*01*/      tipo_test("�Qu� ventaja supone la reutilizaci�n de componentes?", "Reducci�n de los costes del proyecto.", "Simplificaci�n de pruebas de software.", "Mejora de la calidad del software.", "Todas las anteriores son ciertas.", "4");
            /*02*/      tipo_test("�Qu� caracter�sticas deben tener en cuenta a la hora de crear un componente?", "La implementaci�n puede estar realizada con cualquier lenguaje de programaci�n, pero\n    ha de estar completa.", "Constituye un m�dulo no reutilizable, sin compilar.", "Su distribuci�n se realiza en varios paquetes ejecutables.", "Debe ser un elemento que no aporte funcionalidad a la interfaz.", "1");
            /*03*/      tipo_test("�Cu�l de las siguientes afirmaciones referida a las propiedades de los componentes es\n        falsa?", "Las propiedades indexadas son aquellas que representan un conjunto de valores en\n    forma de array.", "Las propiedades simples son aquellas que representan solo un valor.", "Los m�todos clave que permiten analizar el contenido de una propiedad o atributo son\n    los de tipo set, mientras que para modificar su valor se utilizan los m�todos get.", "Los m�todos clave que permiten analizar el contenido de una propiedad o atributo son\n    los de tipo get, mientras que para modificar su valor se utilizan los m�todos set.", "3");
            /*04*/      tipo_test("Para el desarrollo de interfaces a trav�s del lenguaje Java, existen componentes que\n        permiten su reutilizaci�n llamados:", "JavaBear", "JavaTwin", "JavaBeans", "JavaPop", "3");
            /*05*/      tipo_test("�Cu�l de las siguientes no es una caracter�stica com�n de los componentes\n        desarrollados como JavaBean?", "Parametrizaci�n", "Persistencia", "Customizaci�n", "Eventos", "1");
            /*06*/      tipo_test("Para definir el nuevo comportamiento de un componente e implementar nuevos\n        m�todos se usar� la palabra reservada", "@Superextend", "@Superride", "@Override", "@Overextend", "3");
            /*07*/      tipo_test("�Qu� m�todo devuelve un valor utilizando return?", "set", "get", "Ambos", "Ninguno", "2");
            /*08*/      tipo_test("Al implementar un nuevo componente:", "Habr� que crear solo las propiedades nuevas, pero no habr� que implementar las que ya\n     posee el componente base.", "Solo podr� contener las propiedades del componente base del que hereda.", "No tendr� ninguna propiedad del componente base del que hereda, siendo todas\n    distintas.", "Ninguna es correcta.", "1");
            /*09*/      tipo_test("�Cu�l de las siguientes herramientas tiene la opci�n de aplicar capas permitiendo\n        aplicar a las im�genes multitud de efectos y tratamientos?", "GIMP", "Paint", "Pinta", "Pinta 3D", "1");
            /*10*/      tipo_test("La clase Graphics de Java permite dibujar como si de un lienzo se tratase sobre una\n        interfaz. Esta clase pertenece a la librer�a", "JButton", "SWING", "AWT", "JCanvas", "3");                       
                    }
                    case "5" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("�Cu�l de las siguientes no es una caracter�stica de las pruebas unitarias?", "R�pida ejecuci�n.", "Independencia respecto a otros tests.", "Un �nico uso.", "Cada test debe poder comprobar si es v�lido por si mismo.", "3");
            /*02*/      tipo_test("�Qu� m�todos se utilizan en las pruebas de tipo JUnit de Eclipse?", "assert", "get", "set", "build", "1");
            /*03*/      tipo_test("�Cu�l de los siguientes tipos de eventos son los producidos por el usuario,\n        habitualmente a trav�s del teclado o del puntero del rat�n?", "Eventos internos.", "Eventos propios.", "Eventos externos.", "Eventos impropios.", "3");
            /*04*/      tipo_test("�Cu�l de los siguientes eventos est� relacionado con el cambio de un componente, de\n        tama�o, posici�n ...?", "EventObject ", "MouseEvent", "ComponentEvent", "ContainerEvent", "3");
            /*05*/      tipo_test("�Cu�l de los siguientes eventos es el asociado al componente JScrollBar?", "AdjustmentEvent", "TextEvent", "ActionEvent", "ItemEvent", "1");
            /*06*/      tipo_test("�Qu� acci�n dispara el evento keyReleased?", "Se produce al pulsar una tecla.", "Se produce al pulsar y soltar una tecla.", "Se produce al soltar una tecla.", "Se produce al pulsar dos teclas.", "3");
            /*07*/      tipo_test("�Qu� m�todo no se podr� utilizar con el escuchador KeyListener?", "keyPressed", "keyGained", "keyTyped", "keyRelease", "2");
            /*08*/      tipo_test("�Qu� evento debe utilizarse con un JSpinner para detectar su cambio de estado?", "stateChanged", "itemStateChanged", "actionPerformed", "actionMove", "1");
            /*09*/      tipo_test("�Qu� evento debe utilizarse con un JComboBox para detectar la selecci�n realizada en\n        �l?", "itemStateChanged", "stateChanged", "itemFocus", "stateFocus", "1");
            /*10*/      tipo_test("Cuando se activa y vincula un escuchador o listener a un componente:", "Los componentes no realizan un filtrado previo de los eventos para determinar si los\n    manejan o no.", "Los componentes realizan un filtrado previo de los eventos para determinar si los\n    manejan o no.", "No ser� necesaria la asociaci�n de la acci�n al evento para manejar el evento.", "Es una acci�n que se realiza de manera autom�tica.", "1");                        
                    }
                    case "6" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                    case "40" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("XML es ...", "Es un lenguaje utilizado para estructurar, almacenar e intercambiar datos entre distintas\n    plataformas.", "Un lenguaje de programaci�n estandarizado.", "El est�ndar m�s empleado en la programaci�n orientada a objetos.", "Un lenguaje de programaci�n para almacenar los atributos de una clase en Java.", "1");
            /*02*/      tipo_test("Un componente puede ...", "Ser implementado siempre que se parta de otro componente ya creado.", "Interactuar con otros componentes software a trav�s de las interfaces de comunicaci�n.", "Interactuar s�lo consigo mismo.", "La A y C son ciertas.", "2");
            /*03*/      tipo_test("Dentro de las pautas de dise�o en relaci�n al aspecto de la interfaz encontramos ...", "Tama�o de la fuente.", "Color de la fuente.", "Estilo.", "Fuentes y Distribuci�n de elementos.", "4");
            /*04*/      tipo_test("�Qu� son los atajos de teclado en una aplicaci�n?", "Un mecanismo para abrir antes el programa.", "Las instrucciones que ejecuta el sistema operativo al ejecutar un programa.", "Son combinaciones de teclas para acceder m�s r�pidamente a determinadas acciones.", "Las dem�s respuestas son incorrectas.", "3");
            /*05*/      tipo_test("Una propiedad en Programaci�n Orientada a Objetos (POO) ...", "Representa solo el comportamiento de un objeto,", "Representa un conjunto de objetos que comparten una misma estructura y comportamientos.", "Define las caracter�sticas de un objeto.", "Las dem�s respuestas son incorrectas. ", "3");
            /*06*/      tipo_test("�Qu� es ISO?", "Es la organizaci�n internacional de normalizaci�n.", "Es el protocolo de interfaces de usuario.", "Son las normas que deben seguir los navegadores.", "Las dem�s respuestas son incorrectas.", "1");
            /*07*/      tipo_test("Los eventos en una aplicaci�n ...", "Son el �nico mecanismo para almacenar datos de una aplicaci�n.", "Son los elementos de la interfaz que almacenan los datos.", "Son un mecanismo para estructurar los elementos de la interfaz.", "Proporcionan un mecanismo adecuado para tratar las diferentes formas de interacci�n\n    entre el usuario y la aplicaci�n.", "4");
            /*08*/      tipo_test("Sobre el IDE de desarrollo Eclipse es cierto que ...", "Es de c�digo propietario.", "No es multiplataforma.", "Es de c�digo abierto y no es multiplataforma.", "Es de c�digo abierto y multiplataforma.", "4");
            /*09*/      tipo_test("�Qu� es la programaci�n basada en eventos?", "Es la clave de la interacci�n entre el usuario y una interfaz.", "Un lenguaje estructurado.", "Un paradigma orientado a objetos sin tipado.", "Todas las respuestas son correctas.", "1");
            /*10*/      tipo_test("�Qu� es la usabilidad?", "Es un conjunto de par�metros para dise�ar sistemas m�s eficientes.", "Es c�mo se muestran las interfaces al usuario.", "Es la manera en como un usuario accede a la informaci�n.", "Es todo el conjunto de reglas para mostrar la informaci�n al usuario.", "1");
            /*11*/      tipo_test("Un documento XML tiene ...", "Una gran flexibilidad y no requiere cerrar las etiquetas.", "Una estructura no anidada y libre.", "Una estructura anidada de manera jer�rquica.", "Una estructura jer�rquica, pero no anidada.", "3");
            /*12*/      tipo_test("En relaci�n a los componentes en Java Swing es cierto que ...", "Son los elementos que se sit�an s�lo sobre el Jpanel.", "Son los elementos que se sit�an s�lo sobre el JPanel y el JDialog.", "Son los elementos que se sit�an en la ventana.", "La A y C son ciertas.", "3");
            /*13*/      tipo_test("En relaci�n a la clase JFrame en Java Swing es cierto que ...", "Es la destinada para crear los marcos contenedores.", "S�lo se puede crear una por cada aplicaci�n.", "Es la destinada para la creaci�n de la ventana para la interfaz.", "La B y C son ciertas.", "3");
            /*14*/      tipo_test("�Qu� elemento de la interfaz de Eclipse contiene paneles para crear componentes y\n        modificar sus propiedades?", "Vista de dise�o.", "Run.", "Palette.", "Toolbar.", "1");
            /*15*/      tipo_test("Los men�s desplegables se crean utilizando el componente:", "JComboBox.", "ButtonGroup.", "JTextField.", "JCheckBox.", "1");
            /*16*/      tipo_test("�Cu�l de las siguientes l�neas es correcta en XML?", "<i> Texto", "<i> Texto <i>", "<i> Texto </i>", "<I> Texto <I>", "3");
            /*17*/      tipo_test("Para definir el nuevo comportamiento de un componente e implementar nuevos\n        m�todos se usar� la palabra reservada:", "@Superextend", "@Superride", "@Override", "@Overextend", "3");
            /*18*/      tipo_test("�Cu�l de los siguientes eventos est� relacionado con el cambio de un componente,\n        de tama�o, posici�n ...?", "EventObject", "MouseEvent", "ComponentEvent", "ContainerEvent", "3");
            /*19*/      tipo_test("�Cu�l es la gu�a de usabilidad donde se recogen los beneficios relativos a las medidas\n        de usabilidad evaluadas?", "ISO/IEC  9126-1.", "ISO/IEC 14915.", "ISO/IEC 9241.", "IEC TR 61997.", "3");
            /*20*/      tipo_test("�Cu�l de las siguientes pautas de dise�o de la estructura de la interfaz de usuario se\n        debe evitar?", "Punto focal.", "Consistencia de ventanas.", "Incoherencia entre elementos.", "Legibilidad y flujo entre elementos.", "3");  
                    }
                    case "0" -> {}
                    default -> System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
