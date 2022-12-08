package SistemasGestionEmpresarial;

import _Main_.Menu_Temas;
import static _Main_.Principal.esperar;
import static _Main_.Principal.meterEspacios;
import java.util.Scanner;
import static _Main_.Principal.tipo_test;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Test_SistemasGestionEmpresarial { 

    public static void Sis_Ges_Emp() {
        
        Menu_Temas.setTema_01("LA GESTI�N EMPRESARIAL.");
        Menu_Temas.setTema_02("ERP-CRM ACTUALES LIBRES Y PROPIETARIOS.");
        Menu_Temas.setTema_03("LOS M�DULOS DE UN ERP.");
        Menu_Temas.setTema_04("EL PROYECTO DE IMPLANTACI�N DE UN ERP.");
        Menu_Temas.setTema_05("EL ENTORNO DE INSTALACI�N DE ERP-CRM.");
        Menu_Temas.setTema_06("TIPOS DE INSTALACIONES DE SISTEMAS ERP-CRM.");
        Menu_Temas.setTema_07("EL FLUJO DE COMPRA-VENTA.");
        Menu_Temas.setTema_08("GESTI�N DE LA FABRICACI�N Y PUNTO DE VENTA.");
        Menu_Temas.setTema_09("ORGANIZACI�N DE LA INFORMACI�N. BASES DE DATOS.");
        Menu_Temas.setTema_10("");
        Menu_Temas.setTema_11("");
        Menu_Temas.setTema_12("");
        Menu_Temas.setTema_13("");
        Menu_Temas.setTema_14("");
        Menu_Temas.setTema_15("");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
        
        _Main_.Principal.setAsignatura("SISTEMAS DE GESTI�N EMPRESARIAL");
        
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
                         _Main_.Principal.setTema(menu);
        
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
                        _Main_.Principal.setTema(menu);
                        
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
                        _Main_.Principal.setTema(menu);                      
                        
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
                        _Main_.Principal.setTema(menu);
                        
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
                        _Main_.Principal.setTema(menu);
                        
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
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Para realizar un flujo de compra-venta es necesario hacer uso ...", "De los m�dulos de compra y de venta.", "Del m�dulo de inventario.", "Del m�dulo de contabilidad.", "Todas las respuestas son correctas.", "4");
            /*02*/      tipo_test("Cuando creamos por primera vez un producto ...", "Podremos indicarle el stock que tenemos durante la creaci�n.", "�ste se crea con cantidad 0.", "�ste se crea con cantidad 1.", "Ninguna respuesta es correcta.", "2");
            /*03*/      tipo_test("Al comprar un producto, el stock ...", "Se actualiza al crear el documento de compra.", "Se actualiza al confirmar la recepci�n del producto.", "No se actualiza, solo se actualiza al vender.", "Ninguna respuesta es correcta.", "2");
            /*04*/      tipo_test("Para confirmar la recepci�n de un producto ...", "Se puede hacer desde el m�dulo de inventario.", "Se puede hacer desde la secci�n 'recepciones' del m�dulo de inventario.", "Antes, se debe indicar en la columna ?Hecho? la cantidad que se ha recibido.", "Todas las respuestas son correctas.", "4");
            /*05*/      tipo_test("Tras realizar la compra de un producto ...", "Deberemos registrar la factura de compra haciendo uso del m�dulo de contabilidad.", "Deberemos registrar la factura de compra haciendo uso del m�dulo de inventario.", "Deberemos registrar la factura de compra haciendo uso del m�dulo de venta.", "Ninguna respuesta es correcta.", "1");
            /*06*/      tipo_test("Con respecto a los pedidos de ventas ...", "El cliente no tiene por qu� aceptarnos el presupuesto de ventas para que �ste sea enviado.", "Una vez creado el pedido de ventas, �ste se env�a autom�ticamente al cliente.", "No es necesario indicar la cantidad que el cliente necesita, ya viene informada.", "Ninguna respuesta es correcta.", "4");
            /*07*/      tipo_test("El env�o del pedido de ventas al cliente ...", "Se hace despu�s de crear el pedido de ventas.", "Puede hacerse desde el m�dulo de inventario.", "Se debe indicar en la columna 'Hecho' la cantidad que se ha enviado.", "Todas las respuestas son correctas.", "4");
            /*08*/      tipo_test("Con respecto a la factura de ventas del cliente ...", "Podremos generarla desde el m�dulo de compras.", "Podremos diferenciar entre 'factura regular' (factura solo una parte) o 'dep�sito'\n    (factura toda la cantidad).", "Podremos enviarla adjunta por correo al cliente desde el m�dulo de ventas.", "Todas las respuestas son correctas.", "3");
            /*09*/      tipo_test("El registro del pago de la factura del cliente ...", "Puede hacerse dese el m�dulo de ventas.", "Puede hacerse dese el m�dulo de contabilidad.", "Se hace despu�s de recibir el abono del pedido de ventas.", "Todas las respuestas son correctas.", "4");
            /*10*/      tipo_test("El an�lisis de los beneficios ...", "Puede hacerse en cualquier momento.", "Puede hacerse solo una vez al mes.", "Puede hacerse solo una vez al a�o.", "Puede hacerse solo 4 veces al a�o (una por trimestre).", "1");                       
                    }
                    case "8" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Los productos que se venden en el punto de venta ...", "Pueden ser cargados de forma masiva desde un fichero.", "No pueden ser cargados de forma masiva desde un fichero.", "Pueden ser cargados de forma masiva desde un fichero, pero solo de los que tengamos stock.", "Pueden ser cargados de forma masiva desde un fichero, pero solo los que haya fabricado\n    nuestra empresa.", "1");
            /*02*/      tipo_test("Para poder vender un producto en un punto de ventas ...", "�ste debe tener marcado el flag de \"disponible en PdV\".", "�ste debe tener marcado el flag de \"disponible en TPV\".", "�ste debe tener marcado el flag de \"disponible en ITV\".", "Ninguna respuesta es correcta.", "1");
            /*03*/      tipo_test("En Odoo, si tenemos varios PdV con conexi�n a internet para centralizar las\n        transacciones y perdemos la conexi�n a internet ...", "No podremos hacer uso del PdV.", "Podremos hacer uso del PdV, almacen�ndose las transacciones en memoria y\n    sincroniz�ndose una vez que volvamos a tener conexi�n.", "Podremos hacer uso del PdV, pero tendremos que anotarlas en un documento para luego\n    cargarlas manualmente.", "Ninguna respuesta es correcta.", "2");
            /*04*/      tipo_test("En el m�dulo de Odoo de punto de ventas ...", "No hay modo de controlar el dinero en efectivo de la caja.", "El �nico modo de controlar el dinero en efectivo de la caja es cont�ndolo antes de la\n    apertura del PdV y despu�s del cierre del mismo y amont�ndolo en un documento para\n    compararlo al d�a siguiente.", "Se puede controlar siempre y cuando tengamos un caj�n de monedas y billetes que\n    disponga de un contador de efectivo.", "Ninguna respuesta es correcta.", "4");
            /*05*/      tipo_test("Para devolver un producto ...", "Se recomienda hacerlo en el back-end, es decir, mediante una cancelaci�n de la venta en\n    el m�dulo de venta.", "Se recomienda hacerlo en el front-end, es decir, creando una venta en negativo en el\n    m�dulo de Punto de venta.", "Se recomienda hacerlo en el back-end, es decir, mediante una cancelaci�n de la venta en\n    el m�dulo de contabilidad.", "Ninguna respuesta es correcta.", "2");
            /*06*/      tipo_test("Para hacer uso del m�dulo de fabricaci�n ...", "Es necesario tener el m�dulo de Calidad.", "Es necesario tener el m�dulo de Inventario.", "Es necesario tener el m�dulo de Punto de venta.", "Ninguna respuesta es correcta.", "2");
            /*07*/      tipo_test("Para fabricar un producto ...", "Es necesario crear su lista de materiales.", "Es necesario marcar el flag de \"Fabricar\".", "Es necesario tener stock de los materiales necesarios.", "Todas las respuestas son correctas.", "4");
            /*08*/      tipo_test("Las rutas de producci�n ...", "Permiten fabricar un producto en una cadena de producci�n con diferentes equipos y\n    hacer un seguimiento de la fabricaci�n.", "Nos aseguran que siempre habr� stock de materiales para fabricar un producto.", "Permiten enviar los pedidos fabricados a los clientes por diferentes rutas.", "Ninguna respuesta es correcta.", "1");
            /*09*/      tipo_test("Las rutas de producci�n ...", "No tienen por qu� tener centros de producci�n.", "Deben tener centros de producci�n.", "Deben tener centros de tareas.", "No tienen por qu� tener centros de tareas.", "2");
            /*10*/      tipo_test("Las operaciones ...", "Se realizan en centros de producci�n y una ruta puede tener varias operaciones.", "Se realizan en centros de tareas y una ruta puede tener varias operaciones.", "Se realizan en centros de producci�n y una ruta puede tener solo una operaci�n.", "Se realizan en centros de tareas y una ruta puede tener solo una operaci�n.", "1");                        
                    }
                    case "9" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("El sistema gestor de base de datos que usa Odoo es ...", "MySQL.", "PostgreSQL.", "SQL Server.", "MongoDB.", "2");
            /*02*/      tipo_test("En el archivo odoo.conf, entre otros datos, podemos encontrar ...", "El usuario de la base de datos.", "La contrase�a de la base de datos.", "El puerto al que se conecta la base de datos.", "Todas las respuestas son correctas.", "4");
            /*03*/      tipo_test("PgAdmin ...", "Es una aplicaci�n que se usa para gestionar, administrar y desarrollar la base de datos de\n    PostgreSQL.", "Es un m�dulo de Odoo que se usa para gestionar, administrar y desarrollar la base de\n    datos de PostgreSQL.", "Es un apartado de los ajustes de Odoo, que se habilita al entrar en modo desarrollador y\n    que se usa para gestionar, administrar y desarrollar la base de datos de PostgreSQL.", "Ninguna respuesta es correcta.", "1");
            /*04*/      tipo_test("Al realizar un cambio en la base de datos con PgAdmin ...", "�ste no se refleja en Odoo.", "�ste no se refleja en Odoo hasta que no naveguemos a la ventana concreta donde\n    hemos realizado el cambio.", "�ste se refleja en Odoo.", "Ninguna respuesta es correcta.", "3");
            /*05*/      tipo_test("Para ver las tablas en PgAdmin deberemos desplegar la siguiente ruta del �rbol:", "servidor / base de datos / schemas / public / tables.", "base de datos / servidor / schemas / public / tables.", "tables / public / schemas / base de datos / Servidor.", "schemas / servidor / base de datos / public / tables.", "1");
            /*06*/      tipo_test("En PgAdmin podremos realizar una monitorizaci�n en tiempo real del estado del\n        servidor de la base de datos haciendo uso ...", "Del Open Developer Tools.", "Del Query Tool.", "Del dashboard.", "Ninguna respuesta es correcta.", "3");
            /*07*/      tipo_test("Para ver las opciones t�cnicas y otras ayudas para los desarrolladores en Odoo ...", "Es necesario entrar en el modo funcional.", "Es necesario entrar en el modo t�cnico.", "Es necesario entrar en el modo programador.", "Ninguna respuesta es correcta.", "4");
            /*08*/      tipo_test("Desde la herramienta 'Query Tool' de PgAdmin es posible ...", "Modificar un dato de la base de datos.", "Insertar un dato en la base de datos.", "Visualizar un dato en la base de datos.", "Todas las respuestas son correctas.", "4");
            /*09*/      tipo_test("En Odoo podemos encontrarnos con relaciones entre tablas ...", "Many2one: tipo de campo que almacena una relaci�n de muchos (n) a uno (1).", "One2Many: tipo de campo que almacena una relaci�n de uno (1) a muchos (m).", "Many2many: tipo de campo que almacena una relaci�n de muchos (m) a muchos (n).", "Todas las respuestas son correctas.", "4");
            /*10*/      tipo_test("Cuando la base de datos es muy grande, no se recomienda realiza backups con ...", "El propio gestor de bases de datos de la interface que nos proporciona Odoo.", "El comando pg_dump que ofrece PostgreSQL.", "PgAdmin.", "La herramienta de terceros 'Database auto-backup'.", "1");                       
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
                        SistemasGestionEmpresarial.Test_Rep_I_Sis_Ges_Emp.Sis_Ges_Emp();
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
