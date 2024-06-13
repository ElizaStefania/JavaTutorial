package variabilaMetoda;

import org.testng.annotations.Test;

/*Variabila ---proprietate a sablonului
--Metoda --actiune a sablonului
 */
public class Cursant {

    //Recunoastem o clasa intr-un fiser Java dupa cuvantul cheie 'class'
    //Intr-un fisier Java putem sa avem o multime de clase pe care le diferentiem prin numele lor
    //Nu este un practice bun in Java sa avem intr-un fiser mai multe clase
    //In fiecare clasa trebuie sa definim un nume
    //Inteleg printr-o clasa ca fiind un sablon specific din viata reala
    //Intr-o clasa putem defini variabile si metode
    //Variabila = proprietatea(atributul) unei clase (de exp: nume, prenume, varsta)
    //Intr-o clasa putem avea o multime de variabile
    //Variabilele se diferentiaza prin tip si nume
    //Variabilele pot sa fie de 2 feluri: global si local
    //Variabila globala = proprietate vizibila oriunde in cod
    //Variabila locala = proprietate vizibila doar in locul definit
    //Tipuri de date: String, intiger, double/float, character, boolean

    //Variabile globale:
            //Double -- 64 de biti
            //Float -- 32 de biti
    public String nume;
    public String prenume;
    private Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    //Metoda = actiunea unei clase
        //Intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
        //Exista 2 tipuri de metode: void si return
        //Metoda void = actiune pe care vrem sa o afisam/interpretam fara a fi nevoie sa o returnam
        //Diferenta intre void si return: Void executa si afiseaza; Return o executa si o returneaza(nu afiseaza)
        //Pentru o metoda trebuie sa specificam un acces control (public), () si {}

    @Test
    //Un test poate sa contina una sau mai multe actiuni(metode)
    public void metodaTest () {
        descrieCursant(); //apelare metoda
        primesteBursa();
    }
    public void primesteBursa() {
        Integer bursa = 1000; ///variabila locala
        System.out.println("Bursa cursantului este: " + bursa);
    }
    public void descrieCursant() {
        nume = "Petcu";
        prenume = "Mircea";
        varsta = 20;
        adresa = "Bld Republicii, Nr. 23";
        inaltime = 1.65;
        greutate = 67.00f;
        sex = 'M';
        areRestante = true;

        // System.out.print(nume + " " + prenume + " " + varsta); //Concatenare valoari
        System.out.println("Numele cursantului este: " + nume + "."); //println dupa ce printeaza trece la randul urmator
        System.out.println("Prenumele cursantului este: " + prenume + ".");
        System.out.println("Adresa: " + adresa);
        System.out.println("Inaltime: " + inaltime);
        System.out.println("Greutate: " + greutate);
        System.out.println("Sex: " +sex);
        System.out.println("Restante: " +areRestante);
    }
}
