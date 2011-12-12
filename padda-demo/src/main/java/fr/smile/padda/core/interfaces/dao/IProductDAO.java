package fr.smile.padda.core.interfaces.dao;

import java.util.List;

import fr.smile.padda.core.entities.Pagination;
import fr.smile.padda.core.entities.Product;
import fr.smile.padda.core.entities.ProductSorting;
import fr.smile.padda.core.entities.SortingOrder;

public interface IProductDAO {

	public List<Product> getProductListByCategories(List<Integer> categoryIds, ProductSorting sorting,
			SortingOrder order, Pagination pagination);

	public int getNumberOfProductByCategories(List<Integer> categoryIds);
}
