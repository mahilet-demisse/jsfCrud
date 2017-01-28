package service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import model.Product;
import repository.ProductRepo;

public class ProductServImpl implements ProductServ,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	ProductRepo pr;
	
	public void add(Product p){
		
		pr.addProduct(p);
	}

	@Override
	public List<Product> getProducts() {
		
		return pr.getProduct();
	}

}
