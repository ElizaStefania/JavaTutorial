package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest(){
        System.out.println("===Telefon: IPHONE 15===");
        Map<String, String> iphone15Specificatii = new HashMap<>();
        iphone15Specificatii.put("Model procesor", "Apple A12");
        iphone15Specificatii.put("Sistem de operare", "iOS");
        iphone15Specificatii.put("Memorie RAM", "6 GB");
        iphone15Specificatii.put("Standard Wi-Fi", "783.11ax 2x2");
        iphone15Specificatii.put("Tip dispay", "Super Retina XDR");

        List<String> iphone15Accesorii = new ArrayList<>();
        iphone15Accesorii.add("Telefon");
        iphone15Accesorii.add("Incarcator");
        iphone15Accesorii.add("Cablu USB");
        iphone15Accesorii.add("Casti");
        iphone15Accesorii.add("Stylus");
        iphone15Accesorii.add("Stickere");

        Telefon iPhone15 = new Telefon("Iphone", "15", "Albastru",
                "128 GB", 20000, iphone15Specificatii, iphone15Accesorii, false);
        iPhone15.infoTelefon();

        System.out.println("===Telefon: Huawei===");
        Map<String, String> huaweiSpecificatii = new HashMap<>();
        huaweiSpecificatii.put("Model procesor", "Exyo 2");
        huaweiSpecificatii.put("Sistem de operare", "iOS");
        huaweiSpecificatii.put("Memorie RAM", "6 GB");
        huaweiSpecificatii.put("Standard Wi-Fi", "783.11ax 2x2");
        huaweiSpecificatii.put("Tip dispay", "Super Retina XDR");

        List<String> huaweiAccesorii = new ArrayList<>();
        huaweiAccesorii.add("Telefon");
        huaweiAccesorii.add("Incarcator");
        huaweiAccesorii.add("Cablu USB");
        huaweiAccesorii.add("Casti");
        huaweiAccesorii.add("Stylus");
        huaweiAccesorii.add("Stickere");

        Telefon HuaweiPro = new Telefon("Huawei", "pro", "Mov",
                "128 GB", 20000, huaweiSpecificatii, huaweiAccesorii, true, "Produse cu urme fine de utilizare");

        HuaweiPro.infoTelefon();
    }
}
