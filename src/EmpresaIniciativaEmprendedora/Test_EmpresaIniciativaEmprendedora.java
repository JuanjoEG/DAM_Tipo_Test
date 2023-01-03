package EmpresaIniciativaEmprendedora;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */

public class Test_EmpresaIniciativaEmprendedora {
    
    public static void Emp_Ini_Emp() {
        
        Menu_Temas.setTema_01("LA INICIATIVA EMPRENDEDORA.");
        Menu_Temas.setTema_02("FACTORES CLAVES EN EL EMPRENDIMIENTO.");
        Menu_Temas.setTema_03("EL EMPRESARIO.");
        Menu_Temas.setTema_04("PLAN DE EMPRESA Y CULTURA EMPRESARIAL.");
        Menu_Temas.setTema_05("LA EMPRESA: ANÁLISIS DEL ENTORNO Y MERCADO.");
        Menu_Temas.setTema_06("MARKETING Y SU PLAN EN LA EMPRESA.");
        Menu_Temas.setTema_07("FORMULAS JURÍDICAS DE LAS EMPRESAS. TRÁMITES DE CONSTITUCIÓN Y DE ACTIVIDAD.");
        Menu_Temas.setTema_08("PLAN DE ORGANIZACIÓN: ACTIVIDADES Y RECURSOS.");
        Menu_Temas.setTema_09("LA FUNCIÓN DE PRODUCCIÓN Y ANÁLISIS DE COSTES.");
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
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("El conjunto de valores y actitudes que tiene una persona para mejorar un proyecto\n        profesional, personal o social se denomina:", "Idea de negocio.", "Cultura emprendedora.", "Innovación.", "Ninguna de las anteriores es correcta.", "2");
            /*02*/      tipo_test("Son aspectos que se ven beneficiados por la cultura emprendedora:", "Riqueza de un país.", "Fomento del desarrollo sostenible.", "Creación de empleo.", "Todas las anteriores son correctas.", "4");
            /*03*/      tipo_test("Introducir nuevas formas de promocionar un producto se denomina:", "Innovación de producto.", "Innovación de marketing.", "Innovación de procesos.", "Innovación organizacional.", "2");
            /*04*/      tipo_test("Es introducir mejoras para conseguir el bienestar de una sociedad.", "Innovación de producto.", "Innovación de marketing.", "Innovación social.", "Innovación organizacional.", "3");
            /*05*/      tipo_test("Es una afirmación incorrecta sobre la idea de negocio:", "Debe ser lo más abstracta posible y poco cercana a la realidad.", "Debe ser rentable.", "Debe de satisfacer necesidades de la población.", "Debe de tener algún valor añadido.", "1");
            /*06*/      tipo_test("Es una técnica para crear una idea de negocio:", "Observación del entorno.", "Darle un uso nuevo a un producto.", "Identificar un segmento de mercado atractivo.", "Todas las anteriores son correctas.", "4");
            /*07*/      tipo_test("Una idea de negocio:", "No tiene por qué plasmarse en ningún documento, lo importante es la idea.", "Es importante trasladarla a un documento tanto para nosotros como para posibles\n    inversores.", "Es algo opcional cuando queremos emprender.", "Ninguna de las anteriores respuestas es correcta.", "2");
            /*08*/      tipo_test("El modelo Canvas es:", "Un lienzo de propuesta de valor.", "Un mapa conceptual.", "Una forma de hacer una lista de ventajas e inconvenientes.", "Una aplicación para hacer diseño gráfico.", "1");
            /*09*/      tipo_test("Es una afirmación correcta en relación a la investigación comercial.", "La investigación comercial no siempre es útil.", "Sólo vamos a poder encontrar información sobre lo que estamos investigando.", "Reduce los fracasos.", "Todas las anteriores son correctas.", "3");
            /*10*/      tipo_test("Es un tipo de investigación comercial cuantitativo.", "Reunión de grupo.", "Pseudocompra.", "Encuesta.", "Todas las anteriores son correctas.", "3");                        
                    }
                    case "2" -> {
                        _Main_.Principal.setTema(menu);
        
            /*01*/      tipo_test("Las subvenciones que puedan otorgarse, por parte de la administración, a los\n        emprendedores forman parte del factor:", "Familia.", "Gobierno.", "Cultura.", "Educación.", "2");
            /*02*/      tipo_test("En relación a la influencia que tiene la familia en la iniciativa emprendedora:", "Siempre será positiva.", "Siempre será negativa.", "Será positiva o negativa dependiendo del apoyo que tengamos de ellos o si resultan un\n    modelo a seguir.", "Todas las anteriores son incorrectas.", "3");
            /*03*/      tipo_test("Es una característica importante que debe tener un emprendedor.", "Pasión.", "Confianza en sí mismo.", "Creatividad.", "Todas son correctas.", "4");
            /*04*/      tipo_test("Si un negocio puede crecer y expandirse, podemos decir que es un emprendimiento:", "Escalable.", "Privado.", "De imitación.", "Público.", "1");
            /*05*/      tipo_test("Si el capital de un negocio proviene de un particular sin relación alguna con la\n        administración pública, el emprendimiento será:", "Privado.", "Público.", "Escalable.", "Innovador.", "1");
            /*06*/      tipo_test("¿Qué diferencia principal tiene una asociación de una empresa?", "Que la asociación tiene objetivos y la empresa no.", "Que la asociación debe tener más de tres personas y la empresa siempre será una única\n    persona la propietaria.", "El sector de actividad.", "Que una asociación no tiene ánimo de lucro y una empresa sí.", "4");
            /*07*/      tipo_test("Una cooperativa se encarga:", "De asesorar a sus socios.", "De facturar la actividad de los socios.", "De ayudar a buscar clientes a sus socios.", "Todas son correctas.", "4");
            /*08*/      tipo_test("El primer paso a la hora de trabajar con colaboradores es:", "Establecer qué personas u organizaciones pueden ayudarnos a cubrir nuestras\n    necesidades.", "Averiguar qué necesidades tiene nuestro proyecto.", "Definir cuál va a ser nuestro método de trabajo.", "Evaluar qué tal ha ido la colaboración.", "2");
            /*09*/      tipo_test("Es una ventaja de la colaboración con otros profesionales ...", "Pueden compartirse gastos.", "Pueden compartirse ideas.", "Esos colaboradores pueden convertirse en inversores.", "Todas son correctas.", "4");
            /*10*/      tipo_test("Es una afirmación correcta sobre el emprendedor en España.", "Más del 80% de los emprendedores son hombres.", "La mayoría de los emprendedores no tienen ningún tipo de estudios.", "Gran parte de los emprendedores tienen algún estudio relacionado con el\n    emprendimiento.", "Todas las anteriores son correctas.", "3");
                    }
                    case "3" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Es la persona al mando de una empresa u organización que gestiona y toma las\n        decisiones para la misma como empleado, no como propietario:", "Emprendedor.", "Directivo.", "Socio.", "Inversor.", "2");
            /*02*/      tipo_test("Es la persona que aporta capital a la empresa para obtener ganancias, pero no\n        intervienen en los procesos de toma de decisiones de la empresa.", "Emprendedor.", "Directivo.", "Socio.", "Inversor.", "4");
            /*03*/      tipo_test("Es la teoría en la que el empresario es únicamente la persona que aporta el dinero\n        asumiendo el riesgo de no saber si tendría beneficios o si recuperará ese capital:", "Teoría clásica.", "Teoría del empresario riesgo.", "Teoría del empresario innovador.", "Teoría del empresario líder.", "1");
            /*04*/      tipo_test("Es la teoría en la que la dirección está compuesta por distintos, técnicos, cada uno\n        especialista en un ámbito concreto de la empresa.", "Teoría clásica.", "Teoría del empresario tecnócrata.", "Teoría del empresario innovador.", "Teoría del empresario líder.", "2");
            /*05*/      tipo_test("La persona física que realiza de forma habitual, personal, directa, por cuenta propia y\n        fuera del ámbito de dirección y organización de otra persona, una actividad económica\n        con intención de ganar dinero es:", "Emprendedor.", "Directivo.", "Empresario.", "Autónomo.", "4");
            /*06*/      tipo_test("Es una afirmación correcta sobre el trabajador por cuenta ajena.", "Su figura está regulada por el Estatuto de los Trabajadores entre otras normativas.", "Conlleva un coste extra, más allá del sueldo, para el empresario.", "Tiene una doble función productiva.", "Todas las anteriores son correctas.", "4");
            /*07*/      tipo_test("Es una afirmación incorrecta sobre el empresario.", "Tiene mayor poder de decisión que el trabajador.", "En ocasiones debe llevarse el trabajo a casa.", "Sigue una organización impuesta.", "Todas son correctas.", "3");
            /*08*/      tipo_test("De las entidades que hemos visto, son las que se agrupan entorno a un sector.", "Centro para el Desarrollo Tecnológico Industrial de España.", "Asociaciones profesionales sectoriales.", "Cámara de Comercio de España.", "Asociaciones de Jóvenes Empresarios.", "2");
            /*09*/      tipo_test("Es como se denomina al emprendedor que trabaja por cuenta ajena.", "Directivo.", "Emprendedor por cuenta ajena.", "Intraemprendedor.", "Infraemprendedor.", "3");
            /*10*/      tipo_test("¿Cuál es el porcentaje mínimo que debe poseer un socio de una empresa para que\n        tenga que darse de alta como autónomo?", "El 25%.", "El 15%.", "El 20%.", "El 30%.", "1");                        
                    }
                    case "4" -> {
                        _Main_.Principal.setTema(menu);                     
                        
            /*01*/      tipo_test("La misión, visión y valores:", "Es algo complementario y poco importante dentro de una empresa.", "Es un elemento tangible de la empresa.", "Es un elemento intangible de la empresa.", "Es un elemento activo de la empresa.", "3");
            /*02*/      tipo_test("Son todas aquellas directrices y acciones destinadas a construir, difundir y mantener\n        los valores, filosofía y personalidad de la marca tanto dentro como fuera de la\n        empresa:", "Branding.", "Cultura empresarial.", "Imagen de marca.", "Misión visión y valores.", "1");
            /*03*/      tipo_test("Sobre qué elementos se suele enfocar la responsabilidad social corporativa:", "Trabajadores de la empresa.", "Medioambiente.", "Sociedad.", "Todas son correctas.", "4");
            /*04*/      tipo_test("Es el tipo de responsabilidad social corporativa que tiene que ver con la sociedad pero\n        no con la empresa directamente:", "Responsabilidades secundarias.", "Responsabilidades primarias.", "Responsabilidades terciarias.", "Ninguna respuesta es correcta.", "3");
            /*05*/      tipo_test("Podemos considerar los indicadores de responsabilidad social corporativa como:", "La integración por parte de la empresa de acciones que mejoren la sociedad.", "La implementación de los objetivos de la empresa.", "Las metodologías para medir la gestión de la responsabilidad social corporativa de la\n    empresa.", "Ninguna respuesta es correcta.", "3");
            /*06*/      tipo_test("Señala cuál es la afirmación correcta respecto al plan de empresa:", "Sirve para poder coordinar mejor la empresa en un futuro.", "Sirve para poder controlar y revisar lo que se haga en la empresa.", "Sirve para el reclutamiento de inversores.", "Todas son correctas.", "4");
            /*07*/      tipo_test("¿Cuándo debe hacerse un plan de empresa?", "Todos los años.", "Cuando se lance un producto nuevo.", "Cuando cambiemos los precios de los productos.", "Ninguna es correcta.", "2");
            /*08*/      tipo_test("Recoge los estándares de calidad de nuestros productos y servicios así como su\n        sistema de gestión y control:", "Plan de desarrollo.", "Plan de calidad.", "Plan de marketing.", "Misión, visión y valores.", "2");
            /*09*/      tipo_test("Los objetivos que se establecen para cumplir en 2 años son:", "Objetivos a medio plazo.", "Objetivos a largo plazo.", "Objetivos a corto plazo.", "Ninguna de las anteriores son correctas.", "1");
            /*10*/      tipo_test("Son los objetivos que tienen que ver con la percepción de los públicos de interés hacia\n        la empresa:", "Objetivos estratégicos.", "Objetivos generales.", "Objetivos cualitativos.", "Objetivos cuantitativos.", "3");                        
                    }
                    case "5" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Un entorno simple y estático con poco riesgo se denomina:", "Estable.", "Intermedio.", "Turbulento.", "Simple.", "1");
            /*02*/      tipo_test("Forma parte del macroentorno:", "Los clientes de una empresa.", "La economía de una región.", "Los proveedores de una empresa.", "Los intermediarios de una empresa.", "2");
            /*03*/      tipo_test("El nivel educativo de la población de una región forma parte del ámbito:", "Económico.", "Político.", "Social.", "Tecnológico.", "3");
            /*04*/      tipo_test("Los impuestos que estén en vigor en un país forma parte del ámbito:", "Político.", "Legal.", "Económico.", "Social.", "2");
            /*05*/      tipo_test("La competencia dentro del DAFO es:", "Una fortaleza", "Una debilidad.", "Una oportunidad.", "Una amenaza.", "4");
            /*06*/      tipo_test("Manifiestan los desafios a los que se debe enfrentar la empresa:", "La suma de debilidades y oportunidades.", "La suma de amenazas y oportunidades.", "La suma de fortalezas y debilidades.", "La suma de fortalezas y oportunidades.", "1");
            /*07*/      tipo_test("Si nos referimos al momento en el que un usuario compra un producto hablamos de\n        segmentación:", "Conductual.", "Psicográfica.", "Demográfica.", "Geográfica.", "1");
            /*08*/      tipo_test("Si decimos que una persona tiene un estilo de vida sedentario, nos estamos refiriendo\n        a la segmentación:", "Psicográfica.", "Conductual.", "Geográfica.", "Demográfica.", "1");
            /*09*/      tipo_test("Si hay muchos oferentes y unos pocos demandantes, estamos hablando de:", "Competencia perfecta.", "Oligopolio.", "Oligopsonio.", "Monopolio.", "3");
            /*10*/      tipo_test("Es la estrategia de mercado que se basa en decidir cuáles son nuestros productos más\n        rentables y volcar más esfuerzos en ellos:", "Estrategia funcional.", "Estrategia posicional.", "Estrategia de cartera.", "Estrategia de segmentación.", "3");                        
                    }
                    case "6" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Es una de las funciones del departamento de marketing:", "Gestionar la marca.", "Gestionar la responsabilidad social corporativa.", "Analizar el mercado.", "Todas las anteriores son correctas.", "4");
            /*02*/      tipo_test("Es la estrategia de marketing que se centra en las variables producto, precio,\n        promoción y distribución:", "Marketing mix.", "Marketing operativo.", "Marketing estratégico.", "Marketing de atracción.", "1");
            /*03*/      tipo_test("Es la estrategia de marketing que se enfoca a largo plazo.", "Marketing mix.", "Marketing operativo.", "Marketing estratégico.", "Marketing de atracción.", "3");
            /*04*/      tipo_test("Cuando nos referimos del camino que hace el cliente desde que nos descubren hasta\n        que finalizan la compra estamos hablando de:", "Embudo de ventas.", "Estrategia.", "Objetivos del marketing.", "Público objetivo.", "1");
            /*05*/      tipo_test("Es una afirmación incorrecta en relación al contenido del plan de marketing:", "Es imprescindible realizar un presupuesto de acciones de marketing ya que los recursos\n    de la empresa son limitados", "Es mucho más importante saber quiénes son nuestros clientes que cuáles son sus\n    motivaciones.", "Es importante conocer el entorno de la empresa.", "La misión, visión y valores deben incluirse en el plan de marketing.", "2");
            /*06*/      tipo_test("Es una línea de trabajo del departamento comercial de la empresa:", "Gestión del trabajo comercial.", "Desarrollo de los comerciales.", "Relación con el consumidor.", "Todas las anteriores son correctas.", "4");
            /*07*/      tipo_test("Es la táctica del departamento de comunicación destinada a crear relaciones estables\n        y duraderas entre las empresas y sus grupos de interés:", "Relaciones públicas.", "Publicidad.", "Marketing directo.", "Promoción de ventas.", "1");
            /*08*/      tipo_test("Es la táctica del departamento de comunicación que engloba aquellas herramientas\n        encaminadas a motivar y accionar la venta inmediata del producto.", "Relaciones públicas.", "Publicidad.", "Marketing directo.", "Promoción de ventas.", "4");
            /*09*/      tipo_test("No forma parte del marketing digital:", "Publicidad en Instagram.", "Aplicaciones móviles.", "Folletos.", "Página web.", "3");
            /*10*/      tipo_test("Las publicaciones (gratuitas) de una red social forman parte de:", "La publicidad digital.", "El E-mail marketing.", "Las relaciones públicas 2.0.", "El marketing de contenidos.", "3");
            
            
                    }
                    case "7" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("En esta forma jurídica es obligatorio que los socios aporten bienes:", "Sociedad civil privada.", "Sociedad limitada.", "Sociedad anónima.", "Comunidad de bienes.", "4");
            /*02*/      tipo_test("Las divisiones de capital de las sociedades anónimas se denominan:", "Participaciones.", "Acciones.", "Particiones.", "Divisiones.", "2");
            /*03*/      tipo_test("Las Sociedades Limitadas:", "No deben inscribirse en el Registro Mercantil.", "Tienen 3.000 Euros de capital mínimo inicial.", "No puede tener más de 5 socios.", "Tienen su capital dividido en acciones.", "2");
            /*04*/      tipo_test("No es un trámite que deba hacer obligatoriamente las sociedades civiles privadas:", "Realización de un contrato privado.", "Alta de los socios en el censo de empresarios, profesionales y retenedores.", "Escritura de constitución de la sociedad", "Solicitud del Número de Identificación Fiscal.", "3");
            /*05*/      tipo_test("No debe hacer ningún trámite de constitución como tal:", "Autónomo.", "Sociedad de Responsabilidad Limitada.", "Sociedad Cooperativa.", "Todas son correctas.", "1");
            /*06*/      tipo_test("El certificado de denominación negativa consiste en:", "Que el Registro Mercantil te da un nombre para la empresa.", "Elegir el nombre de la empresa.", "Asegurarse de que no existe otra empresa con el mismo nombre.", "Elegir entre varias opciones que te da el Registro Mercantil.", "3");
            /*07*/      tipo_test("Las sociedades cooperativas:", "Deberán inscribirse en el Registro Mercantil.", "No tienen obligación de inscribirse en ningún Registro.", "Deberán inscribirse en el Registro de Sociedades.", "Deberán inscribirse en el Registro de Sociedades cooperativas y laborales.", "4");
            /*08*/      tipo_test("No es un aspecto que se deba incluir en los estatutos de una sociedad:", "El número de trabajadores que tiene.", "Cuánto tiempo va a durar.", "El domicilio social de la empresa.", "El funcionamiento de la Junta General.", "1");
            /*09*/      tipo_test("Es un documento que hay que llevar a la notaría para elaborar la escritura pública de\n        constitución de la sociedad:", "La certificación negativa del nombre.", "El certificado bancario.", "Los estatutos de la sociedad.", "Todas son correctas.", "4");
            /*10*/      tipo_test("El alta en el Impuesto de Actividades Económicas es un trámite:", "Laboral.", "Fiscal.", "De actividad.", "Municipal.", "2");                        
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Es una afirmación incorrecta sobre la organización de la empresa:", "No es importante saber qué la disposición y orden de espacio.", "Las tareas más complicadas llevarán más tiempo.", "Es importante saber de qué recursos materiales disponemos.", "Ninguna de las anteriores es correcta.", "1");
            /*02*/      tipo_test("Es una función del departamento de recursos humanos:", "Previsión del personal.", "Reclutamiento y proceso de selección.", "Fomento de la satisfacción de la plantilla.", "Todas son correctas.", "4");
            /*03*/      tipo_test("Dentro de la ficha de descripción de puesto de trabajo la experiencia que debe tener\n        el trabajador pertenece al apartado:", "Descripción del puesto de trabajo.", "Condiciones laborales.", "Perfil profesional.", "Ninguna de las anteriores es correcta.", "3");
            /*04*/      tipo_test("Las fichas de descripción de puesto de trabajo deberemos hacerlas:", "Después de hacer la entrevista de trabajo.", "Después del reclutamiento.", "Después de la preselección.", "Antes del reclutamiento.", "4");
            /*05*/      tipo_test("Es cuando captamos a varios trabajadores de la empresa para hacerles un proceso de\n        selección sobre un puesto que ha quedado vacante:", "Reclutamiento externo.", "Reclutamiento interno.", "Reclutamiento laboral.", "Reclutamiento empresarial.", "2");
            /*06*/      tipo_test("Es una fuente de reclutamiento externo:", "Portales de empleo.", "Curriculums de autocandidaturas.", "Referencias de empleados.", "Todas son correctas.", "4");
            /*07*/      tipo_test("El test de aptitud pertenece a la siguiente fase del proceso de selección:", "Entrevista.", "Pruebas.", "Preselección.", "Ninguna de las anteriores es correcta.", "2");
            /*08*/      tipo_test("Cuando hablamos de la cualificación de un trabajador a corto plazo, nos referimos a:", "Desarrollo.", "Curso.", "Formación.", "Prueba de selección.", "3");
            /*09*/      tipo_test("Cuando un trabajador comunica a su coordinador algo relacionado con el día\n        a día en la empresa, la comunicación es:", "Vertical ascendente", "Horizontal.", "Vertical descendente.", "Diagonal.", "1");
            /*10*/      tipo_test("Que otras herramientas además de la formación y desarrollo profesional contribuyen a\n        la productividad y motivación en la empresa:", "La temporalidad de los salarios.", "La conciliación de la vida laboral y familiar.", "Las barreras comunicativas.", "Ninguna es correcta.", "2");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Los costes:", "Están vinculados directamente a la elaboración del producto.", "Forman parte del valor del producto.", "Se incorpora al activo de la empresa.", "Todas son correctas.", "4");
            /*02*/      tipo_test("Es el factor referente a todas las herramientas y maquinaria necesarias para el proceso\n        de producción:", "Tierra.", "Capital.", "Trabajo.", "Tecnología.", "2");
            /*03*/      tipo_test("Es la etapa de la producción en la que se adapta el producto para la distribución\n        al cliente:", "Etapa de acondicionamiento.", "Etapa de síntesis.", "Etapa analítica.", "Etapa de distribución.", "1");
            /*04*/      tipo_test("Es la producción en la que el producto se elabora de uno en uno:", "Producción por lotes.", "Producción en masa.", "Producción bajo pedido.", "Producción continua.", "3");
            /*05*/      tipo_test("Los costes, según su comportamiento se pueden clasificar en:", "Costes directos o indirectos.", "Costes fijos o variables.", "Costes marginal o medio.", "No es un criterio de clasificación de costes.", "2");
            /*06*/      tipo_test("El coste total es:", "La diferencia entre los costes fijos y los costes variables.", "La multiplicación entre los costes fijos y los costes variables.", "La suma de los costes fijos y los costes variables.", "La división entre los costes fijos y los costes variables.", "3");
            /*07*/      tipo_test("Para ayudar a establecer el precio de venta:", "Se puede utilizar el Método de Contribución Marginal.", "Se puede aplicar el Método de Utilidad Bruta.", "No se puede aplicar ningún método.", "Las dos primeras respuestas son correctas.", "4");
            /*08*/      tipo_test("Los métodos para establecer el precio de venta arrojan:", "El precio de venta final.", "El precio de mercado.", "Un precio de venta sugerido.", "Ninguna es correcta.", "3");
            /*09*/      tipo_test("El Margen de contribución es:", "El número de unidades físicas que representan una ganancia sobre las ventas totales.", "El porcentaje que representa una ganancia sobre el precio de venta final.", "No está relacionado con el precio de venta.", "Todas son correctas.", "2");
            /*10*/      tipo_test("El Umbral de rentabilidad refleja:", "El número de ventas, en unidades monetarias, que hace el beneficio operativo igual a cero.", "El número de costes, en unidades monetarias, que hace el beneficio operativo iguala cero.", "El volumen de ventas, en unidades físicas, que hace el beneficio operativo igual a cero.", "El volumen de ventas, en unidades físicas, que hace el beneficio operativo igual a cero.", "4");                        
                    }
                    case "10" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La Contabilidad Financiera:", "Permite interpretar, representar y medir los hechos económicos susceptibles de ser\n    registrados en un periodo de tiempo determinado.", "Muestra las relaciones económicas de la empresa con el mundo exterior.", "Ambas son correctas.", "Ninguna es correcta.", "3");
            /*02*/      tipo_test("La estructura económica de la empresa:", "Está formada por el conjunto de bienes y derechos que la empresa necesita para su\n    funcionamiento.", "Pone de manifiesto la inversión de la compañía.", "Ambas son correctas.", "Ninguna es correcta.", "3");
            /*03*/      tipo_test("La estructura financiera de la empresa:", "Refleja el origen de los recursos de capital y con ellos las fuentes de financiación de la empresa.", "Refleja el destino de los recursos de capital y con ellos las fuentes de financiación de la empresa.", "Refleja el origen de los recursos de capital y con ellos las fuentes de inversión de la empresa.", "Refleja el destino de los recursos de capital y con ellos las fuentes de inversión de la empresa.", "1");
            /*04*/      tipo_test("Los estados financieros o cuentas anuales son:", "Balance, cuenta de pérdidas y ganancias, estado de cambios de patrimonio, estado de\n    flujos de efectivo y memoria.", "Marco conceptual de la contabilidad, normas de registro y valoración, cuentas anuales,\n    cuadro de cuentas, definiciones y relaciones contables.", "Activo, pasivo y patrimonio neto.", "Debe y haber.", "1");
            /*05*/      tipo_test("El cuadro de cuentas se subdivide en:", "Debe y haber.", "Balance, cuenta de pérdidas y ganancias, estado de cambios de patrimonio, estado de\n    flujos de efectivo y memoria.", "Grupo, subgrupo, cuenta y subcuenta.", "Activo, pasivo y patrimonio neto.", "3");
            /*06*/      tipo_test("Las partes del balance son:", "Balance, cuenta de pérdidas y ganancias, estado de cambios de patrimonio, estado de\n    flujos de efectivo y memoria.", "Marco conceptual de la contabilidad, normas de registro y valoración, cuentas anuales,\n    cuadro de cuentas, definiciones y relaciones contables.", "Activo, pasivo y patrimonio neto.", "Ninguna es correcta.", "3");
            /*07*/      tipo_test("En la cuenta de pérdidas y ganancias se recogen:", "Las ventas y los costes que ha tenido la organización durante un periodo de tiempo y\n    refleja cómo las ventas se van convirtiendo en beneficios a medida que le vamos\n    restando los costes.", "Las ventas y los pagos que ha tenido la organización durante un periodo de tiempo y\n    refleja cómo las ventas se van convirtiendo en beneficios a medida que le vamos\n    restando los pagos.", "Los ingresos y los gastos que ha tenido la organización durante un periodo de tiempo y\n    refleja cómo los ingresos se van convirtiendo en beneficios a medida que le vamos\n    restando los gastos.", "Los cobros y los pagos que ha tenido la organización durante un periodo de tiempo y\n    refleja cómo los cobros se van convirtiendo en beneficios a medida que le vamos\n    restando los pagos.", "3");
            /*08*/      tipo_test("Las Pymes y los empresarios individuales están obligados a presentar:", "Como mínimo, las cuentas anuales abreviadas.", "Como máximo, las cuentas anuales abreviadas.", "No están obligados a presentar ninguna cuenta anual o estado financiero.", "No pueden presentar las cuentas anuales abreviadas.", "1");
            /*09*/      tipo_test("En el asiento contable se representa:", "El debe va a la izquierda y el haber a la derecha en el asiento contable.", "El debe va a la derecha y el haber a la izquierda en el asiento contable.", "Depende del hecho económico que se esté representando.", "No existe ninguna representación gráfica establecida para el asiento contable.", "1");
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
                            System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
    
}
