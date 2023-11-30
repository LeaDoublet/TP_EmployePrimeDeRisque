package org.example;

public class Technicien extends Employe{
    private int unitesProduites;

    public Technicien(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
        super(nom, prenom, age, dateEntree);
        this.unitesProduites = unitesProduites;
    }

    @Override
    public double calculerSalaire() {
        return unitesProduites * 5;
    }
}
