package fr.smile.padda.core.entities;


public class Category {

	private int id;
	private int parentId;
	private String name;

	public Category(int id, int parentId, String name) {
		this.id = id;
		this.parentId = parentId;
		this.name = name;
	}

	/*
	 * Getters & Setters
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
