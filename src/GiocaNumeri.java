
public class GiocaNumeri {
    public static void main(String[] args) {
       System.out.println("INIZIA IL GIOCO");

       GestoreGioco gg = new GestoreGioco(19);

       Giocatore g1 = new Giocatore(" Mario", gg);
       Giocatore g2 = new Giocatore(" Bros", gg);
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