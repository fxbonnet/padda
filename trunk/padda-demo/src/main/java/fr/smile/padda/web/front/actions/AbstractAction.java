package fr.smile.padda.web.front.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fr.smile.padda.core.entities.Category;
import fr.smile.padda.core.interfaces.services.ICategoryService;
import fr.smile.padda.core.interfaces.services.IProductService;

public class AbstractAction extends ActionSupport {

	protected IProductService productService;

	protected ICategoryService categoryService;

	private List<Category> rootCategories;

	public List<Category> getRootCategories() {
		if (rootCategories == null) {
			rootCategories = categoryService.getListRootCategory();
		}
		return rootCategories;
	}

	/*
	 * Getters & Setters
	 */

	public void setProductService(IProductService productService) {
		this.productService = productService;
	}

	public void setCategoryService(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}
}
