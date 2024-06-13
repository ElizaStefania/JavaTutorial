package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String marca;
    public String model;
    public Float pret;
    public Integer an;
    public Boolean esteDecapotabila;
    public Double greutate;

    @Test
    public void metodaTest() {
        afisareMasina();
        System.out.println("===Exemplu 2===");
        afisareOriceMasina("Polo", "VV",45.90, 200f, true, 2010);
        afisareOriceMasina("Dacia", "dc",45.90, 200f, true, 2010);

    }
    //Descriem o masina
    public void afisareMasina() {

        marca = "Mercedes";
        model = "GLS";
        pret = 123.4f;
        an = 2012;
        esteDecapotabila = true;
        greutate = 54.0;

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Greutatea masinii este: " + greutate);
        System.out.println("Pretul masinii este: " + pret);
        System.out.println("Este masina decapotabila? " + esteDecapotabila);
        System.out.println("Anul masinii este:" + an);
    }

    //Descriem orice masina
    public void afisareOriceMasina(String marca, String model, Double greutate, Float pret, Boolean esteDecapotabila, Integer an) {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Greutatea masinii este: " + greutate);
        System.out.println("Pretul masinii este: " + pret);
        System.out.println("Este masina decapotabila? " + esteDecapotabila);
        System.out.println("Anul masinii este:" + an);
    }
}


