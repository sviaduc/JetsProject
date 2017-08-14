package com.sviaduc.jets;

public class Jets {
	private String model;
	private int range, price;
	private double speed;
	
	public Jets(String model, double speed, int range, int price) {
		this.model = model;
		this.speed = speed * .001303;
		this.range = range;
		this.price = price;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed * .001303;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jets [model=");
		builder.append(model);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append(", speed=");
		builder.append(speed);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
	
	

