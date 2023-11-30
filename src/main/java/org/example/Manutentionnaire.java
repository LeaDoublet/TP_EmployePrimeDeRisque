package org.example;

public class Manutentionnaire extends Employe {
    private int heuresTravail;

    public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
        super(nom, prenom, age, dateEntree);
        this.heuresTravail = heuresTravail;
    }

    @Override
    public double calculerSalaire() {
        return heuresTravail * 65;
    }
}
