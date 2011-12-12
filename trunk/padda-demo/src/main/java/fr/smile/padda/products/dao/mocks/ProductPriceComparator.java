package fr.smile.padda.products.dao.mocks;

import java.util.Comparator;

import fr.smile.padda.core.entities.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		double diff = product1.getPrice() - product2.getPrice();
		if (diff > 0) {
			return 1;
		} else if (diff < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
