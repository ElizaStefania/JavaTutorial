package accesControlPart1;

public class Caine {

    public void metodaPublica(){
    }

    private void metodaPrivata(){
    }

    protected void metodaProtected(){
    }

    void metodaDefault(){
    }

    //Public = este un tip de acces control care face publica informatia in toate pachetele
    //Private = este un tip de acces control care face informatia privata in clasa curenta
    //Default = este un tip de acces control ce face vizibila informatia doar in pachetul respectiv,
    //          daca vorbim de mostenire/creare obiect
    //Protected = este un tip de acces control unde informatia este protejata doar in pachetul respectiv,
    //          daca vorbim de mostenire/creare obiect. Daca iesim din pachet, vizibilitatea lui este prezenta
    //          doar daca vorbim de mostenire
}
