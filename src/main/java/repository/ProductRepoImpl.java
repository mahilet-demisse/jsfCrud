package repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductRepoImpl implements ProductRepo, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final List<Product>products;
	
	public ProductRepoImpl(){
		
		products=new ArrayList<Product>();
	}

	@Override
	public void addProduct(Product p) {
		
		products.add(p);
	}

	@Override
	public List<Product> getProduct() {
		
		return products;
	}

	
	
}
