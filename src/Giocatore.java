import java.util.Scanner;

/**
 * @author ChadiKini
 */
public class Giocatore extends Thread{
    private String nome;
    private int punteggio;
    int id;
    GestoreGioco gg;


    /**
     *
     * @param nome
     * @param gestore
     */
    public Giocatore(String nome, GestoreGioco gestore){
        this.nome=nome;
        this.gg=gestore;
        this.punteggio=0;

    }
    public void comunica(){
        System.out.println("sono il giocatore" + nome);
    }

    /**
     *
     * @return
     */
    public int getPunteggio() {
        return punteggio;
    }

    /**
     *
     * @return
     */
    public String getNome(){
        return nome;
    }
    private void gioca() {
        System.out.println( nome + " inserisci un numero ");
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("ho scelto il numero  " + num + " sono " + nome);
        gg.verifica(num);

        }


    @Override
    public void run(){
        comunica();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("errore");
        }
        gioca();
        //invoca ilmetodo run nella classe madre
        super.run();


    }
}




