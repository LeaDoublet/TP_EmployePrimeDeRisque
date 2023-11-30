package org.example;

public class TechnARisque extends Technicien implements EmployeARisque{
    public TechnARisque(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
        super(nom, prenom, age, dateEntree, unitesProduites);
    }

    @Override
    public double calculerPrime() {
        return PRIME_RISQUE;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + calculerPrime();
    }
}
