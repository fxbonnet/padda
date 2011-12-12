package fr.smile.padda.products.dao.mocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.smile.padda.core.entities.Pagination;
import fr.smile.padda.core.entities.Product;
import fr.smile.padda.core.entities.ProductSorting;
import fr.smile.padda.core.entities.SortingOrder;
import fr.smile.padda.core.interfaces.dao.IProductDAO;

public class ProductDaoSimpleMock implements IProductDAO {

	Product[] products = {

			new Product("Couch", 599.99, 2, "prd-couch.jpg"), //
			new Product("Chair", 129.99, 2, "prd-chair.jpg"), //
			new Product("Ottoman", 299.99, 2, "prd-ottoman.jpg"), //
			new Product("Padda Red Furniture Set", 129.99, 2, "prd-red-furniture-set.jpg"), //

			new Product("Barcelona Bamboo Platform Bed", 2299.00, 3, "prd-barcelona-bamboo-platform-bed.jpg"), //
			new Product("Akio Dresser", 399.99, 3, "prd-akio-dresser.jpg"),

			new Product("HTC Touch Diamond", 750.00, 5, "prd-htc-touch-diamond.jpg"), //
			new Product("Samsung MM-A900M", 150.00, 5, "prd-samsung-mm-a900m.jpg"), //
			new Product("AT&T 8525 PDA", 199.99, 5, "prd-att-8525-pda.jpg"), //
			new Product("Sony Ericsson W810i", 399.99, 5, "prd-sony-ericsson-w810i.jpg"), //
			new Product("BlackBerry 8100 Pearl", 349.99, 5, "prd-blackberry-8100-pearl.jpg"), //
			new Product("Nokia 2610", 149.99, 5, "prd-nokia-2610.jpg"), //

			new Product("Universal Camera Charger", 19.00, 7, "prd-universal-camera-case.jpg"), //
			new Product("Universal Camera Case", 34, 7, "prd-universal-camera-charger.jpg"), //
			new Product("SLR Camera Tripod", 99, 7, "prd-slr-camera-tripod.jpg"), //

			new Product("Kodak EasyShare C530 5MP Digital Camera", 199.99, 8, "prd-kodak-easyshare-c530.jpg"),
			new Product("Canon PowerShot A630 8MP Digital Camera with 4x Optical Zoom", 329.99, 8,
					"prd-canon-powershot-a630.jpg"),
			new Product("Olympus Stylus 750 7.1MP Digital Camera", 161.94, 8, "prd-olympus-stylus-750.jpg"),
			new Product("Argus QC-2185 Quick Click 5MP Digital Camera", 37.49, 8, "prd-argus-qc-2185.jpg"),
			new Product("Canon Digital Rebel XT 8MP Digital SLR Camera", 550, 8, "prd-canon-digital-rebel-xt.jpg"),

			new Product("Computer", 498.98, 10, "prd-computer-bundle.jpg"), //
			new Product("Gaming Computer", 4999.95, 10, "prd-computer-bundle-gaming.jpg"), //
			new Product("My Computer", 898.97, 10, "prd-computer-bundle-build.jpg"),

			new Product("Apple MacBook Pro MA464LL/A 15.4 Notebook PC", 2999.99, 11, "prd-apple-computer.jpg"),
			new Product("Acer Ferrari 3200 Notebook Computer PC", 1799.99, 11, "prd-acer-laptop.jpg"),
			new Product("Toshiba M285-E 14", 1599.99, 11, "prd-toshiba-laptop.jpg"),
			new Product("Sony VAIO 11.1 Notebook PC", 2699.99, 11, "prd-sony-laptop_1_1.jpg"),

			new Product("Western Digital - 1TB HD - 7200RPM", 399.99, 12, "prd-western-digital-1tb.jpg"),
			new Product("Western Digital 500GB HD - 7200RPM", 299.99, 12, "prd-western-digital-500mb.jpg"),
			new Product("Seagate 500GB HD - 5400RPM", 299.00, 12, "prd-seagate.jpg"),
			new Product("Seagate 250GB HD - 5400RPM", 99, 12, "prd-seagate_1.jpg"),

			new Product("22 Syncmaster LCD Monitor", 399.99, 13, "prd-syncmaster-22.jpg"),
			new Product("24 Widescreen Flat-Panel LCD Monitor", 699.99, 13, "prd-lg-monitor-24.jpg"),
			new Product("19 Widescreen Flat-Panel LCD Monitor", 399.99, 13, "prd-lg-monitor-19.jpg"),
			new Product("30 Flat-Panel TFT-LCD Cinema HD Monitor", 699.99, 13, "prd-apple-monitor.jpg"),

			new Product("Crucial 2GB PC4200 DDR2 533MHz Memory", 199.99, 14, "prd-crucial-2gb.jpg"),
			new Product("Crucial 1GB PC4200 DDR2 533MHz Memory", 150.99, 14, "prd-crucial-1gb.jpg"),
			new Product("Crucial 512MB PC4200 DDR2 533MHz Memory", 150.99, 14, "prd-crucial-512mb.jpg"),

			new Product("Apevia Black X-Cruiser Case ATX Mid-Tower Case", 150, 15, "prd-case-apevia.jpg"),
			new Product("NZXT Lexa Silver Aluminum ATX Mid-Tower Case", 199.99, 15, "prd-case-silver.jpg"),

			new Product("AMD A64 X2 3800+ 2.0GHz OEM", 98.99, 16, "prd-amd-a64.jpg"),
			new Product("AMD Phenom X4 9850 Black Ed. 2.50GHz Retail", 335.99, 16, "prd-amd-phenom.jpg"),
			new Product("Intel Core 2 Extreme QX9775 3.20GHz Retail", 2049.99, 16, "prd-intel-extreme.jpg"),
			new Product("Intel C2D E8400 3.0GHz Retail", 98.99, 16, "prd-intel-c2d.jpg"),

			new Product("Microsoft Wireless Optical Mouse 5000", 59.99, 17, "prd-microsoft-wireless-mouse.jpg"),
			new Product("Microsoft Natural Ergonomic Keyboard 4000", 99.99, 17, "prd-microsoft-keyboard.jpg"),
			new Product("Logitech diNovo Edge Keyboard", 239.99, 17, "prd-logitech-keyboard.jpg"),
			new Product("Logitech Cordless Optical Trackman", 79.99, 17, "prd-logitech-mouse.jpg"),

			new Product("Vintage Black and White", 279.99, 20, "prd-vintage-black-and-white.jpg"),

			new Product("Classic Jeans", 99.99, 21, "prd-classic-jeans.jpg"), //
			new Product("Sand Wash Jeans", 119.99, 21, "prd-sand-wash-jeans.jpg"), //
			new Product("The Get Up Kids: Band Camp Pullover Hoodie", 30, 21, "prd-pullover-hoodie.jpg"),
			new Product("Zolof The Rock And Roll Destroyer: LOL Cat T-shirt", 13.50, 21, "prd-zolof-shirt-red_2.jpg"),
			new Product("The Only Children: Paisley T-Shirt", 100.00, 21, "prd-only-children-shirt.jpg"),
			new Product("Coalesce: Functioning On Impatience T-Shirt", 15, 21, "prd-coalesce-shirt.jpg"),

			new Product("The Get Up Kids: Band Camp Pullover Hoodie", 30, 22, "prd-pullover-hoodie.jpg"),
			new Product("Butterfly Fish", 14.99, 22, "prd-butterfly-fish-shirt-1.jpg"),
			new Product("Zolof The Rock And Roll Destroyer: LOL Cat T-shirt", 13.50, 22, "prd-zolof-shirt-red_2.jpg"),
			new Product("The Only Children: Paisley T-Shirt", 100, 22, "prd-only-children-shirt.jpg"),
			new Product("Coalesce: Functioning On Impatience T-Shirt", 15, 22, "prd-coalesce-shirt.jpg"),
			new Product("Ink Eater: Krylon Bombear Destroyed Tee", 22, 22, "prd-ink-eater-shirt.jpg"),

			new Product("CN Clogs Beach/Garden Clog", 15.99, 24, "prd-cn-clog-1.jpg"),
			new Product("ASICS® Men's GEL-Kayano® XII", 134.99, 24, "prd-asics-mens.jpg"),

			new Product("Pink Laced Leather Boots", 139.99, 25, "prd-pink-laced-leather-boots.jpg"),
			new Product("Black Plaform Shoes", 299.99, 25, "prd-black-platform-shoes.jpg"),
			new Product("Black Stilettos", 119.99, 25, "prd-black-stilettos.jpg"),
			new Product("CN Clogs Beach/Garden Clog", 15.99, 25, "prd-cn-clog-1.jpg"),

			new Product("Prada White", 200, 26, "prd-handbag-prada.jpg"), //
			new Product("Louis Vuitton Handbag", 500, 26, "prd-handbag-louis-vuitton.jpg"),

			new Product("$100 Physical Gift Card", 100, 27, "gc-100-physical-gift-card-2.jpg"), //
			new Product("Virtual Gift Card", 10, 27, "gc-physical-virtual-gift-card-2.jpg"), //
			new Product("'For You' Physical Gift Card", 20, 27, "gc-physical-gift-card-for-you-2.jpg"),
			new Product("Physical and Virtual Gift Card", 10, 27, "gc-virtual-gift-card-2.jpg"),
			new Product("$200 Physical Gift Card", 200, 27, "gc-200-physical-gift-card-2.jpg"),

			new Product("Nusantara Demo", 0, 29, "dl-nusantara?jpg"), //
			new Product("Shaimus - Turn The Other Way", 1.99, 29, "dl-shaimus.jpg"),

			new Product("Ebook- Pivot Table in Excel", 5.99, 30, "dl-ebook-pivot-table.jpg"),

			new Product("Coffee Mug", 5, 31, "prd-coffee-mug.jpg"), //
			new Product("Champagne in a Case", 10, 31, "prd-champagne.jpg")

	};

