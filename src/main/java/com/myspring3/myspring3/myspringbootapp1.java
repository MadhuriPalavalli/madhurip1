package com.myspring3.myspring3;

public class myspringbootapp1 {
	class Product
	{  
	private int id;  
	private String pname;  
	private String type;  
	private double price;
	private int category;  
	//default constructor  
	public Product()  
	{  
	      
	}  
	//constructor using fields  
	public Product(int id, String pname, String type, double price, int noofproduct, int category)   
	{  
	super();  
	this.id = id;  
	this.pname = pname;  
	this.type = type;  
	this.price = price;  
	this.category = category;  
	}  
	//getters and setters  
	public int getId()   
	{  
	return id;  
	}  
	public void setId(int id)   
	{  
	this.id = id;  
	}  
	public String getPname()   
	{  
	return pname;  
	}  
	public void setPname(String pname)   
	{  
	this.pname = pname;  
	}  
	public String gettype()   
	{  
	return type;  
	}  
	public void settype(String type)   
	{  
	this.type = type;  
	}  
	public double getPrice()   
	{  
	return price;  
	}  
	public void setPrice(double price)   
	{  
	this.price = price;  
	}  
	public int getcatergory()   
	{  
	return category;  
	}  
	public void setcategory(int category)   
	{  
	this.category= category;  
	}  
	}
}
