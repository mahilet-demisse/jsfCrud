package repository;

import java.util.List;

import model.Product;

public interface ProductRepo {
	
	public void addProduct(Product p);
	public List<Product> getProduct();

}
