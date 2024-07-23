package tema;

import org.testng.annotations.Test;

public class Homework4 {

    @Test
    public void metotaTest(){
        afisareRetete();

    }
    public void afisareRetete(){
        String[] ingredienteCiorba = new String[6];
        ingredienteCiorba[0] = "Ceapa";
        ingredienteCiorba[1] = "Sare";
        ingredienteCiorba[2] = "Piper";
        ingredienteCiorba[3] = "Rosii";
        ingredienteCiorba[4] = "Morcovi";
        ingredienteCiorba[5] = "Pastarnac";

        for (Integer i = 0; i < ingredienteCiorba.length; i++){
            System.out.println("Ingredientele pentru ciorba sunt: " + ingredienteCiorba[i]);
        }
    }
}
