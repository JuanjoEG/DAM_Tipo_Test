package _Main_;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Principal {
    
    static int fallos = 0;
    static int aciertos = 0;
    static int contador = 0;

    public static void setFallos(int fallos) {
        Principal.fallos = fallos;
    }

    public static void setAciertos(int aciertos) {
        Principal.aciertos = aciertos;
    }

    public static void setContador(int contador) {
        Principal.contador = contador;
    }
        
    public static void tipo_test (String pregunta, String resp_1, String resp_2, String resp_3, String resp_4, String solucion) {
        
        String miRespuesta;
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
            
            switch (miRespuesta) {
                case "A", "a" -> miRespuesta = "1";
                case "B", "b" -> miRespuesta = "2";
                case "C", "c" -> miRespuesta = "3";
                case "D", "d" -> miRespuesta = "4";
                default -> {
                }
            }            
            
            if (solucion.equals(miRespuesta)) {
                System.out.println("\n***   ***   ***              ¡ ¡ ¡  C O R R E C T O  ! ! !              ***   ***   ***");
                aciertos = (1 + aciertos);
                solucion = "0";
            } else {                    
                System.out.println("\n***   ***   ***          ¡ ¡ ¡  E R R O R  ! ! !          ***   ***   ***");
                fallos = (1 + fallos);
                aciertos = (-1 + aciertos);
            }          
            
        } while ( !"0".equals(solucion) );
        ver_notas();
    }
    
    public static void ver_notas() {
        System.out.println("\n    ACIERTOS  = " + aciertos + "        FALLOS    = " + fallos);       
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
        *  1. INGLES.                                                *
        *  2. ACCESO A DATOS.                                        *
        *  3. SISTEMAS DE GESTIÓN EMPRESARIAL.                       *
        *  4. DESARROLLO DE INTERFACES.                              *
        *  5. EMPRESA E INICIATIVA EMPRENDEDORA                      *
        *  6. PROGRAMACIÓN DE SERVICIOS Y PROCESOS.                  *
        *  7. PROGRAMACIÓN MULTIMEDIA Y DISPOSITIVOS MÓVILES.        *
        *                                                            *
        **************************************************************
        *  0. SALIR.                                                 *
        **************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    case "1" -> English.Test_English.main(args);
                    case "2" -> AccesoDatos.Test_AccesoDatos.main(args);
                    case "3" -> SistemasGestionEmpresarial.Test_SistemasGestionEmpresarial.main(args);
                    case "4" -> DesarrolloInterfaces.Test_DesarrolloInterfaces.main(args);
                    case "5" -> EmpresaIniciativaEmprendedora.Test_EmpresaIniciativaEmprendedora.main(args);
                    case "6" -> ProgramacionServiciosProcesos.Test_ProgramacionServiciosProcesos.main(args);
                    case "7" -> ProgramacionMultimediaDispositivosMoviles.Test_ProgramacionMultimediaDispositivosMoviles.main(args);
                    
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