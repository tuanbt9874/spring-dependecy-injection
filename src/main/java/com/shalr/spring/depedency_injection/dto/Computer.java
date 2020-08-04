package com.shalr.spring.depedency_injection.dto;

import java.io.Serializable;

public class Computer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String brandName;
	private String color;
	private double weight;
	private boolean isManufacture;
	
	public Computer() {
	}

	public Computer(String name, String brandName, String color, double weight, boolean isManufacture) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.color = color;
		this.weight = weight;
		this.isManufacture = isManufacture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isManufacture() {
		return isManufacture;
	}

	public void setManufacture(boolean isManufacture) {
		this.isManufacture = isManufacture;
	}
	
	
}
