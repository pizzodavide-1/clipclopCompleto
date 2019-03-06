
import java.util.concurrent.Semaphore;


public class DatiCondivisi {

    int nClop1;
  
    int nClop2;
   
    int nClop3;
   
    int nClop4;
   
    int nClop5;

  private Semaphore fine;
    private int primo;

    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;    
    private Semaphore sem5; 
    public DatiCondivisi() {
        this.nClop1 = 0;
        this.nClop2 = 0;
        this.nClop3 = 0;
        this.nClop4 = 0;
        this.nClop5 = 0;

        fine = new Semaphore(0);
        primo=0;
        
         sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
        sem3 = new Semaphore(0);
        sem4 = new Semaphore(0);
        sem5 = new Semaphore(0);
        
        
        
    }

   
    public int getnClop1() {
        return nClop1;
    }

   
    public int getnClop2() {
        return nClop2;
    }

   
    public int getnClop3() {
        return nClop3;
    }

    
    public int getnClop4() {
        return nClop4;
    }

    
    public int getnClop5() {
        return nClop5;
    }

    
    public void setnClop1(int nClop1) {
        this.nClop1 = nClop1;
    }

    
    public void setnClop2(int nClop2) {
        this.nClop2 = nClop2;
    }

   
    public void setnClop3(int nClop3) {
        this.nClop3 = nClop3;
    }

    
    public void setnClop4(int nClop4) {
        this.nClop4 = nClop4;
    }

    public void setnClop5(int nClop5) {
        this.nClop5 = nClop5;
    }

public int getPrimo(){
        return this.primo;
    }
    public void setPrimo(int s){
        primo = s;
    }
    
    public void waitFine() throws InterruptedException {
        fine.acquire();
    }
    public void signalFine() {
        fine.release();
    }
    public void waitS1() throws InterruptedException {
        sem1.acquire();
    }
    public void signalS1() {
        sem1.release();
    }
    public void waitS2() throws InterruptedException {
        sem2.acquire();
    }
    public void signalS2() {
        sem2.release();
    }
    public void waitS3() throws InterruptedException {
        sem3.acquire();
    }
    public void signalS3() {
        sem3.release();
    }
    public void waitS4() throws InterruptedException {
        sem4.acquire();
    }
    public void signalS4() {
        sem4.release();
    }
    public void waitS5() throws InterruptedException {
        sem5.acquire();
    }
    public void signalS5() {
        sem5.release();
    }
        public synchronized void visualizzaCavalli() {
            System.out.println("Numero galoppi:");            
            System.out.println("Clop1 --> " + getnClop1());
            System.out.println("Clop2 --> " + getnClop2());
            System.out.println("Clop3 --> " + getnClop3());
            System.out.println("Clop4 --> " + getnClop4());
            System.out.println("Clop5 --> " + getnClop5());      
    }

}
