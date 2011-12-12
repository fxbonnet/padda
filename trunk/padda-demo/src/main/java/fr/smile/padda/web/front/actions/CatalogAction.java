package fr.smile.padda.web.front.actions;

import java.util.List;

import fr.smile.padda.core.entities.CatalogView;
import fr.smile.padda.core.entities.Category;
import fr.smile.padda.core.entities.Pagination;
import fr.smile.padda.core.entities.Product;
import fr.smile.padda.core.entities.ProductSorting;
import fr.smile.padda.core.entities.SortingOrder;

public class CatalogAction extends AbstractAction {

	// inputs with default values
	private int categoryId;
	private ProductSorting sortBy = ProductSorting.NAME;
	private String sortOrder = SortingOrder.ASC.name();
	private CatalogView viewAs = CatalogView.GRID;
	private Pagination pagination = new Pagination();

	// outputs
	private List<Product> productList;
	private Category category;
	private List<Category> parentCategoryList;
	private List<Category> subCategoryList;
	private ProductSorting[] sortingCriteriaList;

	public String displayCategory() {
		if (categoryId != 0) {
			category = categoryService.getCategoryById(categoryId);
			subCategoryList = categoryService.getListSubCategory(categoryId);
			parentCategoryList = categoryService.getListParentCategory(categoryId);
			List<Integer> categoryIds = categoryService.getListAllSubIds(categoryId);
			int numberOfItems = productService.getNumberOfProductByCategories(categoryIds);
			pagination.setNumberOfItems(numberOfItems);
			productList = productService.getProductListByCategories(categoryIds, sortBy,
					SortingOrder.valueOf(sortOrder), pagination);
			sortingCriteriaList = productService.getSortingCriteriaList();
		}
		return SUCCESS;
	}

	/*
	 * Getters & Setters
	 */

	public List<Product> getProductList() {
		return productList;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Category> getParentCategoryList() {
		return parentCategoryList;
	}

	public void setParentCategoryList(List<Category> parentCategoryList) {
		this.parentCategoryList = parentCategoryList;
	}

	public List<Category> getSubCategoryList() {
		return subCategoryList;
	}

	public void setSubCategoryList(List<Category> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}

	public ProductSorting[] getSortingCriteriaList() {
		return sortingCriteriaList;
	}

	public void setSortingCriteriaList(ProductSorting[] sortingCriteriaList) {
		this.sortingCriteriaList = sortingCriteriaList;
	}

	public ProductSorting getSortBy() {
		return sortBy;
	}

	public void setSortBy(ProductSorting sortBy) {
		this.sortBy = sortBy;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public CatalogView getViewAs() {
		return viewAs;
	}

	public void setViewAs(CatalogView viewAs) {
		this.viewAs = viewAs;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

}
