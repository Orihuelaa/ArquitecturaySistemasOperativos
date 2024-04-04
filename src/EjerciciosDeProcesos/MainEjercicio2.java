package EjerciciosDeProcesos;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Proceso [] procesos = new Proceso[10];
        for (int i=0; i < procesos.length; i++){
            procesos[i] = new Proceso(i,"Proceso "+ i);
            procesos[i].start();

            try {
                procesos[i].join();
            }catch (Exception e){
                System.out.println("Usted a ingresado un numero erroneo");

            }
        }


    }
}
