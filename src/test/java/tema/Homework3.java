package tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework3 {

    @Test
    public void metodatest(){
        carteBucate();

    }

    public void carteBucate(){
        Map<String, List<String>> retete = new HashMap<>();

        List<String> ingredienteCiorba = new ArrayList<>();
        ingredienteCiorba.add("Ceapa");
        ingredienteCiorba.add("Ulei");
        ingredienteCiorba.add("Bulion");
        ingredienteCiorba.add("Morcovi");
        ingredienteCiorba.add("Telina");
        ingredienteCiorba.add("Piept de pui");
        ingredienteCiorba.add("Sare");
        ingredienteCiorba.add("Piper");

        List<String> ingredienteMancareCartofi = new ArrayList<>();
        ingredienteMancareCartofi.add("Cartofi");
        ingredienteMancareCartofi.add("Ceapa");
        ingredienteMancareCartofi.add("Ardei gras");
        ingredienteMancareCartofi.add("Bulion ardei");
        ingredienteMancareCartofi.add("Sare");
        ingredienteMancareCartofi.add("Piper");

        List<String> ingredientePrajitura = new ArrayList<>();
        ingredientePrajitura.add("Mere");
        ingredientePrajitura.add("Faina");
        ingredientePrajitura.add("Zahar");
        ingredientePrajitura.add("Scortisoara");
        ingredientePrajitura.add("Praf de copt");

        // Adăugăm rețetele în mapa 'retete'
        retete.put("Ciorbă", ingredienteCiorba);
        retete.put("Mâncare de cartofi", ingredienteMancareCartofi);
        retete.put("Plăcintă cu mere", ingredientePrajitura);

        // Afisam retetele si ingredientele corespunzatoare

        for (String key: retete.keySet()) {
            System.out.println("Reteta este: " + key);
            System.out.println("Ingredientele sunt: " +retete.get(key));
        }
    }
}
