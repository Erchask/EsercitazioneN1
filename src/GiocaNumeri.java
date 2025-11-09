import java.util.Scanner;

public class GiocaNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Scegli la difficoltà: 1-Facile(1-10)  2-Media(1-20)  3-Difficile(1-30)");
        int livello = input.nextInt();

        GestoreGioco gg = new GestoreGioco(livello);

        Giocatore g1 = new Giocatore("Mario", gg);
        Giocatore g2 = new Giocatore("Bros", gg);

        System.out.println("INIZIA IL GIOCO");
        g1.start();
        g2.start();

        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.err.println("ERRORE NELL'INTERRUZIONE DEL THREAD");
        }

        System.out.println("FINE GIOCO");
    }
}
