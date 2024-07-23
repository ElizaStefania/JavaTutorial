package tema.Obiect;

import org.testng.annotations.Test;

public class MasinaTest {
    @Test
    public void metodaTest(){
        Masina Masina1 = new Masina("VW", "POLO", 2020, 2430, 234.12);
        Masina1.prezentareMasina();
        Masina1.calculImpozit(10.12);

        System.out.println("------------------------");

        Masina Masina2 = new Masina("Dacia", "Sandero", 1900, 1400, 12.00, 20f);
        Masina2.prezentareMasina();
        Masina2.calculImpozit(13.00);
        Masina2.stareMasina();
        }
    }
