package Structuri;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class StructuriRepetitive {
    //Structuri repetitive = for, while, for each
    @Test
    public void metodaTest(){
       // afisareNrFor();
        afisamNrPare();
    }
    //Afisam numerele pana la 15
    public void afisareNrFor(){
        for (Integer index = 0; index <= 15; index++){
            System.out.println(index);
        }
    }
    public void afisareNrWhile(){
        Integer index = 0;
        while (index <= 15) {
            System.out.println(index);
            index++;
        }
    }

    //Afisam numerele pare de la 0 la 20
    public void afisamNrPare(){
        for(Integer index = 0; index<=20; index++){
            if(index % 2 == 1) {
                System.out.printf("Nr " + index + " este impar");
            }
            else {
                System.out.printf("Nr " + index + " este par");
            }
        }
    }
}
