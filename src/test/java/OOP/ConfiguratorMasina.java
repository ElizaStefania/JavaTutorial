package OOP;

public class ConfiguratorMasina {
    public String marca;
    public String model;
    public Integer an;
    public Double pretStandard;
    public Double pretFinal;

    public ConfiguratorMasina(String marca, String model, Integer an, Double pretStandard, Double pretFinal) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.pretStandard = pretStandard;
        this.pretFinal = pretFinal;
    }

    //OOP = programare orientata pe obiecte
    //OOP = 4 principii => Mostenire, Incapsulare, Polimorfism, Abstractizare

    //Mostenirea: conceptul prin care o clasa mosteneste o alta clasa
    //Clasa care este mostenita = Parinte
    //Clasa care mosteneste = Copil
    //In Java putem mosteni o singura clasa
    //Mostenirea se realizeaza cu cuvantul "extends"
    //Cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    //Copilul va avea acces la priprietatile/metodele din clasa parinte (daca se foloseste public/protected/defult)
    //Pentru a apela constructorul din parinte in copil se foloseste keyword-ul "super"

    public void infoMasina(){
        System.out.println("Marca masinii este:" + marca);
        System.out.println("Modelul masinii este: "+ model);
        System.out.println("Anul masinii este:" + an);
        System.out.println("Pretul standard al masinii este:" + pretStandard);
    }
}
