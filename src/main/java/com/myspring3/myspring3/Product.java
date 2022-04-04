package com.myspring3.myspring3;

import java.util.ArrayList;
import java.util.List;

public class Product {

	public Product(int i, String string, String string2, double d, int j) {
		// TODO Auto-generated constructor stub
	}

	public List<Product> findAll()  
	{   
	ArrayList<Product> products = new ArrayList<Product>();      
	products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));  
	products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));  
	return products;  
	}  
}
