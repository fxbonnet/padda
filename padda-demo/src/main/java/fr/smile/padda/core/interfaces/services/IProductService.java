package fr.smile.padda.core.interfaces.services;

import java.util.List;

import fr.smile.padda.core.entities.Pagination;
import fr.smile.padda.core.entities.Product;
import fr.smile.padda.core.entities.ProductSorting;
import fr.smile.padda.core.entities.SortingOrder;
import fr.smile.padda.core.interfaces.dao.IProductDAO;

public interface IProductService {

	public List<Product> getProductListByCategories(List<Integer> categoryIds, ProductSorting sorting,
			SortingOrder order, Pagination pagination);

	public void setProductDAO(IProductDAO productDAO);

	public ProductSorting[] getSortingCriteriaList();

	public int getNumberOfProductByCategories(List<Integer> categoryIds);
}
