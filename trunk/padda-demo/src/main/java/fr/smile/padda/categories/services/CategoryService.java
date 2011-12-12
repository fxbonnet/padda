package fr.smile.padda.categories.services;

import java.util.List;

import fr.smile.padda.core.entities.Category;
import fr.smile.padda.core.interfaces.dao.ICategoryDAO;
import fr.smile.padda.core.interfaces.services.ICategoryService;

public class CategoryService implements ICategoryService {

	private ICategoryDAO categoryDAO;

	@Override
	public List<Category> getListRootCategory() {
		return categoryDAO.getListRootCategory();
	}

	@Override
	public Category getCategoryById(int categoryId) {
		return categoryDAO.getCategoryById(categoryId);
	}

	@Override
	public List<Category> getListSubCategory(int categoryId) {
		return categoryDAO.getListSubCategory(categoryId);
	}

	@Override
	public void setCategoryDAO(ICategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	@Override
	public List<Category> getListParentCategory(int categoryId) {
		return categoryDAO.getListParentCategory(categoryId);
	}

	@Override
	public List<Integer> getListAllSubIds(int categoryId) {
		return categoryDAO.getListAllSubIds(categoryId);
	}

}
