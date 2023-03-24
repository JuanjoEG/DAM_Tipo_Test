package SistemasGestionEmpresarial;

import _Main_.Menu_Temas;
import java.util.Scanner;
import static _Main_.Principal.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Test_SistemasGestionEmpresarial { 

    public static void Sis_Ges_Emp() {  //   
        
        Menu_Temas.setTema_01("LA GESTI�N EMPRESARIAL.");
        Menu_Temas.setTema_02("ERP-CRM ACTUALES LIBRES Y PROPIETARIOS.");
        Menu_Temas.setTema_03("LOS M�DULOS DE UN ERP.");
        Menu_Temas.setTema_04("EL PROYECTO DE IMPLANTACI�N DE UN ERP.");
        Menu_Temas.setTema_05("EL ENTORNO DE INSTALACI�N DE ERP-CRM.");
        Menu_Temas.setTema_06("TIPOS DE INSTALACIONES DE SISTEMAS ERP-CRM.");
        Menu_Temas.setTema_07("EL FLUJO DE COMPRA-VENTA.");
        Menu_Temas.setTema_08("GESTI�N DE LA FABRICACI�N Y PUNTO DE VENTA.");
        Menu_Temas.setTema_09("ORGANIZACI�N DE LA INFORMACI�N. BASES DE DATOS.");
        Menu_Temas.setTema_10("ADECUACI�N DE UN SISTEMA ERP-CRM A UNA EMPRESA.");
        Menu_Temas.setTema_11("LENGUAJE DE PROGRAMACI�N DE UN SISTEMA ERP-CRM: PYTHON.");
        Menu_Temas.setTema_12("PROGRAMANDO EN PYTHON.");
        Menu_Temas.setTema_13("LOS MECANISMOS INTERNOS DE UN SISTEMA ERP-CRM.");
        Menu_Temas.setTema_14("DESARROLLO DE NUEVOS COMPONENTES I: CREACI�N DE UN M�DULO.");
        Menu_Temas.setTema_15("DESARROLLO DE NUEVOS COMPONENTES II: ADMINISTRACI�N E INFORMES.");
        Menu_Temas.setTema_r1("TEST DE REPASO I.");
        Menu_Temas.setTema_r2("TEST DE REPASO II.");
        
        _Main_.Principal.setAsignatura("SISTEMAS DE GESTI�N EMPRESARIAL");
        
            String menu="";
        do {            
            _Main_.Principal.reseteaNotas();
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            Menu_Temas.menu_temas();
            try {
                System.out.print("Seleccione una opci�n: "); // El ERP Odoo tiene m�dulos que permiten
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
                        
            /*01*/      tipo_test("Al actualizar Odoo con el instalador descargable desde la p�gina oficial de Odoo ...", "Se actualiza Odoo y su base de datos.", "Se actualiza Odoo, su base de datos y el servidor.", "Se actualiza solo Odoo.", "Ninguna respuesta es correcta.", "3");
            /*02*/      tipo_test("Odoo se puede actualizar ...", "Con un instalador descargable desde la web oficial de Odoo.", "Con Docker.", "Con Github.", "Todas las respuestas son correctas.", "4");
            /*03*/      tipo_test("Desde las opciones generales de los ajustes de Odoo podremos ...", "Cambiar el logo de nuestra empresa.", "Cambiar las plantillas de los textos que se env�an en el cuerpo del mail.", "Cambiar las plantillas de los documentos pdf que se adjuntan en los mails.", "Todas las respuestas son correctas.", "4");
            /*04*/      tipo_test("Odoo Studio ...", "Es Open Source.", "Solo se puede usar en la versi�n Enterprise.", "Es una aplicaci�n creada por terceros.", "Ninguna respuesta es correcta.", "2");
            /*05*/      tipo_test("Desde Odoo Studio se puede ...", "Eliminar un m�dulo existente.", "Modificar un m�dulo existente.", "Copiar un m�dulo existente.", "Todas las respuestas son correctas.", "2");
            /*06*/      tipo_test("Al modificar un informe existente desde Odoo Studio ...", "Se pueden agregar campos nuevos que no apunten a ning�n valor de la base de datos.", "Se pueden eliminar campos existentes.", "Se pueden agregar campos nuevos que si apunten a alg�n valor de la base de datos.", "Todas las respuestas son correctas.", "4");
            /*07*/      tipo_test("Desde Odoo Studio ...", "Se puede indicar que un campo aparezca solo si se cumple una condici�n.", "Se puede indicar que un campo sea invisible.", "Se puede indicar que un campo sea obligatorio.", "Todas las respuestas son correctas.", "4");
            /*08*/      tipo_test("Al crear un nuevo m�dulo con Odoo Studio ...", "Se crear� en el panel principal con el resto de los m�dulos.", "Se le podr� crear formularios.", "Se le podr� crear informes.", "Todas las respuestas son correctas.", "4");
            /*09*/      tipo_test("Al crear una vista Kanban en nuestro nuevo m�dulo con Odoo Studio ...", "Debemos crear antes una vista de lista.", "Podremos indicarle por qu� campo se agrupa de manera predeterminada.", "No ser� posible agrupar los campos de manera predeterminada.", "Ninguna respuesta es correcta.", "2");
            /*10*/      tipo_test("Odoo Studio nos permitir� ...", "Crear informes estad�sticos.", "Dise�ar plantillas para informes.", "Agregar campos a la lista de vistas.", "Todas las respuestas son correctas.", "4");                        
                    }
                    case "11" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("�Qui�n fue el creador de Python y a que se debe su nombre?", "Fue creado por Guido Van Rossum y su nombre se debe a la serpiente pit�n.", "Fue creado por Guido Van Rossum y su nombre se debe a los Monty Python, un grupo\n    brit�nico de humoristas.", "Fue creado por Steve Jobs y su nombre se debe a la serpiente pit�n.", "Fue creado por Steve Jobs y su nombre se debe a los Monty Python, un grupo brit�nico\n    de humoristas.", "2");
            /*02*/      tipo_test("Python es un lenguaje de programaci�n ...", "Interpretado, multiparadigma, de alto nivel, de tipado din�mico y fuerte.", "Interpretado, multiparadigma, de bajo nivel, de tipado din�mico y fuerte.", "Interpretado, multiparadigma, de alto nivel, de tipado est�tico y fuerte.", "Interpretado, multiparadigma, de bajo nivel, de tipado din�mico y debil.", "1");
            /*03*/      tipo_test("Python ...", "No es open source.", "No es multiplataforma.", "Es el lenguaje con mayor tasa de crecimiento en los �ltimos a�os.", "Ninguna respuesta es correcta.", "3");
            /*04*/      tipo_test("El terminal de Python ...", "Tiene dos modos de trabajo: interactivo o mediante ejecuci�n de scripts.", "Solo puede ejecutar scripts.", "Solo funciona en modo interactivo.", "Tiene dos modos de trabajo: interactivo o virtual.", "1");
            /*05*/      tipo_test("Pycharm ...", "Es un IDE de Python open source.", "Es un IDE de Python que tiene una versi�n gratuita y otra de pago.", "Es un lenguaje de programaci�n open source.", "Es un lenguaje de programaci�n que tiene una versi�n gratuita y otra de pago.", "2");
            /*06*/      tipo_test("El comando Pip ...", "Es un gestor de paquetes usados para instalar paquetes escritos en Python.", "Se ejecuta dentro del terminal de Python.", "Nos permite abrir Python.", "Ninguna respuesta es correcta.", "1");
            /*07*/      tipo_test("Las listas y las tuplas ...", "Son tipos parecidos, solo que las listas son homog�neas y las tuplas pueden ser\n    heterog�neas.", "Son tipos parecidos, solo que el contenido de las tuplas no se puede modificar.", "Las tuplas no existen en Python.", "Ambas son homogeneas.", "2");
            /*08*/      tipo_test("Las variables ...", "Deben empezar por letras o por '_', no por n�meros.", "Solo pueden tener letras, n�meros y los s�mbolos '_' y '@'.", "Python no es case sensitive.", "Solo pueden tener letras y n�meros.", "1");
            /*09*/      tipo_test("Las constante ...", "Se declaran usando el prefijo const.", "No existen en Python, simplemente se declarar una variable en may�sculas para indicar\n    que es una constante.", "Se declaran usando la funci�n const().", "Ninguna respuesta es correcta.", "2");
            /*10*/      tipo_test("La funci�n input() ...", "Lee el valor introducido por pantalla y lo puede almacenar en una variable que ser� del\n        tipo que el usuario informe, es decir, si informa 23, la variable ser� de tipo entero.", "Siempre devuelve un tipo range.", "Siempre devuelve un tipo string.", "No es posible hacerle un casting a lo que devuelve.", "3");                        
                    }
                    case "12" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("La Indentaci�n es ...", "Innecesaria en Python\n    y consiste en un desfase de una o varias l�neas de c�digo hacia la derecha.", "Imprescindible en Python\n    y consiste en un desfase de una o varias l�neas de c�digo hacia la derecha.", "Innecesaria en Python\n    y consiste en introducir l�neas en blanco entre diferentes instrucciones.", "Imprescindible en Python\n    y consiste en introducir l�neas en blanco entre diferentes instrucciones.", "2");
            /*02*/      tipo_test("La sentencia IF ...", "No puede contener en su interior otra sentencia IF.", "Si no se cumple la condici�n del IF,\n    comprueba si se cumple la condici�n del ELIF y sino realiza el ELSE.", "Si se cumple la condici�n del IF,\n    comprueba si se cumple la condici�n del ELIF y sino realiza el ELSE.", "Ninguna respuesta es correcta.", "2");
            /*03*/      tipo_test("El bucle WHILE ...", "Repite la instrucci�n un n�mero par de veces.", "No termina hasta que no se encuentra con la instrucci�n break.", "Requiere del s�mbolo ':' tras la condici�n.", "Ninguna respuesta es correcta.", "3");
            /*04*/      tipo_test("El bucle FOR ...", "No termina hasta que no se encuentra con la instrucci�n break.", "Se usa solo para iterar sobre secuencias (lista, tupla, diccionario, cadena, ...)\n    en el orden en el que aparecen los elementos en la secuencia.", "Se usa solo para iterar sobre secuencias (lista, tupla, diccionario, cadena, ...)\n    en un orden aleatorio.", "Ninguna respuesta es correcta.", "2");
            /*05*/      tipo_test("En el control de errores de Python ...", "Si existe bloque 'finally', �ste siempre se ejecuta al final.", "Si existe bloque 'except', �ste siempre se ejecuta al final.", "No es necesario indicar 'try' para capturar el error.", "Ninguna respuesta es correcta.", "1");
            /*06*/      tipo_test("Python estructura el c�digo de la siguiente manera ...", "Las funciones est�n incluidas en m�dulos y �stos a su vez incluidos en paquetes o librer�as.", "Los m�dulos est�n incluidos en funciones y �stos a su vez incluidos en paquetes o librer�as.", "Los paquetes o librer�as est�n incluidas en m�dulos y �stos a su vez incluidos en funciones.", "Ninguna respuesta es correcta.", "1");
            /*07*/      tipo_test("Si tenemos la cadena cad = 'Esto es una prueba' �Qu� imprimir� print(cad[-7:-1])?", "'prueb'.", "' prueb'.", "'a prueb'.", "'na prueb'.", "2");
            /*08*/      tipo_test("Al abrir un fichero con el modo 'w' ...", "Si existe,\n    al escribir en �l con write() agrega la informaci�n al final.", "Si existe,\n    al escribir en �l con write() machaca todo el contenido del fichero con la nueva informaci�n.", "El modo 'w' no existe.", "Ninguna respuesta es correcta.", "2");
            /*09*/      tipo_test("Al crear una clase en Python ...", "Es recomendable definir su m�todo __init__().", "Es obligatorio definir su m�todo __init__().", "No se debe definir su m�todo __init__().", "Los criterios elevados de seguridad.", "1");
            /*10*/      tipo_test("Al crear un m�todo ...", "Siempre debe crearse un par�metro, como primer par�metro, que haga referencia a la\n    instancia actual de la clase que se est� llamando.", "No es necesario crear un par�metro que haga referencia a la instancia actual de la clase\n    que se est� llamando.", "Siempre debe crearse un par�metro, en cualquier posici�n del m�todo, que haga\n    referencia a la instancia actual de la clase que se est� llamando.", "Ninguna respuesta es correcta.", "1");                        
                    }
                    case "13" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Odoo utiliza una arquitectura ...", "Cliente/servidor en la que los servidores son navegadores web que acceden al cliente\n    Odoo a trav�s de RPC.", "En capas en la que los clientes son navegadores web que acceden al servidor Odoo\n    a trav�s de RPC.", "Cliente/servidor en la que los clientes son navegadores web que acceden al servidor\n    Odoo a trav�s de RPC.", "En capas en la que los servidores son navegadores web que acceden al cliente Odoo\n    a trav�s de RPC.", "3");
            /*02*/      tipo_test("Un m�dulo, requiere tener en su interior al menos ...", "Los archivos '__manifest__.py' e '__init__.py'. ", "El archivo '__manifest__.py'.", "El archivo '__init__.py'.", "Ninguna respuesta es correcta.", "1");
            /*03*/      tipo_test("El archivo '__manifest__.py' sirve para ...", "Declarar un paquete de Python como un m�dulo Odoo.", "Especificar metadatos del m�dulo.", "Mostrar el m�dulo dentro de la lista de aplicaciones Odoo.", "Todas las respuestas son correctas.", "4");
            /*04*/      tipo_test("Los m�dulos con los que trabajar� nuestro Odoo ...", "Se encuentran en el directorio que se especifique en el 'modules_path' del archivo de\n    configuraci�n de odoo (odoo.conf) y solo puede ser un directorio.", "Se encuentran en el directorio que se especifique en el 'addons_path' del archivo de\n    configuraci�n de odoo (odoo.conf) y pueden ser varios directorios.", "No es necesario especificar donde se encuentra en el archivo de configuraci�n de odoo,\n    simplemente bastar� con incluirlos en la carpeta addons.", "No es necesario especificar donde se encuentra en el archivo de configuraci�n de odoo,\n    simplemente bastar� con incluirlos en la carpeta modules.", "2");
            /*05*/      tipo_test("Los modelos ...", "Son las tablas de la base de dato de un m�dulo.", "Son una manera de relacionar el programa con la base de datos.", "Son archivos XML.", "Ninguna respuesta es correcta.", "2");
            /*06*/      tipo_test("Los archivos de datos ...", "Son archivos Python que se almacenan en al base de datos.", "Son archivos XML con elementos <record>, siendo cada elemento <record> un registro\n    de base de datos.", "No pueden tener formato CSV.", "Ninguna respuesta es correcta.", "2");
            /*07*/      tipo_test("Las vistas en Odoo ...", "Son la forma en la que se representan los registros de los modelos para ser mostradas\n    a los usuarios finales.", "Se especifican en XML.", "Pueden ser Kanban.", "Todas las respuestas son correctas.", "4");
            /*08*/      tipo_test("Los modelos pueden relacionarse entre s� ...", "Con relaciones many2one, one2many y many2many.", "Con relaciones m2o, o2m y m2m.", "Con relaciones ManyToOne, OneToMany y ManyToMany.", "Con relaciones mto, otm y mtm.", "1");
            /*09*/      tipo_test("El motor de informes o reports de Odoo utiliza ...", "Qweb.", "Twitter Bootstrap.", "Wkhtmltopdf.", "Todas las respuestas son correctas.", "4");
            /*10*/      tipo_test("Los campos calculados, al declararlos ...", "Necesitan de un atributo 'calculate' con el nombre del m�todo.", "Necesitan de un atributo 'calculated_field' con el nombre del m�todo.", "Necesitan de un atributo 'compute' con el nombre del m�todo.", "Ninguna respuesta es correcta.", "3");                        
                    }
                    case "14" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Al crear un repositorio nuevo para incluir todos los m�dulos personalizados ...", "Es recomendable agregar la ruta del nuevo repositorio al addons_path del fichero de\n    configuraci�n 'odoo.conf'.", "Se debe agregar la ruta del nuevo repositorio al fichero manifest.", "Se debe agregar la ruta del nuevo repositorio al addons_path del fichero de\n    configuraci�n 'odoo.conf'.", "Es recomendable agregar la ruta del nuevo repositorio al fichero manifest.", "3");
            /*02*/      tipo_test("El comando scaffold ...", "Facilita la creaci�n de un nuevo m�dulo y su uso es obligatorio en esos casos.", "Facilita la creaci�n de un nuevo modelo y su uso no es obligatorio en esos casos.", "Facilita la creaci�n de un nuevo m�dulo y su uso no es obligatorio en esos casos.", "Ninguna respuesta es correcta.", "3");
            /*03*/      tipo_test("El campo 'depends' del fichero manifest.py en un m�dulo ...", "Se informa con los m�dulos que necesita el nuevo m�dulo para funcionar,\n    pudiendo tener uno o varios.", "Se informa con los modelos que necesita el nuevo m�dulo para funcionar,\n    pudiendo tener uno o varios.", "Se informa con los m�dulos que necesita el nuevo m�dulo para funcionar,\n    pudiendo estar vac�o, tener uno o varios.", "Se informa con los modelos que necesita el nuevo m�dulo para funcionar,\n    pudiendo estar vac�o, tener uno o varios.", "3");
            /*04*/      tipo_test("Para que un nuevo m�dulo aparezca en la lista de aplicaciones de Odoo ...", "Bastar� con crearlo, por ejemplo, con PyCharm, informar correctamente el manifest y ya\n    aparecer� en la lista.", "Deberemos crearlo, por ejemplo, con PyCharm, sin necesidad de informar el manifest y\n    actualizar la lista de aplicaciones.", "Deberemos crearlo, por ejemplo, con PyCharm, informar correctamente el manifest\n    y actualizar la lista de aplicaciones.", "Ninguna respuesta es correcta.", "3");
            /*05*/      tipo_test("Con la herencia ...", "Modificamos directamente el c�digo de un m�dulo existente.", "En lugar de modificar un m�dulo existente, creamos un nuevo m�dulo para realizar las\n    modificaciones oportunas (agregar o quitar funcionalidad) sobre el original.", "Creamos un m�dulo copia del original el cu�l podemos editar sin necesidad de tocar el original.", "Ninguna respuesta es correcta.", "2");
            /*06*/      tipo_test("Para heredar un modelo ...", "Se deber� crear la clase como en la declaraci�n del objeto original sin informar el\n    atributo _inherit.", "Se deber� crear la clase como en la declaraci�n del objeto original e informar el atributo\n    _inherit con el modelo del que se hereda.", "Se deber� crear la clase como en la declaraci�n del objeto original e informar el atributo\n    _inherit con el modelo actual.", "Ninguna respuesta es correcta.", "2");
            /*07*/      tipo_test("Para heredar una vista ...", "Se deber� informar la etiqueta 'inherit' del XML con el ID externo de la vista de la que\n    queremos heredar.", "Se deber� informar la etiqueta 'inherit_id' del XML con el ID externo de la vista de la que\n    queremos heredar.", "Se deber� informar la etiqueta 'inherit' del XML con el nombre de la vista de la que\n    queremos heredar.", "Ninguna respuesta es correcta.", "2");
            /*08*/      tipo_test("El log de Odoo ...", "Se informa en el fichero que se encuentra en el par�metro logfile del archivo odoo.conf\n    si este par�metro est� informado.", "Se informa en el stdout en PyCharm si el par�metro logfile del archivo odoo.conf no est�\n    informado.", "Indicar� la informaci�n de los logs que se produzcan en Odoo en el nivel que se indique\n    en el par�metro log_handler del archivo odoo.conf.", "Todas las respuestas son correctas.", "4");
            /*09*/      tipo_test("Los niveles del log_handler pueden ser ...", "critical, error, warning, info, debug, notset.", "error, warning, info, debug, notset.", "critical, error, warning, info, debug.", "Ninguna respuesta es correcta.", "1");
            /*10*/      tipo_test("PyCharm informa que hay un error sint�ctico en el c�digo ...", "Mediante una exclamaci�n roja en la parte superior derecha del editor.", "Subrayando en rojo en la barra de desplazamiento vertical la l�nea err�nea.", "Indicando una explicaci�n del error en la l�nea roja ubicada en la barra de desplazamiento\n    vertical.", "Todas las respuestas son correctas.", "1");                       
                    }
                    case "15" -> {
                        _Main_.Principal.setTema(menu);
                        
            /*01*/      tipo_test("Una forma de ver qu� modelo usa un formulario es ...", "Pulsando en el 'insecto' y en 'obtener campos de vista'.", "Pulsando en el 'insecto' y en 'comenzar recorrido'.", "Pulsando en el 'insecto' y en 'abrir vista'.", "Ninguna respuesta es correcta.", "4");
            /*02*/      tipo_test("Para agregar un campo a la vista desde Odoo ...", "Pulsaremos en el 'insecto' y en 'obtener campos de vista'.", "Pulsaremos en el 'insecto' y en 'editar vista: formulario'.", "Pulsaremos en el 'insecto' y en 'abrir vista'.", "Ninguna respuesta es correcta.", "2");
            /*03*/      tipo_test("La extracci�n de datos desde el bot�n 'Exportar' ...", "Puede exportar los datos solo en CSV.", "Puede exportar los datos solo en XLSX.", "Puede exportar los datos en XLSX y CSV.", "Ninguna respuesta es correcta.", "3");
            /*04*/      tipo_test("Los grupos en Odoo ...", "Son m�dulos asignables a usuarios.", "Son bloques donde encapsular una serie de reglas y permisos para luego ser asignados a usuarios.", "Son un conjunto de usuarios que realizan la misma tarea.", "Ninguna respuesta es correcta.", "2");
            /*05*/      tipo_test("En Odoo ...", "Ya existen una serie de grupos por defecto.", "Un usuario puede tener asignado varios grupos.", "Al instalar un m�dulo se crean unos grupos por defecto con permisos para dicho m�dulo.", "Todas las respuestas son correctas.", "4");
            /*06*/      tipo_test("El tipo de usuario que nos permite gestionarle los permisos es ...", "Usuario interno.", "Portal.", "P�blico.", "Ninguna respuesta es correcta.", "1");
            /*07*/      tipo_test("Los permisos sobre objetos de Odoo que podremos habilitar/deshabilitar son:", "Permiso para leer, escribir, crear y eliminar.", "Permiso para leer y escribir.", "Permiso para crear y eliminar.", "Ninguna respuesta es correcta.", "1");
            /*08*/      tipo_test("Un informe QWeb ...", "Es un archivo Python que contiene una etiqueta report_type = 'qweb-pdf'.", "Es un archivo XML que contiene una etiqueta report_type = 'qweb-pdf'.", "Es un archivo CSV que contiene una etiqueta report_type = 'qweb-pdf'.", "Ninguna respuesta es correcta.", "2");
            /*09*/      tipo_test("Para solventar el error de que no se creen las tablas en PostgreSQL al olvidarnos\n        importar los modelos de Python ...", "Bastar� con importar en el fichero __init__.py de la ra�z del m�dulo la carpeta models\n    que contiene todos los modelos.", "Bastar� con importar en el fichero __init__.py de la carpeta models los modelos\n    que queremos que se carguen.", "Ser� necesario importar en el fichero __init__.py de la ra�z del m�dulo la carpeta models\n    que contiene todos los modelos, y en el __init__.py de la carpeta models tambi�n se\n    deben importan los modelos que queremos que realmente se carguen.", "Ninguna respuesta es correcta.", "3");
            /*10*/      tipo_test("Si al instalar o actualizar un m�dulo, �ste se instala correctamente pero no se\n        visualizan los cambios de una nueva vista que hemos creado que hereda de otra,\n        puede ser debido a ...", "Que nos hayamos olvidado de indicar las dependencias en la secci�n 'depends'\n    del manifest.", "Que hayamos indicado las dependencias en la secci�n 'depends' del manifest.", "Que nos hayamos olvidado de agregar en el manifest, en la secci�n 'data', la vista\n    que hayamos creado nueva.", "Que hayamos agregado en el manifest, en la secci�n 'data', la vista que hayamos\n    creado nueva.", "3");                        
                    }
                    case "40" -> SistemasGestionEmpresarial.Test_Rep_I_Sis_Ges_Emp.test_Repaso();
                    case "50" -> SistemasGestionEmpresarial.Test_Rep_II_Sis_Ges_Emp.test_Repaso();
                    
                    case "0" -> {}
                    default -> miDefault();
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));
    }    
}