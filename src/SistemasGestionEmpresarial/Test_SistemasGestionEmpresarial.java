package SistemasGestionEmpresarial;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan José Estévez González
 */
public class Test_SistemasGestionEmpresarial { 

    public static void main(String[] args) {
        
                String menu="";
        do {
            Principal.setFallos(0);
            Principal.setAciertos(0);
            Principal.setContador(0);
            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ************************************************************************
        *  TEST SISTEMAS DE GESTIÓN EMPRESARIAL                                *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: LA GESTIÓN EMPRESARIAL                                     *
        *  2. TEMA: ERP-CRM ACTUALES LIBRES Y PROPIETARIOS                     *
        *  3. TEMA: LOS MÓDULOS DE UN ERP                                      *
        *  4. TEMA: EL PROYECTO DE IMPLANTACIÓN DE UN ERP                      *
        *  5. TEMA: EL ENTORNO DE INSTALACIÓN DE ERP-CRM                       *
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
        
            /*01*/      tipo_test("Según la evolución histórica de los programas enfocados a la gestión empresarial,\n        el orden de aparición es ...", "Gestión de inventario > MRP > MRP II > ERP.", "MRP > MRP II > Gestión de inventario > ERP.", "ERP > MRP > MRP II > Gestión de inventario.", "Ninguna respuesta es correcta.", "1");
            /*02*/      tipo_test("Entre los departamentos más comunes de una empresa se encuentran ...", "Logísticas.", "Finanzas.", "Ventas.", "Todas las respuestas son correctas.", "4");
            /*03*/      tipo_test("ERP son las siglas de ...", "Enterprise Resource Professional.", "Enterprise Risk Planning.", "Enterprise Resource Planning.", "Ninguna respuesta es correcta.", "3");
            /*04*/      tipo_test("El ERP surgió ...", "en la década de los 90 y el término lo bautizó el grupo Gartner.", "en la década de los 90 y el término lo bautizó el SAP.", "en la década de los 80 y el término lo bautizó el grupo Gartner.", "en la década de los 80 y el término lo bautizó el SAP.", "1");
            /*05*/      tipo_test("Entre las principales características de un ERP encontramos que es ...", "Modular e integrado.", "Difícil de implantar y caro.", "Dispone de una base de datos descentralizada.", "Ninguna respuesta es correcta.", "1");
            /*06*/      tipo_test("CRM son las siglas de ...", "Customer Relationship Modular.", "Customer Relationship Management.", "Customer Real Monitoring.", "Ninguna respuesta es correcta.", "2");
            /*07*/      tipo_test("Un CRM permite gestionar ...", "Contactos.", "Campañas de marketing.", "Nuevas oportunidades de negocio.", "Todas las respuestas son correctas.", "4");
            /*08*/      tipo_test("El CRM se podría considerar el ...", "Back Office.", "Front Office.", "Middle Office.", "Ninguna respuesta es correcta.Ninguna respuesta es correcta.", "2");
            /*09*/      tipo_test("Entre los flujos de comunicación del e-business nos encontramos con ...", "B2B, B2C, B2E.", "B2B, B2E, B2L.", "B2C, B2R, B2L.", "Ninguna respuesta es correcta.", "1");
            /*10*/      tipo_test("La arquitectura SOA ...", "Son las siglas de Service Oriented Architecture y consiste en una plataforma abierta y\n    flexible, donde las diferentes aplicaciones empresariales (incluido el ERP) pueden estar\n    totalmente integradas mediante tecnología de Servicios Web.", "Son las siglas de Service Oriented Archived y consiste una plataforma cerrada, donde las\n    diferentes aplicaciones empresariales (incluido el ERP) pueden estar totalmente\n    integradas mediante tecnología de Servicios Web.", "Son las siglas de Service Oriented Archived y consiste en una plataforma abierta y\n    flexible, donde las diferentes aplicaciones empresariales (incluido el ERP) pueden estar\n    totalmente integradas mediante tecnología de Servicios Web.", "Ninguna respuesta es correcta.", "1");                       
                    }
                    case "2" -> {
                        System.out.println("\nTEMA " + menu + "\n");
        
            /*01*/      tipo_test("El código abierto (open source) ...", "Es lo mismo que software libre (free software).", "Suele confundirse con el software libre (free software).", "Ambos movimientos tienen los mismos valores.", "Todas las respuestas son correctas.", "2");
            /*02*/      tipo_test("El código abierto ...", "Se trata de un modelo de desarrollo software basado en la colaboración abierta.", "Se trata de un modelo de desarrollo software basado en la colaboración cerrada.", "Implica que cualquier software que parta de él sea gratuito.", "Ninguna respuesta es correcta.", "1");
            /*03*/      tipo_test("Para considerar que un código sea abierto, es cuando, entre otras condiciones, tiene ...", "Su redistribución es gratuita.", "Se facilita la obtención del código fuente.", "La licencia no debe discriminar a ninguna persona o grupo de personas.", "Todas las respuestas son correctas.", "4");
            /*04*/      tipo_test("El código propietario ...", "Nuca exige un pago por licencia de uso de software.", "Para la Fundación para el Software Libre (FSF), es todo aquel que no es libre o no lo es\n    parcialmente.", "Permite consultar, modificar y distribuir su código fuente.", "Ninguna respuesta es correcta.", "2");
            /*05*/      tipo_test("Entre las ventajas del código abierto encontramos que ...", "La evolución del software no depende de un proveedor, sino de la comunidad.", "La evolución del software se hace de forma genérica y depende de la comunidad.", "Es un software muy especializado y puede evolucionar en áreas específicas.", "Ninguna respuesta es correcta.", "1");
            /*06*/      tipo_test("Entre las desventajas del software propietario encontramos ...", "La dependencia. La implantación y personalización del ERP con un proveedor dificulta un\n    posible futuro cambio de ERP.", "Es poco fiable.", "No suelen ofrecer garantías.", "Ninguna respuesta es correcta.", "1");
            /*07*/      tipo_test("Entre los ERP de código abierto nos encontramos ...", "Odoo.", "ERPNext++.", "SAP.", "Todas las respuestas son correctas.", "1");
            /*08*/      tipo_test("Entre los ERP de código propietario nos encontramos ...", "SAP.", "Microsoft Office.", "ErpNext.", "Todas las respuestas son correctas.", "1");
            /*09*/      tipo_test("Entre los CRM de código abierto nos encontramos ...", "Suite CRM.", "Thin free CRM.", "Zoho CRM.", "Ninguna respuesta es correcta.", "1");
            /*10*/      tipo_test("Entre los CRM de código propietario nos encontramos ...", "Salesforce.", "Suite CRM.", "Zozo CRM.", "Todas las respuestas son correctas.", "1");
                    }
                    case "3" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Podríamos definir un módulo ...", "Como el conjunto de departamentos en los que divide el ERP a una empresa.", "Como el conjunto de clientes con los que se relaciona una empresa.", "Como el conjunto de sistemas gestores de bases de datos dentro de un ERP.", "Ninguna respuesta es correcta.", "1");
            /*02*/      tipo_test("Entre los módulos financieros de SAP nos encontramos con los módulos de ...", "Finanzas y contabilidad.", "Finanzas y recursos humanos.", "Finanzas y ventas.", "Finanzas y calidad.", "1");
            /*03*/      tipo_test("Entre los módulos logísticos de SAP nos encontramos con los módulos de ...", "Gestión de materiales.", "Ventas y distribución.", "Planificación de la producción.", "Todas las respuestas son correctas.", "4");
            /*04*/      tipo_test("El módulo de facturación de Odoo ...", "Se encuentra entre los módulos de ventas.", "Se encuentra entre los módulos de fabricación.", "Se encuentra entre los módulos de operación.", "Ninguna respuesta es correcta.", "4");
            /*05*/      tipo_test("Entre los módulos de operaciones de Odoo nos encontramos con ...", "El módulo de compra.", "El módulo de inventario.", "El módulo de proyecto.", "Todas las respuestas son correctas.", "4");
            /*06*/      tipo_test("El Módulo MRP en Odoo se encuentra ...", "Dentro de los módulos de ventas.", "Dentro de los módulos de aplicación.", "Dentro de los módulos de fabricación.", "Ninguna respuesta es correcta.", "3");
            /*07*/      tipo_test("No existe en Odoo ...", "El módulo de citas.", "El módulo de chat en directo.", "El módulo de aprobaciones.", "Ninguna respuesta es correcta.", "4");
            /*08*/      tipo_test("En el módulo de Empleados de Odoo nos permiten ...", "Gestionar gastos del empleado.", "Gestionar vacaciones del empleado.", "Gestionar evaluaciones del empleado.", "Todas las respuestas con correctas.", "4");
            /*09*/      tipo_test("En Odoo, los módulos de marketing son ...", "4 hablar, automatización, email, social.", "4 encuesta, automatización, email, social.", "5 hablar, encuesta, automatización, email, social.", "Ninguna respuesta es correcta.", "4");
            /*10*/      tipo_test("Con el módulo de creador de sitios web de Odoo ...", "Se pueden crear sitios web amigables sin necesidad de tener conocimientos de\n    programación", "Se pueden crear sitios web amigables, pero es necesario tener conocimientos de\n    programación.", "Se pueden crear sitios web amigables, pero solo para uso interno de la empresa.", "Ninguna respuesta es correcta.", "1");                        
                    }
                    case "4" -> {
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
            /*01*/      tipo_test("El proyecto de implantación de un ERP ...", "No tiene ninguna fase.", "Se puede dividir en 8 fases.", "Se puede dividir en 5 fases.", "Ninguna de las anteriores es correcta.", "2");
            /*02*/      tipo_test("La primera fase del proyecto de implantación de un ERP ...", "Es la fase de análisis o consultoría.", "Es la fase de parametrización y diseño.", "Es la fase de planificación.", "Ninguna respuesta es correcta.", "3");
            /*03*/      tipo_test("Los usuarios que finalmente harán uso del ERP son:", "Los usuarios técnicos.", "Los usuarios finales.", "Los usuarios funcionales.", "Ninguna respuesta es correcta.", "2");
            /*04*/      tipo_test("El diseño funcional ...", "Es creado por los analistas en la fase de análisis.", "Es creado por los técnicos en la fase de análisis.", "Es creado por los analistas en la fase de parametrización y diseño.", "Es creado por los técnicos en la fase de parametrización y diseño.", "1");
            /*05*/      tipo_test("El diseño técnico ...", "Es creado por los analistas en la fase de análisis.", "Es creado por los técnicos en la fase de análisis.", "Es creado por los analistas en la fase de parametrización y diseño.", "Es creado por los técnicos en la fase de parametrización y diseño.", "4");
            /*06*/      tipo_test("Los entornos o niveles de trabajo son, de más bajo a más alto ...", "Desarrollo, integración y producción.", "Integración, desarrollo y producción.", "Desarrollo, producción e integración.", "Producción, integración y desarrollo.", "1");
            /*07*/      tipo_test("Las pruebas unitarias ...", "Se realizan en integración por los técnicos.", "Se realizan en desarrollo por los técnicos.", "Se realizan en desarrollo por los analistas.", "Se realizan en integración por los analistas.", "2");
            /*08*/      tipo_test("La formación ...", "Se realiza al cliente final justo después del arranque en producción.", "Se realiza el cliente final justo después de la fase de soporte.", "Se realiza al cliente final justo antes del arranque en producción.", "No es necesario formar al cliente final.", "3");
            /*09*/      tipo_test("La migración y arranque ...", "Se trata de la última fase en lo que a la implantación del ERP se refiere y suele ser una\n    fase muy intensa y estresante.", "Es la fase más fase más tranquila de todas.", "Se realiza justo antes de la formación.", "Ninguna respuesta es correcta.", "1");
            /*10*/      tipo_test("La fase de soporte y seguimiento ...", "Dura el tiempo necesario para que la herramienta esté funcionando correctamente en el\n    entorno de producción.", "Dura 1 mes.", "Dura el tiempo que se estipule en el contrato que se creó en la primera fase\n    (planificación).", "Siempre va seguida de la fase de mantenimiento, puesto que ambas pertenecen siempre\n    al mismo proyecto.", "3");                       
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
