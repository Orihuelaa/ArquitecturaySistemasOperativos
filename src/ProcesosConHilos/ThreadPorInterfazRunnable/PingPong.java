package ProcesosConHilos.ThreadPorInterfazRunnable;

import static java.lang.Thread.sleep;

public class PingPong implements Runnable {
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras

    public PingPong(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void run(){
        while(true){
            System.out.print(word + " ");
            try{ sleep(delay);
            }catch(InterruptedException e){return;}
        }
    }
}

