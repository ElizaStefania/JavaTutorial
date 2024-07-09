package OOP;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void testMethod(){

        List<String> echipamenteLogan = Arrays.asList("Pachet Tehno", "Pachet Clima", "Pachet Parking");
        List<String> accesoriiLogan = Arrays.asList("covorase", "scrumiera", "suport de pahare");

        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024, 10.000, 15.000,
                "ESSENTIAL", "TCA", "Albastru", "16", "negru", echipamenteLogan, accesoriiLogan);

        Logan.infoDacia();

        System.out.println("===========");

        List<String> dotariOptionalePolo = Arrays.asList("Pachet Confort", "Trapa de sticla", "Scaune fata incalzita");
        VWConfigurator Polo = new VWConfigurator("VW", "Polo", 2024, 10.23, 12.00, "ADVANCED", "Polo life 1.0",
                "rosie", "Roti 15", "Neagra", dotariOptionalePolo);

        Polo.infoVW();
    }
}
