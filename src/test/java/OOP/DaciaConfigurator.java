package OOP;

import javax.sound.midi.Soundbank;
import java.util.List;

public class DaciaConfigurator  extends ConfiguratorMasina {

    private String versiune;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private List<String> accesorii;
    private Double pretStandard;
    private Double pretFinal;



    public DaciaConfigurator(String marca, String model, Integer an, String versiune, String motor,
                             String culoare, String jante, String interior, List<String> echipamente, List<String> accesorii) {
        super(marca, model, an);
        this.versiune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accesorii = accesorii;

    }

    public void infoDacia(){
        infoMasina();
        System.out.println("Versiunea masinii este: "+ versiune);
        System.out.println("Motorul masinii este: "+ motor);
        System.out.println("Culoarea masinii este: "+ culoare);
        System.out.println("Jantele masinii sunt: "+ jante);
        System.out.println("Interiorul masinii este: "+ interior);

        System.out.println("Echipamentele masinii sunt:");
        for (Integer i = 0; i<echipamente.size() ; i++){
            System.out.println(echipamente.get(i));
        }

        System.out.println("Accesoriile masinii sunt:");
        for (Integer j = 0; j<accesorii.size(); j++){
            System.out.println(accesorii.get(j));
        }
        calculPretStandard();
        calculPretFinal();
    }

    //Trebuie sa determinam pretul standard in functie de model
    public void calculPretStandard(){
        if(getModel().equals("Logan")){
            if (versiune.equals("Essential")) {
                pretStandard = 13.500;
            }
            if(versiune.equals("Expresion")){
                pretStandard = 14.300;
            }
            if(versiune.equals("Journey")){
                pretStandard = 15.200;
            }
        }
        System.out.printf("Pretul standard este: %,.3f\n", pretStandard);

    }
    public void calculPretFinal(){
        double pretObtiuni = 0.000;
        if(getModel().equals("Logan")){
            if(versiune.equals("Essential")){
                switch (culoare){
                    case "Gri":
                        pretObtiuni += 0.460;
                        break;
                    case "Alb":
                        pretObtiuni += 0;
                        break;
                }
                switch (jante){
                    case "Regular":
                        pretObtiuni += 2.000;
                        break;
                }
                switch (interior){
                    case "Standard":
                        pretObtiuni += 0;
                        break;
                }
            }
        }
        for(Integer i = 0; i<echipamente.size(); i++){
            switch (echipamente.get(i)) {
                case "Pachet Tehno":
                    pretObtiuni += 3.00;
                    break;
                case "Pachet Clima":
                    pretObtiuni += 4.00;
                    break;
                case "Pachet Parking":
                    pretObtiuni += 5.00;
                    break;
            }
        }
        for(Integer j = 0; j<accesorii.size(); j++){
            switch (accesorii.get(j)){
                case "covorase":
                    pretObtiuni += 2.00;
                    break;
                case "scrumiera":
                    pretObtiuni += 3.00;
                    break;
                case "suport de pahare":
                    pretObtiuni += 4.00;
                    break;
            }
        }
        pretFinal = pretStandard + pretObtiuni;
        System.out.printf("Pretul final este: %,.3f\n", pretFinal);
    }

    public String getVersiune() {
        return versiune;
    }

    public String getMotor() {
        return motor;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getJante() {
        return jante;
    }

    public String getInterior() {
        return interior;
    }

    public List<String> getEchipamente() {
        return echipamente;
    }

    public List<String> getAccesorii() {
        return accesorii;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setJante(String jante) {
        this.jante = jante;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setEchipamente(List<String> echipamente) {
        this.echipamente = echipamente;
    }

    public void setAccesorii(List<String> accesorii) {
        this.accesorii = accesorii;
    }
}
