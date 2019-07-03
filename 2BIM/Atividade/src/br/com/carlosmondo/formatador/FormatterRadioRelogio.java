package br.com.carlosmondo.formatador;

import br.com.carlosmondo.type.Hour;

public class FormatterRadioRelogio implements Formatter<Hour>{

	@Override
    public String formatter(Hour hour) {
        return String.format("%02d", hour.getHour()) + ":" + String.format("%02d", hour.getMinute());
    }
}
