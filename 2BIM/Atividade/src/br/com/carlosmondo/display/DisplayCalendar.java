package br.com.carlosmondo.display;

import br.com.carlosmondo.formatador.FormatterCalendar;
import br.com.carlosmondo.type.Date;

public class DisplayCalendar extends Display<FormatterCalendar> {
    private String finalDate;

    public String getFinalDate(){
        return this.finalDate;
    }

    public void setFinalDate(Date date){
        FormatterCalendar formatterCalendar = new FormatterCalendar();
        this.finalDate = formatterCalendar.formatter(date);
    }

    public void create(Date date){
        this.setFinalDate(date);
    }

    @Override
    public void show(){
        System.out.println("Calendário: " + this.getFinalDate());
    }


}
