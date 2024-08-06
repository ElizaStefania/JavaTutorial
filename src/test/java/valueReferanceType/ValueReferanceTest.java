package valueReferanceType;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ValueReferanceTest {

    //Primitive = int, double, float, char, boolean, long
    //Non-Primitive (referinta) = String, Object, Array
    //Static = valoare care se pastreaza pentru toate instantele din clase
    //Final = defineste o constanta care nu isi poate modifica valoarea initiala
    //Wrapper class = constructie de clasa care este facut pe baza unui tip de data

    public int originalInt = 10;
    public String orignalString = "AltExemplu";
    public Curs cursTestare = new Curs("Curs Testare Automata", "Testare Automata", 8);
    public final int nrCursanti = 16;
    public Integer defaultWrapper;
    public int defaultPrimitiva;


    @Test
    public void metodaTest(){
        System.out.println("1.VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("VALOAREA INITIALA ESTE: " + originalInt);

        System.out.println("2.REFERENCE TYPE STRING");
        referenceTypeStringExample(orignalString);
        System.out.println("VALOAREA INITIALA ESTE: " + orignalString);

        System.out.println("3.REFERANCE TYPE OBJECT");
        referanceTypeObjectExample(cursTestare);
        System.out.println("Valoarea initiala este: ");
        cursTestare.prezentareCurs();

        System.out.println("4.CONSTANT " + nrCursanti);

        System.out.println("5.VALUE TYPE/WRAPPER CLASS");
        defaultValue();
    }

    public void valueTypeExample(int value){
        value = value + 5;
        System.out.println("Valoarea noua este: " + value);
    }

    public void referenceTypeStringExample(String value){
        value = value + "Exemplu";
        System.out.println("Valoarea noua este: " + value);
    }

    public void referanceTypeObjectExample(Curs object){
        object.prezentareCurs();
        object.setTitlu("Testare Manuala");
        object.prezentareCurs();
    }

    public void defaultValue(){
        System.out.println(defaultWrapper);
        System.out.println(defaultPrimitiva);

        Integer[] Array = new Integer[5];
        List<Integer> list = new ArrayList<>();

    }
}
