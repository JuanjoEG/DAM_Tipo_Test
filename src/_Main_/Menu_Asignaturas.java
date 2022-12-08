package _Main_;

/**
 *
 * @author Juan José Estévez González
 */

public class Menu_Asignaturas {
    
    private static String titulo, asig_01, asig_02, asig_03, asig_04, asig_05, asig_06, asig_07;
    
    public static void menu_asignaturas() {
        
         System.out.println("*************************************************************************************************");
         System.out.println("*  " + titulo);
         System.out.println("*************************************************************************************************");
         System.out.println("*");
         System.out.println("*  1.  " + asig_01);
         System.out.println("*  2.  " + asig_02);
         System.out.println("*  3.  " + asig_03);
         System.out.println("*  4.  " + asig_04);
         System.out.println("*  5.  " + asig_05);
         System.out.println("*  6.  " + asig_06);
         System.out.println("*  7.  " + asig_07);
         System.out.println("*");
         System.out.println("*************************************************************************************************");
         System.out.println("*  0. SALIR.");
         System.out.println("*************************************************************************************************\n");
    
    }

    public static void setAsig_01(String asig_01) {
        Menu_Asignaturas.asig_01 = asig_01;
    }

    public static void setAsig_02(String asig_02) {
        Menu_Asignaturas.asig_02 = asig_02;
    }

    public static void setAsig_03(String asig_03) {
        Menu_Asignaturas.asig_03 = asig_03;
    }

    public static void setAsig_04(String asig_04) {
        Menu_Asignaturas.asig_04 = asig_04;
    }

    public static void setAsig_05(String asig_05) {
        Menu_Asignaturas.asig_05 = asig_05;
    }

    public static void setAsig_06(String asig_06) {
        Menu_Asignaturas.asig_06 = asig_06;
    }

    public static void setAsig_07(String asig_07) {
        Menu_Asignaturas.asig_07 = asig_07;
    }

    public static void setTitulo(String titulo) {
        Menu_Asignaturas.titulo = titulo;
    }
    
}