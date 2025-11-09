import java.util.Random;
import java.util.Scanner;

public class GestoreGioco {
    int numeroVincente;

    // Costruttore con difficoltà
    public GestoreGioco(int livello) {
        Random random = new Random();
        switch(livello) {
            case 1: 
                numeroVincente = random.nextInt(10) + 1;
                break;
            case 2: 
                numeroVincente = random.nextInt(20) + 1;
                break;
            case 3: 
                numeroVincente = random.nextInt(30) + 1;
                break;
            default:
                numeroVincente = random.nextInt(20) + 1; 
        }
    }

    public void verifica(int num, Giocatore giocatore) {
        if(num == numeroVincente) {
            System.out.println(giocatore.getNome() + " hai vinto");
            return; 
        } else {
            System.out.println(giocatore.getNome() +" hai perso");
        }

        System.out.println("per ritentare digitare si");
        Scanner ritenta = new Scanner(System.in);
        String risposta = ritenta.nextLine();

        if(risposta.equalsIgnoreCase("si")) {
            giocatore.gioca();
        } else {
            System.out.println("hai finito il gioco");
        }
    }
}
