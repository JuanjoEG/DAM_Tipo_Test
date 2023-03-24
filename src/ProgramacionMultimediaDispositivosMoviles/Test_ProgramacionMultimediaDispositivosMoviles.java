package ProgramacionMultimediaDispositivosMoviles;

import _Main_.Menu_Temas;
import java.util.Scanner;
import static _Main_.Principal.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Test_ProgramacionMultimediaDispositivosMoviles {
    
    public static void Pro_Mul_Dis_Mov() {
        
        Menu_Temas.setTema_01("FUNDAMENTOS DE APLICACIONES MÓVILES.");
        Menu_Temas.setTema_02("CONSTRUCCIÓN DE PROYECTOS ANDROID.");
        Menu_Temas.setTema_03("PROGRAMACIÓN EN ANDROID I.");
        Menu_Temas.setTema_04("PROGRAMACIÓN EN ANDROIS II: LAYOUTS.");
        Menu_Temas.setTema_05("PROGRAMACIÓN EN ANDROIS III: BOTONES Y LISTAS.");
        Menu_Temas.setTema_06("PROGRAMACIÓN EN ANDROID IV: MULTIPANTALLA.");
        Menu_Temas.setTema_07("MULTIMEDIA Y BASES DE DATOS.");
        Menu_Temas.setTema_08("SERVICIOS EN RED I.");
        Menu_Temas.setTema_09("SERVICIOS EN RED II.");
        Menu_Temas.setTema_10("SERVICIOS EN RED III.");
        Menu_Temas.setTema_11("INTRODUCCIÓN A LOS VIDEOJUEGOS.");
        Menu_Temas.setTema_12("DESARROLLO DE VIDEOJUEGOS.");
        Menu_Temas.setTema_13("INTRODUCCIÓN AL LENGUAJE SWIFT.");
        Menu_Temas.setTema_14("PROGRAMACIÓN EN SWIFT.");
        Menu_Temas.setTema_15("INTRODUCCIÓN A MACOS Y XCODE.");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
        
        _Main_.Principal.setAsignatura("PROGRAMACIÓN MULTIMEDIA Y DISPOSITIVOS MÓVILES");
        
            String menu="";
        do {
            _Main_.Principal.reseteaNotas();
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            Menu_Temas.menu_temas();
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        _Main_.Principal.setTema(menu); 
        
            /*01*/      tipo_test("¿Qué lenguajes de programación podemos usar para programar apps para Android?", "Java y XML.", "C# y XML.", "Swfit o C#.", "Java o Kotlin y XML.", "4");
            /*02*/      tipo_test("Angular es un tipo de framework:", "Nativo.", "Híbrido.", "Web.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*03*/      tipo_test("¿En qué año creo Google Android?", "En 2005.", "Google no creó Android, sino que lo compró en 2005.", "En 2003.", "En 2000.", "2");
            /*04*/      tipo_test("La versión 4.4 de Android tiene de nombre:", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "3");
            /*05*/      tipo_test("El evento onDestroy():", "Este evento representa cuando actividad va a empezar a responder a la interacción del usuario.", "Este evento representa cuando actividad va a dejar de responder a la interacción del usuario.", "Este evento representa cuando actividad ha pasado completamente a segundo plano.", "Este evento representa cuando actividad va a ser destruida y sus recursos liberados.", "4");
            /*06*/      tipo_test("¿Qué lenguajes de programación podemos usar para programar apps para iOS?", "Java y XML.", "C# y XML.", "Swift u Objective-C.", "Java o Kotlin y XML.", "3");
            /*07*/      tipo_test("La versión Oreo de Android tiene el número:", "7.0", "8.0", "9.0", "10.0", "2");
            /*08*/      tipo_test("Android Studio es un tipo de framework:", "Nativo.", "Híbrido.", "Web.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*09*/      tipo_test("El primer estado en el ciclo de vida de una app Android es:", "onCreate.", "onStart.", "onResume.", "onDestroy.", "1");
            /*10*/      tipo_test("El evento onStart():", "Este evento representa cuando actividad va a empezar a responder a la interacción del usuario.", "Este evento representa cuando actividad va a dejar de responder a la interacción del usuario.", "Este evento representa cuando actividad ha pasado completamente a segundo plano.", "Ninguna de las respuestas anteriores es correcta.", "4");                        
                    }
                    case "2" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("¿Cuál es el entorno de desarrollo para desarrollar apps Android de Google?", "NetBeans.", "Eclipse.", "Android Studio.", "XCode.", "3");
            /*02*/      tipo_test("¿Cuántos emuladores distintos podemos crear en Android Studio?", "Solo uno.", "Todos los que queramos, pero son sistema operativo diferente.", "Todos los que queramos, independientemente del dispositivo y sistema operativo elegido.", "Todos los que queramos, pero solo podremos usar uno a la vez.", "3");
            /*03*/      tipo_test("¿Cuál de las siguientes no es una capa de la estructura del sistema operativo Android?", "Bibliotecas.", "Núcleo Linux.", "Interfaz de usuario.", "Aplicaciones.", "3");
            /*04*/      tipo_test("Android Studio nos permite crear proyectos de:", "Únicamente de Android.", "De Android y de XCode.", "De Java y de Android.", "De XML y de Android.", "1");
            /*05*/      tipo_test("¿Cuál de las siguiente no es una forma válida de ejecutar una app Android?", "En un emulador integrado de Android Studio.", "Por consola.", "En un emulador de terceros.", "En un dispositivo físico.", "2");
            /*06*/      tipo_test("Las actividades Android se dividen en:", "Código en Java e interfaz gráfica en Java.", "Código en Kotlin e interfaz gráfica en Java.", "Código en Java e interfaz gráfica en XML.", "Código en XML e interfaz gráfica en Kotlin.", "3");
            /*07*/      tipo_test("¿Cuántas actividades podrá tener nuestra app Android?", "Solamente una, la actividad principal.", "Todas las que necesitemos, sin límite.", "La actividad principal y únicamente otra más para realizar operaciones.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*08*/      tipo_test("¿Cuáles son los temas que ofrece Android Studio?", "Únicamente tema claro.", "Únicamente tema oscuro.", "Tema claro, oscuro e intermedio.", "Tanto tema claro como tema oscuro.", "4");
            /*09*/      tipo_test("A la hora de ejecutar una app Android,\n        ¿en cuántos dispositivos podremos ejecutarla a la vez?", "En todos los que necesitemos.", "Solo en un dispositivo físico.", "Como máximo en un emulador y en un dispositivo físico.", "Android Studio no ofrece la posibilidad de ejecutar una app en varios dispositivos al mismo tiempo.", "1");
            /*10*/      tipo_test("¿A qué pestaña de configuración hemos de ir para configurar nuestro dispositivo físico\n        para que pueda depurar apps en Android Studio?", "Opciones de red.", "Opciones de desarrollador.", "Opciones de depuración.", "Más opciones.", "2");
                    }
                    case "3" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿En qué fichero se encuentran los textos de un proyecto en Android Studio?", "colors.xml", "drawables.xml", "strings.xml", "styles.xml", "3");
            /*02*/      tipo_test("¿Cuál de los siguientes directorios de recursos no existe?", "res/values/strings.xml", "res/values/configuration.xml", "res/values/styles.xml", "res/values/colors.xml", "2");
            /*03*/      tipo_test("La resolución de pantalla de un smartphone es:", "La cantidad de píxeles de la pantalla tanto en horizontal como en vertical.", "Lo que mide la pantalla en horizontal.", "Lo que mide la pantalla en vertical.", "Lo que mide la pantalla en horizontal multiplicado por lo que mide en vertical.", "1");
            /*04*/      tipo_test("¿En qué lenguaje se codifican los recursos?", "En Java.", "En Kotlin.", "En XML.", "En C++.", "3");
            /*05*/      tipo_test("¿En qué fichero se encuentran los estilos definidos de un proyecto en Android Studio?", "res/values/colors.xml", "res/values/drawables.xml", "res/values/strings.xml", "res/values/styles.xml", "4");
            /*06*/      tipo_test("¿A cuántos idiomas puedo traducir una app Android?", "A todos los que necesite.", "Como máximo a 5 idiomas diferentes.", "Como mínimo tendrá que estar en inglés y en otro idioma.", "Como máximo a 5 idiomas diferentes y uno tendrá que ser obligatoriamente el inglés.", "1");
            /*07*/      tipo_test("¿En qué fichero se encuentran los colores definidos de un proyecto en Android Studio?", "res/values/colors.xml", "res/values/rawables.xml", "res/values/strings.xml", "res/values/styles.xml", "1");
            /*08*/      tipo_test("¿Cuál es el código para traducir una app al francés?", "Es.", "En.", "Fr.", "De.", "3");
            /*09*/      tipo_test("¿Dónde se encuentran las imágenes de un proyecto Android Studio?", "res/values", "res/drawables", "res/layout", "res/images", "2");
            /*10*/      tipo_test("Si voy a traducir una app con el código cs, ¿a qué idioma la estoy traduciendo?", "Castellano.", "Checo.", "Checheno.", "Catalán.", "2");                        
                    }
                    case "4" -> {
                        _Main_.Principal.setTema(menu);                      
                        
            /*01*/      tipo_test("¿De qué clase hereda ScrollView?", "LinealLayout", "TableLayout", "FrameLayout", "ConstraintLayout", "3");
            /*02*/      tipo_test("La propiedad android:layout_width:", "Esta propiedad va a definir el tamaño del alto del elemento.", "Esta propiedad nos indica que el elemento mida lo mismo que su contenedor.", "Esta propiedad nos indica que el elemento mida lo justo y necesario.", "Esta propiedad va a definir el tamaño del ancho del elemento.", "4");
            /*03*/      tipo_test("Cuando implementamos Tabs tenemos que utilizar como contenedor:", "TabLayout.", "TabSpec.", "TabWidget.", "TabContent.", "1");
            /*04*/      tipo_test("El atributo android:stretchColumns:", "Indicará las columnas que pueden expandir para absorber el espacio libre dejado por las\n    demás columnas a la derecha de la pantalla.", "Indicará las columnas que se pueden contraer para dejar espacio al resto de columnas\n    que se puedan salir por la derecha de la pantalla.", "Indicará que las columnas tendrán el mismo ancho.", "Indicará las columnas de la tabla que se quieren ocultar completamente.", "1");
            /*05*/      tipo_test("La propiedad match_parent:", "Esta propiedad va a definir el tamaño del alto del elemento.", "Esta propiedad nos indica que el elemento mida lo mismo que su contenedor.", "Esta propiedad nos indica que el elemento mida lo justo y necesario.", "Esta propiedad va a definir el tamaño del ancho del elemento.", "2");
            /*06*/      tipo_test("El atributo android:collapseColumns:", "Indicará las columnas que pueden expandir para absorber el espacio libre dejado por las\n    demás columnas a la derecha de la pantalla.", "Indicará las columnas que se pueden contraer para dejar espacio al resto de columnas\n    que se puedan salir por la derecha de la pantalla.", "Indicará que las columnas tendrán el mismo ancho.", "Indicará las columnas de la tabla que se quieren ocultar completamente.", "4");
            /*07*/      tipo_test("La propiedad android:layout_height:", "Esta propiedad va a definir el tamaño del alto del elemento.", "Esta propiedad nos indica que el elemento mida lo mismo que su contenedor.", "Esta propiedad nos indica que el elemento mida lo justo y necesario.", "Esta propiedad va a definir el tamaño del ancho del elemento.", "1");
            /*08*/      tipo_test("¿Está permitida la anidación de Layouts?", "Si, pero tienen que ser el mismo tipo de Layout.", "No, no está permitido.", "Si, no hay restricciones en cuanto al anidamiento.", "No se puede, ya que consume muchos recursos.", "3");
            /*09*/      tipo_test("El atributo android:shrinkColumns:", "Indicará las columnas que pueden expandir para absorber el espacio libre dejado por las\n    demás columnas a la derecha de la pantalla.", "Indicará las columnas que se pueden contraer para dejar espacio al resto de columnas\n    que se puedan salir por la derecha de la pantalla.", "Indicará que las columnas tendrán el mismo ancho.", "Indicará las columnas de la tabla que se quieren ocultar completamente.", "2");
            /*10*/      tipo_test("La propiedad wrap_content:", "Esta propiedad va a definir el tamaño del alto del elemento.", "Esta propiedad nos indica que el elemento mida lo mismo que su contenedor.", "Esta propiedad nos indica que el elemento mida lo justo y necesario.", "Esta propiedad va a definir el tamaño del ancho del elemento.", "3");                        
                    }
                    case "5" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("RecyclerView.Adapter:", "Representa un adaptador que gestionará cómo se mostrarán los elementos en pantalla.", "Se encargará de la gestión de la memoria.", "Se utiliza para añadir decoraciones.", "Todas las opciones son correctas.", "1");
            /*02*/      tipo_test("El método onCreateViewHolder:", "Hereda de RecyclerView.ViewHolder que representará un elemento de la lista.", "Obtendrá la interfaz gráfica de los elementos de la lista.", "Mostrará los datos de los elementos de la lista. ", "Devolverá los elementos que tendrá la lista. ", "2");
            /*03*/      tipo_test("¿Qué elementos se pueden agregar a un RadioGroup?:", "CheckBox.", "EditText.", "Button.", "RadioButton.", "4");
            /*04*/      tipo_test("Si quiero activar mediante código un CheckBox que se llama cb1 tengo que poner:", "cb1.setChecked(true);", "cb1.setChecked(false);", "cb1.isChecked();", "cb1.setText(true);", "1");
            /*05*/      tipo_test("¿Dónde se deben almacenar los valores a mostrar en un Spinner?", "En el fichero colors.xml.", "En el fichero strings.xml en un elemento array.", "En el fichero strings.xml en varios elementos string.", "Se deben poner directamente en código sin almacenarlos en ningún sitio.", "2");
            /*06*/      tipo_test("El método getItemCount:", "Hereda de RecyclerView.ViewHolder que representará un elemento de la lista.", "Obtendrá la interfaz gráfica de los elementos de la lista.", "Mostrará los datos de los elementos de la lista.", "Devolverá la cantidad de elementos que tiene la lista.", "4");
            /*07*/      tipo_test("¿Qué ocurrirá si no ligamos un objeto con su elemento gráfico con findViewById?", "Nada, funcionará igual.", "Nada, solo que el elemento no tendrá funcionalidad.", "La app se cerrará con un fallo de NullPointerException.", "La app se cerrará con un fallo de FindIdException.", "3");
            /*08*/      tipo_test("Si queremos introducir en un TextView una contraseña, utilizaremos en el atributo\n        android:inputType el valor:", "\"text\"", "\"textPassword\"", "\"number\"", "\"phone\"", "2");
            /*09*/      tipo_test("¿Qué interfaz deberemos implementar para dar funcionalidad a un Button?", "View.OnClickListener", "Button.OnClickListener", "View.OnClickButtonListener", "View.OnButtonClickListener", "1");
            /*10*/      tipo_test("¿Podemos saber qué RadioButton está activo dentro de un grupo?", "No, en los grupos se introducen CheckBox.", "Si.", "Si, pero solo si la cantidad de RadioButton que hay en el grupo es par.", "Si, pero solo si la cantidad de RadioButton que hay en el grupo es impar.", "2");                        
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("El atributo android:id de los menús:", "Es el identificador único del menú.", "Es el icono que aparecerá en el menú desplegable junto al menú.", "Es el texto que aparecerá en el menú desplegable junto al icono. Deberá ir en strings.xml. ", "Los menús no tienen id, eso son los objetos gráficos.", "1");
            /*02*/      tipo_test("¿Qué atributo de un menú deberemos configurar si queremos que este se oculte?", "Hidden.", "Visible.", "Show.", "NotHidden.", "2");
            /*03*/      tipo_test("¿Desde dónde podremos acceder a las preferencias de la app?", "Solo desde la pantalla de SettingsActivity.", "Solo desde un objeto del tipo SharedPreferences.", "Las preferencias una vez creadas no son accesibles. ", "Desde cualquier punto de la aplicación.", "4");
            /*04*/      tipo_test("El atributo android:title de los menús:", "Es el identificador único del menú.", "Es el icono que aparecerá en el menú desplegable junto al menú.", "Es el texto que aparecerá en el menú desplegable junto al icono. Deberá ir en strings.xml. ", "Es el título de la pantalla donde estarán los menús.", "3");
            /*05*/      tipo_test("El modo de acceso de las preferencias MODE_PRIVATE:", "Sólo nuestra aplicación tiene acceso a estas preferencias.", "Todas las aplicaciones pueden leer estas preferencias, pero sólo la nuestra puede modificarlas.", "Todas las aplicaciones pueden leer y modificar estas preferencias.", "Ninguna de las respuestas anteriores es correcta.", "1");
            /*06*/      tipo_test("El atributo android:icon de los menús:", "Es el identificador único del menú.", "Es el icono que aparecerá en el menú desplegable junto al menú.", "Es el texto que aparecerá en el menú desplegable junto al icono. Deberá ir en strings.xml. ", "Es el título de aplicación.", "2");
            /*07*/      tipo_test("El modo de acceso de las preferencias MODE_WORLD_READABLE:", "Sólo nuestra aplicación tiene acceso a estas preferencias.", "Todas las aplicaciones pueden leer estas preferencias, pero sólo la nuestra puede modificarlas.", "Todas las aplicaciones pueden leer y modificar estas preferencias.", "Ninguna de las respuestas anteriores es correcta.", "2");
            /*08*/      tipo_test("¿Cómo se llama la pantalla de carga de las apps?", "SplashScreen.", "LoadScreen.", "TimeScreen.", "LoadingScreen.", "1");
            /*09*/      tipo_test("Con un Intent podemos:", "Lanzar una hebra.", "Liberar el espacio de memoria de la app cuando se cierre.", "Cambiar el estilo de una caja de texto.", "Ir a otra pantalla.", "4");
            /*10*/      tipo_test("El modo de acceso de las preferencias MODE_WORLD_WRITABLE:", "Sólo nuestra aplicación tiene acceso a estas preferencias.", "Todas las aplicaciones pueden leer estas preferencias, pero sólo la nuestra puede modificarlas.", "Todas las aplicaciones pueden leer y modificar estas preferencias.", "Ninguna de las respuestas anteriores es correcta.", "3");                        
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿Qué método de la clase SQLiteOpenHelper es el que hay que sobrescribir para que\n        actualice automáticamente la base de datos?", "onCreate()", "delete()", "onUpgrade()", "Hay que crear un método propio.", "3");
            /*02*/      tipo_test("¿Cómo podemos insertar valores en una tabla?", "Únicamente mediante el método insert.", "Únicamente ejecutando la consulta INSERT con el método execSQL.", "Únicamente con el método rawQuery.", "Podremos ejecutarlas mediante el método insert o mediante el método execSQL,\n    aunque es más recomendable el primero.", "4");
            /*03*/      tipo_test("Para reproducir un sonido corto utilizaremos:", "La clase SoundPool.", "La clase MediaPlayer.", "Ninguna de las dos clases.", "Ambas clases.", "1");
            /*04*/      tipo_test("Cuando utilizamos un objeto de la clase MediaPlayer, después de llamar al método\n        stop deberemos llamar al método:", "Play.", "Stop de nuevo.", "Release.", "Pause.", "3");
            /*05*/      tipo_test("¿Qué gestor de bases de datos podemos utilizar en Android?", "MySQL.", "Microsoft SQL Server.", "SQLite.", "MongoDB.", "3");
            /*06*/      tipo_test("¿Cuál de las siguientes opciones no podremos ejecutarla en nuestra base de\n        datos de nuestra app Android?", "Inserción de valores.", "Consulta de valores.", "Actualización de valores.", "Podremos realizarlas todas.", "4");
            /*07*/      tipo_test("Para realizar una operación de inserción de datos deberemos llamar al método:", "getWritableDatabase.", "getReadableDatabase.", "getInsertableDatabase.", "getModificableDatabase.", "1");
            /*08*/      tipo_test("Para insertar valores en un objeto del tipo ContentValues:", "Debemos ir insertando valor a valor con el método insert.", "Deberemos insertarle un array con todos los valores como String.", "Deberemos insertarle un objeto clave-valor compuesto por el nombre de la columna y su\n    valor con el método put.", "Para insertar datos no debemos usar un objeto de tipo ContentValues.", "3");
            /*09*/      tipo_test("¿Es posible ordenar los valores de una consulta de datos?", "Si, pero solo si usamos el método rawQuery.", "Si, pero solo si utilizamos el método execSQL.", "Si.", "No.", "3");
            /*10*/      tipo_test("Para realizar una operación de consulta de datos deberemos llamar al método:", "getWritableDatabase.", "getReadableDatabase.", "getInsertableDatabase.", "getModificableDatabase.", "2");                        
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La etiqueta de cierre de php es:", "php?", "¿>", "?>", "php/>", "3");
            /*02*/      tipo_test("¿Cuál es la instrucción que permite mostrar datos por pantalla en PHP?", "System.out.println.", "echo.", "cout.", "print.", "2");
            /*03*/      tipo_test("PHP es un lenguaje que se ejecuta en:", "En la parte backend del proyecto.", "En la parte frontend del proyecto.", "Ambas respuestas son correctas.", "Ninguna de las respuestas es correcta.", "1");
            /*04*/      tipo_test("¿Cuál de las siguientes variables de tipo numérico está declarada de forma correcta?", "$total = 3;", "$total = \"3\";", "total = 3;", "total = \"3\";", "1");
            /*05*/      tipo_test("¿En qué debe terminar cada sentencia de php?", "Punto y coma.", "Punto.", "No hace falta nada.", "Una llave }.", "1");
            /*06*/      tipo_test("¿Con qué podemos realizar las comunicaciones en una aplicación?", "JSON.", "XML.", "JSON y XML.", "PHP.", "3");
            /*07*/      tipo_test("¿Con cuál de estos caracteres marca una línea como comentario?", "@", "//", ";", "Ninguna de las opciones es correcta.", "2");
            /*08*/      tipo_test("¿Cuál de los siguientes tipos de datos no los soporta JSON?", "Enteros.", "Boolean.", "Array.", "Pilas.", "4");
            /*09*/      tipo_test("Los arrays en JSON se delimitan mediante:", "{ }", "\" \"", "[ ]", "< >", "3");
            /*10*/      tipo_test("Para poder trabajar con nuestro servidor local en XAMPP deberemos activar las\n        casillas de:", "Únicamente Apache.", "Apache y MySQL.", "Únicamente MySQL.", "Tomcat y MySQL.", "2");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La parte de backend de un proyecto es:", "La parte que corresponde a la aplicación Android.", "La parte que corresponde a la interfaz gráfica de la aplicación Android.", "La parte que corresponde al servidor.", "La parte que corresponde a la base de datos del servidor.", "3");
            /*02*/      tipo_test("Con el método getJSONObjectFromUrl obtendremos un objeto de la clase:", "JSONArray.", "JSONObject.", "ArrayList.", "HashMap.", "2");
            /*03*/      tipo_test("El puerto utilizado en las conexiones HTTPS es:", "443.", "444.", "344.", "333.", "1");
            /*04*/      tipo_test("Una API REST puede comunicarse en:", "Únicamente en JSON.", "Únicamente en XML.", "Tanto en JSON como en PHP.", "Únicamente en HTML.", "3");
            /*05*/      tipo_test("¿Cuál de los siguientes permisos tiene que ver con el acceso a internet?", "READ_PHONE_STATE.", "WRITE_EXTERNAL_STORAGE.", "ADD_VOICEMAIL.", "ACCESS_NETWORK_STATE.", "4");
            /*06*/      tipo_test("Las peticiones HTTPS en Android:", "Se pueden hacer con el método getHTTP y getHTTPS.", "Se ejecutarán en un hilo aparte.", "No necesitan de ningún permiso especial para su ejecución.", "Todas las respuestas anteriores son correctas.", "2");
            /*07*/      tipo_test("La biblioteca Volley:", "Nos permite obtener JSON de una forma sencilla.", "Nos permite subir ficheros a nuestro servidor de una forma sencilla.", "Viene integrada directamente en la JDK de Android.", "Puede lazar la excepción IndexOfBoundException.", "1");
            /*08*/      tipo_test("La parte de frontend de un proyecto es:", "a parte que corresponde a la aplicación Android.", "La parte que corresponde a la interfaz gráfica de la aplicación Android.", "La parte que corresponde al servidor, incluyendo PHP y MySQL.", "La parte que corresponde a la base de datos del servidor. ", "1");
            /*09*/      tipo_test("El servicio Web con el que accederemos a la parte de la base de datos está formado\n        por:", "Aplicaciones HTTP.", "Ficheros PHP.", "ArrayList de JSON.", "El backend de nuestra aplicación.", "2");
            /*10*/      tipo_test("Si queremos obtener un array de una petición HTTP deberemos utilizar un objeto:", "JSONArray.", "JSONObject.", "ArrayList.", "HashMap.", "1");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Si queremos que nuestro mapa muestre normal con carreteras, debemos configurarlo con:", "GoogleMap.MAP_TYPE_NORMAL.", "GoogleMap.MAP_TYPE_SATELLITE.", "GoogleMap.MAP_TYPE_HYBRID.", "GoogleMap.MAP_TYPE_TERRAIN.", "1");
            /*02*/      tipo_test("¿En qué año creó Google Google Maps?", "2003.", "2004.", "2005.", "2006.", "2");
            /*03*/      tipo_test("La API que nos permitirá utilizar Google Maps en Android es:", "Maps SKD for iOS.", "Maps SKD for Android.", "Maps JavaScript API.", "Directions API.", "2");
            /*04*/      tipo_test("Si queremos que nuestro mapa muestre imágenes por satélite, debemos configurarlo con:", "GoogleMap.MAP_TYPE_NORMAL.", "GoogleMap.MAP_TYPE_SATELLITE.", "GoogleMap.MAP_TYPE_HYBRID.", "GoogleMap.MAP_TYPE_TERRAIN.", "2");
            /*05*/      tipo_test("¿Cuál es el precio de una licencia de desarrollador de aplicaciones de Google?", "25 dólares de por vida.", "25 dólares al mes.", "25 dólares cada seis meses.", "25 dólares al año.", "1");
            /*06*/      tipo_test("La API que nos permitirá utilizar Gmail es:", "Gmail API.", "API for Gmail.", "Gmail for Android.", "Google no nos permite utilizar su servicio de Gmail.", "1");
            /*07*/      tipo_test("Si queremos que nuestro mapa muestre un mapa topográfico, debemos configurarlo con:", "GoogleMap.MAP_TYPE_NORMAL.", "GoogleMap.MAP_TYPE_SATELLITE.", "GoogleMap.MAP_TYPE_HYBRID.", "GoogleMap.MAP_TYPE_TERRAIN.", "4");
            /*08*/      tipo_test("La API que nos permitirá utilizar Google Maps en iOS es:", "Maps SKD for iOS.", "Maps SKD for Android.", "Maps JavaScript API.", "Directions API.", "1");
            /*09*/      tipo_test("Si queremos que nuestro mapa muestre una mezcla de imágenes por satélite y\n        carretera, debemos configurarlo con:", "GoogleMap.MAP_TYPE_NORMAL.", "GoogleMap.MAP_TYPE_SATELLITE.", "GoogleMap.MAP_TYPE_HYBRID.", "GoogleMap.MAP_TYPE_TERRAIN.", "3");
            /*10*/      tipo_test("¿Cuál de los siguientes no es un servicio que nos ofrece Google mediante una API?", "Google Maps.", "YouTube.", "Chrome.", "FireBase.", "3");                       
                    }
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿En qué año se lanzó la primera PlayStation?", "1990.", "1991.", "1992.", "1994.", "4");
            /*02*/      tipo_test("¿Cuál de los siguientes problemas podría resolver el motor de físicas?", "Dibujar un círculo en la pantalla.", "Producir un sonido cuando el personaje muere.", "Detectar una colisión entre nuestro personaje y un enemigo.", "Cambiar la dirección de movimiento de nuestro personaje.", "3");
            /*03*/      tipo_test("¿Cuál de las siguientes características no es apropiada que la ofrezca un videojuego?", "Debe ser divertido.", "No debe informar al usuario de las consecuencias de sus acciones.", "Debe haber al menos un jugador.", "Debe ofrecer un sistema de movimiento fluido.", "2");
            /*04*/      tipo_test("¿Qué es un NPC en un videojuego?", "Es el jefe final del videojuego.", "Otro jugador que juega con nosotros en modo online.", "Un personaje del videojuego con el que podremos interactuar, pero no jugar.", "Son los enemigos básicos de un videojuego.", "3");
            /*05*/      tipo_test("¿Cuál de las siguientes partes no pertenece a un videojuego?", "El motor.", "El controlador gráfico.", "El código del videojuego.", "Los recursos.", "2");
            /*06*/      tipo_test("¿Cuál de los siguientes juegos es 2D?", "Plants vs Zombies.", "Uncharted.", "Darksiders.", "GTA V.", "1");
            /*07*/      tipo_test("¿Cuál de las siguientes crees que es una ventaja de desarrollar videojuegos para\n        videoconsolas frente a PC?", "Suelen tener una gran cantidad de memoria RAM.", "Su hardware no se puede ampliar.", "Se pueden jugar a juegos multijugador.", "Podemos ampliar su memoria RAM de una forma muy sencilla.", "2");
            /*08*/      tipo_test("¿Cuál de los siguientes no es una categoría válida de videojuegos?", "Videojuegos de rol.", "Videojuegos de acción.", "Videojuegos de estrategia.", "Videojuegos de organización.", "4");
            /*09*/      tipo_test("¿A partir de qué se ha podido desarrollar un motor de videojuegos?", "DirectX.", "DirectY.", "DirectZ.", "DirectW.", "1");
            /*10*/      tipo_test("¿Qué son los Sprites?", "Son la forma de representación de los personajes que utilizan los motores 2D.", "Son la forma de representación de los personajes que utilizan los motores 3D.", "Las dos respuestas son correctas.", "Las dos respuestas son incorrectas.", "1");                       
                    }
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿De qué clase tendremos que hacer que herede nuestra pantalla del videojuego?", "Canvas.", "CanvasDraw.", "SurfaceView.", "CanvasView.", "3");
            /*02*/      tipo_test("¿Cuántas coordenadas tienen los vectores que se necesitan en un videojuego 3D?", "2.", "3.", "4.", "1.", "2");
            /*03*/      tipo_test("En un videojuego 2D, ¿cómo se representan los personajes?", "Mediante Sprites.", "Mediante imágenes individuales de cada movimiento del personaje.", "Mediante modelos.", "Todas las respuestas son correctas.", "1");
            /*04*/      tipo_test("¿Qué significa FPS?", "File Per Sprite.", "Fichero Para Sprite.", "Frames Por Segundo.", "Ninguna de las respuestas es correcta.", "3");
            /*05*/      tipo_test("¿Hacia dónde podremos mover nuestro personaje en un videojuego 2D?", "Hacia arriba y hacia abajo.", "Hacia la derecha y hacia la izquierda.", "Las dos respuestas son falsas.", "Las dos respuestas son ciertas.", "4");
            /*06*/      tipo_test("El Mundo en los videojuegos 3D se refiere a:", "Es la representación de un personaje creado con polígonos, vértices y mallas de polígonos.", "Es el escenario en sí mismo donde se podrán mover los personajes.", "Es el árbol que representa a los personajes.", "Ninguna de las respuestas es correcta.", "2");
            /*07*/      tipo_test("En un videojuego 3D, ¿cómo se representan los personajes?", "Mediante Sprites.", "Mediante imágenes individuales de cada movimiento del personaje.", "Mediante modelos.", "Todas las respuestas son correctas.", "3");
            /*08*/      tipo_test("¿Qué se producen cuando 2 Sprites en un videojuego 2D se cruzan?", "Se producirá un error NullPointerException.", "Se producirá una colisión.", "No se producirá nada, se pintará uno encima de otro.", "Se producirá un error IllegalMovimientException.", "2");
            /*09*/      tipo_test("¿Es posible utilizar una imagen para un fondo de un videojuego 2D\n        que no ocupe toda la pantalla del dispositivo?", "No, el motor mostrará un error BackgrounException.", "Si, pero solo se pintará en el trozo que ocupe.", "Si, podemos pintar la imagen tantas veces como necesitemos hasta rellenar toda la pantalla.", "No, las imágenes de fondo deberán medir exactamente lo mismo que la pantalla,\n    por lo que tendremos que tener la misma imagen para varios tamaños de pantallas.", "3");
            /*10*/      tipo_test("¿Cuál es la forma correcta de pausar un videojuego 2D?", "Pausando el motor, ya que será el encargado de que se actualice la pantalla.", "Parando elemento a elemento del videojuego.", "Parando solamente a los personajes y a los enemigos,\n    ya que el fondo puede seguir pintándose porque no va a cambiar.", "Ninguna de las respuestas es correcta.", "1");                        
                    }
                    case "13" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Dado el siguiente código, ¿Qué tipo tendrá número?\n        let numero = 8.2", "Bool.", "Double.", "El código no compila.", "Decimal.", "2");
            /*02*/      tipo_test("Al ejecutar el siguiente código, ¿qué valor contendrá tercera?\n        let primera = [\"A\",\"B\"]\n        let segunda = [\"C\",\"D\"]\n        let tercera = primera + segunda", "\"A\",\"B\"", "\"A\",\"B\",\"C\",\"D\"", "\"A\",\"C\",\"B\",\"D\"", "No es posible sumar dos arrays.", "2");
            /*03*/      tipo_test("¿Qué contendrá miTexto al ejecutar este código?\n        let miTexto: String\n        miTexto = \"hola\"", "Al ejecutar la aplicación se lanzará un error.", "nil.", "\"hola\".", "El código no compila.", "3");
            /*04*/      tipo_test("¿Cuántos elementos tendrá el array de números al ejecutar el código?\n        var numeros = [1, 2, 3]\n        numeros += [4]", "4.", "3.", "1.", "El código dará error.", "1");
            /*05*/      tipo_test("Al ejecutar el siguiente código, ¿Cuántos elementos contendrá el array?\n        let nombres: [String] = [ ]\n        nombres.append(\"Mabel\")\n        nombres.append(\"Clara\")\n        nombres.append(\"Rodrigo\")", "1", "3", "El código dará un error de compilación.", "0.", "3");
            /*06*/      tipo_test("¿Es posible incrementar en una sola unidad una variable en Swift utilizando un\n        operador de Incremento clásico?", "Si, utilizando ++1.", "No, es necesario utilizar +=1.", "Solo si activamos el modo de compatibilidad con C.", "Si, Swift viene de C y podemos utilizar ++.", "2");
            /*07*/      tipo_test("En un caso en el que desconocemos el valor de una variable opcional.\n        ¿Qué debemos hacer para acceder a dicho valor?", "Utilizar el operador '!'.", "Forzar el desempaquetado.", "Comprobamos que sea distinto de nil antes de utilizarlo.", "Utilizar el operador de coalescencia nula.", "1");
            /*08*/      tipo_test("¿Qué aparecerá en consola al ejecutar el siguiente código?\n        var elementos: [String] = []\n        elementos.append(\"Serenity\")\n        elementos.append(\"Enterprise\")\n        elementos.append(\"TARDIS\")\n        elementos.append(\"Serenity\")\n        print(elementos.count)", "4", "0", "3", "1", "1");
            /*09*/      tipo_test("¿Qué empresa creó el lenguaje Swift?", "Microsoft.", "Oracle.", "Apple.", "Sony.", "3");
            /*10*/      tipo_test("¿Cuál es la extensión de los ficheros que tienen código Swift?", ".java", ".python", ".apple", ".swift", "4");                        
                    }
                    case "14" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿Cuántos inicializadores podremos crear en una clase en Swift?", "Solo uno.", "Podremos crear dos, uno principal y otro auxiliar.", "Podremos crear tantos como necesitemos y todos serán inicializadores normales.", "Podremos crear tantos como necesitemos, pero solo uno será inicializador, los demás\n    serán inicializadores especiales que invocarán al principal.", "4");
            /*02*/      tipo_test("¿Con cuántos valores podremos crear una tupla?", "1.", "2.", "3.", "Todos los que necesitemos.", "4");
            /*03*/      tipo_test("¿Qué ocurrirá al ejecutar el siguiente código?\n        let i = 3\n        switch i {\n            case 1:\n                print(\"Es 1\")\n            case 2:\n                print(\"Es 2\")\n            case 3:\n                print(\"Es 3\")\n        }", "Al ejecutar la aplicación se lanzará un error.", " Se mostrará por pantalla el mensaje \"Es 3\".", "El código no compila.", "Se mostrará por pantalla el mensaje \"Es 2\".", "3");
            /*04*/      tipo_test("¿Cuál de los siguientes rangos está bien declarado?", "3...10", "3..<=10", "..10", "3..10", "1");
            /*05*/      tipo_test("¿Con qué palabra definimos las funciones en Swift?", "function.", "funcion.", "func.", "Swift no soporta funciones.", "3");
            /*06*/      tipo_test("¿Cuál es el resultado de ejecutar este código?\n        var tripulacion = [\"Capitan\": \"Luis\", \"Carlos\": \"Simon\"]\n        tripulacion = [:]\n        print(tripulacion.count)", "9", "5", "0", "12", "3");
            /*07*/      tipo_test("¿Cuál será el resultado al ejecutar el siguiente código?\n        let nombres = [\"Luis\", \"Isabel\", \"David\", \"María\"]\n        if let nombre = nombres[1] {\n            print(\"Hola (nombre)\")\n        }", "El código no compila.", "Se mostrará por pantalla el mensaje \"Hola Isabel\".", "Se mostrará por pantalla el mensaje \"Hola Luís\".", "Al ejecutar la aplicación se lanzará un error.", "4");
            /*08*/      tipo_test("¿Cuál es el resultado al ejecutar este código?\n        func decirHola(a nombre: String) -> String {\n            return \"Hola (nombre)!\"\n        }\n        print(\"(decirHola(a: \"Francis\"))\")", "Se mostrará por pantalla el mensaje \"Hola (Francis)\".", "El código no compila.", "Se mostrará por pantalla el mensaje \"Hola Francis\".", "Al ejecutar la aplicación se lanzará un error.", "4");
            /*09*/      tipo_test("¿Qué ocurrirá al ejecutar este código?\n        class Caballero {\n            var nombre: String\n            override init(nombre: String) {\n                nombre = nombreInicial\n            }\n        }\n        let caballero = Caballero(nombre: \"Artorias\")\n        print(caballero.nombre)", "El código no compila.", "Mostrará por pantalla el mensaje \"\".", "Mostrará por pantalla el mensaje \"Artorias\".", "nil.", "1");
            /*10*/      tipo_test("func suma(numeros: Int...) -> Int {\n            var resultado = 0\n            for numero in numeros {\n                result += numero\n            }\n            return resultado\n        }\n        let resultado = suma(numbers: [1, 2, 3, 4, 5])", "15", "1,2,3,4,5", "0", "El código no compila.", "4");                        
                    }
                    case "15" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("¿Cuál de los siguientes no fue uno de los fundadores de Apple?", "Steve Jobs.", "Steve Wozniak.", "Bill Gates.", "Ron Wayne.", "3");
            /*02*/      tipo_test("¿Cuál de los siguientes no fue un ordenador desarrollado por Apple?", "Apple I.", "Apple II.", "Apple III.", "Apple X.", "4");
            /*03*/      tipo_test("¿En qué fecha salió al mercado iOS 7?", "Septiembre 2012.", "Junio 2013.", "Septiembre 2014.", "Septiembre 2015.", "2");
            /*04*/      tipo_test("¿Cuál es el número de versión de Mac OS X El Capitán?", "10.9", "10.10", "10.11", "10.12", "3");
            /*05*/      tipo_test("¿Cuál de las siguientes no es una versión de Mac OS X válida?", "10.17", "10.15", "10.10", "10.8", "1");
            /*06*/      tipo_test("¿Cuál de los siguientes no es un sistema operativo de Apple?", "Mac OS X Snow Leopard.", "Mac OS X Black Panter.", "Mac OS X Catalina.", "Mac OS X Lion.", "2");
            /*07*/      tipo_test("¿Cuál es el número de versión de Mac OS X Lion?", "10.7", "10.10", "10.11", "10.12", "1");
            /*08*/      tipo_test("¿En qué año apareció el primer Macintosh?", "1979.", "1980.", "1981.", "1990.", "2");
            /*09*/      tipo_test("¿Cuál es la API de desarrollo interna del sistema operativo Mac?", "Cocoa Touch.", "Cocoa Untouch.", "Coffe Touch.", "Chocolat Touch.", "1");
            /*10*/      tipo_test("¿Cuál es el número de versión de Mac OS X Mountain Lion?", "10.9", "10.10", "10.8", "10.12", "3");                        
                    }
                    case "40" -> ProgramacionMultimediaDispositivosMoviles.Test_Rep_I_Pro_Mul_Dis_Mov.test_Repaso();
                    case "50" -> ProgramacionMultimediaDispositivosMoviles.Test_Rep_II_Pro_Mul_Dis_Mov.test_Repaso();
                    
                    case "0" -> {}
                    default -> miDefault();
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));
    }    
}