package fr.smile.padda.products.services;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import fr.smile.padda.core.entities.Pagination;
import fr.smile.padda.core.entities.Product;
import fr.smile.padda.core.interfaces.services.IProductService;
import fr.smile.padda.products.dao.mocks.ProductDaoSimpleMock;

public class TestProductService extends TestCase {

	/** The tested service */
	private IProductService productService = new ProductServiceSimpleMock();

	@Before
	public void setUp() throws Exception {
		productService.setProductDAO(new ProductDaoSimpleMock());
	}

	@Test
	public void testGetProductListByCategoryOK() {
		List<Product> productList = productService.getProductListByCategories(Arrays.asList(new Integer[] { 7 }), null,
				null, new Pagination());
		assertEquals(3, productList.size());
	}
}
