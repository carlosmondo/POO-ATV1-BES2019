package br.com.carlosmondo.formatador;

import br.com.carlosmondo.type.Frequency;

public class FormatterRadioFM implements Formatter<Frequency>{

	@Override
    public String formatter(Frequency frequency){
		return frequency.getModulation() + String.format(" %.1f", frequency.getFrequencyValue()) + " Mhz";
    }
}