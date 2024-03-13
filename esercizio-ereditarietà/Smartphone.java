import java.util.*;

public class Smartphone extends DispositivoElettronico {

    String nome;
    String password;

    public Smartphone(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    Scanner input = new Scanner(System.in);

    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("l'applicazione che stai avviando è:" + nomeApp);
        loggIn();
    }

    private void loggIn() {
        System.out.println("inserisci il nome utente");
        String nome = input.nextLine();
        System.out.println("inserisci la password");
        String password = input.nextLine();
        System.out.println("stai accedendo con le seguenti credenziali:");
        System.out.println("nome: " + nome);
        System.out.println("password: " + password);
    }

}
