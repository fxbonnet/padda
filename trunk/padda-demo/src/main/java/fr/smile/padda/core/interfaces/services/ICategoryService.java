package fr.smile.padda.core.interfaces.services;

import java.util.List;

import fr.smile.padda.core.entities.Category;
import fr.smile.padda.core.interfaces.dao.ICategoryDAO;

public interface ICategoryService {

	public List<Category> getListRootCategory();

	public Category getCategoryById(int categoryId);

	public List<Category> getListSubCategory(int categoryId);

	public List<Category> getListParentCategory(int categoryId);

	public List<Integer> getListAllSubIds(int categoryId);

	public void setCategoryDAO(ICategoryDAO categoryDAO);
}
