package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String name;
	protected Double price;

	
	public Product() {

	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;

	}
	
	
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String priceTag() {
		 return name + " $ " + String.format("%.2f", price);
		
	}
	
	
}
