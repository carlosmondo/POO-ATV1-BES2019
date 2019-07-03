package br.com.carlosmondo.display;

import br.com.carlosmondo.formatador.FormatterTemperatura;
import br.com.carlosmondo.type.Temperature;

public class DisplayTemperatura extends Display<FormatterTemperatura>{
    private String finalTemperature;

    public String getFinalTemperature(){
        return this.finalTemperature;
    }

    public void setFinalTemperature(Temperature temperature){
        FormatterTemperatura formatterTemperatura = new FormatterTemperatura();
        this.finalTemperature = formatterTemperatura.formatter(temperature);
    }

    public void create(Temperature temperature){
        this.setFinalTemperature(temperature);
    }

    @Override
    public void show(){
        System.out.println("Temperatura: " + this.getFinalTemperature());
    }
}
