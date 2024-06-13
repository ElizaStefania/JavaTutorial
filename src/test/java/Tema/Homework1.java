package Tema;

import org.testng.annotations.Test;

public class Homework1 {
    public Integer varsta;
    public String numele;
    public String prenumele;
    public String salut;
    public String hello;

    @Test
    public void metotaTest() {
        System.out.println("Hello World!");
        infoPers();
    }

    public void infoPers() {
        varsta = 32;
        numele = "Popescu";
        prenumele = "Andrei"; // Presupunem că acest angajat are prenumele "Andrei"
        salut = "Salut";
        hello = "Hello";
        System.out.println(varsta);
        System.out.println(numele);
        System.out.println(prenumele);
        System.out.println(salut + " M");
        System.out.println("H " + hello);

        String cuvant = "Ana are mere , pere , prune";
        String rezultat = adaugaZ(cuvant);
        System.out.println(rezultat);
        System.out.println("Poti pleca acasa dupa ce iti verific munca!");

        double salariu = getSalariu(prenumele);
        if (salariu != -1) {
            System.out.println("Salariul lui Andrei este: " + salariu);
        } else {
            System.out.println("Angajatul cu prenumele Andrei nu a fost găsit.");
        }

        idAngajat(numele);
        afiseazaNrDepartamen(300);
        System.out.println("Rezultatul ecuatiei este: " + calculEcuatie());
    }

    public void afiseazaNrDepartamen(int nrDepartament) {
        if(nrDepartament > 287) {
            System.out.println("Numarul departamentului este: " + nrDepartament);
        }
    }

    public void idAngajat(String nume) {
        Integer id = 13;
        String departament = "IT";
        if(nume.equals("Popescu")) {
            System.out.println(id + " " + departament);
        }
    }

    public double getSalariu(String prenume) {
        if (prenume.equals("Andrei")) {
            // Presupunem că returnăm salariul pentru angajatul cu prenumele "Andrei"
            return 5000.0; // Modifică această valoare cu salariul real al lui Andrei
        } else {
            return -1; // Returnăm -1 dacă angajatul cu prenumele "Andrei" nu este găsit
        }
    }

    public String adaugaZ(String cuvant) {
        StringBuilder rezultat = new StringBuilder();

        for (int i = 0; i < cuvant.length(); i++) {
            char caracter = cuvant.charAt(i);
            rezultat.append(caracter);

            if (esteVocala(caracter) && (i == cuvant.length() - 1 || Character.isWhitespace(cuvant.charAt(i + 1)))) {
                rezultat.append('Z');
            }
        }
        return rezultat.toString();
    }

    public boolean esteVocala(char caracter) {
        caracter = Character.toLowerCase(caracter);
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public double calculEcuatie() {
        return (2 + (3 * 4) - 3) / 3.0;
    }
}
