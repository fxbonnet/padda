package fr.smile.padda.core.interfaces.dao;

import java.util.List;

import fr.smile.padda.core.entities.Category;

public interface ICategoryDAO {

	public List<Category> getListRootCategory();

	public List<Category> getListParentCategory(int categoryId);

	public Category getCategoryById(int categoryId);

	public List<Category> getListSubCategory(int categoryId);

	public List<Integer> getListAllSubIds(int categoryId);
}
