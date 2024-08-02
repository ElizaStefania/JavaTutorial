package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void methodTest(){
        Elev Stefan = new Elev("Stefan", "Stan", 14);
        Stefan.prezentare();
        System.out.println("================================");
        Elev Ana = new Elev("Ana", "Mardarie", 15);
        Ana.prezentare();
    }
}