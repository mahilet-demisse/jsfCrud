package service;

import java.util.List;

import model.Product;

public interface ProductServ {

	public void add(Product p);
	public List<Product>getProducts();
}
