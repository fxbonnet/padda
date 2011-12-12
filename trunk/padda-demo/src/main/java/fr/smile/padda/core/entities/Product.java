package fr.smile.padda.core.entities;

public class Product {

	private String name;
	private String imageSrc;
	private double price;
	private String shortDescription;
	private int categoryId;

	public Product(String name, double price, int categoryId, String imageSrc) {
		this.name = name;
		this.price = price;
		this.categoryId = categoryId;
		this.imageSrc = imageSrc;
	}

	/*
	 * Getters & Setters
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
