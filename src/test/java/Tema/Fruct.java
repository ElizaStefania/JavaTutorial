package Tema;

import org.testng.annotations.Test;

public class Fruct {
    public String soi;
    public String culoare;
    public Float greutate;
    public Double diametru;

    @Test
    public void metodaTest() {
        caracteristiciFruct();
        infoFruct();
        System.out.println("==Frunctul 2==");
        catacteristiciOriceFruct("Granny", "Verde", 20f, 12.3);

    }
    public void caracteristiciFruct() {
        soi = "Ionathan";
        culoare = "rosu";
        greutate = 10f;
        diametru = 12.00;

        System.out.println("Frunctul este din soiul: " + soi);
        System.out.println("Culoarea: " + culoare);
        System.out.println("Greutate: " + greutate);
        System.out.println("Diametru: " + diametru);
    }

    public void catacteristiciOriceFruct(String soi, String culoare, Float greutate, Double diametru){
        System.out.println("Frunctul este din soiul: " + soi);
        System.out.println("Culoarea:" + culoare);
        System.out.println("Greutate" + greutate);
        System.out.println("Diametru" + diametru);

    }
    public void  infoFruct() {
        Boolean arePesticide = true;
        System.out.println("Fructul " + soi + " are pesticide " + arePesticide);
    }

}
