package OOP;

public class ConfiguratorMasina {
    private String marca;
    private String model;
    private Integer an;


    public ConfiguratorMasina(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
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

    //Incapsularea = conceptul prin care putem sa setam anumite restrictii de vizibilitate pt proprietati/metode

    public void infoMasina(){
        System.out.println("Marca masinii este:" + marca);
        System.out.println("Modelul masinii este: "+ model);
        System.out.println("Anul masinii este:" + an);
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAn() {
        return an;
    }

    public String getModel() {
        return model;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
