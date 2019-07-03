package br.com.carlosmondo.display;

import br.com.carlosmondo.formatador.FormatterRadioRelogio;
import br.com.carlosmondo.type.Hour;

public class DisplayRadioRelogio extends Display<FormatterRadioRelogio>{
    private String finalHour;

    public String getFinalHour(){
        return this.finalHour;
    }

    public void setFinalHour(Hour hour){
        FormatterRadioRelogio formatterRadioRelogio = new FormatterRadioRelogio();
        this.finalHour = formatterRadioRelogio.formatter(hour);
    }

    public void create(Hour hour){
        this.setFinalHour(hour);
    }

    @Override
    public void show(){
        System.out.println("Rádio Relógio: " + this.getFinalHour());
    }
}
