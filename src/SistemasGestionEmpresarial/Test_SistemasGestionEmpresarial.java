package SistemasGestionEmpresarial;

import _Main_.Principal;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
        *  TEST SISTEMAS DE GESTI�N EMPRESARIAL                                *
        ************************************************************************
        *                                                                      *
        *  1. TEMA: LA GESTI�N EMPRESARIAL                                     *
        *  2. TEMA: ERP-CRM ACTUALES LIBRES Y PROPIETARIOS                     *
        *  3. TEMA: LOS M�DULOS DE UN ERP                                      *
        *  4. TEMA: EL PROYECTO DE IMPLANTACI�N DE UN ERP                      *
        *  5. TEMA: EL ENTORNO DE INSTALACI�N DE ERP-CRM                       *
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
        
            /*01*/      tipo_test("Seg�n la evoluci�n hist�rica de los programas enfocados a la gesti�n empresarial,\n        el orden de aparici�n es ...", "Gesti�n de inventario > MRP > MRP II > ERP.", "MRP > MRP II > Gesti�n de inventario > ERP.", "ERP > MRP > MRP II > Gesti�n de inventario.", "Ninguna respuesta es correcta.", "1");
            /*02*/      tipo_test("Entre los departamentos m�s comunes de una empresa se encuentran ...", "Log�sticas.", "Finanzas.", "Ventas.", "Todas las respuestas son correctas.", "4");
            /*03*/      tipo_test("ERP son las siglas de ...", "Enterprise Resource Professional.", "Enterprise Risk Planning.", "Enterprise Resource Planning.", "Ninguna respuesta es correcta.", "3");
            /*04*/      tipo_test("El ERP surgi� ...", "en la d�cada de los 90 y el t�rmino lo bautiz� el grupo Gartner.", "en la d�cada de los 90 y el t�rmino lo bautiz� el SAP.", "en la d�cada de los 80 y el t�rmino lo bautiz� el grupo Gartner.", "en la d�cada de los 80 y el t�rmino lo bautiz� el SAP.", "1");
            /*05*/      tipo_test("Entre las principales caracter�sticas de un ERP encontramos que es ...", "Modular e integrado.", "Dif�cil de implantar y caro.", "Dispone de una base de datos descentralizada.", "Ninguna respuesta es correcta.", "1");
            /*06*/      tipo_test("CRM son las siglas de ...", "Customer Relationship Modular.", "Customer Relationship Management.", "Customer Real Monitoring.", "Ninguna respuesta es correcta.", "2");
            /*07*/      tipo_test("Un CRM permite gestionar ...", "Contactos.", "Campa�as de marketing.", "Nuevas oportunidades de negocio.", "Todas las respuestas son correctas.", "4");
            /*08*/      tipo_test("El CRM se podr�a considerar el ...", "Back Office.", "Front Office.", "Middle Office.", "Ninguna respuesta es correcta.Ninguna respuesta es correcta.", "2");
            /*09*/      tipo_test("Entre los flujos de comunicaci�n del e-business nos encontramos con ...", "B2B, B2C, B2E.", "B2B, B2E, B2L.", "B2C, B2R, B2L.", "Ninguna respuesta es correcta.", "1");
            /*10*/      tipo_test("La arquitectura SOA ...", "Son las siglas de Service Oriented Architecture y consiste en una plataforma abierta y\n    flexible, donde las diferentes aplicaciones empresariales (incluido el ERP) pueden estar\n    totalmente integradas mediante tecnolog�a de Servicios Web.", "Son las siglas de Service Oriented Archived y consiste una plataforma cerrada, donde las\n    diferentes aplicaciones empresariales (incluido el ERP) pueden estar totalmente\n    integradas mediante tecnolog�a de Servicios Web.", "Son las siglas de Service Oriented Archived y consiste en una plataforma abierta y\n    flexible, donde las diferentes aplicaciones empresariales (incluido el ERP) pueden estar\n    totalmente integradas mediante tecnolog�a de Servicios Web.", "Ninguna respuesta es correcta.", "1");                       
                    }
                    case "2" -> {
                        System.out.println("\nTEMA " + menu + "\n");
        
            /*01*/      tipo_test("El c�digo abierto (open source) ...", "Es lo mismo que software libre (free software).", "Suele confundirse con el software libre (free software).", "Ambos movimientos tienen los mismos valores.", "Todas las respuestas son correctas.", "2");
            /*02*/      tipo_test("El c�digo abierto ...", "Se trata de un modelo de desarrollo software basado en la colaboraci�n abierta.", "Se trata de un modelo de desarrollo software basado en la colaboraci�n cerrada.", "Implica que cualquier software que parta de �l sea gratuito.", "Ninguna respuesta es correcta.", "1");
            /*03*/      tipo_test("Para considerar que un c�digo sea abierto, es cuando, entre otras condiciones, tiene ...", "Su redistribuci�n es gratuita.", "Se facilita la obtenci�n del c�digo fuente.", "La licencia no debe discriminar a ninguna persona o grupo de personas.", "Todas las respuestas son correctas.", "4");
            /*04*/      tipo_test("El c�digo propietario ...", "Nuca exige un pago por licencia de uso de software.", "Para la Fundaci�n para el Software Libre (FSF), es todo aquel que no es libre o no lo es\n    parcialmente.", "Permite consultar, modificar y distribuir su c�digo fuente.", "Ninguna respuesta es correcta.", "2");
            /*05*/      tipo_test("Entre las ventajas del c�digo abierto encontramos que ...", "La evoluci�n del software no depende de un proveedor, sino de la comunidad.", "La evoluci�n del software se hace de forma gen�rica y depende de la comunidad.", "Es un software muy especializado y puede evolucionar en �reas espec�ficas.", "Ninguna respuesta es correcta.", "1");
            /*06*/      tipo_test("Entre las desventajas del software propietario encontramos ...", "La dependencia. La implantaci�n y personalizaci�n del ERP con un proveedor dificulta un\n    posible futuro cambio de ERP.", "Es poco fiable.", "No suelen ofrecer garant�as.", "Ninguna respuesta es correcta.", "1");
            /*07*/      tipo_test("Entre los ERP de c�digo abierto nos encontramos ...", "Odoo.", "ERPNext++.", "SAP.", "Todas las respuestas son correctas.", "1");
            /*08*/      tipo_test("Entre los ERP de c�digo propietario nos encontramos ...", "SAP.", "Microsoft Office.", "ErpNext.", "Todas las respuestas son correctas.", "1");
            /*09*/      tipo_test("Entre los CRM de c�digo abierto nos encontramos ...", "Suite CRM.", "Thin free CRM.", "Zoho CRM.", "Ninguna respuesta es correcta.", "1");
            /*10*/      tipo_test("Entre los CRM de c�digo propietario nos encontramos ...", "Salesforce.", "Suite CRM.", "Zozo CRM.", "Todas las respuestas son correctas.", "1");
                    }
                    case "3" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Podr�amos definir un m�dulo ...", "Como el conjunto de departamentos en los que divide el ERP a una empresa.", "Como el conjunto de clientes con los que se relaciona una empresa.", "Como el conjunto de sistemas gestores de bases de datos dentro de un ERP.", "Ninguna respuesta es correcta.", "1");
            /*02*/      tipo_test("Entre los m�dulos financieros de SAP nos encontramos con los m�dulos de ...", "Finanzas y contabilidad.", "Finanzas y recursos humanos.", "Finanzas y ventas.", "Finanzas y calidad.", "1");
            /*03*/      tipo_test("Entre los m�dulos log�sticos de SAP nos encontramos con los m�dulos de ...", "Gesti�n de materiales.", "Ventas y distribuci�n.", "Planificaci�n de la producci�n.", "Todas las respuestas son correctas.", "4");
            /*04*/      tipo_test("El m�dulo de facturaci�n de Odoo ...", "Se encuentra entre los m�dulos de ventas.", "Se encuentra entre los m�dulos de fabricaci�n.", "Se encuentra entre los m�dulos de operaci�n.", "Ninguna respuesta es correcta.", "4");
            /*05*/      tipo_test("Entre los m�dulos de operaciones de Odoo nos encontramos con ...", "El m�dulo de compra.", "El m�dulo de inventario.", "El m�dulo de proyecto.", "Todas las respuestas son correctas.", "4");
            /*06*/      tipo_test("El M�dulo MRP en Odoo se encuentra ...", "Dentro de los m�dulos de ventas.", "Dentro de los m�dulos de aplicaci�n.", "Dentro de los m�dulos de fabricaci�n.", "Ninguna respuesta es correcta.", "3");
            /*07*/      tipo_test("No existe en Odoo ...", "El m�dulo de citas.", "El m�dulo de chat en directo.", "El m�dulo de aprobaciones.", "Ninguna respuesta es correcta.", "4");
            /*08*/      tipo_test("En el m�dulo de Empleados de Odoo nos permiten ...", "Gestionar gastos del empleado.", "Gestionar vacaciones del empleado.", "Gestionar evaluaciones del empleado.", "Todas las respuestas con correctas.", "4");
            /*09*/      tipo_test("En Odoo, los m�dulos de marketing son ...", "4 hablar, automatizaci�n, email, social.", "4 encuesta, automatizaci�n, email, social.", "5 hablar, encuesta, automatizaci�n, email, social.", "Ninguna respuesta es correcta.", "4");
            /*10*/      tipo_test("Con el m�dulo de creador de sitios web de Odoo ...", "Se pueden crear sitios web amigables sin necesidad de tener conocimientos de\n    programaci�n", "Se pueden crear sitios web amigables, pero es necesario tener conocimientos de\n    programaci�n.", "Se pueden crear sitios web amigables, pero solo para uso interno de la empresa.", "Ninguna respuesta es correcta.", "1");                        
                    }
                    case "4" -> {
                        System.out.println("\nTEMA " + menu + "\n");                       
                        
            /*01*/      tipo_test("El proyecto de implantaci�n de un ERP ...", "No tiene ninguna fase.", "Se puede dividir en 8 fases.", "Se puede dividir en 5 fases.", "Ninguna de las anteriores es correcta.", "2");
            /*02*/      tipo_test("La primera fase del proyecto de implantaci�n de un ERP ...", "Es la fase de an�lisis o consultor�a.", "Es la fase de parametrizaci�n y dise�o.", "Es la fase de planificaci�n.", "Ninguna respuesta es correcta.", "3");
            /*03*/      tipo_test("Los usuarios que finalmente har�n uso del ERP son:", "Los usuarios t�cnicos.", "Los usuarios finales.", "Los usuarios funcionales.", "Ninguna respuesta es correcta.", "2");
            /*04*/      tipo_test("El dise�o funcional ...", "Es creado por los analistas en la fase de an�lisis.", "Es creado por los t�cnicos en la fase de an�lisis.", "Es creado por los analistas en la fase de parametrizaci�n y dise�o.", "Es creado por los t�cnicos en la fase de parametrizaci�n y dise�o.", "1");
            /*05*/      tipo_test("El dise�o t�cnico ...", "Es creado por los analistas en la fase de an�lisis.", "Es creado por los t�cnicos en la fase de an�lisis.", "Es creado por los analistas en la fase de parametrizaci�n y dise�o.", "Es creado por los t�cnicos en la fase de parametrizaci�n y dise�o.", "4");
            /*06*/      tipo_test("Los entornos o niveles de trabajo son, de m�s bajo a m�s alto ...", "Desarrollo, integraci�n y producci�n.", "Integraci�n, desarrollo y producci�n.", "Desarrollo, producci�n e integraci�n.", "Producci�n, integraci�n y desarrollo.", "1");
            /*07*/      tipo_test("Las pruebas unitarias ...", "Se realizan en integraci�n por los t�cnicos.", "Se realizan en desarrollo por los t�cnicos.", "Se realizan en desarrollo por los analistas.", "Se realizan en integraci�n por los analistas.", "2");
            /*08*/      tipo_test("La formaci�n ...", "Se realiza al cliente final justo despu�s del arranque en producci�n.", "Se realiza el cliente final justo despu�s de la fase de soporte.", "Se realiza al cliente final justo antes del arranque en producci�n.", "No es necesario formar al cliente final.", "3");
            /*09*/      tipo_test("La migraci�n y arranque ...", "Se trata de la �ltima fase en lo que a la implantaci�n del ERP se refiere y suele ser una\n    fase muy intensa y estresante.", "Es la fase m�s fase m�s tranquila de todas.", "Se realiza justo antes de la formaci�n.", "Ninguna respuesta es correcta.", "1");
            /*10*/      tipo_test("La fase de soporte y seguimiento ...", "Dura el tiempo necesario para que la herramienta est� funcionando correctamente en el\n    entorno de producci�n.", "Dura 1 mes.", "Dura el tiempo que se estipule en el contrato que se cre� en la primera fase\n    (planificaci�n).", "Siempre va seguida de la fase de mantenimiento, puesto que ambas pertenecen siempre\n    al mismo proyecto.", "3");                       
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
