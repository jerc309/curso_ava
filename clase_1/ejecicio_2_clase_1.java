package CLASE1;

public class ejecicio_2_clase_1 {
    public static void main(String args[]) {
        /*Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
        (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
        ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
        ● Tener 3 o más inmuebles.
        ● Poseer una embarcación, una aeronave de lujo o ser titular de activos
        societarios que demuestren capacidad económica plena.” */

        // Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
        int ingresos = 489083;
        // ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
        boolean vehiculos=true;
        // ● Tener 3 o más inmuebles.
        boolean inmuebles=true;
        // ● Poseer una embarcación, una aeronave de lujo o ser titular de activos
        boolean embarcación=true;
        int superficie = 20;
        int energia = 900;
        /*********************************************/
        if ( (ingresos >= 489083) ||
        ( vehiculos==true) ||
        (inmuebles==true) || (embarcación=true) ) {
            System.out.println("Pertenece al segmento de ingresos altos");
        } else if( (ingresos < 489083) &&
        ( vehiculos==false) &&
        (inmuebles==false) && (embarcación=false) ) {
            System.out.println("No pertenece al segmento de ingresos altos");
        }






    }
    
}
