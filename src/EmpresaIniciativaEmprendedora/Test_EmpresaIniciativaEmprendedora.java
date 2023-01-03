package EmpresaIniciativaEmprendedora;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Test_EmpresaIniciativaEmprendedora {
    
    public static void Emp_Ini_Emp() {
        
        Menu_Temas.setTema_01("LA INICIATIVA EMPRENDEDORA.");
        Menu_Temas.setTema_02("FACTORES CLAVES EN EL EMPRENDIMIENTO.");
        Menu_Temas.setTema_03("EL EMPRESARIO.");
        Menu_Temas.setTema_04("PLAN DE EMPRESA Y CULTURA EMPRESARIAL.");
        Menu_Temas.setTema_05("LA EMPRESA: AN�LISIS DEL ENTORNO Y MERCADO.");
        Menu_Temas.setTema_06("MARKETING Y SU PLAN EN LA EMPRESA.");
        Menu_Temas.setTema_07("FORMULAS JUR�DICAS DE LAS EMPRESAS. TR�MITES DE CONSTITUCI�N Y DE ACTIVIDAD.");
        Menu_Temas.setTema_08("PLAN DE ORGANIZACI�N: ACTIVIDADES Y RECURSOS.");
        Menu_Temas.setTema_09("LA FUNCI�N DE PRODUCCI�N Y AN�LISIS DE COSTES.");
        Menu_Temas.setTema_10("CONTABILIDAD FINANCIERA.");
        Menu_Temas.setTema_11("");
        Menu_Temas.setTema_12("");
        Menu_Temas.setTema_13("");
        Menu_Temas.setTema_14("");
        Menu_Temas.setTema_15("");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
        
        _Main_.Principal.setAsignatura("EMPRESA E INICIATIVA EMPRENDEDORA");
        
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
        
            /*01*/      tipo_test("El conjunto de valores y actitudes que tiene una persona para mejorar un proyecto\n        profesional, personal o social se denomina:", "Idea de negocio.", "Cultura emprendedora.", "Innovaci�n.", "Ninguna de las anteriores es correcta.", "2");
            /*02*/      tipo_test("Son aspectos que se ven beneficiados por la cultura emprendedora:", "Riqueza de un pa�s.", "Fomento del desarrollo sostenible.", "Creaci�n de empleo.", "Todas las anteriores son correctas.", "4");
            /*03*/      tipo_test("Introducir nuevas formas de promocionar un producto se denomina:", "Innovaci�n de producto.", "Innovaci�n de marketing.", "Innovaci�n de procesos.", "Innovaci�n organizacional.", "2");
            /*04*/      tipo_test("Es introducir mejoras para conseguir el bienestar de una sociedad.", "Innovaci�n de producto.", "Innovaci�n de marketing.", "Innovaci�n social.", "Innovaci�n organizacional.", "3");
            /*05*/      tipo_test("Es una afirmaci�n incorrecta sobre la idea de negocio:", "Debe ser lo m�s abstracta posible y poco cercana a la realidad.", "Debe ser rentable.", "Debe de satisfacer necesidades de la poblaci�n.", "Debe de tener alg�n valor a�adido.", "1");
            /*06*/      tipo_test("Es una t�cnica para crear una idea de negocio:", "Observaci�n del entorno.", "Darle un uso nuevo a un producto.", "Identificar un segmento de mercado atractivo.", "Todas las anteriores son correctas.", "4");
            /*07*/      tipo_test("Una idea de negocio:", "No tiene por qu� plasmarse en ning�n documento, lo importante es la idea.", "Es importante trasladarla a un documento tanto para nosotros como para posibles\n    inversores.", "Es algo opcional cuando queremos emprender.", "Ninguna de las anteriores respuestas es correcta.", "2");
            /*08*/      tipo_test("El modelo Canvas es:", "Un lienzo de propuesta de valor.", "Un mapa conceptual.", "Una forma de hacer una lista de ventajas e inconvenientes.", "Una aplicaci�n para hacer dise�o gr�fico.", "1");
            /*09*/      tipo_test("Es una afirmaci�n correcta en relaci�n a la investigaci�n comercial.", "La investigaci�n comercial no siempre es �til.", "S�lo vamos a poder encontrar informaci�n sobre lo que estamos investigando.", "Reduce los fracasos.", "Todas las anteriores son correctas.", "3");
            /*10*/      tipo_test("Es un tipo de investigaci�n comercial cuantitativo.", "Reuni�n de grupo.", "Pseudocompra.", "Encuesta.", "Todas las anteriores son correctas.", "3");                        
                    }
                    case "2" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("Las subvenciones que puedan otorgarse, por parte de la administraci�n, a los\n        emprendedores forman parte del factor:", "Familia.", "Gobierno.", "Cultura.", "Educaci�n.", "2");
            /*02*/      tipo_test("En relaci�n a la influencia que tiene la familia en la iniciativa emprendedora:", "Siempre ser� positiva.", "Siempre ser� negativa.", "Ser� positiva o negativa dependiendo del apoyo que tengamos de ellos o si resultan un\n    modelo a seguir.", "Todas las anteriores son incorrectas.", "3");
            /*03*/      tipo_test("Es una caracter�stica importante que debe tener un emprendedor.", "Pasi�n.", "Confianza en s� mismo.", "Creatividad.", "Todas son correctas.", "4");
            /*04*/      tipo_test("Si un negocio puede crecer y expandirse, podemos decir que es un emprendimiento:", "Escalable.", "Privado.", "De imitaci�n.", "P�blico.", "1");
            /*05*/      tipo_test("Si el capital de un negocio proviene de un particular sin relaci�n alguna con la\n        administraci�n p�blica, el emprendimiento ser�:", "Privado.", "P�blico.", "Escalable.", "Innovador.", "1");
            /*06*/      tipo_test("�Qu� diferencia principal tiene una asociaci�n de una empresa?", "Que la asociaci�n tiene objetivos y la empresa no.", "Que la asociaci�n debe tener m�s de tres personas y la empresa siempre ser� una �nica\n    persona la propietaria.", "El sector de actividad.", "Que una asociaci�n no tiene �nimo de lucro y una empresa s�.", "4");
            /*07*/      tipo_test("Una cooperativa se encarga:", "De asesorar a sus socios.", "De facturar la actividad de los socios.", "De ayudar a buscar clientes a sus socios.", "Todas son correctas.", "4");
            /*08*/      tipo_test("El primer paso a la hora de trabajar con colaboradores es:", "Establecer qu� personas u organizaciones pueden ayudarnos a cubrir nuestras\n    necesidades.", "Averiguar qu� necesidades tiene nuestro proyecto.", "Definir cu�l va a ser nuestro m�todo de trabajo.", "Evaluar qu� tal ha ido la colaboraci�n.", "2");
            /*09*/      tipo_test("Es una ventaja de la colaboraci�n con otros profesionales ...", "Pueden compartirse gastos.", "Pueden compartirse ideas.", "Esos colaboradores pueden convertirse en inversores.", "Todas son correctas.", "4");
            /*10*/      tipo_test("Es una afirmaci�n correcta sobre el emprendedor en Espa�a.", "M�s del 80% de los emprendedores son hombres.", "La mayor�a de los emprendedores no tienen ning�n tipo de estudios.", "Gran parte de los emprendedores tienen alg�n estudio relacionado con el\n    emprendimiento.", "Todas las anteriores son correctas.", "3");
                    }
                    case "3" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Es la persona al mando de una empresa u organizaci�n que gestiona y toma las\n        decisiones para la misma como empleado, no como propietario:", "Emprendedor.", "Directivo.", "Socio.", "Inversor.", "2");
            /*02*/      tipo_test("Es la persona que aporta capital a la empresa para obtener ganancias, pero no\n        intervienen en los procesos de toma de decisiones de la empresa.", "Emprendedor.", "Directivo.", "Socio.", "Inversor.", "4");
            /*03*/      tipo_test("Es la teor�a en la que el empresario es �nicamente la persona que aporta el dinero\n        asumiendo el riesgo de no saber si tendr�a beneficios o si recuperar� ese capital:", "Teor�a cl�sica.", "Teor�a del empresario riesgo.", "Teor�a del empresario innovador.", "Teor�a del empresario l�der.", "1");
            /*04*/      tipo_test("Es la teor�a en la que la direcci�n est� compuesta por distintos, t�cnicos, cada uno\n        especialista en un �mbito concreto de la empresa.", "Teor�a cl�sica.", "Teor�a del empresario tecn�crata.", "Teor�a del empresario innovador.", "Teor�a del empresario l�der.", "2");
            /*05*/      tipo_test("La persona f�sica que realiza de forma habitual, personal, directa, por cuenta propia y\n        fuera del �mbito de direcci�n y organizaci�n de otra persona, una actividad econ�mica\n        con intenci�n de ganar dinero es:", "Emprendedor.", "Directivo.", "Empresario.", "Aut�nomo.", "4");
            /*06*/      tipo_test("Es una afirmaci�n correcta sobre el trabajador por cuenta ajena.", "Su figura est� regulada por el Estatuto de los Trabajadores entre otras normativas.", "Conlleva un coste extra, m�s all� del sueldo, para el empresario.", "Tiene una doble funci�n productiva.", "Todas las anteriores son correctas.", "4");
            /*07*/      tipo_test("Es una afirmaci�n incorrecta sobre el empresario.", "Tiene mayor poder de decisi�n que el trabajador.", "En ocasiones debe llevarse el trabajo a casa.", "Sigue una organizaci�n impuesta.", "Todas son correctas.", "3");
            /*08*/      tipo_test("De las entidades que hemos visto, son las que se agrupan entorno a un sector.", "Centro para el Desarrollo Tecnol�gico Industrial de Espa�a.", "Asociaciones profesionales sectoriales.", "C�mara de Comercio de Espa�a.", "Asociaciones de J�venes Empresarios.", "2");
            /*09*/      tipo_test("Es como se denomina al emprendedor que trabaja por cuenta ajena.", "Directivo.", "Emprendedor por cuenta ajena.", "Intraemprendedor.", "Infraemprendedor.", "3");
            /*10*/      tipo_test("�Cu�l es el porcentaje m�nimo que debe poseer un socio de una empresa para que\n        tenga que darse de alta como aut�nomo?", "El 25%.", "El 15%.", "El 20%.", "El 30%.", "1");                        
                    }
                    case "4" -> {
                        _Main_.Principal.setTema(menu);                     
                        
            /*01*/      tipo_test("La misi�n, visi�n y valores:", "Es algo complementario y poco importante dentro de una empresa.", "Es un elemento tangible de la empresa.", "Es un elemento intangible de la empresa.", "Es un elemento activo de la empresa.", "3");
            /*02*/      tipo_test("Son todas aquellas directrices y acciones destinadas a construir, difundir y mantener\n        los valores, filosof�a y personalidad de la marca tanto dentro como fuera de la\n        empresa:", "Branding.", "Cultura empresarial.", "Imagen de marca.", "Misi�n visi�n y valores.", "1");
            /*03*/      tipo_test("Sobre qu� elementos se suele enfocar la responsabilidad social corporativa:", "Trabajadores de la empresa.", "Medioambiente.", "Sociedad.", "Todas son correctas.", "4");
            /*04*/      tipo_test("Es el tipo de responsabilidad social corporativa que tiene que ver con la sociedad pero\n        no con la empresa directamente:", "Responsabilidades secundarias.", "Responsabilidades primarias.", "Responsabilidades terciarias.", "Ninguna respuesta es correcta.", "3");
            /*05*/      tipo_test("Podemos considerar los indicadores de responsabilidad social corporativa como:", "La integraci�n por parte de la empresa de acciones que mejoren la sociedad.", "La implementaci�n de los objetivos de la empresa.", "Las metodolog�as para medir la gesti�n de la responsabilidad social corporativa de la\n    empresa.", "Ninguna respuesta es correcta.", "3");
            /*06*/      tipo_test("Se�ala cu�l es la afirmaci�n correcta respecto al plan de empresa:", "Sirve para poder coordinar mejor la empresa en un futuro.", "Sirve para poder controlar y revisar lo que se haga en la empresa.", "Sirve para el reclutamiento de inversores.", "Todas son correctas.", "4");
            /*07*/      tipo_test("�Cu�ndo debe hacerse un plan de empresa?", "Todos los a�os.", "Cuando se lance un producto nuevo.", "Cuando cambiemos los precios de los productos.", "Ninguna es correcta.", "2");
            /*08*/      tipo_test("Recoge los est�ndares de calidad de nuestros productos y servicios as� como su\n        sistema de gesti�n y control:", "Plan de desarrollo.", "Plan de calidad.", "Plan de marketing.", "Misi�n, visi�n y valores.", "2");
            /*09*/      tipo_test("Los objetivos que se establecen para cumplir en 2 a�os son:", "Objetivos a medio plazo.", "Objetivos a largo plazo.", "Objetivos a corto plazo.", "Ninguna de las anteriores son correctas.", "1");
            /*10*/      tipo_test("Son los objetivos que tienen que ver con la percepci�n de los p�blicos de inter�s hacia\n        la empresa:", "Objetivos estrat�gicos.", "Objetivos generales.", "Objetivos cualitativos.", "Objetivos cuantitativos.", "3");                        
                    }
                    case "5" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Un entorno simple y est�tico con poco riesgo se denomina:", "Estable.", "Intermedio.", "Turbulento.", "Simple.", "1");
            /*02*/      tipo_test("Forma parte del macroentorno:", "Los clientes de una empresa.", "La econom�a de una regi�n.", "Los proveedores de una empresa.", "Los intermediarios de una empresa.", "2");
            /*03*/      tipo_test("El nivel educativo de la poblaci�n de una regi�n forma parte del �mbito:", "Econ�mico.", "Pol�tico.", "Social.", "Tecnol�gico.", "3");
            /*04*/      tipo_test("Los impuestos que est�n en vigor en un pa�s forma parte del �mbito:", "Pol�tico.", "Legal.", "Econ�mico.", "Social.", "2");
            /*05*/      tipo_test("La competencia dentro del DAFO es:", "Una fortaleza", "Una debilidad.", "Una oportunidad.", "Una amenaza.", "4");
            /*06*/      tipo_test("Manifiestan los desafios a los que se debe enfrentar la empresa:", "La suma de debilidades y oportunidades.", "La suma de amenazas y oportunidades.", "La suma de fortalezas y debilidades.", "La suma de fortalezas y oportunidades.", "1");
            /*07*/      tipo_test("Si nos referimos al momento en el que un usuario compra un producto hablamos de\n        segmentaci�n:", "Conductual.", "Psicogr�fica.", "Demogr�fica.", "Geogr�fica.", "1");
            /*08*/      tipo_test("Si decimos que una persona tiene un estilo de vida sedentario, nos estamos refiriendo\n        a la segmentaci�n:", "Psicogr�fica.", "Conductual.", "Geogr�fica.", "Demogr�fica.", "1");
            /*09*/      tipo_test("Si hay muchos oferentes y unos pocos demandantes, estamos hablando de:", "Competencia perfecta.", "Oligopolio.", "Oligopsonio.", "Monopolio.", "3");
            /*10*/      tipo_test("Es la estrategia de mercado que se basa en decidir cu�les son nuestros productos m�s\n        rentables y volcar m�s esfuerzos en ellos:", "Estrategia funcional.", "Estrategia posicional.", "Estrategia de cartera.", "Estrategia de segmentaci�n.", "3");                        
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Es una de las funciones del departamento de marketing:", "Gestionar la marca.", "Gestionar la responsabilidad social corporativa.", "Analizar el mercado.", "Todas las anteriores son correctas.", "4");
            /*02*/      tipo_test("Es la estrategia de marketing que se centra en las variables producto, precio,\n        promoci�n y distribuci�n:", "Marketing mix.", "Marketing operativo.", "Marketing estrat�gico.", "Marketing de atracci�n.", "1");
            /*03*/      tipo_test("Es la estrategia de marketing que se enfoca a largo plazo.", "Marketing mix.", "Marketing operativo.", "Marketing estrat�gico.", "Marketing de atracci�n.", "3");
            /*04*/      tipo_test("Cuando nos referimos del camino que hace el cliente desde que nos descubren hasta\n        que finalizan la compra estamos hablando de:", "Embudo de ventas.", "Estrategia.", "Objetivos del marketing.", "P�blico objetivo.", "1");
            /*05*/      tipo_test("Es una afirmaci�n incorrecta en relaci�n al contenido del plan de marketing:", "Es imprescindible realizar un presupuesto de acciones de marketing ya que los recursos\n    de la empresa son limitados", "Es mucho m�s importante saber qui�nes son nuestros clientes que cu�les son sus\n    motivaciones.", "Es importante conocer el entorno de la empresa.", "La misi�n, visi�n y valores deben incluirse en el plan de marketing.", "2");
            /*06*/      tipo_test("Es una l�nea de trabajo del departamento comercial de la empresa:", "Gesti�n del trabajo comercial.", "Desarrollo de los comerciales.", "Relaci�n con el consumidor.", "Todas las anteriores son correctas.", "4");
            /*07*/      tipo_test("Es la t�ctica del departamento de comunicaci�n destinada a crear relaciones estables\n        y duraderas entre las empresas y sus grupos de inter�s:", "Relaciones p�blicas.", "Publicidad.", "Marketing directo.", "Promoci�n de ventas.", "1");
            /*08*/      tipo_test("Es la t�ctica del departamento de comunicaci�n que engloba aquellas herramientas\n        encaminadas a motivar y accionar la venta inmediata del producto.", "Relaciones p�blicas.", "Publicidad.", "Marketing directo.", "Promoci�n de ventas.", "4");
            /*09*/      tipo_test("No forma parte del marketing digital:", "Publicidad en Instagram.", "Aplicaciones m�viles.", "Folletos.", "P�gina web.", "3");
            /*10*/      tipo_test("Las publicaciones (gratuitas) de una red social forman parte de:", "La publicidad digital.", "El E-mail marketing.", "Las relaciones p�blicas 2.0.", "El marketing de contenidos.", "3");
            
            
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("En esta forma jur�dica es obligatorio que los socios aporten bienes:", "Sociedad civil privada.", "Sociedad limitada.", "Sociedad an�nima.", "Comunidad de bienes.", "4");
            /*02*/      tipo_test("Las divisiones de capital de las sociedades an�nimas se denominan:", "Participaciones.", "Acciones.", "Particiones.", "Divisiones.", "2");
            /*03*/      tipo_test("Las Sociedades Limitadas:", "No deben inscribirse en el Registro Mercantil.", "Tienen 3.000 Euros de capital m�nimo inicial.", "No puede tener m�s de 5 socios.", "Tienen su capital dividido en acciones.", "2");
            /*04*/      tipo_test("No es un tr�mite que deba hacer obligatoriamente las sociedades civiles privadas:", "Realizaci�n de un contrato privado.", "Alta de los socios en el censo de empresarios, profesionales y retenedores.", "Escritura de constituci�n de la sociedad", "Solicitud del N�mero de Identificaci�n Fiscal.", "3");
            /*05*/      tipo_test("No debe hacer ning�n tr�mite de constituci�n como tal:", "Aut�nomo.", "Sociedad de Responsabilidad Limitada.", "Sociedad Cooperativa.", "Todas son correctas.", "1");
            /*06*/      tipo_test("El certificado de denominaci�n negativa consiste en:", "Que el Registro Mercantil te da un nombre para la empresa.", "Elegir el nombre de la empresa.", "Asegurarse de que no existe otra empresa con el mismo nombre.", "Elegir entre varias opciones que te da el Registro Mercantil.", "3");
            /*07*/      tipo_test("Las sociedades cooperativas:", "Deber�n inscribirse en el Registro Mercantil.", "No tienen obligaci�n de inscribirse en ning�n Registro.", "Deber�n inscribirse en el Registro de Sociedades.", "Deber�n inscribirse en el Registro de Sociedades cooperativas y laborales.", "4");
            /*08*/      tipo_test("No es un aspecto que se deba incluir en los estatutos de una sociedad:", "El n�mero de trabajadores que tiene.", "Cu�nto tiempo va a durar.", "El domicilio social de la empresa.", "El funcionamiento de la Junta General.", "1");
            /*09*/      tipo_test("Es un documento que hay que llevar a la notar�a para elaborar la escritura p�blica de\n        constituci�n de la sociedad:", "La certificaci�n negativa del nombre.", "El certificado bancario.", "Los estatutos de la sociedad.", "Todas son correctas.", "4");
            /*10*/      tipo_test("El alta en el Impuesto de Actividades Econ�micas es un tr�mite:", "Laboral.", "Fiscal.", "De actividad.", "Municipal.", "2");                        
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Es una afirmaci�n incorrecta sobre la organizaci�n de la empresa:", "No es importante saber qu� la disposici�n y orden de espacio.", "Las tareas m�s complicadas llevar�n m�s tiempo.", "Es importante saber de qu� recursos materiales disponemos.", "Ninguna de las anteriores es correcta.", "1");
            /*02*/      tipo_test("Es una funci�n del departamento de recursos humanos:", "Previsi�n del personal.", "Reclutamiento y proceso de selecci�n.", "Fomento de la satisfacci�n de la plantilla.", "Todas son correctas.", "4");
            /*03*/      tipo_test("Dentro de la ficha de descripci�n de puesto de trabajo la experiencia que debe tener\n        el trabajador pertenece al apartado:", "Descripci�n del puesto de trabajo.", "Condiciones laborales.", "Perfil profesional.", "Ninguna de las anteriores es correcta.", "3");
            /*04*/      tipo_test("Las fichas de descripci�n de puesto de trabajo deberemos hacerlas:", "Despu�s de hacer la entrevista de trabajo.", "Despu�s del reclutamiento.", "Despu�s de la preselecci�n.", "Antes del reclutamiento.", "4");
            /*05*/      tipo_test("Es cuando captamos a varios trabajadores de la empresa para hacerles un proceso de\n        selecci�n sobre un puesto que ha quedado vacante:", "Reclutamiento externo.", "Reclutamiento interno.", "Reclutamiento laboral.", "Reclutamiento empresarial.", "2");
            /*06*/      tipo_test("Es una fuente de reclutamiento externo:", "Portales de empleo.", "Curriculums de autocandidaturas.", "Referencias de empleados.", "Todas son correctas.", "4");
            /*07*/      tipo_test("El test de aptitud pertenece a la siguiente fase del proceso de selecci�n:", "Entrevista.", "Pruebas.", "Preselecci�n.", "Ninguna de las anteriores es correcta.", "2");
            /*08*/      tipo_test("Cuando hablamos de la cualificaci�n de un trabajador a corto plazo, nos referimos a:", "Desarrollo.", "Curso.", "Formaci�n.", "Prueba de selecci�n.", "3");
            /*09*/      tipo_test("Cuando un trabajador comunica a su coordinador algo relacionado con el d�a\n        a d�a en la empresa, la comunicaci�n es:", "Vertical ascendente", "Horizontal.", "Vertical descendente.", "Diagonal.", "1");
            /*10*/      tipo_test("Que otras herramientas adem�s de la formaci�n y desarrollo profesional contribuyen a\n        la productividad y motivaci�n en la empresa:", "La temporalidad de los salarios.", "La conciliaci�n de la vida laboral y familiar.", "Las barreras comunicativas.", "Ninguna es correcta.", "2");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Los costes:", "Est�n vinculados directamente a la elaboraci�n del producto.", "Forman parte del valor del producto.", "Se incorpora al activo de la empresa.", "Todas son correctas.", "4");
            /*02*/      tipo_test("Es el factor referente a todas las herramientas y maquinaria necesarias para el proceso\n        de producci�n:", "Tierra.", "Capital.", "Trabajo.", "Tecnolog�a.", "2");
            /*03*/      tipo_test("Es la etapa de la producci�n en la que se adapta el producto para la distribuci�n\n        al cliente:", "Etapa de acondicionamiento.", "Etapa de s�ntesis.", "Etapa anal�tica.", "Etapa de distribuci�n.", "1");
            /*04*/      tipo_test("Es la producci�n en la que el producto se elabora de uno en uno:", "Producci�n por lotes.", "Producci�n en masa.", "Producci�n bajo pedido.", "Producci�n continua.", "3");
            /*05*/      tipo_test("Los costes, seg�n su comportamiento se pueden clasificar en:", "Costes directos o indirectos.", "Costes fijos o variables.", "Costes marginal o medio.", "No es un criterio de clasificaci�n de costes.", "2");
            /*06*/      tipo_test("El coste total es:", "La diferencia entre los costes fijos y los costes variables.", "La multiplicaci�n entre los costes fijos y los costes variables.", "La suma de los costes fijos y los costes variables.", "La divisi�n entre los costes fijos y los costes variables.", "3");
            /*07*/      tipo_test("Para ayudar a establecer el precio de venta:", "Se puede utilizar el M�todo de Contribuci�n Marginal.", "Se puede aplicar el M�todo de Utilidad Bruta.", "No se puede aplicar ning�n m�todo.", "Las dos primeras respuestas son correctas.", "4");
            /*08*/      tipo_test("Los m�todos para establecer el precio de venta arrojan:", "El precio de venta final.", "El precio de mercado.", "Un precio de venta sugerido.", "Ninguna es correcta.", "3");
            /*09*/      tipo_test("El Margen de contribuci�n es:", "El n�mero de unidades f�sicas que representan una ganancia sobre las ventas totales.", "El porcentaje que representa una ganancia sobre el precio de venta final.", "No est� relacionado con el precio de venta.", "Todas son correctas.", "2");
            /*10*/      tipo_test("El Umbral de rentabilidad refleja:", "El n�mero de ventas, en unidades monetarias, que hace el beneficio operativo igual a cero.", "El n�mero de costes, en unidades monetarias, que hace el beneficio operativo iguala cero.", "El volumen de ventas, en unidades f�sicas, que hace el beneficio operativo igual a cero.", "El volumen de ventas, en unidades f�sicas, que hace el beneficio operativo igual a cero.", "4");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La Contabilidad Financiera:", "Permite interpretar, representar y medir los hechos econ�micos susceptibles de ser\n    registrados en un periodo de tiempo determinado.", "Muestra las relaciones econ�micas de la empresa con el mundo exterior.", "Ambas son correctas.", "Ninguna es correcta.", "3");
            /*02*/      tipo_test("La estructura econ�mica de la empresa:", "Est� formada por el conjunto de bienes y derechos que la empresa necesita para su\n    funcionamiento.", "Pone de manifiesto la inversi�n de la compa��a.", "Ambas son correctas.", "Ninguna es correcta.", "3");
            /*03*/      tipo_test("La estructura financiera de la empresa:", "Refleja el origen de los recursos de capital y con ellos las fuentes de financiaci�n de la empresa.", "Refleja el destino de los recursos de capital y con ellos las fuentes de financiaci�n de la empresa.", "Refleja el origen de los recursos de capital y con ellos las fuentes de inversi�n de la empresa.", "Refleja el destino de los recursos de capital y con ellos las fuentes de inversi�n de la empresa.", "1");
            /*04*/      tipo_test("Los estados financieros o cuentas anuales son:", "Balance, cuenta de p�rdidas y ganancias, estado de cambios de patrimonio, estado de\n    flujos de efectivo y memoria.", "Marco conceptual de la contabilidad, normas de registro y valoraci�n, cuentas anuales,\n    cuadro de cuentas, definiciones y relaciones contables.", "Activo, pasivo y patrimonio neto.", "Debe y haber.", "1");
            /*05*/      tipo_test("El cuadro de cuentas se subdivide en:", "Debe y haber.", "Balance, cuenta de p�rdidas y ganancias, estado de cambios de patrimonio, estado de\n    flujos de efectivo y memoria.", "Grupo, subgrupo, cuenta y subcuenta.", "Activo, pasivo y patrimonio neto.", "3");
            /*06*/      tipo_test("Las partes del balance son:", "Balance, cuenta de p�rdidas y ganancias, estado de cambios de patrimonio, estado de\n    flujos de efectivo y memoria.", "Marco conceptual de la contabilidad, normas de registro y valoraci�n, cuentas anuales,\n    cuadro de cuentas, definiciones y relaciones contables.", "Activo, pasivo y patrimonio neto.", "Ninguna es correcta.", "3");
            /*07*/      tipo_test("En la cuenta de p�rdidas y ganancias se recogen:", "Las ventas y los costes que ha tenido la organizaci�n durante un periodo de tiempo y\n    refleja c�mo las ventas se van convirtiendo en beneficios a medida que le vamos\n    restando los costes.", "Las ventas y los pagos que ha tenido la organizaci�n durante un periodo de tiempo y\n    refleja c�mo las ventas se van convirtiendo en beneficios a medida que le vamos\n    restando los pagos.", "Los ingresos y los gastos que ha tenido la organizaci�n durante un periodo de tiempo y\n    refleja c�mo los ingresos se van convirtiendo en beneficios a medida que le vamos\n    restando los gastos.", "Los cobros y los pagos que ha tenido la organizaci�n durante un periodo de tiempo y\n    refleja c�mo los cobros se van convirtiendo en beneficios a medida que le vamos\n    restando los pagos.", "3");
            /*08*/      tipo_test("Las Pymes y los empresarios individuales est�n obligados a presentar:", "Como m�nimo, las cuentas anuales abreviadas.", "Como m�ximo, las cuentas anuales abreviadas.", "No est�n obligados a presentar ninguna cuenta anual o estado financiero.", "No pueden presentar las cuentas anuales abreviadas.", "1");
            /*09*/      tipo_test("En el asiento contable se representa:", "El debe va a la izquierda y el haber a la derecha en el asiento contable.", "El debe va a la derecha y el haber a la izquierda en el asiento contable.", "Depende del hecho econ�mico que se est� representando.", "No existe ninguna representaci�n gr�fica establecida para el asiento contable.", "1");
            /*10*/      tipo_test("Los libros contables obligatorios son:", "Libro diario y libro de inventarios.", "Libro diario y libro mayor.", "Libro de inventarios y libro mayor.", "Libro diario y libros auxiliares.", "1");                        
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
                        EmpresaIniciativaEmprendedora.Test_Rep_I_Emp_Inc_Emp.Rep_I_Emp_Inc_Emp();
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
