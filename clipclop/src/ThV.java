
public class ThV extends Thread{
    private DatiCondivisi ptrDati;
    private Semaforo ptrS1;
    private Semaforo ptrS2;
    
    public ThV(DatiCondivisi ptrDati, Semaforo sincro1, Semaforo sincro2) {
        this.ptrDati = ptrDati;
        this.ptrS1 = sincro1;
        this.ptrS2 = sincro2;
    }
    public void run() {

        while (true) {
            ptrS1.Wait();           
            
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            ptrDati.visualizzaCavalli();
            
            ptrS2.Signal();
        }
    }
}
