package fr.smile.padda.categories.dao.mocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.smile.padda.core.entities.Category;
import fr.smile.padda.core.interfaces.dao.ICategoryDAO;

public class CategoryDaoSimpleMock implements ICategoryDAO {

	private static final int ROOT = 0;

	Category[] categories = { new Category(1, 0, "Furniture"), new Category(2, 1, "Living Room"),
			new Category(3, 1, "Bedroom"), new Category(4, 0, "Electronics"), new Category(5, 4, "Cell Phones"),
			new Category(6, 4, "Cameras"), new Category(7, 6, "Accessories"), new Category(8, 6, "Digital Cameras"),
			new Category(9, 4, "Computers"), new Category(10, 9, "Build your own"), new Category(11, 9, "Laptops"),
			new Category(12, 9, "Hard Drives"), new Category(13, 9, "Monitors"), new Category(14, 9, "RAM / Memory"),
			new Category(15, 9, "Cases"), new Category(16, 9, "Processors"), new Category(17, 9, "Peripherals"),
			new Category(18, 0, "Apparel"), new Category(19, 18, "Women"), new Category(20, 19, "Evening Dresses"),
			new Category(21, 18, "Men"), new Category(22, 18, "Teens"), new Category(23, 18, "Shoes"),
			new Category(24, 23, "Mens"), new Category(25, 23, "Womens"), new Category(26, 18, "Handbags"),
			new Category(27, 0, "Gift Cards"), new Category(28, 0, "Specials"), new Category(29, 28, "Music"),
			new Category(30, 28, "E-books"), new Category(31, 28, "Personalized gifts") };

	@Override
	public List<Category> getListRootCategory() {
		List<Category> result = new ArrayList<Category>();
		for (Category category : categories) {
			if (category.getParentId() == ROOT) {
				result.add(category);
			}
		}
		return result;
	}

	@Override
	public Category getCategoryById(int categoryId) {
		for (Category category : categories) {
			if (category.getId() == categoryId) {
				return category;
			}
		}
		return null;
	}

	@Override
	public List<Category> getListSubCategory(int categoryId) {
		List<Category> result = new ArrayList<Category>();
		for (Category category : categories) {
			if (category.getParentId() == categoryId) {
				result.add(category);
			}
		}
		return result;
	}

	@Override
	public List<Category> getListParentCategory(int categoryId) {
		List<Category> result = new ArrayList<Category>();
		Category category = getCategoryById(categoryId);
		result.add(category);
		while (category.getParentId() != ROOT) {
			category = getCategoryById(category.getParentId());
			result.add(category);
		}
		Collections.reverse(result);
		return result;
	}

	@Override
	public List<Integer> getListAllSubIds(int categoryId) {
		List<Integer> result = new ArrayList<Integer>();
		result.add(categoryId);
		List<Category> subCategories = getListSubCategory(categoryId);
		for (Category category : subCategories) {
			result.addAll(getListAllSubIds(category.getId()));
		}
		return result;
	}
}
