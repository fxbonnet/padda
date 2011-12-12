package fr.smile.padda.products.dao.mocks;

import java.util.Comparator;

import fr.smile.padda.core.entities.Product;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		return product1.getName().compareTo(product2.getName());
	}

}
