package ProcesosConHilos.EjUsoMetodoCurrentThread;

public class Cliente extends Thread{
    public void run(){
        Recurso.uso();
        try {
            Thread.sleep(2000);
        }catch(InterruptedException ignored){};
    };
}
