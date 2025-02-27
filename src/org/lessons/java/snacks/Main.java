package org.lessons.java.snacks;

public class Main {
    public static void main(String[] args) {

        // * STUDENTE
        Studente studente = new Studente("Mario", "Rossi", 25);
        System.out.println(studente.details());

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
