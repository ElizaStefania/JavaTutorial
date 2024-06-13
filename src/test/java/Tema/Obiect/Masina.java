package Tema.Obiect;

import javax.print.Doc;

public class Masina {
    public String model;
    public String marca ;
    public Integer an;
    public Integer capacitate;
    public Double impozit;
    public Float km;

    //Constructor
    public Masina (String model, String marca, Integer an, Integer capacitate, Double impozit){
        this.model = model;
        this.marca = marca;
        this.an = an;
        this.capacitate = capacitate;
        this.impozit = impozit;

    }

    public Masina (String model, String marca, Integer an, Integer capacitate, Double impozit, Float km){
        this.model = model;
        this.marca = marca;
        this.an = an;
        this.capacitate = capacitate;
        this.impozit = impozit;
        this.km = km;

    }

    public void prezentareMasina(){
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Marca masinii este : " + marca);
        System.out.println("Anul de fabricatie al masinii este: " + an);
        System.out.println("Capacitatea masinii este: " + capacitate);
        System.out.println("Impozitul pentru masina este: " + impozit);
        if (km != null){
            System.out.println("Kilometrajul masinii este: " + km);
        }
    }

    public void calculImpozit(Double cota) {
        Double valoareImpozit =( capacitate *  cota)/100;

        if(capacitate != null && an >= 2000 && an <= 2024){
            System.out.println("Impozitul majorat pentru masinile cu an fabricatie 2000- 2024 este: " + valoareImpozit);

        }
        else if (capacitate != null && an < 2000) {
            valoareImpozit = (capacitate * cota) / 100;
            System.out.println("Impozitul pentru masinile cu an fabricatie mai mic de 2000 este: " + valoareImpozit);
        } else {
            System.out.println("Datele introduse sunt incomplete sau incorecte.");
        }
    }

    public void stareMasina(){
        if(km > 10f){
            System.out.println("Masina este veche");
        }else {
            System.out.println("Masina este noua");
        }
    }
}

