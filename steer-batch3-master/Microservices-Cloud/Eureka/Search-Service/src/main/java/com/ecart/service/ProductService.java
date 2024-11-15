package com.ecart.service;

import java.util.List;

import com.ecart.model.Brand;
import com.ecart.model.Cart;
import com.ecart.model.Category;
import com.ecart.model.Order;
import com.ecart.model.Product;
import com.ecart.model.User;

public interface ProductService {
	
	Product save(Product product);
	
	List<Product> findProductByName(String productName);


	// find all categories
	List<Category> findAllCatogories();

	// find Product by product ID
	Product findById(int productId);

	// find all brand names
	List<Brand> findAllBrands();

	// filter products by brand
	List<Product> filterProductsByBrandName(String brandName);

	// filter products by Price max and min range
	List<Product> filterProductsByMaxPriceRange(int maxPrice);

	// filter products by Price max and min range
	List<Product> filterProductsByMinAndMaxRange(int minPrice, int maxPrice);

	// Find all products
	List<Product> findAll();

	// fetch products by catagoryId
	List<Product> getProductByCategory(int catagoryId);
}
