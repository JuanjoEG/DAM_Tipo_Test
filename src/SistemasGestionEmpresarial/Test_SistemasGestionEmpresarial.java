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
        *  6. TEMA: TIPOS DE INSTALACIONES DE SISTEMAS ERP-CRM                 *
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
                        
            /*01*/      tipo_test("SAP S/4 HANA ...", "Se trata de una plataforma de \"datos en memoria\".", "Se trata de una plataforma de \"datos en disco duro\".", "Ofrece peores rendimientos que SAP R/3 en aplicaciones anal�sticas como puede ser el\n    Big Data.", "Ninguna respuesta es correcta.", "1");
            /*02*/      tipo_test("En SAP S/4 HANA ...", "Los m�dulos siguen denomin�ndose m�dulos.", "Los m�dulos han pasado a denominarse LoB (Line of Business).", "Los m�dulos han pasado a denominarse HLM (High Level Module).", "Ninguna respuesta es correcta.", "2");
            /*03*/      tipo_test("La instalaci�n en local de SAP HANA 2.0 Express Edition se puede hacer de:", "Tres formas distintas: con un instalador, mediante m�quina virtual o por medio de\n    docker.", "Dos formas distintas: con un instalador o mediante m�quina virtual.", "Una simple forma: con una m�quina virtual.", "Una simple forma: con un instalador.", "1");
            /*04*/      tipo_test("Para la instalaci�n de SAP HANA 2.0 Express Edition en local mediante un instalador\n        es necesario:", "Disponer de, al menos, 16GB de memoria RAM.", "Tener instalado Java Runtime Enviroment (JRE) 8 o superior.", "Disponer de un procesador con al menos 2 n�cleos.", "Todas las respuestas son correctas.", "4");
            /*05*/      tipo_test("Para la instalaci�n de SAP HANA 2.0 Express Edition en local haciendo uso de una\n        m�quina virtual preconfigurada es necesario:", "Disponer de al menos 64 GB de RAM", "Tener instalado Java Runtime Enviroment (JRE) 7.", "Tener, al menos 100GB de espacio libre en el disco duro.", "Ninguna respuesta es correcta.", "4");
            /*06*/      tipo_test("La instalaci�n de Odoo en local se puede hacer de:", "Tres formas distintas: con un instalador, mediante c�digo fuente o por medio de docker.", "Dos formas distintas: con un instalador o mediante docker.", "Una simple forma: con el c�digo fuente.", "Una simple forma: con un instalador.", "1");
            /*07*/      tipo_test("Para instalar Odoo en local, en una empresa donde lo usar�n 20 trabajadores, ser�\n        necesario disponer de un equipo con:", "4 CPUs y 8GB de memoria RAM m�nimo.", "2 CPUs y 8GB de memoria RAM m�nimo.", "2 * 8 CPUs y 32GB de memoria RAM m�nimo.", "Ninguna respuesta es correcta.", "1");
            /*08*/      tipo_test("Odoo tiene como requisito software en todas las opciones de instalaci�n disponer\n        de ...", "Un servidor de base de datos MySQL.", "Java Runtime Environment (JRE) 8 o superior.", "Docker.", "Ninguna respuesta es correcta.", "4");
            /*09*/      tipo_test("Odoo proporciona un instalador para ...", "Windows.", "Distribuciones basadas en Debian (Debian, Ubuntu, ...).", "Distribuciones basadas en RPM (Fedora, CentOS, RHEL, ...).", "Todas las respuestas son correctas.", "4");
            /*10*/      tipo_test("Los m�dulos de Odoo est�n implementados en ...", "Python.", "Java.", "C++.", "Ninguna respuesta es correcta.", "1");                        
                    }
                    case "6" -> {
                        System.out.println("\nTEMA " + menu + "\n");
                        
            /*01*/      tipo_test("Para realizar hacer uso de un ERP mediante SaaS ...", "Es necesario instalarse alg�n software en local.", "Es necesario instalar alg�n plugin en el navegador.", "No es necesario instalar nada, simplemente conectarse a trav�s de un navegador.", "Ninguna de las anteriores es correcta.", "3");
            /*02*/      tipo_test("La instalaci�n de un ERP en un hosting puede ser ...", "En un hosting del proveedor oficial.", "En un hosting de un tercero.", "En un hosting propio.", "Todas las respuestas son correctas.", "4");
            /*03*/      tipo_test("El software copyleft ...", "Permite al redistribuidor agregar restricciones adicionales.", "No permite al redistribuidor agregar restricciones adicionales.", "Hace que el c�digo sea privado.", "Ninguna respuesta es correcta.", "2");
            /*04*/      tipo_test("La licencia LGPLv3 ...", "Es m�s permisiva que la apache 2.0.", "Es m�s permisiva que la GPLv3.", "Es m�s permisiva que la MPL 1.1 (Mozilla Public License).", "Ninguna respuesta es correcta.", "2");
            /*05*/      tipo_test("La versi�n Express Edition de SAP es ...", "Siempre de pago.", "Siempre gratuita.", "Gratuita hasta los 32GB.", "Ninguna respuesta es correcta.", "3");
            /*06*/      tipo_test("La versi�n Runtime Edition de SAP ...", "Solo pueden usar aplicaciones SAP.", "Pueden usar aplicaciones SAP y no SAP.", "Solo se puede usar en local (on-premise).", "Solo se puede usar en la nube (cloud).", "1");
            /*07*/      tipo_test("La versi�n SaaS de Odoo ...", "Siempre es de pago.", "Est� totalmente administrada por Odoo S.A.", "Adem�s de un navegador, es necesario instalar software en nuestro host para usarlo.", "Ninguna respuesta es correcta.", "2");
            /*08*/      tipo_test("Para instalar la versi�n empresarial de Odoo con el instalador en una distribuci�n\n        Debian o RPM ...", "No se puede hacer uso del repositorio que ofrece Odoo, solo con los paquetes 'deb'\n    y 'rpm' respectivamente.", "Se puede hacer uso tanto del repositorio que ofrece Odoo como de los paquetes 'deb' y\n    'rpm' respectivamente.", "No se puede instalar la versi�n empresarial de Odoo con el instalador.", "Ninguna respuesta es correcta.", "2");
            /*09*/      tipo_test("La versi�n de instalaci�n con el instalador ...", "Instalar� en Windows todo lo necesario para ejecutar Odoo (no requiere instalar nada m�s).", "Instalar� en distribuciones Debian todo lo necesario para ejecutar Odoo (no requiere\n    instalar nada m�s)", "Instalar� en distribuciones RPM todo lo necesario para ejecutar Odoo (no requiere\n    instalar nada m�s)", "Ninguna respuesta es correcta.", "1");
            /*10*/      tipo_test("La versi�n de instalaci�n con el c�digo fuente ...", "Es la modalidad m�s conveniente para los usuarios desarrolladores.", "Es la modalidad m�s conveniente para los usuarios que no necesiten desarrollar.", "No es especialmente conveniente para ning�n grupo de usuarios.", "Ninguna respuesta es correcta.", "1");                       
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
                        
            /*01*/      tipo_test("Para la instalaci�n de SAP S/4 HANA en local ...", "No influye la versi�n del producto SAP.", "SAP no tiene socios certificados del hardware necesario.", "Los requisitos hardware son a voluntad del cliente.", "Los requisitos hardware y software dependen de much�simos factores.", "4");
            /*02*/      tipo_test("Los m�dulos log�sticos se encargan de realizar las tareas de ...", "Gesti�n de materiales.", "Ventas y distribuci�n.", "Planificaci�n de la producci�n.", "Todas las respuestas son correctas.", "4");
            /*03*/      tipo_test("El control de facturaci�n supone ...", "Imprimir todos los documentos disponibles.", "Tener ya un pedido de nuestros clientes.", "Que el producto a�n no lo ha enviado el proveedor.", "Registrar la factura que nos ha enviado el proveedor.", "4");
            /*04*/      tipo_test("En la fase de implantaci�n de un ERP se realizan estimaciones de ...", "Objetivo.", "Recursos.", "Tiempos.", "Todas las respuestas son correctas.", "4");
            /*05*/      tipo_test("El desarrollo de programas de c�digo abierto est� basado en ...", "Su registro de la propiedad intelectual.", "La colaboraci�n abierta.", "El pago del coste de desarrollo.", "Todas las respuestas son correctas.", "2");
            /*06*/      tipo_test("Para instalar Odoo se puede realizar ...", "Online.", "Con Instalador.", "Con Docker.", "Todas las respuestas son correctas.", "4");
            /*07*/      tipo_test("El ERP Odoo tiene m�dulos que permiten ...", "Chatear en privado con los empleados.", "Gestionar la Contabilidad.", "Controlar el Inventario.", "Todas las respuestas son correctas.", "1");
            /*08*/      tipo_test("En los a�os 70 aparecieron los ...", "MRP.", "ERP.", "MRP II.", "CRM.", "1");
            /*09*/      tipo_test("Un software comercial es aquel que es desarrollado por una empresa que pretende\n        ganar dinero por ...", "Su modificaci�n.", "Su uso.", "Su desarrollo.", "Las dem�s respuestas son incorrectas.", "2");
            /*10*/      tipo_test("Dentro de los pasos para completar el flujo de compra-venta en Odoo tenemos ...", "Facturaci�n y Atenci�n al cliente.", "Facturaci�n y Recibir producto.", "Analizar los beneficios y publicitar el producto.", "Publicitar y vender el producto.", "2");
            /*11*/      tipo_test("Entre las desventajas del c�digo abierto est� que ...", "No se puede hacer cambios en el c�digo, pero s� mostrarlo.", "La garant�a suele estar limitada.", "Los fabricantes del software no tienen soporte t�cnico.", "Las dem�s respuestas son incorrectas.", "2");
            /*12*/      tipo_test("SAP permite la instalaci�n de SAP S/4 HANA mediante ...", "Un instalable en Linux.", "Un instalable en windows.", "Un instalable en Java.", "Todas las respuestas son correctas.", "1");
            /*13*/      tipo_test("Entre las ventajas del c�digo propietario est� que ...", "Es m�s barato que el libre.", "Se puede distribuir mostrando su c�digo.", "Las comunidades incorporan los cambios r�pidamente.", "Son desarrollados por grandes fabricantes de software.", "4");
            /*14*/      tipo_test("Un CRM permite gestionar ...", "Contactos.", "Campa�as de marketing.", "Nuevas oportunidades de negocio.", "Todas las respuestas son correctas.", "4");
            /*15*/      tipo_test("Entre las ventajas del c�digo abierto encontramos que ...", "La evoluci�n del software no depende de un proveedor, sino de la comunidad.", "La evoluci�n del software se hace de forma gen�rica y depende de la comunidad.", "Es un software muy especializado y puede evolucionar en �reas espec�ficas.", "Ninguna respuesta es correcta.", "1");
            /*16*/      tipo_test("En el m�dulo de Empleados de Odoo nos permiten ...", "Gestionar gastos del empleado.", "Gestionar vacaciones del empleado.", "Gestionar evaluaciones del empleado.", "Todas las respuestas con correctas.", "4");
            /*17*/      tipo_test("El dise�o t�cnico ...", "Es creado por los analistas en la fase de an�lisis.", "Es creado por los t�cnicos en la fase de an�lisis.", "Es creado por los analistas en la fase de parametrizaci�n y dise�o.", "Es creado por los t�cnicos en la fase de parametrizaci�n y dise�o.", "4");
            /*18*/      tipo_test("Para la instalaci�n de SAP HANA 2.0 Express Edition en local haciendo uso de una\n        m�quina virtual preconfigurada es necesario:", "Disponer de, al menos, 16GB de memoria RAM.", "Tener instalado Java Runtime Enviroment (JRE) 7.", "Tener, al menos 100GB de espacio libre en el disco duro.", "Ninguna respuesta es correcta.", "4");
            /*19*/      tipo_test("La versi�n de instalaci�n con el instalador ...", "Instalar� en Windows todo lo necesario para ejecutar Odoo (no requiere instalar nada m�s).", "Instalar� en distribuciones Debian todo lo necesario para ejecutar Odoo (no requiere\n    instalar nada m�s)", "Instalar� en distribuciones RPM todo lo necesario para ejecutar Odoo (no requiere\n    instalar nada m�s)", "Ninguna respuesta es correcta.", "1");
            /*20*/      tipo_test("El an�lisis de los beneficios ...", "Puede hacerse en cualquier momento.", "Puede hacerse solo una vez al mes.", "Puede hacerse solo una vez al a�o.", "Puede hacerse solo 4 veces al a�o (una por trimestre).", "1");
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
