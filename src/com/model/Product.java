package com.model;

public class Product {
  private int id;
  private String name;
  private String type;
  private String image;
  private String description;
  private String qty;
  
  
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public String getImage() {
	return image;
}


public void setImage(String image) {
	this.image = image;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getQty() {
	return qty;
}


public void setQty(String qty) {
	this.qty = qty;
}


@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", type=" + type + ", image=" + image + ", description="
			+ description + ", qty=" + qty + "]";
}
  
  
}
