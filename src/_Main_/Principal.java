package _Main_;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class Principal {
    
    private static boolean salida = false;
    private static double fallos, aciertos, contador, en_blanco, nota;
    private static int cont, aciert, fall, en_bl;
    private static String tema, asignatura;
    private static long inicio, fin, milisegundos;
    private static int horas, minutos, segundos, resto_horas;
    
        
    public static void main(String[] args) {
        
        Menu_Asignaturas.setTitulo("---   ENCODING PROJECT ISO-8859-1   ---   2ºDAM   ---   TEST   ---");
        Menu_Asignaturas.setAsig_01("ACCESO A DATOS.");
        Menu_Asignaturas.setAsig_02("DESARROLLO DE INTERFACES.");
        Menu_Asignaturas.setAsig_03("EMPRESA E INICIATIVA EMPRENDEDORA.");
        Menu_Asignaturas.setAsig_04("INGLES.");
        Menu_Asignaturas.setAsig_05("PROGRAMACIÓN MULTIMEDIA Y DISPOSITIVOS MÓVILES.");
        Menu_Asignaturas.setAsig_06("PROGRAMACIÓN DE SERVICIOS Y PROCESOS.");
        Menu_Asignaturas.setAsig_07("SISTEMAS DE GESTIÓN EMPRESARIAL.");
        
        setInicio(System.currentTimeMillis());
        
            String menu="";
        do {
            reseteaNotas();
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            
            Menu_Asignaturas.menu_asignaturas();
            
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(15);
                switch (menu) {
                    case "1" -> AccesoDatos.Test_AccesoDatos.Acc_Dat();
                    case "2" -> DesarrolloInterfaces.Test_DesarrolloInterfaces.Des_Int();
                    case "3" -> EmpresaIniciativaEmprendedora.Test_EmpresaIniciativaEmprendedora.Emp_Ini_Emp();
                    case "4" -> English.Test_English.Eng();
                    case "5" -> ProgramacionMultimediaDispositivosMoviles.Test_ProgramacionMultimediaDispositivosMoviles.Pro_Mul_Dis_Mov();
                    case "6" -> ProgramacionServiciosProcesos.Test_ProgramacionServiciosProcesos.Pro_Ser_Pro();
                    case "7" -> SistemasGestionEmpresarial.Test_SistemasGestionEmpresarial.Sis_Ges_Emp();
                    
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
            } finally {
                
            }
        } while (!"0".equals(menu));
    }

    public static String getAsignatura() {
        return asignatura;
    }
        
    public static void setNota(double nota) {
        Principal.nota = nota;
    }

    public static void setFallos(double fallos) {
        Principal.fallos = fallos;
    }

    public static void setAciertos(double aciertos) {
        Principal.aciertos = aciertos;
    }

    public static void setContador(double contador) {
        Principal.contador = contador;
    }

    public static void setTema(String tema) {
        Principal.tema = tema;
        _Main_.Principal.setInicio(System.currentTimeMillis());
    }

    public static void setAsignatura(String asignatura) {
        Principal.asignatura = asignatura;
    }    

    public static void setEn_blanco(double en_blanco) {
        Principal.en_blanco = en_blanco;
    }

    public static void setInicio(long inicio) {
        Principal.inicio = inicio;
    }

    public static void setFin(long fin) {
        Principal.fin = fin;
    }

    public static void setCont(int cont) {
        Principal.cont = cont;
    }

    public static void setAciert(int aciert) {
        Principal.aciert = aciert;
    }

    public static void setFall(int fall) {
        Principal.fall = fall;
    }

    public static void setEn_bl(int en_bl) {
        Principal.en_bl = en_bl;
    }
    
    
    
    public static void tipo_test (String pregunta, String resp_1, String resp_2, String resp_3, String resp_4, String soluc) {
        
        // DESORDENAMOS LAS RESPUESTAS PARA NO GENERAR VICIOS REPETITIVOS
        int[] arr = new int[] {1,2,3,4};
        int aleatorio[] = generarOrden(arr);  
        String respuesta_1 = " ", respuesta_2 = " ", respuesta_3 = " ", respuesta_4 = " ", solucion = " ";
                
        int ale_01 = aleatorio[0];
        int ale_02 = aleatorio[1];
        int ale_03 = aleatorio[2];
        int ale_04 = aleatorio[3];
        // DEPENDIENDO DE COMO SE DESORDENEN LAS RESPUESTAS, TAMBIÉN HAY QUE REORGANIZAR LA SOLUCIÓN
       switch (ale_01) {       
           case 1 -> {
               respuesta_1 = resp_1;               
               switch (soluc) {       
                    case "1" -> solucion = "1";
               }
           }
           case 2 -> {
               respuesta_1 = resp_2;
               switch (soluc) {       
                    case "2" -> solucion = "1";
               }
           }
           case 3 -> {
               respuesta_1 = resp_3;
               switch (soluc) {       
                    case "3" -> solucion = "1";
               }
           }           
           case 4 -> {
               respuesta_1 = resp_4;
               switch (soluc) {       
                    case "4" -> solucion = "1";
               }
           }           
       }
       switch (ale_02) {       
           case 1 -> {
               respuesta_2 = resp_1;
               switch (soluc) {       
                    case "1" -> solucion = "2";
               }
           }
           case 2 -> {
               respuesta_2 = resp_2;
               switch (soluc) {       
                    case "2" -> solucion = "2";
               }
           }
           case 3 -> {
               respuesta_2 = resp_3;
               switch (soluc) {       
                    case "3" -> solucion = "2";
               }
           }
           case 4 -> {
               respuesta_2 = resp_4;
               switch (soluc) {       
                    case "4" -> solucion = "2";
               }
           }        
       }
       switch (ale_03) {       
           case 1 -> {
               respuesta_3 = resp_1;
               switch (soluc) {       
                    case "1" -> solucion = "3";
               }
           }
           case 2 -> {
               respuesta_3 = resp_2;
               switch (soluc) {       
                    case "2" -> solucion = "3";
               }
           }
           case 3 -> {
               respuesta_3 = resp_3;
               switch (soluc) {       
                    case "3" -> solucion = "3";
               }
           }
           case 4 -> {
               respuesta_3 = resp_4;
               switch (soluc) {       
                    case "4" -> solucion = "3";
               }
           }
       }
       switch (ale_04) {       
           case 1 -> {
               respuesta_4 = resp_1;
               switch (soluc) {       
                    case "1" -> solucion = "4";
               }
           }
           case 2 -> {
               respuesta_4 = resp_2;
               switch (soluc) {       
                    case "2" -> solucion = "4";
               }
           }
           case 3 -> {
               respuesta_4 = resp_3;
               switch (soluc) {       
                    case "3" -> solucion = "4";
               }
           }           
           case 4 -> {
               respuesta_4 = resp_4;
               switch (soluc) {       
                    case "4" -> solucion = "4";
               }
           }
       }
       
        String miRespuesta;
        String resp_correcta;
        cont = (int) contador;
    
        do { 
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(20);
            ver_notas();
                        
            System.out.println("*************************************************************************************************\n");
            System.out.println("  " + cont+ ".- : " + pregunta);
            System.out.println("\n*************************************************************************************************");
            System.out.println("\nA.- " + respuesta_1);
            System.out.println("\nB.- " + respuesta_2);
            System.out.println("\nC.- " + respuesta_3);
            System.out.println("\nD.- " + respuesta_4);
            System.out.println("\n*************************************************************************************************");
            System.out.println("RESPONDE CON:               -  A  B  C  D  -  a  b  c  d  -  1  2  3  4  -  0  -");
            System.out.println("*************************************************************************************************\n");
            System.out.print("Indica tu respuesta: ");
            miRespuesta = teclaStr.nextLine();
            
            meterEspacios(20);
            
            switch (miRespuesta) {
                case "A", "a", "1" -> miRespuesta = "1";
                case "B", "b", "2" -> miRespuesta = "2";
                case "C", "c", "3" -> miRespuesta = "3";
                case "D", "d", "4" -> miRespuesta = "4";
                case "0" -> salida = true;
                default ->  miRespuesta = "no_existe";               
            }            
            switch (solucion) {
                case "1" -> resp_correcta = respuesta_1;
                case "2" -> resp_correcta = respuesta_2;
                case "3" -> resp_correcta = respuesta_3;
                case "4" -> resp_correcta = respuesta_4;
                default -> resp_correcta = " ";
            }            
            if (miRespuesta.equals(solucion)) {
                System.out.println("*************************************************************************************************");
                System.out.println("***   ***   ***   ***             ¡ ¡ ¡  C O R R E C T O  ! ! !             ***   ***   ***   ***");
                System.out.println("*************************************************************************************************");
                System.out.println("    " + resp_correcta);
                System.out.println("*************************************************************************************************");
                aciertos = (1 + aciertos);
                contador = (1 + contador);
                salida = true;
            } else if (miRespuesta.equals("no_existe")) {
                System.out.println("*************************************************************************************************");
                System.out.println("* * *  ¡ ¡ ¡   L A   O P C I Ó N    S E L E C C I O N A D A    N O    E X I S T E   ! ! !   * * *");
                System.out.println("*************************************************************************************************");
                salida = false;
            } else if (miRespuesta.equals("0")) {
                System.out.println("*************************************************************************************************");
                System.out.println("* * *     * * *     ¡ ¡ ¡    R E S P U E S T A    E N    B L A N C O    ! ! !     * * *     * * *");
                System.out.println("*************************************************************************************************");
                en_blanco = (1 + en_blanco);
                contador = (1 + contador);
                salida = true;
            } else {
                System.out.println("*************************************************************************************************");
                System.out.println("* * *    * * *    * * *          ¡ ¡ ¡    E  R  R  O  R    ! ! !          * * *    * * *    * * *");
                System.out.println("*************************************************************************************************");
                fallos = (1 + fallos);
                aciertos = (-1 + aciertos);
                salida = false;
            }
            meterEspacios(15);
            esperar(1500);
            
        } while ( !salida );
    }
    
    public static void ver_notas() {
        // VARIABLES PARA LAS NOTAS
        nota = ( 10* (aciertos - (fallos/3)) ) / (contador - 1);
        nota = (Math.round(nota*100.00))/100.00;
        aciert = (int) aciertos;
        fall = (int) fallos;
        en_bl = (int) en_blanco;
        
        // VARIABLES PARA EL TIEMPO
        fin = System.currentTimeMillis();
        milisegundos = (fin - inicio);
        horas = (int) (milisegundos / 3600000);
        resto_horas = (int) (milisegundos % 3600000);
        minutos = (int) (resto_horas / 60000);
        segundos = (int) ((resto_horas % 60000)/1000);
        
        System.out.println("*************************************************************************************************");
        System.out.println("     " + asignatura + "       TEMA: " + tema + "     NOTA = " + nota);
        System.out.println("     ACIERTOS  = " + aciert + "     FALLOS = " + fall + "     EN BLANCO = " + en_bl);
        System.out.println("     TIEMPO = " + horas + " h : " + minutos + " m : " + segundos + " s");
    }    
    
    public static void reseteaNotas() {
        
        if ((aciert != 0) || (fall != 0) || (en_bl != 0)) {
            ver_notas();
        }        
        setFall(0);
        setFallos(0);
        setAciert(0);
        setAciertos(0);
        setCont(1);
        setContador(1);
        setEn_bl(0);
        setEn_blanco(0);        
        setNota(0);
    }
    
    public static void esperar(int segundos) {
        try {            
            Thread.sleep(segundos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void meterEspacios(int espacios) {
    
        for (int i=0; i<espacios; i++) {
                System.out.println("");
            }    
    }
    
    public static int[] generarOrden(int arr[]) {
    
        for(int i=0;i<arr.length;i++){
            boolean encontrado = false;
            int ale=(int)(Math.random()*4)+1;
            for (int j=0;j<i ;j++){
                if(arr[j]==ale){
                    encontrado=true;
                }
            }
            if(!encontrado){
                arr[i]=ale;
            }else{
                i--;
            }
        }
        return arr;
    }    
}