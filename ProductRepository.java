package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance() {
		return instance;
	}
	
	public ProductRepository() {
		
		Product phone = new Product("p1234", "iPhone 10" , 1000000);		
		phone.setDescription("6.1 inch, 2532X1170 Super Retina XDR display, 듀얼 12MP 카메라");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("p1235", "LG PC 그램" , 1500000);
		phone.setDescription("13.3 inch, IPS LED displa, Srd Generation Intel Core processors");
		phone.setCategory("Notebook");
		phone.setManufacturer("LG");
		phone.setUnitsInStock(1000);
		phone.setCondition("Refurbished");
		
		Product tablet = new Product("p1236", "Galaxy Tab 5" , 900000);
		phone.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
		phone.setCategory("Tablet");
		phone.setManufacturer("Samsung");
		phone.setUnitsInStock(1000);
		phone.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
			
		}
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
