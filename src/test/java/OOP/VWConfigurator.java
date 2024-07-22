package OOP;

import java.util.List;

public class VWConfigurator extends ConfiguratorMasina{

    public String linieDeEchipare;
    public String motor;
    public String vopsea;
    public String roti;
    public String tapiterie;
    public List<String> dotariOptionale;
    private Double pretStandard;
    private Double pretFinal;


    public VWConfigurator(String marca, String model, Integer an, String linieDeEchipare, String motor, String vopsea,
                          String roti, String tapiterie, List<String> dotariOptionale) {
        super(marca, model, an);
        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.roti = roti;
        this.tapiterie = tapiterie;
        this.dotariOptionale = dotariOptionale;
    }

    public void infoVW(){
        infoMasina();
        System.out.println("Linia de echipare a masinii este: "+ linieDeEchipare);
        System.out.println("Motorul masinii este: "+ motor);
        System.out.println("Vopseaua masinii este: "+ vopsea);
        System.out.println("Rotile masinii sunt: "+ roti);
        System.out.println("Tapiteria masinii este: "+ tapiterie);

        System.out.println("Dotariile optionale ale masinii sunt:");
        for (Integer i = 0; i<dotariOptionale.size(); i++){
            System.out.println(dotariOptionale.get(i));
        }
    }

    public String getLinieDeEchipare() {
        return linieDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public String getVopsea() {
        return vopsea;
    }

    public String getRoti() {
        return roti;
    }

    public String getTapiterie() {
        return tapiterie;
    }

    public List<String> getDotariOptionale() {
        return dotariOptionale;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    public void setPretStandard(Double pretStandard) {
        this.pretStandard = pretStandard;
    }

    public void setPretFinal(Double pretFinal) {
        this.pretFinal = pretFinal;
    }
}
