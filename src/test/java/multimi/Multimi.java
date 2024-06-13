package multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    //Multimi = array, list(arraylist), map

    @Test
    public void metotaTest(){
        //afisareColegiArray();
       // afisareColegiArrayList();
        //obiecteMap();
        tariOrase();

    }
    //Afisam numele colegilor de la curs
    public void afisareColegiArray(){
        String[] colegi = new String[6];
        colegi[0] = "Larisa";
        colegi[1] = "Maria";
        colegi[2] = "Mircea";
        colegi[3] = "Ion";
        colegi[4] = "Corina";
        colegi[5] = "Alex";

        for (Integer i = 0; i < colegi.length; i++){
            System.out.println("Numele cursantului este: " + colegi[i]);
        }
    }
    //Afisam numele colegilor de la curs (arraylist)
    public void afisareColegiArrayList(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Larisa");
        colegi.add("Maria");
        colegi.add("Mircea");
        colegi.add("Ion");
        colegi.add("Corina");
        colegi.add("Alex");

        for (Integer i = 0; i < colegi.size(); i++){
            System.out.println("Numele cursantului este: " + colegi.get(i));
        }
    }
    //key - value
    public void obiecteMap(){
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("Fruct", "Mar");
        obiecte.put("Masina", "BMV");
        obiecte.put("Telefon", "Samsung");
        obiecte.put("Banca", "Transilvania");
        for (String key: obiecte.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " +obiecte.get(key));
        }
    }
    //Afisam cateva tari cu orasele aferente
    public void tariOrase(){
        Map<String, List<String>> tari = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Iasi");
        oraseRomania.add("Cluj");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Roma");
        oraseItalia.add("Verona");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Valencia");
        oraseSpania.add("Madrid");

        tari.put("Romania " , oraseRomania);
        tari.put("Italia ", oraseItalia);
        tari.put("Spania ", oraseSpania);

        for (String key: tari.keySet()){
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " +tari.get(key));
        }
    }
}
