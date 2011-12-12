package fr.smile.padda.products.services;

import java.util.List;

import fr.smile.padda.core.entities.Pagination;
import fr.smile.padda.core.entities.Product;
import fr.smile.padda.core.entities.ProductSorting;
import fr.smile.padda.core.entities.SortingOrder;
import fr.smile.padda.core.interfaces.dao.IProductDAO;
import fr.smile.padda.core.interfaces.services.IProductService;

public class ProductServiceSimpleMock implements IProductService {

	private IProductDAO productDAO;

	@Override
	public List<Product> getProductListByCategories(List<Integer> categoryIds, ProductSorting sorting,
			SortingOrder order, Pagination pagination) {
		return productDAO.getProductListByCategories(categoryIds, sorting, order, pagination);
	}

	@Override
	public void setProductDAO(IProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public ProductSorting[] getSortingCriteriaList() {
		return ProductSorting.values();
	}

	@Override
	public int getNumberOfProductByCategories(List<Integer> categoryIds) {
		return productDAO.getNumberOfProductByCategories(categoryIds);
	}

}
