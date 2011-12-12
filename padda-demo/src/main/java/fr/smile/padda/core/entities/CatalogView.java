package fr.smile.padda.core.entities;

public enum CatalogView {
	GRID("grid"), LIST("list");

	private String displayName;

	CatalogView(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
