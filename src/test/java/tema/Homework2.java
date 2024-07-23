package tema;

import org.testng.annotations.Test;

public class Homework2 {

    @Test
    public void metodaTest() {
        afisareCuvant();
        System.out.println("");
        afisareNr();

    }
    public void afisareCuvant(){
        for (Integer i = 0; i<5; i++) {
            System.out.print("DA");
            if(i<4){
            System.out.print(" ");
            }
        }
    }
    public  void afisareNr(){
        for(Integer i=1; i<=3; i++){
            System.out.print(i);
        }
    }
}
