package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest{



    @Test
    public void metodaTest(){
        Elev Stefan = new Elev("Stefan", "Stan", 12);
        Stefan.prezentare();
        System.out.println("========================");
        Elev Andrei = new Elev("Stefan", "Andrei", 12);
        Andrei.prezentare();
    }
}
