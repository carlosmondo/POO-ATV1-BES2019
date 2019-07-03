package br.com.carlosmondo.formatador;

import br.com.carlosmondo.type.Date;

public class FormatterCalendar implements Formatter<Date> {
	
	@Override
	public String formatter(Date date){
		String data = "\n" + "Dia  Mês  Ano \n";
		data += date.getDay() + "    " + date.getMonth() + "   " + date.getYear();
		return data;
	}
}
