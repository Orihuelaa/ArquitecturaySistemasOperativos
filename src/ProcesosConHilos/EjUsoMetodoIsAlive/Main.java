package ProcesosConHilos.EjUsoMetodoIsAlive;

public class Main {
    public static void main(String[] args){
        Obrera agente =new Obrera();
        agente.start();
        // Hace algo durante el cálculo.
        //.....
        //Espera que agente haya terminado
        while (agente.isAlive()) Thread.yield();
        // Utiliza el resultado.
        System.out.println(agente.getResultado());
    }
}
