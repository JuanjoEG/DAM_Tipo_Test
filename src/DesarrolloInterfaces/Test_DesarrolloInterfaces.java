package DesarrolloInterfaces;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
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
        *  1. TEMA: INTRODUCCIÓN A LA CONFECCIÓN DE INTERFACES                 *
        *  2. TEMA: CLASES Y COMPONENTES                                       *
        *  3. TEMA: GENERACIÓN DE INTERFACES A PARTIR DE DOCUMENTOS XML        *
        *  4. TEMA: CREACIÓN DE COMPONENTES                                    *
        *  5. TEMA: EXPLOTACIÓN DE COMPONENTES VISUALES                        *
        *  6. TEMA: USABILIDAD I: CONCEPTO Y NORMATIVA                         *
        *  7. TEMA: USABILIDAD II: PAUTAS DE DISEÑO                            *
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
        *  0. ATRÁS.                                                           *
        ************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {                        
                        System.out.println("\nTEMA " + menu + "\n");
        
            /*01*/      tipo_test("¿Cuál es el objetivo de un lenguaje de programación?", "Escribir instrucciones interpretables por una persona.", "Controlar diferentes comportamientos lógicos o físicos de una máquina.", "Desarrollar interfaces.", "Implementar una página web.", "2");
            /*02*/      tipo_test("¿Cuál de los siguientes no es un lenguaje de alto nivel?", "Java.", "C#.", "Python.", "Ensamblador.", "4");
            /*03*/      tipo_test("¿Cuál de los siguientes modelos de programación no pertenece al paradigma\n        imperativo?", "Estructurada.", "Declarativa.", "Modular.", "Procedimental.", "2");
            /*04*/      tipo_test("¿Qué diferencia existe entre la clase Component y Container de la librería AWT?", "La clase Container define los controles principales que se sitúan dentro del elemento\n    contenedor, y Component es la pantalla en la que se muestra la interfaz de la aplicación\n    a desarrollar.", "La clase Component define los controles principales que se sitúan dentro del elemento\n    contenedor, y Container es la pantalla en la que se muestra la interfaz de la aplicación a\n    desarrollar.", "La clase Container sirve para desarrollar la parte gráfica de la interfaz y Component para\n    diseñar la parte lógica.", "La clase Component sirve para desarrollar la parte gráfica de la interfaz y Container para\n    almacenar los distintos métodos de la parte lógica.", "2");
            /*05*/      tipo_test("¿Cuál de las siguientes afirmaciones sobre el uso de la librería Swing es verdadera?", "Permite crear un diseño desde cero arrastrando los componentes hasta el panel de\n    diseño y generando al mismo tiempo el código asociado a esos componentes.", "Permite implementar el código de cada uno de los componentes de la interfaz antes de\n    la creación gráfica del componente.", "No dispone de una vista de diseño y tiene más limitaciones que la librería AWT.", "El código asociado a cada componente se realiza tras la compilación de la interfaz, y no\n    mientras se realiza el diseño de estos.", "1");
            /*06*/      tipo_test("¿Qué herramienta de edición de interfaces es de tipo propietaria?", "MonoDevelop.", "Glade.", "NetBeans.", "Visual Studio.", "4");
            /*07*/      tipo_test("¿Qué elemento de la interfaz de Eclipse contiene paneles para crear componentes y\n        modificar sus propiedades?", "Vista de diseño.", "Run.", "Palette.", "Toolbar.", "1");
            /*08*/      tipo_test("¿Qué paquetes se deben instalar en Eclipse para poder trabajar correctamente con la\n        librería Swing?", "Docker Tooling.", "General Purpose Tools.", "EclipseRT Target Platform Components.", "Todos los que empiecen por SWT y WindowBuilder.", "4");
            /*09*/      tipo_test("¿A qué IDE pertenece el componente para diseñar llamado Palette?", "NetBeans.", "Eclipse.", "Glade.", "Visual Studio.", "2");
            /*10*/      tipo_test("¿Cuál de las siguientes herramientas de edición de interfaces pertenece a Unity?", "MonoDevelop.", "NetBeans.", "VisualStudio.", "Glade.", "1");                       
                    }
                    case "2" -> {
                        System.out.println("\nTEMA " + menu + "\n");
        
            /*01*/      tipo_test("¿Qué es una clase en Java?", "Representa un conjunto de atributos ordenados que tienen un propósito.", "Representa un conjunto de objetos que comparte una mista estructura (atributos) y\n    comportamientos (métodos).", "Representa un objeto que hereda de otra clase.", "Representa un método que recibe argumentos y crea un objeto.", "2");
            /*02*/      tipo_test("¿Cuál de las siguientes afirmaciones respecto a los métodos de Java es cierta?", "Los métodos definen la estructura de un objeto y no pueden recibir argumentos.", "Los métodos definen el comportamiento de un objeto y pueden recibir o no argumentos.", "Los métodos definen el comportamiento de un objeto y deben recibir argumentos.", "Los métodos definen la estructura de una clase y no pueden recibir argumentos.", "2");
            /*03*/      tipo_test("¿Qué es un objeto?", "Las características que tienen las clases.", "Los métodos que tienen las clases.", "Una cápsula que contiene los datos y métodos ligados a él.", "Los métodos que reciben argumentos.", "3");
            /*04*/      tipo_test("¿Qué característica define a un JPanel?", "Es un contenedor de componentes sobre el que se ubican elementos.", "Es la ventana invisible sobre la que se sitúa un JFrame.", "Es un tipo de capa perteneciente a los Layouts.", "Es una ventana visible sobre la que se sitúa un JFrame.", "1");
            /*05*/      tipo_test("¿Qué diferencia existe entre JFrame y JDialog?", "La ventana principal de una aplicación es un JDialog y es aconsejable utilizar para\n    pantallas secundarias JFrame.", "La ventana principal de una aplicación es un JFrame y es aconsejable utilizar para\n    pantallas secundarias JDialog.", "De tipo JDialog sólo debe de haber una ventana.", "De tipo JFrame es recomendable que haya varias ventanas.", "2");
            /*06*/      tipo_test("El componente JButton:", "Es el elemento de texto más utilizado.", "No permite utilizar imágenes.", "Tiene la propiedad enabled que determina si está activo o no.", "Se suele utilizar cuando existen varias opciones y son excluyentes.", "3");
            /*07*/      tipo_test("Los menús desplegables se crean utilizando el componente:", "JComboBox.", "ButtonGroup.", "JTextField.", "JCheckBox.", "1");
            /*08*/      tipo_test("¿Cuál de los siguientes manejadores de componentes tiene las propiedades \"align\",\n        \"hgap\" y \"vgap\"?", "FlowLayout.", "BorderLayout.", "GridBagLayout.", "GridLayout.", "1");
            /*09*/      tipo_test("¿Con qué distribución de elementos se crea por defecto un JFrame?", "FlowLayout.", "BorderLayout.", "GridBagLayout.", "GridLayout.", "2");
            /*10*/      tipo_test("¿Qué manejador de componentes permite un diseño más flexible y preciso?", "FlowLayout.", "BorderLayout.", "GridBagLayout.", "GridLayout.", "3");
                    }
                    case "3" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("¿Qué significa XML?", "X-Markup Language", "eXtensible Markup Language", "Example Markup Language", "eXtra Modern Link", "2");
            /*02*/      tipo_test("¿Cuáles es el objetivo del lenguaje RSS?", "Difundir información a usuarios que se han suscrito a una fuentes de contenidos\n    actualizada frecuentemente.", "Representar elementos geométricos vectoriales, imágenes de mapa de bits y texto.", "Marcar contenido como texto, imágenes y enlaces en forma de hipervínculos para crear\n    una estructura que pueda ser mostrada por los navegadores.", "Ninguno de los anteriores.", "1");
            /*03*/      tipo_test("¿Cuál de los siguientes códigos XHTML es erróneo?", "<b><i>Texto de ejemplo</i></b>", "<p>Esto es un párrafo", "<img src=\"ordenador.png\" alt=\"Ordenador portátil\"/>", "<input type=\"checkbox\" name=\"vehiculo\" value=\"coche\" checked=\"checked\" />", "2");
            /*04*/      tipo_test("¿Cuál de las siguientes líneas es correcta en XML?", "<i> Texto", "<i> Texto <i>", "<i> Texto </i>", "<I> Texto <I>", "3");
            /*05*/      tipo_test("Un atributo en XML:", "Se puede encontrar en las etiquetas de cierre.", "La sintaxis es siempre \"valor_atributo\"=nombre_atributo.", "Es un componente de las etiquetas XML que consiste en un par nombre=valor.", "Pueden existir dos con el mismo nombre en una etiqueta.", "3");
            /*06*/      tipo_test("Identifica cuál de las siguientes opciones es la correcta en cuanto a los valores de\n        XML:", "<libro isbn=9788491713760 edicion=1 paginas=192/>", "<libro isbn=\"9788491713760\" edicion=\"1\" paginas=\"192\"/>", "<libro isbn=\"9788491713760\" edicion=1 paginas=\"192\"/>", "<libro isbn=9788491713760 edicion='1' paginas=192/>", "2");
            /*07*/      tipo_test("¿Cuál de los siguientes no es un editor compatible con XML?", "Pages", "Notepad++", "Dreamweaver", "Visual Studio Code", "1");
            /*08*/      tipo_test("¿Cuáles son las principales ventajas del editor Atom?", "No es una herramienta multinivel.", "Su disposición de paneles es estática.", "No es multiplataforma.", "Ninguna es correcta.", "4");
            /*09*/      tipo_test("¿Por qué se genera código XML para diferentes plataformas?", "Para almacenar contenidos.", "Para intercambiar contenidos.", "Para representar metadatos.", "Todas son correctas.", "4");
            /*10*/      tipo_test("¿Cuál de los siguientes sería un código XML bien formado?", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <1 letra=\"u\" letra=\"a\" letra=\"d\">1</>\n        <2 letra=\"d\" letra=\"b\" letra=\"e\">2</>\n        <3 letra=\"s\" letra=\"c\" letra=\"f\">3</>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <letra=\"u\" letra=\"a\" letra=\"d\">1</>\n        <letra=\"d\" letra=\"b\" letra=\"e\">2</>\n        <letra=\"s\" letra=\"c\" letra=\"f\">3</>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <numero1 letra=\"a\" letra2=\"d\" letra3=\"o\">1</1>\n        <numero2 letra=\"b\" letra2=\"e\" letra3=\"s\">2</2>\n        <numero3 letra=\"c\" letra2=\"f\" letra3=\"i\">3</3>\n    </numeros>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n    <numeros>\n        <numero1 letra=\"a\" letra2=\"d\" letra3=\"o\">1</numero1>\n        <numero2 letra=\"b\" letra2=\"e\" letra3=\"s\">2</numero2>\n        <numero3 letra=\"c\" letra2=\"f\" letra3=\"i\">3</numero3>\n    </numeros>", "4");                        
                    }
                    case "4" -> {
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
            /*01*/      tipo_test("¿Qué ventaja supone la reutilización de componentes?", "Reducción de los costes del proyecto.", "Simplificación de pruebas de software.", "Mejora de la calidad del software.", "Todas las anteriores son ciertas.", "4");
            /*02*/      tipo_test("¿Qué características deben tener en cuenta a la hora de crear un componente?", "La implementación puede estar realizada con cualquier lenguaje de programación, pero\n    ha de estar completa.", "Constituye un módulo no reutilizable, sin compilar.", "Su distribución se realiza en varios paquetes ejecutables.", "Debe ser un elemento que no aporte funcionalidad a la interfaz.", "1");
            /*03*/      tipo_test("¿Cuál de las siguientes afirmaciones referida a las propiedades de los componentes es\n        falsa?", "Las propiedades indexadas son aquellas que representan un conjunto de valores en\n    forma de array.", "Las propiedades simples son aquellas que representan solo un valor.", "Los métodos clave que permiten analizar el contenido de una propiedad o atributo son\n    los de tipo set, mientras que para modificar su valor se utilizan los métodos get.", "Los métodos clave que permiten analizar el contenido de una propiedad o atributo son\n    los de tipo get, mientras que para modificar su valor se utilizan los métodos set.", "3");
            /*04*/      tipo_test("Para el desarrollo de interfaces a través del lenguaje Java, existen componentes que\n        permiten su reutilización llamados:", "JavaBear", "JavaTwin", "JavaBeans", "JavaPop", "3");
            /*05*/      tipo_test("¿Cuál de las siguientes no es una característica común de los componentes\n        desarrollados como JavaBean?", "Parametrización", "Persistencia", "Customización", "Eventos", "1");
            /*06*/      tipo_test("Para definir el nuevo comportamiento de un componente e implementar nuevos\n        métodos se usará la palabra reservada", "@Superextend", "@Superride", "@Override", "@Overextend", "3");
            /*07*/      tipo_test("¿Qué método devuelve un valor utilizando return?", "set", "get", "Ambos", "Ninguno", "2");
            /*08*/      tipo_test("Al implementar un nuevo componente:", "Habrá que crear solo las propiedades nuevas, pero no habrá que implementar las que ya\n     posee el componente base.", "Solo podrá contener las propiedades del componente base del que hereda.", "No tendrá ninguna propiedad del componente base del que hereda, siendo todas\n    distintas.", "Ninguna es correcta.", "1");
            /*09*/      tipo_test("¿Cuál de las siguientes herramientas tiene la opción de aplicar capas permitiendo\n        aplicar a las imágenes multitud de efectos y tratamientos?", "GIMP", "Paint", "Pinta", "Pinta 3D", "1");
            /*10*/      tipo_test("La clase Graphics de Java permite dibujar como si de un lienzo se tratase sobre una\n        interfaz. Esta clase pertenece a la librería", "JButton", "SWING", "AWT", "JCanvas", "3");                       
                    }
                    case "5" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("¿Cuál de las siguientes no es una característica de las pruebas unitarias?", "Rápida ejecución.", "Independencia respecto a otros tests.", "Un único uso.", "Cada test debe poder comprobar si es válido por si mismo.", "3");
            /*02*/      tipo_test("¿Qué métodos se utilizan en las pruebas de tipo JUnit de Eclipse?", "assert", "get", "set", "build", "1");
            /*03*/      tipo_test("¿Cuál de los siguientes tipos de eventos son los producidos por el usuario,\n        habitualmente a través del teclado o del puntero del ratón?", "Eventos internos.", "Eventos propios.", "Eventos externos.", "Eventos impropios.", "3");
            /*04*/      tipo_test("¿Cuál de los siguientes eventos está relacionado con el cambio de un componente, de\n        tamaño, posición ...?", "EventObject ", "MouseEvent", "ComponentEvent", "ContainerEvent", "3");
            /*05*/      tipo_test("¿Cuál de los siguientes eventos es el asociado al componente JScrollBar?", "AdjustmentEvent", "TextEvent", "ActionEvent", "ItemEvent", "1");
            /*06*/      tipo_test("¿Qué acción dispara el evento keyReleased?", "Se produce al pulsar una tecla.", "Se produce al pulsar y soltar una tecla.", "Se produce al soltar una tecla.", "Se produce al pulsar dos teclas.", "3");
            /*07*/      tipo_test("¿Qué método no se podrá utilizar con el escuchador KeyListener?", "keyPressed", "keyGained", "keyTyped", "keyRelease", "2");
            /*08*/      tipo_test("¿Qué evento debe utilizarse con un JSpinner para detectar su cambio de estado?", "stateChanged", "itemStateChanged", "actionPerformed", "actionMove", "1");
            /*09*/      tipo_test("¿Qué evento debe utilizarse con un JComboBox para detectar la selección realizada en\n        él?", "itemStateChanged", "stateChanged", "itemFocus", "stateFocus", "1");
            /*10*/      tipo_test("Cuando se activa y vincula un escuchador o listener a un componente:", "Los componentes no realizan un filtrado previo de los eventos para determinar si los\n    manejan o no.", "Los componentes realizan un filtrado previo de los eventos para determinar si los\n    manejan o no.", "No será necesaria la asociación de la acción al evento para manejar el evento.", "Es una acción que se realiza de manera automática.", "1");                        
                    }
                    case "6" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("¿Cuál de los siguientes conceptos hace referencia a la facilidad o dificultad de uso de\n        un sitio web?", "Accesibilidad.", "Practicidad.", "Usabilidad.", "Utilidad.", "3");
            /*02*/      tipo_test("¿Cuál de las siguientes no es una característica deseable en una interfaz?", "Alta tasa de error.", "Facilidad de aprendizaje.", "Eficiencia de uso.", "Alta satisfacción.", "1");
            /*03*/      tipo_test("¿Cuál de los siguientes principios de diseño de un sistema interactivo no es\n        recomendable?", "Facilitar buenos mensajes de error.", "Conocer al usuario.", "Maximizar la memorización.", "Optimizar las operaciones mediante la rápida ejecución de operaciones comunes.", "3");
            /*04*/      tipo_test("La disciplina que estudia el intercambio de información entre las personas y los\n        ordenadores, cuyo objetivo es que el intercambio y acceso a la información sea lo más\n        eficiente posible es:", "La accesibilidad computacional.", "La comunicación humana.", "La interacción persona ordenador.", "La actividad informática.", "3");
            /*05*/      tipo_test("¿Cuál es la función de la Organización Internacional de la Normalización, ISO?", "Crear normas y estándares cuyo objetivo principal es conseguir asegurar que servicios y\n    productos presenten ciertos niveles de calidad, eficiencia y seguridad.", "Definir la usabilidad como la capacidad de un producto para ser entendido, aprendido,\n    usado y resultar atractivo para el usuario.", "Tener normas y estándares en materia relativa a la consecución de buenos parámetros\n    de usabilidad con respecto al diseño y desarrollo de interfaces que favorecen la\n    interacción entre la aplicación y el usuario.", "Todas las anteriores son correctas.", "4");
            /*06*/      tipo_test("¿Cuál es la guía de usabilidad donde se recogen los beneficios relativos a las medidas\n        de usabilidad evaluadas?", "ISO/IEC  9126-1.", "ISO/IEC 14915.", "ISO/IEC 9241.", "IEC TR 61997.", "3");
            /*07*/      tipo_test("¿Cuáles son las principales medidas de usabilidad de las aplicaciones?", "Satisfacción.", "Efectividad.", "Eficiencia.", "Todas las anteriores.", "4");
            /*08*/      tipo_test("¿Qué es la evaluación heurística?", "Es una prueba realizada por expertos.", "Es lo contrario al método de inspección.", "Es una única evaluación de alto nivel.", "Es una prueba realizada por usuarios.", "1");
            /*09*/      tipo_test("¿Qué criterio no se debería tener en cuenta a la hora de diseñar pruebas de usabilidad\n        con usuarios?", "Pruebas genéricas.", "Pruebas razonables.", "Pruebas factibles.", "Tiempo de realización razonable.", "1");
            /*10*/      tipo_test("¿Cuál de los siguientes no es un tipo de test de usabilidad?", "Test de uso pautado.", "Test de uso descontextualizado.", "Test de uso natural.", "Test de uso artificial.", "4");                       
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
                        
            /*01*/      tipo_test("XML es ...", "Es un lenguaje utilizado para estructurar, almacenar e intercambiar datos entre distintas\n    plataformas.", "Un lenguaje de programación estandarizado.", "El estándar más empleado en la programación orientada a objetos.", "Un lenguaje de programación para almacenar los atributos de una clase en Java.", "1");
            /*02*/      tipo_test("Un componente puede ...", "Ser implementado siempre que se parta de otro componente ya creado.", "Interactuar con otros componentes software a través de las interfaces de comunicación.", "Interactuar sólo consigo mismo.", "La A y C son ciertas.", "2");
            /*03*/      tipo_test("Dentro de las pautas de diseño en relación al aspecto de la interfaz encontramos ...", "Tamaño de la fuente.", "Color de la fuente.", "Estilo.", "Fuentes y Distribución de elementos.", "4");
            /*04*/      tipo_test("¿Qué son los atajos de teclado en una aplicación?", "Un mecanismo para abrir antes el programa.", "Las instrucciones que ejecuta el sistema operativo al ejecutar un programa.", "Son combinaciones de teclas para acceder más rápidamente a determinadas acciones.", "Las demás respuestas son incorrectas.", "3");
            /*05*/      tipo_test("Una propiedad en Programación Orientada a Objetos (POO) ...", "Representa solo el comportamiento de un objeto,", "Representa un conjunto de objetos que comparten una misma estructura y comportamientos.", "Define las características de un objeto.", "Las demás respuestas son incorrectas. ", "3");
            /*06*/      tipo_test("¿Qué es ISO?", "Es la organización internacional de normalización.", "Es el protocolo de interfaces de usuario.", "Son las normas que deben seguir los navegadores.", "Las demás respuestas son incorrectas.", "1");
            /*07*/      tipo_test("Los eventos en una aplicación ...", "Son el único mecanismo para almacenar datos de una aplicación.", "Son los elementos de la interfaz que almacenan los datos.", "Son un mecanismo para estructurar los elementos de la interfaz.", "Proporcionan un mecanismo adecuado para tratar las diferentes formas de interacción\n    entre el usuario y la aplicación.", "4");
            /*08*/      tipo_test("Sobre el IDE de desarrollo Eclipse es cierto que ...", "Es de código propietario.", "No es multiplataforma.", "Es de código abierto y no es multiplataforma.", "Es de código abierto y multiplataforma.", "4");
            /*09*/      tipo_test("¿Qué es la programación basada en eventos?", "Es la clave de la interacción entre el usuario y una interfaz.", "Un lenguaje estructurado.", "Un paradigma orientado a objetos sin tipado.", "Todas las respuestas son correctas.", "1");
            /*10*/      tipo_test("¿Qué es la usabilidad?", "Es un conjunto de parámetros para diseñar sistemas más eficientes.", "Es cómo se muestran las interfaces al usuario.", "Es la manera en como un usuario accede a la información.", "Es todo el conjunto de reglas para mostrar la información al usuario.", "1");
            /*11*/      tipo_test("Un documento XML tiene ...", "Una gran flexibilidad y no requiere cerrar las etiquetas.", "Una estructura no anidada y libre.", "Una estructura anidada de manera jerárquica.", "Una estructura jerárquica, pero no anidada.", "3");
            /*12*/      tipo_test("En relación a los componentes en Java Swing es cierto que ...", "Son los elementos que se sitúan sólo sobre el Jpanel.", "Son los elementos que se sitúan sólo sobre el JPanel y el JDialog.", "Son los elementos que se sitúan en la ventana.", "La A y C son ciertas.", "3");
            /*13*/      tipo_test("En relación a la clase JFrame en Java Swing es cierto que ...", "Es la destinada para crear los marcos contenedores.", "Sólo se puede crear una por cada aplicación.", "Es la destinada para la creación de la ventana para la interfaz.", "La B y C son ciertas.", "3");
            /*14*/      tipo_test("¿Qué elemento de la interfaz de Eclipse contiene paneles para crear componentes y\n        modificar sus propiedades?", "Vista de diseño.", "Run.", "Palette.", "Toolbar.", "1");
            /*15*/      tipo_test("Los menús desplegables se crean utilizando el componente:", "JComboBox.", "ButtonGroup.", "JTextField.", "JCheckBox.", "1");
            /*16*/      tipo_test("¿Cuál de las siguientes líneas es correcta en XML?", "<i> Texto", "<i> Texto <i>", "<i> Texto </i>", "<I> Texto <I>", "3");
            /*17*/      tipo_test("Para definir el nuevo comportamiento de un componente e implementar nuevos\n        métodos se usará la palabra reservada:", "@Superextend", "@Superride", "@Override", "@Overextend", "3");
            /*18*/      tipo_test("¿Cuál de los siguientes eventos está relacionado con el cambio de un componente,\n        de tamaño, posición ...?", "EventObject", "MouseEvent", "ComponentEvent", "ContainerEvent", "3");
            /*19*/      tipo_test("¿Cuál es la guía de usabilidad donde se recogen los beneficios relativos a las medidas\n        de usabilidad evaluadas?", "ISO/IEC  9126-1.", "ISO/IEC 14915.", "ISO/IEC 9241.", "IEC TR 61997.", "3");
            /*20*/      tipo_test("¿Cuál de las siguientes pautas de diseño de la estructura de la interfaz de usuario se\n        debe evitar?", "Punto focal.", "Consistencia de ventanas.", "Incoherencia entre elementos.", "Legibilidad y flujo entre elementos.", "3");  
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
