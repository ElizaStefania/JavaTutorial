package oop;

import java.util.List;

public class VWConfigurator extends ConfiguratorMasina{

    private String linieDeEchipare;
    private String motor;
    private String vopsea;
    private String roti;
    private String tapiterie;
    private List<String> dotariOptionale;
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

    //Polimorfis dinamic
    public void pornesteMotor(){
        System.out.println("Masinile Dacia pornesc de la buton");
    }

    public void deschidereGeam(){
        System.out.println("Geamurile masinii se deschid electric");
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
