package _Main_;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Principal {
    
    static boolean salida = false;
    static int fallos = 0;
    static int aciertos = 0;
    static int contador = 0;
    static String tema = "0";
    static String asignatura =" ";
    static int lentitud =12;       // RANGO ACONSEJADO:  ( 5-> MUY RÁPIDO  -  20-> MUY LENTO )

    public static void setFallos(int fallos) {
        Principal.fallos = fallos;
    }

    public static void setAciertos(int aciertos) {
        Principal.aciertos = aciertos;
    }

    public static void setContador(int contador) {
        Principal.contador = contador;
    }

    public static void setTema(String tema) {
        Principal.tema = tema;
    }

    public static void setAsignatura(String asignatura) {
        Principal.asignatura = asignatura;
    }    
    
    public static void tipo_test (String pregunta, String resp_1, String resp_2, String resp_3, String resp_4, String solucion) {
        
        String miRespuesta;
        String resp_correcta;
        contador = (1 + contador);
    
        do {            
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            
            System.out.println("\n*************************************************************************************************");
            System.out.println("  " + contador+ ".- : " + pregunta);
            System.out.println("*************************************************************************************************");
            System.out.println("\nA.- " + resp_1);
            System.out.println("\nB.- " + resp_2);
            System.out.println("\nC.- " + resp_3);
            System.out.println("\nD.- " + resp_4);
            System.out.println("\n*************************************************************************************************");
            System.out.println("RESPONDE CON:               -  A  B  C  D  -  a  b  c  d  -  1  2  3  4  -");
            System.out.println("*************************************************************************************************\n");
            System.out.print("Indica tu respuesta: ");
            miRespuesta = teclaStr.nextLine();
            
            for (int i=0; i<20; i++) {
                //esperar(2);
                System.out.println("");
            }
            
            switch (miRespuesta) {
                case "A", "a", "1" -> miRespuesta = "1";
                case "B", "b", "2" -> miRespuesta = "2";
                case "C", "c", "3" -> miRespuesta = "3";
                case "D", "d", "4" -> miRespuesta = "4";
                case "0" -> salida = true;
                default ->  miRespuesta = "no_existe";               
            }
            
            switch (solucion) {
                case "1" -> resp_correcta = resp_1;
                case "2" -> resp_correcta = resp_2;
                case "3" -> resp_correcta = resp_3;
                case "4" -> resp_correcta = resp_4;
                default -> resp_correcta = " ";
            }
            
            if (miRespuesta.equals(solucion)) {
                System.out.println("\n***   ***   ***              ¡ ¡ ¡  C O R R E C T O  ! ! !              ***   ***   ***");
                System.out.println("*************************************************************************************************");
                System.out.println("    " + resp_correcta);
                System.out.println("*************************************************************************************************");
                aciertos = (1 + aciertos);
                salida = true;
            } else if (miRespuesta.equals("no_existe")) {
                System.out.println("¡ ¡ ¡   L A  O P C I Ó N   S E L E C C I O N A D A   N O   E X I S T E   ! ! ! ");
                salida = false;
            } else if (miRespuesta.equals("0")) {
                fallos = (1 + fallos);
                aciertos = (-1 + aciertos);
                salida = false;
            } else {                    
                System.out.println("\n***   ***   ***          ¡ ¡ ¡  E R R O R  ! ! !          ***   ***   ***");
                fallos = (1 + fallos);
                aciertos = (-1 + aciertos);
                salida = false;
            }
            
            for (int i=0; i<20; i++) {
                //esperar(2);
                System.out.println("");
            }
            
            esperar(250);
            
            for (int i=0; i<20; i++) {
                //esperar(2);
                System.out.println("");
            }
            
            ver_notas();
            
        } while ( !salida );       
                
    }
    
    public static void ver_notas() {
        System.out.println("\n" + asignatura + "       TEMA: " + tema + "       ACIERTOS  = " + aciertos + "       FALLOS    = " + fallos);       
    }

    public static void main(String[] args) {
        
                String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        **************************************************************
        * ENCODING PROJECT ISO-8859-1                                *
        **************************************************************
        *                           TEST                             *
        **************************************************************
        *                                                            *
        *  1. ACCESO A DATOS.                                        *
        *  2. DESARROLLO DE INTERFACES.                              *
        *  3. EMPRESA E INICIATIVA EMPRENDEDORA                      *
        *  4. INGLES.                                                *
        *  5. PROGRAMACIÓN MULTIMEDIA Y DISPOSITIVOS MÓVILES.        *
        *  6. PROGRAMACIÓN DE SERVICIOS Y PROCESOS.                  *
        *  7. SISTEMAS DE GESTIÓN EMPRESARIAL.                       *
        *                                                            *
        **************************************************************
        *  0. SALIR.                                                 *
        **************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> AccesoDatos.Test_AccesoDatos.main(args);
                    case "2" -> DesarrolloInterfaces.Test_DesarrolloInterfaces.main(args);
                    case "3" -> EmpresaIniciativaEmprendedora.Test_EmpresaIniciativaEmprendedora.main(args);
                    case "4" -> English.Test_English.main(args);
                    case "5" -> ProgramacionMultimediaDispositivosMoviles.Test_ProgramacionMultimediaDispositivosMoviles.main(args);
                    case "6" -> ProgramacionServiciosProcesos.Test_ProgramacionServiciosProcesos.main(args);
                    case "7" -> SistemasGestionEmpresarial.Test_SistemasGestionEmpresarial.main(args);
                    
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

    private static void esperar(int segundos) {
        try {            
            Thread.sleep(segundos*lentitud);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}