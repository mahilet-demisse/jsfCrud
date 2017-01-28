package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import service.ProductServ;

@Named("add")
@ApplicationScoped
public class Add implements Serializable {

	/**
	 * 
//	 */
	@Inject
	ProductServ ps;
	private static final long serialVersionUID = 1L;
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}


	private String productId;
	private String name;
	private int unitPrice;
	private List<Product>products;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
	
	
	public String addMethod(){
		
		Product p=new Product(productId,name,unitPrice);
		ps.add(p);
		products=ps.getProducts();
		

		
		
		return "listOfProducts";
	}
	
	
	public String deleteProduct(Product p){
		
		products.remove(p);
		return "listOfProducts";
	}

	public String editProduct(Product p){
		
		products.remove(p);
		return "listOfProducts";
	}
	
	
	
}
