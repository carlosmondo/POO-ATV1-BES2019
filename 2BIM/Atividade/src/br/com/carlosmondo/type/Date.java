package br.com.carlosmondo.type;

public class Date{
    private int day; // Tmb é possível usar String
    private int month; // Tmb é possível usar String
    private int year; // Tmb é possível usar String
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
    
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
}
