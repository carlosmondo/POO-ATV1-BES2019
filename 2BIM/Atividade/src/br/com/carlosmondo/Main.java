package br.com.carlosmondo;

import br.com.carlosmondo.display.DisplayCalendar;
import br.com.carlosmondo.display.DisplayRadioFM;
import br.com.carlosmondo.display.DisplayRadioRelogio;
import br.com.carlosmondo.display.DisplayTemperatura;
import br.com.carlosmondo.type.Date;
import br.com.carlosmondo.type.Frequency;
import br.com.carlosmondo.type.Hour;
import br.com.carlosmondo.type.Temperature;

public class Main {
    public static void main(String[] args) {
        DisplayRadioRelogio displayRadioRelogio = new DisplayRadioRelogio();
        displayRadioRelogio.create(new Hour(21,34));
        displayRadioRelogio.show();

        DisplayRadioFM displayRadioFM = new DisplayRadioFM();
        displayRadioFM.create(new Frequency("FM", 107.05));
        displayRadioFM.show();

        DisplayTemperatura displayTemperatura = new DisplayTemperatura();
        displayTemperatura.create(new Temperature(31.1));
        displayTemperatura.show();

        DisplayCalendar displayCalendar = new DisplayCalendar();
        displayCalendar.create(new Date(26, 07, 2019));
        displayCalendar.show();
    }
}
