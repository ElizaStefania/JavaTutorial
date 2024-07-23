package obiect;

public class Sportiv {
    //Programarea orientata obiect se bazeaza pe interactiunea cu obiecte
    //Obiect = instanta unei clase
    //Putem defini un obiect doar daca avem un constructor
    //Constructorul = are ca rol sa initializeze atributele unei clase
    //Intr-o clasa recunostem un constructor dupa numele acesteia
    //Constructorul este de cele mai multe ori public
    //Intr-o clasa pot sa fie mai multi constructori, diferentiati dupa numarul sau tipul de parametrii
    //Intr-o clasa avem un constructor by default fara parametrii
    //In momentul cand se defineste un obiect se apeleaza constructorul din clasa
    //Dintr-o clasa putem defini mai multe obiecte
    //Obiectele se diferentiaza prin nume si valorile date
    //Un obiect se instantiaza folosind cuvantul "new"
    //Un obiect se poate defini im orice clasa din orce pachet
    //In momentul cand instantam un obiect putem avea acces la toate variabilele/metodele din clasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String sportPrcticat;
    public Boolean teamEvent;
    public Integer salar;

    //Constructor
    public Sportiv(String nume, Boolean teamEvent, String sportPrcticat,
                   String sex, Integer varsta, String prenume) {
        this.nume = nume;
        this.teamEvent = teamEvent;
        this.sportPrcticat = sportPrcticat;
        this.sex = sex;
        this.varsta = varsta;
        this.prenume = prenume;
    }
    public Sportiv(String nume, Boolean teamEvent, String sportPrcticat,
                   String sex, Integer varsta, String prenume, Integer salar) {
        this.nume = nume;
        this.teamEvent = teamEvent;
        this.sportPrcticat = sportPrcticat;
        this.sex = sex;
        this.varsta = varsta;
        this.prenume = prenume;
    }

    public void prezentareSportiv() {
        System.out.println("Numele sportivului este: " + nume);
        System.out.printf("Prenumele sportivului este: " +prenume);
        System.out.println("Varsta sportivului este: " +varsta);
        System.out.println("Sexl sportivului este: " +sex);
        System.out.println("Sportul practicat: " + sportPrcticat);
        System.out.println("Face parte din echipa? " + teamEvent);
        if (salar != null){
            System.out.println("Salarul sportivului este: " + salar);
        }
    }

    public void verificareVarsta(){
        if (varsta >= 18){
            System.out.println("Sportivul este major");
        }
        else {
            System.out.println("Sportivul este minor");
        }
    }
    public void marireSalar(Integer procent){

        if (salar != null){
            Integer marire = (salar * procent)/100;
            salar = salar + marire;
            System.out.println("Noul salar este: " + salar);

        }
        else  {
            System.out.println("Sportivul nu are salar!");
        }
    }
}

