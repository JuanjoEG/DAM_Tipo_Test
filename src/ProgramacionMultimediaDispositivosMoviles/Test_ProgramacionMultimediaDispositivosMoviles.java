package ProgramacionMultimediaDispositivosMoviles;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Test_ProgramacionMultimediaDispositivosMoviles {
    
    public static void Pro_Mul_Dis_Mov() {
        
        Menu_Temas.setTema_01("FUNDAMENTOS DE APLICACIONES M�VILES.");
        Menu_Temas.setTema_02("CONSTRUCCI�N DE PROYECTOS ANDROID.");
        Menu_Temas.setTema_03("PROGRAMACI�N EN ANDROID I.");
        Menu_Temas.setTema_04("PROGRAMACI�N EN ANDROIS II: LAYOUTS.");
        Menu_Temas.setTema_05("PROGRAMACI�N EN ANDROIS III: BOTONES Y LISTAS.");
        Menu_Temas.setTema_06("PROGRAMACI�N EN ANDROID IV: MULTIPANTALLA.");
        Menu_Temas.setTema_07("MULTIMEDIA Y BASES DE DATOS.");
        Menu_Temas.setTema_08("SERVICIOS EN RED I.");
        Menu_Temas.setTema_09("SERVICIOS EN RED II.");
        Menu_Temas.setTema_10("");
        Menu_Temas.setTema_11("");
        Menu_Temas.setTema_12("");
        Menu_Temas.setTema_13("");
        Menu_Temas.setTema_14("");
        Menu_Temas.setTema_15("");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
        
        _Main_.Principal.setAsignatura("PROGRAMACI�N MULTIMEDIA Y DISPOSITIVOS M�VILES");
        
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
        
            /*01*/      tipo_test("�Qu� lenguajes de programaci�n podemos usar para programar apps para Android?", "Java y XML.", "C# y XML.", "Swfit o C#.", "Java o Kotlin y XML.", "4");
            /*02*/      tipo_test("Angular es un tipo de framework:", "Nativo.", "H�brido.", "Web.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*03*/      tipo_test("�En qu� a�o creo Google Android?", "En 2005.", "Google no cre� Android, sino que lo compr� en 2005.", "En 2003.", "En 2000.", "2");
            /*04*/      tipo_test("La versi�n 4.4 de Android tiene de nombre:", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "3");
            /*05*/      tipo_test("El evento onDestroy():", "Este evento representa cuando actividad va a empezar a responder a la interacci�n del usuario.", "Este evento representa cuando actividad va a dejar de responder a la interacci�n del usuario.", "Este evento representa cuando actividad ha pasado completamente a segundo plano.", "Este evento representa cuando actividad va a ser destruida y sus recursos liberados.", "4");
            /*06*/      tipo_test("�Qu� lenguajes de programaci�n podemos usar para programar apps para iOS?", "Java y XML.", "C# y XML.", "Swift u Objective-C.", "Java o Kotlin y XML.", "3");
            /*07*/      tipo_test("La versi�n Oreo de Android tiene el n�mero:", "7.0", "8.0", "9.0", "10.0", "2");
            /*08*/      tipo_test("Android Studio es un tipo de framework:", "Nativo.", "H�brido.", "Web.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*09*/      tipo_test("El primer estado en el ciclo de vida de una app Android es:", "onCreate.", "onStart.", "onResume.", "onDestroy.", "1");
            /*10*/      tipo_test("El evento onStart():", "Este evento representa cuando actividad va a empezar a responder a la interacci�n del usuario.", "Este evento representa cuando actividad va a dejar de responder a la interacci�n del usuario.", "Este evento representa cuando actividad ha pasado completamente a segundo plano.", "Ninguna de las respuestas anteriores es correcta.", "4");                        
                    }
                    case "2" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("�Cu�l es el entorno de desarrollo para desarrollar apps Android de Google?", "NetBeans.", "Eclipse.", "Android Studio.", "XCode.", "3");
            /*02*/      tipo_test("�Cu�ntos emuladores distintos podemos crear en Android Studio?", "Solo uno.", "Todos los que queramos, pero son sistema operativo diferente.", "Todos los que queramos, independientemente del dispositivo y sistema operativo elegido.", "Todos los que queramos, pero solo podremos usar uno a la vez.", "3");
            /*03*/      tipo_test("�Cu�l de las siguientes no es una capa de la estructura del sistema operativo Android?", "Bibliotecas.", "N�cleo Linux.", "Interfaz de usuario.", "Aplicaciones.", "3");
            /*04*/      tipo_test("Android Studio nos permite crear proyectos de:", "�nicamente de Android.", "De Android y de XCode.", "De Java y de Android.", "De XML y de Android.", "1");
            /*05*/      tipo_test("�Cu�l de las siguiente no es una forma v�lida de ejecutar una app Android?", "En un emulador integrado de Android Studio.", "Por consola.", "En un emulador de terceros.", "En un dispositivo f�sico.", "2");
            /*06*/      tipo_test("Las actividades Android se dividen en:", "C�digo en Java e interfaz gr�fica en Java.", "C�digo en Kotlin e interfaz gr�fica en Java.", "C�digo en Java e interfaz gr�fica en XML.", "C�digo en XML e interfaz gr�fica en Kotlin.", "3");
            /*07*/      tipo_test("�Cu�ntas actividades podr� tener nuestra app Android?", "Solamente una, la actividad principal.", "Todas las que necesitemos, sin l�mite.", "La actividad principal y �nicamente otra m�s para realizar operaciones.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*08*/      tipo_test("�Cu�les son los temas que ofrece Android Studio?", "�nicamente tema claro.", "�nicamente tema oscuro.", "Tema claro, oscuro e intermedio.", "Tanto tema claro como tema oscuro.", "4");
            /*09*/      tipo_test("A la hora de ejecutar una app Android,\n        �en cu�ntos dispositivos podremos ejecutarla a la vez?", "En todos los que necesitemos.", "Solo en un dispositivo f�sico.", "Como m�ximo en un emulador y en un dispositivo f�sico.", "Android Studio no ofrece la posibilidad de ejecutar una app en varios dispositivos al mismo tiempo.", "1");
            /*10*/      tipo_test("�A qu� pesta�a de configuraci�n hemos de ir para configurar nuestro dispositivo f�sico\n        para que pueda depurar apps en Android Studio?", "Opciones de red.", "Opciones de desarrollador.", "Opciones de depuraci�n.", "M�s opciones.", "2");
                    }
                    case "3" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�En qu� fichero se encuentran los textos de un proyecto en Android Studio?", "colors.xml", "drawables.xml", "strings.xml", "styles.xml", "3");
            /*02*/      tipo_test("�Cu�l de los siguientes directorios de recursos no existe?", "res/values/strings.xml", "res/values/configuration.xml", "res/values/styles.xml", "res/values/colors.xml", "2");
            /*03*/      tipo_test("La resoluci�n de pantalla de un smartphone es:", "La cantidad de p�xeles de la pantalla tanto en horizontal como en vertical.", "Lo que mide la pantalla en horizontal.", "Lo que mide la pantalla en vertical.", "Lo que mide la pantalla en horizontal multiplicado por lo que mide en vertical.", "1");
            /*04*/      tipo_test("�En qu� lenguaje se codifican los recursos?", "En Java.", "En Kotlin.", "En XML.", "En C++.", "3");
            /*05*/      tipo_test("�En qu� fichero se encuentran los estilos definidos de un proyecto en Android Studio?", "res/values/colors.xml", "res/values/drawables.xml", "res/values/strings.xml", "res/values/styles.xml", "4");
            /*06*/      tipo_test("�A cu�ntos idiomas puedo traducir una app Android?", "A todos los que necesite.", "Como m�ximo a 5 idiomas diferentes.", "Como m�nimo tendr� que estar en ingl�s y en otro idioma.", "Como m�ximo a 5 idiomas diferentes y uno tendr� que ser obligatoriamente el ingl�s.", "1");
            /*07*/      tipo_test("�En qu� fichero se encuentran los colores definidos de un proyecto en Android Studio?", "res/values/colors.xml", "res/values/rawables.xml", "res/values/strings.xml", "res/values/styles.xml", "1");
            /*08*/      tipo_test("�Cu�l es el c�digo para traducir una app al franc�s?", "Es.", "En.", "Fr.", "De.", "3");
            /*09*/      tipo_test("�D�nde se encuentran las im�genes de un proyecto Android Studio?", "res/values", "res/drawables", "res/layout", "res/images", "2");
            /*10*/      tipo_test("Si voy a traducir una app con el c�digo cs, �a qu� idioma la estoy traduciendo?", "Castellano.", "Checo.", "Checheno.", "Catal�n.", "2");                        
                    }
                    case "4" -> {
                        _Main_.Principal.setTema(menu);                      
                        
            /*01*/      tipo_test("�De qu� clase hereda ScrollView?", "LinealLayout", "TableLayout", "FrameLayout", "ConstraintLayout", "3");
            /*02*/      tipo_test("La propiedad android:layout_width:", "Esta propiedad va a definir el tama�o del alto del elemento.", "Esta propiedad nos indica que el elemento mida lo mismo que su contenedor.", "Esta propiedad nos indica que el elemento mida lo justo y necesario.", "Esta propiedad va a definir el tama�o del ancho del elemento.", "4");
            /*03*/      tipo_test("Cuando implementamos Tabs tenemos que utilizar como contenedor:", "TabLayout.", "TabSpec.", "TabWidget.", "TabContent.", "1");
            /*04*/      tipo_test("El atributo android:stretchColumns:", "Indicar� las columnas que pueden expandir para absorber el espacio libre dejado por las\n    dem�s columnas a la derecha de la pantalla.", "Indicar� las columnas que se pueden contraer para dejar espacio al resto de columnas\n    que se puedan salir por la derecha de la pantalla.", "Indicar� que las columnas tendr�n el mismo ancho.", "Indicar� las columnas de la tabla que se quieren ocultar completamente.", "1");
            /*05*/      tipo_test("La propiedad match_parent:", "Esta propiedad va a definir el tama�o del alto del elemento.", "Esta propiedad nos indica que el elemento mida lo mismo que su contenedor.", "Esta propiedad nos indica que el elemento mida lo justo y necesario.", "Esta propiedad va a definir el tama�o del ancho del elemento.", "2");
            /*06*/      tipo_test("El atributo android:collapseColumns:", "Indicar� las columnas que pueden expandir para absorber el espacio libre dejado por las\n    dem�s columnas a la derecha de la pantalla.", "Indicar� las columnas que se pueden contraer para dejar espacio al resto de columnas\n    que se puedan salir por la derecha de la pantalla.", "Indicar� que las columnas tendr�n el mismo ancho.", "Indicar� las columnas de la tabla que se quieren ocultar completamente.", "4");
            /*07*/      tipo_test("La propiedad android:layout_height:", "Esta propiedad va a definir el tama�o del alto del elemento.", "Esta propiedad nos indica que el elemento mida lo mismo que su contenedor.", "Esta propiedad nos indica que el elemento mida lo justo y necesario.", "Esta propiedad va a definir el tama�o del ancho del elemento.", "1");
            /*08*/      tipo_test("�Est� permitida la anidaci�n de Layouts?", "Si, pero tienen que ser el mismo tipo de Layout.", "No, no est� permitido.", "Si, no hay restricciones en cuanto al anidamiento.", "No se puede, ya que consume muchos recursos.", "3");
            /*09*/      tipo_test("El atributo android:shrinkColumns:", "Indicar� las columnas que pueden expandir para absorber el espacio libre dejado por las\n    dem�s columnas a la derecha de la pantalla.", "Indicar� las columnas que se pueden contraer para dejar espacio al resto de columnas\n    que se puedan salir por la derecha de la pantalla.", "Indicar� que las columnas tendr�n el mismo ancho.", "Indicar� las columnas de la tabla que se quieren ocultar completamente.", "2");
            /*10*/      tipo_test("La propiedad wrap_content:", "Esta propiedad va a definir el tama�o del alto del elemento.", "Esta propiedad nos indica que el elemento mida lo mismo que su contenedor.", "Esta propiedad nos indica que el elemento mida lo justo y necesario.", "Esta propiedad va a definir el tama�o del ancho del elemento.", "3");                        
                    }
                    case "5" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("RecyclerView.Adapter:", "Representa un adaptador que gestionar� c�mo se mostrar�n los elementos en pantalla.", "Se encargar� de la gesti�n de la memoria.", "Se utiliza para a�adir decoraciones.", "Todas las opciones son correctas.", "1");
            /*02*/      tipo_test("El m�todo onCreateViewHolder:", "Hereda de RecyclerView.ViewHolder que representar� un elemento de la lista.", "Obtendr� la interfaz gr�fica de los elementos de la lista.", "Mostrar� los datos de los elementos de la lista. ", "Devolver� los elementos que tendr� la lista. ", "2");
            /*03*/      tipo_test("�Qu� elementos se pueden agregar a un RadioGroup?:", "CheckBox.", "EditText.", "Button.", "RadioButton.", "4");
            /*04*/      tipo_test("Si quiero activar mediante c�digo un CheckBox que se llama cb1 tengo que poner:", "cb1.setChecked(true);", "cb1.setChecked(false);", "cb1.isChecked();", "cb1.setText(true);", "1");
            /*05*/      tipo_test("�D�nde se deben almacenar los valores a mostrar en un Spinner?", "En el fichero colors.xml.", "En el fichero strings.xml en un elemento array.", "En el fichero strings.xml en varios elementos string.", "Se deben poner directamente en c�digo sin almacenarlos en ning�n sitio.", "2");
            /*06*/      tipo_test("El m�todo getItemCount:", "Hereda de RecyclerView.ViewHolder que representar� un elemento de la lista.", "Obtendr� la interfaz gr�fica de los elementos de la lista.", "Mostrar� los datos de los elementos de la lista.", "Devolver� la cantidad de elementos que tiene la lista.", "4");
            /*07*/      tipo_test("�Qu� ocurrir� si no ligamos un objeto con su elemento gr�fico con findViewById?", "Nada, funcionar� igual.", "Nada, solo que el elemento no tendr� funcionalidad.", "La app se cerrar� con un fallo de NullPointerException.", "La app se cerrar� con un fallo de FindIdException.", "3");
            /*08*/      tipo_test("Si queremos introducir en un TextView una contrase�a, utilizaremos en el atributo\n        android:inputType el valor:", "\"text\"", "\"textPassword\"", "\"number\"", "\"phone\"", "2");
            /*09*/      tipo_test("�Qu� interfaz deberemos implementar para dar funcionalidad a un Button?", "View.OnClickListener", "Button.OnClickListener", "View.OnClickButtonListener", "View.OnButtonClickListener", "1");
            /*10*/      tipo_test("�Podemos saber qu� RadioButton est� activo dentro de un grupo?", "No, en los grupos se introducen CheckBox.", "Si.", "Si, pero solo si la cantidad de RadioButton que hay en el grupo es par.", "Si, pero solo si la cantidad de RadioButton que hay en el grupo es impar.", "2");                        
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("El atributo android:id de los men�s:", "Es el identificador �nico del men�.", "Es el icono que aparecer� en el men� desplegable junto al men�.", "Es el texto que aparecer� en el men� desplegable junto al icono. Deber� ir en strings.xml. ", "Los men�s no tienen id, eso son los objetos gr�ficos.", "1");
            /*02*/      tipo_test("�Qu� atributo de un men� deberemos configurar si queremos que este se oculte?", "Hidden.", "Visible.", "Show.", "NotHidden.", "2");
            /*03*/      tipo_test("�Desde d�nde podremos acceder a las preferencias de la app?", "Solo desde la pantalla de SettingsActivity.", "Solo desde un objeto del tipo SharedPreferences.", "Las preferencias una vez creadas no son accesibles. ", "Desde cualquier punto de la aplicaci�n.", "4");
            /*04*/      tipo_test("El atributo android:title de los men�s:", "Es el identificador �nico del men�.", "Es el icono que aparecer� en el men� desplegable junto al men�.", "Es el texto que aparecer� en el men� desplegable junto al icono. Deber� ir en strings.xml. ", "Es el t�tulo de la pantalla donde estar�n los men�s.", "3");
            /*05*/      tipo_test("El modo de acceso de las preferencias MODE_PRIVATE:", "S�lo nuestra aplicaci�n tiene acceso a estas preferencias.", "Todas las aplicaciones pueden leer estas preferencias, pero s�lo la nuestra puede modificarlas.", "Todas las aplicaciones pueden leer y modificar estas preferencias.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*06*/      tipo_test("El atributo android:icon de los men�s:", "Es el identificador �nico del men�.", "Es el icono que aparecer� en el men� desplegable junto al men�.", "Es el texto que aparecer� en el men� desplegable junto al icono. Deber� ir en strings.xml. ", "Es el t�tulo de aplicaci�n.", "2");
            /*07*/      tipo_test("El modo de acceso de las preferencias MODE_WORLD_READABLE:", "S�lo nuestra aplicaci�n tiene acceso a estas preferencias.", "Todas las aplicaciones pueden leer estas preferencias, pero s�lo la nuestra puede modificarlas.", "Todas las aplicaciones pueden leer y modificar estas preferencias.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*08*/      tipo_test("�C�mo se llama la pantalla de carga de las apps?", "SplashScreen.", "LoadScreen.", "TimeScreen.", "LoadingScreen.", "1");
            /*09*/      tipo_test("Con un Intent podemos:", "Lanzar una hebra.", "Liberar el espacio de memoria de la app cuando se cierre.", "Cambiar el estilo de una caja de texto.", "Ir a otra pantalla.", "4");
            /*10*/      tipo_test("El modo de acceso de las preferencias MODE_WORLD_WRITABLE:", "S�lo nuestra aplicaci�n tiene acceso a estas preferencias.", "Todas las aplicaciones pueden leer estas preferencias, pero s�lo la nuestra puede modificarlas.", "Todas las aplicaciones pueden leer y modificar estas preferencias.", "Ninguna de las respuestas anteriores es correcta.", "3");                        
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Qu� m�todo de la clase SQLiteOpenHelper es el que hay que sobrescribir para que\n        actualice autom�ticamente la base de datos?", "onCreate()", "delete()", "onUpgrade()", "Hay que crear un m�todo propio.", "3");
            /*02*/      tipo_test("�C�mo podemos insertar valores en una tabla?", "�nicamente mediante el m�todo insert.", "�nicamente ejecutando la consulta INSERT con el m�todo execSQL.", "�nicamente con el m�todo rawQuery.", "Podremos ejecutarlas mediante el m�todo insert o mediante el m�todo execSQL,\n    aunque es m�s recomendable el primero.", "4");
            /*03*/      tipo_test("Para reproducir un sonido corto utilizaremos:", "La clase SoundPool.", "La clase MediaPlayer.", "Ninguna de las dos clases.", "Ambas clases.", "1");
            /*04*/      tipo_test("Cuando utilizamos un objeto de la clase MediaPlayer, despu�s de llamar al m�todo\n        stop deberemos llamar al m�todo:", "Play.", "Stop de nuevo.", "Release.", "Pause.", "3");
            /*05*/      tipo_test("�Qu� gestor de bases de datos podemos utilizar en Android?", "MySQL.", "Microsoft SQL Server.", "SQLite.", "MongoDB.", "3");
            /*06*/      tipo_test("�Cu�l de las siguientes opciones no podremos ejecutarla en nuestra base de\n        datos de nuestra app Android?", "Inserci�n de valores.", "Consulta de valores.", "Actualizaci�n de valores.", "Podremos realizarlas todas.", "4");
            /*07*/      tipo_test("Para realizar una operaci�n de inserci�n de datos deberemos llamar al m�todo:", "getWritableDatabase.", "getReadableDatabase.", "getInsertableDatabase.", "getModificableDatabase.", "1");
            /*08*/      tipo_test("Para insertar valores en un objeto del tipo ContentValues:", "Debemos ir insertando valor a valor con el m�todo insert.", "Deberemos insertarle un array con todos los valores como String.", "Deberemos insertarle un objeto clave-valor compuesto por el nombre de la columna y su\n    valor con el m�todo put.", "Para insertar datos no debemos usar un objeto de tipo ContentValues.", "3");
            /*09*/      tipo_test("�Es posible ordenar los valores de una consulta de datos?", "Si, pero solo si usamos el m�todo rawQuery.", "Si, pero solo si utilizamos el m�todo execSQL.", "Si.", "No.", "3");
            /*10*/      tipo_test("Para realizar una operaci�n de consulta de datos deberemos llamar al m�todo:", "getWritableDatabase.", "getReadableDatabase.", "getInsertableDatabase.", "getModificableDatabase.", "2");                        
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La etiqueta de cierre de php es:", "php?", "�>", "?>", "php/>", "3");
            /*02*/      tipo_test("�Cu�l es la instrucci�n que permite mostrar datos por pantalla en PHP?", "System.out.println.", "echo.", "cout.", "print.", "2");
            /*03*/      tipo_test("PHP es un lenguaje que se ejecuta en:", "En la parte backend del proyecto.", "En la parte frontend del proyecto.", "Ambas respuestas son correctas.", "Ninguna de las respuestas es correcta.", "1");
            /*04*/      tipo_test("�Cu�l de las siguientes variables de tipo num�rico est� declarada de forma correcta?", "$total = 3;", "$total = \"3\";", "total = 3;", "total = \"3\";", "1");
            /*05*/      tipo_test("�En qu� debe terminar cada sentencia de php?", "Punto y coma.", "Punto.", "No hace falta nada.", "Una llave }.", "1");
            /*06*/      tipo_test("�Con qu� podemos realizar las comunicaciones en una aplicaci�n?", "JSON.", "XML.", "JSON y XML.", "PHP.", "3");
            /*07*/      tipo_test("�Con cu�l de estos caracteres marca una l�nea como comentario?", "@", "//", ";", "Ninguna de las opciones es correcta.", "2");
            /*08*/      tipo_test("�Cu�l de los siguientes tipos de datos no los soporta JSON?", "Enteros.", "Boolean.", "Array.", "Pilas.", "4");
            /*09*/      tipo_test("Los arrays en JSON se delimitan mediante:", "{ }", "\" \"", "[ ]", "< >", "3");
            /*10*/      tipo_test("Para poder trabajar con nuestro servidor local en XAMPP deberemos activar las\n        casillas de:", "�nicamente Apache.", "Apache y MySQL.", "�nicamente MySQL.", "Tomcat y MySQL.", "2");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La parte de backend de un proyecto es:", "La parte que corresponde a la aplicaci�n Android.", "La parte que corresponde a la interfaz gr�fica de la aplicaci�n Android.", "La parte que corresponde al servidor.", "La parte que corresponde a la base de datos del servidor.", "3");
            /*02*/      tipo_test("Con el m�todo getJSONObjectFromUrl obtendremos un objeto de la clase:", "JSONArray.", "JSONObject.", "ArrayList.", "HashMap.", "2");
            /*03*/      tipo_test("El puerto utilizado en las conexiones HTTPS es:", "443.", "444.", "344.", "333.", "1");
            /*04*/      tipo_test("Una API REST puede comunicarse en:", "�nicamente en JSON.", "�nicamente en XML.", "Tanto en JSON como en PHP.", "�nicamente en HTML.", "3");
            /*05*/      tipo_test("�Cu�l de los siguientes permisos tiene que ver con el acceso a internet?", "READ_PHONE_STATE.", "WRITE_EXTERNAL_STORAGE.", "ADD_VOICEMAIL.", "ACCESS_NETWORK_STATE.", "4");
            /*06*/      tipo_test("Las peticiones HTTPS en Android:", "Se pueden hacer con el m�todo getHTTP y getHTTPS.", "Se ejecutar�n en un hilo aparte.", "No necesitan de ning�n permiso especial para su ejecuci�n.", "Todas las respuestas anteriores son correctas.", "2");
            /*07*/      tipo_test("La biblioteca Volley:", "Nos permite obtener JSON de una forma sencilla.", "Nos permite subir ficheros a nuestro servidor de una forma sencilla.", "Viene integrada directamente en la JDK de Android.", "Puede lazar la excepci�n IndexOfBoundException.", "1");
            /*08*/      tipo_test("La parte de frontend de un proyecto es:", "a parte que corresponde a la aplicaci�n Android.", "La parte que corresponde a la interfaz gr�fica de la aplicaci�n Android.", "La parte que corresponde al servidor, incluyendo PHP y MySQL.", "La parte que corresponde a la base de datos del servidor. ", "1");
            /*09*/      tipo_test("El servicio Web con el que accederemos a la parte de la base de datos est� formado\n        por:", "Aplicaciones HTTP.", "Ficheros PHP.", "ArrayList de JSON.", "El backend de nuestra aplicaci�n.", "2");
            /*10*/      tipo_test("Si queremos obtener un array de una petici�n HTTP deberemos utilizar un objeto:", "JSONArray.", "JSONObject.", "ArrayList.", "HashMap.", "1");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
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
                        _Main_.Principal.setTema(menu);
                        
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
                        _Main_.Principal.setTema(menu);
                        
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
                        _Main_.Principal.setTema(menu);
                        
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
                        _Main_.Principal.setTema(menu);
                        
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
                        _Main_.Principal.setTema(menu);
                        
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
                        ProgramacionMultimediaDispositivosMoviles.Test_Rep_I_Pro_Mul_Dis_Mov.Rep_I_Pro_Mul_Dis_Mov();
                    }
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
