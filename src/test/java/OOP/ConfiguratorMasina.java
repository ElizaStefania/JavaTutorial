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

    //Polimorfism = Conceptul prin care o metoda poate avea implementari diferite
    //Polimorfismul poate sa fie de 2 feluri: dinamic(override) si statisc (overloade)
    //Polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire, o medoda poate avea implementari diferite
    //Polomorfismul dinamic este prezent doar la mostenire
    //Polimorfismul static = daca avem nevoie ca o metoda sa fie folosita in diferite corcumstante,  putem defini mai multe
    //                      metode cu acelasi nume avand numar de parametrii/tip parametrii diferiti

    public void infoMasina(){
        System.out.println("Marca masinii este:" + marca);
        System.out.println("Modelul masinii este: "+ model);
        System.out.println("Anul masinii este:" + an);
    }

    //Polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("Masina se porneste cu ajutorul cheii");
    }

    public void deschidereGeam(){
        System.out.println("Geamurile masinii se deschid manual");
    }

    //Polimorfism static
    public void promotieDacia(){
        System.out.println("Pentru luna Iulie, Dacia nu are promotie");
    }

    public void promotieDacia(String tichet){
        System.out.println("Daca ai tichet " + tichet + " primesti reducere");
    }

    public void promotieDacia(Integer reducere){
        System.out.println("In luna Ianuarie ai " + reducere + " reducere");
    }

    public void trapaWV(String trapa){
        System.out.println("Masina WV " + trapa + " are trapa inclusa");
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
