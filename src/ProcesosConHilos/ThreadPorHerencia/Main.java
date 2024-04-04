package ProcesosConHilos.ThreadPorHerencia;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        // Declaración de 2 threads
        PingPong t1 = new PingPong("PING", 1300);
        PingPong t2 = new PingPong("PONG", 1550);
        //Activación
        t1.start();
        t2.start();
        //Espera 2 segundos
        try {
            sleep(5000);
        }catch (InterruptedException e){};
        //Finaliza la ejecución de los threads
        t1.stop();
        t2.stop();
    }
}
