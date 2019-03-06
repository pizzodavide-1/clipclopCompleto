

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NB_CorsaCavalli {


    public static void main(String[] args) {

        try {
            DatiCondivisi dati = new DatiCondivisi();
            Semaforo sincro1 = new Semaforo(1);
            Semaforo sincro2 = new Semaforo(0);

            ThCorsa Clop1 = new ThCorsa(1, dati, sincro1, sincro2);
            ThCorsa Clop2 = new ThCorsa(2, dati, sincro1, sincro2);
            ThCorsa Clop3 = new ThCorsa(3, dati, sincro1, sincro2);
            ThCorsa Clop4 = new ThCorsa(4, dati, sincro1, sincro2);
            ThCorsa Clop5 = new ThCorsa(5, dati, sincro1, sincro2);
            ThV tv = new ThV(dati, sincro1, sincro2);

            tv.start();
            Clop1.start();
            Clop2.start();
            Clop3.start();
            Clop4.start();
            Clop5.start();

            dati.waitFine();
            Clop1.interrupt();
            Clop2.interrupt();
            Clop3.interrupt();
            Clop4.interrupt();
            Clop5.interrupt();
            
            //attendi
            dati.waitS1();
            dati.waitS2();
            dati.waitS3();
            dati.waitS4();
            dati.waitS5();
            
            if (ThV.currentThread().isAlive()) {
                sincro1.Signal();
                tv.interrupt();
            }
            
            System.out.println("Vincitore: Clop"+dati.getPrimo());

        } catch (InterruptedException ex) {
            Logger.getLogger(NB_CorsaCavalli.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
