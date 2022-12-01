package com.boocrun.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
	private String brand;
	private List <Model> models = new ArrayList<>();
	
	public List<Model> getModels() {
		return models;
	}
	public void setModels(List<Model> models) {
		this.models = models;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
/*	public Integer getYear() {
		return data.getYear();
	}
	public void setYear(Integer year) {
		this.data.setYear(year);
	}
	public String getFuelType() {
		return data.getFuelType();
	}
	public void setFuelType(String fuelType) {
		this.data.setFuelType(fuelType);
	}*/
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", models=" + models.toArray() + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand==null) ? 0 : brand.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null)
		{
			if (other.brand != null)
				return false;
		}
		else if (!brand.equals(other.brand))
			return false;
		return true;
	}
}