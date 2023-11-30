package org.example;

public class ManutARisque extends Manutentionnaire implements EmployeARisque{
    public ManutARisque(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
        super(nom, prenom, age, dateEntree, heuresTravail);
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
