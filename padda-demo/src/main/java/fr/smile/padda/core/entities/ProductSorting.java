package fr.smile.padda.core.entities;

public enum ProductSorting {

	NAME("name"), PRICE("price"), POPULARITY("popularity"), BEST_SELLS("best sells");

	private String displayName;

	ProductSorting(String displayName) {
		this.displayName = displayName;
	}

	/*
	 * Getters & Setters
	 */

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String name) {
		this.displayName = name;
	}

}
