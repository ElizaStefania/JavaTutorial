package Tema.ObiectAutovit;

import java.util.List;
import java.util.Map;

public class Masini {

    public Map<String, String> specificatii;
    public List<String> dotari;
    public List<String> confort;
    public List<String> electrice;

    public Masini(Map<String, String> specificatii, List<String> dotari,
                  List<String> confort, List<String> electrice) {
        this.specificatii = specificatii;
        this.dotari = dotari;
        this.confort = confort;
        this.electrice = electrice;
    }

    public void infoMasina() {
        System.out.println("DETALII: " );
        for (String key: specificatii.keySet()){
            System.out.println(key + " " + specificatii.get(key));
        }
        System.out.println("DOTARI: ");
        for (Integer i = 0; i < dotari.size(); i++){
            System.out.println(dotari.get(i));
        }
        System.out.println("CONFORT SI ECHIPAMENTE OPTIONALE: ");
        for (Integer i = 0; i < confort.size(); i++){
            System.out.println(dotari.get(i));
        }
        System.out.println("ELECTRONICE SI ECHIPAMENTE DE ASISTENTA: ");
        for (Integer i = 0; i < electrice.size(); i++){
            System.out.println(electrice.get(i));
        }

    }
}
