package org.lessons.java.snacks;

// ^ Per risolvere l'esercizio ho bisogno di un tipo di dato che possa sostituire l'array per rappresentare la lista degli studenti, in quanto in Java non è possibile modificare la dimensione di un array.
// ^ Avrei potuto creare un Array con una lunghezza predefinita abbastanza grande da poter contenere tutti i miei possibili studenti, ma sarebbe stato uno spreco di memoria.
// ^ Oppure avrei potuto creare un array con una dimensione piccola e poi, ogni volta che si aggiunge un nuovo studente, creare un nuovo array più grande e copiare tutti gli elementi dal vecchio array al nuovo array.
// ^ Mi sono documentato ed ho scelto di utilizzare ArrayList. Dopo aver capito la base del suo funzionamento e dei suoi metodi basilari che mi servivano per l'implementazione, l'ho importato e utilizzato nella mia classe.
// ^ Spero che questa soluzione, seppur funzionante, sia accettabile e non sconfigga lo scopo dell'esercizio in quanto non ancora affrontata a lezione.

import java.util.ArrayList;

public class RegistroStudenti {

    private ArrayList<Studente> studenti;

    public RegistroStudenti() {
        studenti = new ArrayList<>();
    }

    public void addStudente(Studente studente) {
        studenti.add(studente);
    }

    public void getStudenti() {

        if (studenti.size() == 0) {
            System.out.println("No students in the list.");
            return;
            
        }

        System.out.println("Student list:");
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println(studenti.get(i).details());
        }
    }
}
