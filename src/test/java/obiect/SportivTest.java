package obiect;

import org.testng.annotations.Test;

public class SportivTest {

    @Test
    public void testMethod() {
        //Instantiem un obliect de tipul sportiv
        Sportiv Ionut = new Sportiv("Popescu", true,
                "Baschet", "M", 20, "Ionut");
        Ionut.prezentareSportiv();
        Ionut.varsta = 21;
        Ionut.sportPrcticat = "Fotbal";
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();

        System.out.println("------------------------");

        Sportiv Alin = new Sportiv("Exemplu", false,
                "Fotbal", "M", 17, "Alin");
        Alin.prezentareSportiv();
        Alin.verificareVarsta();
        Alin.marireSalar(20);

        System.out.println("------------------------");
        Sportiv Vlad = new Sportiv("Popescu", false,
                "Fotbal", "M", 19, "Vlad", 2000);
        Vlad.verificareVarsta();
        Vlad.prezentareSportiv();
        Vlad.marireSalar(20);
    }
}
