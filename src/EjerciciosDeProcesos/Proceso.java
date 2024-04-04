package EjerciciosDeProcesos;

import java.lang.Thread;
public class Proceso extends Thread{
    private int PID;
    private String mensaje;
    private static int contador = 0;

    public Proceso(int PID, String mensaje) {
        this.PID = PID;
        this.mensaje = mensaje;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Proceso.contador = contador;
    }

    public void run(){

        contador ++;
        System.out.println("Soy el proceso que "+mensaje);
    }
}

