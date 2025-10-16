public class GestoreGioco {
    int numeroVincente;

    public GestoreGioco(int numeroVincente) {
        this.numeroVincente=numeroVincente;
    }


    public void verifica( int num){
    if(num==numeroVincente){
        System.out.println("hai vinto");
    } else{
        System.out.println("hai perso");
    }
    }

}
