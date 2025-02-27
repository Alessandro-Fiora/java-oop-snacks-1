package org.lessons.java.snacks;

public class Main {
    public static void main(String[] args) {

        // * STUDENTE + REGISTRO STUDENTI
        Studente studente1 = new Studente("Mario", "Rossi", 25);
        Studente studente2 = new Studente("Luca", "Bianchi", 30);
        Studente studente3 = new Studente("Paolo", "Verdi", 20);
        RegistroStudenti registro = new RegistroStudenti();

        registro.getStudenti();
        registro.addStudente(studente1);
        registro.addStudente(studente2);
        registro.addStudente(studente3);
        registro.getStudenti();


        // * CONTO BANCARIO
        ContoBancario mioConto = new ContoBancario("111111");
        System.out.println(mioConto.getBalance());
        mioConto.deposit(1000);
        mioConto.withdraw(500);
        System.out.println(mioConto.getBalance());
        mioConto.withdraw(1000);
        System.out.println(mioConto.getBalance());
    }
}
