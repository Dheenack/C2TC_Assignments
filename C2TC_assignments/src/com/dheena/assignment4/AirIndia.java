package com.dheena.assignment4;

public class AirIndia implements Airface{
	private Integer hours;
    private Double costPerHour;
    
    public AirIndia() {}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(Double costPerHour) {
		this.costPerHour = costPerHour;
	}
	@Override
	public String toString() {
		return "AirIndia [hours=" + hours + ", costPerHour=" + costPerHour + "]";
	}
	public AirIndia(Integer hours, Double costPerHour) {
		super();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount() {
		// TODO Auto-generated method stub
		return hours*costPerHour;
	}

}
