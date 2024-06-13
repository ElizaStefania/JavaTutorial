package Tema.ObiectAutovit;

import Tema.Obiect.Masina;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasiniTest {

    @Test
    public void metodaTest() {
        System.out.println("===Masina: Mercedes-Benz===");
        Map<String, String> mercedezBenzSpecificatii = new HashMap<>();
        mercedezBenzSpecificatii.put("Marca: ", "Mercedes-Benz");
        mercedezBenzSpecificatii.put("Model: ", "C");
        mercedezBenzSpecificatii.put("Versiune: ", "220 d 9G-TRONIC Avantgarde");
        mercedezBenzSpecificatii.put("Culoare: ", "Negru");
        mercedezBenzSpecificatii.put("Optiuni culoare:", "Metalizata");

        List<String> mercedezDotari = new ArrayList<>();
        mercedezDotari.add("Apple Carplay");
        mercedezDotari.add("Android Auto");
        mercedezDotari.add("Bluetooth");
        mercedezDotari.add("Aer conditionat");


        List<String> mercedezConfort = new ArrayList<>();
        mercedezConfort.add("Climatronic");
        mercedezConfort.add("Plafon panoramic");
        mercedezConfort.add("Climatizare spate");


        List<String> mercedezElectronice = new ArrayList<>();
        mercedezElectronice.add("Pilot automat");
        mercedezElectronice.add("Faruri LED");
        mercedezElectronice.add("Senzori parcare fata");

        Masini mercedesBenz = new Masini(mercedezBenzSpecificatii, mercedezDotari, mercedezConfort, mercedezElectronice);
        mercedesBenz.infoMasina();
    }
}
