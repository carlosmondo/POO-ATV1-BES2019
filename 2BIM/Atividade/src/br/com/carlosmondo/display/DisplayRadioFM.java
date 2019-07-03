package br.com.carlosmondo.display;

import br.com.carlosmondo.formatador.FormatterRadioFM;
import br.com.carlosmondo.type.Frequency;

public class DisplayRadioFM extends Display<FormatterRadioFM>{
    private String finalFrequency;

    public String getFinalStation(){
        return this.finalFrequency;
    }

    public void setFinalStation(Frequency station) {
        FormatterRadioFM formatterRadioFM = new FormatterRadioFM();
        this.finalFrequency = formatterRadioFM.formatter(station);
    }

    public void create(Frequency station){
        this.setFinalStation(station);
    }

    @Override
    public void show(){
        System.out.println("Rádio: " + this.getFinalStation());
    }

}
