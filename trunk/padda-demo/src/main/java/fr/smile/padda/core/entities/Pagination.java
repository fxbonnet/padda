package fr.smile.padda.core.entities;

public class Pagination {

	private int numPage = 1;
	private int itemsPerPage = 10;

	private int numberOfItems;

	public int getFirstItemIndex() {
		return (numPage - 1) * itemsPerPage + 1;
	}

	public int getLastItemIndex() {
		int lastItemIndex = numPage * itemsPerPage;
		if (lastItemIndex > numberOfItems) {
			lastItemIndex = numberOfItems;
		}
		return lastItemIndex;
	}

	public int getNumberOfPages() {
		return (numberOfItems + itemsPerPage - 1) / itemsPerPage;
	}

	/*
	 * Getters & Setters
	 */

	public int getNumPage() {
		return numPage;
	}

	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}

	public int getItemsPerPage() {
		return itemsPerPage;
	}

	public void setItemsPerPage(int itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

}
