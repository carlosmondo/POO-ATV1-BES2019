package br.com.carlosmondo.type;

public class Frequency {
	private String modulation;
	private double frequencyValue;
	
	public Frequency(String modulation, double value){
		this.modulation = modulation;
		this.frequencyValue = value;
	}
	
	public String getModulation() {
		return this.modulation;
	}
	
	public double getFrequencyValue() {
		return this.frequencyValue;
	}
}