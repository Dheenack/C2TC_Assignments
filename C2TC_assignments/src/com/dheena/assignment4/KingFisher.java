package com.dheena.assignment4;

public class KingFisher implements Airface{
	 	private Integer hours;
	    private Double costPerHour;

	    public KingFisher() {}

		public KingFisher(Integer hours, Double costPerHour) {
			super();
			this.hours = hours;
			this.costPerHour = costPerHour;
		}

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
		public double calculateAmount() {
			// TODO Auto-generated method stub
			return hours*costPerHour*4;
		}

}
