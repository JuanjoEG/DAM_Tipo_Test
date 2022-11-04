package EmpresaIniciativaEmprendedora;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
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
        *  0. ATRÁS.                                                           *
        ************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> {                        
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
        
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
                        System.out.println("\nTEMA " + menu + "\n");
                        
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
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
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
