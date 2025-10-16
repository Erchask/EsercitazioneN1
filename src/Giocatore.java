import java.util.Scanner;

public class Giocatore extends Thread{
    private String nome;
    private int punteggio;
    int id;
    GestoreGioco gg;


    public Giocatore(String nome){
        this.punteggio=0;
        this.nome=nome;

    }
    public Giocatore(String nome, GestoreGioco gestore){
        this.nome=nome;
        this.gg=gestore;
    }
    public void comunica(){
        System.out.println("sono il giocatore" + nome);
    }

    public int getPunteggio() {
        return punteggio;
    }
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




