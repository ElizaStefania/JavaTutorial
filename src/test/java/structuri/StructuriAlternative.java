package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative : if..then..else../switch..case

    @Test
    public void metodaTest() {
//        verficNumar();
//        verificNumarV2(20);
//        verificNrPar(5);
//        verificNrPar(-6);
//        verificNrPar(-7);
//        verificNrPar(0);
        zileleSaptamanii(2);
    }

    //v1: Verificam daca un numar este > 10
    public void verficNumar() {
        if (15 > 10) {
            System.out.println("Numarul 15 e mai mare ca 10");
        }
        else {
            System.out.println("Numarul 15 nu e mai mare ca 10");
        }
    }
    //v2
    public void verificNumarV2(Integer nr) {
        if (nr < 10) {
            System.out.println("Numarul " +nr+ " e mai mare ca 10");
        }
        else {
            System.out.println("Numarul " + nr + " nu e mai mare ca 10");
        }
    }
    //verificam daca un nr este par si pozitiv
    public void verificNrPar(Integer nr) {
        //daca vrem sa luam catul impartitii = / (divide)
        //daca vrem sa luam restul impartirii = % (modulo)
        if(nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul este pozitiv" + nr + " si par");
            }
            else {
                System.out.println("Numarul este pozitiv" + nr + " si impar");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul este negativ" + nr + " si par");
            }
            else {
                System.out.println("Numarul este negativ" + nr + " si impar");
            }
        }
        else {
            System.out.println("Numarul este egal cu 0");
        }
     }
     //Definim zilele saptamanii
    public void zileleSaptamanii(Integer zi){
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            default:
                System.out.println("S-au terminat zilele!");
        }
    }
}
