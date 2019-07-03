package br.com.carlosmondo.type;

public class Hour {
    private int hourValue;
    private int minuteValue;

    public Hour(int hour, int minute){
        this.hourValue = hour;
        this.minuteValue = minute;
    }

    public int getHour() {
    	return this.hourValue;
    }
    
    public int getMinute() {
    	return this.minuteValue;
    }

}
