package EmpresaIniciativaEmprendedora;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Test_EmpresaIniciativaEmprendedora {
    
    public static void main(String[] args) {
        
                String menu="";
        do {
            Principal.setFallos(0);
            Principal.setAciertos(0);
            Principal.setContador(0);
            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ************************************************************************
        *  TEST EMPRESA E INICIATIVA EMPRENDEDORA                              *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: LA INICIATIVA EMPRENDEDORA                                 *
        *  2. TEMA: FACTORES CLAVES EN EL EMPRENDIMIENTO                       *
        *  3. TEMA: EL EMPRESARIO                                              *
        *  4. TEMA: PLAN DE EMPRESA Y CULTURA EMPRESARIAL                      *
        *  5. TEMA:                                                            *
        *  6. TEMA:                                                            *
        *  7. TEMA:                                                            *
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
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
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
                    case "6" -> {
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