	private Map<String, Comparator<Product>> productComparators = new HashMap<String, Comparator<Product>>();

	public void init() {
		productComparators.put("name", new ProductNameComparator());
		productComparators.put("price", new ProductPriceComparator());
	}

	@Override
	public List<Product> getProductListByCategories(List<Integer> categoryIds, ProductSorting sorting,
			SortingOrder order, Pagination pagination) {
		List<Product> result = new ArrayList<Product>();
		for (Product product : products) {
			for (int categoryId : categoryIds) {
				if (product.getCategoryId() == categoryId) {
					result.add(product);
					break;
				}
			}
		}
		sortProductList(result, sorting, order);
		result = extractsPage(result, pagination);
		return result;
	}

	private void sortProductList(List<Product> productList, ProductSorting sorting, SortingOrder order) {
		if (sorting == null) {
			sorting = ProductSorting.NAME;
		}
		Comparator<Product> comparator = productComparators.get(sorting.getDisplayName());
		if (comparator != null) {
			if (SortingOrder.DESC == order) {
				comparator = Collections.reverseOrder(comparator);
			}
			Collections.sort(productList, comparator);
		}
	}

	private List<Product> extractsPage(List<Product> productList, Pagination pagination) {
		int firstItemIndex = pagination.getFirstItemIndex() - 1;
		int lastItemIndex = pagination.getLastItemIndex();
		return productList.subList(firstItemIndex, lastItemIndex);
	}

	@Override
	public int getNumberOfProductByCategories(List<Integer> categoryIds) {
		int result = 0;
		for (Product product : products) {
			for (int categoryId : categoryIds) {
				if (product.getCategoryId() == categoryId) {
					result++;
					break;
				}
			}
		}
		return result;
	}
}
