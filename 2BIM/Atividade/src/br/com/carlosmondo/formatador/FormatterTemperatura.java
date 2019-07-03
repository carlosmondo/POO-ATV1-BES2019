package br.com.carlosmondo.formatador;

import br.com.carlosmondo.type.Temperature;

public class FormatterTemperatura implements Formatter<Temperature>{
	
	@Override
    public String formatter(Temperature temperature) {
        return String.format("%.1f", temperature.getTemperature()) + " °C";
    }
}
